package defpackage;

/* renamed from: v3  reason: default package */
public final class v3 implements d75 {
    public final t3 a = new t3((String) null, 1);
    public final yze b = new yze(16384);
    public boolean c;

    public final void d(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    public final void g(h75 h75) {
        this.a.l(h75, new pse(0, 1, 0, (byte) 0));
        h75.w();
        h75.K(new si5(-9223372036854775807L));
    }

    public final boolean h(f75 f75) {
        q74 q74;
        int i;
        yze yze = new yze(10);
        int i2 = 0;
        while (true) {
            q74 = (q74) f75;
            q74.r(yze.a, 0, 10, false);
            yze.H(0);
            if (yze.x() != 4801587) {
                break;
            }
            yze.I(3);
            int u = yze.u();
            i2 += u + 10;
            q74.b(u, false);
        }
        q74.Y = 0;
        q74.b(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            q74.r(yze.a, 0, 7, false);
            yze.H(0);
            int A = yze.A();
            if (A == 44096 || A == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = yze.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    byte b2 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (b2 == 65535) {
                        b2 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (A == 44097) {
                        i5 += 2;
                    }
                    i = b2 + i5;
                }
                if (i == -1) {
                    return false;
                }
                q74.b(i - 7, false);
            } else {
                q74.Y = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                q74.b(i4, false);
                i3 = 0;
            }
        }
    }

    public final int i(f75 f75, le4 le4) {
        yze yze = this.b;
        int read = ((q74) f75).read(yze.a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        yze.H(0);
        yze.G(read);
        boolean z = this.c;
        t3 t3Var = this.a;
        if (!z) {
            t3Var.h(4, 0);
            this.c = true;
        }
        t3Var.g(yze);
        return 0;
    }

    public final void release() {
    }
}
