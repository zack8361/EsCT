package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class ex01 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("apple");
        list.add("kong");
        list.add("fruits");
        list.add("banana");

        List<String> collections = list.stream()
                .map(String::toUpperCase).collect(toList());
        System.out.println("collections = " + collections);
    }
}
