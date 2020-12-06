package pje20.androidapp.app1.utils;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import pje20.androidapp.app1.R;
import android.widget.TextView;
import androidx.annotation.Nullable;
import pje20.androidapp.app1.model.Todo;
import static pje20.androidapp.app1.controller.TodoAdapter.ITEM_POSITION;

public class TodoListDetailActivity extends AppCompatActivity {

	protected void onCreate(@Nullable Bundle savedInstanceState) {		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.todolist_detail_layout);
		Intent intent = getIntent();
		if( intent.getExtras()!= null) { 
			Todo todo = (Todo) intent.getSerializableExtra(ITEM_POSITION);
			((TextView) findViewById(R.id.todo_author)).setText(todo.getAuthor());		
			((TextView) findViewById(R.id.todo_content)).setText(todo.getContent());		
			((TextView) findViewById(R.id.todo_date)).setText(todo.getDate());		
			((TextView) findViewById(R.id.todo_title)).setText(todo.getTitle());		
		}
	}
}
