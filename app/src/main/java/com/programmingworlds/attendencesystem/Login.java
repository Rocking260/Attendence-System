package com.programmingworlds.attendencesystem;

import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    TextInputEditText User,Pass;
    Button Login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        intialize();
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validate())
                {

                    Toast.makeText(getApplicationContext(),"LOGIN SUCCESSFUL", Toast.LENGTH_SHORT).show();
                }else
                {

                }

            }
        });
    }

    boolean validate()
    {
        View view = null;
     if(User.getText().toString().isEmpty()|| Pass.getText().toString().isEmpty())
     {
         return false;
     }
     return true;
    }
    void intialize()
    {
       User =  findViewById(R.id.tet_user);
        Pass = findViewById(R.id.tet_pass);
        Login = findViewById(R.id.btn_login);
    }
}
