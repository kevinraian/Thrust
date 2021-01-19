package br.com.tailwind.thrust.services;

import br.com.tailwind.thrust.models.User;

public interface UserService extends CrudService<User, Long> {
    User findByUsername(String username);
}
