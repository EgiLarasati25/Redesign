package com.example.dana.danaactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dana.R;

public class riwayat extends AppCompatActivity{

        protected void onCreate (Bundle saveInstanceState) {
            super.onCreate(saveInstanceState);

            setContentView(R.layout.riwayat);
        }
        public void clickloading(View view) {
            Intent i = new Intent(this, loading.class);
            startActivity(i);
        }
        public void clicklogin(View view) {
            Intent i = new Intent(this, login.class);
            startActivity(i);
        }
        public void clickhome(View view) {
            Intent i = new Intent(this, home.class);
            startActivity(i);
        }
        public void clickriwayat(View view) {
            Intent i = new Intent(this, riwayat.class);
            startActivity(i);
        }
        public void clickpocket(View view) {
            Intent i = new Intent(this, pocket.class);
            startActivity(i);
        }
        public void clickakun(View view) {
            Intent i = new Intent(this, akun.class);
            startActivity(i);
        }

    }

