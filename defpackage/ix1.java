package defpackage;

/* renamed from: ix1  reason: default package */
public final class ix1 implements jx1 {
    public final int X;
    public final long Y;
    public final long a;
    public final hud b;
    public final mge c;
    public final Integer o;

    public ix1(long j, hud hud) {
        this.a = j;
        this.b = hud;
        this.c = hud.b;
        this.o = hud.o;
        this.X = hud.x0;
        this.Y = hud.y0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix1)) {
            return false;
        }
        ix1 ix1 = (ix1) obj;
        return this.a == ix1.a && hhd.f(this.b, ix1.b);
    }

    public final long getItemId() {
        return this.Y;
    }

    public final mge getName() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final int l() {
        return this.X;
    }

    public final boolean r() {
        return this.b.Y == 1;
    }

    public final String toString() {
        return "StickerSet(setId=" + this.a + ", model=" + this.b + ")";
    }
}
