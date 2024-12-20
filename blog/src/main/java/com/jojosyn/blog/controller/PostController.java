package com.jojosyn.blog.controller;

import com.jojosyn.blog.entity.ApiResponse;
import com.jojosyn.blog.entity.Post;
import com.jojosyn.blog.mapper.PostMapper;
import com.jojosyn.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("post")
public class PostController {
    @Autowired
    PostService postService;
    @PostMapping("save")
    public Post save(@RequestBody Post post) {
        return postService.save(post);
    }


    @PostMapping("list")
    public ApiResponse<List<Post>> list(@RequestBody Post post) {
        return new ApiResponse<>(200, "ok", postService.list());
    }

}
