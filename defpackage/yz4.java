package defpackage;

/* renamed from: yz4  reason: default package */
public final class yz4 {
    public static final uz4 Companion = new Object();
    public final String a;
    public final xz4 b;

    public /* synthetic */ yz4(int i, String str, xz4 xz4) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = xz4;
            return;
        }
        bm3.I(i, 3, tz4.a.d());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yz4)) {
            return false;
        }
        yz4 yz4 = (yz4) obj;
        return hhd.f(this.a, yz4.a) && hhd.f(this.b, yz4.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ErrorResponse(requestId=" + this.a + ", error=" + this.b + ")";
    }

    public yz4(String str, xz4 xz4) {
        this.a = str;
        this.b = xz4;
    }
}
