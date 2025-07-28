package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.nio.ByteBuffer;

/* renamed from: iw9  reason: default package */
public final class iw9 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public boolean d;
    public final Object e;
    public final Object f;

    public iw9(nxf nxf, qwf qwf) {
        this.a = 2;
        this.f = nxf;
        this.b = qwf.c;
        this.d |= (qwf.a & 4) != 0;
        if ((qwf.a & 4) != 0) {
            this.e = new ByteArrayOutputStream(600000);
        } else {
            this.e = new ByteArrayOutputStream(34000);
        }
        while (true) {
            ByteBuffer byteBuffer = qwf.e;
            int min = Math.min(byteBuffer.remaining(), ((nxf) this.f).c.length);
            if (min == 0) {
                this.c = 1;
                return;
            } else {
                byteBuffer.get(((nxf) this.f).c, 0, min);
                ((ByteArrayOutputStream) this.e).write(((nxf) this.f).c, 0, min);
            }
        }
    }

    public int a(int i) {
        int i2;
        int i3;
        switch (this.a) {
            case 0:
                int i4 = 0;
                this.c = 0;
                do {
                    int i5 = this.c;
                    int i6 = i + i5;
                    jw9 jw9 = (jw9) this.e;
                    if (i6 < jw9.c) {
                        int[] iArr = jw9.f;
                        this.c = i5 + 1;
                        i2 = iArr[i5 + i];
                        i4 += i2;
                    }
                    return i4;
                } while (i2 == 255);
                return i4;
            default:
                int i7 = 0;
                this.c = 0;
                do {
                    int i8 = this.c;
                    int i9 = i + i8;
                    jw9 jw92 = (jw9) this.e;
                    if (i9 < jw92.c) {
                        int[] iArr2 = jw92.f;
                        this.c = i8 + 1;
                        i3 = iArr2[i8 + i];
                        i7 += i3;
                    }
                    return i7;
                } while (i3 == 255);
                return i7;
        }
    }

    public boolean b(q74 q74) {
        int i;
        swb.h(q74 != null);
        boolean z = this.d;
        yze yze = (yze) this.f;
        if (z) {
            this.d = false;
            yze.E(0);
        }
        while (!this.d) {
            int i2 = this.b;
            jw9 jw9 = (jw9) this.e;
            if (i2 < 0) {
                if (jw9.c(q74, -1) && jw9.a(q74, true)) {
                    int i3 = jw9.d;
                    if ((jw9.a & 1) == 1 && yze.c == 0) {
                        i3 += a(0);
                        i = this.c;
                    } else {
                        i = 0;
                    }
                    try {
                        q74.z(i3);
                        this.b = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.b);
            int i4 = this.b + this.c;
            if (a2 > 0) {
                yze.d(yze.c + a2);
                try {
                    q74.i(yze.a, yze.c, a2, false);
                    yze.G(yze.c + a2);
                    this.d = jw9.f[i4 + -1] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i4 == jw9.c) {
                i4 = -1;
            }
            this.b = i4;
        }
        return true;
    }

    public boolean c(r74 r74) {
        int i;
        oyb.k(r74 != null);
        boolean z = this.d;
        ija ija = (ija) this.f;
        if (z) {
            this.d = false;
            ija.D(0);
        }
        while (!this.d) {
            int i2 = this.b;
            jw9 jw9 = (jw9) this.e;
            if (i2 < 0) {
                if (jw9.d(r74, -1) && jw9.b(r74, true)) {
                    int i3 = jw9.d;
                    if ((jw9.a & 1) == 1 && ija.c == 0) {
                        i3 += a(0);
                        i = this.c;
                    } else {
                        i = 0;
                    }
                    try {
                        r74.z(i3);
                        this.b = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a2 = a(this.b);
            int i4 = this.b + this.c;
            if (a2 > 0) {
                ija.b(ija.c + a2);
                try {
                    r74.i(ija.a, ija.c, a2, false);
                    ija.F(ija.c + a2);
                    this.d = jw9.f[i4 + -1] != 255;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i4 == jw9.c) {
                i4 = -1;
            }
            this.b = i4;
        }
        return true;
    }

    public iw9(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.e = new jw9(1);
                this.f = new ija(0, new byte[65025]);
                this.b = -1;
                return;
            default:
                this.e = new jw9(0);
                this.f = new yze(0, new byte[65025]);
                this.b = -1;
                return;
        }
    }
}
