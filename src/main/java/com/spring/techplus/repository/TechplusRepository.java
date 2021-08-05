package com.spring.techplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.techplus.model.Post;

public interface TechplusRepository extends JpaRepository<Post, Long> {

}
