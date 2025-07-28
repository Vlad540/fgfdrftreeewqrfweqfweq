package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: p4d  reason: default package */
public final class p4d extends l5e implements i26 {
    public int X;
    public final /* synthetic */ v4d Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p4d(v4d v4d, Continuation continuation) {
        super(2, continuation);
        this.Y = v4d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new p4d(this.Y, continuation);
    }

    public final Object o(Object obj) {
        o7d o7d;
        o7d o7d2;
        jue jue = pu3.a;
        int i = this.X;
        jue jue2 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            v4d v4d = this.Y;
            grd grd = v4d.F0;
            lg7 c = hwf.c();
            kb5 kb5 = ((j2b) v4d.s()).e;
            kb5.getClass();
            boolean m = kb5.m(PmsKey.f33esiaenabled, false);
            yd3 yd3 = v4d.A0;
            if (m) {
                c.add((List) ((t97) yd3.c).getValue());
            }
            c.add((List) ((t97) yd3.d).getValue());
            c.add((List) ((t97) yd3.f).getValue());
            c.add((List) ((t97) yd3.a).getValue());
            c.add((List) ((t97) yd3.e).getValue());
            v4d.b.getClass();
            yzc yzc = ((j2b) v4d.s()).b;
            Integer num = (Integer) ((jk0) yzc.i.getValue()).A();
            int intValue = num != null ? num.intValue() : (int) yzc.o(PmsKey.f24debugmode, (long) 0);
            t14 t14 = t14.DISABLED;
            if (intValue == 3) {
                c.add((List) ((t97) yd3.b).getValue());
            }
            ArrayList I = q23.I(hwf.a(c));
            ArrayList arrayList = new ArrayList(q23.H(I, 10));
            Iterator it = I.iterator();
            while (true) {
                u6d u6d = null;
                if (it.hasNext()) {
                    f4d f4d = (f4d) it.next();
                    boolean b = ((pbe) v4d.X.getValue()).b();
                    boolean z = ((u9d) v4d.D0.getValue()).g;
                    int ordinal = f4d.ordinal();
                    w6d w6d = w6d.a;
                    switch (ordinal) {
                        case 0:
                            o7d2 = new o7d(f4d.a, 1, new hge(zaa.h), (d7d) null, (mge) null, Integer.valueOf(phc.P), w6d, (u6d) null, (mge) null, 0, (r6d) null, 1944);
                            break;
                        case 1:
                            o7d2 = new o7d(f4d.a, 1, new hge(zaa.b), (d7d) null, (mge) null, Integer.valueOf(phc.r0), w6d, (u6d) null, (mge) null, 0, (r6d) null, 1944);
                            break;
                        case 2:
                            hge hge = new hge(zaa.j);
                            int i2 = phc.v1;
                            if (b) {
                                u6d = u6d.a;
                            }
                            o7d = new o7d(f4d.a, 1, hge, (d7d) null, (mge) null, Integer.valueOf(i2), w6d, u6d, (mge) null, 0, (r6d) null, 1816);
                            continue;
                        case 3:
                            o7d2 = new o7d(f4d.a, 1, new hge(zaa.k), (d7d) null, (mge) null, Integer.valueOf(phc.g1), w6d, (u6d) null, (mge) null, 0, (r6d) null, 1944);
                            break;
                        case 4:
                            o7d2 = new o7d(f4d.a, 1, new hge(zaa.i), (d7d) null, (mge) null, Integer.valueOf(phc.m1), w6d, (u6d) null, (mge) null, 0, (r6d) null, 1944);
                            break;
                        case 5:
                            o7d2 = new o7d(f4d.a, 1, new hge(cic.Z), (d7d) null, (mge) null, Integer.valueOf(phc.K), w6d, (u6d) null, (mge) null, 0, (r6d) null, 1944);
                            break;
                        case 6:
                            o7d2 = new o7d(f4d.a, 2, new hge(zaa.c), (d7d) null, (mge) null, Integer.valueOf(phc.f), w6d, (u6d) null, (mge) null, 0, (r6d) null, 1944);
                            break;
                        case 7:
                            o7d2 = new o7d(f4d.a, 2, new hge(zaa.l), (d7d) null, (mge) null, Integer.valueOf(phc.i1), w6d, (u6d) null, (mge) null, 0, (r6d) null, 1944);
                            break;
                        case 8:
                            o7d2 = new o7d(f4d.a, 3, new hge(zaa.m), (d7d) null, (mge) null, Integer.valueOf(phc.V), w6d, (u6d) null, (mge) null, 0, (r6d) null, 1944);
                            break;
                        case 9:
                            o7d2 = new o7d(f4d.a, 3, new hge(zaa.a), (d7d) null, (mge) null, Integer.valueOf(phc.b1), w6d, (u6d) null, (mge) null, 0, (r6d) null, 1944);
                            break;
                        case 10:
                            o7d2 = new o7d(f4d.a, 4, new hge(zaa.d), (d7d) null, (mge) null, Integer.valueOf(phc.E1), w6d, (u6d) null, (mge) null, 0, (r6d) null, 1944);
                            break;
                        case 11:
                            o7d = new o7d(f4d.a, 0, z ? new hge(zaa.e) : new hge(zaa.g), d7d.X, z ? null : new hge(zaa.f), Integer.valueOf(phc.S), w6d, (u6d) null, (mge) null, a24.X(((float) 4) * dh4.c().getDisplayMetrics().density), (r6d) null, 1408);
                            continue;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    o7d = o7d2;
                    arrayList.add(o7d);
                } else {
                    this.X = 1;
                    grd.m((Object) null, arrayList);
                    if (jue2 == jue) {
                        return jue;
                    }
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue2;
    }
}
