package com.greatideas.demo.persistence.repositories;

import com.greatideas.demo.persistence.domain.Idea;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdeaRepository extends PagingAndSortingRepository<Idea, Long> {

}
