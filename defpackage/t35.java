package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* renamed from: t35  reason: default package */
public final class t35 implements k9c {
    public final xw2 a = new xw2(15);
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final k13 e;
    public final int f;
    public final zs g;

    public t35(boolean z, boolean z2, boolean z3, jg8 jg8, int i, zs zsVar) {
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = jg8;
        this.f = i;
        this.g = zsVar;
    }

    public final qi0[] a(Handler handler, h45 h45, h45 h452, h45 h453, h45 h454) {
        ArrayList arrayList = new ArrayList();
        boolean z = this.b;
        jg8 jg8 = this.e;
        if (!z) {
            arrayList.add(new b35(jg8, this.a, this.g));
        }
        if (!this.c) {
            int i = this.f;
            arrayList.add(new d35(this.d, jg8, i, this.a, this.g));
        }
        return (qi0[]) arrayList.toArray(new qi0[arrayList.size()]);
    }
}
