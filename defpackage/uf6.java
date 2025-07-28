package defpackage;

/* renamed from: uf6  reason: default package */
public final class uf6 extends h05 {
    public final int a;

    public uf6(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uf6) && this.a == ((uf6) obj).a;
    }

    public final int hashCode() {
        return hr1.t(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HideErrorInputEvent(typeInput=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "TITLE" : "SURNAME" : "NAME");
        sb.append(")");
        return sb.toString();
    }
}
