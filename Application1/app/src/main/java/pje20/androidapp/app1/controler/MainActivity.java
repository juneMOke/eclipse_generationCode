		package pje20.androidapp.app1.controler;
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
			import android.app.Dialog;
			import pje20.androidapp.app1.popup.HelloWorldDialogFragment;
		
		
		
		public class MainActivity extends AppCompatActivity 
				implements MyAdapter.TodoSelected,
		        View.OnClickListener,
		        AddTodoDialogFragment.TodoNoticeDialogListener,
		        RecyclerItemTouchHelper.RecyclerItemTouchHelperListener	
		{
			public static String ITEM_POSITION = 'POSITION'
				RecyclerView mTodoRecyclerView;
				RecyclerView.Adapter mTodoAdapter;	
				RecyclerView.LayoutManager mTodoLayoutManager;
				MyViewModel mTodoViewModel;
				LiveData<List<Todo>> TodoData
			
			@Override
		    protected void onCreate(Bundle savedInstanceState) {		
				super.onCreate(savedInstanceState);
				setContentView(R.layout.layout_mainactivity);
				
					mTodoRecyclerView =findViewById(R.id.@+id/RecyclerView_RecyclerView2"_) ;
					mTodoViewModel = new ViewModelProvider(this).get(TodoViewModel.class);
					TodoData = mTodoViewModel.getTodoLiveData();
					mTodoLayoutManager = new LinearLayoutManager(this);
					mTodoAdapter = new TodoAdapter(TodoData,this);	
					mTodoRecyclerView.setLayoutManager(mTodoLayoutManager);
					mTodoRecyclerView.setAdapter(mTodoAdapter);
					final androidx.lifecycle.Observer<List<Todo>> TodoObserver = new androidx.lifecycle.Observer<List<Todo>>() {
				            @Override
				            public void onChanged(List<Todo> todo) {
				                mTodoAdapter.notifyDataSetChanged();
				            };
				        };
				        mTodoViewModel.getTodoLiveData().observe(this,TodoObserver);
						
				    ImageView AddButton = findViewById(R.id.add_todo);
					AddButton.setOnClickListener(this);
					AddTodoDialogFragments = new AddTodoDialogFragment();
				
						RecyclerItemTouchHelper RecyclerItemTouchHelpers = new RecyclerItemTouchHelper(0, ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT,this);
				    	ItemTouchHelper itemTouchHelper = new ItemTouchHelper(RecyclerItemTouchHelpers);
				    	itemTouchHelper.attachToRecyclerView(TodoRecyclerView);
								
			}
		
			@Override
		    protected void onStart() {
		        super.onStart();
				findViewById(R.id.RecyclerView_RecyclerView2).setOnClickListener(this);
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
						Intent intent  = new Intent(this,TodoDetailActivity.class);
						intent.putExtra(ITEM_POSITION,mTodo);
						startActivity(intent);
			
			}

		}
