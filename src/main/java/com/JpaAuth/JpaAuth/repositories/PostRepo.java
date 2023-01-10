package com.JpaAuth.JpaAuth.repositories;

import com.JpaAuth.JpaAuth.model.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post,Long> {
}
