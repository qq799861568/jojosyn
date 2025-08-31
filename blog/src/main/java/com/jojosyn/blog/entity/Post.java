package com.jojosyn.blog.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
@Data
@ApiModel(description = "文章实体")
public class Post {
    @Id
    @ApiModelProperty(value = "文章ID", example = "1", hidden = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ApiModelProperty(value = "文章标题", required = true, example = "SpringBoot最佳实践")
    @Column(name = "title", nullable = false)
    private String title;

    @ApiModelProperty(value = "文章内容", required = true, example = "这是文章正文内容...")
    @Column(name = "content", nullable = false, columnDefinition = "TEXT")
    private String content;

    @ApiModelProperty(value = "作者ID", required = true, example = "123")
    @Column(name = "author_id", nullable = false)
    private Long authorId;

    @ApiModelProperty(value = "创建时间", example = "2025-08-31 14:50:15")
    @Column(name = "created_date",  nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime createdDate;

    @ApiModelProperty(value = "更新时间", example = "2025-08-31 15:30:00")
    @Column(name = "updated_date",  nullable = false, columnDefinition = "TIMESTAMP")
    private LocalDateTime updatedDate;

    @ApiModelProperty(value = "文章状态", required = true, allowableValues = "PUBLISHED, DRAFT, DELETED")
    @Column(name = "status", nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;

    @ApiModelProperty(value = "浏览量", example = "100")
    @Column(name = "views", nullable = false)
    private int views;

    @ApiModelProperty(value = "点赞数", example = "20")
    @Column(name = "likes", nullable = false)
    private int likes;

    @ApiModelProperty(value = "评论数", example = "15")
    @Column(name = "comments_count", nullable = false)
    private int commentsCount;

    @ApiModelProperty(value = "封面图URL", example = "https://example.com/image.jpg")
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