package defpackage;

import android.os.Bundle;

/* renamed from: w7c  reason: default package */
public final class w7c extends nb8 implements t7c {
    public final String a;
    public final String b;
    public boolean c;
    public int d = -1;
    public int e;
    public s7c f;
    public int g;
    public final /* synthetic */ x7c h;

    public w7c(x7c x7c, String str, String str2) {
        this.h = x7c;
        this.a = str;
        this.b = str2;
    }

    public final int a() {
        return this.g;
    }

    public final void b(s7c s7c) {
        this.f = s7c;
        int i = s7c.e;
        s7c.e = i + 1;
        Bundle bundle = new Bundle();
        bundle.putString("routeId", this.a);
        bundle.putString("routeGroupId", this.b);
        int i2 = s7c.d;
        s7c.d = i2 + 1;
        s7c.b(3, i2, i, (Bundle) null, bundle);
        this.g = i;
        if (this.c) {
            s7c.a(i);
            int i3 = this.d;
            if (i3 >= 0) {
                s7c.c(this.g, i3);
                this.d = -1;
            }
            int i4 = this.e;
            if (i4 != 0) {
                s7c.d(this.g, i4);
                this.e = 0;
            }
        }
    }

    public final void c() {
        s7c s7c = this.f;
        if (s7c != null) {
            int i = this.g;
            int i2 = s7c.d;
            s7c.d = i2 + 1;
            s7c.b(4, i2, i, (Bundle) null, (Bundle) null);
            this.f = null;
            this.g = 0;
        }
    }

    public final void d() {
        x7c x7c = this.h;
        x7c.z0.remove(this);
        c();
        x7c.m();
    }

    public final void e() {
        this.c = true;
        s7c s7c = this.f;
        if (s7c != null) {
            s7c.a(this.g);
        }
    }

    public final void f(int i) {
        s7c s7c = this.f;
        if (s7c != null) {
            s7c.c(this.g, i);
            return;
        }
        this.d = i;
        this.e = 0;
    }

    public final void g() {
        h(0);
    }

    public final void h(int i) {
        this.c = false;
        s7c s7c = this.f;
        if (s7c != null) {
            int i2 = this.g;
            Bundle g2 = wn6.g(i, "unselectReason");
            int i3 = s7c.d;
            s7c.d = i3 + 1;
            s7c.b(6, i3, i2, (Bundle) null, g2);
        }
    }

    public final void i(int i) {
        s7c s7c = this.f;
        if (s7c != null) {
            s7c.d(this.g, i);
        } else {
            this.e += i;
        }
    }
}
