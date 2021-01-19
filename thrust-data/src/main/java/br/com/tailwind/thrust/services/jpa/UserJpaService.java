package br.com.tailwind.thrust.services.jpa;

import br.com.tailwind.thrust.models.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import br.com.tailwind.thrust.repositories.UserRepository;
import br.com.tailwind.thrust.services.UserService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("jpa")
public class UserJpaService implements UserService {

    private final UserRepository userRepository;

    public UserJpaService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Set<User> findAll() {
        Set<User> users = new HashSet<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
