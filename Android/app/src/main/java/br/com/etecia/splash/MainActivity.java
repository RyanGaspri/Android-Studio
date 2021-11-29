package br.com.etecia.splash;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnentrar, btncadastrar,  btnfacebook, btntwitter, btnlinkedin;


        btnfacebook = findViewById(R.id.btnface);
        btnlinkedin = findViewById(R.id.btnlinkedin);

        btnfacebook = btnfacebook.setOnClickListener();
        btnlinkedin = btnlinkedin.setOnClickListener();

        btnfacebook.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext(),
                        "https://pt-br.facebook.com/",
                        Toast.LENGTH_SHORT).show();
            }
        });


        btnlinkedin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext(),
                        "https://br.linkedin.com/",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
