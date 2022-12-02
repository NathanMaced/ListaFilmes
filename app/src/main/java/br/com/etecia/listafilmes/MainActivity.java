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
    String descricao[] = {"Bob Esponja e seu amigo Patrick, uma estrela do mar, embarcam em uma missão para limpar o nome do Sr. Sirigueijo, o proprietário do restaurante Siri Cascudo, que foi acusado de roubar a coroa do rei Netuno. Saindo dos limites familiares, Bob Esponja e Patrick aventuram-se para procurar a coroa de Netuno, mas encontrarão vários obstáculos no caminho.",
            "O filhote Ryder e seus amigos têm um grande desafio: impedir o novo prefeito da cidade, Humdinger, de causar muitos problemas. Juntos e equipados com muita tecnologia, a Patrulha Canina luta para salvar os moradores da Cidade da Aventura.",
            "A nova invenção de Van Helsing transforma Drac e os amigos em humanos, e Johnny em um monstro. Agora, Drac deve encontrar uma maneira de reverter o feitiço antes que a mudança se torne permanente.",
            "Os valentes pinguins Capitão, Kowalski, Rico e Recruta se unem a uma força de elite, chamada Vento do Norte, para impedir que o vilão Dr. Octavius Brine acabe com os pinguins do mundo todo.",
            "Na glamourosa cidade de Redshore, Buster Moon e a galera enfrentam seus medos, fazem novos amigos e superam seus limites em uma jornada para convencer o recluso astro Clay Calloway a subir aos palcos novamente.",
            "O Dr. Robotnik retorna à procura de uma esmeralda mística que tem o poder de destruir civilizações. Para detê-lo, Sonic se une a seu antigo parceiro, Tails, e parte em uma jornada para encontrar a joia antes que ela caia em mãos erradas."
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
        listaFilmes.setAdapter(adapter);
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