package defpackage;

import java.util.List;

/* renamed from: l48  reason: default package */
public final /* synthetic */ class l48 implements m48 {
    public final /* synthetic */ o48 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int o;

    public /* synthetic */ l48(o48 o48, List list, int i, int i2) {
        this.a = o48;
        this.b = list;
        this.c = i;
        this.o = i2;
    }

    public final void f(nn6 nn6, int i) {
        o48 o48 = this.a;
        o48.getClass();
        ts6 i2 = ws6.i();
        int i3 = 0;
        while (true) {
            List list = this.b;
            if (i3 >= list.size()) {
                break;
            }
            i2.a(((l68) list.get(i3)).d(true));
            i3++;
        }
        it0 it0 = new it0(i2.j());
        m3d m3d = o48.k;
        m3d.getClass();
        int f = m3d.a.f();
        int i4 = this.c;
        int i5 = this.o;
        if (f >= 2) {
            nn6.N(o48.c, i, i4, i5, it0);
            return;
        }
        z48 z48 = o48.c;
        nn6.U(z48, i, i5, it0);
        nn6.K(z48, i, i4, i5);
    }
}
