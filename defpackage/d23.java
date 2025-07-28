package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: d23  reason: default package */
public final class d23 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h23 b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ d23(h23 h23, Drawable drawable, int i) {
        this.a = i;
        this.b = h23;
        this.c = drawable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                d23.super.invalidateDrawable(this.c);
                return;
            default:
                d23.super.unscheduleDrawable(this.c);
                return;
        }
    }
}
