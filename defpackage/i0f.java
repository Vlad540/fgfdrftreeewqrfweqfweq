package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;

/* renamed from: i0f  reason: default package */
public final class i0f extends j0f {
    public final Matrix a;
    public final ArrayList b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public final int k;
    public String l;

    public i0f() {
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.l = null;
    }

    public final boolean a() {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return false;
            }
            if (((j0f) arrayList.get(i2)).a()) {
                return true;
            }
            i2++;
        }
    }

    public final boolean b(int[] iArr) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.b;
            if (i2 >= arrayList.size()) {
                return z;
            }
            z |= ((j0f) arrayList.get(i2)).b(iArr);
            i2++;
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.l;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.d) {
            this.d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.e) {
            this.e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.c) {
            this.c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f) {
            this.f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.g) {
            this.g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.h) {
            this.h = f2;
            c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.i) {
            this.i = f2;
            c();
        }
    }

    /* JADX WARNING: type inference failed for: r4v6, types: [k0f, h0f] */
    public i0f(i0f i0f, yr yrVar) {
        k0f k0f;
        this.a = new Matrix();
        this.b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.l = null;
        this.c = i0f.c;
        this.d = i0f.d;
        this.e = i0f.e;
        this.f = i0f.f;
        this.g = i0f.g;
        this.h = i0f.h;
        this.i = i0f.i;
        String str = i0f.l;
        this.l = str;
        this.k = i0f.k;
        if (str != null) {
            yrVar.put(str, this);
        }
        matrix.set(i0f.j);
        ArrayList arrayList = i0f.b;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            Object obj = arrayList.get(i2);
            if (obj instanceof i0f) {
                this.b.add(new i0f((i0f) obj, yrVar));
            } else {
                if (obj instanceof h0f) {
                    h0f h0f = (h0f) obj;
                    ? k0f2 = new k0f(h0f);
                    k0f2.f = 0.0f;
                    k0f2.h = 1.0f;
                    k0f2.i = 1.0f;
                    k0f2.j = 0.0f;
                    k0f2.k = 1.0f;
                    k0f2.l = 0.0f;
                    k0f2.m = Paint.Cap.BUTT;
                    k0f2.n = Paint.Join.MITER;
                    k0f2.o = 4.0f;
                    k0f2.e = h0f.e;
                    k0f2.f = h0f.f;
                    k0f2.h = h0f.h;
                    k0f2.g = h0f.g;
                    k0f2.c = h0f.c;
                    k0f2.i = h0f.i;
                    k0f2.j = h0f.j;
                    k0f2.k = h0f.k;
                    k0f2.l = h0f.l;
                    k0f2.m = h0f.m;
                    k0f2.n = h0f.n;
                    k0f2.o = h0f.o;
                    k0f = k0f2;
                } else if (obj instanceof g0f) {
                    k0f = new k0f((g0f) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.b.add(k0f);
                String str2 = k0f.b;
                if (str2 != null) {
                    yrVar.put(str2, k0f);
                }
            }
        }
    }
}
