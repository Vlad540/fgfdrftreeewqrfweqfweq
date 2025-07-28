package defpackage;

/* renamed from: sg3  reason: default package */
public final class sg3 implements ug3 {
    public final int a;

    public sg3(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sg3) && this.a == ((sg3) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("ShowPhoto(index="), this.a, ")");
    }
}
