package com.example.object.study.samplecode.chapter07;

import java.util.List;

public class Menu {

    private List<MenuItem> items;

    public Menu(List<MenuItem> items) {
        this.items = items;
    }

    public MenuItem choose(String name) {
        return items.stream()
                .filter(i -> i.getName().equals(name))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }

}
