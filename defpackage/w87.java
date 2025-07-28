package defpackage;

/* renamed from: w87  reason: default package */
public final class w87 implements Comparable {
    public static final w87 b = new w87();
    public final int a = 131092;

    public final int compareTo(Object obj) {
        return this.a - ((w87) obj).a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        w87 w87 = obj instanceof w87 ? (w87) obj : null;
        if (w87 == null) {
            return false;
        }
        return this.a == w87.a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "2.0.20";
    }
}
