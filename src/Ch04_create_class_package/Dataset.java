package Ch04_create_class_package;
import java.util.ArrayList;
import java.util.List;
public class Dataset {
    public static List<Tools> getGameList() {//데이터 셋
        List<Tools> Game = new ArrayList<>();
        Game.add(new Tools("Darksoul3", "Soul series", 49.9, 89));
        Game.add(new Tools("EldenRing", "Soul series", 64.9, 94));
        Game.add(new Tools("Subnautica", "", 30.0, 87));
        Game.add(new Tools("StardewValley", "Healing", 14.99, 89));
        Game.add(new Tools("BattleGround", "fps", 0, 89));
        Game.add(new Tools("MonsterHunterWorld", "RPG", 70, 88));
        Game.add(new Tools("Tekken8", "3D fighting", 64.99, 91));
        Game.add(new Tools("Witcher3", "RPG", 29.99, 93));
        Game.add(new Tools("Dishonored2", "Assassin", 29.99, 86));
        Game.add(new Tools("GTA5", "Open World", 32.99, 96));
        Game.add(new Tools("Bioshock", "fps", 21, 96));
        Game.add(new Tools("Civilization5", "Strategy", 21, 90));
        Game.add(new Tools("BattleGround", "Fps", 14.99));
        Game.add(new Tools("CounterStrike2", "Fps", 14.99));

        return Game;
    }
}

