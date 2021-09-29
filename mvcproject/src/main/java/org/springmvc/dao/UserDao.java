package org.springmvc.dao;

import org.springmvc.model.Login;
import org.springmvc.model.User;

public interface UserDao {

	  int register(User user);

	  User validateUser(Login login);
	}
