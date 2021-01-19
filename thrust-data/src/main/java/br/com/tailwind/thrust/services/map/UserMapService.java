package br.com.tailwind.thrust.services.map;

import br.com.tailwind.thrust.models.User;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import br.com.tailwind.thrust.services.CrudService;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class UserMapService extends AbstractMapService<User, Long> implements CrudService<User, Long> {
    @Override
    public Set<User> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(User user) {
        super.delete(user);
    }

    @Override
    public User save(User user) {
        return super.save(user.getId(), user);
    }

    @Override
    public User findById(Long id) {
        return super.findById(id);
    }
}
