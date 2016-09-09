package org.laidu.blog.service;

import org.laidu.blog.domain.Term;
import org.laidu.blog.domain.TermParent;

import java.util.List;

/**
 * Created by laidu on 16-9-9.
 */
public interface TermService {

    /**
     * 获取导航栏菜单
     * @return
     */
    List<TermParent> getAllNav();
    /**
     * 获取所有分类信息
     * @return
     */
    List<TermParent> getAllTerm();
}
