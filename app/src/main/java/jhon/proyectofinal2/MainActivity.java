package jhon.proyectofinal2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double indiceMC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     *  This method calculates the IMC
     */
    public void calculateIMC(View view) {

        EditText idPeso = (EditText) findViewById(R.id.idPeso);
        EditText idEstatura = (EditText) findViewById(R.id.idEstatura);

        double estatura = Double.parseDouble(idEstatura.getText().toString());
        double peso = Double.parseDouble(idPeso.getText().toString());
        indiceMC = peso / (Math.pow(estatura, 2));

        indiceMC = Math.rint(indiceMC*10)/10;

        TextView calcular = (TextView)findViewById(R.id.indice);
        calcular.setText("" + indiceMC);


    }


}
