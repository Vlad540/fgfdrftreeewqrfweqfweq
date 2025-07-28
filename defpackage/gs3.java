package defpackage;

/* renamed from: gs3  reason: default package */
public final class gs3 implements js3 {
    public final int a;

    public gs3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gs3) && this.a == ((gs3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("Seeking(progress="), this.a, ")");
    }
}
