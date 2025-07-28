package defpackage;

import android.view.ViewParent;

/* renamed from: kq2  reason: default package */
public final class kq2 implements s16 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public kq2(qoc qoc, zoc zoc, toc toc) {
        this.b = qoc;
        this.c = zoc;
        this.o = toc;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new ja5(((w4) this.o).d(tr2.class), (r7e) ((t97) this.b), (r7e) ((t97) this.c));
            default:
                qoc qoc = (qoc) this.b;
                ViewParent parent = qoc.getParent();
                zoc zoc = (zoc) this.c;
                if (parent != null) {
                    zoc.removeView(qoc);
                }
                toc toc = toc.a;
                toc toc2 = (toc) this.o;
                if (toc2 == toc) {
                    zoc.addView(qoc, zoc.getChildCount());
                } else {
                    zoc.addView(qoc, 0);
                }
                zoc.a(toc2, zoc.y0, zoc.z0, new to1(qoc, zoc, toc2, 13));
                return Boolean.TRUE;
        }
    }

    public kq2(r7e r7e, w4 w4Var, r7e r7e2) {
        this.b = r7e;
        this.o = w4Var;
        this.c = r7e2;
    }
}
