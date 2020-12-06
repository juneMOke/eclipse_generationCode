package pje20.androidapp.app1.model;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import java.util.List;

public class TodoViewModel extends AndroidViewModel {
	
	private LiveData<List<Todo>> mAllTodo;
	private TodoRepository mTodoRepository;

	public TodoViewModel(Application application) {
		super(application);
		mTodoRepository = new TodoRepository(application);
		mAllTodo = mTodoRepository.getAllTOdo();

	}


	/*public MutableLiveData<List<Todo>> getTodoLiveData() {
		return mTodoLiveData;
	}*/


	public LiveData<List<Todo>> getAllTodo() {
        return mAllTodo;
	}
	
	public void addTodo(Todo todo) {
		mTodoRepository.insertTodo(todo);
	}
	
	/*public void removeTodo(int position) {
		TodoDataHolder.getInstance().removeTodo(position, mAllTodo);
	}*/
}

