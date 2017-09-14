package grupopbarragan.dam.isi.frsf.lab03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {


    private ListView lv_listaOfertas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_listaOfertas = (ListView) findViewById(R.id.ListView_listaOfertaLaboral);
        lv_listaOfertas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Oferta: "+((AdaptadorLaboral.OfertaViewHolder)view.getTag()).tvTrabajo, Toast.LENGTH_SHORT).show();
            }
        });

        AdaptadorLaboral adp = new AdaptadorLaboral(this.getApplicationContext(), Arrays.asList(Trabajo.TRABAJOS_MOCK));

        lv_listaOfertas.setAdapter(adp);
    }
}
