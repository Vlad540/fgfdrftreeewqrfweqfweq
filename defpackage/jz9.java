package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: jz9  reason: default package */
public final class jz9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mz9 b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ jz9(mz9 mz9, Drawable drawable, int i) {
        this.a = i;
        this.b = mz9;
        this.c = drawable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                jz9.super.invalidateDrawable(this.c);
                return;
            default:
                jz9.super.unscheduleDrawable(this.c);
                return;
        }
    }
}
