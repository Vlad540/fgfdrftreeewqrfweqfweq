package defpackage;

/* renamed from: fx8  reason: default package */
public final class fx8 implements hx8 {
    public final int a;

    public fx8(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fx8) && this.a == ((fx8) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return wn6.j(new StringBuilder("ProcessClickMultiSelect(actionId="), this.a, ")");
    }
}
