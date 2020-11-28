		package pje20.androidapp.app1.controler;
		import android.content.Intent;
		import android.os.Bundle;
		import android.view.View;
		import androidx.appcompat.app.AppCompatActivity;
		import pje20.androidapp.app1.R;
		
			import pje20.androidapp.app1.popup.HelloWorldDialogFragment;
		
		
		public class Activity3 extends AppCompatActivity 
				implements View.OnClickListener
		{
					HelloWorldDialogFragment mDialogButton12;
			
			@Override
		    protected void onCreate(Bundle savedInstanceState) {		
				super.onCreate(savedInstanceState);
				setContentView(R.layout.layout_activity3);
						mDialogButton12 = new HelloWorldDialogFragment("I am activity 3");
				
								
			}
		
			@Override
		    protected void onStart() {
		        super.onStart();
				findViewById(R.id.Button_Button12).setOnClickListener(this);
		    }
			@Override
    		public void onClick(View v) {
        	switch (v.getId()) {
				case R.id.Button_Button12: {
			                	
			                        mDialogButton12.show(getSupportFragmentManager(),"I am activity 3");
			                 
			                	
			                break;
			            } 
        	}
    		}
			
			

		}
