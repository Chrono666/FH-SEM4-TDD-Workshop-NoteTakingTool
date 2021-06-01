package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JournalTest {

    @Test
    public void ensureCreatedNoteHasTitleAndBody() {
        // Arrange
        Journal journal = new Journal();
        String expectedTitle = "TDD";
        String expectedBody = "TDD is fun";

        // Act
        Note newNote = journal.createNote(expectedTitle, expectedBody);
        String title = newNote.getTitle();
        String body = newNote.getBody();

        // Assertion
        assertEquals(expectedTitle, title);
        assertEquals(expectedBody, body);
    }

}
