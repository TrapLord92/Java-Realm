package com.traplord.generics.generic_class;

public class GenericClass<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "GenericClass{" +
                "t=" + t +
                '}';
    }
}
