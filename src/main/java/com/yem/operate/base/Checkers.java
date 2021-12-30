package com.yem.operate.base;

import com.yem.operate.base.Game;

public class Checkers implements com.yem.operate.base.Game {
    private Checkers(){}
    private int moves = 0;
    private static final int MOVES = 3;
    public boolean remove() {
        System.out.println("Checks move" + moves);
        return ++moves != MOVES;
    }
    public static com.yem.operate.base.GameFactory factory = new com.yem.operate.base.GameFactory() {
        @Override
        public com.yem.operate.base.Game getGame() {
            return new Checkers();
        }
    };
}
