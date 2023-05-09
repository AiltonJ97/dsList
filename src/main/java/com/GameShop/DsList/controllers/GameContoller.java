package com.GameShop.DsList.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.GameShop.DsList.dto.GameMinDTO;
import com.GameShop.DsList.servicies.GameService;
import com.fasterxml.jackson.annotation.JsonIgnore;

@RestController
@RequestMapping(value = "/games")
public class GameContoller {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	@JsonIgnore
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
}
