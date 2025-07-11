import java.util.ArrayList;

public class GameMaster {
    public static void main(String[] args){
        ArrayList<Character> party =new ArrayList<>();
        Hero hero = new Hero("タケシ",100,"タケシソード");
        Wizard wizard = new Wizard("シュンヤ" ,10,2000);
        Thief thief = new Thief("コウスケ", 80);
        party.add(hero);
        party.add(wizard);
        party.add(thief);

        ArrayList<Monster> monsters =new ArrayList<>();
        Matango m = new Matango("お化けキノコ",'A', 60);
        Goblin g = new Goblin("ゴブリン",'B',80);
        Slime s = new Slime("スライム",'C',50);
        monsters.add(m);
        monsters.add(g);
        monsters.add(s);

        hero.showStatus();
        wizard.showStatus();
        thief.showStatus();
        m.showStatus();
        g.showStatus();
        s.showStatus();


    }
}
