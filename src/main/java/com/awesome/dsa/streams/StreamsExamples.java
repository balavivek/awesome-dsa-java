package com.awesome.dsa.streams;

import com.awesome.dsa.data.DataProducer;
import com.awesome.dsa.data.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsExamples {

    public static void main(String[] args) {
        findEvenAndOdd();
        findstartWithOne();
        findDuplicates();
        findFirst();
        convertMapToList();
        groupListBasedOnValue();
        removeDuplicatesFromList();
        findSecondLargest();
        findOccurrence();
        findMaxOcurrence();
    }

    public static void findEvenAndOdd() {
        List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32);

        List<Integer> evenNumbers = numbers.stream()
                .filter(elm -> elm % 2 == 0)
                .toList();
        System.out.println("evenNumbers: "+evenNumbers);

        List<Integer> oddNumbers = numbers.stream()
                .filter(elm -> elm % 2 != 0)
                .toList();
        System.out.println("oddNumbers: "+oddNumbers);

    }

    public static void findstartWithOne() {
        List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        List<Integer> numbersStartWithOne = numbers.stream()
                .map(Object::toString)
                .filter(elm -> elm.startsWith("1"))
                .map(Integer::valueOf)
                .toList();
        System.out.println("start With One : "+numbersStartWithOne);

    }

    public static void findDuplicates(){

        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);

        Set<Integer> uniqueNumber = new HashSet<>();

        // numbers.stream().distinct().toList();

        List<Integer> duplicateNumbers = numbers.stream()
                .filter(i -> !uniqueNumber.add(i))
                .toList();

        System.out.println("duplicateNumbers : "+duplicateNumbers);
    }


    public static void findFirst() {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Optional<Integer> first = myList.stream()
                .findFirst();
        if(first.isPresent()){
            System.out.println("first element : "+first.get());
        }

    }

    public static void convertMapToList(){
        // find the employees who earn more than 1L and convert to list

        Map<String, Double> empSalaryMap = DataProducer.getEmpSalaryMap();
        System.out.println("empSalaryMap: "+empSalaryMap);

        List<String> empNames = DataProducer.getEmpSalaryMap().entrySet().stream()
                .filter(e -> e.getValue() >= 100000)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("empNames : "+empNames);
    }

    public static void groupListBasedOnValue(){
        List<Employee> employees = DataProducer.getEmployees();
        Map<String, Long> deptCount = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("deptCount : "+deptCount);
    }

    public static void removeDuplicatesFromList(){
        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> uniqueNumbers = numbers.stream().collect(Collectors.toSet());
        System.out.println("uniqueNumbers: "+uniqueNumbers);
    }

    public static void findMaxOcurrence(){
        List<String> strings = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        strings.stream().collect(Collectors.groupingBy(s-> s, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println(strings);

    }

    public static void findOccurrence(){
        List<String> strings = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> countMap = strings.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        System.out.println("findOccurrence: "+countMap);

    }

    public static void findSecondLargest(){
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);

        Optional<Integer> secondLargestOptional = myList.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst();


        if(secondLargestOptional.isPresent()){
            System.out.println("findSecondLargest: "+secondLargestOptional.get());
        }
    }


}
