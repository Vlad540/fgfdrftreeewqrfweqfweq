package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* renamed from: lsf  reason: default package */
public class lsf {
    public static final nsf b = (Build.VERSION.SDK_INT >= 30 ? new dsf() : new csf()).b().a.a().a.b().a.c();
    public final nsf a;

    public lsf(nsf nsf) {
        this.a = nsf;
    }

    public nsf a() {
        return this.a;
    }

    public nsf b() {
        return this.a;
    }

    public nsf c() {
        return this.a;
    }

    public void d(View view) {
    }

    public ri4 e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lsf)) {
            return false;
        }
        lsf lsf = (lsf) obj;
        return n() == lsf.n() && m() == lsf.m() && Objects.equals(j(), lsf.j()) && Objects.equals(h(), lsf.h()) && Objects.equals(e(), lsf.e());
    }

    public qy6 f(int i) {
        return qy6.e;
    }

    public qy6 g() {
        return j();
    }

    public qy6 h() {
        return qy6.e;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e()});
    }

    public qy6 i() {
        return j();
    }

    public qy6 j() {
        return qy6.e;
    }

    public qy6 k() {
        return j();
    }

    public nsf l(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public boolean o(int i) {
        return true;
    }

    public void p(qy6[] qy6Arr) {
    }

    public void q(nsf nsf) {
    }
}
