package com.example.mobsdktester;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.mylib.MyLib;

//import cn.smssdk.gui.RegisterPage;

public class MainActivity extends Activity implements View.OnClickListener {
	private Button goToSecBtn;
	private Button goToSmsBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	private void initView() {
		goToSecBtn = findViewById(R.id.main_go_to_my_lib);
		goToSecBtn.setOnClickListener(this);
		goToSmsBtn = findViewById(R.id.main_add_go_to_sms_btn);
		goToSmsBtn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		if (id == R.id.main_go_to_my_lib) {
			MyLib.goToMyLibActivity(this);
		} else if (id == R.id.main_add_go_to_sms_btn) {
//			RegisterPage page = new RegisterPage();
//			page.show(this);
		}
	}
}
