package com.devEdeson.dslist.services;

import com.devEdeson.dslist.dto.GameMinDTO;
import com.devEdeson.dslist.entities.Game;
import com.devEdeson.dslist.repositories.GameRepository;
import org.aspectj.lang.annotation.DeclareAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
