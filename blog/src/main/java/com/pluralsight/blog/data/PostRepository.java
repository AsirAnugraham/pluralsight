package com.pluralsight.blog.data;

import com.pluralsight.blog.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;


@Component
public interface PostRepository extends JpaRepository<Post, Long> {
 @RestResource(rel = "contains-title", path = "containsTitle")itit
 List<Post> findByTitleContaining(String title);

 
}