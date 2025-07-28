package defpackage;

import android.content.Context;

/* renamed from: dh3  reason: default package */
public final /* synthetic */ class dh3 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ fh3 c;

    public /* synthetic */ dh3(Context context, fh3 fh3, int i) {
        this.a = i;
        this.b = context;
        this.c = fh3;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return fh3.x(this.b, this.c);
            case 1:
                return fh3.w(this.b, this.c);
            default:
                return fh3.y(this.b, this.c);
        }
    }
}
