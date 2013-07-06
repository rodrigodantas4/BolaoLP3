package com.example.bolaolp3;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class NovoBolao extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_novo_bolao);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.novo_bolao, menu);
		return true;
	}
	
	/*
	 * 
	 * Metodos para criação de um novo bolão
	 * 
	 * 
	 */
	
	public void atualizaBolao(View button){
		startActivity(new Intent(this, Boloes.class));
	}
}
