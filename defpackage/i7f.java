package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: i7f  reason: default package */
public final class i7f {
    public final f7f a;
    public volatile long b = -1;

    public i7f(f7f f7f) {
        this.a = f7f;
    }

    @a1e
    public final void onEvent(u89 u89) {
        o10 o10;
        Object obj;
        if (u89.a == this.b) {
            this.a.l().f(this);
            i22 y = this.a.m().y(this.a.X);
            pl plVar = null;
            if (y == null) {
                this.a.l().c(new jh0(this.a.a, new uae("attachment.token.expired", "chat deleted", (String) null)));
                return;
            }
            vo8 j = this.a.p().j(y.a, this.a.Y);
            if (j == null || j.z0 == ls8.DELETED) {
                this.a.l().c(new jh0(this.a.a, new uae("attachment.token.expired", "message deleted", (String) null)));
                return;
            }
            if (j.D0 == null) {
                this.a.l().c(new jh0(this.a.a, new uae("attachment.token.expired", "attaches not found", (String) null)));
            }
            long j2 = this.a.o;
            jj7 jj7 = j.D0;
            if (jj7 == null) {
                o10 = null;
            } else {
                Iterator it = ((List) jj7.a).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((o10) obj).d.a == j2) {
                        break;
                    }
                }
                o10 = (o10) obj;
            }
            if (o10 == null) {
                this.a.l().c(new jh0(this.a.a, new uae("attachment.token.expired", "video deleted", (String) null)));
                return;
            }
            n10 n10 = o10.d;
            f7f f7f = this.a;
            long j3 = j.b;
            String str = n10.m;
            f7f f7f2 = new f7f(f7f.a, f7f.o, f7f.X, f7f.Y, j3, f7f.w0, f7f.x0, f7f.y0, str, true);
            pl plVar2 = this.a.c;
            if (plVar2 != null) {
                plVar = plVar2;
            }
            qbe qbe = (qbe) plVar.O.getValue();
            qbe.getClass();
            ((ybe) qbe).b(f7f2, f7f2, false);
        }
    }

    @a1e
    public final void onEvent(t89 t89) {
        if (t89.a == this.b) {
            this.a.l().f(this);
            this.a.l().c(new jh0(this.a.a, t89.b));
        }
    }
}
