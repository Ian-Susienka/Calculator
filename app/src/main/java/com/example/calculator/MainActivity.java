package com.example.calculator;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    String num1 = "";
    String num2 = "";
    String num3 = "";

    double temp1 = 0;
    double temp2 = 0;
    double temp3 = 0;

    String m_Operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final TextView textView = findViewById(R.id.textView);

        final Button button0 = findViewById(R.id.button24);
        final Button button1 = findViewById(R.id.button21);
        final Button button2 = findViewById(R.id.button20);
        final Button button3 = findViewById(R.id.button19);
        final Button button4 = findViewById(R.id.button17);
        final Button button5 = findViewById(R.id.button16);
        final Button button6 = findViewById(R.id.button15);
        final Button button7 = findViewById(R.id.button13);
        final Button button8 = findViewById(R.id.button12);
        final Button button9 = findViewById(R.id.button11);

        final Button buttonPlus = findViewById(R.id.button18);
        final Button buttonMinus = findViewById(R.id.button14);
        final Button buttonMultiple = findViewById(R.id.button10);
        final Button buttonDivide = findViewById(R.id.button6);
        final Button buttonClear = findViewById(R.id.button9);
        final Button buttonDecimal = findViewById(R.id.button23);
        final Button buttonEqual = findViewById(R.id.button22);

        button0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(m_Operator == "")
                {
                    String buttonText1 = textView.getText().toString();
                    textView.setText(buttonText1 + "0");
                    num1 = textView.getText().toString();
                }
                else if(m_Operator != "")
                {
                    String buttonText1 = textView.getText().toString();
                    textView.setText(buttonText1 + "0");
                    num2 = textView.getText().toString();
                }

            }
        });
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(m_Operator == "")
                {
                    String buttonText2 = textView.getText().toString();
                    textView.setText(buttonText2 + "1");
                    num1 = textView.getText().toString();
                }
                else if(m_Operator != "")
                {
                    String buttonText2 = textView.getText().toString();
                    textView.setText(buttonText2 + "1");
                    num2 = textView.getText().toString();
                }
            }
        });
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(m_Operator == "")
                {
                    String buttonText3 = textView.getText().toString();
                    textView.setText(buttonText3 + "2");
                    num1 = textView.getText().toString();
                }
                else if(m_Operator != "")
                {
                    String buttonText3 = textView.getText().toString();
                    textView.setText(buttonText3 + "2");
                    num2 = textView.getText().toString();
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(m_Operator == "")
                {
                    String buttonText4 = textView.getText().toString();
                    textView.setText(buttonText4 + "3");
                    num1 = textView.getText().toString();
                }
                else if(m_Operator != "")
                {
                    String buttonText4 = textView.getText().toString();
                    textView.setText(buttonText4 + "3");
                    num2 = textView.getText().toString();
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(m_Operator == "")
                {
                    String buttonText5 = textView.getText().toString();
                    textView.setText(buttonText5 + "4");
                    num1 = textView.getText().toString();
                }
                else if(m_Operator != "")
                {
                    String buttonText5 = textView.getText().toString();
                    textView.setText(buttonText5 + "4");
                    num2 = textView.getText().toString();
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(m_Operator == "")
                {
                    String buttonText6 = textView.getText().toString();
                    textView.setText(buttonText6 + "5");
                    num1 = textView.getText().toString();
                }
                else if(m_Operator != "")
                {
                    String buttonText6 = textView.getText().toString();
                    textView.setText(buttonText6 + "5");
                    num2 = textView.getText().toString();
                }
            }
        });
        button6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(m_Operator == "")
                {
                    String buttonText7 = textView.getText().toString();
                    textView.setText(buttonText7 + "6");
                    num1 = textView.getText().toString();
                }
                else if(m_Operator != "")
                {
                    String buttonText7 = textView.getText().toString();
                    textView.setText(buttonText7 + "6");
                    num2 = textView.getText().toString();
                }
            }
        });
        button7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(m_Operator == "")
                {
                    String buttonText8 = textView.getText().toString();
                    textView.setText(buttonText8 + "7");
                    num1 = textView.getText().toString();
                }
                else if(m_Operator != "")
                {
                    String buttonText8 = textView.getText().toString();
                    textView.setText(buttonText8 + "7");
                    num2 = textView.getText().toString();
                }
            }
        });
        button8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(m_Operator == "")
                {
                    String buttonText9 = textView.getText().toString();
                    textView.setText(buttonText9 + "8");
                    num1 = textView.getText().toString();
                }
                else if(m_Operator != "")
                {
                    String buttonText9 = textView.getText().toString();
                    textView.setText(buttonText9 + "8");
                    num2 = textView.getText().toString();
                }
            }
        });
        button9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                if(m_Operator == "")
                {
                    String buttonText10 = textView.getText().toString();
                    textView.setText(buttonText10 + "9");
                    num1 = textView.getText().toString();
                }
                else if(m_Operator != "")
                {
                    String buttonText10 = textView.getText().toString();
                    textView.setText(buttonText10 + "9");
                    num2 = textView.getText().toString();
                }
            }
        });

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String plusButton = textView.getText().toString();
                textView.setText(/*plusButton +*/ "+");
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String plusButton = textView.getText().toString();
                textView.setText(/*plusButton +*/ "-");
            }
        });

        buttonMultiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String plusButton = textView.getText().toString();
                textView.setText(/*plusButton +*/ "*");
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String plusButton = textView.getText().toString();
                textView.setText(/*plusButton +*/ "/");
            }
        });

        buttonDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String decimalButton = textView.getText().toString();
                textView.setText(decimalButton + ".");
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //String plusButton = textView.getText().toString();
                m_Operator = "";

                num1 = "";
                num2 = "";
                num3 = "";

                temp1 = 0;
                temp2 = 0;
                temp3 = 0;

                textView.setText(/*plusButton +*/ "");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                temp1 = Double.parseDouble(num1);
                temp2 = Double.parseDouble(num2);

                if (num2.substring(0) == "+" || num2.substring(0) == "-" || num2.substring(0) == "*" || num2.substring(0) == "/")
                {

                }

                if(m_Operator == "+")
                {
                    temp3 = temp1 + temp2;
                    num3 = Double.toString(temp3);
                    textView.setText(num3);
                }

                if (m_Operator == "-")
                {
                    temp3 = temp1 - temp2;
                    num3 = Double.toString(temp3);
                    textView.setText(num3);
                }

                if (m_Operator == "*")
                {
                    temp3 = temp1 * temp2;
                    num3 = Double.toString(temp3);
                    textView.setText(num3);
                }

                if (m_Operator == "/")
                {
                    temp3 = temp1 / temp2;
                    num3 = Double.toString(temp3);
                    textView.setText(num3);
                }

                //textView.setText();
            }
        });

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}