package com.example.JavaDev_HW14_SpringData.noteprocessor.repository;

import com.example.JavaDev_HW14_SpringData.noteprocessor.entities.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
