package defpackage;

import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: dfc  reason: default package */
public final class dfc extends yh7 {
    public final aec l;
    public final nu7 m;
    public final boolean n = true;
    public final Callable o;
    public final wu3 p;
    public final AtomicBoolean q;
    public final AtomicBoolean r;
    public final AtomicBoolean s;
    public final cfc t;
    public final cfc u;

    public dfc(aec aec, nu7 nu7, auf auf, String[] strArr) {
        this.l = aec;
        this.m = nu7;
        this.o = auf;
        this.p = new wu3(strArr, this, 1);
        this.q = new AtomicBoolean(true);
        this.r = new AtomicBoolean(false);
        this.s = new AtomicBoolean(false);
        this.t = new cfc(this, 0);
        this.u = new cfc(this, 1);
    }

    public final void g() {
        Executor executor;
        ((Set) this.m.b).add(this);
        Executor executor2 = null;
        boolean z = this.n;
        aec aec = this.l;
        if (!z ? (executor = aec.b) != null : (executor = aec.c) != null) {
            executor2 = executor;
        }
        executor2.execute(this.t);
    }

    public final void h() {
        ((Set) this.m.b).remove(this);
    }
}
