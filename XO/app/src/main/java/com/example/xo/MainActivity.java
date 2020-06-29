package com.example.xo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    MediaPlayer mysong;

    Boolean Xturn = true;
    TextView turn;
    int[] Xarray = new int[9];
    int[] Oarray = new int[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
mysong = MediaPlayer.create(MainActivity.this, R.raw.hary);
mysong.start();
        final Button zero = findViewById(R.id.button0);
        final Button one = findViewById(R.id.button1);
        final Button two = findViewById(R.id.button2);
        final Button three = findViewById(R.id.button3);
        final Button fore = findViewById(R.id.button4);
        final Button five = findViewById(R.id.button5);
        final Button six = findViewById(R.id.button6);
        final Button seven = findViewById(R.id.button7);
        final Button eight = findViewById(R.id.button8);

        turn = findViewById(R.id.textView);

        Button reset = findViewById(R.id.button12);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                zero.setText("");
                one.setText("");
                two.setText("");
                three.setText("");
                fore.setText("");
                five.setText("");
                six.setText("");
                seven.setText("");
                eight.setText("");

                for (int i = 0; i < Xarray.length; i++) {
                    Xarray[i] = 0;
                }
                for (int i = 0; i < Oarray.length; i++) {
                    Oarray[i] = 0;
                }


            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[0] = 1;
                    chackXwin();
                    zero.setText("X");
                } else {
                    Oarray[0] = 1;
                    chackOwin();
                    zero.setText("O");
                }
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[1] = 1;
                    chackXwin();
                    one.setText("X");
                } else {
                    Oarray[1] = 1;
                    chackOwin();
                    one.setText("O");
                }
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[2] = 1;
                    chackXwin();
                    two.setText("X");
                } else {
                    Oarray[2] = 1;
                    chackOwin();
                    two.setText("O");
                }
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[3] = 1;
                    chackXwin();
                    three.setText("X");
                } else {
                    Oarray[3] = 1;
                    chackOwin();
                    three.setText("O");

                }
            }
        });
        fore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[4] = 1;
                    chackXwin();

                    fore.setText("X");
                } else {
                    Oarray[4] = 1;
                    chackOwin();
                    fore.setText("O");
                }
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[5] = 1;
                    chackXwin();
                    five.setText("X");
                } else {
                    Oarray[5] = 1;
                    chackOwin();
                    five.setText("O");
                }
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[6] = 1;
                    chackXwin();
                    six.setText("X");
                } else {
                    Oarray[6] = 1;
                    chackOwin();
                    six.setText("O");
                }
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[7] = 1;
                    chackXwin();
                    seven.setText("X");
                } else {
                    Oarray[7] = 1;
                    chackOwin();
                    seven.setText("O");
                }
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Xturn) {
                    Xarray[8] = 1;
                    chackXwin();
                    eight.setText("X");
                } else {
                    Oarray[8] = 1;
                    chackOwin();
                    eight.setText("O");
                }
            }
        });
    }
    private void chackOwin()
    {
        Xturn = true;

            turn.setText("X TURN");
            if (Oarray[0] == 1 && Oarray[1] == 1 && Oarray[2] == 1) {
                Toast.makeText(MainActivity.this, "O WON!!", Toast.LENGTH_SHORT).show();
            }
            if (Oarray[3] == 1 && Oarray[4] == 1 && Oarray[5] == 1) {
                Toast.makeText(MainActivity.this, "O WON!!", Toast.LENGTH_SHORT).show();
            }
            if (Oarray[6] == 1 && Oarray[7] == 1 && Oarray[8] == 1) {
                Toast.makeText(MainActivity.this, "O WON!!", Toast.LENGTH_SHORT).show();
            }
            if (Oarray[0] == 1 && Oarray[3] == 1 && Oarray[6] == 1) {
                Toast.makeText(MainActivity.this, "O WON!!", Toast.LENGTH_SHORT).show();
            }
            if (Oarray[1] == 1 && Oarray[4] == 1 && Oarray[7] == 1) {
                Toast.makeText(MainActivity.this, "O WON!!", Toast.LENGTH_SHORT).show();
            }
            if (Oarray[2] == 1 && Oarray[5] == 1 && Oarray[8] == 1) {
                Toast.makeText(MainActivity.this, "O WON!!", Toast.LENGTH_SHORT).show();
            }
            if (Oarray[0] == 1 && Oarray[4] == 1 && Oarray[8] == 1) {
                Toast.makeText(MainActivity.this, "O WON!!", Toast.LENGTH_SHORT).show();
            }
            if (Oarray[2] == 1 && Oarray[4] == 1 && Oarray[6] == 1) {
                Toast.makeText(MainActivity.this, "O WON!!", Toast.LENGTH_SHORT).show();
            }
        }


        public void chackXwin ()
        {
            Xturn = false;

            turn.setText("O TURN");

            if (Xarray[0] == 1 && Xarray[1] == 1 && Xarray[2] == 1) {
                Toast.makeText(MainActivity.this, "X WON!!", Toast.LENGTH_SHORT).show();
            }
            if (Xarray[3] == 1 && Xarray[4] == 1 && Xarray[5] == 1) {
                Toast.makeText(MainActivity.this, "X WON!!", Toast.LENGTH_SHORT).show();
            }
            if (Xarray[6] == 1 && Xarray[7] == 1 && Xarray[8] == 1) {
                Toast.makeText(MainActivity.this, "X WON!!", Toast.LENGTH_SHORT).show();
            }
            if (Xarray[0] == 1 && Xarray[3] == 1 && Xarray[6] == 1) {
                Toast.makeText(MainActivity.this, "X WON!!", Toast.LENGTH_SHORT).show();
            }
            if (Xarray[1] == 1 && Xarray[4] == 1 && Xarray[7] == 1) {
                Toast.makeText(MainActivity.this, "X WON!!", Toast.LENGTH_SHORT).show();
            }
            if (Xarray[2] == 1 && Xarray[5] == 1 && Xarray[8] == 1) {
                Toast.makeText(MainActivity.this, "X WON!!", Toast.LENGTH_SHORT).show();
            }
            if (Xarray[0] == 1 && Xarray[4] == 1 && Xarray[8] == 1) {
                Toast.makeText(MainActivity.this, "X WON!!", Toast.LENGTH_SHORT).show();
            }
            if (Xarray[2] == 1 && Xarray[4] == 1 && Xarray[6] == 1) {
                Toast.makeText(MainActivity.this, "X WON!!", Toast.LENGTH_SHORT).show();
            }


        }

    }
