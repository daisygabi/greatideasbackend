package com.greatideas.demo.persistence.services;

import com.greatideas.demo.persistence.domain.Idea;
import com.greatideas.demo.persistence.repositories.IdeaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class IdeaService {

    private IdeaRepository ideaRepository;

    @Autowired
    public IdeaService(IdeaRepository ideaRepository) {
        setIdeaRepository(ideaRepository);
    }

    public List<Idea> getAllIdeas() {
        return Optional.of((List<Idea>) getIdeaRepository().findAll())
                .orElse(new ArrayList<>());
    }

    public Page<Idea> getPagedListOfIdeas(Pageable pageable, int limit) {
        if (limit > 0) {
            List<Idea> limitedResults = ((List<Idea>) getIdeaRepository().findAll()).stream().limit(limit).collect(Collectors.toList());
            return transformListToPageable(pageable, limitedResults);
        }
        return getIdeaRepository().findAll(pageable);
    }

    public Idea save(Idea idea) {
        return getIdeaRepository().save(idea);
    }

    private Page<Idea> transformListToPageable(Pageable pageable, List<Idea> limitedResults) {
        int start = (int) pageable.getOffset();
        int end = Math.min((start + pageable.getPageSize()), limitedResults.size());
        return new PageImpl<>(limitedResults.subList(start, end), pageable, limitedResults.size());
    }

    public IdeaRepository getIdeaRepository() {
        return ideaRepository;
    }

    public void setIdeaRepository(IdeaRepository ideaRepository) {
        this.ideaRepository = ideaRepository;
    }
}
