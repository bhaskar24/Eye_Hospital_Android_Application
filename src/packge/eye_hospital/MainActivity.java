 package packge.eye_hospital;

import android.os.Bundle;
import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
    
	Button button;
	TextView tv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.activity_main);
		tv=(TextView)findViewById(R.id.vis1);
		tv.setText("Our Vision\nTo provide professional,comprehensive and compassionate eye care with a personal touch\n");
	//			+"\n\nNew/u\nInternational Patients\n*Exclusive Service\n*Surgery Packages\n*Travel and Accommodation\n*Medical Queries. ");
		addListenerOnButton();
	}
	
 public void addListenerOnButton()
 {
	 
	 final Context context = this;
	 button=(Button)findViewById(R.id.b1);
	 button.setOnClickListener(new OnClickListener()
	 {
		public void onClick(View args0)
		{
			Intent intent =new Intent(context,menu.class);
			startActivity(intent);
		}
	 });
 }


}
