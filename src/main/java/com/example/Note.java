package com.example;

public class Note {
    private final String title;
    private final String body;

    Note(String title, String body) {
        if (title.equals("")) {
            throw new IllegalStateException();
        } else {
            this.title = title;
        }
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }
}
