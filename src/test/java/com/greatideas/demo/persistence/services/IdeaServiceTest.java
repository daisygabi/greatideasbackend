package com.greatideas.demo.persistence.services;

import com.greatideas.demo.persistence.domain.Idea;
import com.greatideas.demo.persistence.repositories.IdeaRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@ActiveProfiles("dev")
public class IdeaServiceTest {

    @InjectMocks
    private IdeaService subject;

    @Mock
    private IdeaRepository repository;

    private List<Idea> ideas;
    private Idea idea;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        idea = new Idea();
        idea.setId(1L);
        idea.setName("Adopt an animal");
        idea.setDescription("testing descriptions here");
        idea.setAuthorName("Gabi");
        idea.setAuthorProfileImageUrl("");
        idea.setLikes(12);
        idea.setCreatedAt(Calendar.getInstance().getTime());
        idea.setCreatedAt(Calendar.getInstance().getTime());

        ideas = new ArrayList<>();
        ideas.add(idea);

        when(repository.findById(1L)).thenReturn(java.util.Optional.ofNullable(idea));
    }

    @Test
    public void getAllIdeas_ShouldReturn_ListOf_AllIdeas_WhichContainsOneIdea() {
        when(repository.findAll()).thenReturn(ideas);

        List<Idea> returnedIdeas = subject.getAllIdeas();

        assertThat(returnedIdeas.size()).isEqualTo(1);
        assertThat(returnedIdeas.get(0).getId()).isEqualTo(idea.getId());
        assertThat(returnedIdeas.get(0).getName()).isEqualTo(idea.getName());
        assertThat(returnedIdeas.get(0).getAuthorProfileImageUrl()).isEqualTo(idea.getAuthorProfileImageUrl());
        assertThat(returnedIdeas.get(0).getDescription()).isEqualTo(idea.getDescription());
        assertThat(returnedIdeas.get(0).getLikes()).isEqualTo(idea.getLikes());
    }

    @Test
    public void getPagedListOfIdeas_WithDefaultLimit_ShouldReturn_ListOf_PagedPosts() {
        List<Idea> dummyIdeas = createDummyIdeas(23);
        int pageNumber = 0;
        int pageSize = 4;
        int limit = 0;
        Pageable pageable = PageRequest.of(pageNumber, pageSize);
        Page<Idea> postPage = new PageImpl<>(dummyIdeas);
        when(repository.findAll(pageable)).thenReturn(postPage);

        Page<Idea> pagedPosts = subject.getPagedListOfIdeas(pageable, limit);

        assertEquals(pagedPosts.getNumberOfElements(), 23);
    }

    private List<Idea> createDummyIdeas(int maximumLength) {
        List<Idea> ideas = new ArrayList<>();
        for (int i = 0; i < maximumLength; i++) {
            Idea dummyIdea = new Idea(3L, "demo name " + i, "description dummy " + i, "Gabi " + i, "http://google.com", 2);
            ideas.add(dummyIdea);
        }
        return ideas;
    }
}