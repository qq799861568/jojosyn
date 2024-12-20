package com.jojosyn.blog.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "posts")
@Data
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    private String content;

    @Column(name = "author_id", nullable = false)
    private Long authorId; // 通常这里会有一个@ManyToOne关联到User实体，但为了简化，这里只使用了authorId

    @Column(name = "created_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Column(name = "updated_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedDate; // 通常你会在实体监听器或业务逻辑中设置这个值

    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "views", nullable = false)
    private int views;

    @Column(name = "likes", nullable = false)
    private int likes;

    @Column(name = "comments_count", nullable = false)
    private int commentsCount;

    @Column(name = "featured_image", nullable = true)
    private String featuredImage;

    // 省略getter和setter方法...

    // 枚举类型用于映射status字段
    public enum Status {
        PUBLISHED,
        published,
        draft,
        pending;
    }

    // 你可以根据需要添加其他方法和逻辑
}