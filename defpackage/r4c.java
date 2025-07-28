package defpackage;

import java.util.Arrays;

/* renamed from: r4c  reason: default package */
public final class r4c implements t4c {
    public final long a;
    public final byte[] b;

    public r4c(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4c)) {
            return false;
        }
        r4c r4c = (r4c) obj;
        return this.a == r4c.a && hhd.f(this.b, r4c.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b);
        return "AudioMsg(duration=" + this.a + ", wave=" + arrays + ")";
    }
}
