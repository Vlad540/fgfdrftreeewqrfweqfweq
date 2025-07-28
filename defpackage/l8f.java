package defpackage;

import android.content.Context;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.video.fetcher.FetcherException;

/* renamed from: l8f  reason: default package */
public final class l8f {
    public final x3f a = new Object();
    public final Context b;
    public final oa7 c;
    public final ed3 d;
    public final nbe e;
    public final qmc f;
    public final j2b g;
    public final pk h;
    public final lce i;
    public final ad3 j;
    public final tt0 k;
    public final bf5 l;
    public final int m;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, x3f] */
    public l8f(Context context, ed3 ed3, oa7 oa7, mbe mbe, j2b j2b, pk pkVar, lce lce, ad3 ad3, tt0 tt0, bf5 bf5) {
        this.b = context;
        this.d = ed3;
        this.c = oa7;
        nbe nbe = (nbe) mbe;
        this.f = nbe.a();
        this.e = nbe;
        this.g = j2b;
        this.h = pkVar;
        this.i = lce;
        this.j = ad3;
        this.k = tt0;
        this.l = bf5;
        this.m = 30;
    }

    public final boolean a(Throwable th) {
        int i2 = th instanceof FetcherException ? ((FetcherException) th).a : 0;
        if (i2 == 1 || i2 == 7 || i2 == 6 || i2 == 9) {
            return true;
        }
        return !this.d.f();
    }

    public final String b(o10 o10) {
        long j2;
        boolean L = ete.L(o10);
        if (o10.i()) {
            j2 = o10.d.a;
        } else {
            if (L) {
                j2 = 0;
            }
            return null;
        }
        String str = o10.r;
        if (r1g.p(str)) {
            return null;
        }
        if (lp.n(new File(str))) {
            return str;
        }
        if (j2 == 0) {
            return null;
        }
        File s = ((mg5) this.l).s(j2);
        if (lp.n(s)) {
            return s.getAbsolutePath();
        }
        return null;
    }

    public final phd c(o10 o10, long j2, long j3) {
        o10 o102 = o10;
        udd.p("VideoRipper", "getVideoContent chatServerId=%d, messageServerId=%d", new Object[]{Long.valueOf(j2), Long.valueOf(j3)});
        n10 n10 = ete.L(o10) ? o102.j.d.d : o102.d;
        fx7 fx7 = new fx7(new k8f(this, n10, o102));
        n10 n102 = ete.L(o10) ? o102.j.d.d : o102.d;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        qmc a2 = cnc.a();
        Objects.requireNonNull(timeUnit, "unit is null");
        Objects.requireNonNull(a2, "scheduler is null");
        return new o73(fx7, 1, new mhd(new mhd(new uid(new phd(new mv9(1, new xd4(this, o10, j2, j3, n102, 2)), new are(27), 0), (long) this.m, timeUnit, a2), new k8f(this, o102, n102), 2), new joc(this, 23, n102), 1)).h(new xle(11, (Object) n10));
    }
}
