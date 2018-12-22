package org.fbertos.persistence.service;

import java.util.List;

import org.fbertos.persistence.dao.UserRepository;
import org.fbertos.persistence.model.User;
import org.fbertos.persistence.search.Filter;
import org.fbertos.persistence.search.UserSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
    private UserRepository userRepository;

	public void save(User user) {
		userRepository.save(user);
	}

	public User get(long id) {
		return userRepository.findById(id).get();
	}

	public List<User> find(Filter filter) {
		UserSpecification spec = new UserSpecification(filter);
		Pageable page = spec.toPageable();
		return userRepository.findAll(spec, page).getContent();
	}
	
	public void update(User user) {
		userRepository.save(user);
	}

	public void delete(long id) {
		userRepository.deleteById(id);
	}
}
