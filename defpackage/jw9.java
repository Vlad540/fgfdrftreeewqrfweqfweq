package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.io.EOFException;

/* renamed from: jw9  reason: default package */
public final class jw9 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f;
    public final Object g;

    public jw9(int i) {
        switch (i) {
            case 1:
                this.f = new int[255];
                this.g = new ija(255);
                return;
            default:
                this.f = new int[255];
                this.g = new yze(255);
                return;
        }
    }

    public boolean a(q74 q74, boolean z) {
        boolean z2;
        boolean z3;
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        yze yze = (yze) this.g;
        yze.E(27);
        try {
            z2 = q74.r(yze.a, 0, 27, z);
        } catch (EOFException e2) {
            if (z) {
                z2 = false;
            } else {
                throw e2;
            }
        }
        if (!z2 || yze.w() != 1332176723) {
            return false;
        }
        if (yze.v() == 0) {
            this.a = yze.v();
            this.b = yze.k();
            yze.m();
            yze.m();
            yze.m();
            int v = yze.v();
            this.c = v;
            this.d = v + 27;
            yze.E(v);
            try {
                z3 = q74.r(yze.a, 0, this.c, z);
            } catch (EOFException e3) {
                if (z) {
                    z3 = false;
                } else {
                    throw e3;
                }
            }
            if (!z3) {
                return false;
            }
            for (int i = 0; i < this.c; i++) {
                int v2 = yze.v();
                this.f[i] = v2;
                this.e += v2;
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw ParserException.c("unsupported bit stream revision");
        }
    }

    public boolean b(r74 r74, boolean z) {
        boolean z2;
        boolean z3;
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        ija ija = (ija) this.g;
        ija.D(27);
        try {
            z2 = r74.r(ija.a, 0, 27, z);
        } catch (EOFException e2) {
            if (z) {
                z2 = false;
            } else {
                throw e2;
            }
        }
        if (!z2 || ija.w() != 1332176723) {
            return false;
        }
        if (ija.u() == 0) {
            this.a = ija.u();
            this.b = ija.j();
            ija.l();
            ija.l();
            ija.l();
            int u = ija.u();
            this.c = u;
            this.d = u + 27;
            ija.D(u);
            try {
                z3 = r74.r(ija.a, 0, this.c, z);
            } catch (EOFException e3) {
                if (z) {
                    z3 = false;
                } else {
                    throw e3;
                }
            }
            if (!z3) {
                return false;
            }
            for (int i = 0; i < this.c; i++) {
                int u2 = ija.u();
                this.f[i] = u2;
                this.e += u2;
            }
            return true;
        } else if (z) {
            return false;
        } else {
            throw androidx.media3.common.ParserException.c("unsupported bit stream revision");
        }
    }

    public boolean c(q74 q74, long j) {
        int i;
        boolean z;
        swb.e(q74.o == q74.s());
        yze yze = (yze) this.g;
        yze.E(4);
        while (true) {
            i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if (i != 0 && q74.o + 4 >= j) {
                break;
            }
            try {
                z = q74.r(yze.a, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            yze.H(0);
            if (yze.w() == 1332176723) {
                q74.Y = 0;
                return true;
            }
            q74.z(1);
        }
        do {
            if ((i != 0 && q74.o >= j) || q74.f() == -1) {
                return false;
            }
            break;
        } while (q74.f() == -1);
        return false;
    }

    public boolean d(r74 r74, long j) {
        int i;
        boolean z;
        oyb.d(r74.o == r74.s());
        ija ija = (ija) this.g;
        ija.D(4);
        while (true) {
            i = (j > -1 ? 1 : (j == -1 ? 0 : -1));
            if (i != 0 && r74.o + 4 >= j) {
                break;
            }
            try {
                z = r74.r(ija.a, 0, 4, true);
            } catch (EOFException unused) {
                z = false;
            }
            if (!z) {
                break;
            }
            ija.G(0);
            if (ija.w() == 1332176723) {
                r74.Y = 0;
                return true;
            }
            r74.z(1);
        }
        do {
            if ((i != 0 && r74.o >= j) || r74.f(1) == -1) {
                return false;
            }
            break;
        } while (r74.f(1) == -1);
        return false;
    }
}
