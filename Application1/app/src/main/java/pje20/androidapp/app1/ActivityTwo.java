
package pje20.androidapp.app1;


import pje20.androidapp.app1.popup.HelloWorldDialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;



public class ActivityTwo extends AppCompatActivity {

	HelloWorldDialogFragment mDialog;
	@Override
    protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_two);
		
		mDialog = new HelloWorldDialogFragment("ActivityTwo");
		
	}

	@Override
    protected void onStart() {
        super.onStart();
	
		findViewById(R.id.Button_activity2).setOnClickListener(handleClickButtonActivity2);
	
		findViewById(R.id.Button_ActivityFour).setOnClickListener(handleClickButtonActivityFour);
    }


		View.OnClickListener handleClickButtonActivity2 = new View.OnClickListener() {
	        public void onClick(View view) {
	           displayActivity2(view);
	        }
	    };
		public void displayActivity2(View view){
	        mDialog.show(getSupportFragmentManager(),"I am Activity 2");
	    }
		
		View.OnClickListener handleClickButtonActivityFour = new View.OnClickListener() {
	        public void onClick(View view) {
	           displayActivityFour(view);
	        }
	    };
		public void displayActivityFour(View view){
			Intent intent = new Intent(this, ActivityFour.class);
		    startActivity(intent);
		}
	
		
}
