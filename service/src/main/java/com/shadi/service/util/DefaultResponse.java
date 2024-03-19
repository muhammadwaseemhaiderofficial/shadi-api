package com.shadi.service.util;

import com.shadi.service.user.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DefaultResponse {

    String responseIdentifier;
    String description;
    String responseCode;
    String objectId;

    public DefaultResponse(String userCreatedSuccessfully, User createdUser) {
    }
}
