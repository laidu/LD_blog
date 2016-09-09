package org.laidu.blog.controller;

import org.laidu.blog.domain.PostWithBLOBs;
import org.laidu.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by laidu on 16-9-9.
 */
@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @RequestMapping("/article")
    public PostWithBLOBs detial(@RequestParam(value = "cat") long postId){

        return postService.getPostDetialByPostId(postId);
    }
}
