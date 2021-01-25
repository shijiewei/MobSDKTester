package com.example.seclib;

import android.content.Context;
import android.content.Intent;

import com.example.seclib.ui.SecLibActivity;

public class SecLib {
	public static String getModuleName() {
		return "This is SecLib";
	}

	public static void goToSecLibActivity(Context context) {
		Intent intent = new Intent(context, SecLibActivity.class);
		context.startActivity(intent);
	}
}
