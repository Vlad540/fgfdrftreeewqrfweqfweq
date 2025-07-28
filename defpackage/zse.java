package defpackage;

import android.text.Layout;

/* renamed from: zse  reason: default package */
public final class zse {
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
    public kfe r;
    public float s = Float.MAX_VALUE;

    public final void a(zse zse) {
        int i2;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (zse != null) {
            if (!this.c && zse.c) {
                this.b = zse.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = zse.h;
            }
            if (this.i == -1) {
                this.i = zse.i;
            }
            if (this.a == null && (str = zse.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = zse.f;
            }
            if (this.g == -1) {
                this.g = zse.g;
            }
            if (this.n == -1) {
                this.n = zse.n;
            }
            if (this.o == null && (alignment2 = zse.o) != null) {
                this.o = alignment2;
            }
            if (this.p == null && (alignment = zse.p) != null) {
                this.p = alignment;
            }
            if (this.q == -1) {
                this.q = zse.q;
            }
            if (this.j == -1) {
                this.j = zse.j;
                this.k = zse.k;
            }
            if (this.r == null) {
                this.r = zse.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = zse.s;
            }
            if (!this.e && zse.e) {
                this.d = zse.d;
                this.e = true;
            }
            if (this.m == -1 && (i2 = zse.m) != -1) {
                this.m = i2;
            }
        }
    }
}
