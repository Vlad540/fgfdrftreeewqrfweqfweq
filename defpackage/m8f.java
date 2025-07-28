package defpackage;

import android.util.Pair;
import android.view.Surface;
import java.util.List;

/* renamed from: m8f  reason: default package */
public final class m8f {
    public final l13 a;
    public final xu5 b;
    public final List c;
    public final iqe d;
    public final s39 e;
    public final String f;
    public final int g;
    public p4e h;
    public volatile w54 i;
    public volatile int j;
    public volatile boolean k;

    public m8f(l13 l13, xu5 xu5, ws6 ws6, iqe iqe, s39 s39) {
        z23 z23 = xu5.A;
        oyb.d(z23 != null);
        this.a = l13;
        this.b = xu5;
        this.c = ws6;
        this.d = iqe;
        this.e = s39;
        String str = xu5.n;
        str.getClass();
        String str2 = iqe.c;
        String str3 = "video/hevc";
        if (str2 != null) {
            str = str2;
        } else if (c49.i(str)) {
            str = str3;
        }
        int i2 = iqe.d;
        if (i2 == 0 && z23.g(z23) && by4.g(str, z23).isEmpty()) {
            if (by4.g(str3, z23).isEmpty()) {
                i2 = 2;
            }
            Pair create = Pair.create(str3, Integer.valueOf(i2));
            this.f = (String) create.first;
            this.g = ((Integer) create.second).intValue();
        }
        str3 = str;
        Pair create2 = Pair.create(str3, Integer.valueOf(i2));
        this.f = (String) create2.first;
        this.g = ((Integer) create2.second).intValue();
    }

    public final p4e a(int i2, int i3) {
        z23 z23;
        if (this.k) {
            return null;
        }
        p4e p4e = this.h;
        if (p4e != null) {
            return p4e;
        }
        if (i2 < i3) {
            this.j = 90;
            int i4 = i3;
            i3 = i2;
            i2 = i4;
        }
        if (this.b.w % 180 == this.j % 180) {
            this.j = this.b.w;
        }
        uu5 uu5 = new uu5();
        uu5.s = i2;
        uu5.t = i3;
        boolean z = false;
        uu5.v = 0;
        uu5.u = this.b.v;
        uu5.m = c49.l(this.f);
        xu5 xu5 = this.b;
        if (z23.g(xu5.A) && this.g != 0) {
            z23 = z23.h;
        } else if (z23.i.equals(xu5.A)) {
            z23 = z23.h;
        } else {
            z23 = xu5.A;
            z23.getClass();
        }
        uu5.z = z23;
        uu5.i = this.b.j;
        xu5 xu52 = new xu5(uu5);
        l13 l13 = this.a;
        uu5 a2 = xu52.a();
        a2.m = c49.l(qjc.i(xu52, this.c));
        this.i = l13.n(new xu5(a2));
        xu5 xu53 = this.i.c;
        s39 s39 = this.e;
        iqe iqe = this.d;
        if (this.j != 0) {
            z = true;
        }
        int i5 = this.g;
        wx a3 = iqe.a();
        if (iqe.d != i5) {
            a3.b = i5;
        }
        if (!oze.a(xu52.n, xu53.n)) {
            a3.d(xu53.n);
        }
        if (z) {
            int i6 = xu52.t;
            int i7 = xu53.t;
            if (i6 != i7) {
                a3.a = i7;
            }
        } else {
            int i8 = xu52.u;
            int i9 = xu53.u;
            if (i8 != i9) {
                a3.a = i9;
            }
        }
        s39.h(a3.a());
        Surface surface = this.i.e;
        oyb.l(surface);
        this.h = new p4e(surface, xu53.t, xu53.u, this.j);
        if (this.k) {
            this.i.h();
        }
        return this.h;
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 128 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r2 = this;
            w54 r0 = r2.i
            if (r0 == 0) goto L_0x003a
            w54 r2 = r2.i
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.i
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x001b
            r0 = 30
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0014 }
            goto L_0x001b
        L_0x0014:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L_0x001b:
            java.util.LinkedHashMap r0 = defpackage.b24.a
            java.lang.Class<b24> r0 = defpackage.b24.class
            monitor-enter(r0)
            java.lang.Class<b24> r1 = defpackage.b24.class
            monitor-enter(r1)     // Catch:{ all -> 0x0038 }
            monitor-exit(r1)     // Catch:{ all -> 0x0038 }
            monitor-exit(r0)
            android.media.MediaCodec r0 = r2.d     // Catch:{ RuntimeException -> 0x002b }
            r0.signalEndOfInputStream()     // Catch:{ RuntimeException -> 0x002b }
            goto L_0x003a
        L_0x002b:
            r0 = move-exception
            java.lang.String r1 = "MediaCodec error"
            defpackage.ez3.u(r0, r1)
            androidx.media3.transformer.ExportException r2 = r2.a(r0)
            throw r2
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0038 }
            throw r2
        L_0x0038:
            r2 = move-exception
            goto L_0x0036
        L_0x003a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m8f.b():void");
    }
}
