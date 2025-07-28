package defpackage;

import java.nio.channels.AsynchronousFileChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: tf5  reason: default package */
public final class tf5 extends l5e implements i26 {
    public final /* synthetic */ AtomicReference A0;
    public final /* synthetic */ d5b B0;
    public Object X;
    public long Y;
    public int Z;
    public final /* synthetic */ ag5 w0;
    public final /* synthetic */ fle x0;
    public final /* synthetic */ AsynchronousFileChannel y0;
    public final /* synthetic */ AtomicBoolean z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tf5(ag5 ag5, fle fle, AsynchronousFileChannel asynchronousFileChannel, AtomicBoolean atomicBoolean, AtomicReference atomicReference, d5b d5b, Continuation continuation) {
        super(2, continuation);
        this.w0 = ag5;
        this.x0 = fle;
        this.y0 = asynchronousFileChannel;
        this.z0 = atomicBoolean;
        this.A0 = atomicReference;
        this.B0 = d5b;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new tf5(this.w0, this.x0, this.y0, this.z0, this.A0, this.B0, continuation);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b7 A[Catch:{ all -> 0x003a, all -> 0x0158 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b8 A[Catch:{ all -> 0x003a, all -> 0x0158 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0123 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object o(java.lang.Object r17) {
        /*
            r16 = this;
            r7 = r16
            pu3 r8 = pu3.a
            int r0 = r7.Z
            r9 = 0
            r10 = 0
            r11 = 5
            r12 = 4
            r13 = 3
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0043
            if (r0 == r2) goto L_0x003d
            if (r0 == r1) goto L_0x002f
            if (r0 == r13) goto L_0x002a
            if (r0 == r12) goto L_0x002a
            if (r0 == r11) goto L_0x0021
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0021:
            java.lang.Object r0 = r7.X
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            wx3.H(r17)
            goto L_0x0170
        L_0x002a:
            wx3.H(r17)
            goto L_0x0155
        L_0x002f:
            long r0 = r7.Y
            java.lang.Object r2 = r7.X
            xve r2 = (defpackage.xve) r2
            wx3.H(r17)     // Catch:{ all -> 0x003a }
            goto L_0x00aa
        L_0x003a:
            r0 = move-exception
            goto L_0x0124
        L_0x003d:
            wx3.H(r17)     // Catch:{ all -> 0x003a }
            r0 = r17
            goto L_0x0053
        L_0x0043:
            wx3.H(r17)
            ag5 r0 = r7.w0     // Catch:{ all -> 0x003a }
            oxe r0 = r0.t     // Catch:{ all -> 0x003a }
            r7.Z = r2     // Catch:{ all -> 0x003a }
            java.lang.Object r0 = r0.a(r7)     // Catch:{ all -> 0x003a }
            if (r0 != r8) goto L_0x0053
            return r8
        L_0x0053:
            xve r0 = (defpackage.xve) r0     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x00f2
            ag5 r2 = r7.w0     // Catch:{ all -> 0x003a }
            java.lang.String r3 = r2.d     // Catch:{ all -> 0x003a }
            fn6 r4 = udd.e     // Catch:{ all -> 0x003a }
            if (r4 != 0) goto L_0x0060
            goto L_0x0085
        L_0x0060:
            boolean r5 = r4.c()     // Catch:{ all -> 0x003a }
            if (r5 == 0) goto L_0x0085
            tn7 r5 = defpackage.tn7.X     // Catch:{ all -> 0x003a }
            zpe r2 = r2.c     // Catch:{ all -> 0x003a }
            wd3 r2 = r2.c()     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r6.<init>()     // Catch:{ all -> 0x003a }
            r6.append(r0)     // Catch:{ all -> 0x003a }
            java.lang.String r14 = " acquired on network="
            r6.append(r14)     // Catch:{ all -> 0x003a }
            r6.append(r2)     // Catch:{ all -> 0x003a }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x003a }
            r4.d(r5, r3, r2, r9)     // Catch:{ all -> 0x003a }
        L_0x0085:
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003a }
            ag5 r2 = r7.w0     // Catch:{ all -> 0x003a }
            fle r3 = r7.x0     // Catch:{ all -> 0x003a }
            java.nio.channels.AsynchronousFileChannel r4 = r7.y0     // Catch:{ all -> 0x003a }
            sf5 r5 = new sf5     // Catch:{ all -> 0x003a }
            d5b r6 = r7.B0     // Catch:{ all -> 0x003a }
            r5.<init>(r6, r2, r9)     // Catch:{ all -> 0x003a }
            r7.X = r0     // Catch:{ all -> 0x003a }
            r7.Y = r14     // Catch:{ all -> 0x003a }
            r7.Z = r1     // Catch:{ all -> 0x003a }
            r1 = r2
            r2 = r3
            r3 = r0
            r6 = r16
            java.lang.Object r1 = defpackage.ag5.a(r1, r2, r3, r4, r5, r6)     // Catch:{ all -> 0x003a }
            if (r1 != r8) goto L_0x00a8
            return r8
        L_0x00a8:
            r2 = r0
            r0 = r14
        L_0x00aa:
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x003a }
            long r3 = r3 - r0
            ag5 r0 = r7.w0     // Catch:{ all -> 0x003a }
            java.lang.String r1 = r0.d     // Catch:{ all -> 0x003a }
            fn6 r5 = udd.e     // Catch:{ all -> 0x003a }
            if (r5 != 0) goto L_0x00b8
            goto L_0x010d
        L_0x00b8:
            boolean r6 = r5.c()     // Catch:{ all -> 0x003a }
            if (r6 == 0) goto L_0x010d
            tn7 r6 = defpackage.tn7.X     // Catch:{ all -> 0x003a }
            int r14 = zp4.o     // Catch:{ all -> 0x003a }
            eq4 r14 = eq4.c     // Catch:{ all -> 0x003a }
            long r3 = mt0.Q(r3, r14)     // Catch:{ all -> 0x003a }
            java.lang.String r3 = zp4.j(r3)     // Catch:{ all -> 0x003a }
            zpe r0 = r0.c     // Catch:{ all -> 0x003a }
            wd3 r0 = r0.c()     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r4.<init>()     // Catch:{ all -> 0x003a }
            r4.append(r2)     // Catch:{ all -> 0x003a }
            java.lang.String r2 = " was uploaded for "
            r4.append(r2)     // Catch:{ all -> 0x003a }
            r4.append(r3)     // Catch:{ all -> 0x003a }
            java.lang.String r2 = " on network="
            r4.append(r2)     // Catch:{ all -> 0x003a }
            r4.append(r0)     // Catch:{ all -> 0x003a }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x003a }
            r5.d(r6, r1, r0, r9)     // Catch:{ all -> 0x003a }
            goto L_0x010d
        L_0x00f2:
            ag5 r0 = r7.w0     // Catch:{ all -> 0x003a }
            java.lang.String r0 = r0.d     // Catch:{ all -> 0x003a }
            fn6 r1 = udd.e     // Catch:{ all -> 0x003a }
            if (r1 != 0) goto L_0x00fb
            goto L_0x0108
        L_0x00fb:
            boolean r2 = r1.c()     // Catch:{ all -> 0x003a }
            if (r2 == 0) goto L_0x0108
            tn7 r2 = defpackage.tn7.X     // Catch:{ all -> 0x003a }
            java.lang.String r3 = "execute: no chunks remained, stopped launcher"
            r1.d(r2, r0, r3, r9)     // Catch:{ all -> 0x003a }
        L_0x0108:
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.z0     // Catch:{ all -> 0x003a }
            r0.set(r10)     // Catch:{ all -> 0x003a }
        L_0x010d:
            ag5 r0 = r7.w0
            t97 r0 = r0.f
            java.lang.Object r0 = r0.getValue()
            ile r0 = (defpackage.ile) r0
            fle r1 = r7.x0
            r7.X = r9
            r7.Z = r13
            java.lang.Object r0 = r0.b(r1, r7)
            if (r0 != r8) goto L_0x0155
            return r8
        L_0x0124:
            ag5 r1 = r7.w0     // Catch:{ all -> 0x0158 }
            java.lang.String r1 = r1.d     // Catch:{ all -> 0x0158 }
            java.lang.String r2 = "During uploading chunk got exception"
            udd.s(r1, r2, r0)     // Catch:{ all -> 0x0158 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.z0     // Catch:{ all -> 0x0158 }
            r1.set(r10)     // Catch:{ all -> 0x0158 }
            java.util.concurrent.atomic.AtomicReference r1 = r7.A0     // Catch:{ all -> 0x0158 }
            r1.getAndSet(r0)     // Catch:{ all -> 0x0158 }
            ag5 r1 = r7.w0     // Catch:{ all -> 0x0158 }
            zpe r1 = r1.c     // Catch:{ all -> 0x0158 }
            r1.e(r0)     // Catch:{ all -> 0x0158 }
            ag5 r0 = r7.w0
            t97 r0 = r0.f
            java.lang.Object r0 = r0.getValue()
            ile r0 = (defpackage.ile) r0
            fle r1 = r7.x0
            r7.X = r9
            r7.Z = r12
            java.lang.Object r0 = r0.b(r1, r7)
            if (r0 != r8) goto L_0x0155
            return r8
        L_0x0155:
            jue r0 = jue.a
            return r0
        L_0x0158:
            r0 = move-exception
            ag5 r1 = r7.w0
            t97 r1 = r1.f
            java.lang.Object r1 = r1.getValue()
            ile r1 = (defpackage.ile) r1
            fle r2 = r7.x0
            r7.X = r0
            r7.Z = r11
            java.lang.Object r1 = r1.b(r2, r7)
            if (r1 != r8) goto L_0x0170
            return r8
        L_0x0170:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tf5.o(java.lang.Object):java.lang.Object");
    }
}
