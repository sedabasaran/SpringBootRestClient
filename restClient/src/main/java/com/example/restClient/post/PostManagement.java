package com.example.restClient.post;

import java.util.List;

public interface PostManagement {
	
    Post create(Post post);

    Post update(Integer id, Post post);

    Post findById(Integer id);

    List<Post> findAll();


}
