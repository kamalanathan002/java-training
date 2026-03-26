class Game{
    String name;
    Game(String name)
    {
        this.name=name;
    }
    void attack()
    {
        System.out.println("Attack the castal");
    }
}
class warrior extends Game
{
    warrior(String name)
    {
        super(name);
    }
    void attack()
    {
        System.out.println(name+" attack with sword");
    }
}
class archer extends Game
{
    archer(String name)
    {
        super(name);
    }
    void attack()
    {
        System.out.println(name+" attack with arrow");
    }
}
class mege extends Game
{
    mege(String name)
    {
        super(name);
    }
    void attack()
    {
        System.out.println(name+" attack with magic");
    }
}
public class MiniGame {
    public static void main(String[] args) {
        Game g;
        g=new warrior("kamal");
        g.attack();
        g=new archer("Nathan");
        g.attack();
        g=new mege("Faith");
        g.attack();
    }
}
