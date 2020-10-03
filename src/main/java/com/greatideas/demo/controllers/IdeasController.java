package com.greatideas.demo.controllers;

import com.greatideas.demo.persistence.domain.Idea;
import com.greatideas.demo.persistence.dtos.IdeaDto;
import com.greatideas.demo.persistence.services.IdeaService;
import com.greatideas.demo.utils.EntityHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.SortDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/api/v1/idea")
public class IdeasController {

    private IdeaService ideaService;

    @Autowired
    public IdeasController(IdeaService ideaService) {
        setIdeaService(ideaService);
    }

    @PostMapping("/")
    public ResponseEntity<IdeaDto> save(@Valid @RequestBody IdeaDto ideaDto) {
        Idea savedPantryItem = getIdeaService().save(EntityHelper.convertToAbstractEntity(ideaDto, Idea.class));
        return ResponseEntity.ok(EntityHelper.convertToAbstractDto(savedPantryItem, IdeaDto.class));
    }

    @GetMapping("/")
    public ResponseEntity<?> getPagedIdeas(@RequestParam(value = "pageSize", defaultValue = "0") Integer pageSize,
                                           @RequestParam(value = "pageNo", defaultValue = "1") Integer pageNumber,
                                           @SortDefault(sort = "id", direction = Sort.Direction.ASC) Sort sort,
                                           @RequestParam(value = "limit", defaultValue = "0") Integer limit) {
        Pageable pageable = PageRequest.of(pageNumber > 0 ? pageNumber - 1 : pageNumber, 4, sort);
        return ResponseEntity.ok(getIdeaService().getPagedListOfIdeas(pageable, limit));
    }

    public IdeaService getIdeaService() {
        return ideaService;
    }

    public void setIdeaService(IdeaService ideaService) {
        this.ideaService = ideaService;
    }
}