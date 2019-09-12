package br.edu.unifcv.appcalculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button botao0, botao1, botao2, botao3, botao4, botao5, botao6, botao7, botao8,
            botao9, botaoPonto, botaoIgual, botaoSomar, botaoSubtrair, botaoMultiplicar, botaoDividir, botaoApagar;
    Boolean bVirgula;
    EditText etProcesso, etconcatenar;
    double valor1, valor2, resultado;
    String operacao;

    public void Apagar(){
        valor1 = 0;
        valor2 = 0;
        etProcesso.setText("");
        bVirgula = false;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bVirgula = false;

        botaoApagar = (Button)findViewById(R.id.botaoApagar);
        botao0 = (Button)findViewById(R.id.botao0);
        botao1 = (Button)findViewById(R.id.botao1);
        botao2 = (Button)findViewById(R.id.botao2);
        botao3 = (Button)findViewById(R.id.botao3);
        botao4 = (Button)findViewById(R.id.botao4);
        botao5 = (Button)findViewById(R.id.botao5);
        botao6 = (Button)findViewById(R.id.botao6);
        botao7 = (Button)findViewById(R.id.botao7);
        botao8 = (Button)findViewById(R.id.botao8);
        botao9 = (Button)findViewById(R.id.botao9);
        botaoPonto = (Button)findViewById(R.id.botaoPonto);
        botaoIgual = (Button)findViewById(R.id.botaoIgual);
        botaoSomar = (Button)findViewById(R.id.botaoSomar);
        botaoSubtrair = (Button)findViewById(R.id.botaoSubtrair);
        botaoMultiplicar = (Button)findViewById(R.id.botaoMultiplicar);
        botaoDividir = (Button)findViewById(R.id.botaoDividir);
        etProcesso = (EditText)findViewById(R.id.etProcesso);

        botao0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProcesso);
                etProcesso.setText(etconcatenar.getText().toString() + "0");
                etProcesso.setError(null);
            }
        });
        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProcesso);
                etProcesso.setText(etconcatenar.getText().toString() + "1");
                etProcesso.setError(null);

            }
        });
        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProcesso);
                etProcesso.setText(etconcatenar.getText().toString() + "2");
                etProcesso.setError(null);
            }
        });
        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProcesso);
                etProcesso.setText(etconcatenar.getText().toString() + "3");
                etProcesso.setError(null);
            }
        });
        botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProcesso);
                etProcesso.setText(etconcatenar.getText().toString() + "4");
                etProcesso.setError(null);
            }
        });
        botao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProcesso);
                etProcesso.setText(etconcatenar.getText().toString() + "5");
                etProcesso.setError(null);
            }
        });
        botao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProcesso);
                etProcesso.setText(etconcatenar.getText().toString() + "6");
                etProcesso.setError(null);
            }
        });
        botao7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProcesso);
                etProcesso.setText(etconcatenar.getText().toString() + "7");
                etProcesso.setError(null);
            }
        });
        botao8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProcesso);
                etProcesso.setText(etconcatenar.getText().toString() + "8");
                etProcesso.setError(null);
            }
        });
        botao9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProcesso);
                etProcesso.setText(etconcatenar.getText().toString() + "9");
                etProcesso.setError(null);
            }
        });
        botaoPonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bVirgula == false) {
                    etconcatenar = (EditText) findViewById(R.id.etProcesso);
                    etProcesso.setText(etconcatenar.getText().toString() + ".");
                    bVirgula = true;
                }
            }
        });
        botaoIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etconcatenar = (EditText)findViewById(R.id.etProcesso);
                valor2 = Double.parseDouble(etconcatenar.getText().toString());
                if(operacao.equals("+")){
                    etProcesso.setText("");
                    resultado = valor1 + valor2;
                }
                if(operacao.equals("-")){
                    etProcesso.setText("");
                    resultado = valor1 - valor2;
                }
                if(operacao.equals("*")){
                    etProcesso.setText("");
                    resultado = valor1 * valor2;
                }
                if(operacao.equals("/")){
                    etProcesso.setText("");
                    if(valor2 != 0){
                        resultado = valor1 / valor2;
                    }else {
                        etProcesso.setError("Não é possivel dividir um valor por 0");
                        Apagar();
                        return;
                    }
                }
                etProcesso.setText(String.valueOf(resultado));
            }
        });
        botaoSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "+";
                etconcatenar = (EditText)findViewById(R.id.etProcesso);
                valor1 = Double.parseDouble(etconcatenar.getText().toString());
                etProcesso.setText("");
                bVirgula = false;
            }
        });
        botaoSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "-";
                etconcatenar = (EditText)findViewById(R.id.etProcesso);
                valor1 = Double.parseDouble(etconcatenar.getText().toString());
                etProcesso.setText("");
                bVirgula = false;
            }
        });
        botaoMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "*";
                etconcatenar = (EditText)findViewById(R.id.etProcesso);
                valor1 = Double.parseDouble(etconcatenar.getText().toString());
                etProcesso.setText("");
                bVirgula = false;
            }
        });
        botaoDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = "/";
                etProcesso.setError(null);
                etconcatenar = (EditText)findViewById(R.id.etProcesso);
                valor1 = Double.parseDouble(etconcatenar.getText().toString());
                etProcesso.setText("");
                bVirgula = false;
            }
        });

            botaoApagar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Apagar();
                    etProcesso.setError(null);
                }
            });
    }
}