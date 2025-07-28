package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: td1  reason: default package */
public final class td1 extends taf implements vj1 {
    public String A0 = BuildConfig.FLAVOR;
    public final grd B0;
    public final grd C0;
    public final al1 D0;
    public final grd E0;
    public final t0c F0;
    public final l05 G0;
    public final po1 X;
    public final m54 Y;
    public final t97 Z;
    public final yl1 b;
    public final aka c;
    public final pae o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public final t97 z0 = ez3.O(3, new a01(17));

    public td1(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, yl1 yl1, aka aka, pae pae, po1 po1, m54 m54) {
        Object value;
        t97 t976 = t973;
        yl1 yl12 = yl1;
        pae pae2 = pae;
        po1 po12 = po1;
        t97 t977 = mqc.h;
        this.b = yl12;
        this.c = aka;
        this.o = pae2;
        this.X = po12;
        this.Y = m54;
        this.Z = t977;
        this.w0 = t974;
        this.x0 = t972;
        this.y0 = t97;
        grd a = hrd.a(be1.g);
        this.B0 = a;
        this.C0 = a;
        this.D0 = new al1();
        grd a2 = hrd.a(qa.c);
        this.E0 = a2;
        this.F0 = new t0c(a2);
        this.G0 = new l05(0);
        ez3.N(new ck5(((py0) ((vx0) t974.getValue())).w0, new jd1(this, (Continuation) null), 5), this.a);
        xs7.E(this.a, ((n3a) pae2).e(), (ru3) null, new ld1(this, (Continuation) null), 2);
        ez3.N(new ck5(yl12.j, new md1(this, (Continuation) null), 5), this.a);
        ez3.N(new ck5(((x11) po12.f).k, new nd1(this, (Continuation) null), 5), this.a);
        ez3.N(new v11(po12.c.e, new s01(po1.e(), t973, 1), new od1((Object) t973, (Object) this, (Continuation) null, 0), 4), this.a);
        if (((jb5) t975.getValue()).p()) {
            ez3.N(new ck5(((py0) ((vx0) t974.getValue())).F0, new pd1(this, t975, (Continuation) null), 5), this.a);
        } else {
            do {
                value = a.getValue();
            } while (!a.b(value, be1.a((be1) value, (List) null, r(), (List) null, false, (CharSequence) null, false, 29)));
        }
        ez3.N(new ck5(((py0) this.X.l).D0, new qd1(this, (Continuation) null), 5), this.a);
        ((ep1) ((so1) this.x0.getValue())).d(this);
    }

    public static final void q(td1 td1, lg7 lg7, Map map) {
        Object value;
        be1 be1;
        ArrayList arrayList;
        td1 td12 = td1;
        lg7 lg72 = lg7;
        grd grd = td12.B0;
        do {
            value = grd.getValue();
            be1 = (be1) value;
            arrayList = new ArrayList(q23.H(lg72, 10));
            ListIterator listIterator = lg72.listIterator(0);
            while (true) {
                jg7 jg7 = (jg7) listIterator;
                if (jg7.hasNext()) {
                    qja qja = (qja) jg7.next();
                    le1 id = qja.a.getId();
                    vl1 vl1 = qja.b;
                    String q = vl1.q();
                    if (q == null) {
                        q = BuildConfig.FLAVOR;
                    }
                    String str = q;
                    String name = vl1.getName();
                    ne1 ne1 = qja.a;
                    boolean m = ne1.m();
                    boolean o2 = ne1.o();
                    boolean h = ne1.h();
                    Long l = (Long) map.get(ne1.getId());
                    arrayList.add(new ad1(id, name, str, o2, m, h, l != null ? l.longValue() : -1, Integer.valueOf((!ne1.m() || !ne1.o()) ? ne1.m() ? r1a.U1 : ne1.o() ? r1a.W1 : r1a.Y1 : r1a.X1)));
                }
            }
        } while (!grd.b(value, be1.a(be1, o23.m0(arrayList, (Comparator) td12.z0.getValue()), (lg7) null, (List) null, false, (CharSequence) null, false, 62)));
    }

    public static lg7 r() {
        lg7 c2 = hwf.c();
        c2.add(new c1a(o1a.U0, Integer.valueOf(r1a.e1), (Integer) null, Integer.valueOf(n1a.R), (Integer) null, 52));
        c2.add(new c1a(o1a.T0, Integer.valueOf(r1a.b1), (Integer) null, Integer.valueOf(n1a.d), (Integer) null, 52));
        return hwf.a(c2);
    }

    public final void j() {
        taf.o(this.G0, ch1.C);
    }
}
