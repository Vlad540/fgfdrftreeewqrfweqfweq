package defpackage;

/* renamed from: rr4  reason: default package */
public final class rr4 implements es4 {
    public final String a;
    public final long b;
    public final CharSequence c;
    public final String d;
    public final r33 e;
    public final String f;
    public final int g;

    public rr4(String str, long j, CharSequence charSequence, String str2, r33 r33, String str3, int i) {
        this.a = str;
        this.b = j;
        this.c = charSequence;
        this.d = str2;
        this.e = r33;
        this.f = str3;
        this.g = i;
    }

    public static rr4 c(rr4 rr4, String str, r33 r33, String str2, int i) {
        if ((i & 8) != 0) {
            str = rr4.d;
        }
        String str3 = str;
        if ((i & 16) != 0) {
            r33 = rr4.e;
        }
        r33 r332 = r33;
        if ((i & 32) != 0) {
            str2 = rr4.f;
        }
        return new rr4(rr4.a, rr4.b, rr4.c, str3, r332, str2, rr4.g);
    }

    public final boolean a(es4 es4) {
        if (es4 == null || !(es4 instanceof rr4)) {
            return false;
        }
        rr4 rr4 = (rr4) es4;
        return !hhd.f(this.d, rr4.d) || !hhd.f(this.f, rr4.f) || this.g != rr4.g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0008, code lost:
        r3 = ((defpackage.rr4) r3).g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.es4 r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0011
            boolean r1 = r3 instanceof defpackage.rr4
            if (r1 != 0) goto L_0x0008
            goto L_0x0011
        L_0x0008:
            rr4 r3 = (defpackage.rr4) r3
            int r3 = r3.g
            int r2 = r2.g
            if (r2 == r3) goto L_0x0011
            r0 = 1
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr4.b(es4):boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rr4)) {
            return false;
        }
        rr4 rr4 = (rr4) obj;
        return hhd.f(this.a, rr4.a) && this.b == rr4.b && hhd.f(this.c, rr4.c) && hhd.f(this.d, rr4.d) && hhd.f(this.e, rr4.e) && hhd.f(this.f, rr4.f) && this.g == rr4.g;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int f2 = me4.f(this.c, sxe.m((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31);
        String str2 = this.d;
        int hashCode = (f2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        r33 r33 = this.e;
        int hashCode2 = (hashCode + (r33 == null ? 0 : r33.a.hashCode())) * 31;
        String str3 = this.f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hr1.t(this.g) + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EditChatProfileUiModel(avatarUrl=");
        sb.append(this.a);
        sb.append(", avatarSourceId=");
        sb.append(this.b);
        sb.append(", abbreviation=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", titleError=");
        sb.append(this.e);
        sb.append(", description=");
        sb.append(this.f);
        sb.append(", chatType=");
        int i = this.g;
        sb.append(i != 1 ? i != 2 ? "null" : "PRIVATE" : "PUBLIC");
        sb.append(")");
        return sb.toString();
    }
}
