package defpackage;

import android.content.Context;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: b1f  reason: default package */
public final class b1f extends EnhancedVectorDrawable implements mhe {
    public final int a;
    public final u16 b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b1f(Context context, int i, u16 u16) {
        super(context, i == 1 ? phc.h2 : phc.i2);
        this.a = i;
        this.b = u16;
        onThemeChanged(km4.y0.n(context).g());
    }

    public final void onThemeChanged(pda pda) {
        a1f a1f = (a1f) this.b.invoke(pda);
        xs7.P(this, "mark_path", a1f.a);
        xs7.P(this, "background_path", a1f.b);
    }
}
