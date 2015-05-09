package si.f5.ice.inmudivision;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceView;

/**
 * Created by i-noc on 15/04/05.
 */
public class InmuSurfaceView extends SurfaceView {

	public InmuSurfaceView(Context context, AttributeSet attrs) {
		super(context, attrs);
		getHolder().addCallback(new InmuSurfaceHolderCallback());
	}

	@Override
	public void draw(Canvas canvas) {
		super.draw(canvas);
	}
}
