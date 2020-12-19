package com.example.awesometoast

import android.content.Context
import android.widget.Toast

class AwesomeToast {
    companion object {

        fun ShowMessage(context: Context, message: String, duration: Int) {
            Toast.makeText(context, message, duration).show()
        }

    }
}