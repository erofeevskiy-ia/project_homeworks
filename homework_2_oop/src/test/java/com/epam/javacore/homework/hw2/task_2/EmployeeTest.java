package com.epam.javacore.homework.hw2.task_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    private Employee employee = new Employee();

    @Test
    void testAddStationery() {
        assertEquals(true,employee.addStationery(new Pencil(123)));
        assertEquals(false,employee.addStationery(null));
    }


}