package defpackage;

import android.os.Bundle;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: we1  reason: default package */
public final class we1 {
    public final jrf a;
    public final r7e b = new r7e(new a01(21));
    public final t97 c = rna.a.b();
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public fpd h;
    public boolean i;
    public boolean j;
    public boolean k;
    public s16 l;
    public final r7e m;
    public final r7e n;

    public we1(r7e r7e, jrf jrf) {
        this.a = jrf;
        dq1 dq1 = dq1.a;
        this.d = dq1.getAccessor().d(ed3.class);
        this.e = dq1.getAccessor().d(iq1.class);
        this.f = dq1.getAccessor().d(jb5.class);
        this.g = r7e;
        this.m = new r7e(new ve1(this, 0));
        this.n = new r7e(new ve1(this, 1));
    }

    public final void a(fpd fpd, s16 s16) {
        boolean f2 = ((ed3) this.d.getValue()).f();
        if (s16 == null) {
            c();
            return;
        }
        t97 t97 = this.g;
        if (f2 || fpd == null || ((ep1) d()).f(fpd)) {
            jrf jrf = this.a;
            if (!f2) {
                jrf.b();
            } else if (fpd == null) {
                ((ep1) d()).v();
                f(s16);
            } else {
                sgc sgc = null;
                if ((fpd instanceof cpd) && !this.k && ((ep1) d()).f(fpd)) {
                    xe1.c.P1().b(":call-join-preview?link=".concat(((cpd) fpd).a), (Bundle) null);
                } else if (((ep1) d()).k().j instanceof w55) {
                    f(s16);
                } else if (!((ep1) d()).f(fpd)) {
                    if (((ep1) d()).k().g) {
                        ((ep1) d()).e();
                    }
                    if (!wp1.a((sgc) t97.getValue())) {
                        xe1.c.Z1();
                    }
                    c();
                } else {
                    this.l = s16;
                    boolean z = this.i;
                    jrf.getClass();
                    int i2 = z ? l1a.d : l1a.c;
                    k77[] k77Arr = BottomSheetWidget.B0;
                    jc3 c2 = rf0.c(l1a.f, 4, (Bundle) null);
                    c2.f(new hge(l1a.e));
                    c2.d(k1a.b, new hge(i2));
                    c2.c(k1a.a, new hge(l1a.b));
                    ConfirmationBottomSheet e2 = c2.e();
                    rr3 rr3 = jrf.b;
                    e2.setTargetController(rr3);
                    rr3 rr32 = rr3;
                    while (rr32.getParentController() != null) {
                        rr32 = rr32.getParentController();
                    }
                    ygc ygc = rr32 instanceof ygc ? (ygc) rr32 : null;
                    if (ygc != null) {
                        sgc = ygc.S();
                    }
                    e2.y0(rr3);
                    if (sgc != null) {
                        vgc vgc = new vgc(e2, (String) null, (wr3) null, (wr3) null, false, -1);
                        rf0.k(false, vgc, true, "BottomSheetWidget");
                        sgc.G(vgc);
                    }
                }
            }
        } else {
            if (!wp1.a((sgc) t97.getValue())) {
                xe1.c.Z1();
            }
            c();
        }
    }

    public final boolean b(int i2, String[] strArr, int[] iArr) {
        if (i2 != 178) {
            return false;
        }
        boolean b2 = e().b(strArr);
        jrf jrf = this.a;
        if (!b2) {
            int length = iArr.length;
            int i3 = 0;
            while (i3 < length) {
                if (iArr[i3] == -1) {
                    c();
                    jrf.g(etb.permission_detail_dialog_title, etb.permission_detail_dialog_subtitile);
                } else {
                    i3++;
                }
            }
            c();
            return false;
        } else if (this.j) {
            s16 s16 = this.l;
            boolean f2 = ((ed3) this.d.getValue()).f();
            if (s16 == null) {
                c();
            } else if (!f2) {
                jrf.b();
            } else {
                s16.invoke();
            }
        } else {
            a(this.h, this.l);
        }
        return true;
    }

    public final void c() {
        this.l = null;
        this.h = null;
        this.i = false;
        this.j = false;
        this.k = false;
    }

    public final so1 d() {
        return (so1) this.b.getValue();
    }

    public final qna e() {
        return (qna) this.c.getValue();
    }

    public final void f(s16 s16) {
        if (!wp1.a((sgc) this.g.getValue()) && s16 != null) {
            s16.invoke();
        }
        c();
    }

    public final boolean g(int i2) {
        if (i2 == tob.call_permission_dialog_check_continue) {
            ((ep1) z11.a.c()).v();
            f(this.l);
            return true;
        } else if (i2 != tob.call_permission_dialog_check_cancel) {
            return false;
        } else {
            c();
            return true;
        }
    }

    public final void h(boolean z) {
        String str = ((ep1) d()).k().c;
        boolean z2 = ((ep1) d()).k().h;
        t97 t97 = this.e;
        if (z && !e().b(qna.l)) {
            iq1 iq1 = (iq1) t97.getValue();
            iq1.getClass();
            iq1.c(iq1, "REQUEST_PERMISSION_CAM", str, "OUT_OF_CALL", (Integer) null, (String) null, (String) null, z2, 56);
        }
        if (!e().b(qna.h)) {
            iq1 iq12 = (iq1) t97.getValue();
            iq12.getClass();
            iq1.c(iq12, "REQUEST_PERMISSION_MIC", str, "AFTER_INITIATION", (Integer) null, (String) null, (String) null, z2, 56);
        }
    }

    public final void i(long j2, boolean z, s16 s16) {
        c();
        boolean booleanValue = ((Boolean) this.m.getValue()).booleanValue();
        jrf jrf = this.a;
        if (!booleanValue) {
            jrf.a();
            return;
        }
        bpd bpd = new bpd(new tk1(j2, z));
        if (e().a(z, jrf)) {
            a(bpd, s16);
            return;
        }
        h(z);
        this.h = bpd;
        this.l = s16;
        this.i = z;
    }

    public final void j(String str, boolean z, boolean z2, boolean z3, s16 s16) {
        c();
        this.k = z3;
        boolean booleanValue = ((Boolean) this.n.getValue()).booleanValue();
        jrf jrf = this.a;
        if (!booleanValue || h0e.c0(str)) {
            jrf.a();
            return;
        }
        cpd cpd = new cpd(str, z);
        if (e().a(z2, jrf)) {
            a(cpd, s16);
            return;
        }
        h(z2);
        this.h = cpd;
        this.l = s16;
        this.i = z2;
    }

    public final void l(long j2, boolean z, s16 s16) {
        c();
        dpd dpd = new dpd(new vk1(j2, z));
        if (e().a(z, this.a)) {
            a(dpd, s16);
            return;
        }
        h(z);
        this.h = dpd;
        this.l = s16;
        this.i = z;
    }
}
