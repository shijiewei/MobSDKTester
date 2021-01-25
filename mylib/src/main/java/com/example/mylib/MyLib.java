package com.example.mylib;

import android.content.Context;
import android.content.Intent;

import com.example.mylib.ui.MyLibActivity;

public class MyLib {
	public static String getModuleName() {
		return "This is MyLib";
	}

	public static void goToMyLibActivity(Context context) {
		Intent intent = new Intent(context, MyLibActivity.class);
		context.startActivity(intent);
	}
}
