package com.examples.mycalculator;

import android.content.Context;
import android.widget.Toast;

public class Calculate {

    public static void Show(Context context,String message)
    {
        Toast.makeText(context, message+"", Toast.LENGTH_SHORT).show();
    }

}
