package com.yem.operate.base;

import com.yem.operate.base.Checkers;
import com.yem.operate.base.Chess;

public class Games {
    public static void playGame(GameFactory factory){
        Game game = factory.getGame();
        while (game.remove()){};
    }

    public static void main(String[] args) {
        playGame(Chess.factory);
        playGame(Checkers.factory);
    }
}
