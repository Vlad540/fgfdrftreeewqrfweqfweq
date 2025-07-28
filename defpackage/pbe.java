package defpackage;

import android.content.Context;

/* renamed from: pbe  reason: default package */
public abstract class pbe {
    public final Context a;
    public final o54 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public final t97 h;
    public final r7e i;
    public final r7e j;

    public pbe(Context context, o54 o54, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975) {
        this.a = context;
        this.b = o54;
        this.c = t97;
        this.d = t973;
        this.e = t972;
        this.f = t974;
        this.g = ((m19) t975.getValue()).a;
        ((m19) t975.getValue()).getClass();
        this.h = ((m19) t975.getValue()).b;
        fp fpVar = (fp) this;
        this.i = new r7e(new obe(fpVar, 0));
        this.j = new r7e(new obe(fpVar, 1));
    }

    public final o7a a() {
        return (o7a) this.e.getValue();
    }

    public abstract boolean b();
}
