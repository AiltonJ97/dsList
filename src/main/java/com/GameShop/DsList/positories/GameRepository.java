package com.GameShop.DsList.positories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.GameShop.DsList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
