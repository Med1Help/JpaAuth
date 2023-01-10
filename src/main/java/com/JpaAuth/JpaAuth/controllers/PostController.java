package com.JpaAuth.JpaAuth.controllers;

import com.JpaAuth.JpaAuth.model.Post;
import com.JpaAuth.JpaAuth.repositories.PostRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/post/v1")
public class PostController {
    private final PostRepo repo;

    public PostController(PostRepo repo) {
        this.repo = repo;
    }

    @GetMapping
    public Iterable<Post> getAll(){
        return repo.findAll();
    }

    @GetMapping("/{id}")
    public Post getPost(@PathVariable("id") Post post){
        return post;
    }
}
