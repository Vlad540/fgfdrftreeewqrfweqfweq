package defpackage;

/* renamed from: uhb  reason: default package */
public final class uhb implements xze {
    public boolean a = false;
    public boolean b = false;
    public cc5 c;
    public final thb d;

    public uhb(thb thb) {
        this.d = thb;
    }

    public final xze b(String str) {
        if (!this.a) {
            this.a = true;
            this.d.c(this.c, str, this.b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }

    public final xze c(boolean z) {
        if (!this.a) {
            this.a = true;
            this.d.b(this.c, z ? 1 : 0, this.b);
            return this;
        }
        throw new RuntimeException("Cannot encode a second value in the ValueEncoderContext");
    }
}
