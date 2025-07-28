package defpackage;

import android.os.Build;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: a6c  reason: default package */
public final class a6c implements AutoCloseable {
    public final u5g X;
    public final AtomicBoolean a;
    public final y5c b;
    public final long c;
    public final re5 o;

    public a6c(y5c y5c, long j, re5 re5, boolean z) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.a = atomicBoolean;
        u5g u5g = Build.VERSION.SDK_INT >= 30 ? new u5g(9, (Object) new x03()) : new u5g(9, (Object) new hk9(8));
        this.X = u5g;
        this.b = y5c;
        this.c = j;
        this.o = re5;
        if (z) {
            atomicBoolean.set(true);
        } else {
            ((y03) u5g.b).c("stop");
        }
    }

    public final void close() {
        o(0, (RuntimeException) null);
    }

    public final void finalize() {
        try {
            ((y03) this.X.b).a();
            o(10, new RuntimeException("Recording stopped due to being garbage collected."));
        } finally {
            super.finalize();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.a
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x006a
            y5c r0 = r5.b
            java.lang.String r1 = "Called pause() from invalid state: "
            java.lang.Object r2 = r0.h
            monitor-enter(r2)
            na0 r3 = r0.o     // Catch:{ all -> 0x0026 }
            boolean r3 = defpackage.y5c.p(r5, r3)     // Catch:{ all -> 0x0026 }
            if (r3 != 0) goto L_0x0028
            na0 r3 = r0.n     // Catch:{ all -> 0x0026 }
            boolean r3 = defpackage.y5c.p(r5, r3)     // Catch:{ all -> 0x0026 }
            if (r3 != 0) goto L_0x0028
            re5 r5 = r5.o     // Catch:{ all -> 0x0026 }
            java.util.Objects.toString(r5)     // Catch:{ all -> 0x0026 }
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            goto L_0x0053
        L_0x0026:
            r5 = move-exception
            goto L_0x0068
        L_0x0028:
            x5c r5 = r0.k     // Catch:{ all -> 0x0026 }
            int r5 = r5.ordinal()     // Catch:{ all -> 0x0026 }
            if (r5 == 0) goto L_0x0054
            r3 = 1
            if (r5 == r3) goto L_0x004d
            r3 = 3
            if (r5 == r3) goto L_0x0054
            r1 = 4
            if (r5 == r1) goto L_0x003a
            goto L_0x0052
        L_0x003a:
            x5c r5 = defpackage.x5c.Y     // Catch:{ all -> 0x0026 }
            r0.B(r5)     // Catch:{ all -> 0x0026 }
            na0 r5 = r0.n     // Catch:{ all -> 0x0026 }
            ryc r1 = r0.e     // Catch:{ all -> 0x0026 }
            p5c r3 = new p5c     // Catch:{ all -> 0x0026 }
            r4 = 0
            r3.<init>(r0, r5, r4)     // Catch:{ all -> 0x0026 }
            r1.execute(r3)     // Catch:{ all -> 0x0026 }
            goto L_0x0052
        L_0x004d:
            x5c r5 = defpackage.x5c.c     // Catch:{ all -> 0x0026 }
            r0.B(r5)     // Catch:{ all -> 0x0026 }
        L_0x0052:
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
        L_0x0053:
            return
        L_0x0054:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0026 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0026 }
            r3.<init>(r1)     // Catch:{ all -> 0x0026 }
            x5c r0 = r0.k     // Catch:{ all -> 0x0026 }
            r3.append(r0)     // Catch:{ all -> 0x0026 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0026 }
            r5.<init>(r0)     // Catch:{ all -> 0x0026 }
            throw r5     // Catch:{ all -> 0x0026 }
        L_0x0068:
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            throw r5
        L_0x006a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "The recording has been stopped."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a6c.m():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r5 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.a
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x006a
            y5c r0 = r5.b
            java.lang.String r1 = "Called resume() from invalid state: "
            java.lang.Object r2 = r0.h
            monitor-enter(r2)
            na0 r3 = r0.o     // Catch:{ all -> 0x0026 }
            boolean r3 = defpackage.y5c.p(r5, r3)     // Catch:{ all -> 0x0026 }
            if (r3 != 0) goto L_0x0028
            na0 r3 = r0.n     // Catch:{ all -> 0x0026 }
            boolean r3 = defpackage.y5c.p(r5, r3)     // Catch:{ all -> 0x0026 }
            if (r3 != 0) goto L_0x0028
            re5 r5 = r5.o     // Catch:{ all -> 0x0026 }
            java.util.Objects.toString(r5)     // Catch:{ all -> 0x0026 }
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            goto L_0x0053
        L_0x0026:
            r5 = move-exception
            goto L_0x0068
        L_0x0028:
            x5c r5 = r0.k     // Catch:{ all -> 0x0026 }
            int r5 = r5.ordinal()     // Catch:{ all -> 0x0026 }
            if (r5 == 0) goto L_0x0054
            r3 = 5
            if (r5 == r3) goto L_0x0040
            r3 = 2
            if (r5 == r3) goto L_0x003a
            r3 = 3
            if (r5 == r3) goto L_0x0054
            goto L_0x0052
        L_0x003a:
            x5c r5 = defpackage.x5c.b     // Catch:{ all -> 0x0026 }
            r0.B(r5)     // Catch:{ all -> 0x0026 }
            goto L_0x0052
        L_0x0040:
            x5c r5 = defpackage.x5c.X     // Catch:{ all -> 0x0026 }
            r0.B(r5)     // Catch:{ all -> 0x0026 }
            na0 r5 = r0.n     // Catch:{ all -> 0x0026 }
            ryc r1 = r0.e     // Catch:{ all -> 0x0026 }
            p5c r3 = new p5c     // Catch:{ all -> 0x0026 }
            r4 = 1
            r3.<init>(r0, r5, r4)     // Catch:{ all -> 0x0026 }
            r1.execute(r3)     // Catch:{ all -> 0x0026 }
        L_0x0052:
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
        L_0x0053:
            return
        L_0x0054:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0026 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0026 }
            r3.<init>(r1)     // Catch:{ all -> 0x0026 }
            x5c r0 = r0.k     // Catch:{ all -> 0x0026 }
            r3.append(r0)     // Catch:{ all -> 0x0026 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0026 }
            r5.<init>(r0)     // Catch:{ all -> 0x0026 }
            throw r5     // Catch:{ all -> 0x0026 }
        L_0x0068:
            monitor-exit(r2)     // Catch:{ all -> 0x0026 }
            throw r5
        L_0x006a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "The recording has been stopped."
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a6c.n():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        if (r9 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007a, code lost:
        r0.j(r9, 8, new java.lang.RuntimeException("Recording was stopped before any data could be produced.", r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(int r12, java.lang.RuntimeException r13) {
        /*
            r11 = this;
            u5g r0 = r11.X
            java.lang.Object r0 = r0.b
            y03 r0 = (defpackage.y03) r0
            r0.close()
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.a
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            if (r0 == 0) goto L_0x0013
            return
        L_0x0013:
            y5c r0 = r11.b
            java.lang.Object r8 = r0.h
            monitor-enter(r8)
            na0 r1 = r0.o     // Catch:{ all -> 0x002f }
            boolean r1 = defpackage.y5c.p(r11, r1)     // Catch:{ all -> 0x002f }
            if (r1 != 0) goto L_0x0031
            na0 r1 = r0.n     // Catch:{ all -> 0x002f }
            boolean r1 = defpackage.y5c.p(r11, r1)     // Catch:{ all -> 0x002f }
            if (r1 != 0) goto L_0x0031
            re5 r11 = r11.o     // Catch:{ all -> 0x002f }
            java.util.Objects.toString(r11)     // Catch:{ all -> 0x002f }
            monitor-exit(r8)     // Catch:{ all -> 0x002f }
            goto L_0x0086
        L_0x002f:
            r11 = move-exception
            goto L_0x008f
        L_0x0031:
            x5c r1 = r0.k     // Catch:{ all -> 0x002f }
            int r1 = r1.ordinal()     // Catch:{ all -> 0x002f }
            r9 = 0
            switch(r1) {
                case 0: goto L_0x0087;
                case 1: goto L_0x0066;
                case 2: goto L_0x0066;
                case 3: goto L_0x0087;
                case 4: goto L_0x0046;
                case 5: goto L_0x0046;
                case 6: goto L_0x003c;
                case 7: goto L_0x003c;
                default: goto L_0x003b;
            }     // Catch:{ all -> 0x002f }
        L_0x003b:
            goto L_0x0077
        L_0x003c:
            na0 r12 = r0.n     // Catch:{ all -> 0x002f }
            boolean r11 = defpackage.y5c.p(r11, r12)     // Catch:{ all -> 0x002f }
            defpackage.e07.p(r9, r11)     // Catch:{ all -> 0x002f }
            goto L_0x0077
        L_0x0046:
            x5c r11 = defpackage.x5c.Z     // Catch:{ all -> 0x002f }
            r0.B(r11)     // Catch:{ all -> 0x002f }
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x002f }
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x002f }
            long r4 = r11.toMicros(r1)     // Catch:{ all -> 0x002f }
            na0 r3 = r0.n     // Catch:{ all -> 0x002f }
            ryc r11 = r0.e     // Catch:{ all -> 0x002f }
            q5c r10 = new q5c     // Catch:{ all -> 0x002f }
            r1 = r10
            r2 = r0
            r6 = r12
            r7 = r13
            r1.<init>(r2, r3, r4, r6, r7)     // Catch:{ all -> 0x002f }
            r11.execute(r10)     // Catch:{ all -> 0x002f }
            goto L_0x0077
        L_0x0066:
            na0 r12 = r0.o     // Catch:{ all -> 0x002f }
            boolean r11 = defpackage.y5c.p(r11, r12)     // Catch:{ all -> 0x002f }
            defpackage.e07.p(r9, r11)     // Catch:{ all -> 0x002f }
            na0 r11 = r0.o     // Catch:{ all -> 0x002f }
            r0.o = r9     // Catch:{ all -> 0x002f }
            r0.y()     // Catch:{ all -> 0x002f }
            r9 = r11
        L_0x0077:
            monitor-exit(r8)     // Catch:{ all -> 0x002f }
            if (r9 == 0) goto L_0x0086
            java.lang.RuntimeException r11 = new java.lang.RuntimeException
            java.lang.String r12 = "Recording was stopped before any data could be produced."
            r11.<init>(r12, r13)
            r12 = 8
            r0.j(r9, r12, r11)
        L_0x0086:
            return
        L_0x0087:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ all -> 0x002f }
            java.lang.String r12 = "Calling stop() while idling or initializing is invalid."
            r11.<init>(r12)     // Catch:{ all -> 0x002f }
            throw r11     // Catch:{ all -> 0x002f }
        L_0x008f:
            monitor-exit(r8)     // Catch:{ all -> 0x002f }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a6c.o(int, java.lang.RuntimeException):void");
    }
}
