package com.example.tekkenreborn.repository;

import java.util.Optional;
import com.example.tekkenreborn.model.Fighter;

public interface FighterRepository {
    Iterable<Fighter> findAll();

    Optional<Fighter> findById(Long id);
    Fighter save(Fighter fighter);

    void save(Fighter fighter);
}
