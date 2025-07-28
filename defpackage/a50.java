package defpackage;

/* renamed from: a50  reason: default package */
public final class a50 {
    public static final a50 d = new Object().a();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public a50(z40 z40) {
        this.a = z40.a;
        this.b = z40.b;
        this.c = z40.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a50.class != obj.getClass()) {
            return false;
        }
        a50 a50 = (a50) obj;
        return this.a == a50.a && this.b == a50.b && this.c == a50.c;
    }

    public final int hashCode() {
        return ((this.a ? 1 : 0) << true) + ((this.b ? 1 : 0) << true) + (this.c ? 1 : 0);
    }
}
