package br.com.tailwind.thrust.services;

import br.com.tailwind.thrust.models.entities.Item;

import java.util.List;

public interface ItemService {
    List<Item> retrieve();

    Item save(Item item);

    Item update(Item item);

    void delete(Item item);
}
