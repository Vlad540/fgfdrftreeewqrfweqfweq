package defpackage;

import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: ahd  reason: default package */
public abstract class ahd implements i1e, j24 {
    public boolean A0;
    public final m24[] X = new n1e[2];
    public final p1e[] Y;
    public int Z = 2;
    public final sda a;
    public final Object b = new Object();
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque o = new ArrayDeque();
    public int w0;
    public m24 x0;
    public SubtitleDecoderException y0;
    public boolean z0;

    public ahd() {
        boolean z;
        p1e[] p1eArr = new p1e[2];
        int i = 0;
        while (true) {
            z = true;
            if (i >= this.Z) {
                break;
            }
            this.X[i] = new m24(1);
            i++;
        }
        this.Y = p1eArr;
        this.w0 = 2;
        for (int i2 = 0; i2 < this.w0; i2++) {
            this.Y[i2] = new cy1(this, 2);
        }
        sda sda = new sda(1, this);
        this.a = sda;
        sda.start();
        int i3 = this.Z;
        m24[] m24Arr = this.X;
        swb.h(i3 != m24Arr.length ? false : z);
        for (m24 x : m24Arr) {
            x.x(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        }
    }

    public final void a(long j) {
    }

    public abstract g1e b(int i, byte[] bArr, boolean z);

    public final p1e c() {
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.y0;
                if (subtitleDecoderException != null) {
                    throw subtitleDecoderException;
                } else if (this.o.isEmpty()) {
                    return null;
                } else {
                    p1e p1e = (p1e) this.o.removeFirst();
                    return p1e;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final SubtitleDecoderException d(m24 m24, p1e p1e, boolean z) {
        n1e n1e = (n1e) m24;
        try {
            ByteBuffer byteBuffer = n1e.o;
            byteBuffer.getClass();
            p1e.w(n1e.Y, b(byteBuffer.limit(), byteBuffer.array(), z), n1e.y0);
            p1e.b &= Integer.MAX_VALUE;
            return null;
        } catch (SubtitleDecoderException e) {
            return e;
        }
    }

    public final Object e() {
        m24 m24;
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.y0;
                if (subtitleDecoderException == null) {
                    swb.h(this.x0 == null);
                    int i = this.Z;
                    if (i == 0) {
                        m24 = null;
                    } else {
                        m24[] m24Arr = this.X;
                        int i2 = i - 1;
                        this.Z = i2;
                        m24 = m24Arr[i2];
                    }
                    this.x0 = m24;
                } else {
                    throw subtitleDecoderException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m24;
    }

    /* JADX WARNING: type inference failed for: r5v4, types: [java.lang.Exception] */
    /* JADX WARNING: type inference failed for: r5v6, types: [java.lang.Exception] */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processExcHandler(RegionMaker.java:1043)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:975)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006f  */
    public final boolean f() {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r8.A0     // Catch:{ all -> 0x0020 }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0023
            java.util.ArrayDeque r1 = r8.c     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x0017
            int r1 = r8.w0     // Catch:{ all -> 0x0020 }
            if (r1 <= 0) goto L_0x0017
            r1 = r3
            goto L_0x0018
        L_0x0017:
            r1 = r2
        L_0x0018:
            if (r1 != 0) goto L_0x0023
            java.lang.Object r1 = r8.b     // Catch:{ all -> 0x0020 }
            r1.wait()     // Catch:{ all -> 0x0020 }
            goto L_0x0003
        L_0x0020:
            r8 = move-exception
            goto L_0x00a6
        L_0x0023:
            boolean r1 = r8.A0     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x0029
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return r2
        L_0x0029:
            java.util.ArrayDeque r1 = r8.c     // Catch:{ all -> 0x0020 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x0020 }
            m24 r1 = (defpackage.m24) r1     // Catch:{ all -> 0x0020 }
            p1e[] r4 = r8.Y     // Catch:{ all -> 0x0020 }
            int r5 = r8.w0     // Catch:{ all -> 0x0020 }
            int r5 = r5 - r3
            r8.w0 = r5     // Catch:{ all -> 0x0020 }
            r4 = r4[r5]     // Catch:{ all -> 0x0020 }
            boolean r5 = r8.z0     // Catch:{ all -> 0x0020 }
            r8.z0 = r2     // Catch:{ all -> 0x0020 }
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            r0 = 4
            boolean r6 = r1.f(r0)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r6 == 0) goto L_0x004c
            r4.a(r0)
            goto L_0x0079
        L_0x004c:
            boolean r0 = r1.f(r7)
            if (r0 == 0) goto L_0x0055
            r4.a(r7)
        L_0x0055:
            com.google.android.exoplayer2.text.SubtitleDecoderException r0 = r8.d(r1, r4, r5)     // Catch:{ RuntimeException -> 0x0064, OutOfMemoryError -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r0 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r5 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
        L_0x0062:
            r0 = r5
            goto L_0x006d
        L_0x0064:
            r0 = move-exception
            com.google.android.exoplayer2.text.SubtitleDecoderException r5 = new com.google.android.exoplayer2.text.SubtitleDecoderException
            java.lang.String r6 = "Unexpected decode error"
            r5.<init>(r6, r0)
            goto L_0x0062
        L_0x006d:
            if (r0 == 0) goto L_0x0079
            java.lang.Object r5 = r8.b
            monitor-enter(r5)
            r8.y0 = r0     // Catch:{ all -> 0x0076 }
            monitor-exit(r5)     // Catch:{ all -> 0x0076 }
            return r2
        L_0x0076:
            r8 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0076 }
            throw r8
        L_0x0079:
            java.lang.Object r2 = r8.b
            monitor-enter(r2)
            boolean r0 = r8.z0     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0086
            r4.v()     // Catch:{ all -> 0x0084 }
            goto L_0x0095
        L_0x0084:
            r8 = move-exception
            goto L_0x00a4
        L_0x0086:
            boolean r0 = r4.f(r7)     // Catch:{ all -> 0x0084 }
            if (r0 == 0) goto L_0x0090
            r4.v()     // Catch:{ all -> 0x0084 }
            goto L_0x0095
        L_0x0090:
            java.util.ArrayDeque r0 = r8.o     // Catch:{ all -> 0x0084 }
            r0.addLast(r4)     // Catch:{ all -> 0x0084 }
        L_0x0095:
            r1.v()     // Catch:{ all -> 0x0084 }
            int r0 = r8.Z     // Catch:{ all -> 0x0084 }
            int r4 = r0 + 1
            r8.Z = r4     // Catch:{ all -> 0x0084 }
            m24[] r8 = r8.X     // Catch:{ all -> 0x0084 }
            r8[r0] = r1     // Catch:{ all -> 0x0084 }
            monitor-exit(r2)     // Catch:{ all -> 0x0084 }
            return r3
        L_0x00a4:
            monitor-exit(r2)     // Catch:{ all -> 0x0084 }
            throw r8
        L_0x00a6:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahd.f():boolean");
    }

    public final void flush() {
        synchronized (this.b) {
            try {
                this.z0 = true;
                m24 m24 = this.x0;
                if (m24 != null) {
                    m24.v();
                    int i = this.Z;
                    this.Z = i + 1;
                    this.X[i] = m24;
                    this.x0 = null;
                }
                while (!this.c.isEmpty()) {
                    m24 m242 = (m24) this.c.removeFirst();
                    m242.v();
                    int i2 = this.Z;
                    this.Z = i2 + 1;
                    this.X[i2] = m242;
                }
                while (!this.o.isEmpty()) {
                    ((p1e) this.o.removeFirst()).v();
                }
            } finally {
            }
        }
    }

    public final void l(n1e n1e) {
        synchronized (this.b) {
            try {
                SubtitleDecoderException subtitleDecoderException = this.y0;
                if (subtitleDecoderException == null) {
                    swb.e(n1e == this.x0);
                    this.c.addLast(n1e);
                    if (!this.c.isEmpty() && this.w0 > 0) {
                        this.b.notify();
                    }
                    this.x0 = null;
                } else {
                    throw subtitleDecoderException;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void release() {
        synchronized (this.b) {
            this.A0 = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
