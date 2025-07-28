package defpackage;

/* renamed from: em2  reason: default package */
public final class em2 implements fm2 {
    public final long a;
    public final long b;
    public final String c;

    public em2(int i, long j, long j2, String str) {
        j = (i & 1) != 0 ? 0 : j;
        j2 = (i & 2) != 0 ? 0 : j2;
        str = (i & 4) != 0 ? null : str;
        this.a = j;
        this.b = j2;
        this.c = str;
    }
}
