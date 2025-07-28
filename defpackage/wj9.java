package defpackage;

/* renamed from: wj9  reason: default package */
public final class wj9 implements bk9 {
    public final int b;

    public wj9(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wj9) && this.b == ((wj9) obj).b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("Auto(brightnessThreshold="), this.b, ")");
    }
}
