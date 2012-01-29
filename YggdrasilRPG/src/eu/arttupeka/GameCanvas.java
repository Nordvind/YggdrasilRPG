package eu.arttupeka;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class GameCanvas extends View {

	public GameCanvas(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void onDraw(Canvas canv){
		canv.drawColor(Color.BLACK);
	}

}
