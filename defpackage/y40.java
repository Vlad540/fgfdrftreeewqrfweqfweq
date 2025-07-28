package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.CancellationException;

/* renamed from: y40  reason: default package */
public final class y40 extends ao8 {
    public final /* synthetic */ int X0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y40(Context context, ViewGroup viewGroup, int i) {
        super(context, viewGroup);
        this.X0 = i;
    }

    public void D() {
        switch (this.X0) {
            case 0:
                r40 r40 = (r40) this.M0;
                r40.removeOnAttachStateChangeListener(r40.Y0);
                g37 g37 = r40.X0;
                if (g37 != null) {
                    g37.cancel((CancellationException) null);
                }
                r40.X0 = null;
                g37 g372 = r40.W0;
                if (g372 != null) {
                    g372.cancel((CancellationException) null);
                }
                r40.W0 = null;
                return;
            case 4:
                qe5 qe5 = (qe5) this.M0;
                qe5.removeOnAttachStateChangeListener(qe5.I0);
                g37 g373 = qe5.J0;
                if (g373 != null) {
                    g373.cancel((CancellationException) null);
                }
                qe5.J0 = null;
                return;
            case 9:
                bjd bjd = (bjd) this.M0;
                bjd.removeOnAttachStateChangeListener(bjd.Q0);
                g37 g374 = bjd.R0;
                if (g374 != null) {
                    g374.cancel((CancellationException) null);
                }
                bjd.R0 = null;
                return;
            case 10:
                a6f a6f = (a6f) this.M0;
                a6f.removeOnAttachStateChangeListener(a6f.J0);
                qod qod = a6f.K0;
                if (qod != null) {
                    qod.cancel((CancellationException) null);
                }
                a6f.K0 = null;
                qod qod2 = a6f.L0;
                if (qod2 != null) {
                    qod2.cancel((CancellationException) null);
                }
                a6f.L0 = null;
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r5v13, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void M(one.me.messages.list.loader.MessageModel r6) {
        /*
            r5 = this;
            int r0 = r5.X0
            switch(r0) {
                case 0: goto L_0x01f3;
                case 1: goto L_0x0005;
                case 2: goto L_0x01dc;
                case 3: goto L_0x01c5;
                case 4: goto L_0x01ae;
                case 5: goto L_0x018e;
                case 6: goto L_0x00a2;
                case 7: goto L_0x0081;
                case 8: goto L_0x0005;
                case 9: goto L_0x004f;
                case 10: goto L_0x0038;
                case 11: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            wy r6 = r6.y0
            rz r6 = r6.d
            boolean r0 = r6 instanceof defpackage.wid
            if (r0 == 0) goto L_0x0011
            wid r6 = (defpackage.wid) r6
            goto L_0x0012
        L_0x0011:
            r6 = 0
        L_0x0012:
            if (r6 != 0) goto L_0x0015
            goto L_0x0037
        L_0x0015:
            android.view.View r5 = r5.M0
            zid r5 = (defpackage.zid) r5
            r5.setModel(r6)
            q40 r0 = new q40
            r1 = 8
            r0.<init>(r5, r1, r6)
            r5.I0 = r0
            boolean r6 = r5.isAttachedToWindow()
            if (r6 == 0) goto L_0x0032
            q40 r6 = r5.I0
            if (r6 == 0) goto L_0x0032
            r6.onViewAttachedToWindow(r5)
        L_0x0032:
            q40 r6 = r5.I0
            r5.addOnAttachStateChangeListener(r6)
        L_0x0037:
            return
        L_0x0038:
            wy r6 = r6.y0
            rz r6 = r6.d
            boolean r0 = r6 instanceof defpackage.h5f
            if (r0 == 0) goto L_0x0043
            h5f r6 = (defpackage.h5f) r6
            goto L_0x0044
        L_0x0043:
            r6 = 0
        L_0x0044:
            if (r6 != 0) goto L_0x0047
            goto L_0x004e
        L_0x0047:
            android.view.View r5 = r5.M0
            a6f r5 = (defpackage.a6f) r5
            r5.n(r6)
        L_0x004e:
            return
        L_0x004f:
            wy r6 = r6.y0
            rz r6 = r6.d
            boolean r0 = r6 instanceof defpackage.wid
            if (r0 == 0) goto L_0x005a
            wid r6 = (defpackage.wid) r6
            goto L_0x005b
        L_0x005a:
            r6 = 0
        L_0x005b:
            if (r6 != 0) goto L_0x005e
            goto L_0x0080
        L_0x005e:
            android.view.View r5 = r5.M0
            bjd r5 = (defpackage.bjd) r5
            r5.setModel(r6)
            q40 r0 = new q40
            r1 = 9
            r0.<init>(r5, r1, r6)
            r5.Q0 = r0
            boolean r6 = r5.isAttachedToWindow()
            if (r6 == 0) goto L_0x007b
            q40 r6 = r5.Q0
            if (r6 == 0) goto L_0x007b
            r6.onViewAttachedToWindow(r5)
        L_0x007b:
            q40 r6 = r5.Q0
            r5.addOnAttachStateChangeListener(r6)
        L_0x0080:
            return
        L_0x0081:
            wy r6 = r6.y0
            rz r6 = r6.d
            boolean r0 = r6 instanceof defpackage.gtd
            r1 = 0
            if (r0 == 0) goto L_0x008d
            gtd r6 = (defpackage.gtd) r6
            goto L_0x008e
        L_0x008d:
            r6 = r1
        L_0x008e:
            if (r6 != 0) goto L_0x0091
            goto L_0x00a1
        L_0x0091:
            android.view.View r5 = r5.M0
            boolean r0 = r5 instanceof defpackage.etd
            if (r0 == 0) goto L_0x009a
            r1 = r5
            etd r1 = (defpackage.etd) r1
        L_0x009a:
            if (r1 == 0) goto L_0x00a1
            ktd r5 = r6.a
            r1.a(r5)
        L_0x00a1:
            return
        L_0x00a2:
            wy r0 = r6.y0
            rz r0 = r0.d
            boolean r1 = r0 instanceof defpackage.rad
            if (r1 == 0) goto L_0x00ad
            rad r0 = (defpackage.rad) r0
            goto L_0x00ae
        L_0x00ad:
            r0 = 0
        L_0x00ae:
            if (r0 != 0) goto L_0x00b2
            goto L_0x018d
        L_0x00b2:
            android.view.View r5 = r5.M0
            ubd r5 = (defpackage.ubd) r5
            int r6 = r6.L0
            r1 = 2080374784(0x7c000000, float:2.658456E36)
            r6 = r6 & r1
            boolean r6 = defpackage.ir0.b(r6)
            r5.getClass()
            s59 r1 = km4.y0
            pda r1 = r1.r(r5)
            jo2 r1 = r1.a()
            dr0 r6 = r1.a(r6)
            r5.x0 = r6
            t97 r6 = r5.G0
            r1 = 8
            r2 = 0
            java.lang.String r3 = r0.c
            if (r3 == 0) goto L_0x00eb
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r4 = r6
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            r4.setText(r3)
            r6.setVisibility(r2)
            goto L_0x00fa
        L_0x00eb:
            boolean r3 = r6.a()
            if (r3 == 0) goto L_0x00fa
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r6.setVisibility(r1)
        L_0x00fa:
            t97 r6 = r5.H0
            java.lang.String r3 = r0.d
            if (r3 == 0) goto L_0x0110
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r4 = r6
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            r4.setText(r3)
            r6.setVisibility(r2)
            goto L_0x011f
        L_0x0110:
            boolean r3 = r6.a()
            if (r3 == 0) goto L_0x011f
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r6.setVisibility(r1)
        L_0x011f:
            t97 r6 = r5.I0
            java.lang.String r3 = r0.e
            if (r3 == 0) goto L_0x0135
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r4 = r6
            androidx.appcompat.widget.AppCompatTextView r4 = (androidx.appcompat.widget.AppCompatTextView) r4
            r4.setText(r3)
            r6.setVisibility(r2)
            goto L_0x0144
        L_0x0135:
            boolean r3 = r6.a()
            if (r3 == 0) goto L_0x0144
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r6.setVisibility(r1)
        L_0x0144:
            t97 r6 = r5.J0
            tp6 r3 = r0.f
            if (r3 == 0) goto L_0x015a
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r1 = r6
            xp6 r1 = (defpackage.xp6) r1
            r1.setImageAttach(r3)
            r6.setVisibility(r2)
            goto L_0x0169
        L_0x015a:
            boolean r2 = r6.a()
            if (r2 == 0) goto L_0x0169
            java.lang.Object r6 = r6.getValue()
            android.view.View r6 = (android.view.View) r6
            r6.setVisibility(r1)
        L_0x0169:
            android.content.Context r6 = r5.getContext()
            nya r1 = new nya
            r2 = 19
            r1.<init>(r5, r2, r0)
            g33 r0 = new g33
            r2 = 5
            r0.<init>(r5, r2, r1)
            android.view.GestureDetector r1 = new android.view.GestureDetector
            r1.<init>(r6, r0)
            r6 = 1
            r1.setIsLongpressEnabled(r6)
            cg3 r6 = new cg3
            r0 = 9
            r6.<init>(r1, r0)
            r5.setOnTouchListener(r6)
        L_0x018d:
            return
        L_0x018e:
            wy r0 = r6.y0
            rz r0 = r0.d
            boolean r1 = r0 instanceof defpackage.b76
            if (r1 == 0) goto L_0x0199
            b76 r0 = (defpackage.b76) r0
            goto L_0x019a
        L_0x0199:
            r0 = 0
        L_0x019a:
            if (r0 != 0) goto L_0x019d
            goto L_0x01ad
        L_0x019d:
            android.view.View r5 = r5.M0
            c76 r5 = (defpackage.c76) r5
            int r6 = r6.L0
            r1 = 2080374784(0x7c000000, float:2.658456E36)
            r6 = r6 & r1
            boolean r6 = defpackage.ir0.b(r6)
            r5.b(r0, r6)
        L_0x01ad:
            return
        L_0x01ae:
            wy r6 = r6.y0
            rz r6 = r6.d
            boolean r0 = r6 instanceof defpackage.pc5
            if (r0 == 0) goto L_0x01b9
            pc5 r6 = (defpackage.pc5) r6
            goto L_0x01ba
        L_0x01b9:
            r6 = 0
        L_0x01ba:
            if (r6 != 0) goto L_0x01bd
            goto L_0x01c4
        L_0x01bd:
            android.view.View r5 = r5.M0
            qe5 r5 = (defpackage.qe5) r5
            r5.setFileInfo(r6)
        L_0x01c4:
            return
        L_0x01c5:
            wy r6 = r6.y0
            rz r6 = r6.d
            boolean r0 = r6 instanceof defpackage.ag3
            if (r0 == 0) goto L_0x01d0
            ag3 r6 = (defpackage.ag3) r6
            goto L_0x01d1
        L_0x01d0:
            r6 = 0
        L_0x01d1:
            if (r6 != 0) goto L_0x01d4
            goto L_0x01db
        L_0x01d4:
            android.view.View r5 = r5.M0
            hm3 r5 = (defpackage.hm3) r5
            r5.i(r6)
        L_0x01db:
            return
        L_0x01dc:
            wy r6 = r6.y0
            rz r6 = r6.d
            boolean r0 = r6 instanceof defpackage.pz0
            if (r0 == 0) goto L_0x01e7
            pz0 r6 = (defpackage.pz0) r6
            goto L_0x01e8
        L_0x01e7:
            r6 = 0
        L_0x01e8:
            if (r6 != 0) goto L_0x01eb
            goto L_0x01f2
        L_0x01eb:
            android.view.View r5 = r5.M0
            sb1 r5 = (defpackage.sb1) r5
            r5.c(r6)
        L_0x01f2:
            return
        L_0x01f3:
            wy r6 = r6.y0
            rz r6 = r6.d
            boolean r0 = r6 instanceof defpackage.m40
            if (r0 == 0) goto L_0x01fe
            m40 r6 = (defpackage.m40) r6
            goto L_0x01ff
        L_0x01fe:
            r6 = 0
        L_0x01ff:
            if (r6 != 0) goto L_0x0202
            goto L_0x0209
        L_0x0202:
            android.view.View r5 = r5.M0
            r40 r5 = (defpackage.r40) r5
            r5.setAudio(r6)
        L_0x0209:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y40.M(one.me.messages.list.loader.MessageModel):void");
    }

    public void N(dr0 dr0) {
        switch (this.X0) {
            case 0:
                ((r40) this.M0).b();
                return;
            case 1:
                View view = this.M0;
                xk0 xk0 = view instanceof xk0 ? (xk0) view : null;
                if (xk0 != null && !xk0.w0.b()) {
                    xk0.setDateTextColor(dr0.b.f);
                    return;
                }
                return;
            case 2:
                ((sb1) this.M0).b();
                return;
            case 3:
                ((hm3) this.M0).e();
                return;
            case 4:
                ((qe5) this.M0).w(dr0);
                return;
            case 5:
                ((c76) this.M0).d(dr0);
                return;
            case 6:
                ((ubd) this.M0).n(dr0);
                return;
            case 7:
                View view2 = this.M0;
                itd itd = view2 instanceof itd ? (itd) view2 : null;
                if (itd != null && !itd.x0.b()) {
                    itd.setDateTextColor(dr0.b.f);
                    return;
                }
                return;
            case 8:
                View view3 = this.M0;
                i04 i04 = view3 instanceof i04 ? (i04) view3 : null;
                if (i04 != null) {
                    i04.setDateTextColor(dr0.b.f);
                    return;
                }
                return;
            case 9:
                ((bjd) this.M0).w(dr0);
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [android.view.View, xp6] */
    public void P(j53 j53) {
        switch (this.X0) {
            case 1:
                View view = this.M0;
                xk0 xk0 = view instanceof xk0 ? (xk0) view : null;
                if (xk0 != null && xk0.w0.b()) {
                    xk0.setDateTextColor(j53.b.a);
                    return;
                }
                return;
            case 7:
                View view2 = this.M0;
                itd itd = view2 instanceof itd ? (itd) view2 : null;
                if (itd != null && itd.x0.b()) {
                    itd.setDateTextColor(j53.b.a);
                    return;
                }
                return;
            case 9:
                bjd bjd = (bjd) this.M0;
                bjd.H0.onThemeChanged(km4.y0.n(bjd.getContext()).g());
                if (!bjd.v()) {
                    bjd.getDate$message_list_release().setTextColor$message_list_release(j53.b.a);
                    return;
                }
                return;
            case 10:
                a6f a6f = (a6f) this.M0;
                a6f.setDateTextColor(j53.b.a);
                Drawable foreground = a6f.w0.getForeground();
                w5f w5f = null;
                w5f w5f2 = foreground instanceof w5f ? (w5f) foreground : null;
                b43 b43 = j53.a;
                k53 k53 = j53.c;
                if (w5f2 != null) {
                    k53.getClass();
                    b43.getClass();
                    w5f2.a();
                }
                View R = a6f.o.R();
                Object foreground2 = R != null ? R.getForeground() : null;
                if (foreground2 instanceof w5f) {
                    w5f = (w5f) foreground2;
                }
                if (w5f != null) {
                    k53.getClass();
                    b43.getClass();
                    w5f.a();
                    return;
                }
                return;
            case 11:
                zid zid = (zid) this.M0;
                zid.setDateTextColor(j53.b.a);
                zid.B0.onThemeChanged(km4.y0.n(zid.getContext()).g());
                return;
            default:
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public y40(Context context) {
        super(context, new vfe(context));
        this.X0 = 8;
    }
}
