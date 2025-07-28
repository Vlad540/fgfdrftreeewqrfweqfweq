package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: m0  reason: default package */
public final class m0 implements o3e {
    public final /* synthetic */ gn4 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ n0 f;

    public m0(n0 n0Var, xwa xwa, String str, Object obj, Object obj2, int i) {
        this.f = n0Var;
        this.a = xwa;
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.e = i;
    }

    public final Object get() {
        sr6 sr6;
        n0 n0Var = this.f;
        gn4 gn4 = this.a;
        String str = this.b;
        Object obj = this.c;
        Object obj2 = this.d;
        int i = this.e;
        ywa ywa = (ywa) n0Var;
        ywa.getClass();
        tr6 tr6 = (tr6) obj;
        fr6 fr6 = ywa.p;
        int t = hr1.t(i);
        if (t == 0) {
            sr6 = sr6.FULL_FETCH;
        } else if (t == 1) {
            sr6 = sr6.DISK_CACHE;
        } else if (t == 2) {
            sr6 = sr6.BITMAP_MEMORY_CACHE;
        } else {
            StringBuilder sb = new StringBuilder("Cache level");
            sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "BITMAP_MEMORY_CACHE" : "DISK_CACHE" : "FULL_FETCH");
            sb.append("is not supported. ");
            throw new RuntimeException(sb.toString());
        }
        sr6 sr62 = sr6;
        xw5 xw5 = null;
        if (gn4 instanceof xwa) {
            xwa xwa = (xwa) gn4;
            synchronized (xwa) {
                HashSet hashSet = xwa.G;
                if (hashSet != null) {
                    xw5 = new xw5((Set) hashSet);
                }
            }
        }
        return fr6.b(tr6, obj2, sr62, xw5, str);
    }

    public final String toString() {
        jg8 X = at7.X(this);
        X.h(this.c.toString(), "request");
        return X.toString();
    }
}
