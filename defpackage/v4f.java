package defpackage;

/* renamed from: v4f  reason: default package */
public final class v4f {
    public final lhd a;
    public final n4f b;
    public final p7 c = new p7(10);
    public final mje d = new mje(1);
    public final mje e = new mje(1);
    public final xx f = new xx(4, (byte) 0);
    public r8f g;
    public r8f h = r8f.e;
    public long i;
    public long j = -9223372036854775807L;

    public v4f(lhd lhd, n4f n4f) {
        this.a = lhd;
        this.b = n4f;
    }

    public final void a() {
        xx xxVar = this.f;
        boolean z = false;
        xxVar.b = 0;
        xxVar.c = -1;
        xxVar.o = 0;
        this.j = -9223372036854775807L;
        mje mje = this.e;
        if (mje.h() > 0) {
            oyb.d(mje.h() > 0);
            while (mje.h() > 1) {
                mje.e();
            }
            Object e2 = mje.e();
            e2.getClass();
            mje.a(0, (Long) e2);
        }
        r8f r8f = this.g;
        mje mje2 = this.d;
        if (r8f != null) {
            mje2.b();
        } else if (mje2.h() > 0) {
            if (mje2.h() > 0) {
                z = true;
            }
            oyb.d(z);
            while (mje2.h() > 1) {
                mje2.e();
            }
            Object e3 = mje2.e();
            e3.getClass();
            this.g = (r8f) e3;
        }
    }
}
