package com.example.test3;
  
import android.app.Activity;  
import android.content.Context;  
import android.graphics.Canvas;  
import android.graphics.Color;  
import android.graphics.Paint;  
import android.os.Bundle;  
import android.view.View;  
   
public class MainActivity extends Activity {  
   
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
   
        setContentView(new AnimateView(this));//這邊傳入的this代表這個對象，因為Activity是繼承自Content類的，因此該對象也  
                                             
    }  
   
    class AnimateView extends View{  
   
        float radius = 10;  
        Paint paint;  
   
        public AnimateView(Context context) {  
            super(context);  
            paint = new Paint();  
            paint.setColor(Color.BLACK);  
            paint.setStyle(Paint.Style.STROKE);  
        }  
   
        @Override  
        protected void onDraw(Canvas canvas) {  
   
            canvas.translate(500, 500);  
            canvas.drawCircle(0, 0, radius++, paint);            
   
            if(radius > 100){  
                radius = 10;  
            }  
   
            invalidate();//通过调用这个方法让系统自动刷新视图  
   
        }  
   
    }  
   
}