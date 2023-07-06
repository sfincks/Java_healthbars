public class Main {
    public static void main(String[] args) {
        Render render = new Render();

        Building building = new Building(100);
        building.setCurrentHealthPoint(50);

        Hero hero = new Hero(100,100);
        hero.setCurrentHealthPoint(70);
        hero.setCurrentManaPoint(30);

        Neutral neutral = new Neutral(100);
        neutral.setCurrentHealthPoint(20);

        render.showIndicator(building);
        System.out.println();// ¬ консоли должно быть примерно так: “екущий уровень здоровь€: 50, максимальный уровень здоровь€: 100
        render.showIndicator(hero);
        System.out.println();
        render.showIndicator(neutral);

//        System.out.println(Homework.ANSI_RED + "This text has a red background but default text!" + Homework.ANSI_RESET);
//        System.out.println(Homework.ANSI_GREEN + "This text has a green background but default text!" + Homework.ANSI_RESET);

    }
}