package defpackage;

/* renamed from: ki6  reason: default package */
public abstract class ki6 implements Comparable {
    public final long X;
    public final xn4 Y;
    public final String Z;
    public final String a;
    public final ii6 b;
    public final long c;
    public final int o;
    public final String w0;
    public final long x0;
    public final long y0;
    public final boolean z0;

    public ki6(String str, ii6 ii6, long j, int i, long j2, xn4 xn4, String str2, String str3, long j3, long j4, boolean z) {
        this.a = str;
        this.b = ii6;
        this.c = j;
        this.o = i;
        this.X = j2;
        this.Y = xn4;
        this.Z = str2;
        this.w0 = str3;
        this.x0 = j3;
        this.y0 = j4;
        this.z0 = z;
    }

    public final int compareTo(Object obj) {
        Long l = (Long) obj;
        long longValue = l.longValue();
        long j = this.X;
        if (j > longValue) {
            return 1;
        }
        return j < l.longValue() ? -1 : 0;
    }
}
