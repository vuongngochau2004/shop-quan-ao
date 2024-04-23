package DAO.impl;

import java.util.List;

import DAO.IUserDAO;
import Mapper.UserMapper;
import Model.User;

public class UserDAO extends AbtractDAO<User> implements IUserDAO {

	@Override
	public List<User> findAll() {
		String sql =  "SELECT * FROM user";
		return query(sql, new UserMapper());
	}
}
