package com.example.seclib;

import android.content.Context;
import android.content.Intent;

import com.example.seclib.ui.ThirdActivity;

public class SecLib {
	public static String getModuleName() {
		return "This is SecLib";
	}

	public static void goToThirdActivity(Context context) {
		Intent intent = new Intent(context, ThirdActivity.class);
		context.startActivity(intent);
	}
}
