package com.pluralsight.services;

import com.pluralsight.models.Employee;
import com.pluralsight.models.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonService
{

    public List<Person> findPeople(List<Person> people, String name) {
        // search for people by first name
        // return a new List<Person> with the search results
        List<Person> result = new ArrayList<>();
        for (Person person : people)
        {
            if (person.getFirstName().equalsIgnoreCase(name))
            {
                result.add(person);
            }
        }
        return result;
    }

    public List<Person> findPeople(List<Person> people, int age) {
        List<Person> result = new ArrayList<>();
        for (Person person : people)
        {
            if (person.getAge() == age)
            {
                result.add(person);
            }
        }
        return result;
    }

    public int calculateAverageAge(List<Person> people) {
        if (people.isEmpty()) {
            return 0;
        }

        int totalAge = 0;
        for (Person person : people) {
            totalAge += person.getAge();
        }

        return totalAge / people.size();
    }

    public int findOldestAge(List<Person> people) {
        if (people.isEmpty()) {
            return 0;
        }

        int oldestAge = Integer.MIN_VALUE;
        for (Person person : people) {
            if (person.getAge() > oldestAge) {
                oldestAge = person.getAge();
            }
        }

        return oldestAge;
    }

    public int findYoungestAge(List<Person> people) {
        if (people.isEmpty()) {
            return 0;
        }

        int youngestAge = Integer.MAX_VALUE;
        for (Person person : people) {
            if (person.getAge() < youngestAge) {
                youngestAge = person.getAge();
            }
        }

        return youngestAge;
    }

    public List<Person> sortYoungestFirst(List<Person> people) {
        List<Person> sortedList = new ArrayList<>(people);
        Collections.sort(sortedList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p1.getAge(), p2.getAge());
            }
        });
        return sortedList;
    }

    public List<Person> sortOldestFirst(List<Person> people) {
        List<Person> sortedList = new ArrayList<>(people);
        Collections.sort(sortedList, new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p2.getAge(), p1.getAge());
            }
        });
        return sortedList;
    }

    public List<Employee> createEmployees(List<Person> people) {
        List<Employee> employees = new ArrayList<>();
        for (Person person : people) {
            double salary = person.getAge() * 3000;
            Employee employee = new Employee(person.getFirstName(), person.getLastName(), person.getAge(), salary);
            employees.add(employee);
        }
        return employees;
    }
}
