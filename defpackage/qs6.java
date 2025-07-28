package defpackage;

import java.util.Arrays;

/* renamed from: qs6  reason: default package */
public final class qs6 extends n1 implements uze {
    public final byte a;
    public final byte[] b;

    public qs6(byte b2, byte[] bArr) {
        this.a = b2;
        this.b = bArr;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder("[");
        sb.append(Byte.toString(this.a));
        sb.append(",\"");
        for (byte num : this.b) {
            sb.append(Integer.toString(num, 16));
        }
        sb.append("\"]");
        return sb.toString();
    }

    public final int e() {
        return 9;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uze)) {
            return false;
        }
        uze uze = (uze) obj;
        int e = ((n1) uze).e();
        if (e == 0) {
            throw null;
        } else if (e != 9) {
            return false;
        } else {
            qs6 n = uze.n();
            return this.a == n.a && Arrays.equals(this.b, n.b);
        }
    }

    public final int hashCode() {
        int i = this.a + 31;
        for (byte b2 : this.b) {
            i = (i * 31) + b2;
        }
        return i;
    }

    public final qs6 n() {
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(Byte.toString(this.a));
        sb.append(",0x");
        for (byte num : this.b) {
            sb.append(Integer.toString(num, 16));
        }
        sb.append(")");
        return sb.toString();
    }

    public final qs6 u() {
        return this;
    }
}
