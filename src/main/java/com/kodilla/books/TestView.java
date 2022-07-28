package com.kodilla.books;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route(value = "test", layout = MainLayout.class)
public class TestView extends VerticalLayout { // ta klasa to piaskownica, nie było tego na kursie

    private final VerticalLayout box = new VerticalLayout();
    private final Button button = new Button("modify text");
    private final Label lab = new Label();

    public TestView() {
        lab.setText("default text");
        button.addClickListener(event -> lab.setText("the text has been modified"));
        box.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        box.add(lab, button);
        add(box);
    }
}
