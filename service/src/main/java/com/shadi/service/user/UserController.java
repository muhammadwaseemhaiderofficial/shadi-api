package com.shadi.service.user;

import com.shadi.service.util.DefaultResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
  private final UserService userService;

    @PostMapping("/add")
    public ResponseEntity<DefaultResponse> addUser(@RequestBody User user) {
        User createdUser = userService.addUser(user); // Save or handle the user
        return ResponseEntity.ok(new DefaultResponse("User created successfully", createdUser));
    }

}
