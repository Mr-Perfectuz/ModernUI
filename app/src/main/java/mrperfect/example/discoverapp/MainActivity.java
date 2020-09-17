package mrperfect.example.discoverapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout bgChecked;
    LinearLayout bglink;
    LinearLayout bghome;
    LinearLayout bgFilm;
    LinearLayout bgAdd;
    LinearLayout bgDownloads;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bgChecked = (LinearLayout) findViewById(R.id.bg_checked);
        bgChecked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "New Arrival Activity has been clicked", Toast.LENGTH_SHORT).show();
            }
        });

        bgChecked = (LinearLayout) findViewById(R.id.bg_checked);
        bgChecked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "New Arrival Activity has been clicked", Toast.LENGTH_SHORT).show();
            }
        });

        bgChecked = (LinearLayout) findViewById(R.id.bg_checked);
        bgChecked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "New Arrival Activity has been clicked", Toast.LENGTH_SHORT).show();
            }
        });

        bgChecked = (LinearLayout) findViewById(R.id.bg_checked);
        bgChecked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "New Arrival Activity has been clicked", Toast.LENGTH_SHORT).show();
            }
        });

        bgChecked = (LinearLayout) findViewById(R.id.bg_checked);
        bgChecked.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this, "New Arrival Activity has been clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}