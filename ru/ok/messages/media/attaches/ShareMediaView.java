package ru.ok.messages.media.attaches;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class ShareMediaView extends mn8 {
    public float c1 = ((float) dh4.b((int) 9.0f));

    public ShareMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        zg4.b();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, p10] */
    public final void n(xm8 xm8) {
        jj7 jj7;
        vo8 vo8 = xm8.a;
        o10 o10 = vo8.i().g;
        xm8 xm82 = this.C0;
        boolean z = true;
        boolean z2 = xm82 == null || xm82.a.b != vo8.b || ete.d(xm82, xm8);
        boolean z3 = z2 || this.C0 == null || (jj7 = this.A0) == null || mn8.G(o10, jj7.u(0));
        ? obj = new Object();
        obj.a(o10);
        jj7 c = obj.c();
        this.A0 = c;
        this.C0 = xm8;
        vy t = t(xm8, 0, c.u(0));
        if (z3) {
            y66 y66 = t.o;
            y66.getClass();
            y66.h(jlc.g);
            o10 u = this.A0.u(0);
            if (ete.z(u) <= ete.B(u)) {
                z = false;
            }
            if (z) {
                y66 y662 = t.o;
                y662.getClass();
                y662.n(pgc.a(0.0f, 0.0f, 0.0f, 0.0f));
            } else {
                y66 y663 = t.o;
                y663.getClass();
                float f = this.c1;
                y663.n(pgc.a(0.0f, 0.0f, f, f));
            }
            Q(this.A0.u(0), t, false);
        }
        if (z2) {
            N();
        }
        requestLayout();
    }

    public final void onMeasure(int i, int i2) {
        o10 u = this.A0.u(0);
        if (ete.z(u) > ete.B(u)) {
            int size = (int) ((((float) View.MeasureSpec.getSize(i)) * 2.0f) / 3.0f);
            setMeasuredDimension((int) ((((float) ete.B(u)) / ((float) ete.z(u))) * ((float) size)), size);
        } else {
            int size2 = View.MeasureSpec.getSize(i);
            setMeasuredDimension(size2, (int) ((((float) ete.z(u)) / ((float) ete.B(u))) * ((float) size2)));
        }
        this.o.c(0).Z.d(getMeasuredWidth(), getMeasuredHeight());
        J();
    }

    public final int u(o10 o10) {
        return 0;
    }
}
