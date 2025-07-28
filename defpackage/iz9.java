package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: iz9  reason: default package */
public final class iz9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mz9 b;
    public final /* synthetic */ Drawable c;

    public /* synthetic */ iz9(mz9 mz9, Drawable drawable, int i) {
        this.a = i;
        this.b = mz9;
        this.c = drawable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                iz9.super.invalidateDrawable(this.c);
                return;
            default:
                iz9.super.unscheduleDrawable(this.c);
                return;
        }
    }
}
