class Building implements healthbar {

    private int maxHealthPoint; // максимально количество здоровья
    private int currentHealthPoint; // текущее количество здоровья

    public Building(int maxHealthPoint) {
        this.maxHealthPoint = maxHealthPoint;
        this.currentHealthPoint = maxHealthPoint;
    }

    public void setCurrentHealthPoint(int currentHealthPoint) {
        this.currentHealthPoint = currentHealthPoint;
    }

    @Override
    public int currentHealthPoint() {
        return currentHealthPoint;
    }

    @Override
    public int maxHealthPoint() {
        return maxHealthPoint;
    }


    // FIXME: 29.06.2023 Дописать нужное
}