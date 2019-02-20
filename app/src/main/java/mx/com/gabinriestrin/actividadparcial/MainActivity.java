package mx.com.gabinriestrin.actividadparcial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView txtTextView, txtTextView2, txtTextView3, txtDescripcion1, txtDescripcion2, txtDescripcion3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //relación del textview de la interfaz con la variable que vamos a trabajar
        // se hace cast para que todo lo que venga del findViewid se convierta en TextView

        txtTextView = (TextView) findViewById(R.id.textView);
        txtTextView2 = (TextView) findViewById(R.id.textView2);
        txtTextView3 = (TextView) findViewById(R.id.textView3);
        txtDescripcion1 = (TextView) findViewById(R.id.textView4);
        txtDescripcion2 = (TextView) findViewById(R.id.textView5);
        txtDescripcion3 = (TextView) findViewById(R.id.textView6);


        //cambiar texto
        txtTextView.setText("Battle Angel");
        txtTextView2.setText("Como entrenar a tu dragón");
        txtTextView3.setText("Mis huellas a casa");
        txtDescripcion1.setText("Un robot ojon que pelea");
        txtDescripcion2.setText("Otro mata dragones");
        txtDescripcion3.setText("Una perrita volviendo a casa");




    }


}
