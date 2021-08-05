package com.spring.techplus.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.techplus.model.Post;
import com.spring.techplus.repository.TechplusRepository;
import com.spring.techplus.service.TechplusService;

@Service
public class TechplusServiceImpl implements TechplusService {

	@Autowired
	TechplusRepository techplusRepository;
	
	@Override
	public List<Post> findAll() {
		return techplusRepository.findAll();
	}

	@Override
	public Post findById(long id) {
		return techplusRepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return techplusRepository.save(post);
	}

}
