package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.util.Pair;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.util.GlUtil$GlException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* renamed from: tg5  reason: default package */
public final class tg5 implements o96, r96 {
    public nc4 A;
    public boolean B;
    public boolean C;
    public p4e D;
    public EGLSurface E;
    public final Context a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final EGLDisplay d;
    public final EGLContext e;
    public final EGLSurface f;
    public final pv0 g;
    public final z23 h;
    public final ew0 i;
    public final Executor j;
    public final l4f k;
    public final ConcurrentLinkedQueue l;
    public final bq0 m;
    public final xx n;
    public final xx o;
    public final q96 p;
    public final int q;
    public final boolean r;
    public int s;
    public int t;
    public int u;
    public int v;
    public na4 w;
    public boolean x;
    public m96 y;
    public gjd z;

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, m96] */
    public tg5(Context context, EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, pv0 pv0, z23 z23, ew0 ew0, Executor executor, l4f l4f, q96 q96, int i2, int i3, boolean z2) {
        this.a = context;
        this.d = eGLDisplay;
        this.e = eGLContext;
        this.f = eGLSurface;
        this.g = pv0;
        this.h = z23;
        this.i = ew0;
        this.j = executor;
        this.k = l4f;
        this.p = q96;
        this.q = i3;
        this.r = z2;
        this.y = new Object();
        this.l = new ConcurrentLinkedQueue();
        this.m = new bq0(z23.g(z23), i2);
        this.n = new xx(i2);
        this.o = new xx(i2);
    }

    public final void a(h96 h96, p96 p96, long j2) {
        this.j.execute(new q50(this, j2, 5));
        if (this.p == null) {
            if (this.r) {
                k(h96, p96, j2, j2 * 1000);
            } else {
                this.l.add(Pair.create(p96, Long.valueOf(j2)));
            }
            this.y.i();
            return;
        }
        oyb.k(this.m.f() > 0);
        k(h96, p96, j2, j2 * 1000);
    }

    public final void b(p96 p96) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        if (this.l.isEmpty()) {
            nc4 nc4 = this.A;
            nc4.getClass();
            nc4.a();
            this.x = false;
            return;
        }
        oyb.k(!this.r);
        this.x = true;
    }

    public final void d(long j2) {
        this.i.v(new fc4(this, j2, 2));
    }

    public final void e(Executor executor, kc4 kc4) {
        throw new UnsupportedOperationException();
    }

    public final void f(w4g w4g) {
        throw new UnsupportedOperationException();
    }

    public final void flush() {
        bq0 bq0 = this.m;
        int i2 = 0;
        q96 q96 = this.p;
        if (q96 != null) {
            ArrayDeque arrayDeque = (ArrayDeque) bq0.e;
            ((ArrayDeque) bq0.d).addAll(arrayDeque);
            arrayDeque.clear();
            xx xxVar = this.n;
            xxVar.b = 0;
            xxVar.c = -1;
            xxVar.o = 0;
            xx xxVar2 = this.o;
            xxVar2.b = 0;
            xxVar2.c = -1;
            xxVar2.o = 0;
        }
        this.l.clear();
        this.x = false;
        na4 na4 = this.w;
        if (na4 != null) {
            na4.flush();
        }
        this.y.p();
        while (true) {
            if (i2 < (q96 == null ? 1 : bq0.f())) {
                this.y.i();
                i2++;
            } else {
                return;
            }
        }
    }

    public final void g(m96 m96) {
        this.y = m96;
        int i2 = 0;
        while (true) {
            if (i2 < (this.p == null ? 1 : this.m.f())) {
                m96.i();
                i2++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ms6, ts6] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Object, elc] */
    public final synchronized na4 h(int i2, int i3, int i4) {
        na4 i5;
        try {
            ? ms6 = new ms6(4);
            ms6.e(this.b);
            if (i2 != 0) {
                ? obj = new Object();
                float f2 = ((float) i2) % 360.0f;
                obj.a = f2;
                if (f2 < 0.0f) {
                    obj.a = f2 + 360.0f;
                }
                ms6.a(new flc(obj.a));
            }
            ms6.a(u2b.e(i3, i4));
            i5 = na4.i(this.a, ms6.j(), this.c, this.h, this.q);
            gjd h2 = x87.h(i5.i, this.s, this.t);
            p4e p4e = this.D;
            if (p4e != null) {
                boolean z2 = false;
                oyb.k(h2.a == p4e.b);
                if (h2.b == p4e.c) {
                    z2 = true;
                }
                oyb.k(z2);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return i5;
    }

    public final synchronized void i() {
        if (this.E != null) {
            try {
                EGLDisplay eGLDisplay = this.d;
                EGLContext eGLContext = this.e;
                EGLSurface eGLSurface = this.f;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
                gt0.f("Error making context current");
                gt0.t(0, 1, 1);
                EGLDisplay eGLDisplay2 = this.d;
                EGLSurface eGLSurface2 = this.E;
                if (eGLDisplay2 != null) {
                    if (eGLSurface2 != null) {
                        EGL14.eglDestroySurface(eGLDisplay2, eGLSurface2);
                        gt0.f("Error destroying surface");
                    }
                }
            } catch (GlUtil$GlException e2) {
                try {
                    this.j.execute(new ii4(this, 27, e2));
                } catch (Throwable th) {
                    this.E = null;
                    throw th;
                }
            }
            this.E = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00cd, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0018 A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046 A[Catch:{ all -> 0x0012 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean j(defpackage.h96 r7, int r8, int r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.s     // Catch:{ all -> 0x0012 }
            r1 = 1
            r2 = 0
            if (r0 != r8) goto L_0x0015
            int r0 = r6.t     // Catch:{ all -> 0x0012 }
            if (r0 != r9) goto L_0x0015
            gjd r0 = r6.z     // Catch:{ all -> 0x0012 }
            if (r0 != 0) goto L_0x0010
            goto L_0x0015
        L_0x0010:
            r0 = r2
            goto L_0x0016
        L_0x0012:
            r7 = move-exception
            goto L_0x00ce
        L_0x0015:
            r0 = r1
        L_0x0016:
            if (r0 == 0) goto L_0x0038
            r6.s = r8     // Catch:{ all -> 0x0012 }
            r6.t = r9     // Catch:{ all -> 0x0012 }
            java.util.ArrayList r3 = r6.b     // Catch:{ all -> 0x0012 }
            gjd r8 = x87.h(r3, r8, r9)     // Catch:{ all -> 0x0012 }
            gjd r9 = r6.z     // Catch:{ all -> 0x0012 }
            boolean r9 = defpackage.oze.a(r9, r8)     // Catch:{ all -> 0x0012 }
            if (r9 != 0) goto L_0x0038
            r6.z = r8     // Catch:{ all -> 0x0012 }
            java.util.concurrent.Executor r9 = r6.j     // Catch:{ all -> 0x0012 }
            ii4 r3 = new ii4     // Catch:{ all -> 0x0012 }
            r4 = 28
            r3.<init>(r6, r4, r8)     // Catch:{ all -> 0x0012 }
            r9.execute(r3)     // Catch:{ all -> 0x0012 }
        L_0x0038:
            gjd r8 = r6.z     // Catch:{ all -> 0x0012 }
            r8.getClass()     // Catch:{ all -> 0x0012 }
            p4e r8 = r6.D     // Catch:{ all -> 0x0012 }
            r9 = 0
            if (r8 != 0) goto L_0x005f
            q96 r3 = r6.p     // Catch:{ all -> 0x0012 }
            if (r3 != 0) goto L_0x005f
            android.opengl.EGLSurface r7 = r6.E     // Catch:{ all -> 0x0012 }
            if (r7 != 0) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r1 = r2
        L_0x004c:
            defpackage.oyb.k(r1)     // Catch:{ all -> 0x0012 }
            na4 r7 = r6.w     // Catch:{ all -> 0x0012 }
            if (r7 == 0) goto L_0x0058
            r7.release()     // Catch:{ all -> 0x0012 }
            r6.w = r9     // Catch:{ all -> 0x0012 }
        L_0x0058:
            java.lang.String r7 = "Output surface and size not set, dropping frame."
            defpackage.ez3.j0(r7)     // Catch:{ all -> 0x0012 }
            monitor-exit(r6)
            return r2
        L_0x005f:
            if (r8 != 0) goto L_0x0066
            gjd r3 = r6.z     // Catch:{ all -> 0x0012 }
            int r3 = r3.a     // Catch:{ all -> 0x0012 }
            goto L_0x0068
        L_0x0066:
            int r3 = r8.b     // Catch:{ all -> 0x0012 }
        L_0x0068:
            r6.u = r3     // Catch:{ all -> 0x0012 }
            if (r8 != 0) goto L_0x0071
            gjd r3 = r6.z     // Catch:{ all -> 0x0012 }
            int r3 = r3.b     // Catch:{ all -> 0x0012 }
            goto L_0x0073
        L_0x0071:
            int r3 = r8.c     // Catch:{ all -> 0x0012 }
        L_0x0073:
            r6.v = r3     // Catch:{ all -> 0x0012 }
            if (r8 == 0) goto L_0x008b
            android.opengl.EGLSurface r3 = r6.E     // Catch:{ all -> 0x0012 }
            if (r3 != 0) goto L_0x008b
            android.opengl.EGLDisplay r3 = r6.d     // Catch:{ all -> 0x0012 }
            android.view.Surface r8 = r8.a     // Catch:{ all -> 0x0012 }
            z23 r4 = r6.h     // Catch:{ all -> 0x0012 }
            int r4 = r4.c     // Catch:{ all -> 0x0012 }
            boolean r5 = r6.r     // Catch:{ all -> 0x0012 }
            android.opengl.EGLSurface r8 = r7.l(r3, r8, r4, r5)     // Catch:{ all -> 0x0012 }
            r6.E = r8     // Catch:{ all -> 0x0012 }
        L_0x008b:
            q96 r8 = r6.p     // Catch:{ all -> 0x0012 }
            if (r8 == 0) goto L_0x0098
            bq0 r8 = r6.m     // Catch:{ all -> 0x0012 }
            int r3 = r6.u     // Catch:{ all -> 0x0012 }
            int r4 = r6.v     // Catch:{ all -> 0x0012 }
            r8.e(r7, r3, r4)     // Catch:{ all -> 0x0012 }
        L_0x0098:
            pv0 r7 = r6.g     // Catch:{ all -> 0x0012 }
            r7.getClass()     // Catch:{ all -> 0x0012 }
            na4 r7 = r6.w     // Catch:{ all -> 0x0012 }
            if (r7 == 0) goto L_0x00b4
            boolean r8 = r6.C     // Catch:{ all -> 0x0012 }
            if (r8 != 0) goto L_0x00ab
            if (r0 != 0) goto L_0x00ab
            boolean r8 = r6.B     // Catch:{ all -> 0x0012 }
            if (r8 == 0) goto L_0x00b4
        L_0x00ab:
            r7.release()     // Catch:{ all -> 0x0012 }
            r6.w = r9     // Catch:{ all -> 0x0012 }
            r6.C = r2     // Catch:{ all -> 0x0012 }
            r6.B = r2     // Catch:{ all -> 0x0012 }
        L_0x00b4:
            na4 r7 = r6.w     // Catch:{ all -> 0x0012 }
            if (r7 != 0) goto L_0x00cc
            p4e r7 = r6.D     // Catch:{ all -> 0x0012 }
            if (r7 != 0) goto L_0x00be
            r7 = r2
            goto L_0x00c0
        L_0x00be:
            int r7 = r7.d     // Catch:{ all -> 0x0012 }
        L_0x00c0:
            int r8 = r6.u     // Catch:{ all -> 0x0012 }
            int r9 = r6.v     // Catch:{ all -> 0x0012 }
            na4 r7 = r6.h(r7, r8, r9)     // Catch:{ all -> 0x0012 }
            r6.w = r7     // Catch:{ all -> 0x0012 }
            r6.C = r2     // Catch:{ all -> 0x0012 }
        L_0x00cc:
            monitor-exit(r6)
            return r1
        L_0x00ce:
            monitor-exit(r6)     // Catch:{ all -> 0x0012 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tg5.j(h96, int, int):boolean");
    }

    public final synchronized void k(h96 h96, p96 p96, long j2, long j3) {
        if (j3 != -2) {
            try {
                if (j(h96, p96.c, p96.d)) {
                    if (this.D != null) {
                        l(p96, j2, j3);
                    } else if (this.p != null) {
                        m(p96, j2);
                    }
                    this.y.k(p96);
                    return;
                }
            } catch (VideoFrameProcessingException | GlUtil$GlException e2) {
                this.j.execute(new ii4(this, e2, j2));
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.y.k(p96);
    }

    public final synchronized void l(p96 p96, long j2, long j3) {
        try {
            EGLSurface eGLSurface = this.E;
            eGLSurface.getClass();
            p4e p4e = this.D;
            p4e.getClass();
            na4 na4 = this.w;
            na4.getClass();
            EGLDisplay eGLDisplay = this.d;
            EGLContext eGLContext = this.e;
            int i2 = p4e.b;
            int i3 = p4e.c;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
            gt0.f("Error making context current");
            gt0.t(0, i2, i3);
            gt0.j();
            na4.d(p96.a, j2);
            EGLDisplay eGLDisplay2 = this.d;
            if (j3 == -1) {
                j3 = System.nanoTime();
            }
            EGLExt.eglPresentationTimeANDROID(eGLDisplay2, eGLSurface, j3);
            EGL14.eglSwapBuffers(this.d, eGLSurface);
            b24.a();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public final void m(p96 p96, long j2) {
        p96 h2 = this.m.h();
        this.n.e(j2);
        gt0.t(h2.b, h2.c, h2.d);
        gt0.j();
        na4 na4 = this.w;
        na4.getClass();
        na4.d(p96.a, j2);
        this.o.e(gt0.n());
        q96 q96 = this.p;
        q96.getClass();
        q96.a(this, h2, j2);
    }

    public final synchronized void release() {
        na4 na4 = this.w;
        if (na4 != null) {
            na4.release();
        }
        try {
            this.m.d();
            EGLDisplay eGLDisplay = this.d;
            EGLSurface eGLSurface = this.E;
            if (eGLDisplay != null) {
                if (eGLSurface != null) {
                    EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                    gt0.f("Error destroying surface");
                }
            }
            gt0.g();
        } catch (GlUtil$GlException e2) {
            throw new Exception(e2);
        }
    }
}
