package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: jz1  reason: default package */
public final class jz1 {
    public final t97 a = z7b.a.getAccessor().d(gg7.class);

    public static List b() {
        int i = f8a.z0;
        o7d o7d = r2;
        o7d o7d2 = new o7d((long) i, 0, new hge(i8a.M1), (d7d) null, (mge) null, Integer.valueOf(phc.s), (b7d) null, (u6d) null, (mge) null, 0, (r6d) null, 2008);
        b7 b7Var = new b7(i, o7d, 536871936);
        int i2 = f8a.B0;
        o7d o7d3 = r3;
        o7d o7d4 = new o7d((long) i2, 0, new hge(i8a.O1), (d7d) null, (mge) null, Integer.valueOf(phc.Z1), (b7d) null, (u6d) null, (mge) null, 0, (r6d) null, 2008);
        b7 b7Var2 = new b7(i2, o7d3, 1073742848);
        int i3 = f8a.C0;
        o7d o7d5 = r4;
        o7d o7d6 = new o7d((long) i3, 0, new hge(i8a.P1), (d7d) null, (mge) null, Integer.valueOf(phc.W1), (b7d) null, (u6d) null, (mge) null, 0, (r6d) null, 2008);
        return p23.B(new b7[]{b7Var, b7Var2, new b7(i3, o7d5, -2147482624)});
    }

    public final List a(dz1 dz1) {
        Uri parse;
        hge hge;
        hge hge2;
        dz1 dz12 = dz1;
        boolean z = dz12 instanceof o42;
        hw4 hw4 = hw4.a;
        t97 t97 = this.a;
        String str = null;
        if (z) {
            o42 o42 = (o42) dz12;
            i22 o = o42.o();
            boolean z2 = false;
            boolean z3 = o != null && o.G();
            grd grd = o42.i;
            if (z3) {
                sz1 sz1 = (sz1) grd.getValue();
                if (sz1 == null) {
                    return hw4;
                }
                lg7 c = hwf.c();
                c.add(new xsc(new hge(i8a.Y1), (nge) null, 0, 14));
                int i = f8a.i0;
                rz1 rz1 = rz1.c;
                rz1 rz12 = sz1.b;
                c.add(new cwc(i, rz12 == rz1, new hge(i8a.n2), new hge(i8a.l2), 536879104));
                c.add(new cwc(f8a.j0, rz12 == rz1.b, new hge(i8a.s2), new hge(i8a.p2), 1073750016));
                int ordinal = rz12.ordinal();
                if (ordinal == 0) {
                    String g = hr1.g(((gg7) t97.getValue()).e, "/");
                    hge hge3 = new hge(i8a.q2);
                    String str2 = sz1.c;
                    mge mge = sz1.d;
                    if (mge != null) {
                        hge2 = mge;
                    } else {
                        hge2 = (str2 == null || str2.length() == 0) ? new hge(i8a.V1) : new hge(i8a.W1);
                    }
                    Integer num = sz1.e;
                    c.add(new odd(new mdd(g, str2, hge3, false, false, hge2, Integer.valueOf(num != null ? num.intValue() : j9a.M))));
                } else if (ordinal == 1) {
                    String str3 = sz1.c;
                    if (str3 == null || str3.length() == 0) {
                        c.add(new hxa(new hge(i8a.T1)));
                    } else {
                        c.add(new odd(new ndd(new lge(str3), new hge(i8a.U1), Integer.valueOf(j9a.M))));
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                if (hhd.f(o42.q(), Boolean.FALSE)) {
                    c.addAll(b());
                }
                return hwf.a(c);
            }
            sz1 sz12 = (sz1) grd.getValue();
            if (sz12 == null) {
                return hw4;
            }
            lg7 c2 = hwf.c();
            c2.add(new xsc(new hge(i8a.e2), (nge) null, 0, 14));
            int i2 = f8a.i0;
            rz1 rz13 = rz1.c;
            rz1 rz14 = sz12.b;
            c2.add(new cwc(i2, rz14 == rz13, new hge(i8a.n2), new hge(i8a.o2), 536879104));
            c2.add(new cwc(f8a.j0, rz14 == rz1.b, new hge(i8a.s2), new hge(i8a.t2), 1073750016));
            int ordinal2 = rz14.ordinal();
            Integer num2 = sz12.e;
            String str4 = sz12.c;
            if (ordinal2 == 0) {
                String g2 = hr1.g(((gg7) t97.getValue()).e, "/");
                hge hge4 = new hge(i8a.q2);
                String str5 = sz12.c;
                mge mge2 = sz12.d;
                if (mge2 != null) {
                    hge = mge2;
                } else {
                    hge = (str5 == null || str5.length() == 0) ? new hge(i8a.b2) : new hge(i8a.c2);
                }
                n06 n06 = r10;
                n06 mdd = new mdd(g2, str5, hge4, true, false, hge, Integer.valueOf(num2 != null ? num2.intValue() : j9a.M));
                c2.add(new odd(n06));
            } else if (ordinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            } else if (str4 == null || str4.length() == 0) {
                c2.add(new odd(new ldd(new hge(i8a.Z1), new hge(i8a.a2), Integer.valueOf(num2 != null ? num2.intValue() : j9a.M))));
            } else {
                c2.add(new odd(new ndd(new lge(str4), new hge(i8a.a2), Integer.valueOf(j9a.M))));
            }
            if (hhd.f(o42.q(), Boolean.FALSE)) {
                if (str4 == null || str4.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    c2.addAll(b());
                }
            }
            return hwf.a(c2);
        } else if (dz12 instanceof yh3) {
            tz1 tz1 = (tz1) ((yh3) dz12).i.getValue();
            if (tz1 == null) {
                return hw4;
            }
            lg7 c3 = hwf.c();
            c3.add(new Object());
            String g3 = hr1.g(((gg7) t97.getValue()).e, "/");
            String str6 = tz1.b;
            if (!(str6 == null || (parse = Uri.parse(str6)) == null)) {
                str = parse.getLastPathSegment();
            }
            String str7 = str;
            hge hge5 = new hge(i8a.C0);
            Integer num3 = tz1.d;
            c3.add(new odd(new mdd(g3, str7, hge5, false, true, tz1.c, Integer.valueOf(num3 != null ? num3.intValue() : j9a.M))));
            return hwf.a(c3);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
