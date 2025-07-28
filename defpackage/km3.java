package defpackage;

import java.io.Serializable;

/* renamed from: km3  reason: default package */
public final class km3 implements Serializable {
    public final String a;
    public final jm3 b;
    public final String c;

    public km3(String str, jm3 jm3, String str2) {
        this.a = str;
        this.b = jm3;
        this.c = str2;
    }

    public final String a() {
        jm3 jm3 = jm3.b;
        String str = this.a;
        jm3 jm32 = this.b;
        if (jm32 == jm3 || jm32 == jm3.a) {
            String str2 = this.c;
            if (r1g.q(str2)) {
                return me4.i(str, " ", str2);
            }
        }
        return str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{firstName='");
        sb.append(this.a);
        sb.append("', type=");
        sb.append(this.b);
        sb.append("', lastName=");
        return wn6.l(sb, this.c, "}");
    }
}
