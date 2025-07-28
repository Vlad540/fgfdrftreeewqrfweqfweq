package defpackage;

import android.text.Layout;

/* renamed from: yse  reason: default package */
public final class yse {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public float k;
    public String l;
    public int m = -1;
    public int n = -1;
    public Layout.Alignment o;
    public Layout.Alignment p;
    public int q = -1;
    public jfe r;
    public float s = Float.MAX_VALUE;

    public final void a(yse yse) {
        int i2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (yse != null) {
            if (!this.c && yse.c) {
                this.b = yse.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = yse.h;
            }
            if (this.i == -1) {
                this.i = yse.i;
            }
            if (this.a == null && (str = yse.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = yse.f;
            }
            if (this.g == -1) {
                this.g = yse.g;
            }
            if (this.n == -1) {
                this.n = yse.n;
            }
            if (this.o == null && (alignment2 = yse.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = yse.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = yse.q;
            }
            if (this.j == -1) {
                this.j = yse.j;
                this.k = yse.k;
            }
            if (this.r == null) {
                this.r = yse.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = yse.s;
            }
            if (!this.e && yse.e) {
                this.d = yse.d;
                this.e = true;
            }
            if (this.m == -1 && (i2 = yse.m) != -1) {
                this.m = i2;
            }
        }
    }
}
