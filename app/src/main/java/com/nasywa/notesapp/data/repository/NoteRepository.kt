package com.nasywa.notesapp.data.repository

import androidx.lifecycle.LiveData
import com.nasywa.notesapp.data.model.NoteDao
import com.nasywa.notesapp.data.model.NoteData

class NoteRepository(private val noteDao: NoteDao) {

    val getAllData : LiveData<List<NoteData>> = noteDao.getDataAll()
    val sortByHighPriority : LiveData<List<NoteData>> = noteDao.sortByHighPriority()
    val sortByLowPriority : LiveData<List<NoteData>> = noteDao.sortByLowPriority()

    fun insertData(noteData: NoteData){
        noteDao.insertData(noteData)
    }

    fun updateData(noteData: NoteData){
        noteDao.deleteData(noteData)
    }

    fun deleteData(noteData : NoteData){
        noteDao.deleteData(noteData)
    }

    fun deleteAllData(){
        noteDao.deleteAllData()
    }

    fun searchData(searchQuery : String) : LiveData<List<NoteData>>{
        return noteDao.searchDataBase(searchQuery)
    }
}