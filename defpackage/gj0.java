package defpackage;

import java.util.Arrays;

/* renamed from: gj0  reason: default package */
public final class gj0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public gj0(String str, int i, int i2, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gj0)) {
            return false;
        }
        gj0 gj0 = (gj0) obj;
        return this.c == gj0.c && this.d == gj0.d && am7.j(this.a, gj0.a) && am7.j(this.b, gj0.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }
}
