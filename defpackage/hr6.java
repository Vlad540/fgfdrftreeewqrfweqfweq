package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import java.util.Set;
import java.util.concurrent.Executors;

/* renamed from: hr6  reason: default package */
public final class hr6 {
    public final k54 a;
    public final y76 b;
    public final m54 c;
    public final Context d;
    public final vl4 e;
    public final ai4 f;
    public final k74 g;
    public final h25 h;
    public final kk9 i;
    public final t3e j;
    public final sh4 k;
    public final lk9 l;
    public final bm3 m;
    public final g0b n;
    public final nfc o;
    public final Set p;
    public final qw4 q;
    public final qw4 r;
    public final boolean s;
    public final sh4 t;
    public final b2b u;
    public final di9 v;
    public final boolean w;
    public final zl3 x;
    public final bqc y;

    /* JADX WARNING: type inference failed for: r1v0, types: [di9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v10, types: [k74, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v4, types: [bqc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v15, types: [s86, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [otf, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v19, types: [kk9, java.lang.Object] */
    public hr6(gr6 gr6) {
        kk9 kk9;
        n06.s();
        jn jnVar = gr6.k;
        jnVar.getClass();
        ? obj = new Object();
        jnVar.getClass();
        obj.a = jnVar.b;
        obj.b = new Object();
        obj.c = (uz3) jnVar.c;
        obj.d = (kp0) jnVar.o;
        this.v = obj;
        Object systemService = gr6.b.getSystemService("activity");
        if (systemService != null) {
            this.a = new k54((ActivityManager) systemService);
            this.b = new y76(7);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            m54 m54 = gr6.a;
            this.c = m54 == null ? m54.p() : m54;
            Context context = gr6.b;
            if (context != null) {
                this.d = context;
                this.e = gr6.c;
                this.g = new Object();
                synchronized (kk9.class) {
                    try {
                        if (kk9.a == null) {
                            kk9.a = new Object();
                        }
                        kk9 = kk9.a;
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                this.i = kk9;
                this.j = ez3.d;
                sh4 sh4 = gr6.e;
                if (sh4 == null) {
                    Context context2 = gr6.b;
                    n06.s();
                    sh4 = new sh4(new rh4(context2));
                }
                this.k = sh4;
                this.l = lk9.g();
                n06.s();
                wm6 wm6 = gr6.f;
                this.m = wm6 == null ? new wm6() : wm6;
                g0b g0b = gr6.g;
                g0b = g0b == null ? new g0b(new f0b(new Object())) : g0b;
                this.n = g0b;
                this.o = new nfc(26);
                Set set = gr6.h;
                this.p = set == null ? qw4.a : set;
                qw4 qw4 = qw4.a;
                this.q = qw4;
                this.r = qw4;
                this.s = true;
                sh4 sh42 = gr6.i;
                this.t = sh42 != null ? sh42 : sh4;
                this.u = gr6.j;
                int i2 = g0b.a.c.d;
                h25 h25 = gr6.d;
                h25 h252 = h25;
                if (h25 == null) {
                    ? obj2 = new Object();
                    obj2.a = Executors.newFixedThreadPool(2, new zf9("FrescoIoBoundExecutor", 1));
                    obj2.b = Executors.newFixedThreadPool(i2, new zf9("FrescoDecodeExecutor", 1));
                    obj2.c = Executors.newFixedThreadPool(i2, new zf9("FrescoBackgroundExecutor", 1));
                    obj2.o = Executors.newFixedThreadPool(1, new zf9("FrescoLightWeightBackgroundExecutor", 1));
                    obj2.X = Executors.newScheduledThreadPool(i2, new zf9("FrescoBackgroundExecutor", 1));
                    h252 = obj2;
                }
                this.h = h252;
                this.w = true;
                this.x = gr6.l;
                this.y = new Object();
                Object obj3 = new Object();
                nfc nfc = new nfc(14, false);
                nfc.b = obj3;
                this.f = new ai4(nfc, this);
                n06.s();
                return;
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
