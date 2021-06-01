package com.example;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    private List<Note> noteList;

    public Journal() {
        noteList = new ArrayList<>();
    }

    public Note createNote(String title, String body) {
        if (title.equals("")) {
            throw new IllegalStateException();
        } else {
            return new Note(title, body);
        }
    }

    public List<Note> addNoteToJournal(Note note) {
        noteList.add(note);
        return noteList;
    }
}
