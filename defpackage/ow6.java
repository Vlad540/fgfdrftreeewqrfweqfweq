package defpackage;

/* renamed from: ow6  reason: default package */
public final class ow6 extends gr8 {
    public int a = 0;

    public ow6() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        if (i != 0) {
            return o13.n(1, i);
        }
        return 0;
    }

    public final gr8 mergeFrom(n13 n13) {
        while (true) {
            int s = n13.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                this.a = n13.p();
            } else if (!n13.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(o13 o13) {
        int i = this.a;
        if (i != 0) {
            o13.G(1, i);
        }
    }
}
