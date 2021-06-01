package com.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class JournalTest {


    @Test
    public void ensureACreatedNoteIsAddedToAJournal(){
        // Arrange
        Journal journal = new Journal();
        String expectedTitle = "TDD";
        String expectedBody = "TDD is fun";
        Note newNote = new Note(expectedTitle, expectedBody);

        // Act
        List<Note> noteList = journal.addNoteToJournal(newNote);
        boolean noteAddedToJournal = noteList.contains(newNote);

        // Assert
        assertTrue(noteAddedToJournal);
    }



}
