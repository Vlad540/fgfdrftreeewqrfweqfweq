package defpackage;

import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: cgc  reason: default package */
public final class cgc extends u2 {
    public final /* synthetic */ int c;
    public final /* synthetic */ dgc o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cgc(zfc zfc, dgc dgc) {
        super(9, zfc);
        this.c = 2;
        this.o = dgc;
    }

    public final void L1(Object obj, Object obj2) {
        switch (this.c) {
            case 0:
                if (((yfc) obj) != ((yfc) obj2)) {
                    this.o.C();
                    return;
                }
                return;
            case 1:
                if (((xfc) obj) != ((xfc) obj2)) {
                    this.o.C();
                    return;
                }
                return;
            default:
                zfc zfc = (zfc) obj2;
                if (!hhd.f((zfc) obj, zfc)) {
                    ImageView x = this.o.getIconView();
                    ViewGroup.LayoutParams layoutParams = x.getLayoutParams();
                    if (layoutParams != null) {
                        re3 re3 = (re3) layoutParams;
                        re3.height = zfc.b;
                        re3.width = zfc.a;
                        x.setLayoutParams(re3);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public cgc(defpackage.dgc r1, int r2) {
        /*
            r0 = this;
            r0.c = r2
            switch(r2) {
                case 1: goto L_0x000f;
                default: goto L_0x0005;
            }
        L_0x0005:
            yfc r2 = defpackage.yfc.w0
            r0.o = r1
            r1 = 9
            r0.<init>(r1, r2)
            return
        L_0x000f:
            xfc r2 = defpackage.xfc.a
            r0.o = r1
            r1 = 9
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgc.<init>(dgc, int):void");
    }
}
