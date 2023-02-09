

import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.stereotype.Repository;

import com.example.tekkenreborn.model.Fighter;
import com.example.tekkenreborn.repository.FighterRepository;

@Repository
public class JdbcFighterRepository implements FighterRepository{
    private JdbcTemplate jdbcTemplate;

    public JdbcFighterRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Iterable<Fighter> findAll() {

        return jdbcTemplate.query("SELECT * FROM fighter", new FighterRowMapper());
    }

    @Override
    public Optional<Fighter> findById(Long id){

        Fighter fighter = jdbcTemplate.queryForObject("SELECT * FROM fighter WHERE id = ?", new FighterRowMapper(), id);

        return Optional.ofNullable(fighter);
    }

    public void save(Fighter fighter) {

        var insertFighter = "INSERT INTO fighter (name, damagePerHit, heath, animeFrom, createdAt) VALUES (?, ?, ?, ?, ?, ?)";
        var keyHolder = new GeneratedKeyHolder();
        jdbcTemplate.update(connection -> {
            var ps = connection.prepareStatement(insertFighter);
            ps.setString(1, fighter.getName());
            ps.setInt(2, fighter.getDamagePerHit());
            ps.setInt(3, fighter.getHealth());
            ps.setBigDecimal(4, fighter.getResistance());
            ps.setString(5, Fighter.getAnimeFrom().name());
            ps.setString(6, fighter.getCreatedAt().toString());

            return ps;
        }, keyHolder);
        
    }
}
