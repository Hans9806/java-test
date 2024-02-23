package test.test6;

public class Test6 {
    public static void main(String[] args) {
        GameCharacter admin1 = new GameCharacter("전사",15,100);
        GameCharacter admin2 = new GameCharacter("마법사",40,200);

        admin1.attack();
        admin2.takeDamage(10);

        admin2.attack();
        admin1.takeDamage(20);
    }
}
