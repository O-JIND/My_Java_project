package Ch04_create_class_package;
import java.util.*;
 class Tools{
    private String Name,Genre;
    private double Price,score;


     Scanner sc = new Scanner(System.in);
     Tools(String Name, String Genre, double Price , double score){
        this.Name = Name;
        this.Genre=Genre;
        this.Price=Price;
        this.score=score;
    }
    public static Tools RandG(){//랜덤하게 뽑아 추천하기
        Random rand = new Random();
        List<Tools> games = Dataset.getGameList();
        int idx = rand.nextInt(games.size());
        return games.get(idx);

    }
     @Override
     public String toString() {
         return String.format("🎮 %s | 장르: %s | 가격: $%.2f | 평점: %.2f점", Name, Genre, Price, score);
     }

}
public class Game_recommend{
    public static void main(String[] args) {
        List<Tools> games = Dataset.getGameList();
        for (Tools G : games){
            System.out.println(G);
        }
        Tools pick = Tools.RandG();
        System.out.print("recommend : ");
        System.out.println(pick);
    }
}