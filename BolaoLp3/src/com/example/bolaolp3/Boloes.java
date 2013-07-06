package com.example.bolaolp3;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class Boloes extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_boloes);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.boloes, menu);
		return true;
	}
	
	public void criarBolao(View button){
		startActivity(new Intent(this, NovoBolao.class));
	}
	
	public void mostraPontuacao(View button){
		startActivity(new Intent(this, Pontuacao.class));
	}
}
