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
    @Column(columnDefinition = "description")
    private String description;

    @Size(max = 240)
    @Column(columnDefinition = "author_name")
    private String authorName;

    @Column(columnDefinition = "author_profile_image_url")
    private String authorProfileImageUrl;

    @Column(columnDefinition = "likes")
    private int likes;

    @Column(columnDefinition = "image_url")
    private String imageUrl;
}