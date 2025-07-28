package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: e23  reason: default package */
public final class e23 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h23 b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ e23(h23 h23, Drawable drawable, int i) {
        this.a = i;
        this.b = h23;
        this.c = drawable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                e23.super.invalidateDrawable(this.c);
                return;
            default:
                e23.super.unscheduleDrawable(this.c);
                return;
        }
    }
}
