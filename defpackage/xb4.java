package defpackage;

import android.util.Size;
import java.util.Comparator;
import one.me.common.drawable.SavedMessagesIconDrawable;

/* renamed from: xb4  reason: default package */
public final /* synthetic */ class xb4 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ xb4(int i) {
        this.a = i;
    }

    public final int compare(Object obj, Object obj2) {
        e63 e63 = g63.a;
        int i = 1;
        switch (this.a) {
            case 0:
                yb4 yb4 = (yb4) obj;
                yb4 yb42 = (yb4) obj2;
                kga b = (!yb4.X || !yb4.w0) ? ac4.f.b() : ac4.f;
                int i2 = yb4.x0;
                return e63.c(Integer.valueOf(i2), Integer.valueOf(yb42.x0), yb4.Y.K0 ? ac4.f.b() : ac4.g).c(Integer.valueOf(yb4.y0), Integer.valueOf(yb42.y0), b).c(Integer.valueOf(i2), Integer.valueOf(yb42.x0), b).f();
            case 1:
                zb4 zb4 = (zb4) obj;
                zb4 zb42 = (zb4) obj2;
                kga b2 = (!zb4.X || !zb4.w0) ? bc4.j.b() : bc4.j;
                boolean z = zb4.Y.y;
                int i3 = zb4.y0;
                g63 g63 = e63;
                if (z) {
                    g63 = e63.c(Integer.valueOf(i3), Integer.valueOf(zb42.y0), bc4.j.b());
                }
                return g63.c(Integer.valueOf(zb4.z0), Integer.valueOf(zb42.z0), b2).c(Integer.valueOf(i3), Integer.valueOf(zb42.y0), b2).f();
            case 2:
                long j = ((zj4) obj).c;
                long j2 = ((zj4) obj2).c;
                int i4 = oze.a;
                int i5 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                if (i5 < 0) {
                    return -1;
                }
                return i5 == 0 ? 0 : 1;
            case 3:
                return pfa.f(((jv0) obj).c, ((jv0) obj2).c);
            case 4:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i6 = 0; i6 < bArr.length; i6++) {
                    byte b3 = bArr[i6];
                    byte b4 = bArr2[i6];
                    if (b3 != b4) {
                        return b3 - b4;
                    }
                }
                return 0;
            case 5:
                return hhd.p(((Long) obj).longValue(), ((Long) obj2).longValue());
            case 6:
                vv0 vv0 = (vv0) obj;
                vv0 vv02 = (vv0) obj2;
                long j3 = vv0.Y;
                long j4 = vv02.Y;
                if (j3 - j4 == 0) {
                    return vv0.compareTo(vv02);
                }
                if (j3 < j4) {
                    i = -1;
                }
                return i;
            case 7:
                wv0 wv0 = (wv0) obj;
                wv0 wv02 = (wv0) obj2;
                long j5 = wv0.Y;
                long j6 = wv02.Y;
                if (j5 - j6 == 0) {
                    return wv0.compareTo(wv02);
                }
                if (j5 < j6) {
                    i = -1;
                }
                return i;
            case 8:
                prc prc = (prc) obj;
                prc prc2 = (prc) obj2;
                if (prc2 == null) {
                    prc.getClass();
                } else {
                    i22 i22 = prc.o;
                    i22 i222 = prc2.o;
                    if (i22 != null && i222 != null) {
                        return Long.compare(i222.l(), i22.l());
                    }
                    if (i22 != null && i222 == null) {
                        return -1;
                    }
                }
                return 0;
            case 9:
                xr8 xr8 = (xr8) obj;
                xr8 xr82 = (xr8) obj2;
                int o = hhd.o(xr82.b, xr8.b);
                if (o != 0) {
                    return o;
                }
                return xr8.a.b.a.toString().compareTo(xr82.a.b.a.toString());
            case 10:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            case 11:
                return hhd.p(((Long) obj2).longValue(), ((Long) obj).longValue());
            case 12:
                rg6 rg6 = (rg6) obj;
                rg6 rg62 = (rg6) obj2;
                int f = gp0.f(Long.valueOf(rg62.k()), Long.valueOf(rg6.k()));
                return f != 0 ? f : gp0.f(Long.valueOf(rg6.getId()), Long.valueOf(rg62.getId()));
            case 13:
                return ((z80) obj).a.compareTo(((z80) obj2).a);
            case 14:
                return hhd.o(((rjb) obj).a.ordinal(), ((rjb) obj2).a.ordinal());
            case 15:
                vyb vyb = (vyb) obj;
                vyb vyb2 = (vyb) obj2;
                if (vyb == null || vyb2 == null) {
                    return 0;
                }
                return vyb2.getCount() - vyb.getCount();
            case 16:
                return pfa.f(((i22) obj2).b.Z, ((i22) obj).b.Z);
            case 17:
                p62 p62 = (p62) obj;
                p62 p622 = (p62) obj2;
                long j7 = p62.c.a().e;
                long j8 = p622.c.a().e;
                if (j7 == 0) {
                    j7 = Long.MAX_VALUE;
                }
                if (j8 == 0) {
                    j8 = Long.MAX_VALUE;
                }
                int p = hhd.p(j8, j7);
                if (p != 0) {
                    return p;
                }
                int p2 = hhd.p(p622.c.k, p62.c.k);
                if (p2 != 0) {
                    return p2;
                }
                int p3 = hhd.p(p622.b, p62.b);
                return p3 != 0 ? p3 : hhd.o(p622.hashCode(), p62.hashCode());
            case 18:
                return ((ujd) obj).a - ((ujd) obj2).a;
            case 19:
                return ((vjd) obj).a - ((vjd) obj2).a;
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                return Float.compare(((ujd) obj).c, ((ujd) obj2).c);
            case 21:
                return Float.compare(((vjd) obj).c, ((vjd) obj2).c);
            case 22:
                akd akd = (akd) obj;
                akd akd2 = (akd) obj2;
                return e63.b(akd.a, akd2.a).b(akd.b, akd2.b).a(akd.c, akd2.c).f();
            case 23:
                cmd cmd = (cmd) obj;
                cmd cmd2 = (cmd) obj2;
                int compare = Integer.compare(cmd2.b, cmd.b);
                if (compare != 0) {
                    return compare;
                }
                int compareTo = cmd.c.compareTo(cmd2.c);
                return compareTo != 0 ? compareTo : cmd.d.compareTo(cmd2.d);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                cmd cmd3 = (cmd) obj;
                cmd cmd4 = (cmd) obj2;
                int compare2 = Integer.compare(cmd4.a, cmd3.a);
                if (compare2 != 0) {
                    return compare2;
                }
                int compareTo2 = cmd4.c.compareTo(cmd3.c);
                return compareTo2 != 0 ? compareTo2 : cmd4.d.compareTo(cmd3.d);
            case 25:
                return ((ioa) obj2).a().compareTo(((ioa) obj).a());
            case 26:
                return Integer.compare(((ooe) obj).Y, ((ooe) obj2).Y);
            case 27:
                return Integer.compare(((kqf) obj).a.b, ((kqf) obj2).a.b);
            case 28:
                return Integer.compare(((lqf) obj).a.b, ((lqf) obj2).a.b);
            default:
                return Long.compare(((iqf) obj).b, ((iqf) obj2).b);
        }
    }
}
