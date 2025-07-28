package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: xk9  reason: default package */
public abstract class xk9 {
    public final ou3 a;
    public final t97 b;
    public g37 c;
    public i26 d;

    public xk9(ou3 ou3, t97 t97) {
        this.a = ou3;
        this.b = t97;
    }

    public final void a() {
        g37 g37 = this.c;
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        this.c = null;
        vk9 vk9 = (vk9) this;
        ReentrantLock reentrantLock = vk9.f;
        reentrantLock.lock();
        try {
            vk9.e.c();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long b() {
        int i = zp4.o;
        yzc yzc = ((j2b) ((g2b) this.b.getValue())).b;
        yzc.getClass();
        return mt0.Q(yzc.o(PmsKey.f88noncontactcollectioninterval, TimeUnit.SECONDS.toMillis(10)), eq4.c);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(zb9 r10, kotlin.coroutines.Continuation r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.wk9
            if (r0 == 0) goto L_0x0013
            r0 = r11
            wk9 r0 = (defpackage.wk9) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            wk9 r0 = new wk9
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            jue r3 = jue.a
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x0038
            if (r2 != r5) goto L_0x0030
            xk9 r9 = r0.o
            wx3.H(r11)     // Catch:{ Error -> 0x002e, all -> 0x002c }
            goto L_0x0090
        L_0x002c:
            r10 = move-exception
            goto L_0x0075
        L_0x002e:
            r9 = move-exception
            goto L_0x0091
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            wx3.H(r11)
            java.lang.Class r11 = r9.getClass()
            java.lang.String r11 = r11.getName()
            fn6 r2 = udd.e
            if (r2 != 0) goto L_0x0048
            goto L_0x005f
        L_0x0048:
            boolean r6 = r2.c()
            if (r6 == 0) goto L_0x005f
            tn7 r6 = defpackage.tn7.X
            r7 = 31
            java.lang.String r7 = zb9.k(r10, r4, r4, r7)
            java.lang.String r8 = "request ids "
            java.lang.String r7 = r8.concat(r7)
            r2.d(r6, r11, r7, r4)
        L_0x005f:
            boolean r11 = r10.i()
            if (r11 == 0) goto L_0x0066
            return r3
        L_0x0066:
            i26 r11 = r9.d     // Catch:{ Error -> 0x002e, all -> 0x002c }
            if (r11 == 0) goto L_0x0090
            r0.o = r9     // Catch:{ Error -> 0x002e, all -> 0x002c }
            r0.Z = r5     // Catch:{ Error -> 0x002e, all -> 0x002c }
            java.lang.Object r9 = r11.invoke(r10, r0)     // Catch:{ Error -> 0x002e, all -> 0x002c }
            if (r9 != r1) goto L_0x0090
            return r1
        L_0x0075:
            r9.a()
            boolean r10 = r10 instanceof java.util.concurrent.CancellationException
            if (r10 == 0) goto L_0x007d
            return r3
        L_0x007d:
            vk9 r9 = (defpackage.vk9) r9
            r9.a()
            uk9 r10 = new uk9
            r10.<init>(r9, r4)
            r11 = 3
            ou3 r0 = r9.a
            qod r10 = xs7.E(r0, r4, r4, r10, r11)
            r9.c = r10
        L_0x0090:
            return r3
        L_0x0091:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk9.c(zb9, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
