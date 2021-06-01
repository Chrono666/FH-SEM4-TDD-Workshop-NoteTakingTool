package com.example;

public class Journal {

    public Note createNote(String title, String body) {
        return new Note(title, body);
    }
}
