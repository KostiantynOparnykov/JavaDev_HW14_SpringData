package com.example.JavaDev_HW14_SpringData.noteprocessor.service;

import com.example.JavaDev_HW14_SpringData.noteprocessor.entities.Note;
import com.example.JavaDev_HW14_SpringData.noteprocessor.exceptions.NoteProcessingExceptions;

import java.util.List;

public interface NoteServiceInterface {
    List<Note> listAll();
    Note add(Note note) throws NoteProcessingExceptions;
    void deleteById(Long id) throws NoteProcessingExceptions;
    void update(Note note) throws NoteProcessingExceptions;
    Note getById(Long id) throws NoteProcessingExceptions;
}
