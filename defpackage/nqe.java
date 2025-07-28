package defpackage;

import android.util.SparseArray;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: nqe  reason: default package */
public final class nqe implements zs {
    public final int a;
    public final gs4 b;
    public final j93 c;
    public final iqe d;
    public final gf6 e;
    public final k4f f;
    public final s39 g;
    public final pv0 h;
    public long i;
    public final /* synthetic */ oqe j;

    public nqe(oqe oqe, int i2, j93 j93, iqe iqe, gf6 gf6, k4f k4f, s39 s39, pv0 pv0) {
        this.j = oqe;
        this.a = i2;
        this.b = (gs4) ((hs4) j93.a.get(i2)).a.get(0);
        this.c = j93;
        this.d = iqe;
        this.e = gf6;
        this.f = k4f;
        this.g = s39;
        this.h = pv0;
    }

    public final void a(xu5 xu5) {
        xu5 xu52;
        boolean z;
        xu5 xu53 = xu5;
        int r = pfa.r(xu53.n);
        oqe oqe = this.j;
        boolean z2 = true;
        oyb.k(((qjc) ((SparseArray) oqe.m.b).get(r)) == null);
        stf stf = oqe.m;
        SparseArray sparseArray = ((lqe) ((ArrayList) stf.a).get(this.a)).a;
        oyb.k(oze.l(sparseArray, r));
        xu5 xu54 = (xu5) sparseArray.get(r);
        String str = xu53.n;
        boolean h2 = c49.h(str);
        j93 j93 = this.c;
        if (h2) {
            stf.I(1, new y50(xu54, xu5, this.d, this.b, j93.c.a, this.e, oqe.d, oqe.o, this.g));
            return;
        }
        if (c49.k(str)) {
            boolean z3 = this.d.d == 1;
            z23 z23 = xu54.A;
            if (z23 == null || !z23.e()) {
                z23 = z23.h;
            }
            if (z3 && z23.g(z23)) {
                z23 = z23.h;
            }
            uu5 a2 = xu54.a();
            a2.z = z23;
            xu52 = new xu5(a2);
        } else if (c49.i(str)) {
            uu5 a3 = xu5.a();
            z23 z232 = xu53.A;
            if (z232 == null || !z232.e()) {
                z232 = z23.h;
            }
            a3.z = z232;
            xu52 = new xu5(a3);
        } else {
            throw ExportException.e(new IllegalArgumentException("assetLoaderOutputFormat has to have a audio, video or image mimetype."));
        }
        xu5 xu55 = xu52;
        lk9 lk9 = j93.b;
        ws6 ws6 = j93.c.b;
        xle xle = new xle(2, this);
        ArrayList arrayList = (ArrayList) stf.a;
        if (arrayList.size() < 2) {
            z = false;
        } else {
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (oze.l(((lqe) arrayList.get(i3)).a, 2)) {
                    i2++;
                }
            }
            if (i2 <= 1) {
                z2 = false;
            }
            z = z2;
        }
        stf.I(2, new n8f(oqe.a, xu55, this.d, lk9, ws6, this.f, oqe.d, oqe.o, xle, this.g, this.h, oqe.h, z));
    }

    public final void b(int i2) {
        if (i2 <= 0) {
            d(ExportException.a(new IllegalStateException("AssetLoader instances must provide at least 1 track."), 1001));
            return;
        }
        synchronized (this.j.l) {
            stf stf = this.j.m;
            ((lqe) ((ArrayList) stf.a).get(this.a)).b = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0124, code lost:
        return r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b4 A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b6 A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cf A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00f0 A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0113 A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0103 A[EDGE_INSN: B:56:0x0103->B:47:0x0103 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ojc c(defpackage.xu5 r10) {
        /*
            r9 = this;
            oqe r0 = r9.j
            java.lang.Object r0 = r0.l
            monitor-enter(r0)
            oqe r1 = r9.j     // Catch:{ all -> 0x0012 }
            stf r1 = r1.m     // Catch:{ all -> 0x0012 }
            boolean r1 = r1.w()     // Catch:{ all -> 0x0012 }
            r2 = 0
            if (r1 != 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return r2
        L_0x0012:
            r9 = move-exception
            goto L_0x0125
        L_0x0015:
            java.lang.String r1 = r10.n     // Catch:{ all -> 0x0012 }
            int r1 = defpackage.pfa.r(r1)     // Catch:{ all -> 0x0012 }
            oqe r3 = r9.j     // Catch:{ all -> 0x0012 }
            stf r3 = r3.m     // Catch:{ all -> 0x0012 }
            java.lang.Object r3 = r3.c     // Catch:{ all -> 0x0012 }
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch:{ all -> 0x0012 }
            boolean r4 = defpackage.oze.l(r3, r1)     // Catch:{ all -> 0x0012 }
            defpackage.oyb.k(r4)     // Catch:{ all -> 0x0012 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0012 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0012 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0012 }
            r4 = 0
            if (r3 == 0) goto L_0x006a
            oqe r3 = r9.j     // Catch:{ all -> 0x0012 }
            stf r3 = r3.m     // Catch:{ all -> 0x0012 }
            boolean r5 = r3.w()     // Catch:{ all -> 0x0012 }
            java.lang.String r6 = "Primary track can only be queried after all tracks are added."
            defpackage.oyb.j(r6, r5)     // Catch:{ all -> 0x0012 }
            r5 = r4
        L_0x0045:
            java.lang.Object r6 = r3.a     // Catch:{ all -> 0x0012 }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x0012 }
            int r7 = r6.size()     // Catch:{ all -> 0x0012 }
            if (r5 >= r7) goto L_0x0061
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x0012 }
            lqe r6 = (defpackage.lqe) r6     // Catch:{ all -> 0x0012 }
            android.util.SparseArray r6 = r6.a     // Catch:{ all -> 0x0012 }
            boolean r6 = defpackage.oze.l(r6, r1)     // Catch:{ all -> 0x0012 }
            if (r6 == 0) goto L_0x005e
            goto L_0x0062
        L_0x005e:
            int r5 = r5 + 1
            goto L_0x0045
        L_0x0061:
            r5 = -1
        L_0x0062:
            int r3 = r9.a     // Catch:{ all -> 0x0012 }
            if (r5 != r3) goto L_0x006d
            r9.a(r10)     // Catch:{ all -> 0x0012 }
            goto L_0x006d
        L_0x006a:
            r9.e(r1)     // Catch:{ all -> 0x0012 }
        L_0x006d:
            oqe r3 = r9.j     // Catch:{ all -> 0x0012 }
            stf r3 = r3.m     // Catch:{ all -> 0x0012 }
            java.lang.Object r3 = r3.b     // Catch:{ all -> 0x0012 }
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch:{ all -> 0x0012 }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x0012 }
            qjc r3 = (defpackage.qjc) r3     // Catch:{ all -> 0x0012 }
            if (r3 != 0) goto L_0x007f
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return r2
        L_0x007f:
            gs4 r2 = r9.b     // Catch:{ all -> 0x0012 }
            int r5 = r9.a     // Catch:{ all -> 0x0012 }
            ob6 r10 = r3.j(r2, r10, r5)     // Catch:{ all -> 0x0012 }
            mqe r2 = new mqe     // Catch:{ all -> 0x0012 }
            r2.<init>(r9, r1, r10)     // Catch:{ all -> 0x0012 }
            oqe r5 = r9.j     // Catch:{ all -> 0x0012 }
            java.util.ArrayList r5 = r5.k     // Catch:{ all -> 0x0012 }
            int r6 = r9.a     // Catch:{ all -> 0x0012 }
            java.lang.Object r5 = r5.get(r6)     // Catch:{ all -> 0x0012 }
            fyc r5 = (defpackage.fyc) r5     // Catch:{ all -> 0x0012 }
            r5.getClass()     // Catch:{ all -> 0x0012 }
            r6 = 1
            r7 = 2
            if (r1 == r6) goto L_0x00a4
            if (r1 != r7) goto L_0x00a2
            goto L_0x00a4
        L_0x00a2:
            r8 = r4
            goto L_0x00a5
        L_0x00a4:
            r8 = r6
        L_0x00a5:
            defpackage.oyb.d(r8)     // Catch:{ all -> 0x0012 }
            java.util.HashMap r5 = r5.i     // Catch:{ all -> 0x0012 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0012 }
            java.lang.Object r8 = r5.get(r8)     // Catch:{ all -> 0x0012 }
            if (r8 != 0) goto L_0x00b6
            r8 = r6
            goto L_0x00b7
        L_0x00b6:
            r8 = r4
        L_0x00b7:
            defpackage.oyb.d(r8)     // Catch:{ all -> 0x0012 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0012 }
            r5.put(r8, r2)     // Catch:{ all -> 0x0012 }
            oqe r2 = r9.j     // Catch:{ all -> 0x0012 }
            stf r2 = r2.m     // Catch:{ all -> 0x0012 }
            java.lang.Object r2 = r2.o     // Catch:{ all -> 0x0012 }
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch:{ all -> 0x0012 }
            boolean r5 = defpackage.oze.l(r2, r1)     // Catch:{ all -> 0x0012 }
            if (r5 == 0) goto L_0x00da
            java.lang.Object r5 = r2.get(r1)     // Catch:{ all -> 0x0012 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ all -> 0x0012 }
            int r5 = r5.intValue()     // Catch:{ all -> 0x0012 }
            int r6 = r6 + r5
        L_0x00da:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0012 }
            r2.put(r1, r5)     // Catch:{ all -> 0x0012 }
            oqe r2 = r9.j     // Catch:{ all -> 0x0012 }
            stf r2 = r2.m     // Catch:{ all -> 0x0012 }
            r5 = r4
        L_0x00e6:
            java.lang.Object r6 = r2.a     // Catch:{ all -> 0x0012 }
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x0012 }
            int r8 = r6.size()     // Catch:{ all -> 0x0012 }
            if (r4 >= r8) goto L_0x0103
            java.lang.Object r6 = r6.get(r4)     // Catch:{ all -> 0x0012 }
            lqe r6 = (defpackage.lqe) r6     // Catch:{ all -> 0x0012 }
            android.util.SparseArray r6 = r6.a     // Catch:{ all -> 0x0012 }
            boolean r6 = defpackage.oze.l(r6, r1)     // Catch:{ all -> 0x0012 }
            if (r6 == 0) goto L_0x0100
            int r5 = r5 + 1
        L_0x0100:
            int r4 = r4 + 1
            goto L_0x00e6
        L_0x0103:
            java.lang.Object r2 = r2.o     // Catch:{ all -> 0x0012 }
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch:{ all -> 0x0012 }
            java.lang.Object r1 = r2.get(r1)     // Catch:{ all -> 0x0012 }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x0012 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0012 }
            if (r1 != r5) goto L_0x0123
            oqe r1 = r9.j     // Catch:{ all -> 0x0012 }
            r1.g()     // Catch:{ all -> 0x0012 }
            oqe r9 = r9.j     // Catch:{ all -> 0x0012 }
            h8e r9 = r9.j     // Catch:{ all -> 0x0012 }
            f8e r9 = r9.a(r7, r3)     // Catch:{ all -> 0x0012 }
            r9.b()     // Catch:{ all -> 0x0012 }
        L_0x0123:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            return r10
        L_0x0125:
            monitor-exit(r0)     // Catch:{ all -> 0x0012 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqe.c(xu5):ojc");
    }

    public final void d(ExportException exportException) {
        oqe oqe = this.j;
        oqe.g();
        oqe.j.b(exportException, 4, 2, 0).b();
    }

    public final void e(int i2) {
        oqe oqe = this.j;
        oyb.k(((qjc) ((SparseArray) oqe.m.b).get(i2)) == null);
        stf stf = oqe.m;
        SparseArray sparseArray = ((lqe) ((ArrayList) stf.a).get(this.a)).a;
        oyb.k(oze.l(sparseArray, i2));
        stf.I(i2, new dx4((xu5) sparseArray.get(i2), this.d, oqe.o, this.g, oqe.h));
    }

    public final void f(long j2) {
    }

    public final boolean g(int i2, xu5 xu5) {
        boolean h2;
        int r = pfa.r(xu5.n);
        synchronized (this.j.l) {
            try {
                stf stf = this.j.m;
                int i3 = this.a;
                stf.getClass();
                int r2 = pfa.r(xu5.n);
                SparseArray sparseArray = ((lqe) ((ArrayList) stf.a).get(i3)).a;
                boolean z = true;
                oyb.k(!oze.l(sparseArray, r2));
                sparseArray.put(r2, xu5);
                if (this.j.m.w()) {
                    stf stf2 = this.j.m;
                    int i4 = 0;
                    int i5 = 0;
                    int i6 = 0;
                    while (true) {
                        ArrayList arrayList = (ArrayList) stf2.a;
                        if (i4 >= arrayList.size()) {
                            break;
                        }
                        SparseArray sparseArray2 = ((lqe) arrayList.get(i4)).a;
                        if (oze.l(sparseArray2, 1)) {
                            i5 = 1;
                        }
                        if (sparseArray2.indexOfKey(2) >= 0) {
                            i6 = 1;
                        }
                        i4++;
                    }
                    int i7 = i5 + i6;
                    ad9 ad9 = this.j.o;
                    if (ad9.r != 2) {
                        oyb.j("The track count cannot be changed after adding track formats.", ad9.e.size() == 0);
                        ad9.w = i7;
                    }
                    ((AtomicInteger) this.g.e).set(i7);
                }
                h2 = h(i2, xu5);
                if (!h2 && pfa.r(xu5.n) == 2) {
                    pfa.v(this.j.o, this.b.g.b, xu5);
                }
                SparseArray sparseArray3 = (SparseArray) this.j.m.c;
                if (oze.l(sparseArray3, r)) {
                    if (h2 != ((Boolean) sparseArray3.get(r)).booleanValue()) {
                        z = false;
                    }
                    oyb.k(z);
                } else {
                    sparseArray3.put(r, Boolean.valueOf(h2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h2;
    }

    public final boolean h(int i2, xu5 xu5) {
        boolean z = (i2 & 1) != 0;
        int r = pfa.r(xu5.n);
        if (!z) {
            return true;
        }
        oqe oqe = this.j;
        if (r == 1) {
            return pfa.C(xu5, this.c, this.a, this.d, oqe.d, oqe.o);
        }
        if (r == 2) {
            if (pfa.D(xu5, this.c, this.a, this.d, oqe.d, oqe.o)) {
                return true;
            }
            v58 v58 = this.b.a.e;
            if (v58.a > 0 && !v58.g) {
                return true;
            }
        }
        return false;
    }
}
