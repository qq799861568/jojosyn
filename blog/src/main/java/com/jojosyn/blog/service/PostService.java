package com.jojosyn.blog.service;

import com.jojosyn.blog.entity.Post;

import java.util.List;

public interface PostService {
    List<Post> list();
    Post save(Post user);

}
