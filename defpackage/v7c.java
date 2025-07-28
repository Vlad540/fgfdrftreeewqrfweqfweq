package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: v7c  reason: default package */
public final class v7c extends mb8 implements t7c {
    public final String f;
    public String g;
    public String h;
    public boolean i;
    public int j = -1;
    public int k;
    public s7c l;
    public int m = -1;
    public final /* synthetic */ x7c n;

    public v7c(x7c x7c, String str) {
        this.n = x7c;
        this.f = str;
    }

    public final int a() {
        return this.m;
    }

    public final void b(s7c s7c) {
        u7c u7c = new u7c(this);
        this.l = s7c;
        int i2 = s7c.e;
        s7c.e = i2 + 1;
        int i3 = s7c.d;
        s7c.d = i3 + 1;
        Bundle bundle = new Bundle();
        bundle.putString("memberRouteId", this.f);
        s7c.b(11, i3, i2, (Bundle) null, bundle);
        s7c.h.put(i3, u7c);
        this.m = i2;
        if (this.i) {
            s7c.a(i2);
            int i4 = this.j;
            if (i4 >= 0) {
                s7c.c(this.m, i4);
                this.j = -1;
            }
            int i5 = this.k;
            if (i5 != 0) {
                s7c.d(this.m, i5);
                this.k = 0;
            }
        }
    }

    public final void c() {
        s7c s7c = this.l;
        if (s7c != null) {
            int i2 = this.m;
            int i3 = s7c.d;
            s7c.d = i3 + 1;
            s7c.b(4, i3, i2, (Bundle) null, (Bundle) null);
            this.l = null;
            this.m = 0;
        }
    }

    public final void d() {
        x7c x7c = this.n;
        x7c.z0.remove(this);
        c();
        x7c.m();
    }

    public final void e() {
        this.i = true;
        s7c s7c = this.l;
        if (s7c != null) {
            s7c.a(this.m);
        }
    }

    public final void f(int i2) {
        s7c s7c = this.l;
        if (s7c != null) {
            s7c.c(this.m, i2);
            return;
        }
        this.j = i2;
        this.k = 0;
    }

    public final void g() {
        h(0);
    }

    public final void h(int i2) {
        this.i = false;
        s7c s7c = this.l;
        if (s7c != null) {
            int i3 = this.m;
            Bundle g2 = wn6.g(i2, "unselectReason");
            int i4 = s7c.d;
            s7c.d = i4 + 1;
            s7c.b(6, i4, i3, (Bundle) null, g2);
        }
    }

    public final void i(int i2) {
        s7c s7c = this.l;
        if (s7c != null) {
            s7c.d(this.m, i2);
        } else {
            this.k += i2;
        }
    }

    public final String j() {
        return this.g;
    }

    public final String k() {
        return this.h;
    }

    public final void m(String str) {
        s7c s7c = this.l;
        if (s7c != null) {
            int i2 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i3 = s7c.d;
            s7c.d = i3 + 1;
            s7c.b(12, i3, i2, (Bundle) null, bundle);
        }
    }

    public final void n(String str) {
        s7c s7c = this.l;
        if (s7c != null) {
            int i2 = this.m;
            Bundle bundle = new Bundle();
            bundle.putString("memberRouteId", str);
            int i3 = s7c.d;
            s7c.d = i3 + 1;
            s7c.b(13, i3, i2, (Bundle) null, bundle);
        }
    }

    public final void o(List list) {
        s7c s7c = this.l;
        if (s7c != null) {
            int i2 = this.m;
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("memberRouteIds", new ArrayList(list));
            int i3 = s7c.d;
            s7c.d = i3 + 1;
            s7c.b(14, i3, i2, (Bundle) null, bundle);
        }
    }
}
