package defpackage;

import android.content.Context;

/* renamed from: tj4  reason: default package */
public final /* synthetic */ class tj4 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vj4 b;
    public final /* synthetic */ Context c;

    public /* synthetic */ tj4(vj4 vj4, Context context, int i) {
        this.a = i;
        this.b = vj4;
        this.c = context;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.f(this.c, true);
            default:
                return this.b.f(this.c, false);
        }
    }
}
