package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.MediaStore;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: bv6  reason: default package */
public final class bv6 implements gl7, ou3 {
    public static final String I0 = gl7.class.getSimpleName();
    public final bc A0;
    public final AtomicInteger B0;
    public g37 C0;
    public final AtomicInteger D0;
    public final ConcurrentHashMap E0;
    public final ConcurrentHashMap F0;
    public qod G0;
    public final Object H0;
    public final t97 X;
    public final grd Y;
    public final ik5 Z;
    public final /* synthetic */ ContextScope a;
    public final ku3 b;
    public final pae c;
    public final ContentResolver o;
    public final grd w0 = hrd.a(new o46(l46.a, 0, false, false));
    public final grd x0;
    public final ik5 y0;
    public final grd z0;

    public bv6(Context context, ku3 ku3, pae pae, t97 t97) {
        this.a = n1g.a(x87.c().plus(((n3a) pae).b()));
        this.b = ku3;
        this.c = pae;
        this.o = context.getContentResolver();
        this.X = t97;
        grd a2 = hrd.a(new o46(k46.a, 0, false, true));
        this.Y = a2;
        this.Z = new ik5(new t0c(a2), 6);
        grd a3 = hrd.a(new o46(j46.a, 0, false, true));
        this.x0 = a3;
        this.y0 = new ik5(new t0c(a3), 7);
        grd a4 = hrd.a((Object) null);
        this.z0 = a4;
        this.A0 = new bc(new ik5(a4, 2), 24, this);
        this.B0 = new AtomicInteger(0);
        this.D0 = new AtomicInteger(-1);
        this.E0 = new ConcurrentHashMap();
        this.F0 = new ConcurrentHashMap();
        bx3 bx3 = new bx3(this);
        for (Uri registerContentObserver : p23.B(new Uri[]{MediaStore.Images.Media.EXTERNAL_CONTENT_URI, MediaStore.Video.Media.EXTERNAL_CONTENT_URI, MediaStore.Images.Media.INTERNAL_CONTENT_URI, MediaStore.Video.Media.INTERNAL_CONTENT_URI})) {
            try {
                this.o.registerContentObserver(registerContentObserver, true, bx3);
            } catch (Throwable th) {
                this.b.g(bw4.a, th);
            }
        }
        new ez2(this, this.b, new nfc(17, this), this.c, new gz3(21, this));
        this.H0 = new Object();
    }

    public static final Object a(n46 n46, bv6 bv6, Continuation continuation) {
        return xs7.U(bv6.c.b(), new zu6(n46, bv6, (Continuation) null), continuation);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0006, code lost:
        r2 = (java.util.List) r2.E0.get(r3.a);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.o46 r3) {
        /*
            r2 = this;
            int r0 = r3.b
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.util.concurrent.ConcurrentHashMap r2 = r2.E0
            n46 r0 = r3.a
            java.lang.Object r2 = r2.get(r0)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L_0x0013
            return r1
        L_0x0013:
            int r2 = r2.size()
            int r3 = r3.b
            if (r2 >= r3) goto L_0x001c
            r1 = 1
        L_0x001c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bv6.b(o46):boolean");
    }

    public final List c(n46 n46) {
        List list = (List) this.E0.get(n46);
        return list == null ? hw4.a : list;
    }

    public final Object d(o46 o46, int i, Continuation continuation) {
        return xs7.U(this.c.b(), new qu6(o46, i, this, (Continuation) null), continuation);
    }

    public final void e() {
        qod qod;
        synchronized (this.H0) {
            try {
                udd.q(I0, "onContentChanged()");
                qod qod2 = this.G0;
                if (!(qod2 == null || !qod2.isActive() || (qod = this.G0) == null)) {
                    qod.cancel((CancellationException) null);
                }
                this.G0 = xs7.E(this, this.b, (ru3) null, new ru6(this, (Continuation) null), 2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        g37 g37 = this.C0;
        AtomicInteger atomicInteger = this.B0;
        String str = I0;
        Boolean bool = null;
        if (g37 != null) {
            int i = atomicInteger.get();
            g37 g372 = this.C0;
            Boolean valueOf = g372 != null ? Boolean.valueOf(g372.isActive()) : null;
            g37 g373 = this.C0;
            if (g373 != null) {
                bool = Boolean.valueOf(g373.isCompleted());
            }
            udd.q(str, "prefetch " + i + " is not null, prefetchJob.isActive = " + valueOf + ", prefetchJob.isCompleted = " + bool);
        } else if (!((qna) this.X.getValue()).c()) {
            udd.q(str, "permission is not granted");
        } else {
            int incrementAndGet = atomicInteger.incrementAndGet();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            udd.q(str, "prefetch " + incrementAndGet + " start");
            qod E = xs7.E(this, this.b, (ru3) null, new vu6(this, incrementAndGet, (Continuation) null), 2);
            E.invokeOnCompletion(new bu6(elapsedRealtime, incrementAndGet));
            this.C0 = E;
        }
    }

    public final hu3 getCoroutineContext() {
        return this.a.getCoroutineContext();
    }
}
