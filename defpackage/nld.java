package defpackage;

import java.util.Arrays;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: nld  reason: default package */
public final class nld implements Comparable {
    public int A0;
    public float X;
    public boolean Y = false;
    public final float[] Z = new float[9];
    public boolean a;
    public int b = -1;
    public int c = -1;
    public int o = 0;
    public final float[] w0 = new float[9];
    public as[] x0 = new as[16];
    public int y0 = 0;
    public int z0 = 0;

    public nld(int i) {
        this.A0 = i;
    }

    public final void a(as asVar) {
        int i = 0;
        while (true) {
            int i2 = this.y0;
            if (i >= i2) {
                as[] asVarArr = this.x0;
                if (i2 >= asVarArr.length) {
                    this.x0 = (as[]) Arrays.copyOf(asVarArr, asVarArr.length * 2);
                }
                as[] asVarArr2 = this.x0;
                int i3 = this.y0;
                asVarArr2[i3] = asVar;
                this.y0 = i3 + 1;
                return;
            } else if (this.x0[i] != asVar) {
                i++;
            } else {
                return;
            }
        }
    }

    public final void b(as asVar) {
        int i = this.y0;
        int i2 = 0;
        while (i2 < i) {
            if (this.x0[i2] == asVar) {
                while (i2 < i - 1) {
                    as[] asVarArr = this.x0;
                    int i3 = i2 + 1;
                    asVarArr[i2] = asVarArr[i3];
                    i2 = i3;
                }
                this.y0--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.A0 = 5;
        this.o = 0;
        this.b = -1;
        this.c = -1;
        this.X = 0.0f;
        this.Y = false;
        int i = this.y0;
        for (int i2 = 0; i2 < i; i2++) {
            this.x0[i2] = null;
        }
        this.y0 = 0;
        this.z0 = 0;
        this.a = false;
        Arrays.fill(this.w0, 0.0f);
    }

    public final int compareTo(Object obj) {
        return this.b - ((nld) obj).b;
    }

    public final void d(id7 id7, float f) {
        this.X = f;
        this.Y = true;
        int i = this.y0;
        this.c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.x0[i2].h(id7, this, false);
        }
        this.y0 = 0;
    }

    public final void e(id7 id7, as asVar) {
        int i = this.y0;
        for (int i2 = 0; i2 < i; i2++) {
            this.x0[i2].i(id7, asVar, false);
        }
        this.y0 = 0;
    }

    public final String toString() {
        return BuildConfig.FLAVOR + this.b;
    }
}
