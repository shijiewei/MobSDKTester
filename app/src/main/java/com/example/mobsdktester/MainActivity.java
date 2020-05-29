package com.example.mobsdktester;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.mylib.MyLib;

import cn.smssdk.gui.RegisterPage;

public class MainActivity extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	private void initView() {
		TextView testTv = findViewById(R.id.btn_go_to_second_btn);
		testTv.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		if (id == R.id.btn_go_to_second_btn) {
//			MyLib.goToSecondActivity(this);
			RegisterPage page = new RegisterPage();
			page.show(this);
		}
	}
}
