package defpackage;

/* renamed from: xld  reason: default package */
public final class xld implements Comparable {
    public final int a;
    public final int b;

    public xld(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int compareTo(Object obj) {
        return this.a - ((xld) obj).a;
    }
}
