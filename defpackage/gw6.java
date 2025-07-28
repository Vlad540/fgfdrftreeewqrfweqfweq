package defpackage;

import java.util.Arrays;

/* renamed from: gw6  reason: default package */
public final class gw6 extends gr8 {
    public byte[] a = iu7.o;

    public gw6() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        if (!Arrays.equals(this.a, iu7.o)) {
            return o13.b(1, this.a);
        }
        return 0;
    }

    public final gr8 mergeFrom(n13 n13) {
        while (true) {
            int s = n13.s();
            if (s == 0) {
                break;
            } else if (s == 10) {
                this.a = n13.g();
            } else if (!n13.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(o13 o13) {
        if (!Arrays.equals(this.a, iu7.o)) {
            o13.s(1, this.a);
        }
    }
}
