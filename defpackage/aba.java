package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.coroutines.Continuation;

/* renamed from: aba  reason: default package */
public final class aba extends AppCompatImageView {
    public float o;
    public Path w0;
    public int x0 = 687865856;
    public final Paint y0;

    /* JADX WARNING: type inference failed for: r2v0, types: [aba, android.view.View] */
    public aba(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        km4.y0.r(this).f().b.getClass();
        Paint paint = new Paint();
        paint.setColor(0);
        this.y0 = paint;
        urd.B(new z9(3, (Continuation) null, 27), this);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [aba, android.view.View] */
    public final void onDraw(Canvas canvas) {
        Path path = this.w0;
        if (path != null) {
            canvas.save();
            float width = (((float) getWidth()) / this.o) * dh4.c().getDisplayMetrics().density;
            canvas.scale(width, width);
            Paint paint = this.y0;
            paint.setShadowLayer(dh4.c().getDisplayMetrics().density * 1.0f, dh4.c().getDisplayMetrics().density * 0.0f, dh4.c().getDisplayMetrics().density * 0.0f, this.x0);
            canvas.drawPath(path, paint);
            paint.clearShadowLayer();
            canvas.restore();
        }
        aba.super.onDraw(canvas);
    }
}
