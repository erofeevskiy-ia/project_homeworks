package com.epam.javacore.homework.hw2.task_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotebookTest {

    private Recording notebook = new Notebook(500, "NotebookABC");

    @Test
    void testRecordInYourself() {
        assertEquals(true, notebook.recordInYourself("my first node"));
        assertEquals(false, notebook.recordInYourself(null));
    }

}