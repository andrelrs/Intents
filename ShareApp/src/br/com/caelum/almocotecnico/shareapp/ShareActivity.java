package br.com.caelum.almocotecnico.shareapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

public class ShareActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_share);

		buscaInfos();
	}

	private void buscaInfos() {
		Bundle bundle = getIntent().getExtras();

		if (bundle != null) {
			String title = bundle.getString(Intent.EXTRA_TITLE);
			String text = bundle.getString(Intent.EXTRA_TEXT);

			preencheComponentes(title, text);
		}
	}

	private void preencheComponentes(String title, String text) {
		EditText titleEditText = (EditText) findViewById(R.id.title);
		EditText messageEditText = (EditText) findViewById(R.id.message);

		titleEditText.setText(title);
		messageEditText.setText(text);
	}

}
