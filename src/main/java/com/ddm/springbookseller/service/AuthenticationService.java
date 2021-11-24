package com.ddm.springbookseller.service;

import com.ddm.springbookseller.model.User;

public interface AuthenticationService {
    User signInAndReturnJWT(User signInRequest);
}
