package eu.arttupeka;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;

public class YggdrasilRPGActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(new GameCanvas(this));
    }
    
    @Override
    public boolean onTouchEvent(MotionEvent e){
    	
    	
		return true;
    }
}