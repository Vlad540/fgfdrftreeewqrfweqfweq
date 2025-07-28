package defpackage;

import java.util.Arrays;

/* renamed from: hnf  reason: default package */
public final class hnf {
    public final byte[] a;
    public final String b;
    public final String c;

    public hnf(String str, String str2, byte[] bArr) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnf)) {
            return false;
        }
        hnf hnf = (hnf) obj;
        return hhd.f(this.a, hnf.a) && hhd.f(this.b, hnf.b) && hhd.f(this.c, hnf.c);
    }

    public final int hashCode() {
        int i = 0;
        byte[] bArr = this.a;
        int hashCode = (bArr == null ? 0 : Arrays.hashCode(bArr)) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder m = hr1.m("WebAppShareFileInfo(file=", Arrays.toString(this.a), ", fileName=");
        m.append(this.b);
        m.append(", fileMimeType=");
        return wn6.l(m, this.c, ")");
    }
}
