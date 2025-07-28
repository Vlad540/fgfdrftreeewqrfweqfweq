package defpackage;

import org.webrtc.EglBase;
import ru.ok.tamtam.nano.Protos;

/* renamed from: gib  reason: default package */
public final class gib extends gr8 {
    public eib[] a;
    public String b;
    public long c;
    public long d;
    public long e;
    public fib[] f;
    public Protos.Attaches g;
    public long h;
    public Protos.MessageElements i;
    public boolean j;
    public long k;

    public gib() {
        if (eib.o == null) {
            synchronized (tz6.b) {
                try {
                    if (eib.o == null) {
                        eib.o = new eib[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.a = eib.o;
        this.b = "";
        this.c = 0;
        this.d = 0;
        this.e = 0;
        if (fib.e == null) {
            synchronized (tz6.b) {
                try {
                    if (fib.e == null) {
                        fib.e = new fib[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f = fib.e;
        this.g = null;
        this.h = 0;
        this.i = null;
        this.j = false;
        this.k = 0;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i2;
        eib[] eibArr = this.a;
        int i3 = 0;
        if (eibArr != null && eibArr.length > 0) {
            int i4 = 0;
            i2 = 0;
            while (true) {
                gr8[] gr8Arr = this.a;
                if (i4 >= gr8Arr.length) {
                    break;
                }
                gr8 gr8 = gr8Arr[i4];
                if (gr8 != null) {
                    i2 += o13.i(1, gr8);
                }
                i4++;
            }
        } else {
            i2 = 0;
        }
        if (!this.b.equals("")) {
            i2 += o13.l(2, this.b);
        }
        long j2 = this.c;
        if (j2 != 0) {
            i2 += o13.h(3, j2);
        }
        long j3 = this.d;
        if (j3 != 0) {
            i2 += o13.h(4, j3);
        }
        long j4 = this.e;
        if (j4 != 0) {
            i2 += o13.h(5, j4);
        }
        fib[] fibArr = this.f;
        if (fibArr != null && fibArr.length > 0) {
            while (true) {
                gr8[] gr8Arr2 = this.f;
                if (i3 >= gr8Arr2.length) {
                    break;
                }
                gr8 gr82 = gr8Arr2[i3];
                if (gr82 != null) {
                    i2 = o13.i(6, gr82) + i2;
                }
                i3++;
            }
        }
        Protos.Attaches attaches = this.g;
        if (attaches != null) {
            i2 += o13.i(7, attaches);
        }
        long j5 = this.h;
        if (j5 != 0) {
            i2 += o13.h(8, j5);
        }
        Protos.MessageElements messageElements = this.i;
        if (messageElements != null) {
            i2 += o13.i(9, messageElements);
        }
        if (this.j) {
            i2 += o13.a(10);
        }
        long j6 = this.k;
        return j6 != 0 ? i2 + o13.h(11, j6) : i2;
    }

    public final gr8 mergeFrom(n13 n13) {
        while (true) {
            int s = n13.s();
            switch (s) {
                case 0:
                    break;
                case 10:
                    int z = iu7.z(n13, 10);
                    eib[] eibArr = this.a;
                    int length = eibArr == null ? 0 : eibArr.length;
                    int i2 = z + length;
                    eib[] eibArr2 = new eib[i2];
                    if (length != 0) {
                        System.arraycopy(eibArr, 0, eibArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        eib eib = new eib();
                        eibArr2[length] = eib;
                        n13.j(eib);
                        n13.s();
                        length++;
                    }
                    eib eib2 = new eib();
                    eibArr2[length] = eib2;
                    n13.j(eib2);
                    this.a = eibArr2;
                    continue;
                case 18:
                    this.b = n13.r();
                    continue;
                case 24:
                    this.c = n13.q();
                    continue;
                case 32:
                    this.d = n13.q();
                    continue;
                case 40:
                    this.e = n13.q();
                    continue;
                case 50:
                    int z2 = iu7.z(n13, 50);
                    fib[] fibArr = this.f;
                    int length2 = fibArr == null ? 0 : fibArr.length;
                    int i3 = z2 + length2;
                    fib[] fibArr2 = new fib[i3];
                    if (length2 != 0) {
                        System.arraycopy(fibArr, 0, fibArr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        fib fib = new fib();
                        fibArr2[length2] = fib;
                        n13.j(fib);
                        n13.s();
                        length2++;
                    }
                    fib fib2 = new fib();
                    fibArr2[length2] = fib2;
                    n13.j(fib2);
                    this.f = fibArr2;
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new Protos.Attaches();
                    }
                    n13.j(this.g);
                    continue;
                case EglBase.EGL_OPENGL_ES3_BIT /*64*/:
                    this.h = n13.q();
                    continue;
                case 74:
                    if (this.i == null) {
                        this.i = new Protos.MessageElements();
                    }
                    n13.j(this.i);
                    continue;
                case 80:
                    this.j = n13.f();
                    continue;
                case 88:
                    this.k = n13.q();
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
        eib[] eibArr = this.a;
        int i2 = 0;
        if (eibArr != null && eibArr.length > 0) {
            int i3 = 0;
            while (true) {
                gr8[] gr8Arr = this.a;
                if (i3 >= gr8Arr.length) {
                    break;
                }
                gr8 gr8 = gr8Arr[i3];
                if (gr8 != null) {
                    o13.y(1, gr8);
                }
                i3++;
            }
        }
        if (!this.b.equals("")) {
            o13.E(2, this.b);
        }
        long j2 = this.c;
        if (j2 != 0) {
            o13.x(3, j2);
        }
        long j3 = this.d;
        if (j3 != 0) {
            o13.x(4, j3);
        }
        long j4 = this.e;
        if (j4 != 0) {
            o13.x(5, j4);
        }
        fib[] fibArr = this.f;
        if (fibArr != null && fibArr.length > 0) {
            while (true) {
                gr8[] gr8Arr2 = this.f;
                if (i2 >= gr8Arr2.length) {
                    break;
                }
                gr8 gr82 = gr8Arr2[i2];
                if (gr82 != null) {
                    o13.y(6, gr82);
                }
                i2++;
            }
        }
        Protos.Attaches attaches = this.g;
        if (attaches != null) {
            o13.y(7, attaches);
        }
        long j5 = this.h;
        if (j5 != 0) {
            o13.x(8, j5);
        }
        Protos.MessageElements messageElements = this.i;
        if (messageElements != null) {
            o13.y(9, messageElements);
        }
        boolean z = this.j;
        if (z) {
            o13.r(10, z);
        }
        long j6 = this.k;
        if (j6 != 0) {
            o13.x(11, j6);
        }
    }
}
