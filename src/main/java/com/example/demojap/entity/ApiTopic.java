package com.example.demojap.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * ApiTopic
 *
 * @author yangy
 * @date 2020-02-07
 */
@Entity
@Table(name = "t_api_topic", schema = "coffeewx_admin", catalog = "")
public class ApiTopic {
    private int topicid;
    private String topicname;

    @Id
    @Column(name = "topicid")
    public int getTopicid() {
        return topicid;
    }

    public void setTopicid(int topicid) {
        this.topicid = topicid;
    }

    @Basic
    @Column(name = "topicname")
    public String getTopicname() {
        return topicname;
    }

    public void setTopicname(String topicname) {
        this.topicname = topicname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApiTopic apiTopic = (ApiTopic) o;
        return topicid == apiTopic.topicid &&
                Objects.equals(topicname, apiTopic.topicname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicid, topicname);
    }
}
