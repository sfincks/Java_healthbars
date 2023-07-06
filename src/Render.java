import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Render {

    /**
     * Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
     * Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
     */
    public void showIndicator(Object object) {
        // Не должно быть упоминания конкретных классов!!!
        String indicator = "#";
//        float percentageOfHP = curHP / maxHP;
//        float percentageOfMP = curMP / maxMP;
        List<String> Hp = new ArrayList<>();
        List<String> Mp = new ArrayList<>();
        if (object instanceof healthbar) {
            int curHP = (((healthbar) object).currentHealthPoint());
            int maxHP = (((healthbar) object).maxHealthPoint());

            if (curHP <= maxHP / 10 * 3) {
                indicator = Homework.ANSI_RED + "#" + Homework.ANSI_RESET;
            } else if (curHP <= maxHP / 10 * 6) {
                indicator = Homework.ANSI_YELLOW + "#" + Homework.ANSI_RESET;
            } else {
                indicator = Homework.ANSI_GREEN + "#" + Homework.ANSI_RESET;
            }
            for (int i = 0; i < maxHP / 10; i++) {
                if (i < curHP / 10) {
                    Hp.add(indicator);
                } else {
                    Hp.add(" ");
                }
            }
            System.out.print("[");
            Hp.forEach(System.out::print);
            System.out.println("]");
//            System.out.println(Arrays.toString(Hp.toArray()));

//            System.out.printf("Здоровье: %d / %d%n",
//                    (((healthbar) object).currentHealthPoint()),
//                    (((healthbar) object).maxHealthPoint()));
        }
        if (object instanceof manapool) {
            int curMP = (((manapool) object).currentManaPoint());
            int maxMP = (((manapool) object).maxManaPoint());
            indicator = Homework.ANSI_RESET + "#";
            if (curMP <= maxMP / 10 * 3) {
                indicator = Homework.ANSI_PURPLE + "#" + Homework.ANSI_RESET;
            } else if (curMP <= maxMP / 10 * 6) {
                indicator = Homework.ANSI_CYAN + "#" + Homework.ANSI_RESET;
            } else {
                indicator = Homework.ANSI_BLUE + "#" + Homework.ANSI_RESET;
            }
            for (int i = 0; i < maxMP / 10; i++) {
                if (i < curMP / 10) {
                    Mp.add(indicator);
                } else {
                    Mp.add(" ");
                }
            }
            System.out.print("[");
            Mp.forEach(System.out::print);
            System.out.println("]");
        }
//            System.out.printf("Мана: %d / %d%n",
//                    (((manapool) object).currentManaPoint()),
//                    (((manapool) object).maxManaPoint()));
    }
/**
 *  indicator перезаписывается для отображения маны перезапись не происходит параллельно
 */
}


