package defpackage;

/* renamed from: uh8  reason: default package */
public final class uh8 implements cw9 {
    public final yh7 a;
    public final cw9 b;
    public int c = -1;

    public uh8(yh7 yh7, cw9 cw9) {
        this.a = yh7;
        this.b = cw9;
    }

    public final void a(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.a(obj);
        }
    }

    public final void b() {
        this.a.f(this);
    }
}
