package com.example.demojap.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * PrdClassify
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "prd_classify", schema = "coffeewx_admin", catalog = "")
public class PrdClassify {
    private int classifyid;
    private String classify;
    private String sort;
    private String image;

    @Id
    @Column(name = "classifyid")
    public int getClassifyid() {
        return classifyid;
    }

    public void setClassifyid(int classifyid) {
        this.classifyid = classifyid;
    }

    @Basic
    @Column(name = "classify")
    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    @Basic
    @Column(name = "sort")
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrdClassify that = (PrdClassify) o;
        return classifyid == that.classifyid &&
                Objects.equals(classify, that.classify) &&
                Objects.equals(sort, that.sort) &&
                Objects.equals(image, that.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classifyid, classify, sort, image);
    }
}
