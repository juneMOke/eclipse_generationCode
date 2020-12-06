package pje20.androidapp.app1.model;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.loader.content.AsyncTaskLoader;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Todo.class}, version = 1, exportSchema = false)
public abstract class TodoDatabase extends RoomDatabase {
    private static TodoDatabase INSTANCE;
    private  static final int NUMBER_OF_THREAD = 4;

    public abstract TodoDao todoDao();
    static final ExecutorService todoDatabaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREAD);


    public  static TodoDatabase getDatabase (final Context context) {
        if (INSTANCE == null){
           INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                   TodoDatabase.class,"todo_database")
                   .addCallback(sCallback)
                   .build();
        }
        return INSTANCE;

    }

    public static RoomDatabase.Callback sCallback =
            new  RoomDatabase.Callback(){
                @Override
                public void onOpen(@NonNull SupportSQLiteDatabase db) {
                    super.onOpen(db);
                    new PopulateDbAsync(INSTANCE).execute();
                }
            };
    private static class PopulateDbAsync extends AsyncTask<Void,Void ,Void> {
        private final TodoDao mTodoDao;
        PopulateDbAsync(TodoDatabase todoDatabase) {
            mTodoDao = todoDatabase.todoDao();
        }


        @Override
        protected Void doInBackground(Void... voids) {
            mTodoDao.deleteAll();
            for (int i = 1; i < 13 ; i++) {
                mTodoDao.insert(new Todo(i+"/"+i+"/2020","title"+i,"this is the "+i+"content","author"+i));
            }
            return null;
        }

    }
}
