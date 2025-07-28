package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: gyd  reason: default package */
public final class gyd extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ lyd Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gyd(lyd lyd, Continuation continuation) {
        super(2, continuation);
        this.Y = lyd;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((txd) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gyd gyd = new gyd(this.Y, continuation);
        gyd.X = obj;
        return gyd;
    }

    public final Object o(Object obj) {
        List list;
        List<xtd> list2;
        ted ted;
        hud hud;
        int i;
        grd grd;
        wx3.H(obj);
        txd txd = (txd) this.X;
        List list3 = txd.a;
        if (!(list3 == null || (list = txd.b) == null || (list2 = txd.c) == null || (ted = txd.d) == null)) {
            k77[] k77Arr = lyd.F0;
            lyd lyd = this.Y;
            lyd.getClass();
            ArrayList arrayList = new ArrayList();
            boolean z = !list3.isEmpty();
            grd grd2 = lyd.A0;
            if (z) {
                hud = new hud(-9223372036854775807L, new hge(y5a.l), (String) null, Integer.valueOf(phc.d2), lyd.s(-9223372036854775807L, list3), 1, ((uxd) grd2.getValue()).a == 0, false, 132);
            } else {
                hud = null;
            }
            hud hud2 = list.isEmpty() ^ true ? new hud(-9223372036854775806L, new hge(y5a.j), (String) null, Integer.valueOf(phc.L), lyd.s(-9223372036854775806L, list), 2, hud == null, false, 132) : null;
            boolean z2 = hud == null && hud2 == null;
            List list4 = ted.a;
            hud hud3 = list4.isEmpty() ^ true ? new hud(-9223372036854775805L, new hge(y5a.k), (String) null, Integer.valueOf(w5a.e), lyd.s(-9223372036854775805L, list4), 3, z2, false, 132) : null;
            List n0 = o23.n0(ted.b, 100);
            ArrayList arrayList2 = new ArrayList();
            for (Object next : n0) {
                xtd xtd = (xtd) next;
                if (!list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        grd = grd2;
                        if (xtd.a == ((xtd) it.next()).a) {
                            break;
                        }
                        grd2 = grd;
                    }
                    grd2 = grd;
                }
                grd = grd2;
                arrayList2.add(next);
                grd2 = grd;
            }
            grd grd3 = grd2;
            lg7 c = hwf.c();
            c.add(h85.a);
            if (hud != null) {
                lyd.q(c, hud, arrayList);
            }
            if (hud2 != null) {
                lyd.q(c, hud2, arrayList);
            }
            if (hud3 != null) {
                lyd.q(c, hud3, arrayList);
            }
            for (xtd r : list2) {
                lyd.q(c, lyd.r(r, 4), arrayList);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                hud r2 = lyd.r((xtd) it2.next(), 5);
                arrayList.add(new ix1(r2.a, r2));
                c.add(r2);
            }
            lg7 a = hwf.a(c);
            udd.q(lyd.class.getName(), "stickers loaded, sets:" + arrayList.size() + ",content:" + a.getSize());
            vxd vxd = new vxd(arrayList, a);
            grd grd4 = lyd.x0;
            grd4.m((Object) null, vxd);
            long andSet = lyd.z0.getAndSet(0);
            if (andSet > 0) {
                Iterator it3 = ((vxd) grd4.getValue()).a.iterator();
                int i2 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i = 1;
                        i2 = -1;
                        break;
                    } else if (((ix1) it3.next()).b.a == andSet) {
                        i = 1;
                        break;
                    } else {
                        i2++;
                    }
                }
                int i3 = i2 - i;
                grd3.m((Object) null, new uxd(andSet, 0, i3 < 0 ? 0 : i3, 2));
                lyd.t(andSet, (u16) null);
            }
        }
        return jue.a;
    }
}
