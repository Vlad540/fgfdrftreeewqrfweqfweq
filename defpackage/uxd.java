package defpackage;

/* renamed from: uxd  reason: default package */
public final class uxd {
    public final long a;
    public final int b;
    public final int c;

    public uxd(long j, int i, int i2, int i3) {
        j = (i3 & 1) != 0 ? 0 : j;
        i = (i3 & 2) != 0 ? -1 : i;
        i2 = (i3 & 4) != 0 ? -1 : i2;
        this.a = j;
        this.b = i;
        this.c = i2;
    }
}
