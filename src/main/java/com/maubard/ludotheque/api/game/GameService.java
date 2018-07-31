package com.maubard.ludotheque.api.game;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GameRepository gameRepository;

    public List<GameEntity> getGames() {
        return gameRepository.findAll();
    }

    public void createGame(GameEntity gameEntity) {
        gameRepository.save(gameEntity);
    }
}
