package com.example.daredevil07.ItsShowTime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;



public class PhoneVerification extends AppCompatActivity {


    private EditText editTextMobile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_verification);

        editTextMobile = findViewById(R.id.editTextMobile);

        findViewById(R.id.buttonContinue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mobile = editTextMobile.getText().toString().trim();

                if(mobile.isEmpty() || mobile.length() < 10){
                    editTextMobile.setError("Enter a valid mobile");
                    editTextMobile.requestFocus();
                    return;
                }

                Intent intent = new Intent(PhoneVerification.this, Verify.class);
                intent.putExtra("mobile", mobile);
                startActivity(intent);
            }
        });
    }

}