package defpackage;

import android.graphics.Bitmap;

/* renamed from: p8c  reason: default package */
public final class p8c extends sg0 {
    public final /* synthetic */ gx7 a;

    public p8c(ex7 ex7) {
        this.a = ex7;
    }

    public final void e(g0 g0Var) {
        ex7 ex7 = this.a;
        if (!ex7.h()) {
            ex7.onError(g0Var.c());
        }
    }

    public final void g(Bitmap bitmap) {
        ex7 ex7 = this.a;
        if (ex7.h()) {
            if (bitmap != null) {
                bitmap.recycle();
            }
        } else if (bitmap == null) {
            ex7.b();
        } else {
            ex7.a(bitmap);
        }
    }
}
