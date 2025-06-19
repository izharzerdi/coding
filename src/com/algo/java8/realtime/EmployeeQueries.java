package com.algo.java8.realtime;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeQueries {
    public static void main(String[] args) {
        List<Employee> employees = Employee.getEmployees();
        noOfMaleAndFemaleEmployees(employees);
        printDeptName(employees);
        avgAgeOfMaleAndFemale(employees);
        highestPaidEmployee(employees);
        filterEmployees(employees);
        noOfEmployeesInEachDept(employees);
        averageSalaryOfEachDept(employees);
        youngestMaleEmployeeInDept(employees, "Product Development");
        mostWorkExperience(employees);
        maleAndFemaleEmployees(employees);

    }

    private static void maleAndFemaleEmployees(List<Employee> employees) {
        Map<String, Long> maleFemaleMap = employees.stream().filter(employee -> employee.getDepartment().equals("Sales And Marketing")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(maleFemaleMap);
    }

    private static void mostWorkExperience(List<Employee> employees) {
        Optional<Employee> first = employees.stream().sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst();
        System.out.println(first.get().name);
    }

    private static void youngestMaleEmployeeInDept(List<Employee> employees, String productDevelopment) {
        Optional<Employee> youngEmployee = employees.stream().filter(employee -> employee.getGender().equals("Male") && employee.getDepartment().equals(productDevelopment))
                .min(Comparator.comparing(Employee::getAge));
        System.out.println(youngEmployee.get().id + ":" + youngEmployee.get().name);
    }

    private static void averageSalaryOfEachDept(List<Employee> employees) {
        Map<String, Double> averageSalaryOfEachDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(averageSalaryOfEachDept);

    }

    private static void noOfEmployeesInEachDept(List<Employee> employees) {
        Map<String, Long> noOfEmployeesInEachDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(noOfEmployeesInEachDept);

    }

    private static void filterEmployees(List<Employee> employees) {
        employees.stream().filter(employee -> employee.yearOfJoining > 2015).map(Employee::getName).forEach(System.out::println);
    }

    private static void highestPaidEmployee(List<Employee> employees) {
        Optional<Employee> employee = employees.stream().max(Comparator.comparingDouble(Employee::getSalary));
        System.out.println(employee.get().name);

    }

    private static void avgAgeOfMaleAndFemale(List<Employee> employees) {
        Map<String, Double> avgAgeMap = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAgeMap);

    }

    private static void printDeptName(List<Employee> employees) {
        employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
    }

    private static void noOfMaleAndFemaleEmployees(List<Employee> employees) {
        Map<String, Long> employeesRatio = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(employeesRatio);
    }
}
