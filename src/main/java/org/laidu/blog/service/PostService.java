package org.laidu.blog.service;

import org.laidu.blog.domain.PostWithBLOBs;

import java.util.Date;
import java.util.List;

/**
 * Created by laidu on 16-9-9.
 */
public interface PostService {
    /**
     * 通过分类信息获取文章简要信息
     * @return
     */
    List<PostWithBLOBs> getPostListByTermId(long termId);
    /**
     * 获取所有文章简要信息
     * @return
     */
    List<PostWithBLOBs> getAllPostList();
    /**
     * 通过日期获取文章简要信息
     * @return
     */
    List<PostWithBLOBs> getPostListByDate(Date date);

    /**
     * 获取最新count条文章简要信息
     * @param count
     * @return
     */
    List<PostWithBLOBs> getLastPost(long count);
    /**
     * 通过主键获取文章详细信息
     * @return
     */
    PostWithBLOBs getPostDetialByPostId(long postId);
    /**
     * 更新文章信息
     * @param post
     * @return
     */
    int updatePost(PostWithBLOBs post);

    /**
     * 添加文章信息
     * @param post
     * @return
     */
    int addPost(PostWithBLOBs post);

}
