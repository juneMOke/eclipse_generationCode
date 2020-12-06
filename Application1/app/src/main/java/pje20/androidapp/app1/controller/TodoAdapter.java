package pje20.androidapp.app1.controller;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

import java.util.List;

import pje20.androidapp.app1.model.Todo;
import pje20.androidapp.app1.R;

public class TodoAdapter extends RecyclerView.Adapter<TodoAdapter.TodoViewHolder> {
	private LiveData<List<Todo>> mLiveData;
    public static String ITEM_POSITION = "POSITION";
    SelectedItem mSelectedItem;

	public TodoAdapter(LiveData<List<Todo>> liveData, SelectedItem todoSelectedItem ) {
		mLiveData = liveData;
		mSelectedItem = todoSelectedItem;
	}

	@NonNull
    @Override
    public TodoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.todolist_listitem_layout, parent, false);
        TodoViewHolder vh = new TodoViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull TodoViewHolder holder, int position) {
		if (mLiveData != null)
     		holder.bindView(mLiveData.getValue().get(position));
		else
			holder.mTitle.setText("No item");

    }



    @Override
    public int getItemCount() {
        if (mLiveData.getValue() != null)
			return mLiveData.getValue().size();
        return 0;
    }

	public class TodoViewHolder extends ViewHolder {
		public TextView mDate;
		public TextView mTitle;
        public View layout;
		

        public TodoViewHolder(@NonNull View itemView) {
            super(itemView);
            layout = itemView;
			mDate = (TextView) itemView.findViewById(R.id.todo_date);
			mTitle = (TextView) itemView.findViewById(R.id.todo_title);
			itemView.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					mSelectedItem.displayTodoDetail(v, mLiveData.getValue().get((getAdapterPosition())));
				}
			});
        }

		public void bindView(Todo todo) {
			mDate.setText(todo.getDate());
			mTitle.setText(todo.getTitle());
		}
	}
}
