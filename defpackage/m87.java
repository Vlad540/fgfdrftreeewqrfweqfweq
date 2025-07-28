package defpackage;

/* renamed from: m87  reason: default package */
public final class m87 {
    public final int a;

    public m87(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m87) && this.a == ((m87) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("StateConfig(titleTextColor="), this.a, ")");
    }
}
