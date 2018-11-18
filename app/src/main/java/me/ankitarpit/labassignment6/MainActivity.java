package me.ankitarpit.labassignment6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void display(View view){

        RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
        int selectedId=rg.getCheckedRadioButtonId();
        RadioButton rb = (RadioButton) findViewById(selectedId);
        Toast.makeText(this, rb.getText(), Toast.LENGTH_LONG).show();
    }
}
