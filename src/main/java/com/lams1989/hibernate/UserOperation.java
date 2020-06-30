package com.lams1989.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;

public class UserOperation {

	public static User initiateUsers(Session sessionObj) {
		User userObj = null;
		for (int i = 1; i <= 5; i++) {
			userObj = new User();
			userObj.setUsername("Editor " + i);
			userObj.setCreatedBy("Administrator");
			userObj.setCreatedDate(new Date());

			sessionObj.save(userObj);
		}
		return userObj;
	}

	public static List<User> getUsers(Session session) {
		List<User> users = session.createQuery("from User").list();
		// users = session.createSQLQuery("select * from user_table").list();
		return users;
	}
	
	public static User getUserById(Session session, int id) {
		return (User) session.get(User.class, id);
	}

	public static void deleteUser(Session session, User user) {
		session.delete(user);
	}
	
	public static User saveOrUpdate(Session session, User user) {
		session.saveOrUpdate(user);
		return user;
	}
}
