package com.example.catalogodelivros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private Button bt_cadastrar,bt_pesquisar;
    private RadioGroup rg_pesquisar;
    private EditText et_pesquisar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_cadastrar = findViewById(R.id.bt_cadastrar);
        bt_pesquisar =findViewById(R.id.bt_pesquisa);
        rg_pesquisar = findViewById(R.id.radiogroup);
        et_pesquisar = findViewById(R.id.et_pesquisa);

        bt_cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cadastro = new Intent(MainActivity.this,Cadastro.class);
                startActivity(cadastro);
            }
        });

        bt_pesquisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pesquisar = new Intent(MainActivity.this,Pesquisa.class);
                int id = rg_pesquisar.getCheckedRadioButtonId();
                String buscar = et_pesquisar.getText().toString();

                pesquisar.putExtra("tipo",id);
                pesquisar.putExtra("busca",buscar);
                startActivity(pesquisar);
            }
        });
    }
}