package defpackage;

import android.view.View;
import one.me.complaintbottomsheet.ComplaintBottomSheet;

/* renamed from: o63  reason: default package */
public final class o63 extends pr3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ o63(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void u(rr3 rr3) {
    }

    public void d(rr3 rr3) {
        switch (this.a) {
            case 2:
                ((ds3) this.b).a.d(nb7.ON_CREATE);
                return;
            default:
                return;
        }
    }

    public void g(rr3 rr3) {
        switch (this.a) {
            case 1:
                ((iu1) this.b).b.d(nb7.ON_RESUME);
                return;
            case 2:
                ((ds3) this.b).a.d(nb7.ON_RESUME);
                return;
            case 3:
                tt6 tt6 = (tt6) yr7.a.getAccessor().e();
                if (tt6 != null) {
                    tt6.e(Integer.valueOf(((mnc) this.b).a));
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void h(rr3 rr3) {
        switch (this.a) {
            case 1:
                ((iu1) this.b).b.d(nb7.ON_CREATE);
                return;
            default:
                return;
        }
    }

    public void j(rr3 rr3, View view) {
        switch (this.a) {
            case 1:
                ((iu1) this.b).b.d(nb7.ON_START);
                return;
            case 2:
                ds3 ds3 = (ds3) this.b;
                xie.G(view, ds3);
                if (!x87.i0(rr3)) {
                    ds3.a.d(nb7.ON_CREATE);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void k(rr3 rr3) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ComplaintBottomSheet.X;
                ((ComplaintBottomSheet) obj).getClass();
                t63.c.P1().d();
                return;
            case 4:
                ((sgc) obj).d.remove(rr3);
                return;
            default:
                return;
        }
    }

    public void l(rr3 rr3) {
        switch (this.a) {
            case 2:
                ds3 ds3 = (ds3) this.b;
                if (ds3.a.d.a(ob7.c)) {
                    ds3.a.d(nb7.ON_DESTROY);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void n(rr3 rr3, View view) {
        switch (this.a) {
            case 2:
                ((ds3) this.b).a.d(nb7.ON_START);
                return;
            default:
                return;
        }
    }

    public void p(rr3 rr3) {
        int i = this.a;
    }

    public void q(rr3 rr3) {
        switch (this.a) {
            case 2:
                ds3 ds3 = (ds3) this.b;
                if (ds3.a.d == ob7.a) {
                    ds3.a = new pc7(ds3);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void r(rr3 rr3) {
        switch (this.a) {
            case 1:
                pc7 pc7 = ((iu1) this.b).b;
                if (pc7.d != ob7.b) {
                    pc7.d(nb7.ON_DESTROY);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void s(rr3 rr3, View view) {
        switch (this.a) {
            case 1:
                ((iu1) this.b).b.d(nb7.ON_STOP);
                return;
            case 2:
                ((ds3) this.b).a.d(nb7.ON_STOP);
                return;
            default:
                return;
        }
    }

    public void t(rr3 rr3) {
        switch (this.a) {
            case 1:
                ((iu1) this.b).b.d(nb7.ON_PAUSE);
                return;
            case 2:
                ((ds3) this.b).a.d(nb7.ON_PAUSE);
                return;
            default:
                return;
        }
    }
}
