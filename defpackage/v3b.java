package defpackage;

import java.util.Arrays;

/* renamed from: v3b  reason: default package */
public final class v3b extends as {
    public nld[] f;
    public nld[] g;
    public int h;
    public mn i;

    public final nld d(boolean[] zArr) {
        int i2 = -1;
        for (int i3 = 0; i3 < this.h; i3++) {
            nld[] nldArr = this.f;
            nld nld = nldArr[i3];
            if (!zArr[nld.b]) {
                mn mnVar = this.i;
                mnVar.b = nld;
                int i4 = 8;
                if (i2 != -1) {
                    nld nld2 = nldArr[i2];
                    while (true) {
                        if (i4 < 0) {
                            break;
                        }
                        float f2 = nld2.w0[i4];
                        float f3 = ((nld) mnVar.b).w0[i4];
                        if (f3 == f2) {
                            i4--;
                        } else if (f3 >= f2) {
                        }
                    }
                } else {
                    while (true) {
                        if (i4 < 0) {
                            break;
                        }
                        float f4 = ((nld) mnVar.b).w0[i4];
                        if (f4 > 0.0f) {
                            break;
                        } else if (f4 < 0.0f) {
                            break;
                        } else {
                            i4--;
                        }
                    }
                }
                i2 = i3;
            }
        }
        if (i2 == -1) {
            return null;
        }
        return this.f[i2];
    }

    public final boolean e() {
        return this.h == 0;
    }

    public final void i(id7 id7, as asVar, boolean z) {
        as asVar2 = asVar;
        nld nld = asVar2.a;
        if (nld != null) {
            or orVar = asVar2.d;
            int f2 = orVar.f();
            for (int i2 = 0; i2 < f2; i2++) {
                nld g2 = orVar.g(i2);
                float h2 = orVar.h(i2);
                mn mnVar = this.i;
                mnVar.b = g2;
                boolean z2 = g2.a;
                float[] fArr = nld.w0;
                if (z2) {
                    boolean z3 = true;
                    for (int i3 = 0; i3 < 9; i3++) {
                        float[] fArr2 = ((nld) mnVar.b).w0;
                        float f3 = (fArr[i3] * h2) + fArr2[i3];
                        fArr2[i3] = f3;
                        if (Math.abs(f3) < 1.0E-4f) {
                            ((nld) mnVar.b).w0[i3] = 0.0f;
                        } else {
                            z3 = false;
                        }
                    }
                    if (z3) {
                        ((v3b) mnVar.c).k((nld) mnVar.b);
                    }
                } else {
                    for (int i4 = 0; i4 < 9; i4++) {
                        float f4 = fArr[i4];
                        if (f4 != 0.0f) {
                            float f5 = f4 * h2;
                            if (Math.abs(f5) < 1.0E-4f) {
                                f5 = 0.0f;
                            }
                            ((nld) mnVar.b).w0[i4] = f5;
                        } else {
                            ((nld) mnVar.b).w0[i4] = 0.0f;
                        }
                    }
                    j(g2);
                }
                this.b = (asVar2.b * h2) + this.b;
            }
            k(nld);
        }
    }

    public final void j(nld nld) {
        int i2;
        int i3 = this.h + 1;
        nld[] nldArr = this.f;
        if (i3 > nldArr.length) {
            nld[] nldArr2 = (nld[]) Arrays.copyOf(nldArr, nldArr.length * 2);
            this.f = nldArr2;
            this.g = (nld[]) Arrays.copyOf(nldArr2, nldArr2.length * 2);
        }
        nld[] nldArr3 = this.f;
        int i4 = this.h;
        nldArr3[i4] = nld;
        int i5 = i4 + 1;
        this.h = i5;
        if (i5 > 1 && nldArr3[i4].b > nld.b) {
            int i6 = 0;
            while (true) {
                i2 = this.h;
                if (i6 >= i2) {
                    break;
                }
                this.g[i6] = this.f[i6];
                i6++;
            }
            Arrays.sort(this.g, 0, i2, new gu6(10));
            for (int i7 = 0; i7 < this.h; i7++) {
                this.f[i7] = this.g[i7];
            }
        }
        nld.a = true;
        nld.a(this);
    }

    public final void k(nld nld) {
        int i2 = 0;
        while (i2 < this.h) {
            if (this.f[i2] == nld) {
                while (true) {
                    int i3 = this.h;
                    if (i2 < i3 - 1) {
                        nld[] nldArr = this.f;
                        int i4 = i2 + 1;
                        nldArr[i2] = nldArr[i4];
                        i2 = i4;
                    } else {
                        this.h = i3 - 1;
                        nld.a = false;
                        return;
                    }
                }
            } else {
                i2++;
            }
        }
    }

    public final String toString() {
        String str = " goal -> (" + this.b + ") : ";
        for (int i2 = 0; i2 < this.h; i2++) {
            nld nld = this.f[i2];
            mn mnVar = this.i;
            mnVar.b = nld;
            str = str + mnVar + " ";
        }
        return str;
    }
}
