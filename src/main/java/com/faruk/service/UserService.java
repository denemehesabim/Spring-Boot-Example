package com.faruk.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.faruk.domain.User;

@Service
public class UserService {

	List<User> users = new ArrayList<>(
			Arrays.asList(new User("1", "Faruk", "Student"), new User("2", "Ömer", "Engineer")));

	public List<User> getAllUser() {
		return users;
	}

	public User getUser(String id) {
		return users.stream().filter(u -> u.getId().equals(id)).findFirst().get();
	}

	public void addUser(User user) {
		users.add(user);
	}

	public void updateUser(String id, User user) {
		for (int i = 0; i < users.size(); i++) {
			User u = users.get(i);
			if (u.getId().equals(id)) {
				users.set(i, user);
				return;
			}
		}

	}

	public void deleteUser(String id) {
		users.removeIf(u -> u.getId().equals(id));
	}
	
	
}
