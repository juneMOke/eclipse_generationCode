	
	package pje20.androidapp.app1.popup;

	import android.app.AlertDialog;
	import android.app.Dialog;
	import android.content.DialogInterface;
	import android.os.Bundle;
	
	import androidx.annotation.NonNull;
	import androidx.annotation.Nullable;
	import androidx.fragment.app.DialogFragment;
	
	public class HelloWorldDialogFragment extends DialogFragment {
	    private String mActivityName;
	    public HelloWorldDialogFragment(String name){
	        mActivityName = name;
	    }
	    @NonNull
	    @Override
	    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
	        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
	        builder.setTitle("Helloo")
	                .setMessage("Hello, I am " + getActivityName())
	                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
	                    @Override
	                    public void onClick(DialogInterface dialog, int which) {
	                        
	                    }
	                });
	
	        //return super.onCreateDialog(savedInstanceState);
	        return builder.create();
	    }
	
	    public String getActivityName() {
	        return mActivityName;
	    }
	
	    public void setActivityName(String activityName) {
	        mActivityName = activityName;
	    }
	}
