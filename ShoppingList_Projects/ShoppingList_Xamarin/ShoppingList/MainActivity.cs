using System;
using Android.App;
using Android.Content;
using Android.Runtime;
using Android.Views;
using Android.Widget;
using Android.OS;

namespace ShoppingList
{
	[Activity (Label = "ShoppingList", MainLauncher = true)]
	public class MainActivity : Activity
	{
        View topView = null;
	    TextView headerView = null;
	    
		protected override void OnCreate (Bundle bundle)
		{
			base.OnCreate (bundle);

			topView = this.LayoutInflater.Inflate(Resource.Layout.Main, null);     			
            headerView = new TextView(this);
            headerView.Text = "My Shopping List: ";
    
			if(topView != null)
			{
                (topView as ListView).AddHeaderView( headerView );
    			(topView as ListView).Adapter = new MyAdapter(this as Activity);
    			
    			SetContentView (topView);
			}

		}
	}


   	public class MyAdapter : BaseAdapter
    {

        string[] myShoppingData = new string [] {"Eggs", "Milk", "Flour", "Mushrooms"};
        Activity myActivity = null;

        public MyAdapter(Activity context)
        {		
    		this.myActivity = context;
        }
        
    	public override int Count 
    	{
    		get 
    		{   
                return 4;
    		}
    	}

    	public override Java.Lang.Object GetItem (int position)
    	{
    		return null;
    	}

    	public override long GetItemId (int position)
    	{
    		return position;
    	}	

		public override View GetView (int position, View convertView, ViewGroup parent)
        {
            if(convertView == null)
            {
                convertView = new TextView(myActivity);                
            }
            
			(convertView as TextView).Text = myShoppingData[position];
            return convertView;
        }
   	

    }




	
}


