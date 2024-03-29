package com.example.tekkenreborn;

import java.math.BigDecimal;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.tekkenreborn.model.Fighter;
import com.example.tekkenreborn.model.Fighter.Anime;
import com.example.tekkenreborn.repository.FighterRepository;

@SpringBootApplication
public class TekkenrebornApplication {

	public static void main(String[] args) {
		SpringApplication.run(TekkenrebornApplication.class, args);
	}

	@Bean
	public CommandLineRunner dataLoader(FighterRepository repository) {
		return args -> {
			repository.save(Fighter.builder()
				.name("Heihachi Mishima")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(89)
				.health(2000)
				.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
				.name("Heihachi Mishima")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(89)
				.health(2000)
				.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
				.name("Kayuza Mishima")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(86)
				.health(2100)
				.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
				.name("Jin Kazama")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(90)
				.health(2200)
				.resistance(new BigDecimal(0.5)).build());

			repository.save(Fighter.builder()
				.name("Steve Fox")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(80)
				.health(2500)
				.resistance(new BigDecimal(0.5)).build());

				repository.save(Fighter.builder()
				.name("Hwoarang")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(89)
				.health(2000)
				.resistance(new BigDecimal(0.5)).build());

		repository.save(Fighter.builder()
				.name("Panda")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(86)
				.health(2100)
				.resistance(new BigDecimal(0.5)).build());

		repository.save(Fighter.builder()
				.name("Eddy Gordo")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(90)
				.health(2200)
				.resistance(new BigDecimal(0.5)).build());

		repository.save(Fighter.builder()
				.name("Steve Fox")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(80)
				.health(25000)
				.resistance(new BigDecimal(0.5)).build());
		repository.save(Fighter.builder()
				.name("Law")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(89)
				.health(2000)
				.resistance(new BigDecimal(0.5)).build());

		repository.save(Fighter.builder()
				.name("Lei Wulong")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(86)
				.health(2100)
				.resistance(new BigDecimal(0.5)).build());

		repository.save(Fighter.builder()
				.name("Anna")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(90)
				.health(2200)
				.resistance(new BigDecimal(0.5)).build());

		repository.save(Fighter.builder()
				.name("Xiaoyu")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(80)
				.health(25000)
				.resistance(new BigDecimal(0.5)).build());
		repository.save(Fighter.builder()
				.name("Brian Fury")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(89)
				.health(2000)
				.resistance(new BigDecimal(0.5)).build());

		repository.save(Fighter.builder()
				.name("Kuma")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(86)
				.health(2100)
				.resistance(new BigDecimal(0.5)).build());

		repository.save(Fighter.builder()
				.name("Paul Phoenix")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(90)
				.health(2200)
				.resistance(new BigDecimal(0.5)).build());

		repository.save(Fighter.builder()
				.name("King")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(80)
				.health(25000)
				.resistance(new BigDecimal(0.5)).build());
		repository.save(Fighter.builder()
				.name("Bruce Irvin")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(89)
				.health(2000)
				.resistance(new BigDecimal(0.5)).build());

		repository.save(Fighter.builder()
				.name("Dragunov")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(86)
				.health(2100)
				.resistance(new BigDecimal(0.5)).build());

		repository.save(Fighter.builder()
				.name("Lars Alexandersson")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(90)
				.health(2200)
				.resistance(new BigDecimal(0.5)).build());

		repository.save(Fighter.builder()
				.name("Devil Jin")
				.animeFrom(Anime.TEKKEN)
				.damagePerHit(80)
				.health(25000)
				.resistance(new BigDecimal(0.5)).build());
		};
	}

}
