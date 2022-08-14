package com.epam.rd.autotasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Average {
    private static int average(List<Integer> numbers) {
        return (int) numbers.stream()
                .mapToInt(s -> s)
                .average()
                .orElse(0);

    }
    public static void main(String[] args) {
        List <Integer> list = new ArrayList();

        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        while (numb != 0)
        {
            list.add(numb);
            numb = scanner.nextInt();
        }
        System.out.println(average(list));
    }

}