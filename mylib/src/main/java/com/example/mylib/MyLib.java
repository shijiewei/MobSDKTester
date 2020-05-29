package com.example.mylib;

import android.content.Context;
import android.content.Intent;

import com.example.mylib.ui.SecondActivity;

public class MyLib {
	public static String getModuleName() {
		return "This is MyLib";
	}

	public static void goToSecondActivity(Context context) {
		Intent intent = new Intent(context, SecondActivity.class);
		context.startActivity(intent);
	}
}
