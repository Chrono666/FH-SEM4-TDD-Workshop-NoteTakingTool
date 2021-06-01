package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


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
        Note note = new Note("title", expectedBody);
        String body = note.getBody();
        // Assertion
        assertEquals(expectedBody, body);

    }

    @Test
    public void ensureCreatedNoteHasTitleAndBody() {
        // Arrange
        String expectedTitle = "TDD";
        String expectedBody = "TDD is fun";

        // Act
        Note newNote = new Note(expectedTitle, expectedBody);
        String title = newNote.getTitle();
        String body = newNote.getBody();

        // Assertion
        assertEquals(expectedTitle, title);
        assertEquals(expectedBody, body);
    }

    @Test
    public void ensureIfNoteWithEmptyTitleIsCreatedAExceptionIsThrown() {
        //Act & Assertion
        assertThrows(IllegalStateException.class, ()->{
            new Note("","This note has not title");
        });
    }


}
