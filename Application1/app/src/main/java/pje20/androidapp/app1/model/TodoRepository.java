package pje20.androidapp.app1.model;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

public class TodoRepository {
    private TodoDao mDao;
    private LiveData<List<Todo>> mAllTodo;
    private TodoDatabase db;

    public TodoRepository(Application application) {
        db = TodoDatabase.getDatabase(application);
        mDao = db.todoDao();
        mAllTodo = mDao.getAllTodo();
    }
    public LiveData<List<Todo>> getAllTOdo(){
        return mAllTodo;
    }
    public  void insertTodo(Todo todo){
        db.todoDatabaseWriteExecutor.execute( () -> { mDao.insert(todo);} );
    }

   // public void deleteTodo()
}
