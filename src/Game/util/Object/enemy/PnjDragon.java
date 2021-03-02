package Game.util.Object.enemy;

import Game.util.Object.item.DragonFire;
import Game.util.Player.Player;

/** dragon pnj*/
public class PnjDragon extends PnjEnnemy{

    public PnjDragon() {
        super(new DragonFire(), 250);
        super.reward = 1300;
    }

    @Override
    public String toString(Player player) {
        return "<html> <body> <b />"+
                "Dragon "+ super.toString(player);
    }

}
