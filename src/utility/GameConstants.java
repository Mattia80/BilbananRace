package utility;

public class GameConstants {

    public static class Tiles {
        public static final int TILES_DEFAULT_SIZE = 32;
        public static final float SCALE = 1.5f;
        public static final int TILES_IN_WIDTH = 26;
        public static final int TILES_IN_HEIGHT = 18;
        public static final int TILES_SIZE = (int) (TILES_DEFAULT_SIZE * SCALE);
    }

    public static class Game {
        public static final int GAME_WIDTH = Tiles.TILES_IN_WIDTH * Tiles.TILES_SIZE;
        public static final int GAME_HEIGHT = Tiles.TILES_IN_HEIGHT * Tiles.TILES_SIZE;
    }

    public static class Player {
        
    }

}
