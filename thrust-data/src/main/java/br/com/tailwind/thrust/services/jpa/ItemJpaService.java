package br.com.tailwind.thrust.services.jpa;

import br.com.tailwind.thrust.models.Item;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import br.com.tailwind.thrust.repositories.ItemRepository;
import br.com.tailwind.thrust.services.ItemService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("jpa")
public class ItemJpaService implements ItemService {

    private final ItemRepository itemRepository;

    public ItemJpaService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Set<Item> findAll() {
        Set<Item> items = new HashSet<>();
        itemRepository.findAll().forEach(items::add);
        return items;
    }

    @Override
    public Item findById(Long id) {
        return itemRepository.findById(id).orElse(null);
    }

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    @Override
    public void delete(Item item) {
        itemRepository.delete(item);
    }

    @Override
    public void deleteById(Long id) {
        itemRepository.deleteById(id);
    }
}
