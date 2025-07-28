package defpackage;

import java.util.ArrayList;

/* renamed from: w4  reason: default package */
public abstract class w4 {
    public final hnc a;

    public w4(hnc hnc) {
        this.a = hnc;
    }

    public ArrayList a(Class cls) {
        return this.a.c(cls);
    }

    public r7e b(Class cls) {
        hnc hnc = this.a;
        hnc.getClass();
        return new r7e(new pxa(hnc, 3, cls));
    }

    public Object c(Class cls) {
        return this.a.d(cls, true);
    }

    public r7e d(Class cls) {
        hnc hnc = this.a;
        hnc.getClass();
        return new r7e(new gnc(hnc, cls, true));
    }

    public Object e() {
        return this.a.d(tt6.class, false);
    }

    public r7e f() {
        hnc hnc = this.a;
        hnc.getClass();
        return new r7e(new gnc(hnc, tt6.class, false));
    }
}
