package defpackage;

import android.graphics.Bitmap;
import java.io.Closeable;
import java.util.Iterator;

/* renamed from: e13  reason: default package */
public abstract class e13 implements Cloneable, Closeable {
    public static final jk9 X = new Object();
    public static final kk9 Y = new Object();
    public boolean a = false;
    public final rcd b;
    public final d13 c;
    public final Throwable o;

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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public e13(defpackage.rcd r4, defpackage.d13 r5, java.lang.Throwable r6) {
        /*
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            r4.getClass()
            r3.b = r4
            monitor-enter(r4)
            monitor-enter(r4)     // Catch:{ all -> 0x001f }
            int r1 = r4.b     // Catch:{ all -> 0x0027 }
            r2 = 1
            if (r1 <= 0) goto L_0x0013
            r0 = r2
        L_0x0013:
            monitor-exit(r4)     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0021
            int r1 = r1 + r2
            r4.b = r1     // Catch:{ all -> 0x001f }
            monitor-exit(r4)
            r3.c = r5
            r3.o = r6
            return
        L_0x001f:
            r3 = move-exception
            goto L_0x002a
        L_0x0021:
            com.facebook.common.references.SharedReference$NullReferenceException r3 = new com.facebook.common.references.SharedReference$NullReferenceException     // Catch:{ all -> 0x001f }
            r3.<init>()     // Catch:{ all -> 0x001f }
            throw r3     // Catch:{ all -> 0x001f }
        L_0x0027:
            r3 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0027 }
            throw r3     // Catch:{ all -> 0x001f }
        L_0x002a:
            monitor-exit(r4)     // Catch:{ all -> 0x001f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e13.<init>(rcd, d13, java.lang.Throwable):void");
    }

    public static void S(e13 e13) {
        if (e13 != null) {
            e13.close();
        }
    }

    public static void U(Iterable iterable) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                S((e13) it.next());
            }
        }
    }

    public static boolean n0(e13 e13) {
        return e13 != null && e13.m0();
    }

    public static e13 o(e13 e13) {
        if (e13 != null) {
            return e13.n();
        }
        return null;
    }

    public static t54 o0(Closeable closeable) {
        return p0(closeable, X, Y);
    }

    public static t54 p0(Object obj, nbc nbc, d13 d13) {
        if (obj == null) {
            return null;
        }
        d13.j();
        if (!(obj instanceof Bitmap)) {
            boolean z = obj instanceof b13;
        }
        return new e13(obj, nbc, d13, (Throwable) null, true);
    }

    public void close() {
        synchronized (this) {
            try {
                if (!this.a) {
                    this.a = true;
                    this.b.a();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public final synchronized Object e0() {
        Object b2;
        ez3.o(!this.a);
        b2 = this.b.b();
        b2.getClass();
        return b2;
    }

    public abstract e13 m();

    public synchronized boolean m0() {
        return !this.a;
    }

    public synchronized e13 n() {
        if (!m0()) {
            return null;
        }
        return m();
    }

    public e13(Object obj, nbc nbc, d13 d13, Throwable th, boolean z) {
        this.b = new rcd(obj, nbc, z);
        this.c = d13;
        this.o = th;
    }
}
