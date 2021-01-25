package com.example.mylib.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mylib.R;
import com.example.seclib.SecLib;

//import cn.smssdk.gui.RegisterPage;

public class MyLibActivity extends Activity implements View.OnClickListener {
	private Button goToThirdBtn;
	private Button goToSmsBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);
		initView();
	}

	private void initView() {
		goToThirdBtn = findViewById(R.id.second_go_to_third);
		goToThirdBtn.setOnClickListener(this);
		goToSmsBtn = findViewById(R.id.second_go_to_sms_btn);
		goToSmsBtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		if (id == R.id.second_go_to_third) {
			SecLib.goToSecLibActivity(this);
		} else if (id == R.id.second_go_to_sms_btn) {
//			RegisterPage page = new RegisterPage();
//			page.show(this);
		}
	}
}
