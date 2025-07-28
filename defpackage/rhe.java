package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: rhe  reason: default package */
public final class rhe extends Drawable {
    public final qhe a;
    public final t97 b = ez3.O(3, new q6e(4, this));

    public rhe(qhe qhe) {
        this.a = qhe;
    }

    public final rhe a(float f) {
        p6e p6e;
        p6e p6e2;
        qhe qhe = this.a;
        phe phe = qhe.a;
        phe phe2 = null;
        if (phe == null || (p6e2 = phe.a) == null) {
            p6e = null;
        } else {
            p6e = p6e2.mutate();
            p6e.a.f = f;
        }
        if (p6e != null) {
            phe.getClass();
            phe2 = new phe(p6e);
        }
        return new rhe(new qhe(phe2, qhe.b, qhe.c));
    }

    public final void draw(Canvas canvas) {
        b0f b0f = (b0f) this.b.getValue();
        Canvas canvas2 = canvas;
        canvas2.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) b0f.b.getValue());
        ArrayList arrayList = b0f.c;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                hr1.r(it.next());
                throw null;
            }
        }
        phe phe = b0f.a.a;
        if (phe != null) {
            phe.a.draw(canvas);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final Drawable mutate() {
        return a(1.0f);
    }

    public final void onBoundsChange(Rect rect) {
        b0f b0f = (b0f) this.b.getValue();
        b0f.getClass();
        int width = rect.width();
        int height = rect.height();
        qhe qhe = b0f.a;
        ohe ohe = qhe.b;
        if (ohe != null) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
            float[] fArr = new float[2];
            float f = ohe.b;
            b0f.a(width, height, f, fArr);
            rectF.left = fArr[0];
            rectF.top = fArr[1];
            b0f.a(width, height, (f + 180.0f) % ((float) 360), fArr);
            rectF.right = fArr[0];
            rectF.bottom = fArr[1];
            ((Paint) b0f.b.getValue()).setShader(new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, ohe.a, (float[]) null, Shader.TileMode.CLAMP));
        }
        b0f.c.clear();
        Iterator it = qhe.c.iterator();
        if (it.hasNext()) {
            hr1.r(it.next());
            throw null;
        }
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
