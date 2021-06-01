package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NoteTest {

    @Test
    public void ensureANoteHasATitle() {
        // Arrange
        String expectedTitle = "Note1";
        // Act
        Note note = new Note(expectedTitle);
        String title = note.getTitle();
        // Assertion
        assertEquals(expectedTitle, title);
    }
}
