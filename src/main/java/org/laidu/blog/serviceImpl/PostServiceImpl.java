package org.laidu.blog.serviceImpl;

import org.laidu.blog.domain.PostWithBLOBs;
import org.laidu.blog.mapper.PostMapper;
import org.laidu.blog.service.PostService;
import org.laidu.blog.util.HtmlUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by laidu on 16-9-9.
 */
@Service
public class PostServiceImpl implements PostService{

    @Autowired
    private PostMapper postMapper;

    @Override
    public List<PostWithBLOBs> getPostListByTermId(long termId) {
        List<PostWithBLOBs> posts = postMapper.getPostListByTermId(termId);
        for (PostWithBLOBs post : posts)
            post.setPostContent(HtmlUtil.getNoHtmlString(post.getPostContent(), 200));
        return posts;
    }

    @Override
    public List<PostWithBLOBs> getAllPostList() {
        List<PostWithBLOBs> posts = postMapper.getAllPostList();
        for (PostWithBLOBs post : posts)
            post.setPostContent(HtmlUtil.getNoHtmlString(post.getPostContent(), 200));
        return posts;
    }

    @Override
    public List<PostWithBLOBs> getPostListByDate(Date date) {

        return postMapper.getPostListByDate();
    }

    @Override
    public List<PostWithBLOBs> getLastPost(long count) {
        List<PostWithBLOBs> posts = postMapper.getLastPost(6L);
        for (PostWithBLOBs post : posts)
            post.setPostContent(HtmlUtil.getNoHtmlString(post.getPostContent(), 200));
        return posts;
    }

    @Override
    public PostWithBLOBs getPostDetialByPostId(long postId) {
        return postMapper.selectByPrimaryKey(postId);
    }

    @Override
    public int updatePost(PostWithBLOBs post) {
        return postMapper.updateByPrimaryKeyWithBLOBs(post);
    }

    @Override
    public int addPost(PostWithBLOBs post) {
        return postMapper.insert(post);
    }

}
