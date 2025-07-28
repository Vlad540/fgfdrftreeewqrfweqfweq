package defpackage;

/* renamed from: sz0  reason: default package */
public final class sz0 {
    public final /* synthetic */ int a;
    public final int b;
    public final long c;

    public /* synthetic */ sz0(long j, int i, int i2, boolean z) {
        this.a = i2;
        this.b = i;
        this.c = j;
    }

    public static sz0 b(q74 q74, yze yze) {
        q74.r(yze.a, 0, 8, false);
        yze.H(0);
        return new sz0(yze.m(), yze.h(), 7, false);
    }

    public static sz0 c(r74 r74, ija ija) {
        r74.r(ija.a, 0, 8, false);
        ija.G(0);
        return new sz0(ija.l(), ija.g(), 8, false);
    }

    public boolean a() {
        switch (this.a) {
            case 4:
                int i = this.b;
                return i == 0 || i == 1;
            default:
                int i2 = this.b;
                return i2 == 0 || i2 == 1;
        }
    }

    public sz0(int i, long j, boolean z) {
        this.a = 0;
        this.c = j;
        this.b = i;
    }

    public sz0(int i, int i2, long j) {
        this.a = i2;
        switch (i2) {
            case 3:
                oyb.d(j >= 0);
                this.b = i;
                this.c = j;
                return;
            default:
                swb.e(j >= 0);
                this.b = i;
                this.c = j;
                return;
        }
    }
}
