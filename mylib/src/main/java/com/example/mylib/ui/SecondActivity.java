package com.example.mylib.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mylib.R;

//import cn.smssdk.gui.RegisterPage;

public class SecondActivity extends Activity implements View.OnClickListener {
	private Button smsBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		initView();
	}

	private void initView() {
		smsBtn = findViewById(R.id.second_go_to_sms);
		smsBtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		if (id == R.id.second_go_to_sms) {
//			RegisterPage page = new RegisterPage();
//			page.show(this);
		}
	}
}
