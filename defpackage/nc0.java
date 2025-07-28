package defpackage;

import android.content.Context;

/* renamed from: nc0  reason: default package */
public final /* synthetic */ class nc0 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ nc0(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                pda pda = (pda) obj;
                km4.y0.n(this.b).g();
                return -1;
            case 1:
                pda pda2 = (pda) obj;
                km4.y0.n(this.b).g();
                return -1728053248;
            default:
                CharSequence a2 = ((mge) obj).a(this.b);
                return a2 == null ? "" : a2;
        }
    }
}
