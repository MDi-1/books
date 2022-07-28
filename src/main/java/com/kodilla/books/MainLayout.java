package com.kodilla.books;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.HighlightConditions;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;

@Route("")
public class MainLayout extends AppLayout { // ta klasa to piaskownica, nie było tego na kursie

    public MainLayout() {
        RouterLink oldPage = new RouterLink("kodilla", MainView.class);
        oldPage.setHighlightCondition(HighlightConditions.sameLocation());
        RouterLink testPage = new RouterLink("test", TestView.class);
        addToDrawer(new VerticalLayout(oldPage, testPage));
    }
}
