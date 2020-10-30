
package pje20.androidapp.app1;


import pje20.androidapp.app1.popup.HelloWorldDialogFragment;
import android.widget.TextView;
import android.os.Build;
import androidx.annotation.RequiresApi;
import java.time.LocalDateTime; 
import java.time.format.DateTimeFormatter; 

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;



public class ActivityThree extends AppCompatActivity {

	HelloWorldDialogFragment mDialog;
	@Override
    protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_three);
		
		mDialog = new HelloWorldDialogFragment("ActivityThree");
		
	}

	@Override
    protected void onStart() {
        super.onStart();
	
		findViewById(R.id.Button_activity3).setOnClickListener(handleClickButtonActivity3);
	
		findViewById(R.id.Button_time).setOnClickListener(handleClickButtonTime);
    }


		View.OnClickListener handleClickButtonActivity3 = new View.OnClickListener() {
	        public void onClick(View view) {
	           displayActivity3(view);
	        }
	    };
		public void displayActivity3(View view){
	        mDialog.show(getSupportFragmentManager(),"I am Activity3");
	    }
		
		View.OnClickListener handleClickButtonTime = new View.OnClickListener() {
	        public void onClick(View view) {
	           displayTime(view);
	        }
	    };
		@RequiresApi(api = Build.VERSION_CODES.O)
		public void displayTime(View view){
			 LocalDateTime myDateObj = LocalDateTime.now();
			 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	    	 String formattedDate = myDateObj.format(myFormatObj);
			 TextView txt = findViewById(R.id.textview_Button_time);
			 txt.setText(formattedDate);
				
	    }
		
}
