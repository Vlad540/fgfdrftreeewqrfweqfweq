package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: ev1  reason: default package */
public final class ev1 implements ms1 {
    public final Object A0 = new Object();
    public boolean B0 = true;
    public ia3 C0 = null;
    public mye D0;
    public nzd E0;
    public final ecc F0;
    public final fcc G0;
    public final fcc H0;
    public final q97 I0;
    public final q97 J0;
    public final w80 X;
    public final ArrayList Y = new ArrayList();
    public final ArrayList Z = new ArrayList();
    public final hu1 a;
    public final hu1 b;
    public final mn c;
    public final sye o;
    public final ope w0;
    public ybf x0;
    public List y0 = Collections.emptyList();
    public final ft1 z0;

    public ev1(hu1 hu1, hu1 hu12, fcc fcc, fcc fcc2, ope ope, mn mnVar, ls1 ls1) {
        q97 q97 = q97.f;
        this.a = hu1;
        this.b = hu12;
        this.I0 = q97;
        this.J0 = q97;
        this.w0 = ope;
        this.c = mnVar;
        this.o = ls1;
        ft1 ft1 = fcc.c;
        this.z0 = ft1;
        ft1.v();
        this.F0 = new ecc(hu1.g());
        this.G0 = fcc;
        this.H0 = fcc2;
        this.X = t(fcc, fcc2);
    }

