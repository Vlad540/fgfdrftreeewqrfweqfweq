package defpackage;

import java.util.Arrays;

/* renamed from: h50  reason: default package */
public final class h50 {
    public static final h50 e = new h50(-1, -1, -1);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public h50(xu5 xu5) {
        this(xu5.C, xu5.B, xu5.D);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h50)) {
            return false;
        }
        h50 h50 = (h50) obj;
        return this.a == h50.a && this.b == h50.b && this.c == h50.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioFormat[sampleRate=");
        sb.append(this.a);
        sb.append(", channelCount=");
        sb.append(this.b);
        sb.append(", encoding=");
        return hr1.h(sb, this.c, ']');
    }

    public h50(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = oze.L(i3) ? oze.D(i3, i2) : -1;
    }
}
