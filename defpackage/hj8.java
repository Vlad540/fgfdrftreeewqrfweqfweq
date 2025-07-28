package defpackage;

/* renamed from: hj8  reason: default package */
public final class hj8 implements kj8 {
    public final int a;

    public hj8(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hj8) && this.a == ((hj8) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("OnMemberListActionClicked(id="), this.a, ")");
    }
}
