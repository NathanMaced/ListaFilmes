package br.com.etecia.listafilmes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listaFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaFilmes = findViewById(R.id.idListaFilmes);

        MyAdapter adapter = new MyAdapter();

        //preparar para instanciar o adaptador
        listaFilmes.setAdapter(Adaptador);
    }
    public class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            ImageView imagemFilme;
            TextView tituloFilme, descricaoFilme, avaliacao;

            //ADAPTADOR LIGANDO AO MODELO

            View v = getLayoutInflater().inflate(R.layout.modelo_filmes, null);

            imagemFilme = v.findViewById(R.id.idImagemFilme);
            tituloFilme = v.findViewById(R.id.idTituloFilme);
            descricaoFilme = v.findViewById(R.id.idDescricaoFilme);
            avaliacao = v.findViewById(R.id.idAvaliacao);

            return null;
        }
    }
}