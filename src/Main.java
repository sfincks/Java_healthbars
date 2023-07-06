public class Main {
    public static void main(String[] args) {
        Render render = new Render();

//        Building building = new Building(100);
//        building.setCurrentHealthPoint(50);
        Hero hero = new Hero(100,100);
        hero.setCurrentHealthPoint(70);
        hero.setCurrentManaPoint(70);

        render.showIndicator(hero); // ¬ консоли должно быть примерно так: “екущий уровень здоровь€: 50, максимальный уровень здоровь€: 100

//        System.out.println(Homework.ANSI_RED + "This text has a red background but default text!" + Homework.ANSI_RESET);
//        System.out.println(Homework.ANSI_GREEN + "This text has a green background but default text!" + Homework.ANSI_RESET);

    }
}