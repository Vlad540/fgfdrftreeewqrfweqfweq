package defpackage;

/* renamed from: eo6  reason: default package */
public final class eo6 {
    public final int a;

    public eo6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo6)) {
            return false;
        }
        eo6 eo6 = (eo6) obj;
        eo6.getClass();
        return this.a == eo6.a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) + (Integer.hashCode(-16745729) * 31);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("IconLocalTabbarColors(active=-16745729, inactive="), this.a, ")");
    }
}
