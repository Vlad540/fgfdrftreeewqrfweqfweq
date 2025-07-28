package defpackage;

/* renamed from: sx  reason: default package */
public final class sx {
    public final /* synthetic */ int a = 1;
    public final int b;
    public int c;
    public int d;
    public long e;
    public final boolean f;
    public int g;
    public int h;
    public final Object i;
    public final Object j;

    public sx(yze yze, yze yze2, boolean z) {
        this.j = yze;
        this.i = yze2;
        this.f = z;
        yze2.H(12);
        this.b = yze2.y();
        yze.H(12);
        this.h = yze.y();
        swb.f("first_chunk must be 1", yze.h() != 1 ? false : true);
        this.c = -1;
    }

    public final boolean a() {
        switch (this.a) {
            case 0:
                int i2 = this.c + 1;
                this.c = i2;
                if (i2 == this.b) {
                    return false;
                }
                boolean z = this.f;
                yze yze = (yze) this.i;
                this.e = z ? yze.z() : yze.w();
                if (this.c != this.g) {
                    return true;
                }
                yze yze2 = (yze) this.j;
                this.d = yze2.y();
                yze2.I(4);
                int i3 = this.h - 1;
                this.h = i3;
                this.g = i3 > 0 ? yze2.y() - 1 : -1;
                return true;
            default:
                int i4 = this.c + 1;
                this.c = i4;
                if (i4 == this.b) {
                    return false;
                }
                boolean z2 = this.f;
                ija ija = (ija) this.i;
                this.e = z2 ? ija.z() : ija.w();
                if (this.c != this.g) {
                    return true;
                }
                ija ija2 = (ija) this.j;
                this.d = ija2.y();
                ija2.H(4);
                int i5 = this.h - 1;
                this.h = i5;
                this.g = i5 > 0 ? ija2.y() - 1 : -1;
                return true;
        }
    }

    public sx(ija ija, ija ija2, boolean z) {
        this.j = ija;
        this.i = ija2;
        this.f = z;
        ija2.G(12);
        this.b = ija2.y();
        ija.G(12);
        this.h = ija.y();
        oyb.e("first_chunk must be 1", ija.g() != 1 ? false : true);
        this.c = -1;
    }
}
