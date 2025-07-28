package defpackage;

import java.io.File;

/* renamed from: oy  reason: default package */
public abstract class oy {
    public final o10 a;
    public volatile boolean b;

    public oy(o10 o10) {
        this.a = o10;
    }

    public abstract void a();

    public final void b(vw vwVar, Throwable th) {
        if (vwVar != null) {
            vwVar.onError(th);
        }
        this.b = true;
    }

    public void c(vw vwVar, File file) {
        if (!this.b) {
            vwVar.c(file);
            vwVar.b();
        }
    }

    public ms9 d() {
        String str = this.a.r;
        if (lp.o(str)) {
            return ms9.m(new File(str));
        }
        return null;
    }
}
