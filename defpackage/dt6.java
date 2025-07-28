package defpackage;

/* renamed from: dt6  reason: default package */
public final class dt6 extends n1 implements uze {
    public static final dt6 a = new Object();

    public final String a() {
        return "null";
    }

    public final int e() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof uze)) {
            return false;
        }
        int e = ((n1) ((uze) obj)).e();
        if (e != 0) {
            return e == 1;
        }
        throw null;
    }

    public final int hashCode() {
        return 0;
    }

    public final String toString() {
        return "null";
    }
}
