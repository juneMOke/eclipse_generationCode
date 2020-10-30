
package pje20.androidapp.app1;


import pje20.androidapp.app1.popup.HelloWorldDialogFragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;



public class ActivityFour extends AppCompatActivity {

	HelloWorldDialogFragment mDialog;
	@Override
    protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_four);
		
		mDialog = new HelloWorldDialogFragment("ActivityFour");
		
	}

	@Override
    protected void onStart() {
        super.onStart();
	
		findViewById(R.id.Button_activity4).setOnClickListener(handleClickButtonActivity4);
    }


		View.OnClickListener handleClickButtonActivity4 = new View.OnClickListener() {
	        public void onClick(View view) {
	           displayActivity4(view);
	        }
	    };
		public void displayActivity4(View view){
	        mDialog.show(getSupportFragmentManager(),"I am Activity4");
	    }
		
}
