package defpackage;

import java.util.Iterator;

/* renamed from: qo1  reason: default package */
public final /* synthetic */ class qo1 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t97 b;
    public final /* synthetic */ t97 c;

    public /* synthetic */ qo1(t97 t97, t97 t972, int i) {
        this.a = i;
        this.b = t97;
        this.c = t972;
    }

    public final Object invoke() {
        Object obj;
        switch (this.a) {
            case 0:
                return x87.c().plus(((pae) this.b.getValue()).b()).plus((hu3) this.c.getValue());
            case 1:
                ep5 a2 = ((rq2) this.b.getValue()).a();
                or2 nr2 = a2.b() ? mr2.a : new nr2(a2.z0, a2.Y, a2.A0, a2.B0, a2.E0);
                aw2 aw2 = (tr2) this.c.getValue();
                aw2.getClass();
                i22 i22 = (i22) myc.O(aw2.h(aw2.i(new es(2, aw2.l().D(nr2.a())), nr2), nr2));
                Long valueOf = i22 != null ? Long.valueOf(i22.a) : null;
                return Long.valueOf(valueOf != null ? valueOf.longValue() : -1);
            case 2:
                ep5 a3 = ((rq2) this.b.getValue()).a();
                or2 nr22 = a3.b() ? mr2.a : new nr2(a3.z0, a3.Y, a3.A0, a3.B0, a3.E0);
                aw2 aw22 = (tr2) this.c.getValue();
                aw22.getClass();
                Iterator it = aw22.h(aw2.i(new es(2, aw22.l().D(nr22.a())), nr22), nr22).iterator();
                Long l = null;
                if (!it.hasNext()) {
                    obj = null;
                } else {
                    obj = it.next();
                    while (it.hasNext()) {
                        obj = it.next();
                    }
                }
                i22 i222 = (i22) obj;
                if (i222 != null) {
                    l = Long.valueOf(i222.a);
                }
                return Long.valueOf(l != null ? l.longValue() : -1);
            case 3:
                return n1g.a(lp.a().plus((hu3) ((pae) this.b.getValue()).a().limitedParallelism(1, "non-contacts")).plus((hu3) this.c.getValue()));
            case 4:
                return n1g.a(((pae) this.b.getValue()).b().limitedParallelism(1, "shortcuts").plus((hu3) this.c.getValue()));
            default:
                return new ijb(this.b, this.c);
        }
    }

    public /* synthetic */ qo1(r7e r7e, t97 t97, gq2 gq2, int i) {
        this.a = i;
        this.b = r7e;
        this.c = t97;
    }
}
