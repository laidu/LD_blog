package org.laidu.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.laidu.blog.domain.PostWithBLOBs;
import org.laidu.blog.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostServiceTest {
    @Autowired
    private PostService postService;

    @Test
    public void getPostByTermId() {

        for (PostWithBLOBs post : postService.getPostListByTermId(1L)) {
            System.out.println(post.getPostTitle());
            System.out.println(post.getPostContent());
        }
    }

    @Test
    public void getAllPost() {

        for (PostWithBLOBs post : postService.getAllPostList()) {
            System.out.println(post.getPostTitle() + "------" + post.getId());
            System.out.println(post.getPostContent());
        }
    }

}
