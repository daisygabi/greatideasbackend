package com.greatideas.demo.controllers;

import com.greatideas.demo.persistence.dtos.IdeaDto;
import com.greatideas.demo.persistence.services.IdeaService;
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
        return ResponseEntity.ok(getIdeaService().save(ideaDto));
    }

    @GetMapping("/")
    public ResponseEntity<?> getPagedIdeas(@RequestParam(value = "pageSize", defaultValue = "1") Integer pageSize,
                                           @RequestParam(value = "pageNo", defaultValue = "1") Integer pageNumber,
                                           @SortDefault(sort = "id", direction = Sort.Direction.ASC) Sort sort,
                                           @RequestParam(value = "limit", defaultValue = "20") Integer limit) {
        Pageable pageable = PageRequest.of(pageNumber > 0 ? pageNumber - 1 : pageNumber, pageSize, sort);
        return ResponseEntity.ok(getIdeaService().getPagedListOfIdeas(pageable));
    }

    public IdeaService getIdeaService() {
        return ideaService;
    }

    public void setIdeaService(IdeaService ideaService) {
        this.ideaService = ideaService;
    }
}