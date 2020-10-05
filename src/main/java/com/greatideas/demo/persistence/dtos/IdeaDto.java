package com.greatideas.demo.persistence.dtos;

import com.greatideas.demo.persistence.domain.DefaultDomain;

public class IdeaDto extends DefaultDomain {

    private Long id;
    private String name;
    private String description;
    private String authorName;
    private String authorProfileImageUrl;
    private int likes;
    private String imageUrl;
}