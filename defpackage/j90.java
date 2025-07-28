package defpackage;

/* renamed from: j90  reason: default package */
public final class j90 {
    public static final j90 f = new j90(200, 10000, 10485760, 604800000, 81920);
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public j90(int i, int i2, long j, long j2, int i3) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j90)) {
            return false;
        }
        j90 j90 = (j90) obj;
        return this.a == j90.a && this.b == j90.b && this.c == j90.c && this.d == j90.d && this.e == j90.e;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.d;
        return this.e ^ ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.a);
        sb.append(", loadBatchSize=");
        sb.append(this.b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.d);
        sb.append(", maxBlobByteSizePerRow=");
        return wn6.j(sb, this.e, "}");
    }
}
