package br.com.tailwind.thrust.services.jpa;

import br.com.tailwind.thrust.models.Inventory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import br.com.tailwind.thrust.repositories.InventoryRepository;
import br.com.tailwind.thrust.repositories.ItemRepository;
import br.com.tailwind.thrust.services.InventoryService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("jpa")
public class InventoryJpaService implements InventoryService {

    private final InventoryRepository inventoryRepository;
    private final ItemRepository itemRepository;

    public InventoryJpaService(InventoryRepository inventoryRepository, ItemRepository itemRepository) {
        this.inventoryRepository = inventoryRepository;
        this.itemRepository = itemRepository;
    }

    @Override
    public Set<Inventory> findAll() {
        Set<Inventory> inventories = new HashSet<>();
        inventoryRepository.findAll().forEach(inventories::add);
        return inventories;
    }

    @Override
    public Inventory findById(Long id) {
        return inventoryRepository.findById(id).orElse(null);
    }

    @Override
    public Inventory save(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    @Override
    public void delete(Inventory inventory) {
        inventoryRepository.delete(inventory);
    }

    @Override
    public void deleteById(Long id) {
        inventoryRepository.deleteById(id);
    }
}
