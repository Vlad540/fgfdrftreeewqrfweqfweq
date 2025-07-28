package defpackage;

/* renamed from: hn1  reason: default package */
public final class hn1 {
    public final boolean a;

    public hn1(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hn1) && this.a == ((hn1) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("PromotionApproved(approved="), this.a, ")");
    }
}
