package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NoteTest {

    @Test
    public void ensureANoteHasATitle() {
        // Arrange
        String expectedTitle = "Note1";
        // Act
        Note note = new Note(expectedTitle, "");
        String title = note.getTitle();
        // Assertion
        assertEquals(expectedTitle, title);
    }

    @Test
    public void ensureANoteHasABody() {
        // Arrange
        String expectedBody = "This is a reminder so I do not forget to do some TDD coding";
        // Act
        Note note = new Note("", expectedBody);
        String body = note.getBody();
        // Assertion
        assertEquals(expectedBody, body);

    }

}
