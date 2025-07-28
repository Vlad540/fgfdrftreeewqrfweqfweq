package defpackage;

/* renamed from: is3  reason: default package */
public final class is3 implements js3 {
    public final int a;

    public is3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof is3) && this.a == ((is3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("StopSeekPlayerProgress(progress="), this.a, ")");
    }
}
