package com.devsuperior.DSList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.DSList.entities.Game;

public interface gameRepository extends JpaRepository<Game, Long> {

	
	
}
