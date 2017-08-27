package patterns.oreilly.strategy.game;

import patterns.oreilly.strategy.game.model.*;
import patterns.oreilly.strategy.game.model.Character;

public class GameMain {
    public static void main(String[] args) {
        final Character king = new King();
        final Character queen = new Queen();
        final Character knight = new Knight();
        final Character troll = new Troll();

        king.fight();
        queen.fight();
        knight.fight();
        troll.fight();
    }
}
