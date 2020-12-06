package pje20.androidapp.app1.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface TodoDao {
    @Insert
    void insert(Todo todo);
    @Delete
    void delete(Todo todo);
    @Query("select * from todo_table")
    LiveData<List<Todo>> getAllTodo();
    @Query("DELETE  from todo_table")
    void deleteAll();


}
