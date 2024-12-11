package com.example.location;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextDestination = findViewById(R.id.destination);
        Button btn = findViewById(R.id.search);
        Button btn2 = findViewById(R.id.nuwaraeliya);
        Button btn3 = findViewById(R.id.ninearch);
        Button btn4 = findViewById(R.id.adisam);
        Button btn5 =findViewById(R.id.boburuella);
        Button btn6 = findViewById(R.id.dunhida);
        Button btn7 = findViewById(R.id.suduwanguwa);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String destination = editTextDestination.getText().toString();
                if(destination.equals("")){
                    Toast.makeText(getApplicationContext(),"Enter the destination",Toast.LENGTH_SHORT).show();
                }else {
                    Uri uri = Uri.parse("https://www.google.com/maps/dir/uva_wellassa_university/"+ destination);
                    Intent intent = new Intent(Intent.ACTION_VIEW,uri);
                    intent.setPackage("com.google.android.apps.maps");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                    startActivity(intent);
                }
            }
        });
        //calling to nuwara eliya layout
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, nuwara_eliya.class));
//                Uri uri = Uri.parse("https://www.google.com/maps/dir/uva_wellassa_university/nuwara_eliya");
//                Intent intent = new Intent(Intent.ACTION_VIEW,uri);
//                intent.setPackage("com.google.android.apps.maps");
//                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, nine_arch.class));
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, adisham.class));
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, boburu_ella.class));
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, dunhida_ella.class));
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, sudu_wanguwa.class));
            }
        });

    }
}