    public static ArrayList A(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mye mye = (mye) it.next();
            mye.getClass();
            mye.m = null;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                k5f k5f = (k5f) it2.next();
                if (mye.m(k5f.a)) {
                    boolean z = mye.m == null;
                    e07.p(mye + " already has effect" + mye.m, z);
                    e07.k(mye.m(k5f.a));
                    mye.m = k5f;
                    arrayList2.remove(k5f);
                }
            }
        }
        return arrayList2;
    }

    public static Matrix m(Rect rect, Size size) {
        e07.j("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, (float) size.getWidth(), (float) size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static w80 t(fcc fcc, fcc fcc2) {
        StringBuilder sb = new StringBuilder();
        sb.append(fcc.a.d());
        sb.append(fcc2 == null ? BuildConfig.FLAVOR : fcc2.a.d());
        return new w80(sb.toString(), ((ht1) fcc.c).a);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, dv1] */
    public static HashMap u(ArrayList arrayList, sye sye, sye sye2) {
        pye pye;
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            mye mye = (mye) it.next();
            if (mye instanceof nzd) {
                nzd nzd = (nzd) mye;
                pye f = new hp6(2).b().f(false, sye);
                if (f == null) {
                    pye = null;
                } else {
                    fc9 e = fc9.e(f);
                    e.a.remove(gde.d0);
                    pye = nzd.l(e).r();
                }
            } else {
                pye = mye.f(false, sye);
            }
            pye f2 = mye.f(true, sye2);
            ? obj = new Object();
            obj.a = pye;
            obj.b = f2;
            hashMap.put(mye, obj);
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean y(defpackage.va0 r4, defpackage.c2d r5) {
        /*
            pw1 r0 = r5.g
            ia3 r0 = r0.b
            ia3 r4 = r4.d
            java.util.Set r1 = r4.f()
            int r1 = r1.size()
            pw1 r5 = r5.g
            ia3 r5 = r5.b
            java.util.Set r5 = r5.f()
            int r5 = r5.size()
            r2 = 1
            if (r1 == r5) goto L_0x001e
            return r2
        L_0x001e:
            java.util.Set r5 = r4.f()
            java.util.Iterator r5 = r5.iterator()
        L_0x0026:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r5.next()
            z80 r1 = (defpackage.z80) r1
            boolean r3 = r0.l(r1)
            if (r3 == 0) goto L_0x0046
            java.lang.Object r3 = r0.h(r1)
            java.lang.Object r1 = r4.h(r1)
            boolean r1 = java.util.Objects.equals(r3, r1)
            if (r1 != 0) goto L_0x0026
        L_0x0046:
            return r2
        L_0x0047:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev1.y(va0, c2d):boolean");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void B(java.util.LinkedHashSet r20, boolean r21, boolean r22) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            java.lang.Object r9 = r7.A0
            monitor-enter(r9)
            r19.x()     // Catch:{ all -> 0x0100 }
            java.lang.Object r1 = r7.A0     // Catch:{ all -> 0x0100 }
            monitor-enter(r1)     // Catch:{ all -> 0x0100 }
            java.util.List r0 = r7.y0     // Catch:{ all -> 0x0052 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0052 }
            r11 = 1
            if (r0 != 0) goto L_0x0055
            java.util.Iterator r0 = r20.iterator()     // Catch:{ all -> 0x0052 }
        L_0x001a:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x0046
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0052 }
            mye r2 = (defpackage.mye) r2     // Catch:{ all -> 0x0052 }
            boolean r3 = r2 instanceof defpackage.bq6     // Catch:{ all -> 0x0052 }
            if (r3 != 0) goto L_0x002b
            goto L_0x001a
        L_0x002b:
            pye r2 = r2.f     // Catch:{ all -> 0x0052 }
            z80 r3 = defpackage.cq6.Y     // Catch:{ all -> 0x0052 }
            boolean r4 = r2.l(r3)     // Catch:{ all -> 0x0052 }
            if (r4 == 0) goto L_0x001a
            java.lang.Object r2 = r2.h(r3)     // Catch:{ all -> 0x0052 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0052 }
            r2.getClass()     // Catch:{ all -> 0x0052 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0052 }
            if (r2 != r11) goto L_0x001a
            r0 = r11
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            if (r0 != 0) goto L_0x004a
            goto L_0x0055
        L_0x004a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = "Ultra HDR image capture does not support for use with CameraEffect."
            r0.<init>(r2)     // Catch:{ all -> 0x0052 }
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            goto L_0x0262
        L_0x0055:
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            if (r21 != 0) goto L_0x005b
            r19.x()     // Catch:{ all -> 0x0100 }
        L_0x005b:
            nzd r0 = r19.r(r20, r21)     // Catch:{ all -> 0x0100 }
            mye r12 = r7.i(r8, r0)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0100 }
            r13.<init>(r8)     // Catch:{ all -> 0x0100 }
            if (r12 == 0) goto L_0x006d
            r13.add(r12)     // Catch:{ all -> 0x0100 }
        L_0x006d:
            if (r0 == 0) goto L_0x0079
            r13.add(r0)     // Catch:{ all -> 0x0100 }
            zcf r1 = r0.q     // Catch:{ all -> 0x0100 }
            java.util.Set r1 = r1.a     // Catch:{ all -> 0x0100 }
            r13.removeAll(r1)     // Catch:{ all -> 0x0100 }
        L_0x0079:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0100 }
            r14.<init>(r13)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r1 = r7.Z     // Catch:{ all -> 0x0100 }
            r14.removeAll(r1)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x0100 }
            r15.<init>(r13)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r1 = r7.Z     // Catch:{ all -> 0x0100 }
            r15.retainAll(r1)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r1 = r7.Z     // Catch:{ all -> 0x0100 }
            r6.<init>(r1)     // Catch:{ all -> 0x0100 }
            r6.removeAll(r13)     // Catch:{ all -> 0x0100 }
            ft1 r1 = r7.z0     // Catch:{ all -> 0x0100 }
            qye r2 = defpackage.sye.a     // Catch:{ all -> 0x0100 }
            z80 r3 = defpackage.ft1.g     // Catch:{ all -> 0x0100 }
            java.lang.Object r1 = r1.d(r3, r2)     // Catch:{ all -> 0x0100 }
            sye r1 = (defpackage.sye) r1     // Catch:{ all -> 0x0100 }
            sye r2 = r7.o     // Catch:{ all -> 0x0100 }
            java.util.HashMap r5 = u(r14, r1, r2)     // Catch:{ all -> 0x0100 }
            java.util.Map r16 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0100 }
            r4 = 2
            java.lang.Object r1 = r7.A0     // Catch:{ IllegalArgumentException -> 0x0247 }
            monitor-enter(r1)     // Catch:{ IllegalArgumentException -> 0x0247 }
            ope r2 = r7.w0     // Catch:{ all -> 0x00ba }
            int r2 = r2.b     // Catch:{ all -> 0x00ba }
            if (r2 != r4) goto L_0x00be
            monitor-exit(r1)     // Catch:{ all -> 0x00ba }
            r2 = r11
            goto L_0x00c0
        L_0x00ba:
            r0 = move-exception
            r10 = r4
            goto L_0x024a
        L_0x00be:
            monitor-exit(r1)     // Catch:{ all -> 0x00ba }
            r2 = 0
        L_0x00c0:
            hu1 r1 = r7.a     // Catch:{ IllegalArgumentException -> 0x0247 }
            fu1 r3 = r1.p()     // Catch:{ IllegalArgumentException -> 0x0247 }
            r1 = r19
            r10 = r4
            r4 = r14
            r17 = r5
            r5 = r15
            r18 = r6
            r6 = r17
            java.util.HashMap r6 = r1.q(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0103 }
            hu1 r1 = r7.b     // Catch:{ IllegalArgumentException -> 0x0103 }
            if (r1 == 0) goto L_0x0108
            java.lang.Object r1 = r7.A0     // Catch:{ IllegalArgumentException -> 0x0103 }
            monitor-enter(r1)     // Catch:{ IllegalArgumentException -> 0x0103 }
            ope r2 = r7.w0     // Catch:{ all -> 0x00e5 }
            int r2 = r2.b     // Catch:{ all -> 0x00e5 }
            if (r2 != r10) goto L_0x00e7
            monitor-exit(r1)     // Catch:{ all -> 0x00e5 }
            r2 = r11
            goto L_0x00e9
        L_0x00e5:
            r0 = move-exception
            goto L_0x0106
        L_0x00e7:
            monitor-exit(r1)     // Catch:{ all -> 0x00e5 }
            r2 = 0
        L_0x00e9:
            hu1 r1 = r7.b     // Catch:{ IllegalArgumentException -> 0x0103 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ IllegalArgumentException -> 0x0103 }
            fu1 r3 = r1.p()     // Catch:{ IllegalArgumentException -> 0x0103 }
            r1 = r19
            r4 = r14
            r5 = r15
            r11 = r6
            r6 = r17
            java.util.HashMap r16 = r1.q(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0103 }
        L_0x00fd:
            r1 = r16
            goto L_0x010a
        L_0x0100:
            r0 = move-exception
            goto L_0x0264
        L_0x0103:
            r0 = move-exception
            goto L_0x024e
        L_0x0106:
            monitor-exit(r1)     // Catch:{ all -> 0x00e5 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0103 }
        L_0x0108:
            r11 = r6
            goto L_0x00fd
        L_0x010a:
            r7.C(r11, r13)     // Catch:{ all -> 0x0100 }
            java.util.List r2 = r7.y0     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r2 = A(r13, r2)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0100 }
            r3.<init>(r8)     // Catch:{ all -> 0x0100 }
            r3.removeAll(r13)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r2 = A(r3, r2)     // Catch:{ all -> 0x0100 }
            int r3 = r2.size()     // Catch:{ all -> 0x0100 }
            if (r3 <= 0) goto L_0x0128
            r2.toString()     // Catch:{ all -> 0x0100 }
        L_0x0128:
            java.util.Iterator r2 = r18.iterator()     // Catch:{ all -> 0x0100 }
        L_0x012c:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0100 }
            if (r3 == 0) goto L_0x013e
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0100 }
            mye r3 = (defpackage.mye) r3     // Catch:{ all -> 0x0100 }
            hu1 r4 = r7.a     // Catch:{ all -> 0x0100 }
            r3.D(r4)     // Catch:{ all -> 0x0100 }
            goto L_0x012c
        L_0x013e:
            hu1 r2 = r7.a     // Catch:{ all -> 0x0100 }
            r3 = r18
            r2.l(r3)     // Catch:{ all -> 0x0100 }
            hu1 r2 = r7.b     // Catch:{ all -> 0x0100 }
            if (r2 == 0) goto L_0x016a
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x0100 }
        L_0x014d:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0100 }
            if (r4 == 0) goto L_0x0162
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0100 }
            mye r4 = (defpackage.mye) r4     // Catch:{ all -> 0x0100 }
            hu1 r5 = r7.b     // Catch:{ all -> 0x0100 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x0100 }
            r4.D(r5)     // Catch:{ all -> 0x0100 }
            goto L_0x014d
        L_0x0162:
            hu1 r2 = r7.b     // Catch:{ all -> 0x0100 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x0100 }
            r2.l(r3)     // Catch:{ all -> 0x0100 }
        L_0x016a:
            boolean r2 = r3.isEmpty()     // Catch:{ all -> 0x0100 }
            if (r2 == 0) goto L_0x01af
            java.util.Iterator r2 = r15.iterator()     // Catch:{ all -> 0x0100 }
        L_0x0174:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0100 }
            if (r3 == 0) goto L_0x01af
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0100 }
            mye r3 = (defpackage.mye) r3     // Catch:{ all -> 0x0100 }
            boolean r4 = r11.containsKey(r3)     // Catch:{ all -> 0x0100 }
            if (r4 == 0) goto L_0x0174
            java.lang.Object r4 = r11.get(r3)     // Catch:{ all -> 0x0100 }
            va0 r4 = (defpackage.va0) r4     // Catch:{ all -> 0x0100 }
            ia3 r5 = r4.d     // Catch:{ all -> 0x0100 }
            if (r5 == 0) goto L_0x0174
            c2d r6 = r3.n     // Catch:{ all -> 0x0100 }
            boolean r4 = y(r4, r6)     // Catch:{ all -> 0x0100 }
            if (r4 == 0) goto L_0x0174
            va0 r4 = r3.x(r5)     // Catch:{ all -> 0x0100 }
            r3.g = r4     // Catch:{ all -> 0x0100 }
            boolean r4 = r7.B0     // Catch:{ all -> 0x0100 }
            if (r4 == 0) goto L_0x0174
            hu1 r4 = r7.a     // Catch:{ all -> 0x0100 }
            r4.i(r3)     // Catch:{ all -> 0x0100 }
            hu1 r4 = r7.b     // Catch:{ all -> 0x0100 }
            if (r4 == 0) goto L_0x0174
            r4.i(r3)     // Catch:{ all -> 0x0100 }
            goto L_0x0174
        L_0x01af:
            java.util.Iterator r2 = r14.iterator()     // Catch:{ all -> 0x0100 }
        L_0x01b3:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0100 }
            if (r3 == 0) goto L_0x0209
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0100 }
            mye r3 = (defpackage.mye) r3     // Catch:{ all -> 0x0100 }
            r4 = r17
            java.lang.Object r5 = r4.get(r3)     // Catch:{ all -> 0x0100 }
            dv1 r5 = (defpackage.dv1) r5     // Catch:{ all -> 0x0100 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x0100 }
            hu1 r6 = r7.b     // Catch:{ all -> 0x0100 }
            if (r6 == 0) goto L_0x01ed
            hu1 r10 = r7.a     // Catch:{ all -> 0x0100 }
            pye r15 = r5.a     // Catch:{ all -> 0x0100 }
            pye r5 = r5.b     // Catch:{ all -> 0x0100 }
            r3.a(r10, r6, r15, r5)     // Catch:{ all -> 0x0100 }
            java.lang.Object r5 = r11.get(r3)     // Catch:{ all -> 0x0100 }
            va0 r5 = (defpackage.va0) r5     // Catch:{ all -> 0x0100 }
            r5.getClass()     // Catch:{ all -> 0x0100 }
            java.lang.Object r6 = r1.get(r3)     // Catch:{ all -> 0x0100 }
            va0 r6 = (defpackage.va0) r6     // Catch:{ all -> 0x0100 }
            va0 r5 = r3.y(r5, r6)     // Catch:{ all -> 0x0100 }
            r3.g = r5     // Catch:{ all -> 0x0100 }
            goto L_0x0206
        L_0x01ed:
            hu1 r6 = r7.a     // Catch:{ all -> 0x0100 }
            pye r10 = r5.a     // Catch:{ all -> 0x0100 }
            pye r5 = r5.b     // Catch:{ all -> 0x0100 }
            r15 = 0
            r3.a(r6, r15, r10, r5)     // Catch:{ all -> 0x0100 }
            java.lang.Object r5 = r11.get(r3)     // Catch:{ all -> 0x0100 }
            va0 r5 = (defpackage.va0) r5     // Catch:{ all -> 0x0100 }
            r5.getClass()     // Catch:{ all -> 0x0100 }
            va0 r5 = r3.y(r5, r15)     // Catch:{ all -> 0x0100 }
            r3.g = r5     // Catch:{ all -> 0x0100 }
        L_0x0206:
            r17 = r4
            goto L_0x01b3
        L_0x0209:
            boolean r1 = r7.B0     // Catch:{ all -> 0x0100 }
            if (r1 == 0) goto L_0x0219
            hu1 r1 = r7.a     // Catch:{ all -> 0x0100 }
            r1.k(r14)     // Catch:{ all -> 0x0100 }
            hu1 r1 = r7.b     // Catch:{ all -> 0x0100 }
            if (r1 == 0) goto L_0x0219
            r1.k(r14)     // Catch:{ all -> 0x0100 }
        L_0x0219:
            java.util.Iterator r1 = r14.iterator()     // Catch:{ all -> 0x0100 }
        L_0x021d:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0100 }
            if (r2 == 0) goto L_0x022d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0100 }
            mye r2 = (defpackage.mye) r2     // Catch:{ all -> 0x0100 }
            r2.r()     // Catch:{ all -> 0x0100 }
            goto L_0x021d
        L_0x022d:
            java.util.ArrayList r1 = r7.Y     // Catch:{ all -> 0x0100 }
            r1.clear()     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r1 = r7.Y     // Catch:{ all -> 0x0100 }
            r1.addAll(r8)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r1 = r7.Z     // Catch:{ all -> 0x0100 }
            r1.clear()     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r1 = r7.Z     // Catch:{ all -> 0x0100 }
            r1.addAll(r13)     // Catch:{ all -> 0x0100 }
            r7.D0 = r12     // Catch:{ all -> 0x0100 }
            r7.E0 = r0     // Catch:{ all -> 0x0100 }
            monitor-exit(r9)     // Catch:{ all -> 0x0100 }
            return
        L_0x0247:
            r0 = move-exception
            r10 = r4
            goto L_0x024e
        L_0x024a:
            monitor-exit(r1)     // Catch:{ all -> 0x024c }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0103 }
        L_0x024c:
            r0 = move-exception
            goto L_0x024a
        L_0x024e:
            if (r21 != 0) goto L_0x0261
            r19.x()     // Catch:{ all -> 0x0100 }
            ope r1 = r7.w0     // Catch:{ all -> 0x0100 }
            int r1 = r1.b     // Catch:{ all -> 0x0100 }
            if (r1 == r10) goto L_0x0261
            r1 = r22
            r2 = 1
            r7.B(r8, r2, r1)     // Catch:{ all -> 0x0100 }
            monitor-exit(r9)     // Catch:{ all -> 0x0100 }
            return
        L_0x0261:
            throw r0     // Catch:{ all -> 0x0100 }
        L_0x0262:
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            throw r0     // Catch:{ all -> 0x0100 }
        L_0x0264:
            monitor-exit(r9)     // Catch:{ all -> 0x0100 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev1.B(java.util.LinkedHashSet, boolean, boolean):void");
    }

    public final void C(HashMap hashMap, ArrayList arrayList) {
        synchronized (this.A0) {
            try {
                if (this.x0 != null && !arrayList.isEmpty()) {
                    boolean z = this.a.p().g() == 0;
                    Rect e = this.a.g().e();
                    Rational rational = this.x0.b;
                    int l = this.a.p().l(this.x0.c);
                    ybf ybf = this.x0;
                    HashMap i = udd.i(e, z, rational, l, ybf.a, ybf.d, hashMap);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        mye mye = (mye) it.next();
                        Rect rect = (Rect) i.get(mye);
                        rect.getClass();
                        mye.C(rect);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    mye mye2 = (mye) it2.next();
                    Rect e2 = this.a.g().e();
                    va0 va0 = (va0) hashMap.get(mye2);
                    va0.getClass();
                    mye2.A(m(e2, va0.a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final fu1 a() {
        return this.G0;
    }

    public final void c(List list) {
        synchronized (this.A0) {
            try {
                this.a.b(this.z0);
                hu1 hu1 = this.b;
                if (hu1 != null) {
                    hu1.b(this.z0);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.Y);
                linkedHashSet.addAll(list);
                hu1 hu12 = this.b;
                boolean z = false;
                boolean z2 = hu12 != null;
                if (hu12 != null) {
                    z = true;
                }
                B(linkedHashSet, z2, z);
            } catch (IllegalArgumentException e) {
                throw new Exception(e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.A0) {
            try {
                if (!this.B0) {
                    if (!this.Z.isEmpty()) {
                        this.a.b(this.z0);
                        hu1 hu1 = this.b;
                        if (hu1 != null) {
                            hu1.b(this.z0);
                        }
                    }
                    this.a.k(this.Z);
                    hu1 hu12 = this.b;
                    if (hu12 != null) {
                        hu12.k(this.Z);
                    }
                    synchronized (this.A0) {
                        if (this.C0 != null) {
                            this.a.g().c(this.C0);
                        }
                    }
                    Iterator it = this.Z.iterator();
                    while (it.hasNext()) {
                        ((mye) it.next()).r();
                    }
                    this.B0 = true;
                }
            } catch (Throwable th) {
                throw th;
            } finally {
                while (true) {
                }
            }
        }
    }

    public final mye i(LinkedHashSet linkedHashSet, nzd nzd) {
        boolean z;
        boolean z2;
        b3b b3b;
        synchronized (this.A0) {
            try {
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (nzd != null) {
                    arrayList.add(nzd);
                    arrayList.removeAll(nzd.q.a);
                }
                synchronized (this.A0) {
                    z = false;
                    z2 = ((Integer) this.z0.d(ft1.h, 0)).intValue() == 1;
                }
                if (z2) {
                    Iterator it = arrayList.iterator();
                    boolean z3 = false;
                    boolean z4 = false;
                    while (it.hasNext()) {
                        mye mye = (mye) it.next();
                        if (!(mye instanceof b3b)) {
                            if (!(mye instanceof nzd)) {
                                if (mye instanceof bq6) {
                                    z3 = true;
                                }
                            }
                        }
                        z4 = true;
                    }
                    if (!z3 || z4) {
                        Iterator it2 = arrayList.iterator();
                        boolean z5 = false;
                        while (it2.hasNext()) {
                            mye mye2 = (mye) it2.next();
                            if (!(mye2 instanceof b3b)) {
                                if (!(mye2 instanceof nzd)) {
                                    if (mye2 instanceof bq6) {
                                        z5 = true;
                                    }
                                }
                            }
                            z = true;
                        }
                        if (z && !z5) {
                            mye mye3 = this.D0;
                            if (mye3 instanceof bq6) {
                                b3b = mye3;
                            } else {
                                hp6 hp6 = new hp6(1);
                                hp6.b.j(gde.c0, "ImageCapture-Extra");
                                b3b = hp6.a();
                            }
                        }
                    } else {
                        mye mye4 = this.D0;
                        if (mye4 instanceof b3b) {
                            b3b = mye4;
                        } else {
                            hp6 hp62 = new hp6(2);
                            hp62.b.j(gde.c0, "Preview-Extra");
                            b3b b2 = hp62.b();
                            b2.G(new ak0(15));
                            b3b = b2;
                        }
                    }
                }
                b3b = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return b3b;
    }

    public final HashMap q(int i, fu1 fu1, ArrayList arrayList, ArrayList arrayList2, HashMap hashMap) {
        Size size;
        mn mnVar;
        Rect rect;
        boolean z;
        boolean z2;
        xa0 xa0;
        fu1 fu12 = fu1;
        ArrayList arrayList3 = new ArrayList();
        String d = fu1.d();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            size = null;
            mnVar = this.c;
            if (!hasNext) {
                break;
            }
            mye mye = (mye) it.next();
            int inputFormat = mye.f.getInputFormat();
            va0 va0 = mye.g;
            Size size2 = va0 != null ? va0.a : null;
            h4e h4e = (h4e) ((HashMap) mnVar.b).get(d);
            if (h4e != null) {
                xa0 = xa0.b(i, inputFormat, size2, h4e.i(inputFormat));
            } else {
                int i2 = i;
                xa0 = null;
            }
            int inputFormat2 = mye.f.getInputFormat();
            va0 va02 = mye.g;
            Size size3 = va02 != null ? va02.a : null;
            va02.getClass();
            k80 k80 = new k80(xa0, inputFormat2, size3, va02.b, nzd.J(mye), mye.g.d, (Range) mye.f.d(pye.p0, (Object) null));
            arrayList3.add(k80);
            hashMap3.put(k80, mye);
            hashMap2.put(mye, mye.g);
        }
        int i3 = i;
        if (!arrayList.isEmpty()) {
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            try {
                rect = this.a.g().e();
            } catch (NullPointerException unused) {
                rect = null;
            }
            if (rect != null) {
                size = hqe.e(rect);
            }
            jg8 jg8 = new jg8(fu12, size);
            Iterator it2 = arrayList.iterator();
            loop1:
            while (true) {
                z = false;
                while (true) {
                    if (!it2.hasNext()) {
                        break loop1;
                    }
                    mye mye2 = (mye) it2.next();
                    dv1 dv1 = (dv1) hashMap.get(mye2);
                    pye o2 = mye2.o(fu12, dv1.a, dv1.b);
                    hashMap4.put(o2, mye2);
                    hashMap5.put(o2, jg8.v(o2));
                    pye pye = mye2.f;
                    if (pye instanceof c3b) {
                        if (((c3b) pye).y() == 2) {
                            z = true;
                        }
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z2 = false;
                    break;
                }
                mye mye3 = (mye) it3.next();
                if (mye3 != null) {
                    if (!mye3.f.l(pye.s0)) {
                        mye3.toString();
                    } else if (mye3.f.t() == rye.o) {
                        z2 = true;
                        break;
                    }
                }
            }
            mnVar.getClass();
            e07.j("No new use cases to be bound.", !hashMap5.isEmpty());
            h4e h4e2 = (h4e) ((HashMap) mnVar.b).get(d);
            if (h4e2 != null) {
                Pair g = h4e2.g(i, arrayList3, hashMap5, z, z2);
                for (Map.Entry entry : hashMap4.entrySet()) {
                    hashMap2.put((mye) entry.getValue(), (va0) ((Map) g.first).get(entry.getKey()));
                }
                for (Map.Entry entry2 : ((Map) g.second).entrySet()) {
                    if (hashMap3.containsKey(entry2.getKey())) {
                        hashMap2.put((mye) hashMap3.get(entry2.getKey()), (va0) entry2.getValue());
                    }
                }
            } else {
                throw new IllegalArgumentException(rf0.h("No such camera id in supported combination list: ", d));
            }
        }
        return hashMap2;
    }

    public final nzd r(LinkedHashSet linkedHashSet, boolean z) {
        synchronized (this.A0) {
            try {
                HashSet v = v(linkedHashSet, z);
                if (v.size() < 2) {
                    x();
                    return null;
                }
                nzd nzd = this.E0;
                if (nzd == null || !nzd.q.a.equals(v)) {
                    int[] iArr = {1, 2, 4};
                    HashSet hashSet = new HashSet();
                    Iterator it = v.iterator();
                    while (it.hasNext()) {
                        mye mye = (mye) it.next();
                        int i = 0;
                        while (true) {
                            if (i < 3) {
                                int i2 = iArr[i];
                                if (mye.m(i2)) {
                                    if (hashSet.contains(Integer.valueOf(i2))) {
                                        return null;
                                    }
                                    hashSet.add(Integer.valueOf(i2));
                                }
                                i++;
                            }
                        }
                    }
                    nzd nzd2 = new nzd(this.a, this.b, this.I0, this.J0, v, this.o);
                    return nzd2;
                }
                nzd nzd3 = this.E0;
                Objects.requireNonNull(nzd3);
                return nzd3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        synchronized (this.A0) {
            try {
                if (this.B0) {
                    this.a.l(new ArrayList(this.Z));
                    hu1 hu1 = this.b;
                    if (hu1 != null) {
                        hu1.l(new ArrayList(this.Z));
                    }
                    synchronized (this.A0) {
                        ot1 g = this.a.g();
                        this.C0 = g.m();
                        g.n();
                    }
                    this.B0 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet v(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.A0) {
            try {
                Iterator it = this.y0.iterator();
                k5f k5f = null;
                while (true) {
                    boolean z2 = true;
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    k5f k5f2 = (k5f) it.next();
                    int i2 = 0;
                    for (int i3 = k5f2.a; i3 != 0; i3 >>= 1) {
                        i2 += i3 & 1;
                    }
                    if (i2 > 1) {
                        if (k5f != null) {
                            z2 = false;
                        }
                        e07.p("Can only have one sharing effect.", z2);
                        k5f = k5f2;
                    }
                }
                if (k5f != null) {
                    i = k5f.a;
                }
                if (z) {
                    i |= 3;
                }
            } finally {
                while (true) {
                }
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            mye mye = (mye) it2.next();
            e07.j("Only support one level of sharing for now.", !(mye instanceof nzd));
            if (mye.m(i)) {
                hashSet.add(mye);
            }
        }
        return hashSet;
    }

    public final List w() {
        ArrayList arrayList;
        synchronized (this.A0) {
            arrayList = new ArrayList(this.Y);
        }
        return arrayList;
    }

    public final void x() {
        synchronized (this.A0) {
            this.z0.v();
        }
    }

    public final void z(ArrayList arrayList) {
        synchronized (this.A0) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.Y);
            linkedHashSet.removeAll(arrayList);
            hu1 hu1 = this.b;
            boolean z = false;
            boolean z2 = hu1 != null;
            if (hu1 != null) {
                z = true;
            }
            B(linkedHashSet, z2, z);
        }
    }
}
