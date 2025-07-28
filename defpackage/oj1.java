package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: oj1  reason: default package */
public final class oj1 {
    public final xwb a;
    public final pe1 b;
    public final qe4 c;
    public final qb1 d;
    public final ob1 e;
    public final afc f;
    public final otf g;
    public final eje h;

    public oj1(xwb xwb, pe1 pe1, qe4 qe4, qb1 qb1, ob1 ob1, afc afc, otf otf, eje eje) {
        this.a = xwb;
        this.b = pe1;
        this.c = qe4;
        this.d = qb1;
        this.e = ob1;
        this.f = afc;
        this.g = otf;
        this.h = eje;
    }

    public final void a(cgd cgd) {
        cgd cgd2 = cgd;
        v2d v2d = new v2d(cgd2.a);
        nfc dr9 = new dr9(14);
        nfc dr92 = new dr9(14);
        nfc dr93 = new dr9(14);
        nfc dr94 = new dr9(14);
        nfc dr95 = new dr9(14);
        nfc dr96 = new dr9(14);
        dja nfc = new nfc(22, cgd2.b);
        Boolean bool = cgd2.c;
        if (bool != null) {
            dr9 = new nfc(22, bool);
        }
        nfc nfc2 = dr9;
        List list = cgd2.d;
        if (list != null) {
            dr92 = new nfc(22, list);
        }
        nfc nfc3 = dr92;
        List list2 = cgd2.e;
        nfc nfc4 = list2 != null ? new nfc(22, list2) : dr93;
        List list3 = cgd2.f;
        nfc nfc5 = list3 != null ? new nfc(22, list3) : dr94;
        Integer num = cgd2.h;
        nfc nfc6 = num != null ? new nfc(22, Integer.valueOf(num.intValue())) : dr95;
        Long l = null;
        Long l2 = cgd2.g;
        if (l2 != null) {
            long longValue = l2.longValue();
            Long a2 = ((fje) this.h).a();
            if (a2 != null) {
                l = Long.valueOf(System.currentTimeMillis() + (longValue - a2.longValue()));
            }
        }
        a30 a30 = r2;
        a30 a302 = new a30(v2d, nfc, nfc2, nfc3, nfc4, nfc5, nfc6, new nfc(22, cgd2.m), l != null ? new nfc(22, Long.valueOf(l.longValue())) : dr96, false);
        gj1 o = this.c.o(a30);
        if (o != null) {
            pe1 pe1 = this.b;
            v2d v2d2 = o.a;
            List list4 = o.d;
            if (list4 != null && o23.R(list4, pe1.a.a)) {
                pe1.p(v2d2);
            } else if (hhd.f(v2d2, pe1.j)) {
                pe1.p(u2d.a);
            }
            ob1 ob1 = this.e;
            agd agd = cgd2.l;
            if (agd != null && (pe1.a.a() || hhd.f(pe1.k, v2d2))) {
                nu7 nu7 = agd.a;
                pe1.g(v2d2, (List) nu7.a);
                for (ie1 ie1 : (List) nu7.b) {
                    ob1.n.onStateChanged(ie1.b, ie1);
                }
            }
            ob1.f.onRoomUpdated(new mj1(v2d2, xie.I(o)));
        }
    }

    public final void b(boolean z, ge1 ge1, v2d v2d) {
        dr9 dr9 = new dr9(14);
        dr9 dr92 = new dr9(14);
        dr9 dr93 = new dr9(14);
        dr9 dr94 = new dr9(14);
        dr9 dr95 = new dr9(14);
        dr9 dr96 = new dr9(14);
        dr9 dr97 = new dr9(14);
        if (z) {
            ge1 = null;
        }
        this.c.o(new a30(v2d, dr9, dr92, dr93, dr94, dr95, dr96, new nfc(22, ge1), dr97, true));
    }

