package org.keerthi;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dept")
public class Dept {
    @Id
    @Column(name = "dept_id", nullable = false)
    private Integer id;

    @Column(name = "deptName", nullable = false, length = 20)
    private String deptName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}