package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: x13  reason: default package */
public final class x13 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b23 b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ x13(b23 b23, Drawable drawable, int i) {
        this.a = i;
        this.b = b23;
        this.c = drawable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                x13.super.invalidateDrawable(this.c);
                return;
            default:
                x13.super.unscheduleDrawable(this.c);
                return;
        }
    }
}
