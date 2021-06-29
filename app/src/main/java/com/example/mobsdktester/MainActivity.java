package com.example.mobsdktester;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.mylib.MyLib;
import com.mob.MobSDK;

import cn.smssdk.gui.RegisterPage;

public class MainActivity extends Activity implements View.OnClickListener {
	private Button goToSecBtn;
	private Button goToSmsBtn;
	private Button btnAgreePolicy;
	private Button btnInvokeIsForb;

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
		btnAgreePolicy = findViewById(R.id.main_btn_agree_policy);
		btnAgreePolicy.setOnClickListener(this);
		btnInvokeIsForb = findViewById(R.id.main_btn_invoke_isforb);
		btnInvokeIsForb.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		int id = v.getId();
		if (id == R.id.main_go_to_my_lib) {
			MyLib.goToMyLibActivity(this);
		} else if (id == R.id.main_add_go_to_sms_btn) {
			RegisterPage page = new RegisterPage();
			page.show(this);
		} else if (id == R.id.main_btn_agree_policy) {
			MobSDK.submitPolicyGrantResult(true, null);
			Toast.makeText(this, "已同意，您可以随心所欲了", Toast.LENGTH_SHORT).show();
		} else if (id == R.id.main_btn_invoke_isforb) {
			boolean isForb = MobSDK.isForb();
			Toast.makeText(this, "isForb: " + isForb, Toast.LENGTH_SHORT).show();
		}
	}
}
