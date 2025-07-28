package defpackage;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: rh9  reason: default package */
public final class rh9 implements y4b {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object d;

    public rh9(y4b y4b, mxa mxa, Executor executor) {
        y4b.getClass();
        this.b = y4b;
        this.c = mxa;
        executor.getClass();
        this.d = executor;
    }

    public static void e(kl8 kl8, int i, ah0 ah0) {
        t54 o0 = e13.o0(kl8.n());
        ax4 ax4 = null;
        try {
            ax4 ax42 = new ax4(o0);
            try {
                ax42.S();
                ah0.g(i, ax42);
                ax4.d(ax42);
                e13.S(o0);
            } catch (Throwable th) {
                th = th;
                ax4 = ax42;
                ax4.d(ax4);
                e13.S(o0);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            ax4.d(ax4);
            e13.S(o0);
            throw th;
        }
    }

    public final void a(ah0 ah0, z4b z4b) {
        switch (this.a) {
            case 0:
                ((ji0) z4b).c.j(z4b, "NetworkFetchProducer");
                bm3 bm3 = (bm3) this.d;
                zb5 g = bm3.g(ah0, z4b);
                bm3.i(g, new afc(this, g, false));
                return;
            default:
                c5b c5b = ((ji0) z4b).c;
                k1b k1b = ((ji0) z4b).a.q;
                k1b.getClass();
                ((y4b) this.b).a(new u9(new l1b(this, ah0, c5b, k1b, z4b), 1), z4b);
                return;
        }
    }

    public void c(kl8 kl8, zb5 zb5) {
        int i = kl8.c;
        c5b a2 = zb5.a();
        z4b z4b = zb5.b;
        HashMap k = !a2.i(z4b, "NetworkFetchProducer") ? null : ((bm3) this.d).k(zb5, i);
        c5b a3 = zb5.a();
        a3.a(z4b, "NetworkFetchProducer", k);
        a3.e(z4b, "NetworkFetchProducer", true);
        ((ji0) z4b).h("network", "default");
        e(kl8, 1, zb5.a);
    }

    public void d(kl8 kl8, zb5 zb5) {
        ji0 ji0 = (ji0) zb5.b;
        if (ji0.A0.o != null && ji0.f()) {
            ((bm3) this.d).getClass();
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - zb5.c >= 100) {
                zb5.c = uptimeMillis;
                zb5.a().b(zb5.b);
                e(kl8, 0, zb5.a);
            }
        }
    }

    public rh9(qe4 qe4, w66 w66, bm3 bm3) {
        this.b = qe4;
        this.c = w66;
        this.d = bm3;
    }
}
