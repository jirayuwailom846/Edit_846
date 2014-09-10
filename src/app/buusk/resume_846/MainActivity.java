package app.buusk.resume_846;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.EditText;
public class MainActivity extends Activity implements OnClickListener {
private Button btn1, btn2;
private TextView txt11, txt12, txt13, txt14, txt15, txt16;
private String show1,show2,show3,show4,show5,show6;
@Override
protected void onCreate(Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
ViewMatching();
}
private void ViewMatching() {
btn1 = (Button) findViewById(R.id.btn_save);
btn2 = (Button) findViewById(R.id.btnimg);
btn1.setOnClickListener(this);
btn2.setOnClickListener(this);
txt11 = (TextView) findViewById(R.id.txt01);
txt12 = (TextView) findViewById(R.id.txt02);
txt13 = (TextView) findViewById(R.id.txt03);
txt14 = (TextView) findViewById(R.id.txt04);
txt15 = (TextView) findViewById(R.id.txt05);
txt16 = (TextView) findViewById(R.id.txt06);

txt11.setText("Yoshi");
txt12.setText("21");
txt13.setText("178");
txt14.setText("56");
txt15.setText("30/08/1993");
txt16.setText("Jirayu Wailom");;

show1 = getIntent().getStringExtra("txt11");
show2 = getIntent().getStringExtra("txt12");
show3 = getIntent().getStringExtra("txt13");
show4 = getIntent().getStringExtra("txt14");
show5 = getIntent().getStringExtra("txt15");
show6 = getIntent().getStringExtra("txt16");

txt11.setText(show1);
txt12.setText(show2);
txt13.setText(show3);
txt14.setText(show4);
txt15.setText(show5);
txt16.setText(show6);

}
@Override
public void onClick(View v) {
switch (v.getId()) {
case R.id.btn_save:
Intent i = new Intent(getApplicationContext(), Editproflie.class);
startActivity(i);
break;
case R.id.btnimg:
Intent j = new Intent(getApplicationContext(), ImageActivity.class);
startActivity(j);
break;
default:
break;
}
}
}