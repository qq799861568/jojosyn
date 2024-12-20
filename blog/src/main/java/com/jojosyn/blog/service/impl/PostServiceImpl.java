package com.jojosyn.blog.service.impl;

import com.jojosyn.blog.entity.Post;
import com.jojosyn.blog.mapper.PostMapper;
import com.jojosyn.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostMapper postMapper;

    @Override
    public List<Post> list() {
        return postMapper.findAll();
    }

    @Override
    public Post save(Post user) {
        return postMapper.save(user);
    }
}
