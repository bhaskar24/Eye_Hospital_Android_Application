package packge.eye_hospital;

import android.os.Bundle;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;

public class GetAppointment extends Activity {
	EditText fname;
	String eid[] = { "gtm7272@gmail.com" }, sub = "Want Appointment", msg;
	String fn, sa, ct, cn, stt, phn, mesge;
	Button but, but2;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.appointment);

		fname = (EditText) findViewById(R.id.fet);// body

		but2 = (Button) findViewById(R.id.back);
		but = (Button) findViewById(R.id.sub);// final submit

		addListenerOnButton();

	}

	public void addListenerOnButton() {
		final Context cont = this;
		but.setOnClickListener(new OnClickListener() {
			public void onClick(View args0) {
				but.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						final Intent emailIntent = new Intent(
								android.content.Intent.ACTION_SEND);

						emailIntent.setType("plain/text");

						emailIntent.putExtra(
								android.content.Intent.EXTRA_EMAIL, eid);

						emailIntent.putExtra(
								android.content.Intent.EXTRA_SUBJECT, sub);

						emailIntent.putExtra(android.content.Intent.EXTRA_TEXT,
								fname.getText());

						try {
							GetAppointment.this.startActivity(Intent
									.createChooser(emailIntent, "Send mail..."));
						} catch (android.content.ActivityNotFoundException ex) {
							Toast.makeText(GetAppointment.this,
									"There are no email clients installed.",
									Toast.LENGTH_SHORT).show();
						}
					}

				});
			}
		});

		but2.setOnClickListener(new OnClickListener() {
			public void onClick(View args0) {
				Intent inte = new Intent(cont, menu.class);
				startActivity(inte);
			}
		});

	}

}
