package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    public void ensureIfNoteWithEmptyTitleIsCreatedAExceptionIsThrown() {
        // Arrange
        Journal journal = new Journal();
        //Act & Assertion
        assertThrows(IllegalStateException.class, ()->{
            journal.createNote("", "This note has no title");
        });
    }


}
