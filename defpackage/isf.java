package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: isf  reason: default package */
public class isf extends hsf {
    public qy6 n = null;
    public qy6 o = null;
    public qy6 p = null;

    public isf(nsf nsf, WindowInsets windowInsets) {
        super(nsf, windowInsets);
    }

    public qy6 g() {
        if (this.o == null) {
            this.o = qy6.c(this.c.getMandatorySystemGestureInsets());
        }
        return this.o;
    }

    public qy6 i() {
        if (this.n == null) {
            this.n = qy6.c(this.c.getSystemGestureInsets());
        }
        return this.n;
    }

    public qy6 k() {
        if (this.p == null) {
            this.p = qy6.c(this.c.getTappableElementInsets());
        }
        return this.p;
    }

    public nsf l(int i, int i2, int i3, int i4) {
        return nsf.f((View) null, this.c.inset(i, i2, i3, i4));
    }
}
