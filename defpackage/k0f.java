package defpackage;

/* renamed from: k0f  reason: default package */
public abstract class k0f extends j0f {
    public ela[] a = null;
    public String b;
    public int c = 0;
    public final int d;

    public k0f() {
    }

    public ela[] getPathData() {
        return this.a;
    }

    public String getPathName() {
        return this.b;
    }

    public void setPathData(ela[] elaArr) {
        if (!h2g.b(this.a, elaArr)) {
            this.a = h2g.g(elaArr);
            return;
        }
        ela[] elaArr2 = this.a;
        for (int i = 0; i < elaArr.length; i++) {
            elaArr2[i].a = elaArr[i].a;
            int i2 = 0;
            while (true) {
                float[] fArr = elaArr[i].b;
                if (i2 >= fArr.length) {
                    break;
                }
                elaArr2[i].b[i2] = fArr[i2];
                i2++;
            }
        }
    }

    public k0f(k0f k0f) {
        this.b = k0f.b;
        this.d = k0f.d;
        this.a = h2g.g(k0f.a);
    }
}
