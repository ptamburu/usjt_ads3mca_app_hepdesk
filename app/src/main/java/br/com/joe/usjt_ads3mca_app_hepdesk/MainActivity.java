package br.com.joe.usjt_ads3mca_app_hepdesk;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.ListAdapter;

public class MainActivity extends AppCompatActivity {
    private EditText nomeFilaEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeFilaEditText = findViewById(R.id.nomeFilaEditText);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomeFila = nomeFilaEditText.getEditableText().toString();
                Intent intent =
                        new Intent(MainActivity.this, ListaChamadosActivity.class);
                        intent.putExtra("nome_fila", nome_fila);
                        startActivity(intent);
            }

        });
    }


}
