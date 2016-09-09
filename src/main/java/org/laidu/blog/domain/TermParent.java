package org.laidu.blog.domain;

import java.util.List;

public class TermParent extends Term {
	
	private List<Term> children;
	

	public List<Term> getChildren() {
		return children;
	}

	public void setChildren(List<Term> children) {
		this.children = children;
	}
}
