package defpackage;

import android.view.View;

/* renamed from: ve9  reason: default package */
public final /* synthetic */ class ve9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ze9 b;

    public /* synthetic */ ve9(ze9 ze9, int i) {
        this.a = i;
        this.b = ze9;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ze9 ze9 = this.b;
                ze9.w0.requestLayout();
                ze9.x0.requestLayout();
                ze9.Z.requestLayout();
                ze9.y0.requestLayout();
                ze9.A0.requestLayout();
                return;
            default:
                ((View) this.b.c).setVisibility(0);
                return;
        }
    }
}
