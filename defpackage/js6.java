package defpackage;

import java.util.Arrays;

/* renamed from: js6  reason: default package */
public final class js6 extends m1 implements is6 {
    public final int e() {
        return 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uze)) {
            return false;
        }
        uze uze = (uze) obj;
        int e = ((n1) uze).e();
        if (e == 0) {
            throw null;
        } else if (e != 6) {
            return false;
        } else {
            boolean z = uze instanceof js6;
            byte[] bArr = this.a;
            if (z) {
                return Arrays.equals(bArr, ((js6) uze).a);
            }
            byte[] bArr2 = ((m1) uze.o()).a;
            return Arrays.equals(bArr, Arrays.copyOf(bArr2, bArr2.length));
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final is6 o() {
        return this;
    }

    public final is6 s() {
        return this;
    }
}
