package com.kodilla.books;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value = "test2", layout = MainLayout.class)
public class TestView2 extends VerticalLayout {

    private Repo repo;
    private final Label label = new Label();

    public TestView2(Repo repo) {
        this.repo = repo;
        VerticalLayout box = new VerticalLayout();
        Button button2 = new Button("check field");
        label.setText("default text on page 2");
        box.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        button2.addClickListener(event -> label.setText(repo.getTestObject().toString()));
        box.add(label, button2);
        add(box);
    }

    public void performTest2(TestObject ob) {
        repo.setTestObject(ob);
        UI.getCurrent().navigate("test2");
        System.out.println(ob);
        label.setText(ob.toString());
    }
}
