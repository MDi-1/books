package com.kodilla.books;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;


@Route(value = "test", layout = MainLayout.class)
public class TestView extends VerticalLayout { // ta klasa to piaskownica, nie było tego na kursie

    private Repo repo = new Repo();
    private TestView2 view2;
    private final VerticalLayout box = new VerticalLayout();
    private final Button button = new Button("modify text");
    private final Label lab = new Label();
    private final Button btn2 = new Button("go to second test");
    private final Button setButton = new Button("set to repo");
    private final Button checkBtn = new Button("check field");

    public TestView() {
        createSomeContent();
        view2 = new TestView2(repo);
    }

    public void createSomeContent() {
        TestObject ob = new TestObject(1, "test name");
        lab.setText("default text");
        button.addClickListener(event -> lab.setText("the text has been modified"));
        btn2.addClickListener(event -> view2.performTest2(ob));
        setButton.addClickListener(e-> repo.setTestObject(ob));
        checkBtn.addClickListener(e -> lab.setText(repo.getTestObject().toString()));
        box.setDefaultHorizontalComponentAlignment(Alignment.CENTER);
        box.add(lab, button, btn2, setButton, checkBtn);
        add(box);
    }
}
