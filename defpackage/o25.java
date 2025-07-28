package defpackage;

/* renamed from: o25  reason: default package */
public final class o25 {
    public int a;
    public int b;
    public int c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o25.class != obj.getClass()) {
            return false;
        }
        o25 o25 = (o25) obj;
        if (this.a == o25.a && this.b == o25.b) {
            return this.c == o25.c;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}
