package test.automation.shoppinglist;

import android.R.string;
import android.app.Activity;
import android.view.*;
import android.widget.*;

import android.os.Bundle;

public class ShoppingListActivity extends Activity {
    /** Called when the activity is first created. */
	
    View topView = null;
    TextView headerView = null;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

		topView = this.getLayoutInflater().inflate(R.layout.main, null);     			
        headerView = new TextView(this);        
        headerView.setText("My Native Shopping List: ");

		if(topView != null)
		{
            ((ListView)topView).addHeaderView( headerView );
            ((ListView)topView).setAdapter( new MyAdapter(this) );
			
			setContentView (topView);
		}        
       
    }  
    
}

