package sv.edu.utec.guia5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText etInfo;
    private Spinner sp_Item;
    private Paises objpaises;
    private Adaptador adaptadorpaises;
    private ArrayList<Paises> ListaPaises;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etInfo=findViewById(R.id.editTextTextMultiLine);
        sp_Item = findViewById(R.id.sp_item);
        iconosspinner();
        adaptadorpaises=new Adaptador(this,ListaPaises);
        sp_Item.setAdapter(adaptadorpaises);
    }
    public void iconosspinner(){
        ListaPaises=new ArrayList<>();
        ListaPaises.add(new Paises("El salvador",R.drawable.banderaesa));
        ListaPaises.add(new Paises("Costa Rica",R.drawable.banderacr));
        ListaPaises.add(new Paises("Guatemala",R.drawable.banderaguatemala));
        ListaPaises.add(new Paises("Honduras",R.drawable.banderahon));
        ListaPaises.add(new Paises("Nicaragua",R.drawable.banderanic));
        ListaPaises.add(new Paises("Panama",R.drawable.banderapan));
    }
    public void Almacenar(View v){
        String datos="";
        String seleccion = sp_Item.getSelectedItem().toString();
        String info;
        if(seleccion.equals("El Salvador")){
            datos="El Salvador";
        }else if(seleccion.equals("Guatemala")){
            datos="Honduras";
        }        else if(seleccion.equals("Honduras")){
            datos="Honduras";
        } else if (seleccion.equals("Nicaragua")) {
            datos="Nicaragua";
        }else if (seleccion.equals("Costa Rica")) {
            datos="Costa Rica";
        }else if (seleccion.equals("Panama")) {
            datos="Panama";
        }
        info="Usted selecciono: \n"+datos+ "\n";
        etInfo.append(info);
    }
}