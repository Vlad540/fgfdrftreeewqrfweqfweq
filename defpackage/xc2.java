package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import ru.ok.messages.media.attaches.ActAttachesView;

/* renamed from: xc2  reason: default package */
public final /* synthetic */ class xc2 implements of3, bid {
    public final /* synthetic */ bd2 a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ xc2(bd2 bd2, boolean z) {
        this.a = bd2;
        this.b = z;
    }

    public void accept(Object obj) {
        yc2 e;
        h62 h62;
        h62 a2;
        t52 t52;
        List list = (List) obj;
        bd2 bd2 = this.a;
        bd2.getClass();
        udd.q("bd2", "onLoad: count " + list.size());
        boolean z = this.b;
        if (z) {
            bd2.k = true;
            bd2.d.clear();
            bd2.e.clear();
        }
        ArrayList a3 = bd2.a(list, false);
        for (ad2 ad2 : bd2.o) {
            if (ad2 != null) {
                ((ActAttachesView) ad2).l0(a3);
            }
        }
        long j = bd2.a;
        t52 t522 = bd2.q;
        i22 B = t522.B(j);
        if (B != null) {
            o62 o62 = B.b;
            ArrayList d = o62.n.d(md4.REGULAR);
            Set set = bd2.g;
            if (!t52.K(o62, set) || (h62 = t52.H(o62, set).a) == null) {
                h62 = null;
            }
            if (h62 == null) {
                h62 h622 = (h62) oyb.z(d).b;
                if (h622 != null) {
                    t522.h(j, false, new xz((Object) t522, (Object) set, (Object) h622, 3));
                }
            } else {
                Iterator it = d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    h62 h623 = (h62) it.next();
                    a2 = h62.c().a();
                    long j2 = h623.a;
                    boolean I = oyb.I(j2, a2);
                    long j3 = h623.b;
                    if (I) {
                        t52 = t522;
                        if (j3 > a2.b) {
                            p7 c = a2.c();
                            c.b(j3);
                            a2 = c.a();
                        }
                    } else {
                        t52 = t522;
                    }
                    if (oyb.I(j3, a2) && j2 < a2.a) {
                        p7 c2 = a2.c();
                        if (j2 == -1) {
                            udd.S("Chunk.Builder", "", new IllegalStateException("start time is -1"));
                        }
                        c2.b = j2;
                        a2 = c2.a();
                    }
                    if (a2.a == h62.a && a2.b == h62.b) {
                        t522 = t52;
                    } else {
                        t522 = t52;
                        t522.h(j, false, new xz((Object) t522, (Object) set, (Object) a2, 3));
                    }
                }
                t522 = t52;
                t522.h(j, false, new xz((Object) t522, (Object) set, (Object) a2, 3));
            }
        }
        if (!z) {
            bd2.b(true);
            return;
        }
        i22 B2 = t522.B(j);
        if (B2 != null && B2.b.g() && (e = bd2.e(false)) != null) {
            bd2.f(e);
        }
    }

    public void j(ihd ihd) {
        bd2 bd2 = this.a;
        bd2.getClass();
        List<xm8> emptyList = Collections.emptyList();
        i22 B = bd2.q.B(bd2.a);
        if (B != null) {
            to8 to8 = bd2.r;
            boolean z = this.b;
            hb2 hb2 = bd2.s;
            if (z) {
                hb2.getClass();
                emptyList = hb2.f.b(((hz3) to8.a).c.l(bd2.a, Long.MAX_VALUE, bd2.f, (Integer) null, true));
            } else {
                long j = bd2.b;
                long j2 = 0;
                if (j > 0) {
                    vo8 q = to8.q(j);
                    if (q != null) {
                        j2 = q.o;
                    }
                } else {
                    xm8 xm8 = B.c;
                    j2 = xm8 == null ? Long.MAX_VALUE : xm8.a.o;
                }
                hb2.getClass();
                long j3 = bd2.a;
                nec nec = ((hz3) to8.a).c;
                Set set = bd2.f;
                ArrayList l = nec.l(j3, j2, set, 40, true);
                ArrayList l2 = ((hz3) to8.a).c.l(j3, j2, set, 40, false);
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(l);
                arrayList.addAll(l2);
                TreeSet treeSet = new TreeSet(new yz(11));
                treeSet.addAll(arrayList);
                arrayList.clear();
                arrayList.addAll(treeSet);
                Collections.sort(arrayList, new yz(12));
                emptyList = !arrayList.isEmpty() ? hb2.f.b(arrayList) : Collections.emptyList();
            }
        }
        for (xm8 xm82 : emptyList) {
            bd2.t.e(xm82.a);
        }
        ihd.a(emptyList);
    }
}
