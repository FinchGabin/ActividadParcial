package mx.com.gabinriestrin.actividadparcial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView txtTextView, txtTextView2, txtTextView3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //relación del textview de la interfaz con la variable que vamos a trabajar
        // se hace cast para que todo lo que venga del findViewid se convierta en TextView

        txtTextView = (TextView) findViewById(R.id.textView);
        txtTextView2 = (TextView) findViewById(R.id.textView2);
        txtTextView3 = (TextView) findViewById(R.id.textView3);

        //cambiar texto
        txtTextView.setText("Battle Angel");
        txtTextView2.setText("Como entrenar a tu dragón");
        txtTextView3.setText("Mis huellas a casa");


    }


}
