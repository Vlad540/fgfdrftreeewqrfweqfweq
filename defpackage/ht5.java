package defpackage;

/* renamed from: ht5  reason: default package */
public final class ht5 extends gr8 {
    public static volatile ht5[] i;
    public long a = 0;
    public String b = "";
    public String c = "";
    public String d = "";
    public long e = 0;
    public String f = "";
    public String g = "";
    public String h = "";

    public ht5() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        long j = this.a;
        int h2 = j != 0 ? o13.h(1, j) : 0;
        if (!this.b.equals("")) {
            h2 += o13.l(2, this.b);
        }
        if (!this.c.equals("")) {
            h2 += o13.l(3, this.c);
        }
        if (!this.d.equals("")) {
            h2 += o13.l(4, this.d);
        }
        long j2 = this.e;
        if (j2 != 0) {
            h2 += o13.h(5, j2);
        }
        if (!this.f.equals("")) {
            h2 += o13.l(6, this.f);
        }
        if (!this.g.equals("")) {
            h2 += o13.l(7, this.g);
        }
        return !this.h.equals("") ? h2 + o13.l(8, this.h) : h2;
    }

    public final gr8 mergeFrom(n13 n13) {
        while (true) {
            int s = n13.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                this.a = n13.q();
            } else if (s == 18) {
                this.b = n13.r();
            } else if (s == 26) {
                this.c = n13.r();
            } else if (s == 34) {
                this.d = n13.r();
            } else if (s == 40) {
                this.e = n13.q();
            } else if (s == 50) {
                this.f = n13.r();
            } else if (s == 58) {
                this.g = n13.r();
            } else if (s == 66) {
                this.h = n13.r();
            } else if (!n13.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(o13 o13) {
        long j = this.a;
        if (j != 0) {
            o13.x(1, j);
        }
        if (!this.b.equals("")) {
            o13.E(2, this.b);
        }
        if (!this.c.equals("")) {
            o13.E(3, this.c);
        }
        if (!this.d.equals("")) {
            o13.E(4, this.d);
        }
        long j2 = this.e;
        if (j2 != 0) {
            o13.x(5, j2);
        }
        if (!this.f.equals("")) {
            o13.E(6, this.f);
        }
        if (!this.g.equals("")) {
            o13.E(7, this.g);
        }
        if (!this.h.equals("")) {
            o13.E(8, this.h);
        }
    }
}
