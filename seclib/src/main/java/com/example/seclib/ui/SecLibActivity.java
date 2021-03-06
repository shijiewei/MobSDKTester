package com.example.seclib.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.seclib.R;

import cn.smssdk.gui.RegisterPage;

public class SecLibActivity extends Activity implements View.OnClickListener {
	private Button goToSmsBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sec_lib);
		initView();
	}

	private void initView() {
		goToSmsBtn = findViewById(R.id.sec_lib_go_to_sms);
		goToSmsBtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		if (id == R.id.sec_lib_go_to_sms) {
			RegisterPage page = new RegisterPage();
			page.show(this);
		}
	}
}
