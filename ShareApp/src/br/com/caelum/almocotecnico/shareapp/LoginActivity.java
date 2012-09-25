package br.com.caelum.almocotecnico.shareapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void logar(View v) {
    	Intent share = new Intent(this, ShareActivity.class);
    	share.putExtra("userId", 666);
    	setResult(RESULT_OK, share);
    	startActivity(share);
    	finish();
    }
}
