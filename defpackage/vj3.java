package defpackage;

/* renamed from: vj3  reason: default package */
public final class vj3 extends lbe {
    public final uj3 c;

    public vj3(uj3 uj3) {
        this.c = uj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vj3) && hhd.f(this.c, ((vj3) obj).c);
    }

    public final int hashCode() {
        uj3 uj3 = this.c;
        if (uj3 == null) {
            return 0;
        }
        return uj3.hashCode();
    }

    public final String toString() {
        return "CONTACT_INFO_BY_PHONE.Response(contact=" + String.valueOf(this.c) + ')';
    }
}
