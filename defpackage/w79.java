package defpackage;

/* renamed from: w79  reason: default package */
public final class w79 {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public w79(int i, String str, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w79.class != obj.getClass()) {
            return false;
        }
        w79 w79 = (w79) obj;
        if (this.b == w79.b && this.c == w79.c && this.d == w79.d) {
            return this.a.equals(w79.a);
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }
}
