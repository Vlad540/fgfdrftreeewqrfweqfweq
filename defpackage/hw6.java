package defpackage;

import java.util.Arrays;

/* renamed from: hw6  reason: default package */
public final class hw6 extends gr8 {
    public int a = 0;
    public byte[] b = iu7.o;

    public hw6() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        int n = i != 0 ? o13.n(1, i) : 0;
        return !Arrays.equals(this.b, iu7.o) ? n + o13.b(2, this.b) : n;
    }

    public final gr8 mergeFrom(n13 n13) {
        while (true) {
            int s = n13.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                this.a = n13.p();
            } else if (s == 18) {
                this.b = n13.g();
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
        if (!Arrays.equals(this.b, iu7.o)) {
            o13.s(2, this.b);
        }
    }
}
