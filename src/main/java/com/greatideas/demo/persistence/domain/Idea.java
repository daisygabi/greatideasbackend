package com.greatideas.demo.persistence.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "ideas_pool")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Idea extends DefaultDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 300)
    @Column(columnDefinition = "name")
    private String name;

    @Size(max = 2000)
    @Column(columnDefinition = "text")
    private String text;

    @Size(max = 240)
    @Column(columnDefinition = "owner_name")
    private String ownerName;

    @Column(columnDefinition = "owner_image")
    private String ownerImage;

    @Column(columnDefinition = "likes")
    private int likes;

    @Column(columnDefinition = "comments")
    private int comments;

    @Column(columnDefinition = "image")
    private String image;
}