package org.laidu.blog.controller;

import org.laidu.blog.service.PostService;
import org.laidu.blog.service.TermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by laidu on 16-9-9.
 */
@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    private PostService postService;
    @Autowired
    private TermService termService;

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String home(HttpServletRequest request, Model model,
                       @RequestParam(value = "cat", required = false, defaultValue = "0") long termId,
                       @RequestParam(value = "postId", required = false, defaultValue = "0") long postId) {

        request.getSession().putValue("navMenuItem", termService.getAllNav());
        model.addAttribute("postLast", postService.getLastPost(6));
        model.addAttribute("postTerm", termService.getAllTerm());
        if (termId != 0) {
            model.addAttribute("postList", postService.getPostListByTermId(termId));
        } else {
            model.addAttribute("postList", postService.getAllPostList());
        }
        if (postId != 0) {
            model.addAttribute("postDetial", postService.getPostDetialByPostId(postId));
        }
        return "home";
    }
}
