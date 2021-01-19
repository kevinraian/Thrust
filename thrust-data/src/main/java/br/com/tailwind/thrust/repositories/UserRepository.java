package br.com.tailwind.thrust.repositories;

import br.com.tailwind.thrust.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
