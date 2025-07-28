package defpackage;

/* renamed from: vy7  reason: default package */
public final class vy7 implements ez7 {
    public final boolean a;

    public vy7(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vy7) && this.a == ((vy7) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("Close(withClear="), this.a, ")");
    }
}
