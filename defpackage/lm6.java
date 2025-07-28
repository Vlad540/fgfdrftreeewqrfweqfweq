package defpackage;

import java.io.InputStreamReader;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.List;
import ru.ok.android.api.json.JsonSyntaxException;

/* renamed from: lm6  reason: default package */
public final class lm6 extends t1 {
    public static final byte[] x0 = {110, 117, 108, 108};
    public final MessageDigest X;
    public final jha Y;
    public int Z;
    public final OutputStream a;
    public final List b;
    public final String c;
    public final og0 o = new og0(18, (byte) 0);
    public boolean w0;

    /* JADX WARNING: type inference failed for: r5v1, types: [cp8] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public lm6(java.io.OutputStream r3, java.util.ArrayList r4, java.lang.String r5) {
        /*
            r2 = this;
            r2.<init>()
            r2.a = r3
            r2.b = r4
            r2.c = r5
            og0 r4 = new og0
            r0 = 18
            r1 = 0
            r4.<init>(r0, r1)
            r2.o = r4
            hye r4 = new hye
            r4.<init>(r3)
            if (r5 == 0) goto L_0x0030
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch:{ NoSuchAlgorithmException -> 0x0029 }
            r2.X = r3
            cp8 r5 = new cp8
            r5.<init>(r4, r3)
            r4 = r5
            goto L_0x0034
        L_0x0029:
            r2 = move-exception
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>(r2)
            throw r3
        L_0x0030:
            cl9 r3 = defpackage.cl9.a
            r2.X = r3
        L_0x0034:
            jha r3 = new jha
            r3.<init>(r4)
            r2.Y = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm6.<init>(java.io.OutputStream, java.util.ArrayList, java.lang.String):void");
    }

    public final void a(String str) {
        m();
        jha jha = this.Y;
        jha.getClass();
        jha.write(str, 0, str.length());
    }

    public final void c0() {
        m();
        if (this.o.t() == 2) {
            this.X.update(x0);
            return;
        }
        jha jha = this.Y;
        jha.getClass();
        jha.write("null", 0, 4);
    }

    public final void close() {
        this.Y.close();
        int t = this.o.t();
        if (t != 0 && t != 2) {
            throw new IllegalStateException("Unfinished document");
        }
    }

    public final void flush() {
        this.Y.flush();
    }

    public final t67 g0(String str) {
        int i;
        int t = this.o.t();
        if ((t == 0 || t == 2) && (i = this.Z) >= 0) {
            this.Z = -1;
            while (true) {
                List list = this.b;
                if (i >= list.size()) {
                    break;
                }
                zzd zzd = (zzd) list.get(i);
                int compareTo = str.compareTo(zzd.a);
                if (compareTo < 0) {
                    break;
                }
                if (compareTo > 0) {
                    zzd.a(this);
                }
                i++;
            }
            this.Z = i;
        }
        n(str);
        return this;
    }

    public final void i(String str) {
        m();
        int t = this.o.t();
        jha jha = this.Y;
        if (t == 2) {
            if (str.length() == 0) {
                this.X.update(x0);
            }
            jha.getClass();
            jha.write(str, 0, str.length());
            return;
        }
        z3d.R(str, jha);
    }

    public final void l(InputStreamReader inputStreamReader) {
        m();
        og0 og0 = this.o;
        int t = og0.t();
        jha jha = this.Y;
        if (t == 2 || t == 5) {
            d67 d67 = new d67(inputStreamReader);
            gt0.L(d67, jha);
            if (d67.S() != 0) {
                throw JsonSyntaxException.b((long) d67.o, d67.m(), d67.S());
            }
        } else if (t == 6 || t == 7) {
            d67 d672 = new d67(inputStreamReader);
            gt0.L(d672, jha);
            while (d672.S() != 0) {
                d672.d(44);
                d672.a(jha);
                gt0.L(d672, jha);
            }
        } else {
            throw new IllegalStateException("Nesting problem: ".concat(dr9.e(og0)));
        }
    }

    public final void m() {
        og0 og0 = this.o;
        int t = og0.t();
        if (t != 1) {
            jha jha = this.Y;
            if (t == 4) {
                og0.v(5);
                jha.write(58);
            } else if (t == 6) {
                og0.v(7);
            } else if (t == 7) {
                jha.write(44);
            } else {
                throw new IllegalStateException("Nesting problem: ".concat(dr9.e(og0)));
            }
        } else {
            og0.v(2);
            this.a.write(61);
            this.X.update((byte) 61);
        }
    }

    public final void n(String str) {
        og0 og0 = this.o;
        int t = og0.t();
        jha jha = this.Y;
        if (t == 0) {
            og0.v(1);
            jha.write(str);
        } else if (t == 5) {
            jha.write(44);
            og0.v(4);
            z3d.R(str, jha);
        } else if (t == 2) {
            this.a.write(38);
            og0.v(1);
            jha.write(str);
        } else if (t == 3) {
            og0.v(4);
            z3d.R(str, jha);
        } else {
            throw new IllegalStateException("Nesting problem: ".concat(dr9.e(og0)));
        }
    }

    public final void q() {
        og0 og0 = this.o;
        int t = og0.t();
        if (t == 3 || t == 5) {
            og0.u();
            this.Y.write(125);
            return;
        }
        throw new IllegalStateException("Nesting problem: ".concat(dr9.e(og0)));
    }

    public final void s() {
        m();
        this.o.w(3);
        this.Y.write(123);
    }

    public final void t() {
        og0 og0 = this.o;
        int t = og0.t();
        if (t == 6 || t == 7) {
            og0.u();
            this.Y.write(93);
            return;
        }
        throw new IllegalStateException("Nesting problem: ".concat(dr9.e(og0)));
    }

    public final void u() {
        m();
        this.o.w(6);
        this.Y.write(91);
    }
}
