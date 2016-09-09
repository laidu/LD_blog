package org.laidu.blog;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.laidu.blog.domain.Term;
import org.laidu.blog.domain.TermParent;
import org.laidu.blog.service.TermService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TermServiceTest {
	@Autowired
	private TermService termService;

	@Test
	public void getAllNavTest() {

		for (TermParent term: termService.getAllNav()){
			System.out.println(term.getName());
			for (Term t: term.getChildren())
				System.out.println(t.getName()+"---------"+t.getCount());
		}

	}

	@Test
	public void getAllTermTest() {

		for (TermParent term: termService.getAllTerm()){
			System.out.println(term.getName());
			for (Term t: term.getChildren())
				System.out.println(t.getName()+"---------"+t.getCount());
		}

	}

}
