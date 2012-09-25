package br.com.caelum.almocotecnico.shareapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StartActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new View(this));
        
        startActivity(new Intent(this, LoginActivity.class));
        finish();
    }

}
