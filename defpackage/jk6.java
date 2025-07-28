package defpackage;

import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: jk6  reason: default package */
public final class jk6 extends l5e implements i26 {
    public final /* synthetic */ String X;
    public final /* synthetic */ kk6 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jk6(String str, kk6 kk6, Continuation continuation) {
        super(2, continuation);
        this.X = str;
        this.Y = kk6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jk6) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jk6(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        String str = this.X;
        boolean Q = p0e.Q(str, "Custom", false);
        jue jue = jue.a;
        kk6 kk6 = this.Y;
        if (Q) {
            taf.o(kk6.x0, new gk6(kk6.Y.getString("Custom", BuildConfig.FLAVOR)));
            return jue;
        }
        boolean d = ((zy9) kk6.X.getValue()).d();
        j2b q = kk6.q();
        q.a.b();
        q.b.b();
        q.c.b();
        q.d.b();
        q.e.b();
        kk6.q().a.l("server.host", str);
        kk6.q().a.l("server.port", "443");
        kk6.w0.setValue(kk6.r());
        l05 l05 = kk6.x0;
        if (d) {
            taf.o(l05, hk6.a);
            ez2 ez2 = kk6.b;
            String str2 = (String) ez2.b;
            udd.p(str2, "execute", new Object[0]);
            ((tt0) ((t97) ez2.c).getValue()).d(new dz2(ez2));
            try {
                ((zy9) ((t97) ez2.o).getValue()).g(true);
            } catch (Throwable th) {
                udd.s(str2, "resetCache: failed", th);
            }
        }
        taf.o(l05, fk6.a);
        return jue;
    }
}
