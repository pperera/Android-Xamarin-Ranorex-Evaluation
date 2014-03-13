package test.automation.shoppinglist;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter 
{
    String[] myShoppingData = new String [] {"Eggs", "Milk", "Flour", "Mushrooms"};
    Activity myActivity = null;

    public MyAdapter(Activity context)
    {		
		this.myActivity = context;
    }   
   
	public int getCount() 
	{		
        return 4;		
	}

	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	public android.view.View getView(int position,
			android.view.View convertView, ViewGroup parent)
	{
        if(convertView == null)
        {
            convertView = new TextView(myActivity);                
        }
        
		((TextView)convertView).setText (myShoppingData[position]);
        return convertView;	
	
	}
}
