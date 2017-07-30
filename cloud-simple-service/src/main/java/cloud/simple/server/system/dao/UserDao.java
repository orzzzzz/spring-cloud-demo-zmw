package cloud.simple.server.system.dao;


import cloud.simple.server.system.model.User;

import java.util.List;


public interface UserDao {

	List<User> findAll();
}
