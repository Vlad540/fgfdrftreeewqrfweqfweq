package defpackage;

/* renamed from: zx3  reason: default package */
public final class zx3 {
    public final String a;
    public final long b;
    public long c = 200;
    public long d;

    public zx3(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Command{seq:");
        sb.append(this.b);
        sb.append("|retry count:");
        sb.append(this.d);
        sb.append("|retry timeout:");
        sb.append(this.c);
        sb.append('|');
        return me4.l(sb, this.a, '}');
    }
}
