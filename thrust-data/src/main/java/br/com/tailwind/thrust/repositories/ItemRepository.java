package br.com.tailwind.thrust.repositories;

import br.com.tailwind.thrust.models.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Long> {
}
