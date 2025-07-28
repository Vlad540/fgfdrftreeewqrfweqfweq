package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: csf  reason: default package */
public class csf extends esf {
    public final WindowInsets.Builder c;

    public csf() {
        this.c = new WindowInsets.Builder();
    }

    public nsf b() {
        a();
        nsf f = nsf.f((View) null, this.c.build());
        f.a.p(this.b);
        return f;
    }

    public void d(qy6 qy6) {
        this.c.setMandatorySystemGestureInsets(qy6.d());
    }

    public void e(qy6 qy6) {
        this.c.setSystemGestureInsets(qy6.d());
    }

    public void f(qy6 qy6) {
        this.c.setSystemWindowInsets(qy6.d());
    }

    public void g(qy6 qy6) {
        this.c.setTappableElementInsets(qy6.d());
    }

    public void i(qy6 qy6) {
        this.c.setStableInsets(qy6.d());
    }

    public csf(nsf nsf) {
        super(nsf);
        WindowInsets.Builder builder;
        WindowInsets e = nsf.e();
        if (e != null) {
            builder = new WindowInsets.Builder(e);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.c = builder;
    }
}
