package defpackage;

/* renamed from: l1e  reason: default package */
public final class l1e implements Comparable {
    public final long a;
    public final byte[] b;

    public l1e(long j, byte[] bArr) {
        this.a = j;
        this.b = bArr;
    }

    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((l1e) obj).a);
    }
}
