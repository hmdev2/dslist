package com.peumeloaluno.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.peumeloaluno.dslist.dto.GameDTO;
import com.peumeloaluno.dslist.dto.GameListDTO;
import com.peumeloaluno.dslist.dto.GameMinDTO;
import com.peumeloaluno.dslist.entities.Game;
import com.peumeloaluno.dslist.entities.GameList;
import com.peumeloaluno.dslist.repositories.GameListRepository;
import com.peumeloaluno.dslist.repositories.GameRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
