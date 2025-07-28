package defpackage;

import java.util.Arrays;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: or  reason: default package */
public final class or {
    public int a = 0;
    public final as b;
    public final jg8 c;
    public int d = 8;
    public int[] e = new int[8];
    public int[] f = new int[8];
    public float[] g = new float[8];
    public int h = -1;
    public int i = -1;
    public boolean j = false;

    public or(as asVar, jg8 jg8) {
        this.b = asVar;
        this.c = jg8;
    }

    public final void a(nld nld, float f2, boolean z) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i2 = this.h;
            as asVar = this.b;
            if (i2 == -1) {
                this.h = 0;
                this.g[0] = f2;
                this.e[0] = nld.b;
                this.f[0] = -1;
                nld.z0++;
                nld.a(asVar);
                this.a++;
                if (!this.j) {
                    int i3 = this.i + 1;
                    this.i = i3;
                    int[] iArr = this.e;
                    if (i3 >= iArr.length) {
                        this.j = true;
                        this.i = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i2 != -1 && i4 < this.a) {
                int i6 = this.e[i2];
                int i7 = nld.b;
                if (i6 == i7) {
                    float[] fArr = this.g;
                    float f3 = fArr[i2] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i2] = f3;
                    if (f3 == 0.0f) {
                        if (i2 == this.h) {
                            this.h = this.f[i2];
                        } else {
                            int[] iArr2 = this.f;
                            iArr2[i5] = iArr2[i2];
                        }
                        if (z) {
                            nld.b(asVar);
                        }
                        if (this.j) {
                            this.i = i2;
                        }
                        nld.z0--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (i6 < i7) {
                    i5 = i2;
                }
                i2 = this.f[i2];
                i4++;
            }
            int i8 = this.i;
            int i9 = i8 + 1;
            if (this.j) {
                int[] iArr3 = this.e;
                if (iArr3[i8] != -1) {
                    i8 = iArr3.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr4 = this.e;
            if (i8 >= iArr4.length && this.a < iArr4.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr5 = this.e;
                    if (i10 >= iArr5.length) {
                        break;
                    } else if (iArr5[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr6 = this.e;
            if (i8 >= iArr6.length) {
                i8 = iArr6.length;
                int i11 = this.d * 2;
                this.d = i11;
                this.j = false;
                this.i = i8 - 1;
                this.g = Arrays.copyOf(this.g, i11);
                this.e = Arrays.copyOf(this.e, this.d);
                this.f = Arrays.copyOf(this.f, this.d);
            }
            this.e[i8] = nld.b;
            this.g[i8] = f2;
            if (i5 != -1) {
                int[] iArr7 = this.f;
                iArr7[i8] = iArr7[i5];
                iArr7[i5] = i8;
            } else {
                this.f[i8] = this.h;
                this.h = i8;
            }
            nld.z0++;
            nld.a(asVar);
            this.a++;
            if (!this.j) {
                this.i++;
            }
            int i12 = this.i;
            int[] iArr8 = this.e;
            if (i12 >= iArr8.length) {
                this.j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i2 = this.h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            nld nld = ((nld[]) this.c.o)[this.e[i2]];
            if (nld != null) {
                nld.b(this.b);
            }
            i2 = this.f[i2];
            i3++;
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.a = 0;
    }

    public final boolean c(nld nld) {
        int i2 = this.h;
        if (i2 == -1) {
            return false;
        }
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.e[i2] == nld.b) {
                return true;
            }
            i2 = this.f[i2];
            i3++;
        }
        return false;
    }

    public final void d(float f2) {
        int i2 = this.h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f[i2];
            i3++;
        }
    }

    public final float e(nld nld) {
        int i2 = this.h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.e[i2] == nld.b) {
                return this.g[i2];
            }
            i2 = this.f[i2];
            i3++;
        }
        return 0.0f;
    }

    public final int f() {
        return this.a;
    }

    public final nld g(int i2) {
        int i3 = this.h;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return ((nld[]) this.c.o)[this.e[i3]];
            }
            i3 = this.f[i3];
            i4++;
        }
        return null;
    }

    public final float h(int i2) {
        int i3 = this.h;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.g[i3];
            }
            i3 = this.f[i3];
            i4++;
        }
        return 0.0f;
    }

    public final void i() {
        int i2 = this.h;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            float[] fArr = this.g;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f[i2];
            i3++;
        }
    }

    public final void j(nld nld, float f2) {
        if (f2 == 0.0f) {
            k(nld, true);
            return;
        }
        int i2 = this.h;
        as asVar = this.b;
        if (i2 == -1) {
            this.h = 0;
            this.g[0] = f2;
            this.e[0] = nld.b;
            this.f[0] = -1;
            nld.z0++;
            nld.a(asVar);
            this.a++;
            if (!this.j) {
                int i3 = this.i + 1;
                this.i = i3;
                int[] iArr = this.e;
                if (i3 >= iArr.length) {
                    this.j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i2 != -1 && i4 < this.a) {
            int i6 = this.e[i2];
            int i7 = nld.b;
            if (i6 == i7) {
                this.g[i2] = f2;
                return;
            }
            if (i6 < i7) {
                i5 = i2;
            }
            i2 = this.f[i2];
            i4++;
        }
        int i8 = this.i;
        int i9 = i8 + 1;
        if (this.j) {
            int[] iArr2 = this.e;
            if (iArr2[i8] != -1) {
                i8 = iArr2.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr3 = this.e;
        if (i8 >= iArr3.length && this.a < iArr3.length) {
            int i10 = 0;
            while (true) {
                int[] iArr4 = this.e;
                if (i10 >= iArr4.length) {
                    break;
                } else if (iArr4[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr5 = this.e;
        if (i8 >= iArr5.length) {
            i8 = iArr5.length;
            int i11 = this.d * 2;
            this.d = i11;
            this.j = false;
            this.i = i8 - 1;
            this.g = Arrays.copyOf(this.g, i11);
            this.e = Arrays.copyOf(this.e, this.d);
            this.f = Arrays.copyOf(this.f, this.d);
        }
        this.e[i8] = nld.b;
        this.g[i8] = f2;
        if (i5 != -1) {
            int[] iArr6 = this.f;
            iArr6[i8] = iArr6[i5];
            iArr6[i5] = i8;
        } else {
            this.f[i8] = this.h;
            this.h = i8;
        }
        nld.z0++;
        nld.a(asVar);
        int i12 = this.a + 1;
        this.a = i12;
        if (!this.j) {
            this.i++;
        }
        int[] iArr7 = this.e;
        if (i12 >= iArr7.length) {
            this.j = true;
        }
        if (this.i >= iArr7.length) {
            this.j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float k(nld nld, boolean z) {
        int i2 = this.h;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.a) {
            if (this.e[i2] == nld.b) {
                if (i2 == this.h) {
                    this.h = this.f[i2];
                } else {
                    int[] iArr = this.f;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    nld.b(this.b);
                }
                nld.z0--;
                this.a--;
                this.e[i2] = -1;
                if (this.j) {
                    this.i = i2;
                }
                return this.g[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f[i2];
        }
        return 0.0f;
    }

    public final float l(as asVar, boolean z) {
        float e2 = e(asVar.a);
        k(asVar.a, z);
        or orVar = asVar.d;
        int f2 = orVar.f();
        for (int i2 = 0; i2 < f2; i2++) {
            nld g2 = orVar.g(i2);
            a(g2, orVar.e(g2) * e2, z);
        }
        return e2;
    }

    public final String toString() {
        int i2 = this.h;
        String str = BuildConfig.FLAVOR;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            StringBuilder l = hr1.l(hr1.g(str, " -> "));
            l.append(this.g[i2]);
            l.append(" : ");
            StringBuilder l2 = hr1.l(l.toString());
            l2.append(((nld[]) this.c.o)[this.e[i2]]);
            str = l2.toString();
            i2 = this.f[i2];
            i3++;
        }
        return str;
    }
}
