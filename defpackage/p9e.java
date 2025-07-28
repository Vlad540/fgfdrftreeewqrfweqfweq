package defpackage;

/* renamed from: p9e  reason: default package */
public final class p9e implements Comparable {
    public final int a;
    public final int b;
    public final String c;
    public final String o;

    public p9e(String str, int i, int i2, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.o = str2;
    }

    public final int compareTo(Object obj) {
        p9e p9e = (p9e) obj;
        int i = this.a - p9e.a;
        return i == 0 ? this.b - p9e.b : i;
    }
}
