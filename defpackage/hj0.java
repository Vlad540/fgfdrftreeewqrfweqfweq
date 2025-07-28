package defpackage;

import java.util.Arrays;

/* renamed from: hj0  reason: default package */
public final class hj0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public hj0(String str, int i, int i2, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj0)) {
            return false;
        }
        hj0 hj0 = (hj0) obj;
        return this.c == hj0.c && this.d == hj0.d && am7.j(this.a, hj0.a) && am7.j(this.b, hj0.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }
}
