public class DuckTest {
    public static void main(String[] args) {
        MallarDuck duck = new MallarDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The turkey say ....");
        turkey.gobble();
        turkey.fly();

        System.out.println("The duck say ....");
        duck.fly();
        duck.quack();

        System.out.println("The turkeyadapter say ....");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
        
    }
}
