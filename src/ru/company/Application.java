package ru.company;

import ru.company.entity.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;


public class Application {

    Encyclopedia encyclopedia = new Encyclopedia(354, "Дарвин", "Энциклопедия животных", 2015, "АСТ", 560, true, 1490, "Дом книги", true);
    Guide guide = new Guide(124, "Петров", "Телефонный справочник", 2020, "ОКБМ", "Русский", "телефоны 65 отдела", false, false, 0);
    Surgeon surgeon = new Surgeon("Дмитрий", "больница", 9, "НИЖГМА", false);
    NeuroSurgeon neuroSurgeon = new NeuroSurgeon("Василий", "поликлиника", 13, "НИЖГМА", true, "институт нейрохирургов", 9, "мужчина", "высшая", 45000);
    Model model = new Model("Mi9", "Петр", true, "Китай", "typeC", 6, 230, 23000, Color.BLACK, true);

    public void getEntity () {
        List<Object> list = new ArrayList<>();
        list.add(encyclopedia);
        list.add(guide);
        list.add(surgeon);
        list.add(neuroSurgeon);
        list.add(model);

        for(Object entity : list) {
            System.out.println(entity);
        }
    }

}
