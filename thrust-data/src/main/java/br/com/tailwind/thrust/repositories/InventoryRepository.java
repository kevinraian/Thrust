package br.com.tailwind.thrust.repositories;

import br.com.tailwind.thrust.models.Inventory;
import org.springframework.data.repository.CrudRepository;

public interface InventoryRepository extends CrudRepository<Inventory, Long> {

}
