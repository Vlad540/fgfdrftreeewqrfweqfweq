package defpackage;

import java.util.Arrays;

/* renamed from: cx4  reason: default package */
public final class cx4 {
    public final cy4 a;
    public final byte[] b;

    public cx4(cy4 cy4, byte[] bArr) {
        if (cy4 == null) {
            throw new NullPointerException("encoding is null");
        } else if (bArr != null) {
            this.a = cy4;
            this.b = bArr;
        } else {
            throw new NullPointerException("bytes is null");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cx4)) {
            return false;
        }
        cx4 cx4 = (cx4) obj;
        if (!this.a.equals(cx4.a)) {
            return false;
        }
        return Arrays.equals(this.b, cx4.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
