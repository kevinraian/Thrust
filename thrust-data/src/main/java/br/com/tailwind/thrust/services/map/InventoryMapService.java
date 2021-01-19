package br.com.tailwind.thrust.services.map;

import br.com.tailwind.thrust.models.Inventory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import br.com.tailwind.thrust.services.CrudService;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class InventoryMapService extends AbstractMapService<Inventory, Long> implements CrudService<Inventory, Long> {
    @Override
    public Set<Inventory> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Inventory inventory) {
        super.delete(inventory);
    }

    @Override
    public Inventory save(Inventory inventory) {
        return super.save(inventory.getId(), inventory);
    }

    @Override
    public Inventory findById(Long id) {
        return this.findById(id);
    }
}
