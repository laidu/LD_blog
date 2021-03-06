package org.laidu.blog.domain;

import java.util.Date;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.ID
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_login
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String userLogin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_pass
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String userPass;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_nicename
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String userNicename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_email
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String userEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_url
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String userUrl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_registered
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private Date userRegistered;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_activation_key
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String userActivationKey;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_status
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private Integer userStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.display_name
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    private String displayName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.ID
     *
     * @return the value of users.ID
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.ID
     *
     * @param id the value for users.ID
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_login
     *
     * @return the value of users.user_login
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getUserLogin() {
        return userLogin;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_login
     *
     * @param userLogin the value for users.user_login
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin == null ? null : userLogin.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_pass
     *
     * @return the value of users.user_pass
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_pass
     *
     * @param userPass the value for users.user_pass
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_nicename
     *
     * @return the value of users.user_nicename
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getUserNicename() {
        return userNicename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_nicename
     *
     * @param userNicename the value for users.user_nicename
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setUserNicename(String userNicename) {
        this.userNicename = userNicename == null ? null : userNicename.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_email
     *
     * @return the value of users.user_email
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_email
     *
     * @param userEmail the value for users.user_email
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_url
     *
     * @return the value of users.user_url
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getUserUrl() {
        return userUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_url
     *
     * @param userUrl the value for users.user_url
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setUserUrl(String userUrl) {
        this.userUrl = userUrl == null ? null : userUrl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_registered
     *
     * @return the value of users.user_registered
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public Date getUserRegistered() {
        return userRegistered;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_registered
     *
     * @param userRegistered the value for users.user_registered
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setUserRegistered(Date userRegistered) {
        this.userRegistered = userRegistered;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_activation_key
     *
     * @return the value of users.user_activation_key
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getUserActivationKey() {
        return userActivationKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_activation_key
     *
     * @param userActivationKey the value for users.user_activation_key
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setUserActivationKey(String userActivationKey) {
        this.userActivationKey = userActivationKey == null ? null : userActivationKey.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_status
     *
     * @return the value of users.user_status
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public Integer getUserStatus() {
        return userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.user_status
     *
     * @param userStatus the value for users.user_status
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.display_name
     *
     * @return the value of users.display_name
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column users.display_name
     *
     * @param displayName the value for users.display_name
     *
     * @mbg.generated Fri Sep 09 09:11:24 CST 2016
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName == null ? null : displayName.trim();
    }
}