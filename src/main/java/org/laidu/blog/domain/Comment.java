package org.laidu.blog.domain;

import java.util.Date;

public class Comment {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.comment_ID
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private Long commentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.comment_post_ID
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private Long commentPostId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.comment_author_email
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String commentAuthorEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.comment_author_url
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String commentAuthorUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.comment_author_IP
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String commentAuthorIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.comment_date
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private Date commentDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.comment_date_gmt
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private Date commentDateGmt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.comment_karma
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private Integer commentKarma;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.comment_approved
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String commentApproved;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.comment_agent
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String commentAgent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.comment_type
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String commentType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.comment_parent
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private Long commentParent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column comments.user_id
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private Long userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.comment_ID
     *
     * @return the value of comments.comment_ID
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public Long getCommentId() {
        return commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.comment_ID
     *
     * @param commentId the value for comments.comment_ID
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.comment_post_ID
     *
     * @return the value of comments.comment_post_ID
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public Long getCommentPostId() {
        return commentPostId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.comment_post_ID
     *
     * @param commentPostId the value for comments.comment_post_ID
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setCommentPostId(Long commentPostId) {
        this.commentPostId = commentPostId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.comment_author_email
     *
     * @return the value of comments.comment_author_email
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getCommentAuthorEmail() {
        return commentAuthorEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.comment_author_email
     *
     * @param commentAuthorEmail the value for comments.comment_author_email
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setCommentAuthorEmail(String commentAuthorEmail) {
        this.commentAuthorEmail = commentAuthorEmail == null ? null : commentAuthorEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.comment_author_url
     *
     * @return the value of comments.comment_author_url
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getCommentAuthorUrl() {
        return commentAuthorUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.comment_author_url
     *
     * @param commentAuthorUrl the value for comments.comment_author_url
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setCommentAuthorUrl(String commentAuthorUrl) {
        this.commentAuthorUrl = commentAuthorUrl == null ? null : commentAuthorUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.comment_author_IP
     *
     * @return the value of comments.comment_author_IP
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getCommentAuthorIp() {
        return commentAuthorIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.comment_author_IP
     *
     * @param commentAuthorIp the value for comments.comment_author_IP
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setCommentAuthorIp(String commentAuthorIp) {
        this.commentAuthorIp = commentAuthorIp == null ? null : commentAuthorIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.comment_date
     *
     * @return the value of comments.comment_date
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public Date getCommentDate() {
        return commentDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.comment_date
     *
     * @param commentDate the value for comments.comment_date
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.comment_date_gmt
     *
     * @return the value of comments.comment_date_gmt
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public Date getCommentDateGmt() {
        return commentDateGmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.comment_date_gmt
     *
     * @param commentDateGmt the value for comments.comment_date_gmt
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setCommentDateGmt(Date commentDateGmt) {
        this.commentDateGmt = commentDateGmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.comment_karma
     *
     * @return the value of comments.comment_karma
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public Integer getCommentKarma() {
        return commentKarma;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.comment_karma
     *
     * @param commentKarma the value for comments.comment_karma
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setCommentKarma(Integer commentKarma) {
        this.commentKarma = commentKarma;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.comment_approved
     *
     * @return the value of comments.comment_approved
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getCommentApproved() {
        return commentApproved;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.comment_approved
     *
     * @param commentApproved the value for comments.comment_approved
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setCommentApproved(String commentApproved) {
        this.commentApproved = commentApproved == null ? null : commentApproved.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.comment_agent
     *
     * @return the value of comments.comment_agent
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getCommentAgent() {
        return commentAgent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.comment_agent
     *
     * @param commentAgent the value for comments.comment_agent
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setCommentAgent(String commentAgent) {
        this.commentAgent = commentAgent == null ? null : commentAgent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.comment_type
     *
     * @return the value of comments.comment_type
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getCommentType() {
        return commentType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.comment_type
     *
     * @param commentType the value for comments.comment_type
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setCommentType(String commentType) {
        this.commentType = commentType == null ? null : commentType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.comment_parent
     *
     * @return the value of comments.comment_parent
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public Long getCommentParent() {
        return commentParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.comment_parent
     *
     * @param commentParent the value for comments.comment_parent
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setCommentParent(Long commentParent) {
        this.commentParent = commentParent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column comments.user_id
     *
     * @return the value of comments.user_id
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column comments.user_id
     *
     * @param userId the value for comments.user_id
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}