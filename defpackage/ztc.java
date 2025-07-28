package defpackage;

/* renamed from: ztc  reason: default package */
public final class ztc {
    public static final ztc c = new ztc(0, 0);
    public final long a;
    public final long b;

    public ztc(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ztc.class != obj.getClass()) {
            return false;
        }
        ztc ztc = (ztc) obj;
        return this.a == ztc.a && this.b == ztc.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return wn6.k(sb, this.b, "]");
    }
}
