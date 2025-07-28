package defpackage;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: kre  reason: default package */
public class kre extends cre {
    public ArrayList V0 = new ArrayList();
    public boolean W0 = true;
    public int X0;
    public boolean Y0 = false;
    public int Z0 = 0;

    public final void C(View view) {
        super.C(view);
        int size = this.V0.size();
        for (int i = 0; i < size; i++) {
            ((cre) this.V0.get(i)).C(view);
        }
    }

    public final void D() {
        this.P0 = 0;
        jre jre = new jre(this);
        for (int i = 0; i < this.V0.size(); i++) {
            cre cre = (cre) this.V0.get(i);
            cre.a(jre);
            cre.D();
            long j = cre.P0;
            if (this.W0) {
                this.P0 = Math.max(this.P0, j);
            } else {
                long j2 = this.P0;
                cre.Q0 = j2;
                this.P0 = j2 + j;
            }
        }
    }

    public final cre E(zqe zqe) {
        super.E(zqe);
        return this;
    }

    public final void F(View view) {
        for (int i = 0; i < this.V0.size(); i++) {
            ((cre) this.V0.get(i)).F(view);
        }
        this.Y.remove(view);
    }

    public final void G(View view) {
        super.G(view);
        int size = this.V0.size();
        for (int i = 0; i < size; i++) {
            ((cre) this.V0.get(i)).G(view);
        }
    }

    public final void H() {
        if (this.V0.isEmpty()) {
            P();
            o();
            return;
        }
        jre jre = new jre();
        jre.b = this;
        Iterator it = this.V0.iterator();
        while (it.hasNext()) {
            ((cre) it.next()).a(jre);
        }
        this.X0 = this.V0.size();
        if (!this.W0) {
            for (int i = 1; i < this.V0.size(); i++) {
                ((cre) this.V0.get(i - 1)).a(new ei0(1, (cre) this.V0.get(i)));
            }
            cre cre = (cre) this.V0.get(0);
            if (cre != null) {
                cre.H();
                return;
            }
            return;
        }
        Iterator it2 = this.V0.iterator();
        while (it2.hasNext()) {
            ((cre) it2.next()).H();
        }
    }

    public final void I(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        long j5 = this.P0;
        if (this.z0 != null) {
            if (j3 < 0 && j4 < 0) {
                return;
            }
            if (j3 > j5 && j4 > j5) {
                return;
            }
        }
        int i = (j3 > j4 ? 1 : (j3 == j4 ? 0 : -1));
        boolean z = i < 0;
        int i2 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if ((i2 >= 0 && j4 < 0) || (j3 <= j5 && j4 > j5)) {
            this.I0 = false;
            B(this, bre.f0, z);
        }
        if (this.W0) {
            for (int i3 = 0; i3 < this.V0.size(); i3++) {
                ((cre) this.V0.get(i3)).I(j3, j4);
            }
        } else {
            int i4 = 1;
            while (true) {
                if (i4 >= this.V0.size()) {
                    i4 = this.V0.size();
                    break;
                } else if (((cre) this.V0.get(i4)).Q0 > j4) {
                    break;
                } else {
                    i4++;
                }
            }
            int i5 = i4 - 1;
            if (i >= 0) {
                while (i5 < this.V0.size()) {
                    cre cre = (cre) this.V0.get(i5);
                    long j6 = cre.Q0;
                    int i6 = i5;
                    long j7 = j3 - j6;
                    if (j7 < 0) {
                        break;
                    }
                    cre.I(j7, j4 - j6);
                    i5 = i6 + 1;
                }
            } else {
                while (i5 >= 0) {
                    cre cre2 = (cre) this.V0.get(i5);
                    long j8 = cre2.Q0;
                    long j9 = j3 - j8;
                    cre2.I(j9, j4 - j8);
                    if (j9 >= 0) {
                        break;
                    }
                    i5--;
                }
            }
        }
        if (this.z0 != null) {
            int i7 = (j3 > j5 ? 1 : (j3 == j5 ? 0 : -1));
            if ((i7 > 0 && j4 <= j5) || (i2 < 0 && j4 >= 0)) {
                if (i7 > 0) {
                    this.I0 = true;
                }
                B(this, bre.g0, z);
            }
        }
    }

    public final void K(fja fja) {
        this.N0 = fja;
        this.Z0 |= 8;
        int size = this.V0.size();
        for (int i = 0; i < size; i++) {
            ((cre) this.V0.get(i)).K(fja);
        }
    }

