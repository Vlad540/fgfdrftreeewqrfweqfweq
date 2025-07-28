package defpackage;

/* renamed from: v88  reason: default package */
public class v88 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public v88(v88 v88) {
        this.a = v88.a;
        this.b = v88.b;
        this.c = v88.c;
        this.d = v88.d;
        this.e = v88.e;
    }

    public final boolean a() {
        return this.b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v88)) {
            return false;
        }
        v88 v88 = (v88) obj;
        return this.a.equals(v88.a) && this.b == v88.b && this.c == v88.c && this.d == v88.d && this.e == v88.e;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public v88(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }
}
