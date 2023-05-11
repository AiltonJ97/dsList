package com.GameShop.DsList.positories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GameShop.DsList.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
}
