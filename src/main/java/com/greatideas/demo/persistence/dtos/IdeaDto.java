package com.greatideas.demo.persistence.dtos;

import com.greatideas.demo.persistence.domain.DefaultDomain;

public class IdeaDto extends DefaultDomain {

    private Long id;
    private String name;
    private String text;
    private String ownerName;
    private String ownerImage;
    private int likes;
    private String image;
}