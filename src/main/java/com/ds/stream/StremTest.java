package com.ds.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StremTest {

    public static void main(String[] args) {
//        Comparator<Person> compAge=(p1,p2)->
//            Integer.compare(p1.getAge(),p2.getAge());
//
//        Comparator<Person> compFirstName=(p1,p2)->
//                p1.getFirstName().compareTo(p2.getFirstName());
//        Comparator<Person> compLatName=(p1,p2)->
//                p1.getLastName().compareTo(p2.getLastName());
//
//
//        System.out.println(Collections.sort());

    }

    public static List<Person> getPersons() {
        return List.of(
                new Person( 25, Gender.MALE),
                new Person( 26, Gender.MALE),
                new Person( 26, Gender.MALE),
                new Person( 25, Gender.FEMALE),
                new Person( 25, Gender.FEMALE)
        );
    }
}
