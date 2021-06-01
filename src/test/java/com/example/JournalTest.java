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

    @Test
    public void ensureIfMultipleNotesAreAddedTheyAreInTheJournal() {
        //Arrange
        Journal journal = new Journal();
        Note note1 = new Note("Title of note 1", "body of note 1");
        Note note2 = new Note("Title of note 1", "body of note 1");
        Note note3 = new Note("Title of note 1", "body of note 1");
        Note note4 = new Note("Title of note 1", "body of note 1");
        // Act
        journal.addNoteToJournal(note1);
        journal.addNoteToJournal(note2);
        journal.addNoteToJournal(note3);
        journal.addNoteToJournal(note4);
        Note note1InJournal = journal.getNoteList().get(0);
        Note note2InJournal = journal.getNoteList().get(1);
        Note note3InJournal = journal.getNoteList().get(2);
        Note note4InJournal = journal.getNoteList().get(3);
        // Assert
        assertEquals(note1, note1InJournal);
        assertEquals(note2, note2InJournal);
        assertEquals(note3, note3InJournal);
        assertEquals(note4, note4InJournal);
    }


}
