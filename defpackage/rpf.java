package defpackage;

import android.content.Context;

/* renamed from: rpf  reason: default package */
public final /* synthetic */ class rpf implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u00 b;
    public final /* synthetic */ xzc c;

    public /* synthetic */ rpf(u00 u00, xzc xzc, int i) {
        this.a = i;
        this.b = u00;
        this.c = xzc;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                u00 u00 = this.b;
                return new jpf(u00.a, u00.b, (Context) u00.c, this.c);
            default:
                u00 u002 = this.b;
                xzc xzc = this.c;
                return new kpf(u002.a, u002.b, (Context) u002.c, xzc);
        }
    }
}
