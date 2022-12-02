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

    //CRIAR A BASE DE DADOS PARA OS FILMES
    String titulo[] = {"Bob Esponja", "Patrulha Canina", "Hotel Transilvânia", "Pinguins de Madagascar", "Sing 2", "Sonic 2"};
    String descricao[] = {getString(R.string.bob_esponja),
            getString(R.string.patrulha_canina),
            getString(R.string.hotel_transilvania),
            getString(R.string.pinguins_madagascar),
            getString(R.string.sing),
            getString(R.string.sonic)
    };
    String acesso[] = {"4.5", "4.0", "5.0", "2.0", "3.7", "1.0"};
    int filmes[] = {R.drawable.bobesponja, R.drawable.patrulha, R.drawable.hotel, R.drawable.pinguin, R.drawable.sing2, R.drawable.sonic};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaFilmes = findViewById(R.id.idListaFilmes);

        MyAdapter adapter = new MyAdapter();

        //preparar para instanciar o adaptador
        //listaFilmes.setAdapter(Adaptador);
    }

    public class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return filmes.length;
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

            //APRESENTANDO AS VARIAVEIS DO JAVA PARA O XML
            imagemFilme = v.findViewById(R.id.idImagemFilme);
            tituloFilme = v.findViewById(R.id.idTituloFilme);
            descricaoFilme = v.findViewById(R.id.idDescricaoFilme);
            avaliacao = v.findViewById(R.id.idAvaliacao);


            //inserindo valores nas variaveis
            tituloFilme.setText(titulo[i]);
            descricaoFilme.setText(descricao[i]);
            imagemFilme.setImageResource(filmes[i]);
            avaliacao.setText(acesso[i]);
            return v;
        }
    }
}