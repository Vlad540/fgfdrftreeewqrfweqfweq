package defpackage;

import android.content.Context;

/* renamed from: gm3  reason: default package */
public final /* synthetic */ class gm3 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ hm3 c;

    public /* synthetic */ gm3(Context context, hm3 hm3, int i) {
        this.a = i;
        this.b = context;
        this.c = hm3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return hm3.a(this.b, this.c);
            default:
                return hm3.b(this.b, this.c);
        }
    }
}
