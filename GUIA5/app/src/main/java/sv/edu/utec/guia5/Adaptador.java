package sv.edu.utec.guia5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;
public class Adaptador extends BaseAdapter{
    private Context contexto;
    private List<Paises>listaPaises;
    public Adaptador(Context context, List<Paises> listaPaises){
        this.contexto = context;
        this.listaPaises= listaPaises;
    }
    @Override
    public int getCount() {
        return listaPaises.size();
    }

    @Override
    public Object getItem(int position) {
        return listaPaises.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View Vista = convertView;
        LayoutInflater inflate = LayoutInflater.from(contexto);
        Vista=inflate.inflate(R.layout.item_spinner,null);

        ImageView imagen=Vista.findViewById(R.id.iv_pais);
        TextView descripction = Vista.findViewById(R.id.tv_texto);

        imagen.setImageResource(listaPaises.get(position).getImagen());
        descripction.setText(listaPaises.get(position).getNombre());

        return Vista;
    }



}