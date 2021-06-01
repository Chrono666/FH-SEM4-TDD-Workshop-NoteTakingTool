package com.example;

public class Journal {

    public Note createNote(String title, String body) {
        if (title.equals("")) {
            throw new IllegalStateException();
        } else {
            return new Note(title, body);
        }
    }
}
