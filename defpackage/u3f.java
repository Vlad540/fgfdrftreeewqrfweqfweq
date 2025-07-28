package defpackage;

/* renamed from: u3f  reason: default package */
public final class u3f {
    public int a;
    public int b;
    public int c;
    public int d;
    public float e;
    public int f;
    public int g;
    public boolean h;

    public final v3f a() {
        boolean z = false;
        oyb.j("Bitrate can not be set if enabling high quality targeting.", !this.h || this.a == -1);
        if (!this.h || this.b == 1) {
            z = true;
        }
        oyb.j("Bitrate mode must be VBR if enabling high quality targeting.", z);
        return new v3f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final void b() {
        this.h = false;
    }

    public final void c(int i) {
        this.a = i;
    }

    public final void d() {
        this.c = -1;
        this.d = -1;
    }
}
