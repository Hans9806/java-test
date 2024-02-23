package test.test6;

public class GameCharacter {
    String name;
    int level;
    int health;

    public GameCharacter(String name, int level, int health) {
        this.name = name;
        this.level = level;
        this.health = health;
    }
    public void attack() {
        System.out.println(name+"의 공격!");
    }
    public int takeDamage(int damage) {
        this.health -= damage;
        System.out.println(name+"는 "+damage+"의 피해를 입었습니다. \n 체력이"+health+" 남았습니다.");
        return damage;
    }
}
