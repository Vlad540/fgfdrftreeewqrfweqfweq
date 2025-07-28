package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: m14  reason: default package */
public final class m14 {
    public static final /* synthetic */ k77[] j;
    public static final String k;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final e3 e = hwf.t();
    public final ContextScope f;
    public d14 g;
    public long h;
    public final AtomicInteger i;

    static {
        Class<m14> cls = m14.class;
        k77 hc9 = new hc9(cls, "notifyJob", "getNotifyJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        j = new k77[]{hc9};
        k = cls.getName();
    }

    public m14(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
        this.f = n1g.a(((pae) t975.getValue()).a().limitedParallelism(1, "notifs"));
        this.g = d14.f;
        this.i = new AtomicInteger(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(defpackage.m14 r21, defpackage.d14 r22, kotlin.coroutines.Continuation r23) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            boolean r3 = r2 instanceof defpackage.i14
            if (r3 == 0) goto L_0x0019
            r3 = r2
            i14 r3 = (defpackage.i14) r3
            int r4 = r3.Z
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.Z = r4
            goto L_0x001e
        L_0x0019:
            i14 r3 = new i14
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r2 = r3.X
            pu3 r4 = pu3.a
            int r5 = r3.Z
            jue r6 = jue.a
            k77[] r7 = j
            r8 = 0
            r9 = 0
            r10 = 1
            if (r5 == 0) goto L_0x003e
            if (r5 != r10) goto L_0x0036
            m14 r0 = r3.o
            wx3.H(r2)
            goto L_0x00c4
        L_0x0036:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003e:
            wx3.H(r2)
            t97 r2 = r0.c
            java.lang.Object r2 = r2.getValue()
            rf4 r2 = (defpackage.rf4) r2
            r2.getClass()
            long r11 = android.os.SystemClock.elapsedRealtime()
            long r13 = r0.h
            long r11 = r11 - r13
            r13 = 2000(0x7d0, double:9.88E-321)
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b9
            boolean r2 = r1.b
            if (r2 == 0) goto L_0x005e
            goto L_0x00b9
        L_0x005e:
            java.lang.Object[] r2 = new java.lang.Object[]{r22}
            java.lang.String r3 = k
            java.lang.String r4 = "notifyOrDelay: delay, params = %s"
            udd.p(r3, r4, r2)
            d14 r2 = r0.g
            d14 r3 = new d14
            zb9 r4 = r2.e
            zb9 r5 = r1.e
            r4.b(r5)
            boolean r5 = r2.c
            if (r5 == 0) goto L_0x007f
            boolean r5 = r1.c
            if (r5 == 0) goto L_0x007f
            r19 = r10
            goto L_0x0081
        L_0x007f:
            r19 = r8
        L_0x0081:
            cb5 r1 = r1.d
            if (r1 != 0) goto L_0x0087
            cb5 r1 = r2.d
        L_0x0087:
            r20 = r1
            boolean r1 = r2.a
            boolean r2 = r2.b
            r15 = r3
            r16 = r1
            r17 = r2
            r18 = r4
            r15.<init>(r16, r17, r18, r19, r20)
            r0.g = r3
            r1 = r7[r8]
            e3 r2 = r0.e
            java.lang.Object r1 = r2.T0(r0, r1)
            g37 r1 = (g37) r1
            if (r1 != 0) goto L_0x00b7
            long r13 = r13 - r11
            j14 r1 = new j14
            r1.<init>(r13, r0, r9)
            r3 = 3
            kotlinx.coroutines.internal.ContextScope r4 = r0.f
            qod r1 = xs7.E(r4, r9, r9, r1, r3)
            r3 = r7[r8]
            r2.o1(r0, r3, r1)
        L_0x00b7:
            r4 = r6
            goto L_0x00e1
        L_0x00b9:
            r3.o = r0
            r3.Z = r10
            java.lang.Object r1 = r0.b(r1, r3)
            if (r1 != r4) goto L_0x00c4
            goto L_0x00e1
        L_0x00c4:
            t97 r1 = r0.c
            java.lang.Object r1 = r1.getValue()
            rf4 r1 = (defpackage.rf4) r1
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            r0.h = r1
            d14 r1 = defpackage.d14.f
            r0.g = r1
            r1 = r7[r8]
            e3 r2 = r0.e
            r2.o1(r0, r1, r9)
            goto L_0x00b7
        L_0x00e1:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m14.a(m14, d14, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.d14 r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.g14
            if (r0 == 0) goto L_0x0013
            r0 = r13
            g14 r0 = (defpackage.g14) r0
            int r1 = r0.w0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w0 = r1
            goto L_0x0018
        L_0x0013:
            g14 r0 = new g14
            r0.<init>(r11, r13)
        L_0x0018:
            java.lang.Object r13 = r0.Y
            pu3 r1 = pu3.a
            int r2 = r0.w0
            java.lang.String r3 = k
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r6) goto L_0x0046
            if (r2 == r5) goto L_0x0038
            if (r2 != r4) goto L_0x0030
            wx3.H(r13)
            goto L_0x00ed
        L_0x0030:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0038:
            d14 r12 = r0.X
            m14 r11 = r0.o
        L_0x003c:
            wx3.H(r13)     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            goto L_0x00ed
        L_0x0041:
            r13 = move-exception
            goto L_0x0097
        L_0x0043:
            r11 = move-exception
            goto L_0x00f0
        L_0x0046:
            d14 r12 = r0.X
            m14 r11 = r0.o
            goto L_0x003c
        L_0x004b:
            wx3.H(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r2 = "dispatch: "
            r13.<init>(r2)
            r13.append(r12)
            java.lang.String r13 = r13.toString()
            udd.q(r3, r13)
            boolean r13 = r12.c     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            zb9 r2 = r12.e
            t97 r7 = r11.a
            if (r13 == 0) goto L_0x007c
            java.lang.Object r13 = r7.getValue()     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            l19 r13 = (defpackage.l19) r13     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.o = r11     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.X = r12     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.w0 = r6     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            x19 r13 = (defpackage.x19) r13     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            java.lang.Object r11 = r13.i(r0)     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            if (r11 != r1) goto L_0x00ed
            return r1
        L_0x007c:
            boolean r13 = r2.j()     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            if (r13 == 0) goto L_0x00ed
            java.lang.Object r13 = r7.getValue()     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            l19 r13 = (defpackage.l19) r13     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.o = r11     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.X = r12     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            r0.w0 = r5     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            x19 r13 = (defpackage.x19) r13     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            java.lang.Object r11 = r13.j(r2, r0)     // Catch:{ CancellationException -> 0x0043, all -> 0x0041 }
            if (r11 != r1) goto L_0x00ed
            return r1
        L_0x0097:
            boolean r2 = r12.a
            if (r2 != 0) goto L_0x00d5
            boolean r2 = r13 instanceof android.os.FileUriExposedException
            if (r2 == 0) goto L_0x00d5
            java.lang.String r13 = "dispatch: FileUriExposedException, change ringtone uri to default"
            udd.q(r3, r13)
            t97 r13 = r11.d
            java.lang.Object r13 = r13.getValue()
            ip r13 = (defpackage.ip) r13
            kp r13 = (defpackage.kp) r13
            java.lang.String r2 = "app.notification.ringtone"
            r3 = 0
            r13.l(r2, r3)
            java.lang.String r2 = "app.notification.chats.ringtone"
            r13.l(r2, r3)
            d14 r13 = new d14
            boolean r9 = r12.c
            cb5 r10 = r12.d
            r6 = 1
            boolean r7 = r12.b
            zb9 r8 = r12.e
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r0.o = r3
            r0.X = r3
            r0.w0 = r4
            java.lang.Object r11 = r11.b(r13, r0)
            if (r11 != r1) goto L_0x00ed
            return r1
        L_0x00d5:
            r11.getClass()
            java.lang.String r12 = "DebounceNotificationDispatcher"
            java.lang.String r0 = "failure"
            udd.s(r12, r0, r13)
            t97 r11 = r11.b
            java.lang.Object r11 = r11.getValue()
            g15 r11 = (defpackage.g15) r11
            r12 = 0
            r4a r11 = (r4a) r11
            r11.c(r13, r12)
        L_0x00ed:
            jue r11 = jue.a
            return r11
        L_0x00f0:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m14.b(d14, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c(u16 u16) {
        xs7.E(this.f, (hu3) null, (ru3) null, new h14(this, u16, (Continuation) null), 3);
    }
}
