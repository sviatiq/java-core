package lesson3.inheritance;

public class Wolf extends WildAnimal{
    private int favoriteFood;

    public Wolf(int favoriteFood, int numOfEyes, String classification) {
        super(numOfEyes, classification);
        this.favoriteFood = favoriteFood;
    }

    public int getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(int favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    @Override
    void showInfo() {
        System.out.println("This is wolf. He's favorite food is "+ favoriteFood);
    }

    void reactionOnMoon(){
        System.out.println("awwwwwwwwww");
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "favoriteFood=" + favoriteFood +
                '}';
    }
}
