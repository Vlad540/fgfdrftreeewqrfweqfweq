package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: rbd  reason: default package */
public final /* synthetic */ class rbd implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ubd c;

    public /* synthetic */ rbd(Context context, ubd ubd, int i) {
        this.a = i;
        this.b = context;
        this.c = ubd;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.view.View, java.lang.Object, xp6] */
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ? xp6 = new xp6(this.b);
                this.c.addView(xp6, new ViewGroup.LayoutParams(-2, -2));
                return xp6;
            case 1:
                return ubd.a(this.b, this.c);
            case 2:
                return ubd.h(this.b, this.c);
            default:
                return ubd.d(this.b, this.c);
        }
    }
}
