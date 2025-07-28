package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;

/* renamed from: ml4  reason: default package */
public final class ml4 {
    public static final yac n = new yac(1);
    public final Context a;
    public final vuf b;
    public final jl4 c;
    public final r34 d;
    public final CopyOnWriteArraySet e = new CopyOnWriteArraySet();
    public int f;
    public int g;
    public boolean h;
    public boolean i = true;
    public int j;
    public boolean k;
    public List l = Collections.emptyList();
    public ga0 m;

    public ml4(Context context, c04 c04, av0 av0, nz3 nz3, ExecutorService executorService) {
        o64 o64 = new o64(c04);
        gv0 gv0 = new gv0();
        gv0.a = av0;
        gv0.d = nz3;
        p64 p64 = new p64(gv0, executorService);
        this.a = context.getApplicationContext();
        this.b = o64;
        Handler p = oze.p(new fi4(1, this));
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        jl4 jl4 = new jl4(handlerThread, o64, p64, p, this.i);
        this.c = jl4;
        r34 r34 = new r34(6, (Object) this);
        this.d = r34;
        ga0 ga0 = new ga0(context, r34, n);
        this.m = ga0;
        int f2 = ga0.f();
        this.j = f2;
        this.f = 1;
        jl4.obtainMessage(1, f2, 0).sendToTarget();
    }

    public final void a() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((kl4) it.next()).d(this, this.k);
        }
    }

    public final void b(ga0 ga0, int i2) {
        Object obj = ga0.d;
        if (this.j != i2) {
            this.j = i2;
            this.f++;
            this.c.obtainMessage(3, i2, 0).sendToTarget();
        }
        boolean d2 = d();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((kl4) it.next()).b();
        }
        if (d2) {
            a();
        }
    }

    public final void c(boolean z) {
        if (this.i != z) {
            this.i = z;
            this.f++;
            this.c.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
            boolean d2 = d();
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((kl4) it.next()).getClass();
            }
            if (d2) {
                a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r4 = this;
            boolean r0 = r4.i
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0024
            int r0 = r4.j
            if (r0 == 0) goto L_0x0024
            r0 = r2
        L_0x000b:
            java.util.List r3 = r4.l
            int r3 = r3.size()
            if (r0 >= r3) goto L_0x0024
            java.util.List r3 = r4.l
            java.lang.Object r3 = r3.get(r0)
            zj4 r3 = (defpackage.zj4) r3
            int r3 = r3.b
            if (r3 != 0) goto L_0x0021
            r0 = r1
            goto L_0x0025
        L_0x0021:
            int r0 = r0 + 1
            goto L_0x000b
        L_0x0024:
            r0 = r2
        L_0x0025:
            boolean r3 = r4.k
            if (r3 == r0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r1 = r2
        L_0x002b:
            r4.k = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml4.d():boolean");
    }
}
