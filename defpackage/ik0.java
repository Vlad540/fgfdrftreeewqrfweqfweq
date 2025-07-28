package defpackage;

/* renamed from: ik0  reason: default package */
public final class ik0 implements xi4, er {
    public jn X;
    public boolean Y;
    public volatile boolean Z;
    public final bw9 a;
    public final jk0 b;
    public boolean c;
    public boolean o;
    public long w0;

    public ik0(bw9 bw9, jk0 jk0) {
        this.a = bw9;
        this.b = jk0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0034, code lost:
        r2.Y = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(long r3, java.lang.Object r5) {
        /*
            r2 = this;
            boolean r0 = r2.Z
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            boolean r0 = r2.Y
            if (r0 != 0) goto L_0x0039
            monitor-enter(r2)
            boolean r0 = r2.Z     // Catch:{ all -> 0x0010 }
            if (r0 == 0) goto L_0x0012
            monitor-exit(r2)     // Catch:{ all -> 0x0010 }
            return
        L_0x0010:
            r3 = move-exception
            goto L_0x0037
        L_0x0012:
            long r0 = r2.w0     // Catch:{ all -> 0x0010 }
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x001a
            monitor-exit(r2)     // Catch:{ all -> 0x0010 }
            return
        L_0x001a:
            boolean r3 = r2.o     // Catch:{ all -> 0x0010 }
            if (r3 == 0) goto L_0x0030
            jn r3 = r2.X     // Catch:{ all -> 0x0010 }
            if (r3 != 0) goto L_0x002b
            jn r3 = new jn     // Catch:{ all -> 0x0010 }
            r4 = 1
            r0 = 0
            r3.<init>((int) r4, (byte) r0)     // Catch:{ all -> 0x0010 }
            r2.X = r3     // Catch:{ all -> 0x0010 }
        L_0x002b:
            r3.d(r5)     // Catch:{ all -> 0x0010 }
            monitor-exit(r2)     // Catch:{ all -> 0x0010 }
            return
        L_0x0030:
            r3 = 1
            r2.c = r3     // Catch:{ all -> 0x0010 }
            monitor-exit(r2)     // Catch:{ all -> 0x0010 }
            r2.Y = r3
            goto L_0x0039
        L_0x0037:
            monitor-exit(r2)     // Catch:{ all -> 0x0010 }
            throw r3
        L_0x0039:
            r2.test(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik0.a(long, java.lang.Object):void");
    }

    public final void f() {
        if (!this.Z) {
            this.Z = true;
            this.b.B(this);
        }
    }

    public final boolean h() {
        return this.Z;
    }

    public final boolean test(Object obj) {
        return this.Z || ap9.a(this.a, obj);
    }
}
