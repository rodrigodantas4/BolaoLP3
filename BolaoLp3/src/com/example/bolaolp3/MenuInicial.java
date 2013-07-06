package com.example.bolaolp3;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MenuInicial extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu_inicial);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_inicial, menu);
		return true;
	}
	
	public void entrarTabela( View button){
    	startActivity(new Intent(this, Tabela.class));
    	}
	
	public void entrarTimes( View button){
    	startActivity(new Intent(this, Times.class));      
    	}
	
	public void entrarAjuda( View button){
    	startActivity(new Intent(this, Ajuda.class));      
    	}
    
	public void entrarJogos( View button){
    	startActivity(new Intent(this, Jogos.class));
    	}
	
	public void entrarBolao(View button){
		startActivity(new Intent(this, Boloes.class));
	}
	

}
