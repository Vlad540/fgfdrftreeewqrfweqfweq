package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: dt1  reason: default package */
public final class dt1 extends View {
    public static final /* synthetic */ k77[] A0;
    public static final float B0;
    public static final float C0;
    public static final float D0 = (dh4.c().getDisplayMetrics().density * 4.0f);
    public static final float E0 = (dh4.c().getDisplayMetrics().density * 8.0f);
    public static final float F0 = (dh4.c().getDisplayMetrics().density * 4.0f);
    public static final float G0 = (dh4.c().getDisplayMetrics().density * 14.0f);
    public final yj a = new yj(this);
    public final ArgbEvaluator b = new ArgbEvaluator();
    public final FloatEvaluator c = new FloatEvaluator();
    public ValueAnimator o;
    public final Paint w0;
    public final Paint x0;
    public float y0;
    public float z0;

    static {
        k77 hc9 = new hc9(dt1.class, "type", "getType()Lone/me/sdk/gallery/view/quickcamera/CameraCentralButton$Type;");
        m7c.a.getClass();
        A0 = new k77[]{hc9};
        float f = dh4.c().getDisplayMetrics().density * 4.0f;
        B0 = f;
        C0 = f / ((float) 2);
    }

    public dt1(Context context) {
        super(context, (AttributeSet) null);
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(B0);
        this.w0 = paint;
        Paint paint2 = new Paint();
        km4.y0.r(this);
        paint2.setColor(1308622847);
        this.x0 = paint2;
        this.y0 = D0;
    }

    public final ct1 getType() {
        k77 k77 = A0[0];
        return (ct1) this.a.b;
    }

    public final void onDraw(Canvas canvas) {
        float width = ((float) getWidth()) / 2.0f;
        canvas.drawCircle(width, width, width - C0, this.w0);
        float f = B0 + this.y0;
        float floatValue = this.c.evaluate(this.z0, Float.valueOf(1.0f), Float.valueOf(0.5f)).floatValue() * ((((float) getWidth()) - f) / ((float) 2));
        canvas.drawRoundRect(f, f, ((float) getWidth()) - f, ((float) getHeight()) - f, floatValue, floatValue, this.x0);
        super.onDraw(canvas);
    }

    public final void setType(ct1 ct1) {
        this.a.o1(this, A0[0], ct1);
    }
}
