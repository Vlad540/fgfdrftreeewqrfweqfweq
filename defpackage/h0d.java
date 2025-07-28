package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: h0d  reason: default package */
public final class h0d extends f1d {
    public final /* synthetic */ int D0 = 0;
    public final Object E0;

    public h0d(g0d g0d) {
        super(g0d);
        this.E0 = (xm8) g0d.m;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, m00] */
    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, p10] */
    public final uo8 y() {
        ArrayList arrayList;
        jj7 jj7;
        List list;
        switch (this.D0) {
            case 0:
                xm8 xm8 = (xm8) this.E0;
                jj7 jj72 = xm8.a.D0;
                if (jj72 == null || (list = (List) jj72.a) == null) {
                    arrayList = hw4.a;
                } else {
                    ArrayList<o10> arrayList2 = new ArrayList<>();
                    for (Object next : list) {
                        if (((o10) next).g == null) {
                            arrayList2.add(next);
                        }
                    }
                    arrayList = new ArrayList(q23.H(arrayList2, 10));
                    for (o10 j : arrayList2) {
                        m00 j2 = j.j();
                        j2.l = UUID.randomUUID().toString();
                        arrayList.add(j2.a());
                    }
                }
                uo8 E = xm8.a.E();
                E.b = 0;
                E.u = true;
                jj7 jj73 = xm8.a.D0;
                if (jj73 != null) {
                    p10 I = jj73.I();
                    I.c = null;
                    I.b = null;
                    I.a = arrayList;
                    jj7 = I.c();
                } else {
                    jj7 = null;
                }
                E.n = jj7;
                E.p = 0;
                E.q = 0;
                E.s = null;
                E.t = null;
                E.x = 0;
                E.y = 0;
                E.r = null;
                E.G = null;
                return E;
            default:
                ? obj = new Object();
                obj.c = (t00) this.E0;
                obj.a = j10.b;
                o10 a = obj.a();
                ? obj2 = new Object();
                obj2.a = Collections.singletonList(a);
                jj7 c = obj2.c();
                uo8 uo8 = new uo8();
                uo8.n = c;
                return uo8;
        }
    }

    public h0d(g0d g0d, byte b) {
        super(g0d);
        this.E0 = (t00) g0d.m;
    }
}
