package com.example.demojap.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * PrdBrand
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "prd_brand", schema = "coffeewx_admin", catalog = "")
public class PrdBrand {
    private int brandid;
    private String brand;
    private String sort;
    private String image;

    @Id
    @Column(name = "brandid")
    public int getBrandid() {
        return brandid;
    }

    public void setBrandid(int brandid) {
        this.brandid = brandid;
    }

    @Basic
    @Column(name = "brand")
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
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
        PrdBrand prdBrand = (PrdBrand) o;
        return brandid == prdBrand.brandid &&
                Objects.equals(brand, prdBrand.brand) &&
                Objects.equals(sort, prdBrand.sort) &&
                Objects.equals(image, prdBrand.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brandid, brand, sort, image);
    }
}
