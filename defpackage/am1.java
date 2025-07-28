package defpackage;

import android.content.Context;

/* renamed from: am1  reason: default package */
public final /* synthetic */ class am1 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ gm1 c;

    public /* synthetic */ am1(Context context, gm1 gm1, int i) {
        this.a = i;
        this.b = context;
        this.c = gm1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return gm1.F(this.b, this.c);
            case 1:
                return gm1.C(this.b, this.c);
            default:
                return gm1.w(this.b, this.c);
        }
    }
}
