package com.example.bluetooth;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ControllerActivity extends AppCompatActivity {
    int f = 0, b = 0, r = 0, l = 0;
    MainActivity.ConnectedBluetoothThread bluetoothThread;
    Button btnUp;
    Button btnDown;
    Button btnRight;
    Button btnLeft;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_controller);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });




        bluetoothThread = ((MainActivity)MainActivity.context_main).threadConnectedBluetooth;

        btnUp = findViewById(R.id.btnUp);
        btnDown = findViewById(R.id.btnDown);
        btnRight = findViewById(R.id.btnRight);
        btnLeft = findViewById(R.id.btnLeft);

        btnUp.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int status = motionEvent.getAction();
                f = 1;
                if ((r-l) == 0) {
                    go(f - b);
                }

                if (status == MotionEvent.ACTION_UP) {
                    f = 0;
                    go(0);
                }
                return false;
            }
        });
        btnDown.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int status = motionEvent.getAction();
                b = 1;
                if (r-l == 0) {
                    go(f - b);
                }

                if (status == MotionEvent.ACTION_UP) {
                    b = 0;
                    go(0);
                }
                return false;
            }
        });
        btnRight.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int status = motionEvent.getAction();
                r = 1;

                turn(r-l);


                if (status == MotionEvent.ACTION_UP) {
                    r = 0;
                    go(0);
                }
                return false;
            }
        });
        btnLeft.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int status = motionEvent.getAction();
                l = 1;

                turn(r-l);


                if (status == MotionEvent.ACTION_UP) {
                    l = 0;
                    go(0);
                }
                return false;
            }
        });




    }
    public void go(int d) {
        if (bluetoothThread != null) {
            if (d == 1) {
                bluetoothThread.write("1");
            } else if (d == 0) {
                bluetoothThread.write("0");
            } else if (d == -1) {
                bluetoothThread.write("2");
            }
        }
    }
    public void turn(int d) {
        if (bluetoothThread != null) {
            if (d == 0) {
                go(0);
            } else if (d == 1) {
                bluetoothThread.write("3");
            } else if (d == -1) {
                bluetoothThread.write("4");
            }
        }
    }
}