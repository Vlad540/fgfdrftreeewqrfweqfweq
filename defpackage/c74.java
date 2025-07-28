package defpackage;

import java.util.ArrayDeque;

/* renamed from: c74  reason: default package */
public final class c74 {
    public final byte[] a;
    public final ArrayDeque b;
    public int c;
    public int d;
    public long e;
    public final Object f;
    public Object g;

    public c74(int i) {
        switch (i) {
            case 1:
                this.a = new byte[8];
                this.b = new ArrayDeque();
                this.f = new yze(1, false);
                return;
            default:
                this.a = new byte[8];
                this.b = new ArrayDeque();
                this.f = new yze(0, false);
                return;
        }
    }

    public long a(q74 q74, int i) {
        byte[] bArr = this.a;
        q74.i(bArr, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }

    public long b(r74 r74, int i) {
        byte[] bArr = this.a;
        r74.i(bArr, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | ((long) (bArr[i2] & 255));
        }
        return j;
    }
}
