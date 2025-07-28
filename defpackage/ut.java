package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* renamed from: ut  reason: default package */
public final class ut extends ol implements qce {
    public final long X;
    public final int Y;
    public final /* synthetic */ int o = 0;

    public ut(int i, long j, long j2) {
        super(j);
        this.Y = i;
        this.X = j2;
    }

    public final void c(lbe lbe) {
        switch (this.o) {
            case 0:
                vt vtVar = (vt) lbe;
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                xt xtVar = (xt) plVar.s.getValue();
                int i = this.Y;
                xtVar.getClass();
                if (i == 0) {
                    i = 2;
                }
                ArrayList arrayList = new ArrayList();
                List emptyList = Collections.emptyList();
                if (!vtVar.o.isEmpty()) {
                    List<vsc> list = vtVar.o;
                    zpc zpc = xtVar.f;
                    ArrayList arrayList2 = new ArrayList();
                    for (vsc vsc : list) {
                        bqc bqc = vsc.a;
                        if (bqc == bqc.Z) {
                            arrayList2.add(new dwd(vsc.b, vsc.d));
                        } else if (bqc == bqc.w0) {
                            arrayList2.add(new oud(vsc.g, vsc.b, vsc.e));
                        } else if (bqc == bqc.x0) {
                            ArrayList k = fu7.k(vsc.k);
                            k.addAll(fu7.p(vsc.l, zpc));
                            arrayList2.add(new w2c(vsc.b, k));
                        } else {
                            udd.s("fu7", "Unknown section " + vsc, (Throwable) null);
                        }
                    }
                    zsd zsd = xtVar.a;
                    zsd.getClass();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        wsc wsc = (wsc) it.next();
                        int t = hr1.t(wsc.a);
                        if (t == 1) {
                            arrayList3.addAll(zsd.c(((dwd) wsc).c));
                        } else if (t == 3) {
                            arrayList3.addAll(zsd.c((List) new au9(new au9(new ps9(ms9.j(((w2c) wsc).c), new xsd(8), 1), new mb1(13, utd.class), 3), new xsd(9), 3).v().e()));
                        }
                    }
                    arrayList.addAll(arrayList3);
                    emptyList = arrayList2;
                }
                if (!emptyList.isEmpty()) {
                    zsd zsd2 = xtVar.a;
                    synchronized (zsd2) {
                        zsd2.h(emptyList);
                        zsd2.g(emptyList);
                        tic.a(new usd(zsd2, 0), zsd2.h, (j6) null, new xsd(2), (qmc) null);
                    }
                }
                if (i == 2) {
                    ((j2b) xtVar.b).a.k("user.stickersLastSync", Long.valueOf(vtVar.c));
                } else if (i == 5 || i == 4) {
                    udd.p("xt", "onAssetsUpdate: set favorites sync=%d", new Object[]{Long.valueOf(vtVar.c)});
                    ((j2b) xtVar.b).a.k("user.favoritesLastSync", Long.valueOf(vtVar.c));
                    l95 l95 = xtVar.d;
                    List<vsc> list2 = vtVar.o;
                    l95.getClass();
                    for (vsc vsc2 : list2) {
                        if ("FAVORITE_STICKER_SETS".equals(vsc2.b)) {
                            long j = vsc2.g;
                            Long valueOf = Long.valueOf(j);
                            long j2 = vsc2.j;
                            Long valueOf2 = Long.valueOf(j2);
                            List list3 = vsc2.e;
                            udd.p("l95", "onAssetsUpdate: sets=%s, marker=%d, updateTime=%d", new Object[]{list3, valueOf, valueOf2});
                            l95.g(j2);
                            f73 k2 = new w63(l95.b(), 2, new d52(9, list3)).k((qmc) l95.o.getValue());
                            pn1 pn1 = new pn1(new g95(2), 0, new d74(1));
                            k2.i(pn1);
                            l95.x0.a(pn1);
                            if (j != 0) {
                                l95.c(j);
                            }
                        }
                    }
                    fa5 fa5 = xtVar.e;
                    List<vsc> list4 = vtVar.o;
                    fa5.getClass();
                    for (vsc vsc3 : list4) {
                        if ("FAVORITE_STICKERS".equals(vsc3.b)) {
                            long j3 = vsc3.g;
                            Long valueOf3 = Long.valueOf(j3);
                            long j4 = vsc3.j;
                            Long valueOf4 = Long.valueOf(j4);
                            List list5 = vsc3.d;
                            udd.p("fa5", "onAssetsUpdate: stickers=%s, marker=%d, updateTime=%d", new Object[]{list5, valueOf3, valueOf4});
                            fa5.f(j4);
                            f73 k3 = new w63(((a95) fa5.a.get()).a(), 2, new d52(6, list5)).k((qmc) fa5.c.get());
                            pn1 pn12 = new pn1(new d52(15, list5), 0, new b95(2, list5));
                            k3.i(pn12);
                            fa5.h.a(pn12);
                            if (j3 != 0) {
                                fa5.b(j3);
                            }
                        }
                    }
                } else if (i == 10) {
                    gj gjVar = xtVar.g;
                    List list6 = vtVar.o;
                    Map map = vtVar.w0;
                    ((lqc) gjVar.c).k("user.reactionsLastSync", Long.valueOf(vtVar.c));
                    gjVar.l.o1(gjVar, gj.p[1], xs7.E(gjVar.j, (hu3) null, ru3.b, new zi(gjVar, list6, map, (Continuation) null), 1));
                }
                if (!vtVar.X.isEmpty()) {
                    for (Map.Entry entry : vtVar.X.entrySet()) {
                        zsd zsd3 = xtVar.a;
                        Long l = (Long) entry.getKey();
                        l.getClass();
                        osd osd = (osd) zsd3.a.get(l);
                        if (osd == null || osd.X < ((Long) entry.getValue()).longValue()) {
                            arrayList.add((Long) entry.getKey());
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    ek8.U(arrayList);
                    Iterator it2 = ek8.Z(arrayList).iterator();
                    while (it2.hasNext()) {
                        xtVar.c.c(2, (List) it2.next());
                    }
                }
                Map map2 = vtVar.Y;
                if (!map2.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    List list7 = (List) xtVar.d.w0.A();
                    if (ek8.J(list7)) {
                        arrayList4.addAll(map2.keySet());
                    } else {
                        for (Map.Entry entry2 : map2.entrySet()) {
                            Long l2 = (Long) entry2.getKey();
                            Iterator it3 = list7.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    xtd xtd = (xtd) it3.next();
                                    if (xtd.a == l2.longValue()) {
                                        if (xtd.f >= ((Long) entry2.getValue()).longValue()) {
                                        }
                                    }
                                } else {
                                    arrayList4.add(l2);
                                }
                            }
                        }
                    }
                    if (!arrayList4.isEmpty()) {
                        xtVar.c.c(3, arrayList4);
                    }
                }
                pl plVar2 = this.c;
                (plVar2 != null ? plVar2 : null).b().c(new wt(this.a, 0));
                return;
            default:
                qm3 qm3 = (qm3) lbe;
                l().c(new rm3(this.a, qm3.c, qm3.o, qm3.X));
                return;
        }
    }

    public final void d(uae uae) {
        switch (this.o) {
            case 0:
                pl plVar = this.c;
                if (plVar == null) {
                    plVar = null;
                }
                plVar.b().c(new jh0(this.a, uae));
                return;
            default:
                if (uae instanceof lae) {
                    l().c(new jh0(this.a, uae));
                    return;
                }
                return;
        }
    }

    public final ibe i() {
        switch (this.o) {
            case 0:
                return new dt(this.Y, this.X, 0, 0);
            default:
                return new pn2(this.X, this.Y);
        }
    }

    public ut(long j, long j2, int i) {
        super(j);
        this.X = j2;
        this.Y = i;
    }
}
