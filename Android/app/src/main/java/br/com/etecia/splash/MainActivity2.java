package br.com.etecia.splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class dois extends AppCompatActivity {
    private Object CheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText edtusuario, edtsenha;
        Button btnentrar,btnesqueceu;
        CheckBox guardar;
        edtusuario = findViewById(R.id.edtusuario);
        edtsenha = findViewById(R.id.edtsenha);
        btnentrar = findViewById(R.id.btnentrar);
        btnesqueceu = findViewById(R.id.btnesqueceu);
        guardar = findViewById(R.id.guardar);

        if (edtusuario.equals("ryangaspri") && edtsenha.equals("ryan123")) {

            Toast.makeText(getApplicationContext(), "Bem vindo ao sistema!!!", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(getApplicationContext(), "Usuário ou senha inválidos!!!", Toast.LENGTH_SHORT).show();
            edtusuario.setText("");
            edtsenha.setText("");
            edtusuario.requestFocus();
        }

        btnentrar = btnentrar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext()
                        "Você entrou",
                        Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);

            }
        });

        btnesqueceu = btnesqueceu.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View View)
            {
                Toast.makeText(getApplicationContext()
                        "mude sua senha",
                        Toast.LENGTH_SHORT).show();
            }
        });

        public void onCheckboxClicked(View v) {
            boolean checked = ((CheckBox) ).isChecked();

            switch(v.getId(R.id.guardar))
            {
                case R.id.guardar:
                    if (checked)
                        // Guardar usuario
                        Toast.makeText(getApplicationContext()
                                "usuario sera guardado",
                                Toast.LENGTH_SHORT).show();
                    else
                        // Não guardar usuario
                        Toast.makeText(getApplicationContext()
                                "usuario não será guardado",
                                Toast.LENGTH_SHORT).show();
                    break;
            }
        };

    } ;

}