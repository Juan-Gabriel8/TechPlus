package com.spring.techplus.service;

import java.util.List;

import com.spring.techplus.model.Post;

public interface TechplusService {
	
	List<Post> findAll();
	Post findById (long id);
	Post save(Post post);

}
