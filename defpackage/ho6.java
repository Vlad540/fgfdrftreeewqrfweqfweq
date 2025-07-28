package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: ho6  reason: default package */
public final class ho6 extends View {
    public final int[] A0;
    public final u16 a;
    public Drawable b = gq3.b(getContext(), phc.e2);
    public float c;
    public final Rect o = new Rect();
    public final int w0 = 3;
    public final float x0 = 0.9f;
    public final Paint y0;
    public final Matrix z0;

    public ho6(Context context, u16 u16) {
        super(context, (AttributeSet) null);
        this.a = u16;
        Paint paint = new Paint();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.y0 = paint;
        this.z0 = new Matrix();
        this.A0 = new int[]{r1g.G(0, 0.75f), -16777216};
    }

    public final void a(Canvas canvas, float f, float f2, float f3, int i, fo6 fo6) {
        List<Number> list;
        Drawable.ConstantState constantState;
        int i2 = i;
        fo6 fo62 = fo6;
        if (i2 < this.w0) {
            for (int i3 = 0; i3 < 8; i3++) {
                int i4 = i3 * 45;
                double radians = Math.toRadians((double) i4);
                fo6 fo63 = fo6.o;
                if (fo62 == fo63 || fo62.a.contains(Double.valueOf(radians))) {
                    float cos = (((float) Math.cos(radians)) * f3) + f;
                    float sin = (((float) Math.sin(radians)) * f3) + f2;
                    float X = (float) (a24.X(((float) ((Number) this.a.invoke((fo62 != fo63 || i4 % 90 == 0) ? Integer.valueOf(i) : Integer.valueOf(i2 + 1))).intValue()) * dh4.c().getDisplayMetrics().density) / 2);
                    int i5 = (int) (sin + X);
                    Rect rect = this.o;
                    rect.set((int) (cos - X), (int) (sin - X), (int) (cos + X), i5);
                    Drawable drawable = this.b;
                    Drawable newDrawable = (drawable == null || (constantState = drawable.getConstantState()) == null) ? null : constantState.newDrawable();
                    if (newDrawable != null) {
                        newDrawable.setBounds(rect);
                    }
                    Canvas canvas2 = canvas;
                    if (newDrawable != null) {
                        newDrawable.draw(canvas);
                    }
                    rect.setEmpty();
                } else {
                    Canvas canvas3 = canvas;
                }
            }
            Canvas canvas4 = canvas;
            int i6 = go6.$EnumSwitchMapping$0[fo6.ordinal()];
            if (i6 == 1) {
                list = Collections.singletonList(Double.valueOf(Math.toRadians(180.0d)));
            } else if (i6 == 2) {
                list = Collections.singletonList(Double.valueOf(Math.toRadians(0.0d)));
            } else if (i6 == 3) {
                list = p23.B(new Double[]{Double.valueOf(Math.toRadians(180.0d)), Double.valueOf(Math.toRadians(0.0d))});
            } else {
                throw new NoWhenBranchMatchedException();
            }
            ArrayList arrayList = new ArrayList(q23.H(list, 10));
            for (Number doubleValue : list) {
                double doubleValue2 = doubleValue.doubleValue();
                arrayList.add(new wia(Float.valueOf((((float) Math.cos(doubleValue2)) * f3) + f), Float.valueOf((((float) Math.sin(doubleValue2)) * f3) + f2)));
            }
            int ordinal = fo6.ordinal();
            float f4 = this.x0;
            if (ordinal == 0) {
                wia wia = (wia) arrayList.get(0);
                a(canvas, ((Number) wia.a).floatValue(), ((Number) wia.b).floatValue(), f3 * f4, i2 + 1, fo6.b);
            } else if (ordinal == 1) {
                wia wia2 = (wia) arrayList.get(0);
                a(canvas, ((Number) wia2.a).floatValue(), ((Number) wia2.b).floatValue(), f3 * f4, i2 + 1, fo6.c);
            } else if (ordinal == 2) {
                wia wia3 = (wia) arrayList.get(0);
                float floatValue = ((Number) wia3.a).floatValue();
                float floatValue2 = ((Number) wia3.b).floatValue();
                wia wia4 = (wia) arrayList.get(1);
                float floatValue3 = ((Number) wia4.a).floatValue();
                float floatValue4 = ((Number) wia4.b).floatValue();
                float f5 = f3 * f4;
                int i7 = i2 + 1;
                Canvas canvas5 = canvas;
                float f6 = floatValue2;
                float f7 = f5;
                int i8 = i7;
                a(canvas5, floatValue, f6, f7, i8, fo6.b);
                a(canvas5, floatValue3, floatValue4, f7, i8, fo6.c);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        float f = width;
        float f2 = height;
        RadialGradient radialGradient = new RadialGradient(f, f2, Math.max(width, height), this.A0, (float[]) null, Shader.TileMode.CLAMP);
        Matrix matrix = this.z0;
        matrix.reset();
        matrix.setScale(1.0f, 0.4f, width, height);
        radialGradient.setLocalMatrix(matrix);
        Paint paint = this.y0;
        paint.setShader(radialGradient);
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas2 = new Canvas(createBitmap);
        a(canvas2, width, height, this.c, 0, fo6.o);
        canvas2.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), paint);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
    }

    public final void setIcon$common_release(Drawable drawable) {
        this.b = drawable;
        invalidate();
    }

    public final void setInitialRadius$common_release(float f) {
        this.c = f;
        invalidate();
    }

    public final void setIcon$common_release(int i) {
        this.b = gq3.b(getContext(), i);
        invalidate();
    }
}
