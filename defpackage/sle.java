package defpackage;

import android.view.ViewGroup;

/* renamed from: sle  reason: default package */
public final class sle extends ViewGroup.MarginLayoutParams {
    public int a;
    public int b;

    public sle(int i) {
        super(i, -2);
        this.b = 0;
        this.a = 8388627;
    }

    public sle(sle sle) {
        super(sle);
        this.a = 0;
        this.a = sle.a;
    }

    public sle(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
