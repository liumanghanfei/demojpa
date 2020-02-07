package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * WxMenu
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "t_wx_menu", schema = "coffeewx_admin", catalog = "")
public class WxMenu {
    private int id;
    private String parentId;
    private String menuName;
    private String menuType;
    private String menuLevel;
    private String tplId;
    private String menuUrl;
    private String menuSort;
    private String wxAccountId;
    private String miniprogramAppid;
    private String miniprogramPagepath;
    private Timestamp createTime;
    private Timestamp updateTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "parent_id")
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "menu_name")
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Basic
    @Column(name = "menu_type")
    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    @Basic
    @Column(name = "menu_level")
    public String getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(String menuLevel) {
        this.menuLevel = menuLevel;
    }

    @Basic
    @Column(name = "tpl_id")
    public String getTplId() {
        return tplId;
    }

    public void setTplId(String tplId) {
        this.tplId = tplId;
    }

    @Basic
    @Column(name = "menu_url")
    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    @Basic
    @Column(name = "menu_sort")
    public String getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(String menuSort) {
        this.menuSort = menuSort;
    }

    @Basic
    @Column(name = "wx_account_id")
    public String getWxAccountId() {
        return wxAccountId;
    }

    public void setWxAccountId(String wxAccountId) {
        this.wxAccountId = wxAccountId;
    }

    @Basic
    @Column(name = "miniprogram_appid")
    public String getMiniprogramAppid() {
        return miniprogramAppid;
    }

    public void setMiniprogramAppid(String miniprogramAppid) {
        this.miniprogramAppid = miniprogramAppid;
    }

    @Basic
    @Column(name = "miniprogram_pagepath")
    public String getMiniprogramPagepath() {
        return miniprogramPagepath;
    }

    public void setMiniprogramPagepath(String miniprogramPagepath) {
        this.miniprogramPagepath = miniprogramPagepath;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WxMenu wxMenu = (WxMenu) o;
        return id == wxMenu.id &&
                Objects.equals(parentId, wxMenu.parentId) &&
                Objects.equals(menuName, wxMenu.menuName) &&
                Objects.equals(menuType, wxMenu.menuType) &&
                Objects.equals(menuLevel, wxMenu.menuLevel) &&
                Objects.equals(tplId, wxMenu.tplId) &&
                Objects.equals(menuUrl, wxMenu.menuUrl) &&
                Objects.equals(menuSort, wxMenu.menuSort) &&
                Objects.equals(wxAccountId, wxMenu.wxAccountId) &&
                Objects.equals(miniprogramAppid, wxMenu.miniprogramAppid) &&
                Objects.equals(miniprogramPagepath, wxMenu.miniprogramPagepath) &&
                Objects.equals(createTime, wxMenu.createTime) &&
                Objects.equals(updateTime, wxMenu.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parentId, menuName, menuType, menuLevel, tplId, menuUrl, menuSort, wxAccountId, miniprogramAppid, miniprogramPagepath, createTime, updateTime);
    }
}
