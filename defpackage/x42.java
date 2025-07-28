package defpackage;

import android.content.Context;

/* renamed from: x42  reason: default package */
public final /* synthetic */ class x42 implements w1b, r3e {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x42(t52 t52, boolean z, boolean z2) {
        this.c = t52;
        this.a = z;
        this.b = z2;
    }

    public Object get() {
        return dhe.g((Context) this.c, this.a, this.b);
    }

    public boolean test(Object obj) {
        i22 i22 = (i22) obj;
        t52 t52 = (t52) this.c;
        t52.getClass();
        int i = i22.b.m;
        boolean z = this.a;
        return (i > 0 || (z && i22.f0())) && (this.b || !i22.S(((j2b) t52.n).a) || i22.y()) && !i22.D() && ((i22.b0() && i22.e0()) || (z && i22.f0()));
    }

    public /* synthetic */ x42(Context context, boolean z) {
        this.c = context;
        this.a = z;
        this.b = true;
    }
}
