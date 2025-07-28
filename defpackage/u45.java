package defpackage;

import android.view.View;

/* renamed from: u45  reason: default package */
public final class u45 {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public Object f;

    public u45(uxa uxa) {
        this.f = uxa;
    }

    public void a() {
        this.c = this.d ? ((o57) this.f).h() : ((o57) this.f).m();
    }

    public void b(View view, int i) {
        if (this.d) {
            this.c = ((o57) this.f).o() + ((o57) this.f).c(view);
        } else {
            this.c = ((o57) this.f).f(view);
        }
        this.b = i;
    }

    public void c(View view, int i) {
        int o = ((o57) this.f).o();
        if (o >= 0) {
            b(view, i);
            return;
        }
        this.b = i;
        if (this.d) {
            int h = (((o57) this.f).h() - o) - ((o57) this.f).c(view);
            this.c = ((o57) this.f).h() - h;
            if (h > 0) {
                int d2 = this.c - ((o57) this.f).d(view);
                int m = ((o57) this.f).m();
                int min = d2 - (Math.min(((o57) this.f).f(view) - m, 0) + m);
                if (min < 0) {
                    this.c = Math.min(h, -min) + this.c;
                    return;
                }
                return;
            }
            return;
        }
        int f2 = ((o57) this.f).f(view);
        int m2 = f2 - ((o57) this.f).m();
        this.c = f2;
        if (m2 > 0) {
            int h2 = (((o57) this.f).h() - Math.min(0, (((o57) this.f).h() - o) - ((o57) this.f).c(view))) - (((o57) this.f).d(view) + f2);
            if (h2 < 0) {
                this.c -= Math.min(m2, -h2);
            }
        }
    }

    public void d(int i) {
        this.d |= i > 0;
        this.b += i;
    }

    public void e() {
        this.b = -1;
        this.c = Integer.MIN_VALUE;
        this.d = false;
        this.e = false;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "AnchorInfo{mPosition=" + this.b + ", mCoordinate=" + this.c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
            default:
                return super.toString();
        }
    }

    public u45() {
        e();
    }
}
