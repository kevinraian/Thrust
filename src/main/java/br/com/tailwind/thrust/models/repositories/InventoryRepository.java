package br.com.tailwind.thrust.models.repositories;

import br.com.tailwind.thrust.models.entities.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {

}
