package com.jojosyn.blog.mapper;

import com.jojosyn.blog.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.CrudMethodMetadata;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostMapper extends JpaRepository<Post, Long> {
}
