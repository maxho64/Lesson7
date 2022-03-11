package com.company.test;

public class Registr {
    Document[] documents = new Document[10];
    int i = 0;

    public void save(Document document) {
        if (i >= 10) {
            System.out.println("Register is full");
            return;
        }
        System.out.println("I save: ");
        document.print();
        documents[i] = document;
        i++;
    }

    public void print() {
        for (int j = 0; j < i; j++) {
            documents[j].print();
        }
    }
}
