package defpackage;

import java.util.Arrays;

/* renamed from: u60  reason: default package */
public final class u60 implements nk {
    public static final u60 o;
    public final String a;
    public final boolean b;
    public final String c;

    /* JADX WARNING: type inference failed for: r0v0, types: [it4, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.b = Boolean.FALSE;
        o = new u60(obj);
    }

    public u60(it4 it4) {
        this.a = (String) it4.a;
        this.b = ((Boolean) it4.b).booleanValue();
        this.c = (String) it4.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u60)) {
            return false;
        }
        u60 u60 = (u60) obj;
        return x87.F(this.a, u60.a) && this.b == u60.b && x87.F(this.c, u60.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b), this.c});
    }
}
