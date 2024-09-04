package org.keerthi;

import jakarta.persistence.*;

@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "userid", nullable = false)
    private Integer id;

    @Column(name = "username", nullable = false, length = 20)
    private String username;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "deptid")
    private Dept deptid;

    public Dept getDeptid() {
        return deptid;
    }

    public void setDeptid(Dept deptid) {
        this.deptid = deptid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}