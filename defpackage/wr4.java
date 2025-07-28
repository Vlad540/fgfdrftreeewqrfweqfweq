package defpackage;

import java.util.List;

/* renamed from: wr4  reason: default package */
public final class wr4 {
    public final to8 a;
    public final t52 b;
    public final n1b c;
    public final tt0 d;
    public final f03 e;

    public wr4(to8 to8, t52 t52, n1b n1b, tt0 tt0, f03 f03) {
        this.a = to8;
        this.b = t52;
        this.c = n1b;
        this.d = tt0;
        this.e = f03;
    }

    public final void a(long j, long j2, String str, List list, ls8 ls8, List list2, boolean z) {
        long j3;
        long j4 = j;
        long j5 = j2;
        this.c.c.remove(Long.valueOf(j));
        s16 s16 = r0;
        s16 vr4 = new vr4(this, j, ((lqc) this.e).m(), z, list2, str, list, ls8);
        to8 to8 = this.a;
        ((hz3) to8.a).c.a.m().p(new wdc(1, s16));
        t52 t52 = this.b;
        i22 B = t52.B(j5);
        if (B != null) {
            j3 = j;
            if (B.b.j == j3) {
                t52.k0(j5, to8.q(j3), true);
            }
        } else {
            j3 = j;
        }
        if (!(B == null || B.b.L != j3 || to8.q(j3) == null)) {
            t52.o0(j5);
        }
        this.d.c(new ove(j2, j, 0));
    }
}
