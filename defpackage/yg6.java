package defpackage;

/* renamed from: yg6  reason: default package */
public final class yg6 extends dh6 {
    public final int a;

    public yg6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yg6) && this.a == ((yg6) obj).a;
    }

    public final int hashCode() {
        return hr1.t(this.a);
    }

    public final String toString() {
        return "CallType(callMediaType=" + me4.s(this.a) + ")";
    }
}
