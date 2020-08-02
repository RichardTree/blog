package com.dolszewski.blog;

import com.dolszewski.blog.crossfield.generic.UserSignUpForm;
import com.dolszewski.blog.parametrized.DateRequest;
import com.dolszewski.blog.test.Employee;
import java.sql.Date;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ValidationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ValidationApplication.class, args);


        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        final Validator validator = validatorFactory.getValidator();

//        List<Employee> employees = new ArrayList<>();
//        employees.add(new Employee(20, "Cnt", 23000.00));
//        employees.add(new Employee(80, "JSK", 21000.00));

        Employee employee1 = new Employee(20, "Cnt", 23000.00);
        Employee employee2 = new Employee(80, "JSK", 21000.00);

            Set<ConstraintViolation<Employee>> violations = validator.validate(employee2);




//        final List<Set<ConstraintViolation<Employee>>> collect = employees.stream()
//            .map(employee -> validator.validate(employee)).collect(Collectors.toList());

        System.out.println(violations.size());

        violations.stream().map(e -> e.getMessage()).forEach(e -> System.out.println(e));

        System.out.println(violations);


    }

}
