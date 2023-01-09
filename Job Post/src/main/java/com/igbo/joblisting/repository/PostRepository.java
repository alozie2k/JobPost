package com.igbi.JobPost.repository;

import com.igbi.JobPost.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository extends MongoRepository<Post,String>
{

}
