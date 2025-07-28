package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* renamed from: lr7  reason: default package */
public final class lr7 implements fv3, el8 {
    public final o3e X;
    public fl8 Y;
    public long Z = SystemClock.uptimeMillis();
    public final wwc a = null;
    public final jn b;
    public final jn c;
    public final vze o;
    public final boolean w0 = false;
    public final boolean x0 = false;

    public lr7(vze vze, o3e o3e) {
        new WeakHashMap();
        this.o = vze;
        this.b = new jn(new otf(this, vze, false));
        this.c = new jn(new otf(this, vze, false));
        this.X = o3e;
        fl8 fl8 = (fl8) o3e.get();
        ez3.n(fl8, "mMemoryCacheParamsSupplier returned null");
        this.Y = fl8;
    }

    public static void e(ev3 ev3) {
        wwc wwc;
        if (ev3 != null && (wwc = ev3.e) != null) {
            wwc.Y(ev3.a, false);
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final defpackage.t54 a(java.lang.Object r8, defpackage.e13 r9, wwc r10) {
        /*
            r7 = this;
            r8.getClass()
            r9.getClass()
            r7.f()
            monitor-enter(r7)
            jn r0 = r7.b     // Catch:{ all -> 0x002d }
            java.lang.Object r0 = r0.M(r8)     // Catch:{ all -> 0x002d }
            ev3 r0 = (defpackage.ev3) r0     // Catch:{ all -> 0x002d }
            jn r1 = r7.c     // Catch:{ all -> 0x002d }
            java.lang.Object r1 = r1.M(r8)     // Catch:{ all -> 0x002d }
            ev3 r1 = (defpackage.ev3) r1     // Catch:{ all -> 0x002d }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0033
            monitor-enter(r7)     // Catch:{ all -> 0x002d }
            boolean r4 = r1.d     // Catch:{ all -> 0x0030 }
            r4 = r4 ^ r2
            defpackage.ez3.o(r4)     // Catch:{ all -> 0x0030 }
            r1.d = r2     // Catch:{ all -> 0x0030 }
            monitor-exit(r7)     // Catch:{ all -> 0x002d }
            e13 r1 = r7.h(r1)     // Catch:{ all -> 0x002d }
            goto L_0x0034
        L_0x002d:
            r8 = move-exception
            goto L_0x00a4
        L_0x0030:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0030 }
            throw r8     // Catch:{ all -> 0x002d }
        L_0x0033:
            r1 = r3
        L_0x0034:
            java.lang.Object r4 = r9.e0()     // Catch:{ all -> 0x002d }
            vze r5 = r7.o     // Catch:{ all -> 0x002d }
            int r4 = r5.i(r4)     // Catch:{ all -> 0x002d }
            monitor-enter(r7)     // Catch:{ all -> 0x002d }
            fl8 r5 = r7.Y     // Catch:{ all -> 0x0072 }
            int r5 = r5.d     // Catch:{ all -> 0x0072 }
            if (r4 > r5) goto L_0x007a
            monitor-enter(r7)     // Catch:{ all -> 0x0072 }
            jn r5 = r7.c     // Catch:{ all -> 0x0077 }
            int r5 = r5.t()     // Catch:{ all -> 0x0077 }
            jn r6 = r7.b     // Catch:{ all -> 0x0077 }
            int r6 = r6.t()     // Catch:{ all -> 0x0077 }
            int r5 = r5 - r6
            monitor-exit(r7)     // Catch:{ all -> 0x0072 }
            fl8 r6 = r7.Y     // Catch:{ all -> 0x0072 }
            int r6 = r6.b     // Catch:{ all -> 0x0072 }
            int r6 = r6 - r2
            if (r5 > r6) goto L_0x007a
            monitor-enter(r7)     // Catch:{ all -> 0x0072 }
            jn r5 = r7.c     // Catch:{ all -> 0x0074 }
            int r5 = r5.v()     // Catch:{ all -> 0x0074 }
            jn r6 = r7.b     // Catch:{ all -> 0x0074 }
            int r6 = r6.v()     // Catch:{ all -> 0x0074 }
            int r5 = r5 - r6
            monitor-exit(r7)     // Catch:{ all -> 0x0072 }
            fl8 r6 = r7.Y     // Catch:{ all -> 0x0072 }
            int r6 = r6.a     // Catch:{ all -> 0x0072 }
            int r6 = r6 - r4
            if (r5 > r6) goto L_0x007a
            goto L_0x007b
        L_0x0072:
            r8 = move-exception
            goto L_0x00a2
        L_0x0074:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0074 }
            throw r8     // Catch:{ all -> 0x0072 }
        L_0x0077:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0077 }
            throw r8     // Catch:{ all -> 0x0072 }
        L_0x007a:
            r2 = 0
        L_0x007b:
            monitor-exit(r7)     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0097
            boolean r2 = r7.w0     // Catch:{ all -> 0x002d }
            if (r2 == 0) goto L_0x0088
            ev3 r2 = new ev3     // Catch:{ all -> 0x002d }
            r2.<init>(r8, r9, r10, r4)     // Catch:{ all -> 0x002d }
            goto L_0x008e
        L_0x0088:
            ev3 r2 = new ev3     // Catch:{ all -> 0x002d }
            r3 = -1
            r2.<init>(r8, r9, r10, r3)     // Catch:{ all -> 0x002d }
        L_0x008e:
            jn r9 = r7.c     // Catch:{ all -> 0x002d }
            r9.J(r8, r2)     // Catch:{ all -> 0x002d }
            t54 r3 = r7.g(r2)     // Catch:{ all -> 0x002d }
        L_0x0097:
            monitor-exit(r7)     // Catch:{ all -> 0x002d }
            defpackage.e13.S(r1)
            e(r0)
            r7.c()
            return r3
        L_0x00a2:
            monitor-exit(r7)     // Catch:{ all -> 0x0072 }
            throw r8     // Catch:{ all -> 0x002d }
        L_0x00a4:
            monitor-exit(r7)     // Catch:{ all -> 0x002d }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr7.a(java.lang.Object, e13, wwc):t54");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void b(java.util.ArrayList r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            if (r4 == 0) goto L_0x0028
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0025 }
        L_0x0007:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x0025 }
            ev3 r0 = (defpackage.ev3) r0     // Catch:{ all -> 0x0025 }
            monitor-enter(r3)     // Catch:{ all -> 0x0025 }
            r0.getClass()     // Catch:{ all -> 0x0022 }
            boolean r1 = r0.d     // Catch:{ all -> 0x0022 }
            r2 = 1
            r1 = r1 ^ r2
            defpackage.ez3.o(r1)     // Catch:{ all -> 0x0022 }
            r0.d = r2     // Catch:{ all -> 0x0022 }
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            goto L_0x0007
        L_0x0022:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0022 }
            throw r4     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0025 }
            throw r4
        L_0x0028:
            monitor-exit(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr7.b(java.util.ArrayList):void");
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void c() {
        /*
            r5 = this;
            monitor-enter(r5)
            fl8 r0 = r5.Y     // Catch:{ all -> 0x0074 }
            r0.getClass()     // Catch:{ all -> 0x0074 }
            fl8 r0 = r5.Y     // Catch:{ all -> 0x0074 }
            int r0 = r0.b     // Catch:{ all -> 0x0074 }
            monitor-enter(r5)     // Catch:{ all -> 0x0074 }
            jn r1 = r5.c     // Catch:{ all -> 0x0079 }
            int r1 = r1.t()     // Catch:{ all -> 0x0079 }
            jn r2 = r5.b     // Catch:{ all -> 0x0079 }
            int r2 = r2.t()     // Catch:{ all -> 0x0079 }
            int r1 = r1 - r2
            monitor-exit(r5)     // Catch:{ all -> 0x0074 }
            int r0 = r0 - r1
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ all -> 0x0074 }
            fl8 r1 = r5.Y     // Catch:{ all -> 0x0074 }
            int r2 = r1.c     // Catch:{ all -> 0x0074 }
            int r1 = r1.a     // Catch:{ all -> 0x0074 }
            monitor-enter(r5)     // Catch:{ all -> 0x0074 }
            jn r3 = r5.c     // Catch:{ all -> 0x0076 }
            int r3 = r3.v()     // Catch:{ all -> 0x0076 }
            jn r4 = r5.b     // Catch:{ all -> 0x0076 }
            int r4 = r4.v()     // Catch:{ all -> 0x0076 }
            int r3 = r3 - r4
            monitor-exit(r5)     // Catch:{ all -> 0x0074 }
            int r1 = r1 - r3
            int r1 = java.lang.Math.min(r2, r1)     // Catch:{ all -> 0x0074 }
            java.util.ArrayList r0 = r5.i(r0, r1)     // Catch:{ all -> 0x0074 }
            r5.b(r0)     // Catch:{ all -> 0x0074 }
            monitor-exit(r5)     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x005d
            java.util.Iterator r1 = r0.iterator()
        L_0x0049:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x005d
            java.lang.Object r2 = r1.next()
            ev3 r2 = (defpackage.ev3) r2
            e13 r2 = r5.h(r2)
            defpackage.e13.S(r2)
            goto L_0x0049
        L_0x005d:
            if (r0 == 0) goto L_0x0073
            java.util.Iterator r5 = r0.iterator()
        L_0x0063:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0073
            java.lang.Object r0 = r5.next()
            ev3 r0 = (defpackage.ev3) r0
            e(r0)
            goto L_0x0063
        L_0x0073:
            return
        L_0x0074:
            r0 = move-exception
            goto L_0x007c
        L_0x0076:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ all -> 0x0074 }
        L_0x0079:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0079 }
            throw r0     // Catch:{ all -> 0x0074 }
        L_0x007c:
            monitor-exit(r5)     // Catch:{ all -> 0x0074 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr7.c():void");
    }

    public final e13 d(Object obj, e13 e13) {
        return a(obj, e13, this.a);
    }

    public final synchronized void f() {
        if (this.Z + this.Y.e <= SystemClock.uptimeMillis()) {
            this.Z = SystemClock.uptimeMillis();
            fl8 fl8 = (fl8) this.X.get();
            ez3.n(fl8, "mMemoryCacheParamsSupplier returned null");
            this.Y = fl8;
        }
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized defpackage.t54 g(defpackage.ev3 r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x0026 }
            boolean r0 = r5.d     // Catch:{ all -> 0x0028 }
            r0 = r0 ^ 1
            defpackage.ez3.o(r0)     // Catch:{ all -> 0x0028 }
            int r0 = r5.c     // Catch:{ all -> 0x0028 }
            int r0 = r0 + 1
            r5.c = r0     // Catch:{ all -> 0x0028 }
            monitor-exit(r4)     // Catch:{ all -> 0x0026 }
            e13 r0 = r5.b     // Catch:{ all -> 0x0026 }
            java.lang.Object r0 = r0.e0()     // Catch:{ all -> 0x0026 }
            qe4 r1 = new qe4     // Catch:{ all -> 0x0026 }
            r2 = 23
            r3 = 0
            r1.<init>(r4, r5, r3, r2)     // Catch:{ all -> 0x0026 }
            kk9 r5 = defpackage.e13.Y     // Catch:{ all -> 0x0026 }
            t54 r5 = defpackage.e13.p0(r0, r1, r5)     // Catch:{ all -> 0x0026 }
            monitor-exit(r4)
            return r5
        L_0x0026:
            r5 = move-exception
            goto L_0x002b
        L_0x0028:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0028 }
            throw r5     // Catch:{ all -> 0x0026 }
        L_0x002b:
            monitor-exit(r4)     // Catch:{ all -> 0x0026 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr7.g(ev3):t54");
    }

    public final e13 get(Object obj) {
        ev3 ev3;
        Object obj2;
        t54 g;
        obj.getClass();
        synchronized (this) {
            try {
                ev3 = (ev3) this.b.M(obj);
                jn jnVar = this.c;
                synchronized (jnVar) {
                    obj2 = ((LinkedHashMap) jnVar.o).get(obj);
                }
                ev3 ev32 = (ev3) obj2;
                g = ev32 != null ? g(ev32) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        e(ev3);
        f();
        c();
        return g;
    }

    public final synchronized int getSizeInBytes() {
        return this.c.v();
    }

    public final synchronized e13 h(ev3 ev3) {
        ev3.getClass();
        return (!ev3.d || ev3.c != 0) ? null : ev3.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0059, code lost:
        if (r5.x0 == false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005b, code lost:
        r6 = r5.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0066, code lost:
        if (((java.util.LinkedHashMap) r6.o).isEmpty() == false) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0068, code lost:
        r6.b = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006f, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0095, code lost:
        throw new java.lang.IllegalStateException(java.lang.String.format("key is null, but exclusiveEntries count: %d, size: %d", new java.lang.Object[]{java.lang.Integer.valueOf(r5.b.t()), java.lang.Integer.valueOf(r5.b.v())}));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.ArrayList i(int r6, int r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            int r6 = java.lang.Math.max(r6, r0)     // Catch:{ all -> 0x001d }
            int r7 = java.lang.Math.max(r7, r0)     // Catch:{ all -> 0x001d }
            jn r1 = r5.b     // Catch:{ all -> 0x001d }
            int r1 = r1.t()     // Catch:{ all -> 0x001d }
            r2 = 0
            if (r1 > r6) goto L_0x0020
            jn r1 = r5.b     // Catch:{ all -> 0x001d }
            int r1 = r1.v()     // Catch:{ all -> 0x001d }
            if (r1 > r7) goto L_0x0020
            monitor-exit(r5)
            return r2
        L_0x001d:
            r6 = move-exception
            goto L_0x00ab
        L_0x0020:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x001d }
            r1.<init>()     // Catch:{ all -> 0x001d }
        L_0x0025:
            jn r3 = r5.b     // Catch:{ all -> 0x001d }
            int r3 = r3.t()     // Catch:{ all -> 0x001d }
            if (r3 > r6) goto L_0x0035
            jn r3 = r5.b     // Catch:{ all -> 0x001d }
            int r3 = r3.v()     // Catch:{ all -> 0x001d }
            if (r3 <= r7) goto L_0x006e
        L_0x0035:
            jn r3 = r5.b     // Catch:{ all -> 0x001d }
            monitor-enter(r3)     // Catch:{ all -> 0x001d }
            java.lang.Object r4 = r3.o     // Catch:{ all -> 0x00a8 }
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4     // Catch:{ all -> 0x00a8 }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x0044
            r4 = r2
            goto L_0x0054
        L_0x0044:
            java.lang.Object r4 = r3.o     // Catch:{ all -> 0x00a8 }
            java.util.LinkedHashMap r4 = (java.util.LinkedHashMap) r4     // Catch:{ all -> 0x00a8 }
            java.util.Set r4 = r4.keySet()     // Catch:{ all -> 0x00a8 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00a8 }
            java.lang.Object r4 = r4.next()     // Catch:{ all -> 0x00a8 }
        L_0x0054:
            monitor-exit(r3)     // Catch:{ all -> 0x001d }
            if (r4 != 0) goto L_0x0096
            boolean r6 = r5.x0     // Catch:{ all -> 0x001d }
            if (r6 == 0) goto L_0x0072
            jn r6 = r5.b     // Catch:{ all -> 0x001d }
            monitor-enter(r6)     // Catch:{ all -> 0x001d }
            java.lang.Object r7 = r6.o     // Catch:{ all -> 0x006b }
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7     // Catch:{ all -> 0x006b }
            boolean r7 = r7.isEmpty()     // Catch:{ all -> 0x006b }
            if (r7 == 0) goto L_0x006d
            r6.b = r0     // Catch:{ all -> 0x006b }
            goto L_0x006d
        L_0x006b:
            r7 = move-exception
            goto L_0x0070
        L_0x006d:
            monitor-exit(r6)     // Catch:{ all -> 0x001d }
        L_0x006e:
            monitor-exit(r5)
            return r1
        L_0x0070:
            monitor-exit(r6)     // Catch:{ all -> 0x006b }
            throw r7     // Catch:{ all -> 0x001d }
        L_0x0072:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x001d }
            java.lang.String r7 = "key is null, but exclusiveEntries count: %d, size: %d"
            jn r0 = r5.b     // Catch:{ all -> 0x001d }
            int r0 = r0.t()     // Catch:{ all -> 0x001d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x001d }
            jn r1 = r5.b     // Catch:{ all -> 0x001d }
            int r1 = r1.v()     // Catch:{ all -> 0x001d }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x001d }
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}     // Catch:{ all -> 0x001d }
            java.lang.String r7 = java.lang.String.format(r7, r0)     // Catch:{ all -> 0x001d }
            r6.<init>(r7)     // Catch:{ all -> 0x001d }
            throw r6     // Catch:{ all -> 0x001d }
        L_0x0096:
            jn r3 = r5.b     // Catch:{ all -> 0x001d }
            r3.M(r4)     // Catch:{ all -> 0x001d }
            jn r3 = r5.c     // Catch:{ all -> 0x001d }
            java.lang.Object r3 = r3.M(r4)     // Catch:{ all -> 0x001d }
            ev3 r3 = (defpackage.ev3) r3     // Catch:{ all -> 0x001d }
            r1.add(r3)     // Catch:{ all -> 0x001d }
            goto L_0x0025
        L_0x00a8:
            r6 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a8 }
            throw r6     // Catch:{ all -> 0x001d }
        L_0x00ab:
            monitor-exit(r5)     // Catch:{ all -> 0x001d }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr7.i(int, int):java.util.ArrayList");
    }

    public final int m(x1b x1b) {
        ArrayList N;
        ArrayList N2;
        synchronized (this) {
            N = this.b.N(x1b);
            N2 = this.c.N(x1b);
            b(N2);
        }
        Iterator it = N2.iterator();
        while (it.hasNext()) {
            e13.S(h((ev3) it.next()));
        }
        Iterator it2 = N.iterator();
        while (it2.hasNext()) {
            e((ev3) it2.next());
        }
        f();
        c();
        return N2.size();
    }
}
