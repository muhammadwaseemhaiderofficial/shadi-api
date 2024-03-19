package com.shadi.service.user;

import com.shadi.service.Repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

  private final UserRepository userRepository;
  @Transactional
    public User addUser(User user) {
      user.getUserProfilePics().stream().forEach(userProfilePic -> userProfilePic.setUser(user));
      user.getPrivateInfo().setUser(user);
        return userRepository.save(user);
    }
}
