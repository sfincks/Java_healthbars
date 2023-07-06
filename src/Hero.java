class Hero implements healthbar, manapool {

    private int maxHealthPoint; // ����������� ���������� ��������
    private int currentHealthPoint; // ������� ���������� ��������

    private int maxManaPoint; // ����������� ���������� ���������� �������
    private int currentManaPoint; // ������� ���������� ���������� �������

    public Hero(int maxHealthPoint, int maxManaPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.maxManaPoint = maxManaPoint;

        this.currentHealthPoint = maxHealthPoint;
        this.currentManaPoint = maxManaPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    public void setCurrentManaPoint(int currentManaPoint) {
        this.currentManaPoint = currentManaPoint;
    }

    @Override
    public int currentHealthPoint() {
        return currentHealthPoint;
    }

    @Override
    public int maxHealthPoint() {
        return maxHealthPoint;
    }

    @Override
    public int maxManaPoint() {
        return maxManaPoint;
    }

    @Override
    public int currentManaPoint() {
        return currentManaPoint;
    }


    // FIXME: 29.06.2023 �������� ������
}