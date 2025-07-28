package ru.ok.tamtam.nano;

import ru.ok.tamtam.nano.Protos;

public final class a extends gr8 {
    public static volatile a[] m;
    public String a = "";
    public String b = "";
    public String c = "";
    public long[] d;
    public long[] e;
    public String[] f;
    public boolean g;
    public Protos.MessageElements h;
    public long i;
    public gt5 j;
    public gt5 k;
    public gt5 l;

    public a() {
        long[] jArr = iu7.l;
        this.d = jArr;
        this.e = jArr;
        this.f = iu7.n;
        this.g = false;
        this.h = null;
        this.i = 0;
        this.j = null;
        this.k = null;
        this.l = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        long[] jArr;
        long[] jArr2;
        int i2 = 0;
        int l2 = !this.a.equals("") ? o13.l(1, this.a) : 0;
        if (!this.b.equals("")) {
            l2 += o13.l(2, this.b);
        }
        if (!this.c.equals("")) {
            l2 += o13.l(3, this.c);
        }
        long[] jArr3 = this.d;
        if (jArr3 != null && jArr3.length > 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                jArr2 = this.d;
                if (i3 >= jArr2.length) {
                    break;
                }
                i4 += o13.k(jArr2[i3]);
                i3++;
            }
            l2 = l2 + i4 + jArr2.length;
        }
        long[] jArr4 = this.e;
        if (jArr4 != null && jArr4.length > 0) {
            int i5 = 0;
            int i6 = 0;
            while (true) {
                jArr = this.e;
                if (i5 >= jArr.length) {
                    break;
                }
                i6 += o13.k(jArr[i5]);
                i5++;
            }
            l2 = l2 + i6 + jArr.length;
        }
        String[] strArr = this.f;
        if (strArr != null && strArr.length > 0) {
            int i7 = 0;
            int i8 = 0;
            while (true) {
                String[] strArr2 = this.f;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    i8++;
                    int q = o13.q(str);
                    i7 = o13.j(q) + q + i7;
                }
                i2++;
            }
            l2 = l2 + i7 + i8;
        }
        if (this.g) {
            l2 += o13.a(7);
        }
        Protos.MessageElements messageElements = this.h;
        if (messageElements != null) {
            l2 += o13.i(8, messageElements);
        }
        long j2 = this.i;
        if (j2 != 0) {
            l2 += o13.h(9, j2);
        }
        gt5 gt5 = this.j;
        if (gt5 != null) {
            l2 += o13.i(10, gt5);
        }
        gt5 gt52 = this.k;
        if (gt52 != null) {
            l2 += o13.i(11, gt52);
        }
        gt5 gt53 = this.l;
        return gt53 != null ? l2 + o13.i(12, gt53) : l2;
    }

    public final gr8 mergeFrom(n13 n13) {
        while (true) {
            int s = n13.s();
            switch (s) {
                case 0:
                    break;
                case 10:
                    this.a = n13.r();
                    continue;
                case 18:
                    this.b = n13.r();
                    continue;
                case 26:
                    this.c = n13.r();
                    continue;
                case 32:
                    int z = iu7.z(n13, 32);
                    long[] jArr = this.d;
                    int length = jArr == null ? 0 : jArr.length;
                    int i2 = z + length;
                    long[] jArr2 = new long[i2];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        jArr2[length] = n13.q();
                        n13.s();
                        length++;
                    }
                    jArr2[length] = n13.q();
                    this.d = jArr2;
                    continue;
                case 34:
                    int e2 = n13.e(n13.p());
                    int c2 = n13.c();
                    int i3 = 0;
                    while (n13.b() > 0) {
                        n13.q();
                        i3++;
                    }
                    n13.t(c2);
                    long[] jArr3 = this.d;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i4 = i3 + length2;
                    long[] jArr4 = new long[i4];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i4) {
                        jArr4[length2] = n13.q();
                        length2++;
                    }
                    this.d = jArr4;
                    n13.d(e2);
                    continue;
                case 40:
                    int z2 = iu7.z(n13, 40);
                    long[] jArr5 = this.e;
                    int length3 = jArr5 == null ? 0 : jArr5.length;
                    int i5 = z2 + length3;
                    long[] jArr6 = new long[i5];
                    if (length3 != 0) {
                        System.arraycopy(jArr5, 0, jArr6, 0, length3);
                    }
                    while (length3 < i5 - 1) {
                        jArr6[length3] = n13.q();
                        n13.s();
                        length3++;
                    }
                    jArr6[length3] = n13.q();
                    this.e = jArr6;
                    continue;
                case 42:
                    int e3 = n13.e(n13.p());
                    int c3 = n13.c();
                    int i6 = 0;
                    while (n13.b() > 0) {
                        n13.q();
                        i6++;
                    }
                    n13.t(c3);
                    long[] jArr7 = this.e;
                    int length4 = jArr7 == null ? 0 : jArr7.length;
                    int i7 = i6 + length4;
                    long[] jArr8 = new long[i7];
                    if (length4 != 0) {
                        System.arraycopy(jArr7, 0, jArr8, 0, length4);
                    }
                    while (length4 < i7) {
                        jArr8[length4] = n13.q();
                        length4++;
                    }
                    this.e = jArr8;
                    n13.d(e3);
                    continue;
                case 50:
                    int z3 = iu7.z(n13, 50);
                    String[] strArr = this.f;
                    int length5 = strArr == null ? 0 : strArr.length;
                    int i8 = z3 + length5;
                    String[] strArr2 = new String[i8];
                    if (length5 != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length5);
                    }
                    while (length5 < i8 - 1) {
                        strArr2[length5] = n13.r();
                        n13.s();
                        length5++;
                    }
                    strArr2[length5] = n13.r();
                    this.f = strArr2;
                    continue;
                case 56:
                    this.g = n13.f();
                    continue;
                case 66:
                    if (this.h == null) {
                        this.h = new Protos.MessageElements();
                    }
                    n13.j(this.h);
                    continue;
                case 72:
                    this.i = n13.q();
                    continue;
                case 82:
                    if (this.j == null) {
                        this.j = new gt5(0);
                    }
                    n13.j(this.j);
                    continue;
                case 90:
                    if (this.k == null) {
                        this.k = new gt5(2);
                    }
                    n13.j(this.k);
                    continue;
                case 98:
                    if (this.l == null) {
                        this.l = new gt5(1);
                    }
                    n13.j(this.l);
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
        if (!this.a.equals("")) {
            o13.E(1, this.a);
        }
        if (!this.b.equals("")) {
            o13.E(2, this.b);
        }
        if (!this.c.equals("")) {
            o13.E(3, this.c);
        }
        long[] jArr = this.d;
        int i2 = 0;
        if (jArr != null && jArr.length > 0) {
            int i3 = 0;
            while (true) {
                long[] jArr2 = this.d;
                if (i3 >= jArr2.length) {
                    break;
                }
                o13.x(4, jArr2[i3]);
                i3++;
            }
        }
        long[] jArr3 = this.e;
        if (jArr3 != null && jArr3.length > 0) {
            int i4 = 0;
            while (true) {
                long[] jArr4 = this.e;
                if (i4 >= jArr4.length) {
                    break;
                }
                o13.x(5, jArr4[i4]);
                i4++;
            }
        }
        String[] strArr = this.f;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    o13.E(6, str);
                }
                i2++;
            }
        }
        boolean z = this.g;
        if (z) {
            o13.r(7, z);
        }
        Protos.MessageElements messageElements = this.h;
        if (messageElements != null) {
            o13.y(8, messageElements);
        }
        long j2 = this.i;
        if (j2 != 0) {
            o13.x(9, j2);
        }
        gt5 gt5 = this.j;
        if (gt5 != null) {
            o13.y(10, gt5);
        }
        gt5 gt52 = this.k;
        if (gt52 != null) {
            o13.y(11, gt52);
        }
        gt5 gt53 = this.l;
        if (gt53 != null) {
            o13.y(12, gt53);
        }
    }
}
