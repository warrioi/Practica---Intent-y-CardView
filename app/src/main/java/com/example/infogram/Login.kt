package com.example.infogram

import android.view.View
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    public void
    public fun goCreateAcount(View view){
        Intent intent = new Intent(this, CreateAcoountActivity.class);
        startActivity(Intent);

    }
}