package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    public void ensureACreatedNoteIsAddedToAJournal(){
        // Arrange
        Journal journal = new Journal();
        String expectedTitle = "TDD";
        String expectedBody = "TDD is fun";
        Note newNote = journal.createNote(expectedTitle, expectedBody);

        // Act
        List<Note> noteList = journal.addNoteToJournal(newNote);
        boolean noteAddedToJournal = noteList.contains(newNote);

        // Assert
        assertTrue(noteAddedToJournal);

    }


}
