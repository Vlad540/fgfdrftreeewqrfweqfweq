package defpackage;

/* renamed from: wc0  reason: default package */
public class wc0 implements vtc {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public /* synthetic */ wc0(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    public final ttc e(long j) {
        switch (this.a) {
            case 0:
                xc0 xc0 = (xc0) this.c;
                ttc b2 = xc0.x0[0].b(j);
                int i = 1;
                while (true) {
                    dy2[] dy2Arr = xc0.x0;
                    if (i >= dy2Arr.length) {
                        return b2;
                    }
                    ttc b3 = dy2Arr[i].b(j);
                    if (b3.a.b < b2.a.b) {
                        b2 = b3;
                    }
                    i++;
                }
            case 1:
                ti5 ti5 = (ti5) this.c;
                oyb.l((afc) ti5.l);
                afc afc = (afc) ti5.l;
                long[] jArr = (long[]) afc.a;
                int f = oze.f(jArr, oze.k((((long) ti5.f) * j) / 1000000, 0, ti5.k - 1), false);
                long j2 = 0;
                long j3 = f == -1 ? 0 : jArr[f];
                long[] jArr2 = (long[]) afc.b;
                if (f != -1) {
                    j2 = jArr2[f];
                }
                int i2 = ti5.f;
                long j4 = (j3 * 1000000) / ((long) i2);
                long j5 = this.b;
                ztc ztc = new ztc(j4, j2 + j5);
                if (j4 == j || f == jArr.length - 1) {
                    return new ttc(ztc, ztc);
                }
                int i3 = f + 1;
                return new ttc(ztc, new ztc((jArr[i3] * 1000000) / ((long) i2), j5 + jArr2[i3]));
            default:
                return (ttc) this.c;
        }
    }

    public final long f() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((ti5) this.c).c();
            default:
                return this.b;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public wc0(long j) {
        this(j, 0);
        this.a = 2;
    }

    public wc0(long j, long j2) {
        this.a = 2;
        this.b = j;
        ztc ztc = j2 == 0 ? ztc.c : new ztc(0, j2);
        this.c = new ttc(ztc, ztc);
    }
}
