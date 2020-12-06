package pje20.androidapp.app1.model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import java.util.List;
import java.util.ArrayList;

public class TodoDataHolder {
	
	
	private List<Todo> mTodo = new ArrayList<Todo>();
	
	private static TodoDataHolder holder = new TodoDataHolder();
	public static TodoDataHolder getInstance() { return holder; }
	
	public MutableLiveData<List<Todo>> getAllTodo() {
		MutableLiveData<List<Todo>> todoListLiveData = new MutableLiveData<List<Todo>>();
		for (int i = 1; i < 13 ; i++) {
            mTodo.add(new Todo(i+"/"+i+"/2020","title"+i,"this is the "+i+"content","author"+i));
        }
		todoListLiveData.setValue(mTodo);
		return todoListLiveData;

	}
	
	public void addTodo(String title
	, String author
	, String date
	, String content
	, MutableLiveData<List<Todo>> mutableLiveData) {
		mTodo.add(new Todo(title
		, author
		, date
		, content
		));
		mutableLiveData.setValue(mTodo);
	}
	
	public void removeTodo(int position, MutableLiveData<List<Todo>> mutableLiveData) {
		mTodo.remove(position);
		mutableLiveData.setValue(mTodo);
	}
}	
