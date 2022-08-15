package com.kodilla.books;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class Repo {

    private TestObject testObject;

    public TestObject getTestObject() {
        return testObject;
    }

    public void setTestObject(TestObject testObject) {
        this.testObject = testObject;
    }
}
