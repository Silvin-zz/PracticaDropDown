package diplomado.ccm.itesm.practicadropdown;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;


public class DropDownActivity extends Activity {

    private Spinner sp1, sp2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drop_down);
        sp1 = (Spinner) findViewById(R.id.spinner1);
        sp2 = (Spinner) findViewById(R.id.spinner2);
        sp1.setOnItemSelectedListener(sp1Listener);
    }


    AdapterView.OnItemSelectedListener sp1Listener = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            String currentValue = sp1.getItemAtPosition(position).toString();
            List<String> l      = new ArrayList<String>();

            switch (currentValue){

                case "DF":
                    l.add("Miguel Hidalgo");
                    l.add("Benito Juarez");
                    l.add("Coyoacan");

                    break;

                case "PUEBLA":
                    l.add("Puebla");
                    l.add("Tehuacan");

                    break;

                case "NUEVO LEON":
                    l.add("Monterrey");
                    l.add("Apocada");

                    break;

                case "VERACRUZ":
                    l.add("Veracruz");
                    l.add("Xalapa");
                    l.add("Orizaba");

                    break;

                default:
                    l.add("Sin Registros");

                    break;

            }


            ArrayAdapter<String> aa = new ArrayAdapter<String>(DropDownActivity.this , android.R.layout.simple_spinner_item, l);
            aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            sp2.setAdapter(aa);
        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {

        }
    };


}
