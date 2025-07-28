package defpackage;

import android.net.Uri;
import android.util.Pair;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: th6  reason: default package */
public final class th6 {
    public final wh6 a;
    public final oz3 b;
    public final oz3 c;
    public final mod d;
    public final Uri[] e;
    public final vu5[] f;
    public final f84 g;
    public final toe h;
    public final List i;
    public final nfc j = new nfc(16);
    public final bza k;
    public boolean l;
    public byte[] m = mze.f;
    public BehindLiveWindowException n;
    public Uri o;
    public boolean p;
    public f55 q;
    public long r = -9223372036854775807L;
    public boolean s;

    /* JADX WARNING: type inference failed for: r3v1, types: [zi0, f55, qh6] */
    public th6(wh6 wh6, f84 f84, Uri[] uriArr, vu5[] vu5Arr, e3 e3Var, bqe bqe, mod mod, List list, bza bza) {
        this.a = wh6;
        this.g = f84;
        this.e = uriArr;
        this.f = vu5Arr;
        this.d = mod;
        this.i = list;
        this.k = bza;
        oz3 a2 = ((mz3) e3Var.a).a();
        this.b = a2;
        if (bqe != null) {
            a2.O(bqe);
        }
        this.c = ((mz3) e3Var.a).a();
        this.h = new toe(BuildConfig.FLAVOR, vu5Arr);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < uriArr.length; i2++) {
            if ((vu5Arr[i2].X & 16384) == 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        toe toe = this.h;
        int[] H = xie.H(arrayList);
        ? zi0 = new zi0(toe, H);
        zi0.g = zi0.q(toe.c[H[0]]);
        this.q = zi0;
    }

    public final z18[] a(zh6 zh6, long j2) {
        int i2;
        List list;
        zh6 zh62 = zh6;
        int a2 = zh62 == null ? -1 : this.h.a(zh62.o);
        int length = this.q.length();
        z18[] z18Arr = new z18[length];
        boolean z = false;
        int i3 = 0;
        while (i3 < length) {
            int f2 = this.q.f(i3);
            Uri uri = this.e[f2];
            f84 f84 = this.g;
            if (!f84.d(uri)) {
                z18Arr[i3] = z18.O;
                i2 = i3;
            } else {
                mi6 a3 = f84.a(uri, z);
                a3.getClass();
                long j3 = a3.h - f84.Z;
                boolean z2 = f2 != a2 ? true : z;
                long j4 = j3;
                i2 = i3;
                mi6 mi6 = a3;
                Pair c2 = c(zh6, z2, a3, j3, j2);
                long longValue = ((Long) c2.first).longValue();
                int intValue = ((Integer) c2.second).intValue();
                int i4 = (int) (longValue - mi6.k);
                if (i4 >= 0) {
                    ws6 ws6 = mi6.r;
                    if (ws6.size() >= i4) {
                        ArrayList arrayList = new ArrayList();
                        if (i4 < ws6.size()) {
                            if (intValue != -1) {
                                hi6 hi6 = (hi6) ws6.get(i4);
                                if (intValue == 0) {
                                    arrayList.add(hi6);
                                } else if (intValue < hi6.B0.size()) {
                                    ws6 ws62 = hi6.B0;
                                    arrayList.addAll(ws62.subList(intValue, ws62.size()));
                                }
                                i4++;
                            }
                            arrayList.addAll(ws6.subList(i4, ws6.size()));
                            intValue = 0;
                        }
                        if (mi6.n != -9223372036854775807L) {
                            if (intValue == -1) {
                                intValue = 0;
                            }
                            ws6 ws63 = mi6.s;
                            if (intValue < ws63.size()) {
                                arrayList.addAll(ws63.subList(intValue, ws63.size()));
                            }
                        }
                        list = Collections.unmodifiableList(arrayList);
                        z18Arr[i2] = new oh6(j4, list);
                    }
                }
                po5 po5 = ws6.b;
                list = e8c.X;
                z18Arr[i2] = new oh6(j4, list);
            }
            i3 = i2 + 1;
            z = false;
        }
        return z18Arr;
    }

    public final int b(zh6 zh6) {
        if (zh6.D0 == -1) {
            return 1;
        }
        mi6 a2 = this.g.a(this.e[this.h.a(zh6.o)], false);
        a2.getClass();
        int i2 = (int) (zh6.y0 - a2.k);
        if (i2 < 0) {
            return 1;
        }
        ws6 ws6 = a2.r;
        ws6 ws62 = i2 < ws6.size() ? ((hi6) ws6.get(i2)).B0 : a2.s;
        int size = ws62.size();
        int i3 = zh6.D0;
        if (i3 >= size) {
            return 2;
        }
        di6 di6 = (di6) ws62.get(i3);
        if (di6.B0) {
            return 0;
        }
        return mze.a(Uri.parse(mt0.D(a2.a, di6.a)), zh6.b.a) ? 1 : 2;
    }

    public final Pair c(zh6 zh6, boolean z, mi6 mi6, long j2, long j3) {
        boolean z2 = true;
        int i2 = -1;
        if (zh6 == null || z) {
            long j4 = mi6.u + j2;
            if (zh6 != null && !this.p) {
                j3 = zh6.Z;
            }
            boolean z3 = mi6.o;
            long j5 = mi6.k;
            ws6 ws6 = mi6.r;
            if (!z3 && j3 >= j4) {
                return new Pair(Long.valueOf(j5 + ((long) ws6.size())), -1);
            }
            long j6 = j3 - j2;
            Long valueOf = Long.valueOf(j6);
            int i3 = 0;
            if (this.g.Y && zh6 != null) {
                z2 = false;
            }
            int e2 = mze.e(valueOf, ws6, z2);
            long j7 = ((long) e2) + j5;
            if (e2 >= 0) {
                hi6 hi6 = (hi6) ws6.get(e2);
                int i4 = (j6 > (hi6.X + hi6.c) ? 1 : (j6 == (hi6.X + hi6.c) ? 0 : -1));
                ws6 ws62 = mi6.s;
                ws6 ws63 = i4 < 0 ? hi6.B0 : ws62;
                while (true) {
                    if (i3 >= ws63.size()) {
                        break;
                    }
                    di6 di6 = (di6) ws63.get(i3);
                    if (j6 >= di6.X + di6.c) {
                        i3++;
                    } else if (di6.A0) {
                        j7 += ws63 == ws62 ? 1 : 0;
                        i2 = i3;
                    }
                }
            }
            return new Pair(Long.valueOf(j7), Integer.valueOf(i2));
        }
        boolean z4 = zh6.W0;
        long j8 = zh6.y0;
        int i5 = zh6.D0;
        if (!z4) {
            return new Pair(Long.valueOf(j8), Integer.valueOf(i5));
        }
        if (i5 == -1) {
            j8 = zh6.b();
        }
        Long valueOf2 = Long.valueOf(j8);
        if (i5 != -1) {
            i2 = i5 + 1;
        }
        return new Pair(valueOf2, Integer.valueOf(i2));
    }

    public final mh6 d(Uri uri, int i2) {
        Uri uri2 = uri;
        if (uri2 == null) {
            return null;
        }
        nfc nfc = this.j;
        byte[] bArr = (byte[]) ((q16) nfc.b).remove(uri2);
        if (bArr != null) {
            byte[] bArr2 = (byte[]) ((q16) nfc.b).put(uri2, bArr);
            return null;
        }
        xz3 xz3 = new xz3(uri, 0, 1, (byte[]) null, Collections.emptyMap(), 0, -1, (String) null, 1, (Object) null);
        vu5 vu5 = this.f[i2];
        int k2 = this.q.k();
        Object m2 = this.q.m();
        byte[] bArr3 = this.m;
        xx2 xx2 = new xx2(this.c, xz3, 3, vu5, k2, m2, -9223372036854775807L, -9223372036854775807L);
        if (bArr3 == null) {
            bArr3 = mze.f;
        }
        xx2.y0 = bArr3;
        return xx2;
    }
}
