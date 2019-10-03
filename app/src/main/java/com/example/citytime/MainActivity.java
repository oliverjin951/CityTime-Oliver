package com.example.citytime;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ConstraintLayout cl1 = findViewById(R.id.sydTime);
        ImageView sydney = cl1.findViewById(R.id.imageView);
        sydney.setImageResource(R.drawable.syd);
        TextView textView = cl1.findViewById(R.id.textView);
        textView.setText("Press refresh to display the time for Sydney");

        final ConstraintLayout cl2 = findViewById(R.id.tokyoTime);
        ImageView tok = cl2.findViewById(R.id.imageView);
        tok.setImageResource(R.drawable.toky);
        TextView textView1 = cl2.findViewById(R.id.textView);
        textView1.setText("Press refresh to display the time Tokyo");

        final ConstraintLayout cl3 = findViewById(R.id.shangTime);
        ImageView sha = cl3.findViewById(R.id.imageView);
        sha.setImageResource(R.drawable.shanghai);
        TextView textView2 = cl3.findViewById(R.id.textView);
        textView2.setText("Press refresh to display the time for Shanghai");

        final ConstraintLayout cl4 = findViewById(R.id.yorkTime);
        ImageView york = cl4.findViewById(R.id.imageView);
        york.setImageResource(R.drawable.ny);
        TextView textView3 = cl4.findViewById(R.id.textView);
        textView3.setText("Press refresh to display the time for New York");

        final ConstraintLayout cl5 = findViewById(R.id.egyptTime);
        ImageView egy = cl5.findViewById(R.id.imageView);
        egy.setImageResource(R.drawable.egypt);
        TextView textView4 = cl5.findViewById(R.id.textView);
        textView4.setText("Press refresh to display the time for Egypt");

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                String sydTime = "Time in Sydney is: " + String.format("%02d", calendar.get(Calendar.HOUR_OF_DAY)) + ":"
                        + String.format("%02d", calendar.get(Calendar.MINUTE)) + ":"
                        + String.format("%02d", calendar.get(Calendar.SECOND));

                TextView textView = cl1.findViewById(R.id.textView);
                textView.setText(sydTime);

                TimeZone tz1 = TimeZone.getTimeZone("GMT+09:00");
                Calendar calendar1 = Calendar.getInstance(tz1);
                String tokyoTime = "Time in Tokyo is: " + String.format("%02d", calendar1.get(Calendar.HOUR_OF_DAY)) + ":"
                        + String.format("%02d", calendar1.get(Calendar.MINUTE)) + ":"
                        + String.format("%02d", calendar1.get(Calendar.SECOND));

                TextView textView1 = cl2.findViewById(R.id.textView);
                textView1.setText(tokyoTime);

                TimeZone tz2 = TimeZone.getTimeZone("GMT+08:00");
                Calendar calendar2 = Calendar.getInstance(tz2);
                String shangTime = "Time in Shanghai is: " + String.format("%02d", calendar2.get(Calendar.HOUR_OF_DAY)) + ":"
                        + String.format("%02d", calendar2.get(Calendar.MINUTE)) + ":"
                        + String.format("%02d", calendar2.get(Calendar.SECOND));

                TextView textView2 = cl3.findViewById(R.id.textView);
                textView2.setText(shangTime);

                TimeZone tz3 = TimeZone.getTimeZone("GMT-04:00");
                Calendar calendar3 = Calendar.getInstance(tz3);
                String yorkTime = "Time in New York is: " + String.format("%02d", calendar3.get(Calendar.HOUR_OF_DAY)) + ":"
                        + String.format("%02d", calendar3.get(Calendar.MINUTE)) + ":"
                        + String.format("%02d", calendar3.get(Calendar.SECOND));

                TextView textView3 = cl4.findViewById(R.id.textView);
                textView3.setText(yorkTime);

                TimeZone tz4 = TimeZone.getTimeZone("GMT+02:00");
                Calendar calendar4 = Calendar.getInstance(tz4);
                String egyptTime = "Time in Cairo is: " + String.format("%02d", calendar4.get(Calendar.HOUR_OF_DAY)) + ":"
                        + String.format("%02d", calendar4.get(Calendar.MINUTE)) + ":"
                        + String.format("%02d", calendar4.get(Calendar.SECOND));

                TextView textView4 = cl5.findViewById(R.id.textView);
                textView4.setText(egyptTime);
            }
        });
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss aa");
                String sydTime = dateFormat.format(new Date());
                TextView textView = cl1.findViewById(R.id.textView);
                textView.setText("Time in Sydney is: " + sydTime);

                DateFormat dateFormat2 = new SimpleDateFormat("hh:mm:ss aa");
                Calendar calendar2 = Calendar.getInstance();
                calendar2.add(Calendar.HOUR, -1);
                String tokyoTime = dateFormat2.format(calendar2.getTime());
                TextView textView2 = cl2.findViewById(R.id.textView);
                textView2.setText("Time in Tokyo is: " + tokyoTime);

                DateFormat dateFormat3 = new SimpleDateFormat("hh:mm:ss aa");
                Calendar calendar3 = Calendar.getInstance();
                calendar3.add(Calendar.HOUR, -2);
                String shangTime = dateFormat3.format(calendar3.getTime());
                TextView textView3 = cl3.findViewById(R.id.textView);
                textView3.setText("Time in Shanghai is: " + shangTime);

                DateFormat dateFormat4 = new SimpleDateFormat("hh:mm:ss aa");
                Calendar calendar4 = Calendar.getInstance();
                calendar4.add(Calendar.HOUR, -14);
                String yorkTime = dateFormat4.format(calendar4.getTime());
                TextView textView4 = cl4.findViewById(R.id.textView);
                textView4.setText("Time in New York is: " + yorkTime);

                DateFormat dateFormat5 = new SimpleDateFormat("hh:mm:ss aa");
                Calendar calendar5 = Calendar.getInstance();
                calendar5.add(Calendar.HOUR, -8);
                String egyptTime = dateFormat5.format(calendar5.getTime());
                TextView textView5 = cl5.findViewById(R.id.textView);
                textView5.setText("Time in Cairo is: " + egyptTime);
            }
        });
        Button hideSyd = findViewById(R.id.hideSyd);
        hideSyd.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                cl1.setVisibility(View.GONE);
            }
        });
        Button showSyd = findViewById(R.id.showSyd);
        showSyd.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                cl1.setVisibility(View.VISIBLE);
            }
        });
        Button hideTok = findViewById(R.id.hideTok);
        hideTok.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                cl2.setVisibility(View.GONE);
            }
        });
        Button showTok = findViewById(R.id.showTok);
        showTok.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                cl2.setVisibility(View.VISIBLE);
            }
        });
        Button hideSha = findViewById(R.id.hideSha);
        hideSha.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                cl3.setVisibility(View.GONE);
            }
        });
        Button showSha = findViewById(R.id.showSha);
        showSha.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                cl3.setVisibility(View.VISIBLE);
            }
        });
        Button hideYork = findViewById(R.id.hideYork);
        hideYork.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                cl4.setVisibility(View.GONE);
            }
        });
        Button showYork = findViewById(R.id.showYork);
        showYork.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                cl4.setVisibility(View.VISIBLE);
            }
        });
        Button hideEgy = findViewById(R.id.hideEgy);
        hideEgy.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                cl5.setVisibility(View.GONE);
            }
        });
        Button showEgy = findViewById(R.id.showEgy);
        showEgy.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                cl5.setVisibility(View.VISIBLE);
            }
        });
    }
}