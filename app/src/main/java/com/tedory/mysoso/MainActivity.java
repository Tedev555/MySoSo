package com.tedory.mysoso;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {
    EditText userNameEdt;
    EditText passwordEdt;
    Button loginBtn;

    String userStr;
    String passStr;
    String user = "Samsung";
    String pass = "123";

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();

        userNameEdt = findViewById(R.id.user_edt);
        passwordEdt = findViewById(R.id.pass_edt);
        loginBtn = findViewById(R.id.login_btn);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userStr = userNameEdt.getText().toString();
                passStr = passwordEdt.getText().toString();


            }
        });
    }

    private void login(String email, String password) {
        mAuth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            //Login Successful
                        } else {
                            //Login Not Successful
                        }
                    }
                });
    }






//    private void login(String email, String password) {
//        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//                if (task.isSuccessful()) {
//                    Log.d("LoginTag", "signInWithEmail:success");
//                } else {
//                    Log.w("LoginTag", "signInWithEmail:failure", task.getException());
//                }
//            }
//        });
//    }

}
