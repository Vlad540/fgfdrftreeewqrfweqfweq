package defpackage;

/* renamed from: yc1  reason: default package */
public final class yc1 extends zc1 {
    public final boolean a;

    public yc1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yc1) && this.a == ((yc1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("RaiseHand(isEnabled="), this.a, ")");
    }
}
