package com.example.tekkenreborn.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.tekkenreborn.model.Fighter;

public class FighterRowMapper implements RowMapper<Fighter>{
    
    @Override
    public Fighter mapRow(ResultSet rs, int row) throws SQLException {
        return Fighter.builder()
            .id(rs.getLong("id"))
            .name(rs.getString("name"))
            .damagePerHit(rs.getInt("damagePerHit"))
            .health(rs.getInt("health"))
            .resistance(rs.getBigDecimal("resistance"))
            .animeFrom(Fighter.Anime.valueOf(rs.getString("animeFrom")))
            .build();
    }
}
