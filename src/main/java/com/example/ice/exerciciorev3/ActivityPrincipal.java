package com.example.ice.exerciciorev3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityPrincipal extends AppCompatActivity {

    private TextView txt1;
    private Button btn1;
    private Button btn2;
    private Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txt1 = (TextView) findViewById(R.id.saida);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);

        mudarTexto mudar = new mudarTexto();
        btn1.setOnClickListener(mudar);
        btn2.setOnClickListener(mudar);
        btn3.setOnClickListener(mudar);

    }

    private class mudarTexto implements View.OnClickListener
    {
        @Override
        public void onClick(View view)
        {
          if(view.equals(btn1))
          {
            txt1.setText(btn1.getText());
          }
          else if (view.equals(btn2))
          {
              txt1.setText(btn2.getText());
          }
          else
              txt1.setText(btn3.getText());

        }
    }
}
