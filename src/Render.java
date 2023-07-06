class Render {

    /**
     * Если объект обладает уровнем здоровья, то отображается индикатор с текущим уровнем здоровья.
     * Если объект обладает уровнем магический энергии, то отображается индикатор с текущим уровнем энергии.
     * * В качестве упрощения, пусть вывод на дисплей = запись информации в консоль.
     */
     public void showIndicator(Object object) {
        // Не должно быть упоминания конкретных классов!!!
        if (object instanceof healthbar) {
            System.out.printf("Здоровье: %d / %d%n",
                    (((healthbar) object).currentHealthPoint()),
                    (((healthbar) object).maxHealthPoint()));
        }
        if (object instanceof manapool) {
            System.out.printf("Мана: %d / %d%n",
                    (((manapool) object).currentManaPoint()),
                    (((manapool) object).maxManaPoint()));
        }

    }


}