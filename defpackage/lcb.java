package defpackage;

/* renamed from: lcb  reason: default package */
public final class lcb extends mcb {
    public final CharSequence a;

    public lcb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lcb) && hhd.f(this.a, ((lcb) obj).a);
    }

    public final long getItemId() {
        return (long) 16;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int l() {
        return 16;
    }

    public final String toString() {
        return "Phone(text=" + this.a + ")";
    }
}
