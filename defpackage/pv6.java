package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;

/* renamed from: pv6  reason: default package */
public final class pv6 extends dn4 {
    public final qn4 A0;
    public ibe B0;
    public Drawable C0;

    public pv6(Context context, oi0 oi0, qn4 qn4, ibe ibe) {
        super(context, oi0);
        this.A0 = qn4;
        this.B0 = ibe;
        ibe.b = this;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable;
        Canvas canvas2 = canvas;
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas2.getClipBounds(rect)) {
            boolean z = this.c != null && Settings.Global.getFloat(this.a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f;
            oi0 oi0 = this.b;
            if (!z || (drawable = this.C0) == null) {
                canvas.save();
                qn4 qn4 = this.A0;
                Rect bounds = getBounds();
                float b = b();
                ValueAnimator valueAnimator = this.o;
                boolean z2 = valueAnimator != null && valueAnimator.isRunning();
                ValueAnimator valueAnimator2 = this.X;
                boolean z3 = valueAnimator2 != null && valueAnimator2.isRunning();
                qn4.a.a();
                qn4.a(canvas, bounds, b, z2, z3);
                int i = oi0.g;
                int i2 = this.y0;
                Paint paint = this.x0;
                if (i == 0) {
                    this.A0.d(canvas, paint, 0.0f, 1.0f, oi0.d, i2, 0);
                } else {
                    pn4 pn4 = (pn4) ((ArrayList) this.B0.c).get(0);
                    pn4 pn42 = (pn4) rf0.e((ArrayList) this.B0.c, 1);
                    qn4 qn42 = this.A0;
                    if (qn42 instanceof wc7) {
                        qn4 qn43 = qn42;
                        Canvas canvas3 = canvas;
                        Paint paint2 = paint;
                        int i3 = i2;
                        int i4 = i;
                        qn43.d(canvas3, paint2, 0.0f, pn4.a, oi0.d, i3, i4);
                        this.A0.d(canvas3, paint2, pn42.b, 1.0f, oi0.d, i3, i4);
                    } else {
                        i2 = 0;
                        qn42.d(canvas, paint, pn42.b, pn4.a + 1.0f, oi0.d, 0, i);
                    }
                }
                for (int i5 = 0; i5 < ((ArrayList) this.B0.c).size(); i5++) {
                    pn4 pn43 = (pn4) ((ArrayList) this.B0.c).get(i5);
                    this.A0.c(canvas2, paint, pn43, this.y0);
                    if (i5 > 0 && i > 0) {
                        this.A0.d(canvas, paint, ((pn4) ((ArrayList) this.B0.c).get(i5 - 1)).b, pn43.a, oi0.d, i2, i);
                    }
                }
                canvas.restore();
                return;
            }
            drawable.setBounds(getBounds());
            um4.g(this.C0, oi0.c[0]);
            this.C0.draw(canvas2);
        }
    }

    public final boolean e(boolean z, boolean z2, boolean z3) {
        Drawable drawable;
        boolean e = super.e(z, z2, z3);
        if (this.c != null && Settings.Global.getFloat(this.a.getContentResolver(), "animator_duration_scale", 1.0f) == 0.0f && (drawable = this.C0) != null) {
            return drawable.setVisible(z, z2);
        }
        if (!isRunning()) {
            this.B0.x();
        }
        if (z && z3) {
            this.B0.e0();
        }
        return e;
    }

    public final int getIntrinsicHeight() {
        return this.A0.e();
    }

    public final int getIntrinsicWidth() {
        return this.A0.f();
    }
}
