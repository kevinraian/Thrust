package br.com.tailwind.thrust.services.map;

import br.com.tailwind.thrust.models.Item;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import br.com.tailwind.thrust.services.CrudService;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class ItemMapService extends AbstractMapService<Item, Long> implements CrudService<Item, Long> {
    @Override
    public Set<Item> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Item item) {
        super.delete(item);
    }

    @Override
    public Item save(Item item) {
        return super.save(item.getId(), item);
    }

    @Override
    public Item findById(Long id) {
        return super.findById(id);
    }
}
