package com.znlccy.cms.admin.model;

import javax.persistence.Entity;
import java.io.Serializable;
import java.util.List;

/**
 * @author: Adminstrator
 * @date: 2018/8/12 16:21
 * @version: v.1.0.0
 * @introduce: 管理员模型
 */
/*@Entity*/
public class Admin implements Serializable {

    /**
     *
     */
    private Integer uid;

    /**
     *
     */
    private String username;

    /**
     *
     */
    private String realname;

    /**
     *
     */
    private String password;

    /**
     *
     */
    private String salt;

    /**
     *
     */
    private byte status;

    /**
     *
     */
    private List<Role> roleList;

    /**
     *
     * @return
     */
    public Integer getUid() {
        return uid;
    }

    /**
     *
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     */
    public String getRealname() {
        return realname;
    }

    /**
     *
     * @param realname
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @return
     */
    public String getSalt() {
        return salt;
    }

    /**
     *
     * @param salt
     */
    public void setSalt(String salt) {
        this.salt = salt;
    }

    /**
     *
     * @return
     */
    public byte getStatus() {
        return status;
    }

    /**
     *
     * @param status
     */
    public void setStatus(byte status) {
        this.status = status;
    }

    /**
     *
     * @return
     */
    public List<Role> getRoleList() {
        return roleList;
    }

    /**
     *
     * @param roleList
     */
    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}
