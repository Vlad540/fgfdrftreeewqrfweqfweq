package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.media.MediaRoute2Info;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* renamed from: ub8  reason: default package */
public final class ub8 implements u8e, y7c {
    public final ea6 A = new ea6(20, this);
    public final Context a;
    public boolean b;
    public p8e c;
    public boolean d;
    public ea8 e;
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final HashMap h = new HashMap();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final g02 k = new g02(16);
    public final e3 l = new e3(this);
    public final sb8 m = new sb8(this);
    public final boolean n;
    public zb8 o;
    public xb8 p;
    public xb8 q;
    public xb8 r;
    public nb8 s;
    public xb8 t;
    public mb8 u;
    public final HashMap v = new HashMap();
    public va8 w;
    public va8 x;
    public int y;
    public vb8 z;

    public ub8(Context context) {
        this.a = context;
        this.n = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
    }

    public final void a(ob8 ob8) {
        if (d(ob8) == null) {
            wb8 wb8 = new wb8(ob8);
            this.i.add(wb8);
            if (yb8.c) {
                wb8.toString();
            }
            this.m.b(513, wb8);
            l(wb8, ob8.Z);
            yb8.b();
            ob8.o = this.l;
            ob8.h(this.w);
        }
    }

    public final String b(wb8 wb8, String str) {
        String flattenToShortString = ((ComponentName) wb8.c.b).flattenToShortString();
        String i2 = me4.i(flattenToShortString, ":", str);
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (((xb8) arrayList.get(i3)).c.equals(i2)) {
                break;
            } else {
                i3++;
            }
        }
        HashMap hashMap = this.h;
        if (i3 < 0) {
            hashMap.put(new yia(flattenToShortString, str), i2);
            return i2;
        }
        int i4 = 2;
        while (true) {
            Locale locale = Locale.US;
            String str2 = i2 + "_" + i4;
            int size2 = arrayList.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size2) {
                    i5 = -1;
                    break;
                } else if (((xb8) arrayList.get(i5)).c.equals(str2)) {
                    break;
                } else {
                    i5++;
                }
            }
            if (i5 < 0) {
                hashMap.put(new yia(flattenToShortString, str), str2);
                return str2;
            }
            i4++;
        }
    }

    public final xb8 c() {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            xb8 xb8 = (xb8) it.next();
            if (xb8 != this.p && xb8.c() == this.c && xb8.m("android.media.intent.category.LIVE_AUDIO") && !xb8.m("android.media.intent.category.LIVE_VIDEO") && xb8.f()) {
                return xb8;
            }
        }
        return this.p;
    }

    public final wb8 d(ob8 ob8) {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((wb8) arrayList.get(i2)).a == ob8) {
                return (wb8) arrayList.get(i2);
            }
        }
        return null;
    }

    public final xb8 e() {
        xb8 xb8 = this.p;
        if (xb8 != null) {
            return xb8;
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    public final xb8 f() {
        xb8 xb8 = this.r;
        if (xb8 != null) {
            return xb8;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    public final void g() {
        if (this.r.e()) {
            List<xb8> unmodifiableList = Collections.unmodifiableList(this.r.u);
            HashSet hashSet = new HashSet();
            for (xb8 xb8 : unmodifiableList) {
                hashSet.add(xb8.c);
            }
            HashMap hashMap = this.v;
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    nb8 nb8 = (nb8) entry.getValue();
                    nb8.h(0);
                    nb8.d();
                    it.remove();
                }
            }
            for (xb8 xb82 : unmodifiableList) {
                if (!hashMap.containsKey(xb82.c)) {
                    nb8 e2 = xb82.c().e(xb82.b, this.r.b);
                    e2.e();
                    hashMap.put(xb82.c, e2);
                }
            }
        }
    }

    public final void h(xb8 xb8, int i2) {
        ea8 ea8;
        if (!this.g.contains(xb8)) {
            Objects.toString(xb8);
        } else if (!xb8.g) {
            xb8.toString();
        } else if (Build.VERSION.SDK_INT < 30 || xb8.c() != (ea8 = this.e) || this.r == xb8) {
            i(xb8, i2);
        } else {
            MediaRoute2Info i3 = ea8.i(xb8.b);
            if (i3 != null) {
                ea8.x0.transferTo(i3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (defpackage.yb8.c().e() == r11) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0046 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i(defpackage.xb8 r11, int r12) {
        /*
            r10 = this;
            ub8 r0 = defpackage.yb8.d
            r1 = 3
            if (r0 == 0) goto L_0x0019
            xb8 r0 = r10.q
            if (r0 == 0) goto L_0x0042
            r11.getClass()
            defpackage.yb8.b()
            ub8 r0 = defpackage.yb8.c()
            xb8 r0 = r0.e()
            if (r0 != r11) goto L_0x0042
        L_0x0019:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r2 = r1
        L_0x0022:
            int r3 = r0.length
            if (r2 >= r3) goto L_0x0033
            r3 = r0[r2]
            r3.getClassName()
            r3.getMethodName()
            r3.getLineNumber()
            int r2 = r2 + 1
            goto L_0x0022
        L_0x0033:
            ub8 r0 = defpackage.yb8.d
            if (r0 != 0) goto L_0x003d
            android.content.Context r0 = r10.a
            r0.getPackageName()
            goto L_0x0042
        L_0x003d:
            android.content.Context r0 = r10.a
            r0.getPackageName()
        L_0x0042:
            xb8 r0 = r10.r
            if (r0 != r11) goto L_0x0047
            return
        L_0x0047:
            xb8 r0 = r10.t
            r2 = 0
            if (r0 == 0) goto L_0x005c
            r10.t = r2
            mb8 r0 = r10.u
            if (r0 == 0) goto L_0x005c
            r0.h(r1)
            mb8 r0 = r10.u
            r0.d()
            r10.u = r2
        L_0x005c:
            boolean r0 = r10.d
            if (r0 == 0) goto L_0x00c9
            wb8 r0 = r11.a
            pb8 r0 = r0.d
            if (r0 == 0) goto L_0x00c9
            boolean r0 = r0.b
            if (r0 == 0) goto L_0x00c9
            ob8 r0 = r11.c()
            java.lang.String r1 = r11.b
            mb8 r0 = r0.c(r1)
            if (r0 == 0) goto L_0x00c6
            android.content.Context r12 = r10.a
            java.util.concurrent.Executor r12 = defpackage.kq3.a(r12)
            ea6 r5 = r10.A
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            if (r12 == 0) goto L_0x00bc
            if (r5 == 0) goto L_0x00b4
            r0.b = r12     // Catch:{ all -> 0x00a9 }
            r0.c = r5     // Catch:{ all -> 0x00a9 }
            java.util.ArrayList r12 = r0.e     // Catch:{ all -> 0x00a9 }
            if (r12 == 0) goto L_0x00ab
            boolean r12 = r12.isEmpty()     // Catch:{ all -> 0x00a9 }
            if (r12 != 0) goto L_0x00ab
            ta8 r6 = r0.d     // Catch:{ all -> 0x00a9 }
            java.util.ArrayList r7 = r0.e     // Catch:{ all -> 0x00a9 }
            r0.d = r2     // Catch:{ all -> 0x00a9 }
            r0.e = r2     // Catch:{ all -> 0x00a9 }
            java.util.concurrent.Executor r12 = r0.b     // Catch:{ all -> 0x00a9 }
            kb8 r2 = new kb8     // Catch:{ all -> 0x00a9 }
            r8 = 0
            r3 = r2
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00a9 }
            r12.execute(r2)     // Catch:{ all -> 0x00a9 }
            goto L_0x00ab
        L_0x00a9:
            r10 = move-exception
            goto L_0x00c4
        L_0x00ab:
            monitor-exit(r1)     // Catch:{ all -> 0x00a9 }
            r10.t = r11
            r10.u = r0
            r0.e()
            return
        L_0x00b4:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch:{ all -> 0x00a9 }
            java.lang.String r11 = "Listener shouldn't be null"
            r10.<init>(r11)     // Catch:{ all -> 0x00a9 }
            throw r10     // Catch:{ all -> 0x00a9 }
        L_0x00bc:
            java.lang.NullPointerException r10 = new java.lang.NullPointerException     // Catch:{ all -> 0x00a9 }
            java.lang.String r11 = "Executor shouldn't be null"
            r10.<init>(r11)     // Catch:{ all -> 0x00a9 }
            throw r10     // Catch:{ all -> 0x00a9 }
        L_0x00c4:
            monitor-exit(r1)     // Catch:{ all -> 0x00a9 }
            throw r10
        L_0x00c6:
            r11.toString()
        L_0x00c9:
            ob8 r0 = r11.c()
            java.lang.String r1 = r11.b
            nb8 r6 = r0.d(r1)
            if (r6 == 0) goto L_0x00d8
            r6.e()
        L_0x00d8:
            boolean r0 = defpackage.yb8.c
            if (r0 == 0) goto L_0x00df
            r11.toString()
        L_0x00df:
            xb8 r0 = r10.r
            if (r0 != 0) goto L_0x00fa
            r10.r = r11
            r10.s = r6
            sb8 r10 = r10.m
            yia r0 = new yia
            r0.<init>(r2, r11)
            r11 = 262(0x106, float:3.67E-43)
            android.os.Message r10 = r10.obtainMessage(r11, r0)
            r10.arg1 = r12
            r10.sendToTarget()
            return
        L_0x00fa:
            vb8 r0 = r10.z
            if (r0 == 0) goto L_0x0117
            boolean r1 = r0.i
            if (r1 != 0) goto L_0x0115
            boolean r1 = r0.j
            if (r1 == 0) goto L_0x0107
            goto L_0x0115
        L_0x0107:
            r1 = 1
            r0.j = r1
            nb8 r0 = r0.a
            if (r0 == 0) goto L_0x0115
            r1 = 0
            r0.h(r1)
            r0.d()
        L_0x0115:
            r10.z = r2
        L_0x0117:
            vb8 r0 = new vb8
            r8 = 0
            r9 = 0
            r3 = r0
            r4 = r10
            r5 = r11
            r7 = r12
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r10.z = r0
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub8.i(xb8, int):void");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [jm6, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x010c, code lost:
        if (r0.x.b() == r2) goto L_0x0136;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x00a8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j() {
        /*
            r21 = this;
            r0 = r21
            jm6 r1 = new jm6
            r1.<init>()
            zb8 r2 = r0.o
            r3 = 0
            r2.c = r3
            r5 = 0
            r2.b = r5
            long r6 = android.os.SystemClock.elapsedRealtime()
            r2.o = r6
            java.lang.Object r6 = r2.X
            android.os.Handler r6 = (android.os.Handler) r6
            java.lang.Object r2 = r2.Y
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r6.removeCallbacks(r2)
            java.util.ArrayList r2 = r0.f
            int r6 = r2.size()
            r7 = r5
            r8 = r7
        L_0x0029:
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x00c7
            java.lang.Object r9 = r2.get(r6)
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r9 = r9.get()
            yb8 r9 = (defpackage.yb8) r9
            if (r9 != 0) goto L_0x0042
            r2.remove(r6)
            r16 = r6
            goto L_0x00c0
        L_0x0042:
            java.util.ArrayList r9 = r9.b
            int r10 = r9.size()
            int r7 = r7 + r10
            r11 = r5
        L_0x004a:
            if (r11 >= r10) goto L_0x00ba
            java.lang.Object r12 = r9.get(r11)
            rb8 r12 = (defpackage.rb8) r12
            qb8 r13 = r12.c
            if (r13 == 0) goto L_0x00b2
            java.util.ArrayList r13 = r13.b()
            r1.b(r13)
            int r13 = r12.d
            r14 = 1
            r13 = r13 & r14
            if (r13 == 0) goto L_0x0065
            r13 = r14
            goto L_0x0066
        L_0x0065:
            r13 = r5
        L_0x0066:
            zb8 r15 = r0.o
            r16 = r6
            long r5 = r12.e
            if (r13 != 0) goto L_0x0076
            r15.getClass()
        L_0x0071:
            r17 = r7
            r18 = r8
            goto L_0x0092
        L_0x0076:
            long r3 = r15.o
            long r17 = r3 - r5
            r19 = 30000(0x7530, double:1.4822E-319)
            int r17 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r17 < 0) goto L_0x0081
            goto L_0x0071
        L_0x0081:
            r17 = r7
            r18 = r8
            long r7 = r15.c
            long r5 = r5 + r19
            long r5 = r5 - r3
            long r3 = java.lang.Math.max(r7, r5)
            r15.c = r3
            r15.b = r14
        L_0x0092:
            if (r13 == 0) goto L_0x0096
            r8 = r14
            goto L_0x0098
        L_0x0096:
            r8 = r18
        L_0x0098:
            int r3 = r12.d
            r4 = r3 & 4
            if (r4 == 0) goto L_0x00a3
            boolean r4 = r0.n
            if (r4 != 0) goto L_0x00a3
            r8 = r14
        L_0x00a3:
            r3 = r3 & 8
            if (r3 == 0) goto L_0x00a8
            r8 = r14
        L_0x00a8:
            int r11 = r11 + 1
            r6 = r16
            r7 = r17
            r3 = 0
            r5 = 0
            goto L_0x004a
        L_0x00b2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "selector must not be null"
            r0.<init>(r1)
            throw r0
        L_0x00ba:
            r16 = r6
            r17 = r7
            r18 = r8
        L_0x00c0:
            r6 = r16
            r3 = 0
            r5 = 0
            goto L_0x0029
        L_0x00c7:
            zb8 r2 = r0.o
            boolean r3 = r2.b
            if (r3 == 0) goto L_0x00e0
            long r3 = r2.c
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x00e0
            java.lang.Object r5 = r2.X
            android.os.Handler r5 = (android.os.Handler) r5
            java.lang.Object r6 = r2.Y
            java.lang.Runnable r6 = (java.lang.Runnable) r6
            r5.postDelayed(r6, r3)
        L_0x00e0:
            boolean r2 = r2.b
            r0.y = r7
            if (r8 == 0) goto L_0x00eb
            qb8 r3 = r1.e()
            goto L_0x00ed
        L_0x00eb:
            qb8 r3 = defpackage.qb8.c
        L_0x00ed:
            qb8 r1 = r1.e()
            boolean r4 = r0.d
            r5 = 0
            if (r4 != 0) goto L_0x00f7
            goto L_0x0136
        L_0x00f7:
            va8 r4 = r0.x
            if (r4 == 0) goto L_0x010f
            r4.a()
            qb8 r4 = r4.b
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x010f
            va8 r4 = r0.x
            boolean r4 = r4.b()
            if (r4 != r2) goto L_0x010f
            goto L_0x0136
        L_0x010f:
            boolean r4 = r1.c()
            if (r4 == 0) goto L_0x011f
            if (r2 != 0) goto L_0x011f
            va8 r1 = r0.x
            if (r1 != 0) goto L_0x011c
            goto L_0x0136
        L_0x011c:
            r0.x = r5
            goto L_0x0126
        L_0x011f:
            va8 r4 = new va8
            r4.<init>(r1, r2)
            r0.x = r4
        L_0x0126:
            boolean r1 = defpackage.yb8.c
            if (r1 == 0) goto L_0x012f
            va8 r1 = r0.x
            java.util.Objects.toString(r1)
        L_0x012f:
            ea8 r1 = r0.e
            va8 r4 = r0.x
            r1.h(r4)
        L_0x0136:
            va8 r1 = r0.w
            if (r1 == 0) goto L_0x014e
            r1.a()
            qb8 r1 = r1.b
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x014e
            va8 r1 = r0.w
            boolean r1 = r1.b()
            if (r1 != r2) goto L_0x014e
            return
        L_0x014e:
            boolean r1 = r3.c()
            if (r1 == 0) goto L_0x015e
            if (r2 != 0) goto L_0x015e
            va8 r1 = r0.w
            if (r1 != 0) goto L_0x015b
            return
        L_0x015b:
            r0.w = r5
            goto L_0x0165
        L_0x015e:
            va8 r1 = new va8
            r1.<init>(r3, r2)
            r0.w = r1
        L_0x0165:
            boolean r1 = defpackage.yb8.c
            if (r1 == 0) goto L_0x016e
            va8 r1 = r0.w
            java.util.Objects.toString(r1)
        L_0x016e:
            java.util.ArrayList r1 = r0.i
            int r2 = r1.size()
            r5 = 0
        L_0x0175:
            if (r5 >= r2) goto L_0x018c
            java.lang.Object r3 = r1.get(r5)
            wb8 r3 = (defpackage.wb8) r3
            ob8 r3 = r3.a
            ea8 r4 = r0.e
            if (r3 != r4) goto L_0x0184
            goto L_0x0189
        L_0x0184:
            va8 r4 = r0.w
            r3.h(r4)
        L_0x0189:
            int r5 = r5 + 1
            goto L_0x0175
        L_0x018c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub8.j():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k() {
        /*
            r4 = this;
            xb8 r0 = r4.r
            if (r0 == 0) goto L_0x0065
            int r1 = r0.o
            g02 r1 = r4.k
            r1.getClass()
            int r2 = r0.p
            r1.getClass()
            boolean r2 = r0.e()
            r3 = 0
            if (r2 == 0) goto L_0x0023
            ub8 r2 = defpackage.yb8.d
            if (r2 != 0) goto L_0x001c
            goto L_0x0025
        L_0x001c:
            ub8 r2 = defpackage.yb8.c()
            r2.getClass()
        L_0x0023:
            int r0 = r0.n
        L_0x0025:
            r1.getClass()
            xb8 r0 = r4.r
            int r2 = r0.l
            r1.getClass()
            int r2 = r0.k
            r1.getClass()
            boolean r1 = r4.d
            if (r1 == 0) goto L_0x0051
            ob8 r0 = r0.c()
            ea8 r1 = r4.e
            if (r0 != r1) goto L_0x0051
            nb8 r0 = r4.s
            boolean r1 = r0 instanceof defpackage.aa8
            if (r1 != 0) goto L_0x0047
            goto L_0x0051
        L_0x0047:
            aa8 r0 = (defpackage.aa8) r0
            android.media.MediaRouter2$RoutingController r0 = r0.g
            if (r0 != 0) goto L_0x004e
            goto L_0x0051
        L_0x004e:
            java.lang.String unused = r0.getId()
        L_0x0051:
            java.util.ArrayList r4 = r4.j
            int r0 = r4.size()
            if (r0 > 0) goto L_0x005a
            goto L_0x0065
        L_0x005a:
            java.lang.Object r4 = r4.get(r3)
            tb8 r4 = (defpackage.tb8) r4
            r4.getClass()
            r4 = 0
            throw r4
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub8.k():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r2 != r0.c.Z) goto L_0x013a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0147 A[LOOP:5: B:65:0x0145->B:66:0x0147, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0162  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x017b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(defpackage.wb8 r18, defpackage.pb8 r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            pb8 r3 = r1.d
            if (r3 == r2) goto L_0x0183
            r1.d = r2
            java.util.ArrayList r3 = r0.g
            java.util.ArrayList r4 = r1.b
            sb8 r7 = r0.m
            if (r2 == 0) goto L_0x013a
            java.util.List r8 = r2.c
            int r9 = r8.size()
            r10 = 0
        L_0x001b:
            if (r10 >= r9) goto L_0x0035
            java.lang.Object r11 = r8.get(r10)
            ta8 r11 = (defpackage.ta8) r11
            if (r11 == 0) goto L_0x002f
            boolean r11 = r11.d()
            if (r11 != 0) goto L_0x002c
            goto L_0x002f
        L_0x002c:
            int r10 = r10 + 1
            goto L_0x001b
        L_0x002f:
            p8e r9 = r0.c
            pb8 r9 = r9.Z
            if (r2 != r9) goto L_0x013a
        L_0x0035:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r8 = r8.iterator()
            r10 = 0
            r11 = 0
        L_0x0045:
            boolean r12 = r8.hasNext()
            r13 = 257(0x101, float:3.6E-43)
            if (r12 == 0) goto L_0x00ec
            java.lang.Object r12 = r8.next()
            ta8 r12 = (defpackage.ta8) r12
            if (r12 == 0) goto L_0x00e7
            boolean r14 = r12.d()
            if (r14 != 0) goto L_0x005d
            goto L_0x00e7
        L_0x005d:
            java.lang.String r14 = r12.c()
            int r15 = r4.size()
            r5 = 0
        L_0x0066:
            if (r5 >= r15) goto L_0x007c
            java.lang.Object r16 = r4.get(r5)
            r6 = r16
            xb8 r6 = (defpackage.xb8) r6
            java.lang.String r6 = r6.b
            boolean r6 = r6.equals(r14)
            if (r6 == 0) goto L_0x0079
            goto L_0x007d
        L_0x0079:
            int r5 = r5 + 1
            goto L_0x0066
        L_0x007c:
            r5 = -1
        L_0x007d:
            if (r5 >= 0) goto L_0x00b2
            java.lang.String r5 = r0.b(r1, r14)
            xb8 r6 = new xb8
            r6.<init>(r1, r14, r5)
            int r5 = r10 + 1
            r4.add(r10, r6)
            r3.add(r6)
            java.util.List r10 = r12.b()
            int r10 = r10.size()
            if (r10 <= 0) goto L_0x00a3
            yia r10 = new yia
            r10.<init>(r6, r12)
            r2.add(r10)
            goto L_0x00b0
        L_0x00a3:
            r6.i(r12)
            boolean r10 = defpackage.yb8.c
            if (r10 == 0) goto L_0x00ad
            r6.toString()
        L_0x00ad:
            r7.b(r13, r6)
        L_0x00b0:
            r10 = r5
            goto L_0x0045
        L_0x00b2:
            if (r5 >= r10) goto L_0x00b8
            r12.toString()
            goto L_0x0045
        L_0x00b8:
            java.lang.Object r6 = r4.get(r5)
            xb8 r6 = (defpackage.xb8) r6
            int r13 = r10 + 1
            java.util.Collections.swap(r4, r5, r10)
            java.util.List r5 = r12.b()
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x00d6
            yia r5 = new yia
            r5.<init>(r6, r12)
            r9.add(r5)
            goto L_0x00e4
        L_0x00d6:
            int r5 = r0.m(r6, r12)
            if (r5 == 0) goto L_0x00e4
            xb8 r5 = r0.r
            if (r6 != r5) goto L_0x00e4
            r10 = r13
            r11 = 1
            goto L_0x0045
        L_0x00e4:
            r10 = r13
            goto L_0x0045
        L_0x00e7:
            java.util.Objects.toString(r12)
            goto L_0x0045
        L_0x00ec:
            java.util.Iterator r2 = r2.iterator()
        L_0x00f0:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0112
            java.lang.Object r5 = r2.next()
            yia r5 = (defpackage.yia) r5
            java.lang.Object r6 = r5.a
            xb8 r6 = (defpackage.xb8) r6
            java.lang.Object r5 = r5.b
            ta8 r5 = (defpackage.ta8) r5
            r6.i(r5)
            boolean r5 = defpackage.yb8.c
            if (r5 == 0) goto L_0x010e
            r6.toString()
        L_0x010e:
            r7.b(r13, r6)
            goto L_0x00f0
        L_0x0112:
            java.util.Iterator r2 = r9.iterator()
            r5 = r11
        L_0x0117:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L_0x0137
            java.lang.Object r6 = r2.next()
            yia r6 = (defpackage.yia) r6
            java.lang.Object r8 = r6.a
            xb8 r8 = (defpackage.xb8) r8
            java.lang.Object r6 = r6.b
            ta8 r6 = (defpackage.ta8) r6
            int r6 = r0.m(r8, r6)
            if (r6 == 0) goto L_0x0117
            xb8 r6 = r0.r
            if (r8 != r6) goto L_0x0117
            r5 = 1
            goto L_0x0117
        L_0x0137:
            r2 = r5
            r5 = r10
            goto L_0x013f
        L_0x013a:
            java.util.Objects.toString(r19)
            r2 = 0
            r5 = 0
        L_0x013f:
            int r6 = r4.size()
            r8 = 1
            int r6 = r6 - r8
        L_0x0145:
            if (r6 < r5) goto L_0x0157
            java.lang.Object r8 = r4.get(r6)
            xb8 r8 = (defpackage.xb8) r8
            r9 = 0
            r8.i(r9)
            r3.remove(r8)
            int r6 = r6 + -1
            goto L_0x0145
        L_0x0157:
            r0.n(r2)
            int r0 = r4.size()
            r2 = 1
            int r0 = r0 - r2
        L_0x0160:
            if (r0 < r5) goto L_0x0177
            java.lang.Object r2 = r4.remove(r0)
            xb8 r2 = (defpackage.xb8) r2
            boolean r3 = defpackage.yb8.c
            if (r3 == 0) goto L_0x016f
            java.util.Objects.toString(r2)
        L_0x016f:
            r3 = 258(0x102, float:3.62E-43)
            r7.b(r3, r2)
            int r0 = r0 + -1
            goto L_0x0160
        L_0x0177:
            boolean r0 = defpackage.yb8.c
            if (r0 == 0) goto L_0x017e
            r18.toString()
        L_0x017e:
            r0 = 515(0x203, float:7.22E-43)
            r7.b(r0, r1)
        L_0x0183:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ub8.l(wb8, pb8):void");
    }

    public final int m(xb8 xb8, ta8 ta8) {
        int i2 = xb8.i(ta8);
        if (i2 != 0) {
            int i3 = i2 & 1;
            sb8 sb8 = this.m;
            if (i3 != 0) {
                if (yb8.c) {
                    xb8.toString();
                }
                sb8.b(259, xb8);
            }
            if ((i2 & 2) != 0) {
                if (yb8.c) {
                    xb8.toString();
                }
                sb8.b(260, xb8);
            }
            if ((i2 & 4) != 0) {
                if (yb8.c) {
                    xb8.toString();
                }
                sb8.b(261, xb8);
            }
        }
        return i2;
    }

    public final void n(boolean z2) {
        xb8 xb8 = this.p;
        if (xb8 != null && !xb8.f()) {
            Objects.toString(this.p);
            this.p = null;
        }
        xb8 xb82 = this.p;
        ArrayList arrayList = this.g;
        if (xb82 == null && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                xb8 xb83 = (xb8) it.next();
                if (xb83.c() == this.c && xb83.b.equals("DEFAULT_ROUTE") && xb83.f()) {
                    this.p = xb83;
                    Objects.toString(xb83);
                    break;
                }
            }
        }
        xb8 xb84 = this.q;
        if (xb84 != null && !xb84.f()) {
            Objects.toString(this.q);
            this.q = null;
        }
        if (this.q == null && !arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                xb8 xb85 = (xb8) it2.next();
                if (xb85.c() == this.c && xb85.m("android.media.intent.category.LIVE_AUDIO") && !xb85.m("android.media.intent.category.LIVE_VIDEO") && xb85.f()) {
                    this.q = xb85;
                    Objects.toString(xb85);
                    break;
                }
            }
        }
        xb8 xb86 = this.r;
        if (xb86 == null || !xb86.g) {
            Objects.toString(xb86);
            i(c(), 0);
        } else if (z2) {
            g();
            k();
        }
    }
}
