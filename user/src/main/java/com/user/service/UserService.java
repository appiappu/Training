package com.user.service;

import java.util.List;

import com.user.model.Login;
import com.user.model.Signup;

public interface UserService {
	public List<Signup> getSignupData();

	public List<Login> getLoginData();

	

}
