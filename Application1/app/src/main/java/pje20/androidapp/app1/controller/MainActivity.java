package pje20.androidapp.app1.controller;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import pje20.androidapp.app1.R;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import pje20.androidapp.app1.model.Todo;
import pje20.androidapp.app1.model.TodoViewModel;

import pje20.androidapp.app1.utils.TodoListDetailActivity;

import android.widget.ImageView;

//import pje20.androidapp.app1.popup.HelloWorldDialogFragment;


public class MainActivity extends AppCompatActivity 
		implements View.OnClickListener,
		SelectedItem,
        	
	//	AddTodoDialogFragment.TodoNoticeDialogListener,
		RecyclerItemTouchHelper.RecyclerItemTouchHelperListener   
{
	public static String ITEM_POSITION = "POSITION";
		RecyclerView mTodoRecyclerView;
		RecyclerView.Adapter mTodoAdapter;	
		RecyclerView.LayoutManager mTodoLayoutManager;
		TodoViewModel mTodoViewModel;
	
	@Override
    protected void onCreate(Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.mainactivity_layout);
		
			mTodoRecyclerView =findViewById(R.id.RecyclerView_RecyclerView2) ;
			mTodoViewModel = new ViewModelProvider(this).get(TodoViewModel.class);
			LiveData<List<Todo>> mTodoData = mTodoViewModel.getAllTodo();
			mTodoAdapter = new TodoAdapter(mTodoData,this);	
			mTodoLayoutManager = new LinearLayoutManager(this);
			mTodoRecyclerView.setLayoutManager(mTodoLayoutManager);
			mTodoRecyclerView.setAdapter(mTodoAdapter);
			final androidx.lifecycle.Observer<List<Todo>> TodoObserver = new androidx.lifecycle.Observer<List<Todo>>() {
		            @Override
		            public void onChanged(List<Todo> todo) {
		                mTodoAdapter.notifyDataSetChanged();
		            };
		        };
		      mTodoData.observe(this,TodoObserver);
				RecyclerItemTouchHelper RecyclerItemTouchHelpers = new RecyclerItemTouchHelper(0, ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT,this);
		    	ItemTouchHelper itemTouchHelper = new ItemTouchHelper(RecyclerItemTouchHelpers);
		    	itemTouchHelper.attachToRecyclerView(mTodoRecyclerView);
		    ImageView AddButton = findViewById(R.id.add_todo);
			AddButton.setOnClickListener(this);
			//AddTodoDialogFragments = new AddTodoDialogFragment();
		
						
	}

	@Override
    protected void onStart() {
        super.onStart();
	
    }
	@Override
	public void onClick(View v) {
	switch (v.getId()) {
		case R.id.add_todo : {
				break;
			}
	}
	}
	@Override	
	public void displayTodoDetail(View View, Todo mTodo){
		Intent intent  = new Intent(this,TodoListDetailActivity.class);
		intent.putExtra(ITEM_POSITION,mTodo);
		startActivity(intent);
	
	}
	@Override
	public void onSwiped(RecyclerView.ViewHolder viewHolder) {
		int position = viewHolder.getAdapterPosition();
	  //  mTodoViewModel.removeTodo(position);
		}
		

}
