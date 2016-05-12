package com.qp.apefactory.cloud.models.accounting;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by QING on 2016/4/28.
 */
@Entity
@Table(name = "users")
public class User {

    /**
     * id 标识
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 用户名
     */
    @NotNull
    private String name;

    /**
     * 密码
     */
    @NotNull
    private String password;

    /**
     * 邮箱
     */
    @NotNull
    private String email;

    /**
     * 手机号
     */
    @NotNull
    private String mobile;


    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(
            name="user_role",
            joinColumns=@JoinColumn(name="user_id"),
            inverseJoinColumns=@JoinColumn(name="role_id")
    )
    private Set<Role> roles;

    /**
     * 创建日期
     */
    @NotNull
    @Column(updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate = new Date();

    /**
     * 修改日期
     */
    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDate = new Date();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        if(createDate != null){
            this.createDate = createDate;
        }else{
            this.createDate = new Date();
        }
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        if(modifyDate != null){
            this.modifyDate = modifyDate;
        }else{
            this.modifyDate = new Date();
        }
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
