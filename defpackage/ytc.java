package defpackage;

/* renamed from: ytc  reason: default package */
public final class ytc {
    public static final ytc c = new ytc(0, 0);
    public final long a;
    public final long b;

    public ytc(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ytc.class != obj.getClass()) {
            return false;
        }
        ytc ytc = (ytc) obj;
        return this.a == ytc.a && this.b == ytc.b;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return wn6.k(sb, this.b, "]");
    }
}