    public final void L(TimeInterpolator timeInterpolator) {
        this.Z0 |= 1;
        ArrayList arrayList = this.V0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((cre) this.V0.get(i)).L(timeInterpolator);
            }
        }
        this.o = timeInterpolator;
    }

    public final void M(hk9 hk9) {
        super.M(hk9);
        this.Z0 |= 4;
        if (this.V0 != null) {
            for (int i = 0; i < this.V0.size(); i++) {
                ((cre) this.V0.get(i)).M(hk9);
            }
        }
    }

    public final void N(zed zed) {
        this.M0 = zed;
        this.Z0 |= 2;
        int size = this.V0.size();
        for (int i = 0; i < size; i++) {
            ((cre) this.V0.get(i)).N(zed);
        }
    }

    public final void O(long j) {
        this.b = j;
    }

    public final String Q(String str) {
        String Q = super.Q(str);
        for (int i = 0; i < this.V0.size(); i++) {
            StringBuilder n = me4.n(Q, "\n");
            n.append(((cre) this.V0.get(i)).Q(str + "  "));
            Q = n.toString();
        }
        return Q;
    }

    public final void R(zqe zqe) {
        super.a(zqe);
    }

    /* renamed from: S */
    public final kre b(int i) {
        for (int i2 = 0; i2 < this.V0.size(); i2++) {
            ((cre) this.V0.get(i2)).b(i);
        }
        super.b(i);
        return this;
    }

    public final void T(cre cre) {
        this.V0.add(cre);
        cre.z0 = this;
        long j = this.c;
        if (j >= 0) {
            cre.J(j);
        }
        if ((this.Z0 & 1) != 0) {
            cre.L(this.o);
        }
        if ((this.Z0 & 2) != 0) {
            cre.N(this.M0);
        }
        if ((this.Z0 & 4) != 0) {
            cre.M(this.O0);
        }
        if ((this.Z0 & 8) != 0) {
            cre.K(this.N0);
        }
    }

    public final cre U(int i) {
        if (i < 0 || i >= this.V0.size()) {
            return null;
        }
        return (cre) this.V0.get(i);
    }

    /* renamed from: V */
    public final void J(long j) {
        ArrayList arrayList;
        this.c = j;
        if (j >= 0 && (arrayList = this.V0) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((cre) this.V0.get(i)).J(j);
            }
        }
    }

    public final void W(int i) {
        if (i == 0) {
            this.W0 = true;
        } else if (i == 1) {
            this.W0 = false;
        } else {
            throw new AndroidRuntimeException(wn6.h(i, "Invalid parameter for TransitionSet ordering: "));
        }
    }

    public final void c(View view) {
        for (int i = 0; i < this.V0.size(); i++) {
            ((cre) this.V0.get(i)).c(view);
        }
        this.Y.add(view);
    }

    public final void e() {
        super.e();
        int size = this.V0.size();
        for (int i = 0; i < size; i++) {
            ((cre) this.V0.get(i)).e();
        }
    }

    public final void f(mre mre) {
        if (z(mre.b)) {
            Iterator it = this.V0.iterator();
            while (it.hasNext()) {
                cre cre = (cre) it.next();
                if (cre.z(mre.b)) {
                    cre.f(mre);
                    mre.c.add(cre);
                }
            }
        }
    }

    public final void h(mre mre) {
        super.h(mre);
        int size = this.V0.size();
        for (int i = 0; i < size; i++) {
            ((cre) this.V0.get(i)).h(mre);
        }
    }

    public final void i(mre mre) {
        if (z(mre.b)) {
            Iterator it = this.V0.iterator();
            while (it.hasNext()) {
                cre cre = (cre) it.next();
                if (cre.z(mre.b)) {
                    cre.i(mre);
                    mre.c.add(cre);
                }
            }
        }
    }

    /* renamed from: l */
    public final cre clone() {
        kre kre = (kre) super.clone();
        kre.V0 = new ArrayList();
        int size = this.V0.size();
        for (int i = 0; i < size; i++) {
            cre l = ((cre) this.V0.get(i)).clone();
            kre.V0.add(l);
            l.z0 = kre;
        }
        return kre;
    }

    public final void n(ViewGroup viewGroup, nxc nxc, nxc nxc2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.b;
        int size = this.V0.size();
        for (int i = 0; i < size; i++) {
            cre cre = (cre) this.V0.get(i);
            if (j > 0 && (this.W0 || i == 0)) {
                long j2 = cre.b;
                if (j2 > 0) {
                    cre.O(j2 + j);
                } else {
                    cre.O(j);
                }
            }
            cre.n(viewGroup, nxc, nxc2, arrayList, arrayList2);
        }
    }

    public final void q(int i) {
        for (int i2 = 0; i2 < this.V0.size(); i2++) {
            ((cre) this.V0.get(i2)).q(i);
        }
        super.q(i);
    }

    public final void r(ViewGroup viewGroup) {
        super.r(viewGroup);
        int size = this.V0.size();
        for (int i = 0; i < size; i++) {
            ((cre) this.V0.get(i)).r(viewGroup);
        }
    }

    public final boolean x() {
        for (int i = 0; i < this.V0.size(); i++) {
            if (((cre) this.V0.get(i)).x()) {
                return true;
            }
        }
        return false;
    }
}
