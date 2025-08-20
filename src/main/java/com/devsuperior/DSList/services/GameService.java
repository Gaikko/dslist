package com.devsuperior.DSList.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.DSList.dto.GameMinDTO;
import com.devsuperior.DSList.entities.Game;
import com.devsuperior.DSList.repositories.gameRepository;

@Service
public class GameService {

	@Autowired
	private gameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
}
