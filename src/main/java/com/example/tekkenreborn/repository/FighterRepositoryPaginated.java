package com.example.tekkenreborn.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.example.tekkenreborn.model.Fighter;

@Repository
public interface FighterRepositoryPaginated extends PagingAndSortingRepository<Fighter, Long> {
    
}
