package Service.impl;

import java.util.List;

import javax.inject.Inject;

import DAO.IUserDAO;
import Model.User;
import Service.IUserService;

public class UserService implements IUserService{

	@Inject
	private IUserDAO userDAO;
	
	@Override
	public List<User> findAll() {
		return userDAO.findAll();
	}

}
