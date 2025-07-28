package defpackage;

import java.io.InputStreamReader;
import java.io.Writer;
import java.util.NoSuchElementException;
import ru.ok.android.api.json.JsonSyntaxException;

/* renamed from: jxa  reason: default package */
public final class jxa extends t1 {
    public final Writer a;
    public final og0 b;

    public jxa(Writer writer) {
        og0 og0 = new og0(18, (byte) 0);
        this.b = og0;
        this.a = writer;
        og0.w(0);
    }

    public static String o(og0 og0) {
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        int i = og0.b;
        if (i >= 0) {
            int[] iArr2 = new int[Math.max(i, 8)];
            int i2 = 0;
            while (og0.b != 0) {
                int u = og0.u();
                int length = iArr2.length;
                if (i2 < length) {
                    iArr = iArr2;
                } else {
                    iArr = new int[(length * 2)];
                    System.arraycopy(iArr2, 0, iArr, 0, length);
                    iArr2 = iArr;
                }
                iArr2[i2] = u;
                i2++;
                iArr2 = iArr;
            }
            while (i2 != 0) {
                if (i2 != 0) {
                    i2--;
                    int i3 = iArr2[i2];
                    String str = "";
                    switch (i3) {
                        case 0:
                        case 1:
                            break;
                        case 2:
                        case 3:
                            str = "[";
                            break;
                        case 4:
                        case 6:
                            str = "{";
                            break;
                        case 5:
                            str = "{:";
                            break;
                        default:
                            throw new IllegalArgumentException(wn6.h(i3, str));
                    }
                    sb.append(str);
                    og0.w(i3);
                } else {
                    throw new NoSuchElementException();
                }
            }
            return sb.toString();
        }
        throw new IllegalArgumentException(wn6.h(i, "Illegal Capacity: "));
    }

    public final void a(String str) {
        m();
        this.a.write(str);
    }

    public final void close() {
        this.a.close();
        if (this.b.t() != 1) {
            throw new IllegalStateException("Unfinished document");
        }
    }

    public final void flush() {
        this.a.flush();
    }

    public final t67 g0(String str) {
        og0 og0 = this.b;
        int t = og0.t();
        Writer writer = this.a;
        if (t == 6) {
            writer.write(44);
        } else if (t != 4) {
            throw new IllegalStateException("Nesting problem: " + o(og0));
        }
        og0.v(5);
        z3d.R(str, writer);
        return this;
    }

    public final void i(String str) {
        m();
        z3d.R(str, this.a);
    }

    public final void l(InputStreamReader inputStreamReader) {
        m();
        og0 og0 = this.b;
        int t = og0.t();
        Writer writer = this.a;
        if (t == 2 || t == 3) {
            d67 d67 = new d67(inputStreamReader);
            gt0.L(d67, writer);
            while (d67.S() != 0) {
                d67.d(44);
                d67.a(writer);
                gt0.L(d67, writer);
            }
        } else if (t == 6) {
            d67 d672 = new d67(inputStreamReader);
            gt0.L(d672, writer);
            if (d672.S() != 0) {
                throw JsonSyntaxException.b((long) d672.o, d672.m(), d672.S());
            }
        } else {
            throw new IllegalStateException("Nesting problem: " + o(og0));
        }
    }

    public final void m() {
        og0 og0 = this.b;
        int t = og0.t();
        if (t != 0) {
            Writer writer = this.a;
            if (t == 5) {
                writer.write(":");
                og0.v(6);
            } else if (t == 2) {
                og0.v(3);
            } else if (t == 3) {
                writer.write(44);
            } else {
                throw new IllegalStateException("Nesting problem: " + o(og0));
            }
        } else {
            og0.v(1);
        }
    }

    public final void n(int i, int i2) {
        og0 og0 = this.b;
        int t = og0.t();
        if (t == i2 || t == i) {
            og0.u();
            return;
        }
        throw new IllegalStateException("Nesting problem: " + o(og0));
    }

    public final void q() {
        n(4, 6);
        this.a.write(125);
    }

    public final void s() {
        m();
        this.b.w(4);
        this.a.write(123);
    }

    public final void t() {
        n(2, 3);
        this.a.write(93);
    }

    public final void u() {
        m();
        this.b.w(2);
        this.a.write(91);
    }
}
