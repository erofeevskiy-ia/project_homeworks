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

    @Test
    void testGetCostStationary() {
        employee.addStationery(new Pencil(123));
        employee.addStationery(new Pencil(123));
        assertNotEquals(123, employee.getCostStationary());
        assertEquals(246, employee.getCostStationary());
    }
}