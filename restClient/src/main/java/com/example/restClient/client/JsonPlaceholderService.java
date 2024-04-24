package com.example.restClient.client;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PostExchange;
import org.springframework.web.service.annotation.PutExchange;

import com.example.restClient.post.Post;
import com.example.restClient.post.PostManagement;

public interface JsonPlaceholderService extends PostManagement {
	
	  @GetExchange("/posts")
	    List<Post> findAll();

	    @GetExchange("/posts/{id}")
	    Post findById(Integer id);

	    @PostExchange("/posts")
	    Post create(Post post);

	    @PutExchange("/posts/{id}")
	    Post update(@PathVariable Integer id, Post post);

	    @DeleteMapping("/posts/{id}")
	    void delete(@PathVariable Integer id);
  

}
