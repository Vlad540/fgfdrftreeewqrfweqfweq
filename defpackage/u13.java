package defpackage;

import android.graphics.drawable.Animatable;

/* renamed from: u13  reason: default package */
public final class u13 extends dh0 {
    public final /* synthetic */ v13 b;
    public final /* synthetic */ q13 c;

    public u13(v13 v13, q13 q13) {
        this.b = v13;
        this.c = q13;
    }

    public final void a(String str, oq6 oq6, Animatable animatable) {
        v13 v13 = this.b;
        v13.b.postInvalidate();
        v13.g.invoke(this.c.h());
    }

    public final void d(String str, Throwable th) {
        udd.s("CollageImageAttachDraweeWrapper", "onFailure", th);
    }
}
