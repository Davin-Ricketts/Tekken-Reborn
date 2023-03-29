package com.example.tekkenreborn.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.tekkenreborn.model.Fighter;

public interface FighterRepositoryPaginated extends PagingAndSortingRepository<Fighter, Long> {
    
}