    public final void c(boolean z) {
        if (z) {
            h87 h87 = new h87(23, this);
            h87 h872 = new h87(24, this);
            otf otf = this.g;
            mfd mfd = (mfd) ((s16) otf.b).invoke();
            if (mfd == null) {
                h872.invoke(new IllegalStateException("Signaling is not ready or released"));
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("command", (Object) "get-rooms");
            mfd.j(jSONObject, new yw0(otf, h872, h87, 1), new qs(otf, h872, 6));
        }
    }

    public final void d(z2d z2d) {
        z2d z2d2 = z2d;
        a3d a3d = a3d.a;
        Set set = z2d2.a;
        boolean contains = set.contains(a3d);
        cgd cgd = z2d2.c;
        if (contains && cgd != null) {
            a(cgd);
        }
        boolean contains2 = set.contains(a3d.c);
        qe4 qe4 = this.c;
        int i = z2d2.b;
        if (contains2) {
            v2d v2d = new v2d(i);
            dr9 dr9 = new dr9(14);
            dr9 dr92 = new dr9(14);
            dr9 dr93 = new dr9(14);
            dr9 dr94 = new dr9(14);
            dr9 dr95 = new dr9(14);
            dr9 dr96 = new dr9(14);
            nfc nfc = new nfc(22, Boolean.valueOf(!z2d2.d));
            Long l = null;
            Long l2 = cgd != null ? cgd.g : null;
            if (l2 != null) {
                long longValue = l2.longValue();
                Long a2 = ((fje) this.h).a();
                if (a2 != null) {
                    l = Long.valueOf(System.currentTimeMillis() + (longValue - a2.longValue()));
                }
            }
            qe4.o(new a30(v2d, dr9, nfc, dr92, dr93, dr94, dr95, dr96, new nfc(22, l), false));
        }
        set.contains(a3d.o);
        if (set.contains(a3d.b)) {
            v2d v2d2 = new v2d(i);
            pe1 pe1 = this.b;
            if (hhd.f(pe1.j, v2d2)) {
                pe1.p(u2d.a);
            }
            ((HashMap) qe4.c).remove(v2d2);
            ((ob1) qe4.b).f.onRoomRemoved(new lj1(v2d2));
        }
    }

    public final void e(dgd dgd) {
        ob1 ob1;
        List<cgd> list = dgd.b;
        ArrayList arrayList = new ArrayList(q23.H(list, 10));
        for (cgd cgd : list) {
            arrayList.add(new v2d(cgd.a));
        }
        Set w0 = o23.w0(arrayList);
        qe4 qe4 = this.c;
        for (v2d v2d : o23.w0(((HashMap) qe4.c).keySet())) {
            if (!w0.contains(v2d)) {
                ((HashMap) qe4.c).remove(v2d);
                ((ob1) qe4.b).f.onRoomRemoved(new lj1(v2d));
            }
        }
        for (cgd a2 : list) {
            a(a2);
        }
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ob1 = this.e;
            if (!hasNext) {
                break;
            }
            cgd cgd2 = (cgd) it.next();
            ob1.g.a(new otf(cgd2.i, new v2d(cgd2.a)));
        }
        for (cgd cgd3 : list) {
            ob1.q.onUrlSharingInfoUpdated(new tl1(new v2d(cgd3.a), cgd3.n));
        }
        for (cgd cgd4 : list) {
            ob1.h.a(new afc((Object) cgd4.j, (Object) new v2d(cgd4.a)));
        }
        for (cgd cgd5 : list) {
            this.d.l(cgd5.k, new JSONObject(), "CallSessionRoomsManager#applyMuteStates", 2, new v2d(cgd5.a), true);
        }
        w2d w2d = dgd.a;
        if (!(w2d instanceof u2d)) {
            pe1 pe1 = this.b;
            if (!hhd.f(pe1.k, w2d)) {
                pe1.n(w2d);
                ob1.f.onCurrentParticipantActiveRoomChanged(new jj1(w2d, w2d instanceof v2d ? qe4.y((v2d) w2d) : null));
            }
            this.f.G(new lhd(16, (Object) w2d), new av3(this, 1, w2d), new h87(22, this));
        }
    }
}
