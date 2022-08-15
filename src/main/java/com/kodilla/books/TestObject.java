package com.kodilla.books;

import java.util.Objects;

public class TestObject {

    private int id;
    private String name;

    public TestObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestObject that = (TestObject) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "TestObject:" + "id=" + id + ", name='" + name + '\'';
    }
}
