package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBtLogin;
    private EditText mEtUsername, mEtPassword;
    String username, password;
    String TAG = "LoginPage";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtLogin = findViewById(R.id.btn_login);
        mEtUsername = findViewById(R.id.et_username);
        mEtPassword = findViewById(R.id.et_password);
        mBtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //gain the content of usename and password,for further use
                username = mEtUsername.getText().toString();
                password = mEtPassword.getText().toString();
                Log.d("Record",username);
                Log.d(TAG, username);
                Log.d(TAG, password);
                //Do something, like go to another activity
                Toast.makeText(getApplicationContext(), "Username:"+username, Toast.LENGTH_LONG).show();
            }
        });
    }
}
