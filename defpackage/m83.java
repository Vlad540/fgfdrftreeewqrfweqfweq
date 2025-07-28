package defpackage;

/* renamed from: m83  reason: default package */
public final class m83 extends xp0 {
    public final r57 c;
    public int o;

    public m83(og0 og0, r57 r57) {
        super(og0);
        this.c = r57;
    }

    public final void j() {
        this.a = true;
        this.o++;
    }

    public final void o() {
        this.a = false;
        v("\n");
        int i = this.o;
        for (int i2 = 0; i2 < i; i2++) {
            v(this.c.a.g);
        }
    }

    public final void q() {
        if (this.a) {
            this.a = false;
        } else {
            o();
        }
    }

    public final void y() {
        u(' ');
    }

    public final void z() {
        this.o--;
    }
}
