package com.kodilla.books;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.HighlightConditions;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route("")
public class MainLayout extends AppLayout { // ta klasa to piaskownica, nie było tego na kursie
            // wszystkie inne klasy zaczynające się na każdą literę po literze M to piaskownica
    public MainLayout() {
        RouterLink oldPage = new RouterLink("kodilla", MainView.class);
        oldPage.setHighlightCondition(HighlightConditions.sameLocation());
        RouterLink testPage = new RouterLink("test", TestView.class);
        RouterLink testPage2 = new RouterLink("test2", TestView2.class);
        addToDrawer(new VerticalLayout(oldPage, testPage, testPage2));
    }
}
