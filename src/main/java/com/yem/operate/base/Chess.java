package com.yem.operate.base;

public class Chess implements com.yem.operate.base.Game {
    private Chess(){};
    private int moves = 0;
    private static final int MOVES = 4;
    public boolean remove() {
        System.out.println("Chess move" + moves);
        return ++moves != MOVES;
    }
    public static com.yem.operate.base.GameFactory factory = new com.yem.operate.base.GameFactory() {
        @Override
        public com.yem.operate.base.Game getGame() {
            return new Chess();
        }
    };
}
