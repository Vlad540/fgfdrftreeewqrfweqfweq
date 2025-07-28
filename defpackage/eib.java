package defpackage;

import ru.ok.tamtam.nano.Protos;

/* renamed from: eib  reason: default package */
public final class eib extends gr8 {
    public static volatile eib[] o;
    public long a = 0;
    public String b = "";
    public String c = "";
    public int d = 0;
    public long e = 0;
    public String f = "";
    public long g = 0;
    public String h = "";
    public int i = 0;
    public int[] j = iu7.k;
    public String k = "";
    public dib l = null;
    public bib m = null;
    public Protos.Attaches.Attach n = null;

    public eib() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int[] iArr;
        long j2 = this.a;
        int i2 = 0;
        int h2 = j2 != 0 ? o13.h(1, j2) : 0;
        if (!this.b.equals("")) {
            h2 += o13.l(2, this.b);
        }
        if (!this.c.equals("")) {
            h2 += o13.l(3, this.c);
        }
        int i3 = this.d;
        if (i3 != 0) {
            h2 += o13.f(4, i3);
        }
        long j3 = this.e;
        if (j3 != 0) {
            h2 += o13.h(5, j3);
        }
        if (!this.f.equals("")) {
            h2 += o13.l(6, this.f);
        }
        long j4 = this.g;
        if (j4 != 0) {
            h2 += o13.h(7, j4);
        }
        if (!this.h.equals("")) {
            h2 += o13.l(8, this.h);
        }
        int i4 = this.i;
        if (i4 != 0) {
            h2 += o13.f(9, i4);
        }
        int[] iArr2 = this.j;
        if (iArr2 != null && iArr2.length > 0) {
            int i5 = 0;
            while (true) {
                iArr = this.j;
                if (i2 >= iArr.length) {
                    break;
                }
                i5 += o13.g(iArr[i2]);
                i2++;
            }
            h2 = h2 + i5 + iArr.length;
        }
        if (!this.k.equals("")) {
            h2 += o13.l(12, this.k);
        }
        dib dib = this.l;
        if (dib != null) {
            h2 += o13.i(13, dib);
        }
        bib bib = this.m;
        if (bib != null) {
            h2 += o13.i(14, bib);
        }
        Protos.Attaches.Attach attach = this.n;
        return attach != null ? h2 + o13.i(15, attach) : h2;
    }

    public final gr8 mergeFrom(n13 n13) {
        while (true) {
            int s = n13.s();
            switch (s) {
                case 0:
                    break;
                case 8:
                    this.a = n13.q();
                    continue;
                case 18:
                    this.b = n13.r();
                    continue;
                case 26:
                    this.c = n13.r();
                    continue;
                case 32:
                    this.d = n13.p();
                    continue;
                case 40:
                    this.e = n13.q();
                    continue;
                case 50:
                    this.f = n13.r();
                    continue;
                case 56:
                    this.g = n13.q();
                    continue;
                case 66:
                    this.h = n13.r();
                    continue;
                case 72:
                    this.i = n13.p();
                    continue;
                case 88:
                    int z = iu7.z(n13, 88);
                    int[] iArr = this.j;
                    int length = iArr == null ? 0 : iArr.length;
                    int i2 = z + length;
                    int[] iArr2 = new int[i2];
                    if (length != 0) {
                        System.arraycopy(iArr, 0, iArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        iArr2[length] = n13.p();
                        n13.s();
                        length++;
                    }
                    iArr2[length] = n13.p();
                    this.j = iArr2;
                    continue;
                case 90:
                    int e2 = n13.e(n13.p());
                    int c2 = n13.c();
                    int i3 = 0;
                    while (n13.b() > 0) {
                        n13.p();
                        i3++;
                    }
                    n13.t(c2);
                    int[] iArr3 = this.j;
                    int length2 = iArr3 == null ? 0 : iArr3.length;
                    int i4 = i3 + length2;
                    int[] iArr4 = new int[i4];
                    if (length2 != 0) {
                        System.arraycopy(iArr3, 0, iArr4, 0, length2);
                    }
                    while (length2 < i4) {
                        iArr4[length2] = n13.p();
                        length2++;
                    }
                    this.j = iArr4;
                    n13.d(e2);
                    continue;
                case 98:
                    this.k = n13.r();
                    continue;
                case 106:
                    if (this.l == null) {
                        gr8 gr8 = new gr8();
                        gr8.a = 0.0f;
                        gr8.b = 0.0f;
                        gr8.c = 0;
                        gr8.d = false;
                        gr8.cachedSize = -1;
                        this.l = gr8;
                    }
                    n13.j(this.l);
                    continue;
                case 114:
                    if (this.m == null) {
                        gr8 gr82 = new gr8();
                        gr82.a = "";
                        gr82.b = "";
                        gr82.c = "";
                        gr82.d = null;
                        gr82.e = "";
                        gr82.f = null;
                        gr82.cachedSize = -1;
                        this.m = gr82;
                    }
                    n13.j(this.m);
                    continue;
                case 122:
                    if (this.n == null) {
                        this.n = new Protos.Attaches.Attach();
                    }
                    n13.j(this.n);
                    continue;
                default:
                    if (!n13.u(s)) {
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return this;
    }

    public final void writeTo(o13 o13) {
        long j2 = this.a;
        if (j2 != 0) {
            o13.x(1, j2);
        }
        if (!this.b.equals("")) {
            o13.E(2, this.b);
        }
        if (!this.c.equals("")) {
            o13.E(3, this.c);
        }
        int i2 = this.d;
        if (i2 != 0) {
            o13.w(4, i2);
        }
        long j3 = this.e;
        if (j3 != 0) {
            o13.x(5, j3);
        }
        if (!this.f.equals("")) {
            o13.E(6, this.f);
        }
        long j4 = this.g;
        if (j4 != 0) {
            o13.x(7, j4);
        }
        if (!this.h.equals("")) {
            o13.E(8, this.h);
        }
        int i3 = this.i;
        if (i3 != 0) {
            o13.w(9, i3);
        }
        int[] iArr = this.j;
        if (iArr != null && iArr.length > 0) {
            int i4 = 0;
            while (true) {
                int[] iArr2 = this.j;
                if (i4 >= iArr2.length) {
                    break;
                }
                o13.w(11, iArr2[i4]);
                i4++;
            }
        }
        if (!this.k.equals("")) {
            o13.E(12, this.k);
        }
        dib dib = this.l;
        if (dib != null) {
            o13.y(13, dib);
        }
        bib bib = this.m;
        if (bib != null) {
            o13.y(14, bib);
        }
        Protos.Attaches.Attach attach = this.n;
        if (attach != null) {
            o13.y(15, attach);
        }
    }
}
