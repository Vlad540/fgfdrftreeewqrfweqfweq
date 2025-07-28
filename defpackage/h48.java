package defpackage;

import java.util.List;

/* renamed from: h48  reason: default package */
public final /* synthetic */ class h48 implements m48 {
    public final /* synthetic */ o48 a;
    public final /* synthetic */ List b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long o;

    public /* synthetic */ h48(o48 o48, List list, int i, long j) {
        this.a = o48;
        this.b = list;
        this.c = i;
        this.o = j;
    }

    public final void f(nn6 nn6, int i) {
        o48 o48 = this.a;
        o48.getClass();
        ts6 i2 = ws6.i();
        int i3 = 0;
        while (true) {
            List list = this.b;
            if (i3 < list.size()) {
                i2.a(((l68) list.get(i3)).d(true));
                i3++;
            } else {
                nn6 nn62 = nn6;
                nn62.v(o48.c, i, new it0(i2.j()), this.c, this.o);
                return;
            }
        }
    }
}
