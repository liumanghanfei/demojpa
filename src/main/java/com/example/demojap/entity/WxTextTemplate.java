package com.example.demojap.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * WxTextTemplate
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "t_wx_text_template", schema = "coffeewx_admin", catalog = "")
public class WxTextTemplate {
    private int id;
    private String tplName;
    private String content;
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
    @Column(name = "tpl_name")
    public String getTplName() {
        return tplName;
    }

    public void setTplName(String tplName) {
        this.tplName = tplName;
    }

    @Basic
    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
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
        WxTextTemplate that = (WxTextTemplate) o;
        return id == that.id &&
                Objects.equals(tplName, that.tplName) &&
                Objects.equals(content, that.content) &&
                Objects.equals(createTime, that.createTime) &&
                Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tplName, content, createTime, updateTime);
    }
}
