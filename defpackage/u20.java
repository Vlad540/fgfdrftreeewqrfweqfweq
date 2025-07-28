package defpackage;

import java.util.Set;

/* renamed from: u20  reason: default package */
public final class u20 {
    public static final u20 d;
    public final int a;
    public final int b;
    public final gt6 c;

    /* JADX WARNING: type inference failed for: r1v1, types: [ms6, ft6] */
    static {
        u20 u20;
        if (oze.a >= 33) {
            ? ms6 = new ms6(4);
            for (int i = 1; i <= 10; i++) {
                ms6.a(Integer.valueOf(oze.t(i)));
            }
            u20 = new u20(2, (Set) ms6.l());
        } else {
            u20 = new u20(2, 10);
        }
        d = u20;
    }

    public u20(int i, Set set) {
        this.a = i;
        gt6 j = gt6.j(set);
        this.c = j;
        rue g = j.iterator();
        int i2 = 0;
        while (g.hasNext()) {
            i2 = Math.max(i2, Integer.bitCount(((Integer) g.next()).intValue()));
        }
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u20)) {
            return false;
        }
        u20 u20 = (u20) obj;
        return this.a == u20.a && this.b == u20.b && oze.a(this.c, u20.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        gt6 gt6 = this.c;
        return i + (gt6 == null ? 0 : gt6.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.a + ", maxChannelCount=" + this.b + ", channelMasks=" + this.c + "]";
    }

    public u20(int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = null;
    }
}
