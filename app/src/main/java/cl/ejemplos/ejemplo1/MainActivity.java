package cl.ejemplos.ejemplo1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=(Button) findViewById(R.id.buscar_pais);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickBuscarPais(view);
            }
        });
    }

    public void onClickBuscarPais(View view)
    {
        Spinner pais=(Spinner) findViewById(R.id.pais);
        TextView resultado=(TextView) findViewById(R.id.resultado);
        String elegido=String.valueOf(pais.getSelectedItem());
        resultado.setText("El país seleccionado es: "+elegido);
    }
}











