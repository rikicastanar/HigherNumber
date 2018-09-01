package ics.castanar.mariaconcepcion.highernumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText first = (EditText) findViewById(R.id.first);
                EditText second = (EditText) findViewById(R.id.second);

                TextView textView = (TextView) findViewById(R.id.textView);

                int one = Integer.parseInt(first.getText().toString());
                int two = Integer.parseInt(second.getText().toString());

               // int result = Integer.parseInt(textView.getText().toString());

                if (one > two) {

                    textView.setText(        one + " is greater than " + two );
                    //textView.setText(Integer.toString(result));
                    }

                    else if (two > one) {

                    textView.setText(        two + " is greater than " + one );
                }
                else {
                    textView.setText(" The numbers are equal ");


                     }


                }


        });
    }
}


