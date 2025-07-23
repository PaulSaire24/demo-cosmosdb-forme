package com.example.democosmosdb.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Song implements MusicalCompositeService {
    private final List<Note> notes = new ArrayList<>();

    public void addNote(Note note) {
        notes.add(note);
    }

    public List<Note> getNotes() {
        return notes;
    }

    @Override
    public void play() {
        notes.forEach(MusicalCompositeService::play); // ojo aqui usas polimorfismo porque todos los objetos que implementan MusicalCompositeService tienen el metodo play
    }

}