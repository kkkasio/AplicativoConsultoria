package consultoria.atm.atmempresaconsultoria;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private ImageView btnEmpresa,btnServicos,btnClientes,btnContato;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        inicializarComponentes();

        btnEmpresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              startActivity(new Intent(MainActivity.this,EmpresaActivity.class));
            }
        });

        btnServicos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ServicoActivity.class));
            }
        });

        btnClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ClienteActivity.class));
            }
        });

        btnContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,ContatoActivity.class));
            }
        });
    }

    private void inicializarComponentes() {
        btnEmpresa  = (ImageView) findViewById(R.id.empresa);
        btnServicos = (ImageView) findViewById(R.id.servicos);
        btnClientes = (ImageView) findViewById(R.id.clientes);
        btnContato  = (ImageView) findViewById(R.id.contato);
    }
}
