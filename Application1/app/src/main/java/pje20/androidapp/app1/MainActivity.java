
package pje20.androidapp.app1;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import androidx.appcompat.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import pje20.androidapp.app1.popup.HelloWorldDialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

	HelloWorldDialogFragment mDialog;
	@Override
    protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		mDialog = new HelloWorldDialogFragment("MainActivity");
		
	}

	@Override
    protected void onStart() {
        super.onStart();
	
		findViewById(R.id.Button_mainActivity).setOnClickListener(handleClickButtonMainActivity);
	
		findViewById(R.id.Button_ActivityTwo).setOnClickListener(handleClickButtonActivityTwo);
	
		findViewById(R.id.Button_ActivityThree).setOnClickListener(handleClickButtonActivityThree);
    }


		View.OnClickListener handleClickButtonMainActivity = new View.OnClickListener() {
	        public void onClick(View view) {
	           displayMainActivity(view);
	        }
	    };
		public void displayMainActivity(View view){
	        mDialog.show(getSupportFragmentManager(),"I am Activity 1");
	    }
		
		View.OnClickListener handleClickButtonActivityTwo = new View.OnClickListener() {
	        public void onClick(View view) {
	           displayActivityTwo(view);
	        }
	    };
		public void displayActivityTwo(View view){
			Intent intent = new Intent(this, ActivityTwo.class);
		    startActivity(intent);
		}
	
		
		View.OnClickListener handleClickButtonActivityThree = new View.OnClickListener() {
	        public void onClick(View view) {
	           displayActivityThree(view);
	        }
	    };
		public void displayActivityThree(View view){
			Intent intent = new Intent(this, ActivityThree.class);
		    startActivity(intent);
		}
	
		
}
