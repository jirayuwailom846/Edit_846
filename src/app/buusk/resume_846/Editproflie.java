package app.buusk.resume_846;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Editproflie extends Activity implements OnClickListener {
private Button btnsubmit;
private EditText txt01, txt02, txt03, txt04, txt05, txt06;
private String txt11, txt12, txt13, txt14, txt15, txt16 ;
@Override
protected void onCreate(Bundle savedInstanceState) {
setContentView(R.layout.edit846);
super.onCreate(savedInstanceState);
ViewMatching();
}
private void ViewMatching() {
btnsubmit = (Button) findViewById(R.id.btn_s);
btnsubmit.setOnClickListener(this); 
txt01 = (EditText) findViewById(R.id.etxt1);
txt02 = (EditText) findViewById(R.id.etxt2);
txt03 = (EditText) findViewById(R.id.etxt3);
txt04 = (EditText) findViewById(R.id.etxt4);
txt05 = (EditText) findViewById(R.id.etxt5);
txt06 = (EditText) findViewById(R.id.etxt6);

}
@Override
public void onClick(View v) {
switch (v.getId()) {
case R.id.btn_s:
txt11 = (txt01.getText().toString());
txt12 = (txt02.getText().toString());
txt13 = (txt03.getText().toString());
txt14 = (txt04.getText().toString());
txt15 = (txt05.getText().toString());
txt16 = (txt06.getText().toString());

Intent R = new Intent(getApplicationContext(), MainActivity.class);
R.putExtra("txt11", txt11);
R.putExtra("txt12", txt12);
R.putExtra("txt13", txt13);
R.putExtra("txt14", txt14);
R.putExtra("txt15", txt15);
R.putExtra("txt16", txt16);

startActivity(R);
break;
default:
break;
}
}
}