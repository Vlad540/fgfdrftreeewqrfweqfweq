package defpackage;

import android.net.Uri;
import android.util.Pair;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: uh6  reason: default package */
public final class uh6 {
    public final xh6 a;
    public final qz3 b;
    public final qz3 c;
    public final gvf d;
    public final Uri[] e;
    public final xu5[] f;
    public final f84 g;
    public final uoe h;
    public final List i;
    public final lv1 j = new lv1(17);
    public final cza k;
    public final long l;
    public boolean m;
    public byte[] n = oze.f;
    public BehindLiveWindowException o;
    public Uri p;
    public boolean q;
    public g55 r;
    public long s = -9223372036854775807L;
    public boolean t;

    /* JADX WARNING: type inference failed for: r3v1, types: [rh6, aj0, g55] */
    public uh6(xh6 xh6, f84 f84, Uri[] uriArr, xu5[] xu5Arr, x3a x3a, cqe cqe, gvf gvf, long j2, List list, cza cza) {
        this.a = xh6;
        this.g = f84;
        this.e = uriArr;
        this.f = xu5Arr;
        this.d = gvf;
        this.l = j2;
        this.i = list;
        this.k = cza;
        qz3 a2 = ((nz3) x3a.b).a();
        this.b = a2;
        if (cqe != null) {
            a2.H(cqe);
        }
        this.c = ((nz3) x3a.b).a();
        this.h = new uoe(BuildConfig.FLAVOR, xu5Arr);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < uriArr.length; i2++) {
            if ((xu5Arr[i2].f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        uoe uoe = this.h;
        int[] H = xie.H(arrayList);
        ? aj0 = new aj0(uoe, H);
        aj0.g = aj0.s(uoe.d[H[0]]);
        this.r = aj0;
    }

    public final a28[] a(ai6 ai6, long j2) {
        int i2;
        List list;
        ai6 ai62 = ai6;
        int d2 = ai62 == null ? -1 : this.h.d(ai62.o);
        int length = this.r.length();
        a28[] a28Arr = new a28[length];
        boolean z = false;
        int i3 = 0;
        while (i3 < length) {
            int f2 = this.r.f(i3);
            Uri uri = this.e[f2];
            f84 f84 = this.g;
            if (!f84.d(uri)) {
                a28Arr[i3] = a28.P;
                i2 = i3;
            } else {
                ni6 b2 = f84.b(uri, z);
                b2.getClass();
                long j3 = b2.h - f84.Z;
                boolean z2 = f2 != d2 ? true : z;
                long j4 = j3;
                i2 = i3;
                ni6 ni6 = b2;
                Pair c2 = c(ai6, z2, b2, j3, j2);
                long longValue = ((Long) c2.first).longValue();
                int intValue = ((Integer) c2.second).intValue();
                int i4 = (int) (longValue - ni6.k);
                if (i4 >= 0) {
                    ws6 ws6 = ni6.r;
                    if (ws6.size() >= i4) {
                        ArrayList arrayList = new ArrayList();
                        if (i4 < ws6.size()) {
                            if (intValue != -1) {
                                ii6 ii6 = (ii6) ws6.get(i4);
                                if (intValue == 0) {
                                    arrayList.add(ii6);
                                } else if (intValue < ii6.B0.size()) {
                                    ws6 ws62 = ii6.B0;
                                    arrayList.addAll(ws62.subList(intValue, ws62.size()));
                                }
                                i4++;
                            }
                            arrayList.addAll(ws6.subList(i4, ws6.size()));
                            intValue = 0;
                        }
                        if (ni6.n != -9223372036854775807L) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            ws6 ws63 = ni6.s;
                            if (intValue < ws63.size()) {
                                arrayList.addAll(ws63.subList(intValue, ws63.size()));
                            }
                        }
                        list = Collections.unmodifiableList(arrayList);
                        a28Arr[i2] = new ph6(j4, list);
                    }
                }
                po5 po5 = ws6.b;
                list = e8c.X;
                a28Arr[i2] = new ph6(j4, list);
            }
            i3 = i2 + 1;
            z = false;
        }
        return a28Arr;
    }

    public final int b(ai6 ai6) {
        if (ai6.D0 == -1) {
            return 1;
        }
        ni6 b2 = this.g.b(this.e[this.h.d(ai6.o)], false);
        b2.getClass();
        int i2 = (int) (ai6.y0 - b2.k);
        if (i2 < 0) {
            return 1;
        }
        ws6 ws6 = b2.r;
        ws6 ws62 = i2 < ws6.size() ? ((ii6) ws6.get(i2)).B0 : b2.s;
        int size = ws62.size();
        int i3 = ai6.D0;
        if (i3 >= size) {
            return 2;
        }
        ei6 ei6 = (ei6) ws62.get(i3);
        if (ei6.B0) {
            return 0;
        }
        return oze.a(Uri.parse(pa2.I(b2.a, ei6.a)), ai6.b.a) ? 1 : 2;
    }

    public final Pair c(ai6 ai6, boolean z, ni6 ni6, long j2, long j3) {
        boolean z2 = true;
        int i2 = -1;
        if (ai6 == null || z) {
            long j4 = ni6.u + j2;
            if (ai6 != null && !this.q) {
                j3 = ai6.Z;
            }
            boolean z3 = ni6.o;
            long j5 = ni6.k;
            ws6 ws6 = ni6.r;
            if (!z3 && j3 >= j4) {
                return new Pair(Long.valueOf(j5 + ((long) ws6.size())), -1);
            }
            long j6 = j3 - j2;
            Long valueOf = Long.valueOf(j6);
            int i3 = 0;
            if (this.g.Y && ai6 != null) {
                z2 = false;
            }
            int d2 = oze.d(valueOf, ws6, z2);
            long j7 = ((long) d2) + j5;
            if (d2 >= 0) {
                ii6 ii6 = (ii6) ws6.get(d2);
                int i4 = (j6 > (ii6.X + ii6.c) ? 1 : (j6 == (ii6.X + ii6.c) ? 0 : -1));
                ws6 ws62 = ni6.s;
                ws6 ws63 = i4 < 0 ? ii6.B0 : ws62;
                while (true) {
                    if (i3 >= ws63.size()) {
                        break;
                    }
                    ei6 ei6 = (ei6) ws63.get(i3);
                    if (j6 >= ei6.X + ei6.c) {
                        i3++;
                    } else if (ei6.A0) {
                        j7 += ws63 == ws62 ? 1 : 0;
                        i2 = i3;
                    }
                }
            }
            return new Pair(Long.valueOf(j7), Integer.valueOf(i2));
        }
        boolean z4 = ai6.X0;
        long j8 = ai6.y0;
        int i5 = ai6.D0;
        if (!z4) {
            return new Pair(Long.valueOf(j8), Integer.valueOf(i5));
        }
        if (i5 == -1) {
            j8 = ai6.b();
        }
        Long valueOf2 = Long.valueOf(j8);
        if (i5 != -1) {
            i2 = i5 + 1;
        }
        return new Pair(valueOf2, Integer.valueOf(i2));
    }

    public final nh6 d(Uri uri, int i2, boolean z) {
        Uri uri2 = uri;
        if (uri2 == null) {
            return null;
        }
        lv1 lv1 = this.j;
        byte[] bArr = (byte[]) ((q16) lv1.b).remove(uri2);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((q16) lv1.b).put(uri2, bArr);
            return null;
        }
        yz3 yz3 = new yz3(uri, 0, 1, (byte[]) null, Collections.emptyMap(), 0, -1, (String) null, 1, (Object) null);
        xu5 xu5 = this.f[i2];
        int k2 = this.r.k();
        Object m2 = this.r.m();
        byte[] bArr3 = this.n;
        zx2 zx2 = new zx2(this.c, yz3, 3, xu5, k2, m2, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = oze.f;
        }
        zx2.y0 = bArr3;
        return zx2;
    }
}
