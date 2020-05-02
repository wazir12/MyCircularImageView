package com.lwazir.mycircularimageview

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout

class MyView(context: Context) : LinearLayout(context) {

   init{
       View.inflate(context,R.layout.my_views,this)
   }


}