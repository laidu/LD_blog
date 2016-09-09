package org.laidu.blog.serviceImpl;

import org.laidu.blog.domain.Term;
import org.laidu.blog.domain.TermParent;
import org.laidu.blog.mapper.TermMapper;
import org.laidu.blog.service.TermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by laidu on 16-9-9.
 */
@Service
public class TermServiceImpl implements TermService{

    @Autowired
    private TermMapper termMapper;

    @Override
    public List<TermParent> getAllNav() {
        List<TermParent> terms = termMapper.getParentNav();
        for(TermParent var : terms)
            var.setChildren(termMapper.getChildrenNavByPerentId(var.getTermId()));
        return terms;
    }

    @Override
    public List<TermParent> getAllTerm() {
        List<TermParent> terms = termMapper.getParentTerm();
        for(TermParent var : terms)
            var.setChildren(termMapper.getChildrenTermByPerentId(var.getTermId()));
        return terms;
    }
}
