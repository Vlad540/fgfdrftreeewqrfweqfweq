package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: yve  reason: default package */
public final /* synthetic */ class yve implements j26, of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ewe b;

    public /* synthetic */ yve(ewe ewe, int i) {
        this.a = i;
        this.b = ewe;
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                this.b.b((wve) obj);
                return;
            case 5:
                wve wve = (wve) obj;
                ewe ewe = this.b;
                ewe.getClass();
                if (wve.a()) {
                    fwe fwe = wve.a;
                    int i = fwe.c;
                    if (i != 6 && !sxe.a(i)) {
                        ewe.b(wve);
                        return;
                    } else {
                        ewe.d(fwe);
                        return;
                    }
                } else {
                    return;
                }
            default:
                ewe ewe2 = this.b;
                xi4 xi4 = (xi4) obj;
                synchronized (ewe2) {
                    ewe2.i.a(xi4);
                }
                return;
        }
    }

    public Object apply(Object obj) {
        ibe ibe;
        int i;
        String str = null;
        ewe ewe = this.b;
        switch (this.a) {
            case 0:
                wve wve = (wve) obj;
                ewe.getClass();
                udd.p("ewe", "prepareUploadFiles: started for upload=%s", new Object[]{wve});
                if (!r1g.p(wve.b)) {
                    return dhd.g(wve);
                }
                eq3 c = ((xh0) ((u98) ewe.g.g.getValue())).c(wve.a.a);
                if (c == null) {
                    return dhd.f(new RuntimeException("failed to prepare upload files"));
                }
                long j = c.b;
                if (j == 0) {
                    return dhd.f(new RuntimeException("content is zero length"));
                }
                String str2 = c.e;
                if (r1g.p(str2)) {
                    udd.p("ewe", "prepareUploadFiles: need copy for upload=%s", new Object[]{wve});
                    mv9 mv9 = new mv9(1, new cwe(ewe, wve, c, 0));
                    qmc qmc = ewe.f;
                    return mv9.m(qmc).i(qmc);
                }
                vve b2 = wve.b();
                b2.c = c.c;
                b2.b = str2;
                b2.f = j;
                return dhd.g(new wve(b2));
            case 1:
                wve wve2 = (wve) obj;
                ewe.getClass();
                qmc b3 = cnc.b();
                int i2 = wve2.a.c;
                boolean z = i2 == 3;
                qmc qmc2 = ewe.f;
                return (z || sxe.a(i2)) ? new mv9(2, new awe(ewe, wve2, 1)).m(b3).i(qmc2) : sxe.b(i2) ? new mv9(2, new awe(ewe, wve2, 0)).m(b3).i(qmc2) : dhd.g(wve2);
            case 3:
                wve wve3 = (wve) obj;
                ewe.getClass();
                if (!r1g.p(wve3.d)) {
                    udd.q("ewe", "requestUrlSingle: already have upload url" + wve3);
                    return dhd.g(wve3);
                }
                udd.q("ewe", "requestUrlSingle: request upload url" + wve3);
                int i3 = wve3.a.c;
                switch (hr1.t(i3)) {
                    case 1:
                        ibe = new bm9(1, 1);
                        break;
                    case 2:
                    case 6:
                        ibe = new bm9(Boolean.FALSE);
                        break;
                    case 3:
                        ibe = new bm9(Boolean.TRUE);
                        break;
                    case 4:
                        ibe = new pn2();
                        break;
                    case 5:
                        ibe = new bm9(3, 1);
                        break;
                    case 7:
                        ibe = new bm9((dfa) null, 11);
                        break;
                    case 8:
                        ibe = new bm9(2, 1);
                        break;
                    default:
                        throw new RuntimeException("tamRequestFromUploadType, can't request url for unknown media type= ".concat(sxe.s(i3)));
                }
                phd h = ((gy9) ewe.e).L(ibe, ewe.f).h(new bwe(wve3, 1));
                lce lce = ewe.c;
                lce.getClass();
                return h.j(new ice(lce, 1, 0));
            case 4:
                wve wve4 = (wve) obj;
                ewe.getClass();
                udd.p("ewe", "uploadFileObservable: upload=%s", new Object[]{wve4});
                int i4 = wve4.a.c;
                if (i4 == 5 || sxe.b(i4)) {
                    str = wve4.c;
                }
                String str3 = str;
                switch (hr1.t(i4)) {
                    case 1:
                        i = 3;
                        break;
                    case 2:
                    case 3:
                    case 6:
                        i = 1;
                        break;
                    case 4:
                        i = 4;
                        break;
                    case 5:
                        i = 2;
                        break;
                    case 7:
                        i = 5;
                        break;
                    default:
                        throw new RuntimeException("unknown http type for upload type ".concat(sxe.s(i4)));
                }
                nce nce = ewe.b;
                nce.getClass();
                t97 t97 = nce.a;
                String str4 = wve4.b;
                String str5 = wve4.d;
                qmc qmc3 = ewe.f;
                ps9 ps9 = new ps9(new kt9(new au9(new rm6(t97, i, str4, str3, str5, qmc3).r(qmc3), new ph0((Object) ewe, i4, (Object) wve4, 14), 3), z3d.j, new joc(ewe, 10, wve4), z3d.i), new vd4(new AtomicLong(), TimeUnit.MILLISECONDS, 500, new are(10)), 1);
                ((i03) ewe.d).getClass();
                return new au9(new au9(ps9, new i95(TimeUnit.DAYS.toMillis(7), wve4.i, 3), 4), new sic(25, ewe.c), 6);
            case 6:
                fwe fwe = (fwe) obj;
                ax7 d = ewe.a.d(fwe);
                are are = new are(8);
                gf6 gf6 = z3d.j;
                z26 z26 = z3d.i;
                return new xx7(new zx7(new zx7(new zx7(d, are, gf6, z26), gf6, new are(9), z26), gf6, gf6, new zve(fwe, 0)));
            case 7:
                wve wve5 = (wve) obj;
                ewe.getClass();
                return wve5.a() ? ms9.m(wve5) : new kt9(new lx7(new mhd(new phd(new mhd(new phd(new phd(dhd.g(wve5).m(ewe.f), new yve(ewe, 0), 0), new yve(ewe, 1), 0), new yve(ewe, 2), 2), new yve(ewe, 3), 0), new yve(ewe, 2), 2), new yve(ewe, 4), 3), new yve(ewe, 5), z3d.j, z3d.i);
            default:
                return ewe.e((fwe) obj);
        }
    }
}
