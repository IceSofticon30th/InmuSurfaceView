package si.f5.ice.inmudivision;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

/**
 * Created by i-noc on 15/04/05.
 */
public class InmuSurfaceHolderCallback implements SurfaceHolder.Callback, Runnable {

	private SurfaceHolder holder = null;
	private Thread thread = null;

	@Override
	public void surfaceCreated(SurfaceHolder holder) {
		this.holder = holder;
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
		// TODO: キャンバスサイズが変わった時の処理
	}

	@Override
	public void surfaceDestroyed(SurfaceHolder holder) {
		thread = null;
	}

	@Override
	public void run() {
		while(true) {
			// TODO: メインルーチン
		}
	}

	public void draw() {
		Canvas canvas = holder.lockCanvas();
		// TODO: 描画処理
		holder.unlockCanvasAndPost(canvas);
	}
}
