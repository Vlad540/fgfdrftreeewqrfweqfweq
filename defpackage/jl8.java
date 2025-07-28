package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: jl8  reason: default package */
public final class jl8 implements Closeable {
    public final int a;
    public e13 b;

    public jl8(int i, e13 e13) {
        e13.getClass();
        if (i >= 0 && i <= ((hl8) e13.e0()).getSize()) {
            this.b = e13.m();
            this.a = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final synchronized void S(int i, int i2, int i3, byte[] bArr) {
        m();
        if (i + i3 <= this.a) {
            this.b.getClass();
            ((hl8) this.b.e0()).S(i, i2, i3, bArr);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized int U() {
        m();
        return this.a;
    }

    public final synchronized void close() {
        e13.S(this.b);
        this.b = null;
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
    public final synchronized void m() {
        /*
            r1 = this;
            monitor-enter(r1)
            monitor-enter(r1)     // Catch:{ all -> 0x0015 }
            e13 r0 = r1.b     // Catch:{ all -> 0x0017 }
            boolean r0 = defpackage.e13.n0(r0)     // Catch:{ all -> 0x0017 }
            r0 = r0 ^ 1
            monitor-exit(r1)     // Catch:{ all -> 0x0015 }
            if (r0 != 0) goto L_0x000f
            monitor-exit(r1)
            return
        L_0x000f:
            com.facebook.common.memory.PooledByteBuffer$ClosedException r0 = new com.facebook.common.memory.PooledByteBuffer$ClosedException     // Catch:{ all -> 0x0015 }
            r0.<init>()     // Catch:{ all -> 0x0015 }
            throw r0     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r0 = move-exception
            goto L_0x001a
        L_0x0017:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0017 }
            throw r0     // Catch:{ all -> 0x0015 }
        L_0x001a:
            monitor-exit(r1)     // Catch:{ all -> 0x0015 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl8.m():void");
    }

    public final synchronized long n() {
        m();
        this.b.getClass();
        return ((hl8) this.b.e0()).e0();
    }

    public final synchronized byte o(int i) {
        m();
        boolean z = false;
        ez3.j(Boolean.valueOf(i >= 0));
        if (i < this.a) {
            z = true;
        }
        ez3.j(Boolean.valueOf(z));
        this.b.getClass();
        return ((hl8) this.b.e0()).o(i);
    }

    public final synchronized ByteBuffer r() {
        this.b.getClass();
        return ((hl8) this.b.e0()).r();
    }
}
