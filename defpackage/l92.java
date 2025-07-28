package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: l92  reason: default package */
public final class l92 {
    public final t52 a;
    public final to8 b;
    public final g2b c;
    public final luf d;
    public final p7a e;
    public final tt0 f;
    public final jee g;
    public final qmc h;

    public l92(t52 t52, to8 to8, g2b g2b, luf luf, p7a p7a, tt0 tt0, jee jee, qmc qmc) {
        this.a = t52;
        this.b = to8;
        this.c = g2b;
        this.d = luf;
        this.e = p7a;
        this.f = tt0;
        this.g = jee;
        this.h = qmc;
    }

    public final void a(long j, long j2, long j3, int i, long j4, int i2, long j5, f92 f92, md4 md4) {
        List list;
        t52 t52;
        List list2;
        List list3;
        List list4;
        List list5;
        long j6 = j2;
        f92 f922 = f92;
        md4 md42 = md4;
        udd.p("l92", "onChatHistory: chatId=%d, messages from=%s, forward=%d, forwardTime=%d, backward=%d, backwardTime=%d, totalCount=%d, itemType=%s", new Object[]{Long.valueOf(j2), ez3.T(Long.valueOf(j3)), Integer.valueOf(i), Long.valueOf(j4), Integer.valueOf(i2), Long.valueOf(j5), Integer.valueOf(f922.c.size()), md4.name()});
        t52 t522 = this.a;
        i22 B = t522.B(j6);
        if (B != null) {
            o62 o62 = B.b;
            udd.p("l92", "onChatHistory, chat create time = %s", new Object[]{ez3.T(Long.valueOf(o62.f))});
            int ordinal = md4.ordinal();
            g2b g2b = this.c;
            List<ym8> list6 = f922.c;
            long j7 = B.a;
            if (ordinal == 0) {
                if (list6.isEmpty()) {
                    list3 = Collections.emptyList();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (ym8 ym8 : list6) {
                        List list7 = list6;
                        t52 t523 = t522;
                        if (ym8.b >= o62.f) {
                            arrayList.add(ym8);
                        }
                        list6 = list7;
                        t522 = t523;
                    }
                    list3 = arrayList;
                }
                list = list6;
                t52 = t522;
                if (list3.isEmpty()) {
                    list4 = Collections.emptyList();
                } else {
                    list4 = ek8.s(list3, new d52(3, this.g.h(0, una.TYPE_MSG_EDIT)));
                }
                if (list4.size() > 0) {
                    if (!list4.isEmpty()) {
                        this.b.g(j7, ((j2b) g2b).a.s(), list4);
                    }
                    p1d p1d = new p1d(j7);
                    luf luf = this.d;
                    luf.a(p1d);
                    luf.a(new p1d(j7, md42));
                    j2b j2b = (j2b) g2b;
                    boolean L = B.L(j2b.a, j2b.c);
                    long j8 = o62.a;
                    if (!L) {
                        this.e.f(j8);
                    } else {
                        udd.p("l92", "onChatHistory: %d is globally muted", new Object[]{Long.valueOf(j8)});
                    }
                }
                list2 = list4;
            } else if (ordinal == 1) {
                sze sze = new sze(jk9.x0, md4.DELAYED);
                k92 k92 = new k92(this, j6, 0);
                if (list6.isEmpty()) {
                    list5 = list6;
                } else {
                    list5 = sze.a(list6, new ljc(11, sze), new u1c(25), (u16) null, k92, (u16) null);
                }
                if (!list5.isEmpty()) {
                    this.b.g(j7, ((j2b) g2b).a.s(), list5);
                }
                list2 = list5;
                list = list6;
                t52 = t522;
            } else {
                throw new IllegalStateException("Unexpected value: " + md42);
            }
            List list8 = list;
            long j9 = B.a;
            List list9 = list2;
            p52 p52 = r1;
            i22 i22 = B;
            p52 p522 = new p52(t52, list2, j3, i2, j5, i, j4, md4, j9);
            t52.h(j9, false, p52);
            int size = list9.size();
            tt0 tt0 = this.f;
            if (size > 0) {
                List<ym8> list10 = list9;
                long j10 = ((ym8) list10.get(0)).b;
                long j11 = ((ym8) list10.get(list10.size() - 1)).b;
                int size2 = list10.size();
                ArrayList arrayList2 = new ArrayList(q23.H(list10, 10));
                for (ym8 ym82 : list10) {
                    arrayList2.add(Long.valueOf(ym82.a));
                }
                tt0.c(new g92(j, i22.a, j10, j11, size2, md4, arrayList2));
                return;
            }
            int size3 = list8.size();
            hw4 hw4 = hw4.a;
            tt0.c(new g92(j, i22.a, j3, j3, size3, md4, hw4));
        }
    }
}
