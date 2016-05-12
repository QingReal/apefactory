package com.qp.apefactory.cloud.models.accounting;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.Set;

/**
 * Created by QING on 2016/5/2.
 */
@Entity
@Table(name = "permissions")
public class Permission {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * 权限名
     */
    @NotNull
    private String name;

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

    @NotNull
    private Boolean state;


    @ManyToMany(mappedBy="permissions",cascade=CascadeType.ALL)
    private Set<Role> roles;

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(
            name="permission_resources",
            joinColumns=@JoinColumn(name="permission_id"),
            inverseJoinColumns=@JoinColumn(name="resource_id")
    )
    private Set<Resource> resources;

    public  Permission(){}

    public Permission(String name){
        this.name = name;
    }

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

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public Set<Resource> getResources() {
        return resources;
    }

    public void setResources(Set<Resource> resources) {
        this.resources = resources;
    }
}
