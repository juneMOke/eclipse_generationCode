package pje20.androidapp.app1.model;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.io.Serializable;

@Entity(tableName = "todo_table")
public class Todo implements Serializable {


	@PrimaryKey(autoGenerate = true)
	private int id;

	@ColumnInfo(name = "title")
	private String mTitle;
	@ColumnInfo(name = "author")
	private String mAuthor;
	@ColumnInfo(name = "date")
	private String mDate;
	@ColumnInfo(name = "content")
	private String mContent;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() { return mTitle; }
	public void setTitle(String title) { mTitle = title; }
	public String getAuthor() { return mAuthor; }
	public void setAuthor(String author) { mAuthor = author; }
	public String getDate() { return mDate; }
	public void setDate(String date) { mDate = date; }
	public String getContent() { return mContent; }
	public void setContent(String content) { mContent = content; }
	public Todo(String title
	, String author
	, String date
	, String content
	) {
		mTitle = title;
		mAuthor = author;
		mDate = date;
		mContent = content;
	}
}

