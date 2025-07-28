package defpackage;

import java.util.Iterator;

/* renamed from: hp4  reason: default package */
public final class hp4 implements dyc, ip4 {
    public final /* synthetic */ int a;
    public final dyc b;
    public final int c;

    public hp4(dyc dyc, int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = dyc;
                this.c = i;
                if (i < 0) {
                    throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
                }
                return;
            default:
                this.b = dyc;
                this.c = i;
                if (i < 0) {
                    throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
                }
                return;
        }
    }

    public final dyc a(int i) {
        switch (this.a) {
            case 0:
                int i2 = this.c;
                int i3 = i2 + i;
                return i3 < 0 ? new hp4(this, i, 1) : new x0e(this.b, i2, i3);
            default:
                return i >= this.c ? this : new hp4(this.b, i, 1);
        }
    }

    public final dyc b(int i) {
        switch (this.a) {
            case 0:
                int i2 = this.c + i;
                return i2 < 0 ? new hp4(this, i, 0) : new hp4(this.b, i2, 0);
            default:
                int i3 = this.c;
                return i >= i3 ? pw4.a : new x0e(this.b, i, i3);
        }
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new gp4(this);
            default:
                return new gp4(this, (byte) 0);
        }
    }
}
