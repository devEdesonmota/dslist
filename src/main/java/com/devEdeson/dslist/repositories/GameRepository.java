package com.devEdeson.dslist.repositories;

import com.devEdeson.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <Game,Long> {
}
