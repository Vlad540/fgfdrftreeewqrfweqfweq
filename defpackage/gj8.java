package defpackage;

/* renamed from: gj8  reason: default package */
public final class gj8 implements kj8 {
    public final long a;

    public gj8(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gj8) && this.a == ((gj8) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return wn6.k(new StringBuilder("OnMemberClicked(id="), this.a, ")");
    }
}
