package com.sudarshan.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int sum, c1, c2, c3, c4, c5, c6, c7, c8, c9;
    public void tap1(View view)
    {
        ImageView blank1 = findViewById(R.id.blank1);
        ImageView cross1 = findViewById(R.id.cross1);
        ImageView ooo1 = findViewById(R.id.ooo1);
        if (c1==0)
        {
            if ( sum == 0)
            {
                blank1.animate().alpha(0).setDuration(500);
                cross1.animate().alpha(1).setDuration(500);
                sum = 1;
                c1 = 1;
            }
            else if (sum == 1)
            {
                blank1.animate().alpha(0).setDuration(500);
                ooo1.animate().alpha(1).setDuration(500);
                sum = 0;
                c1 = 1;
            }
        }else
        {
            Toast.makeText(MainActivity.this, "Wrong Input",Toast.LENGTH_SHORT).show();
        }
    }

    public void tap2(View view)
    {
        ImageView blank2 = findViewById(R.id.blank2);
        ImageView cross2 = findViewById(R.id.cross2);
        ImageView ooo2 = findViewById(R.id.ooo2);
        if (c2 == 0)
        {
            if ( sum == 0)
            {
                blank2.animate().alpha(0).setDuration(500);
                cross2.animate().alpha(1).setDuration(500);
                sum = 1;
                c2 = 1;
            }
            else if (sum == 1)
            {
                blank2.animate().alpha(0).setDuration(500);
                ooo2.animate().alpha(1).setDuration(500);
                sum = 0;
                c2 = 1;
            }
        }else
        {
            Toast.makeText(MainActivity.this, "Wrong Input",Toast.LENGTH_SHORT).show();
        }
    }

    public void tap3(View view)
    {
        ImageView blank3 = findViewById(R.id.blank3);
        ImageView cross3 = findViewById(R.id.cross3);
        ImageView ooo3 = findViewById(R.id.ooo3);
        if (c3==0)
        {
            if ( sum == 0)
            {
                blank3.animate().alpha(0).setDuration(500);
                cross3.animate().alpha(1).setDuration(500);
                sum = 1;
                c3 = 1;
            }
            else if (sum == 1)
            {
                blank3.animate().alpha(0).setDuration(500);
                ooo3.animate().alpha(1).setDuration(500);
                sum = 0;
                c3 = 1;
            }
        }else
        {
            Toast.makeText(MainActivity.this, "Wrong Input",Toast.LENGTH_SHORT).show();
        }
    }

    public void tap4(View view)
    {
        ImageView blank4 = findViewById(R.id.blank4);
        ImageView cross4 = findViewById(R.id.cross4);
        ImageView ooo4 = findViewById(R.id.ooo4);
        if ( c4 == 0)
        {
            if ( sum == 0)
            {
                blank4.animate().alpha(0).setDuration(500);
                cross4.animate().alpha(1).setDuration(500);
                sum = 1;
                c4 =1;
            }
            else if (sum == 1)
            {
                blank4.animate().alpha(0).setDuration(500);
                ooo4.animate().alpha(1).setDuration(500);
                sum = 0;
                c4 = 1;
            }
        }else
        {
            Toast.makeText(MainActivity.this, "Wrong Input",Toast.LENGTH_SHORT).show();
        }
    }

    public void tap5(View view)
    {
        ImageView blank5 = findViewById(R.id.blank5);
        ImageView cross5 = findViewById(R.id.cross5);
        ImageView ooo5 = findViewById(R.id.ooo5);
        if ( c5 == 0)
        {
            if ( sum == 0)
            {
                blank5.animate().alpha(0).setDuration(500);
                cross5.animate().alpha(1).setDuration(500);
                sum = 1;
                c5 = 1;
            }
            else if (sum == 1)
            {
                blank5.animate().alpha(0).setDuration(500);
                ooo5.animate().alpha(1).setDuration(500);
                sum = 0;
                c5 = 1;
            }
        }else
        {
            Toast.makeText(MainActivity.this, "Wrong Input",Toast.LENGTH_SHORT).show();
        }
    }

    public void tap6(View view)
    {
        ImageView blank6 = findViewById(R.id.blank6);
        ImageView cross6 = findViewById(R.id.cross6);
        ImageView ooo6 = findViewById(R.id.ooo6);
        if (c6 == 0)
        {
            if ( sum == 0)
            {
                blank6.animate().alpha(0).setDuration(500);
                cross6.animate().alpha(1).setDuration(500);
                sum = 1;
                c6 = 1;
            }
            else if (sum == 1)
            {
                blank6.animate().alpha(0).setDuration(500);
                ooo6.animate().alpha(1).setDuration(500);
                sum = 0;
                c6 = 1;
            }
        }else
        {
            Toast.makeText(MainActivity.this, "Wrong Input",Toast.LENGTH_SHORT).show();
        }
    }

    public void tap7(View view)
    {
        ImageView blank7 = findViewById(R.id.blank7);
        ImageView cross7 = findViewById(R.id.cross7);
        ImageView ooo7 = findViewById(R.id.ooo7);
        if (c7 == 0)
        {
            if ( sum == 0)
            {
                blank7.animate().alpha(0).setDuration(500);
                cross7.animate().alpha(1).setDuration(500);
                sum = 1;
                c7 = 1;
            }
            else if (sum == 1)
            {
                blank7.animate().alpha(0).setDuration(500);
                ooo7.animate().alpha(1).setDuration(500);
                sum = 0;
                c7 = 1;
            }
        }else
        {
            Toast.makeText(MainActivity.this, "Wrong Input",Toast.LENGTH_SHORT).show();
        }
    }

    public void tap8(View view)
    {
        ImageView blank8 = findViewById(R.id.blank8);
        ImageView cross8 = findViewById(R.id.cross8);
        ImageView ooo8 = findViewById(R.id.ooo8);
        if (c8 ==0 )
        {
            if ( sum == 0)
            {
                blank8.animate().alpha(0).setDuration(500);
                cross8.animate().alpha(1).setDuration(500);
                sum = 1;
                c8 = 1;
            }
            else if (sum == 1)
            {
                blank8.animate().alpha(0).setDuration(500);
                ooo8.animate().alpha(1).setDuration(500);
                sum = 0;
                c8 = 1;
            }
        }else
        {
            Toast.makeText(MainActivity.this, "Wrong Input",Toast.LENGTH_SHORT).show();
        }
    }

    public void tap9(View view)
    {
        ImageView blank9 = findViewById(R.id.blank9);
        ImageView cross9 = findViewById(R.id.cross9);
        ImageView ooo9 = findViewById(R.id.ooo9);
        if (c9 == 0)
        {
            if ( sum == 0)
            {
                blank9.animate().alpha(0).setDuration(500);
                cross9.animate().alpha(1).setDuration(500);
                sum = 1;
                c9 = 1;
            }
            else if (sum == 1)
            {
                blank9.animate().alpha(0).setDuration(500);
                ooo9.animate().alpha(1).setDuration(500);
                sum = 0;
                c9 = 1;
            }
        }else
        {
            Toast.makeText(MainActivity.this, "Wrong Input",Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
