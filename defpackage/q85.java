package defpackage;

import java.util.HashMap;

/* renamed from: q85  reason: default package */
public final class q85 extends ijc {
    public final HashMap X = new HashMap();

    public final fjc a(Object obj) {
        return (fjc) this.X.get(obj);
    }

    public final Object b(Object obj, Object obj2) {
        fjc a = a(obj);
        if (a != null) {
            return a.b;
        }
        HashMap hashMap = this.X;
        fjc fjc = new fjc(obj, obj2);
        this.o++;
        fjc fjc2 = this.b;
        if (fjc2 == null) {
            this.a = fjc;
            this.b = fjc;
        } else {
            fjc2.c = fjc;
            fjc.o = fjc2;
            this.b = fjc;
        }
        hashMap.put(obj, fjc);
        return null;
    }

    public final Object c(Object obj) {
        Object c = super.c(obj);
        this.X.remove(obj);
        return c;
    }
}
