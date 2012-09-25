package br.com.caelum.almocotecnico.useshareapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void share(View v) {
//    	compartilhar();
    	startActivityForResult(new Intent("br.com.caelum.almocotecnico.shareapp.LoginActivity"), 1234);
    }

	private void compartilhar() {
		Intent send = new Intent(Intent.ACTION_SEND);
    	send.setType("text/plain");
    	send.putExtra(Intent.EXTRA_TITLE, "Almoço técnico");
    	send.putExtra(Intent.EXTRA_TEXT, "balblablablalbalbalblablalb");
    	
    	startActivity(send);
	}
    
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == 1234 && resultCode == RESULT_OK) {
			int userId = data.getIntExtra("userId", -1);
			Toast.makeText(this, "User id é " + userId, Toast.LENGTH_LONG).show();
		}
	}
}
