package com.pluralsight.collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.items = new ArrayList<>();
        this.maxSize = maxSize;
    }

    public void add(T item) throws Exception {
        if (items.size() >= maxSize) {
            throw new Exception("Cannot add more items, list is full.");
        }
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }

    public static void main(String[] args) {
        try {
            FixedList<Integer> numbers = new FixedList<>(3);
            numbers.add(10);
            numbers.add(3);
            numbers.add(92);
            // This line should fail
            numbers.add(43);

            System.out.println("Numbers list size: " + numbers.getItems().size());

            FixedList<LocalDate> dates = new FixedList<>(2);
            dates.add(LocalDate.now());
            dates.add(LocalDate.now());
            // This line should fail
            dates.add(LocalDate.of(2022, 1, 1));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
