package com.example.android.harrypotterquiz;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.CheckBox;
import android.widget.EditText;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    private int score;
    private RadioGroup radioGroupQ1;
    private RadioGroup radioGroupQ5;
    private RadioButton selectedRadioButtonQ1;
    private RadioButton selectedRadioButtonQ5;
    private EditText editTextQ4;
    private CheckBox CBQ2a;
    private CheckBox CBQ2b;
    private CheckBox CBQ2c;
    private CheckBox CBQ2d;
    private CheckBox CBQ2e;
    private CheckBox CBQ3a;
    private CheckBox CBQ3b;
    private CheckBox CBQ3c;
    private CheckBox CBQ3d;
    private Button submitScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialise the checkboxes
        CBQ2a=(CheckBox)findViewById(R.id.Q2aCheckBox);
        CBQ2b=(CheckBox)findViewById(R.id.Q2bCheckBox);
        CBQ2c=(CheckBox)findViewById(R.id.Q2cCheckBox);
        CBQ2d=(CheckBox)findViewById(R.id.Q2dCheckBox);
        CBQ2e=(CheckBox)findViewById(R.id.Q2eCheckBox);
        CBQ3a=(CheckBox)findViewById(R.id.Q3aCheckBox);
        CBQ3b=(CheckBox)findViewById(R.id.Q3bCheckBox);
        CBQ3c=(CheckBox)findViewById(R.id.Q3cCheckBox);
        CBQ3d=(CheckBox)findViewById(R.id.Q3dCheckBox);
        //initialise the radio groups
        radioGroupQ1=(RadioGroup)findViewById(R.id.Q1RadioGroup);
        radioGroupQ5=(RadioGroup)findViewById(R.id.Q5RadioGroup);
        //initialise the edit text
        editTextQ4=(EditText)findViewById(R.id.Q4EditText);
        //initialise the button
        submitScore=(Button)findViewById(R.id.submit);

        submitScore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String choices="";
                score=0;
                selectedRadioButtonQ1=(RadioButton)findViewById(radioGroupQ1.getCheckedRadioButtonId());
                selectedRadioButtonQ5=(RadioButton)findViewById(radioGroupQ5.getCheckedRadioButtonId());
                if(selectedRadioButtonQ1==(RadioButton)findViewById(R.id.Q1bRadioButton)){
                      score+=1;
                      choices+="Q1 is correct;";
                }
                else{
                    choices+="Q1 is wrong;";
                }
                if(CBQ2a.isChecked() && CBQ2d.isChecked() && CBQ2e.isChecked()){
                    score+=1;
                    choices+="Q2 is correct;";
                }
                else{
                    choices+="Q2 is wrong;";
                }
                if(CBQ3a.isChecked() && CBQ3c.isChecked() && CBQ3d.isChecked()){
                    score+=1;
                    choices+="Q3 is correct;";
                }
                else{
                    choices+="Q3 is wrong;";
                }
                if(editTextQ4.getText().toString().toLowerCase().equals("crookshanks")){
                    score+=1;
                    choices+="Q4 is correct;";
                }
                else{
                    choices+="Q4 is wrong;";
                }
                if(selectedRadioButtonQ5==(RadioButton)findViewById(R.id.Q5dRadioButton)){
                    score+=1;
                    choices+="Q5 is correct;";
                }
                else{
                    choices+="Q5 is wrong;";
                }

                Toast.makeText(MainActivity.this,"Your results were\n"+choices+"\nScore: "+score,Toast.LENGTH_LONG).show();
            }
        });
    }



}
