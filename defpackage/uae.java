package defpackage;

import java.io.Serializable;

/* renamed from: uae  reason: default package */
public class uae extends eae implements Serializable {
    public final dae X;
    public final String b;
    public final String c;
    public final String o;

    public uae(String str, String str2, String str3) {
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.X = new dae(me4.i(str, " ", str2), str3);
    }

    public String toString() {
        StringBuilder n = me4.n(getClass().getSimpleName(), "{error='");
        n.append(this.b);
        n.append("', message='");
        n.append(this.c);
        n.append("', localizedMessage='");
        return wn6.l(n, this.o, "'}");
    }
}
