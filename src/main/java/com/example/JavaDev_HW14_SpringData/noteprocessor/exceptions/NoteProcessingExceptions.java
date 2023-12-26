package com.example.JavaDev_HW14_SpringData.noteprocessor.exceptions;

public class NoteProcessingExceptions extends Exception{
    public NoteProcessingExceptions(Long id){
        super("Note not found " + id );
    }
    public NoteProcessingExceptions(){
        super("Note not found ");
    }
}
