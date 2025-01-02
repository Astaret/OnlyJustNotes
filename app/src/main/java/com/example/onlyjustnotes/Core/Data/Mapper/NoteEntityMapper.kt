package com.example.onlyjustnotes.Core.Data.Mapper

import com.example.onlyjustnotes.Core.Data.Source.Local.Model.NoteEntity
import com.example.onlyjustnotes.Core.Domain.Model.Note

fun NoteEntity.toNote() = Note(id, title, description)
fun Note.toNoteEntity() = NoteEntity(id, tittle, description)