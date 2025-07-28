package defpackage;

/* renamed from: gs4  reason: default package */
public final class gs4 {
    public final l68 a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final long e;
    public final int f;
    public final qs4 g;

    public gs4(l68 l68, boolean z, boolean z2, boolean z3, long j, int i, qs4 qs4) {
        oyb.j("Audio and video cannot both be removed", !z || !z2);
        this.a = l68;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = j;
        this.f = i;
        this.g = qs4;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [fs4, java.lang.Object] */
    public final fs4 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.d;
        obj.e = this.e;
        obj.f = this.f;
        obj.g = this.g;
        return obj;
    }

    public final long b(long j) {
        long j2;
        boolean z = this.b;
        qs4 qs4 = this.g;
        if (z) {
            j2 = -9223372036854775807L;
        } else {
            po5 l = qs4.a.listIterator(0);
            j2 = j;
            while (l.hasNext()) {
                j2 = ((k50) l.next()).f(j2);
            }
        }
        if (this.c) {
            j = -9223372036854775807L;
        } else {
            po5 l2 = qs4.b.listIterator(0);
            while (l2.hasNext()) {
                ((uw7) l2.next()).getClass();
            }
        }
        return Math.max(j2, j);
    }
}
