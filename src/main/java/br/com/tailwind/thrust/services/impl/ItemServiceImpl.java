package br.com.tailwind.thrust.services.impl;

import br.com.tailwind.thrust.models.entities.Item;
import br.com.tailwind.thrust.models.repositories.ItemRepository;
import br.com.tailwind.thrust.services.ItemService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    private ItemRepository repository;

    public ItemServiceImpl(ItemRepository repository) { this.repository = repository; }

    @Override
    @Transactional(readOnly = true)
    public List<Item> retrieve() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Item save(Item item) {
        return repository.save(item);
    }

    @Override
    @Transactional
    public Item update(Item item) {
        return repository.save(item);
    }

    @Override
    @Transactional
    public void delete(Item item) {
        repository.delete(item);
    }

}
