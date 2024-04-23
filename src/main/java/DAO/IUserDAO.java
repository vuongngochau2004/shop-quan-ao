package DAO;

import java.util.List;

import Model.User;

public interface IUserDAO extends GenericDAO<User>{
	List<User> findAll();
}
