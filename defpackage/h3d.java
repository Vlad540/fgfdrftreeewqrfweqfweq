package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: h3d  reason: default package */
public final class h3d implements f3d, kd3 {
    public static final /* synthetic */ int j = 0;
    public final t97 a;
    public final g15 b;
    public final t97 c;
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();
    public final jk0 e = new jk0((Object) null);
    public final String[] f = {"no_net", "disconnected", "connected", "logged_in"};
    public final String[] g = {"disconnected", "connected", "logged_in"};
    public volatile int h = 0;
    public volatile int i = 0;

    public h3d(t97 t97, g15 g15, t97 t972) {
        this.a = t97;
        this.b = g15;
        this.c = t972;
        ((ed3) t97.getValue()).c(new g3d(this));
        udd.p("h3d", "ctor, %s", new Object[]{toString()});
    }

    public final void a(e3d e3d) {
        if (e3d != null) {
            this.d.add(e3d);
            e3d.c(this.h);
        }
    }

    public final void b() {
        if (!((ed3) this.a.getValue()).f()) {
            this.h = 0;
        } else {
            int i2 = this.i;
            if (i2 == 0) {
                this.h = 1;
            } else if (i2 == 1) {
                this.h = 2;
            } else if (i2 == 2) {
                this.h = 3;
            } else {
                throw new IllegalStateException("Unknown connection status=" + this.i);
            }
        }
        udd.p("h3d", "updateState, %s", new Object[]{toString()});
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((e3d) it.next()).c(this.h);
        }
        this.e.c(Integer.valueOf(this.h));
    }

    public final String toString() {
        return "SessionStateInfoImpl@" + Integer.toHexString(hashCode()) + "(connStatus=" + this.g[this.i] + ") -> " + this.f[this.h];
    }
}
