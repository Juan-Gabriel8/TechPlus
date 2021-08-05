package com.spring.techplus.utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.spring.techplus.model.Post;
import com.spring.techplus.repository.TechplusRepository;

@Component
public class DummyData {
	
	@Autowired
	TechplusRepository techplusRepository;
	
	//@PostConstruct
	public void savePosts() {
		
		List<Post> postList = new ArrayList<>();
		Post post1 = new Post();
		post1.setAutor("Juan Gabriel");
		post1.setData(LocalDate.now());
		post1.setTitulo("What does a Graphics Card do?");
		post1.setTexto("Imagine you need a piece of art in your company. So you send a request to the art department. The art department decides how to make the image of that and then puts the idea on paper.The principle behind a Graphics Card is basically this! The CPU, working in conjunction with computer softwares, sends information about the image to the graphics card. The graphics card decides how to use the pixels on the screen to create the image.");
		
		Post post2 = new Post();
		post2.setAutor("Juan Gabriel");
		post2.setData(LocalDate.now());
		post2.setTitulo("UX vs UI");
		post2.setTexto("In a simplified way, UI (User Interface) is made up of all the elements that enable someone to interact with a product or service. UX (User Experience), on the other hand, is what the individual interacting with that product or service takes away from the entire experience. Take Google, for example. Its famously simple interface highlights how a great experience doesn’t require detailist design. Google knows that when users come to the site, they’re after one thing: information. And they want it quickly.");
		
		postList.add(post1);
		postList.add(post2);
		
		for(Post post: postList) {
			Post postSaved = techplusRepository.save(post);
			System.out.println(postSaved.getId());
		}
	}

}
