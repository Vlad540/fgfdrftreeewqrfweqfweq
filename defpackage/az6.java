package defpackage;

/* renamed from: az6  reason: default package */
public final class az6 {
    public final long a;

    public /* synthetic */ az6(long j) {
        this.a = j;
    }

    public static long a(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof az6)) {
            return false;
        }
        return this.a == ((az6) obj).a;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        long j = this.a;
        sb.append((int) (j >> 32));
        sb.append(", ");
        return hr1.h(sb, (int) (j & 4294967295L), ')');
    }
}
