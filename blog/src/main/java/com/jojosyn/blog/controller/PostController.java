package com.jojosyn.blog.controller;

import com.jojosyn.blog.entity.ApiResponse;
import com.jojosyn.blog.entity.Post;
import com.jojosyn.blog.mapper.PostMapper;
import com.jojosyn.blog.service.PostService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("post")
@Api(tags = "文章管理")
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping("save")
    @ApiOperation("保存文章")
    public Post save(@RequestBody Post post) {
        return postService.save(post);
    }
    
    @PostMapping("list")
    @ApiOperation("文章列表")
    public ApiResponse<List<Post>> list(@RequestBody Post post) {
        return new ApiResponse<>(200, "ok", postService.list());
    }

}
