package com.peumeloaluno.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.peumeloaluno.dslist.entities.Game;
import com.peumeloaluno.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
