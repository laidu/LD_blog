package org.laidu.blog.domain;

import java.util.Date;

public class Post {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.ID
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.post_author
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private Long postAuthor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.post_date
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private Date postDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.post_date_gmt
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private Date postDateGmt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.post_status
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String postStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.comment_status
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String commentStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.ping_status
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String pingStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.post_password
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String postPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.post_name
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String postName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.post_modified
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private Date postModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.post_modified_gmt
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private Date postModifiedGmt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.post_parent
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private Long postParent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.guid
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String guid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.menu_order
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private Integer menuOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.post_type
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String postType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.post_mime_type
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String postMimeType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column posts.comment_count
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private Long commentCount;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.ID
     *
     * @return the value of posts.ID
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.ID
     *
     * @param id the value for posts.ID
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.post_author
     *
     * @return the value of posts.post_author
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public Long getPostAuthor() {
        return postAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.post_author
     *
     * @param postAuthor the value for posts.post_author
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setPostAuthor(Long postAuthor) {
        this.postAuthor = postAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.post_date
     *
     * @return the value of posts.post_date
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public Date getPostDate() {
        return postDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.post_date
     *
     * @param postDate the value for posts.post_date
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.post_date_gmt
     *
     * @return the value of posts.post_date_gmt
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public Date getPostDateGmt() {
        return postDateGmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.post_date_gmt
     *
     * @param postDateGmt the value for posts.post_date_gmt
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setPostDateGmt(Date postDateGmt) {
        this.postDateGmt = postDateGmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.post_status
     *
     * @return the value of posts.post_status
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getPostStatus() {
        return postStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.post_status
     *
     * @param postStatus the value for posts.post_status
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setPostStatus(String postStatus) {
        this.postStatus = postStatus == null ? null : postStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.comment_status
     *
     * @return the value of posts.comment_status
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getCommentStatus() {
        return commentStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.comment_status
     *
     * @param commentStatus the value for posts.comment_status
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus == null ? null : commentStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.ping_status
     *
     * @return the value of posts.ping_status
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getPingStatus() {
        return pingStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.ping_status
     *
     * @param pingStatus the value for posts.ping_status
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus == null ? null : pingStatus.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.post_password
     *
     * @return the value of posts.post_password
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getPostPassword() {
        return postPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.post_password
     *
     * @param postPassword the value for posts.post_password
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setPostPassword(String postPassword) {
        this.postPassword = postPassword == null ? null : postPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.post_name
     *
     * @return the value of posts.post_name
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getPostName() {
        return postName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.post_name
     *
     * @param postName the value for posts.post_name
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setPostName(String postName) {
        this.postName = postName == null ? null : postName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.post_modified
     *
     * @return the value of posts.post_modified
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public Date getPostModified() {
        return postModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.post_modified
     *
     * @param postModified the value for posts.post_modified
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setPostModified(Date postModified) {
        this.postModified = postModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.post_modified_gmt
     *
     * @return the value of posts.post_modified_gmt
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public Date getPostModifiedGmt() {
        return postModifiedGmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.post_modified_gmt
     *
     * @param postModifiedGmt the value for posts.post_modified_gmt
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setPostModifiedGmt(Date postModifiedGmt) {
        this.postModifiedGmt = postModifiedGmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.post_parent
     *
     * @return the value of posts.post_parent
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public Long getPostParent() {
        return postParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.post_parent
     *
     * @param postParent the value for posts.post_parent
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setPostParent(Long postParent) {
        this.postParent = postParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.guid
     *
     * @return the value of posts.guid
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getGuid() {
        return guid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.guid
     *
     * @param guid the value for posts.guid
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setGuid(String guid) {
        this.guid = guid == null ? null : guid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.menu_order
     *
     * @return the value of posts.menu_order
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public Integer getMenuOrder() {
        return menuOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.menu_order
     *
     * @param menuOrder the value for posts.menu_order
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setMenuOrder(Integer menuOrder) {
        this.menuOrder = menuOrder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.post_type
     *
     * @return the value of posts.post_type
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getPostType() {
        return postType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.post_type
     *
     * @param postType the value for posts.post_type
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setPostType(String postType) {
        this.postType = postType == null ? null : postType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.post_mime_type
     *
     * @return the value of posts.post_mime_type
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getPostMimeType() {
        return postMimeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.post_mime_type
     *
     * @param postMimeType the value for posts.post_mime_type
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setPostMimeType(String postMimeType) {
        this.postMimeType = postMimeType == null ? null : postMimeType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column posts.comment_count
     *
     * @return the value of posts.comment_count
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public Long getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column posts.comment_count
     *
     * @param commentCount the value for posts.comment_count
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }
}