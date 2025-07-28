package defpackage;

import android.app.Application;
import android.os.SystemClock;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: kdf  reason: default package */
public final class kdf implements aq {
    public static final /* synthetic */ int n = 0;
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final ju3 d;
    public final t97 e;
    public int f = 0;
    public long g;
    public int h;
    public final CopyOnWriteArraySet i = new CopyOnWriteArraySet();
    public final znc j;
    public volatile boolean k = false;
    public volatile boolean l = true;
    public final jdf m = new jdf(this);

    public kdf(Application application, znc znc, t97 t97, t97 t972, t97 t973, ju3 ju3, t97 t974) {
        this.j = znc;
        this.a = t97;
        this.b = t972;
        this.d = ju3;
        this.c = t973;
        this.e = t974;
        application.registerActivityLifecycleCallbacks(new hf0(1, this));
    }

    public final void a() {
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.g;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, "kdf", "app enter background, time=" + ez3.T(Long.valueOf(System.currentTimeMillis())) + ", interactiveTime=" + elapsedRealtime, (Throwable) null);
        }
        ((bd) this.b.getValue()).i(elapsedRealtime, "INTERACTIVE_SESSION");
        this.d.dispatch(bw4.a, new idf(this, 1));
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((zp) it.next()).a();
        }
    }

    public final void b() {
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, "kdf", "app enter foreground, time = " + ez3.T(Long.valueOf(System.currentTimeMillis())), (Throwable) null);
        }
        this.g = SystemClock.elapsedRealtime();
        this.d.dispatch(bw4.a, new idf(this, 2));
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            ((zp) it.next()).c();
        }
    }

    public final boolean c() {
        return this.k && this.l;
    }
}
