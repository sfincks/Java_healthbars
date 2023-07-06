class Render {

    /**
     * ���� ������ �������� ������� ��������, �� ������������ ��������� � ������� ������� ��������.
     * ���� ������ �������� ������� ���������� �������, �� ������������ ��������� � ������� ������� �������.
     * * � �������� ���������, ����� ����� �� ������� = ������ ���������� � �������.
     */
     public void showIndicator(Object object) {
        // �� ������ ���� ���������� ���������� �������!!!
        if (object instanceof healthbar) {
            System.out.printf("��������: %d / %d%n",
                    (((healthbar) object).currentHealthPoint()),
                    (((healthbar) object).maxHealthPoint()));
        }
        if (object instanceof manapool) {
            System.out.printf("����: %d / %d%n",
                    (((manapool) object).currentManaPoint()),
                    (((manapool) object).maxManaPoint()));
        }

    }


}