package org.laidu.blog.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  获取html中的纯文本信息
 * @author laidu
 *
 */
public class HtmlUtil {

	public static String getNoHtmlString(String content, int p) {

		if (null == content)
			return "";
		if (0 == p)
			return "";

		Pattern p_script;
		Matcher m_script;
		Pattern p_style;
		Matcher m_style;
		Pattern p_Html;
		Matcher m_Html;

		try {
			String regEx_script = "<[\\s]*?script[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?script[\\s]*?>";
			// 定义script的正则表达式{或<script[^>]*?>[\\s\\S]*?<\\/script> }
			String regEx_style = "<[\\s]*?style[^>]*?>[\\s\\S]*?<[\\s]*?\\/[\\s]*?style[\\s]*?>";
			// 定义style的正则表达式{或<style[^>]*?>[\\s\\S]*?<\\/style> }
			String regEx_html = "<[^>]+>"; // 定义Html标签的正则表达式

			p_script = Pattern.compile(regEx_script, Pattern.CASE_INSENSITIVE);
			m_script = p_script.matcher(content);
			content = m_script.replaceAll(""); // 过滤script标签
			p_style = Pattern.compile(regEx_style, Pattern.CASE_INSENSITIVE);
			m_style = p_style.matcher(content);
			content = m_style.replaceAll(""); // 过滤style标签

			p_Html = Pattern.compile(regEx_html, Pattern.CASE_INSENSITIVE);
			m_Html = p_Html.matcher(content);

			content = m_Html.replaceAll(""); // 过滤Html标签
		} catch (Exception e) {
			return "";
		}

		if (content.length() > p) {
			content = content.substring(0, p) + "...";
		} else {
			content = content + "...";
		}
		return content;
	}
}