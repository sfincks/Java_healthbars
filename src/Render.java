import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Render {

    /**
     * ���� ������ �������� ������� ��������, �� ������������ ��������� � ������� ������� ��������.
     * ���� ������ �������� ������� ���������� �������, �� ������������ ��������� � ������� ������� �������.
     * * � �������� ���������, ����� ����� �� ������� = ������ ���������� � �������.
     */
    public void showIndicator(Object object) {
        // �� ������ ���� ���������� ���������� �������!!!
        int curHP = (((healthbar) object).currentHealthPoint());
        int maxHP = (((healthbar) object).maxHealthPoint());
        int curMP = (((manapool) object).currentManaPoint());
        int maxMP = (((manapool) object).maxManaPoint());
//        float percentageOfHP = curHP / maxHP;
//        float percentageOfMP = curMP / maxMP;
        List<String> Hp = new ArrayList<>();
        List<String> Mp = new ArrayList<>();
        if (object instanceof healthbar) {
            for (int i = 0; i < maxHP / 10; i++) {
                if (i < curHP / 10) {
                    Hp.add("#");
                } else {
                    Hp.add(" ");
                }
            }
            System.out.print("[");
            Hp.forEach(System.out::print);
            System.out.println("]");
//            System.out.println(Arrays.toString(Hp.toArray()));

//            System.out.printf("��������: %d / %d%n",
//                    (((healthbar) object).currentHealthPoint()),
//                    (((healthbar) object).maxHealthPoint()));
        }
        if (object instanceof manapool) {
            for (int i = 0; i < maxMP / 10; i++) {
                if (i < curMP / 10) {
                    Mp.add("#");
                } else {
                    Mp.add(" ");
                }
            }
            System.out.print("[");
            Mp.forEach(System.out::print);
            System.out.println("]");
        }
//            System.out.printf("����: %d / %d%n",
//                    (((manapool) object).currentManaPoint()),
//                    (((manapool) object).maxManaPoint()));
    }

}


