package com.techtalentsouth.TechTalentBlog.BlogPost;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Long>{
	@Override
	List<BlogPost> findAll();	
}