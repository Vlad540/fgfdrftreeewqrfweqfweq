package defpackage;

import android.location.Location;
import android.os.Looper;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: yd9  reason: default package */
public final /* synthetic */ class yd9 implements j26, of3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ be9 b;

    public /* synthetic */ yd9(be9 be9, int i) {
        this.a = i;
        this.b = be9;
    }

    public void accept(Object obj) {
        av7 av7;
        String str;
        ConcurrentHashMap concurrentHashMap;
        boolean z;
        boolean z2 = true;
        be9 be9 = this.b;
        switch (this.a) {
            case 1:
                av7 av72 = (av7) obj;
                be9.getClass();
                long j = av72.c;
                if (j == 0) {
                    be9.I0 = av72;
                    be9.f2();
                    return;
                }
                ConcurrentHashMap concurrentHashMap2 = be9.c;
                av7 av73 = (av7) concurrentHashMap2.get(Long.valueOf(j));
                if (av73 != null) {
                    zu7 a2 = av73.a();
                    a2.f = av72.f;
                    a2.g = av72.g;
                    a2.i = av72.i;
                    concurrentHashMap2.put(Long.valueOf(av73.c), new av7(a2));
                    be9.e2();
                    return;
                }
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                be9.w0.getClass();
                dx7 dx7 = new dx7(new ay7[]{hx7.a, new zd9(be9)}, 1);
                dd9 dd9 = new dd9(10);
                int i = an5.a;
                fja.D(i, "bufferSize");
                ho5 ho5 = new ho5(new cn5(new rn5(dx7, dd9, i), new dd9(11)), 1);
                mbe mbe = be9.D0;
                mbe.getClass();
                yhd i2 = ho5.m(((nbe) mbe).a()).i(de.a());
                pn1 pn1 = new pn1(new yd9(be9, 3), 2, new yd9(be9, 5));
                i2.k(pn1);
                be9.X.a(pn1);
                return;
            case 3:
                List list = (List) obj;
                be9.getClass();
                udd.p("be9", "invalidateLiveLocations %s", new Object[]{list});
                ConcurrentHashMap concurrentHashMap3 = be9.c;
                Iterator it = concurrentHashMap3.entrySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    dm7 dm7 = dm7.Z;
                    av7 av74 = be9.A0;
                    if (hasNext) {
                        Map.Entry entry = (Map.Entry) it.next();
                        av7 av75 = (av7) entry.getValue();
                        Long l = (Long) entry.getKey();
                        long longValue = l.longValue();
                        int i3 = (longValue > 0 ? 1 : (longValue == 0 ? 0 : -1));
                        if (i3 != 0) {
                            if (av75.h) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        ((ar8) it2.next()).getClass();
                                        if (i3 == 0) {
                                            dm7 dm72 = av75.a;
                                            ConcurrentHashMap concurrentHashMap4 = concurrentHashMap3;
                                            boolean f = ((od) be9.Z).f(dm72.a, dm72.b, 1.401298464324817E-45d, 1.401298464324817E-45d);
                                            boolean z3 = av75.k ^ z2;
                                            zu7 a3 = av75.a();
                                            a3.a = dm7;
                                            a3.j = 0;
                                            a3.h = z2;
                                            a3.k = false;
                                            Long valueOf = Long.valueOf(av75.c);
                                            av7 av76 = new av7(a3);
                                            concurrentHashMap = concurrentHashMap4;
                                            concurrentHashMap.put(valueOf, av76);
                                            av7 av77 = (av7) concurrentHashMap.get(l);
                                            if (av77 != null && (av77.i || !f || !z3)) {
                                                be9.L0.c(av77);
                                            }
                                            z = true;
                                        }
                                    } else {
                                        concurrentHashMap = concurrentHashMap3;
                                        z = false;
                                    }
                                }
                                if ((av74 == null || av74.c != longValue) && !z) {
                                    it.remove();
                                }
                                concurrentHashMap3 = concurrentHashMap;
                                z2 = true;
                            }
                        }
                    } else {
                        ConcurrentHashMap concurrentHashMap5 = concurrentHashMap3;
                        Iterator it3 = list.iterator();
                        while (true) {
                            boolean hasNext2 = it3.hasNext();
                            ev7 ev7 = ev7.c;
                            if (hasNext2) {
                                ((ar8) it3.next()).getClass();
                                if (((av7) concurrentHashMap5.get(0L)) == null && (av74 == null || av74.h || av74.c != 0)) {
                                    if (be9.x0 == 0) {
                                        str = be9.z0;
                                    } else {
                                        tf3 i4 = be9.B0.i(0, false);
                                        str = i4 != null ? i4.d() : "";
                                    }
                                    zu7 zu7 = new zu7(dm7);
                                    zu7.b = 0;
                                    zu7.c = 0;
                                    zu7.j = 0;
                                    zu7.h = true;
                                    zu7.e = str;
                                    zu7.k = false;
                                    if (0 != be9.G0.h) {
                                        ev7 = ev7.b;
                                    }
                                    zu7.d = ev7;
                                    zu7.l = "";
                                    av7 av78 = new av7(zu7);
                                    concurrentHashMap5.put(0L, av78);
                                    be9.L0.c(av78);
                                }
                            } else {
                                be9.b2(new ae9(be9.G0.d == 3));
                                if (concurrentHashMap5.size() == 1) {
                                    av7 av79 = (av7) concurrentHashMap5.values().iterator().next();
                                    if (be9.G0.h != av79.c) {
                                        zu7 a4 = av79.a();
                                        a4.d = ev7;
                                        concurrentHashMap5.put(Long.valueOf(av79.c), new av7(a4));
                                        be9.b2(new bi0(av79, 2));
                                    }
                                }
                                long j2 = be9.G0.h;
                                if (!(j2 == 0 || (av7 = (av7) concurrentHashMap5.get(Long.valueOf(j2))) == null)) {
                                    be9.g2(av7.c);
                                    if (be9.J0 && be9.G0.o == -1) {
                                        dm7 dm73 = av7.a;
                                        ((af9) ((ge9) be9.b)).B(dm73.a, dm73.b, false);
                                    }
                                }
                                be9.h2((yd9) null);
                                be9.e2();
                                return;
                            }
                        }
                    }
                }
            case 5:
                be9.getClass();
                Locale locale = Locale.ENGLISH;
                udd.s("be9", "Can't get getActiveLiveLocations for chat " + be9.y0, (Throwable) obj);
                return;
            case 6:
                Long l2 = (Long) obj;
                be9.K0.c(Boolean.TRUE);
                return;
            case 7:
                be9.Y.a(be9);
                be9.b2(new cv1(be9, 3, (Boolean) obj));
                be9.h2((yd9) null);
                return;
            default:
                be9.getClass();
                be9.b2(new jv1(2, (Boolean) obj));
                be9.h2((yd9) null);
                return;
        }
    }

    public Object apply(Object obj) {
        double d;
        double d2;
        float f;
        List list;
        av7 av7 = (av7) obj;
        be9 be9 = this.b;
        be9.getClass();
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            long j = av7.c;
            hm7 hm7 = be9.G0;
            if (j == hm7.h && hm7.o != -1 && (list = (List) be9.o.get(Long.valueOf(j))) != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    av7 av72 = (av7) it.next();
                    if (av72.j == be9.G0.o) {
                        dm7 dm7 = av72.a;
                        d2 = dm7.a;
                        d = dm7.b;
                        break;
                    }
                }
            }
            d2 = 1.401298464324817E-45d;
            d = 1.401298464324817E-45d;
            if (d2 == 1.401298464324817E-45d || d == 1.401298464324817E-45d) {
                dm7 dm72 = av7.a;
                d2 = dm72.a;
                d = dm72.b;
            }
            dm7 dm73 = be9.H0;
            String c = ((od) be9.Z).c(d2, d, dm73.a, dm73.b);
            if (av7.c == 0 || !be9.H0.a()) {
                f = -1.0f;
            } else {
                dm7 dm74 = be9.H0;
                float[] fArr = new float[1];
                Location.distanceBetween(d2, d, dm74.a, dm74.b, fArr);
                f = fArr[0];
            }
            zu7 a2 = av7.a();
            a2.f = c;
            a2.g = f;
            a2.i = false;
            return new av7(a2);
        }
        throw new RuntimeException("This thread is main!");
    }
}
