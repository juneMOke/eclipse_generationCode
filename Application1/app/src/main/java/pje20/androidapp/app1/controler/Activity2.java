		package pje20.androidapp.app1.controler;
		import android.content.Intent;
		import android.os.Bundle;
		import android.view.View;
		import androidx.appcompat.app.AppCompatActivity;
		import pje20.androidapp.app1.R;
		
			import pje20.androidapp.app1.popup.HelloWorldDialogFragment;
		
		
		public class Activity2 extends AppCompatActivity 
				implements View.OnClickListener
		{
					HelloWorldDialogFragment mDialogButton10;
			
			@Override
		    protected void onCreate(Bundle savedInstanceState) {		
				super.onCreate(savedInstanceState);
				setContentView(R.layout.layout_activity2);
						mDialogButton10 = new HelloWorldDialogFragment("I am Activity 2");
				
								
			}
		
			@Override
		    protected void onStart() {
		        super.onStart();
				findViewById(R.id.Button_Button8).setOnClickListener(this);
				findViewById(R.id.Button_Button10).setOnClickListener(this);
		    }
			@Override
    		public void onClick(View v) {
        	switch (v.getId()) {
				case R.id.Button_Button8: {
			                	
			                		Intent intent = new Intent(this, Activity4.class);
			                	    startActivity(intent);
			                	
			                
			                	
			                break;
			            } 
				case R.id.Button_Button10: {
			                	
			                        mDialogButton10.show(getSupportFragmentManager(),"I am Activity 2");
			                 
			                	
			                break;
			            } 
        	}
    		}
			
			
			
			

		}
