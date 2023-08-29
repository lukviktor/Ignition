package com.inductiveautomation.perspective.configuration.page;

public class Page {
    private void add() {
        System.out.println("Add (Добавить) —  создает новую конфигурацию страницы.");
    }

    private void trash() {
        System.out.println("Trash (Корзина ) —  удаляет выбранную конфигурацию страницы.");
    }
    public void page() {
        Page page = new Page();
        page.add();
        page.trash();
    }
}
