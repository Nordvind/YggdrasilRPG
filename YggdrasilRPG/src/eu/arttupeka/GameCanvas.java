package eu.arttupeka;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

public class GameCanvas extends View {
	
	private int scrWidth;
	private int scrHeight;
	private int bgBlockSide;

	public GameCanvas(Context context) {
		super(context);
		Display display = ((WindowManager) context.getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
		
		scrWidth = display.getWidth();
		scrHeight = display.getHeight();
		bgBlockSide = 64;
	}
	
	@Override
	public void onDraw(Canvas canv){
		Bitmap bgGrass = BitmapFactory.decodeResource(getResources(), R.drawable.grass);
		canv.drawColor(Color.BLACK);
		
		int blockWCount = Math.round(scrWidth/bgBlockSide);
		int blockHCount = Math.round(scrHeight/bgBlockSide);
		
		for(int i=0; i < blockWCount; i++){
			for(int j=0; j < blockHCount; j++){
				canv.drawBitmap(bgGrass, i*bgBlockSide, j*bgBlockSide, null);
			}
		}
		
		canv.drawBitmap(bgGrass, 10, 10, null);
	}

}
