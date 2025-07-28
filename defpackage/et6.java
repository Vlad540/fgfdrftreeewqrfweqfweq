package defpackage;

/* renamed from: et6  reason: default package */
public final class et6 implements tjb {
    public static final et6 d;
    public int a;
    public boolean b;
    public boolean c;

    /* JADX WARNING: type inference failed for: r0v0, types: [et6, java.lang.Object] */
    static {
        ? obj = new Object();
        obj.a = Integer.MAX_VALUE;
        obj.b = true;
        obj.c = true;
        d = obj;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof et6)) {
            return false;
        }
        et6 et6 = (et6) obj;
        return this.a == et6.a && this.b == et6.b && this.c == et6.c;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = (this.b ? 4194304 : 0) ^ this.a;
        if (this.c) {
            i = 8388608;
        }
        return i2 ^ i;
    }
}
