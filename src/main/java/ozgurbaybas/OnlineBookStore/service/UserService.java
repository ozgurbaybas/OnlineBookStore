package ozgurbaybas.OnlineBookStore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import ozgurbaybas.OnlineBookStore.model.Role;
import ozgurbaybas.OnlineBookStore.model.User;
import ozgurbaybas.OnlineBookStore.repository.IUserRepository;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class UserService implements IUserService{

    @Autowired
    private IUserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User saveUser(User user){
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setCreateTime(LocalDateTime.now());

        return userRepository.save(user);
    }

    @Override
    public Optional<User> findByUsername(String username){
        return userRepository.findUsername(username);
    }

    @Override
    @Transactional
    public void makeAdmin(String username){
        userRepository.updateUserRole(username, Role.ADMIN);
    }

}
