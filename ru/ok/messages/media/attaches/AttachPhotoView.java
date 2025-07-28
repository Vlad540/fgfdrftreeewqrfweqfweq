package ru.ok.messages.media.attaches;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.Collections;
import one.me.sdk.zoom.ZoomableDraweeView;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;

public class AttachPhotoView extends ZoomableDraweeView implements ty {
    public static final /* synthetic */ int Y0 = 0;
    public final k93 K0 = vl.b();
    public final GestureDetector L0;
    public uz M0;
    public final uy N0;
    public xm8 O0;
    public o10 P0;
    public boolean Q0;
    public boolean R0;
    public boolean S0;
    public tr6 T0;
    public boolean U0;
    public i22 V0;
    public byc W0;
    public final lhd X0;

    /* JADX WARNING: type inference failed for: r3v0, types: [on4, ty, ru.ok.messages.media.attaches.AttachPhotoView, android.view.View, java.lang.Object] */
    public AttachPhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        GestureDetector gestureDetector = new GestureDetector(context, new tz(0, this));
        this.L0 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        z66 z66 = new z66(getResources());
        z66.l = jlc.j;
        z66.b = 0;
        setHierarchy(z66.a());
        this.N0 = new uy(this, this);
        this.X0 = new lhd(26, (Object) (knc) this.K0.getAccessor().c(knc.class));
    }

    private Animatable getAnimatable() {
        if (getController() != null) {
            return getController().c();
        }
        return null;
    }

    public final void a(o10 o10) {
        s(g10.b);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [one.me.sdk.zoom.ZoomableDraweeView, on4, ru.ok.messages.media.attaches.AttachPhotoView, android.view.View] */
    public final void b(o10 o10) {
        v06 v1;
        if (this.U0) {
            to8 l = this.K0.l();
            vo8 vo8 = this.O0.a;
            l.getClass();
            l.t(vo8, o10.q, new cz0());
        } else if (TextUtils.isEmpty(o10.b.x0) || !TextUtils.isEmpty(o10.r) || getAnimatable() != null) {
            if (getAnimatable() == null) {
                setController(this.N0.c(getController(), true, false, false).a());
                uz uzVar = this.M0;
                if (uzVar != null) {
                    ((FrgAttachPhoto) uzVar).F1(false);
                }
            } else if (getAnimatable().isRunning()) {
                getAnimatable().stop();
            } else {
                getAnimatable().start();
            }
            invalidate();
        } else {
            uz uzVar2 = this.M0;
            if (uzVar2 != null) {
                FrgAttachPhoto frgAttachPhoto = (FrgAttachPhoto) uzVar2;
                kd9 kd9 = frgAttachPhoto.O1;
                if (!(kd9 == null || !kd9.a() || (v1 = frgAttachPhoto.s1()) == null)) {
                    ((ActAttachesView) v1).e();
                }
                frgAttachPhoto.G1(true);
            }
        }
    }

    public final void c(o10 o10) {
        if (!o10.n.e()) {
            s(g10.a);
        } else {
            setController(this.N0.c(getController(), true, false, ete.T(o10, this.O0)).a());
        }
    }

    public final void d(o10 o10) {
    }

    public final void e(o10 o10, xm8 xm8) {
        uz uzVar = this.M0;
        if (uzVar != null) {
            FrgAttachPhoto frgAttachPhoto = (FrgAttachPhoto) uzVar;
            luf u = frgAttachPhoto.u1.u();
            vo8 vo8 = frgAttachPhoto.G1.a;
            long j = vo8.x0;
            xhd xhd = md4.o;
            u.a(new j0d(j, Collections.singletonList(Long.valueOf(vo8.b)), (j63) null, true, vo8.Y0));
        }
    }

    public final boolean k(o10 o10) {
        return getAnimatable() != null && getAnimatable().isRunning();
    }

    public final void n(Throwable th) {
        super.n(th);
        udd.s("ru.ok.messages.media.attaches.AttachPhotoView", "Set photo attach failed, messageId " + this.O0.a.b, th);
        if (!(th instanceof NullPointerException)) {
            s(g10.o);
        }
    }

    public final void o(oq6 oq6) {
        boolean z;
        super.o(oq6);
        if (oq6 instanceof z03) {
            xs7.f((z03) oq6, this.P0);
        }
        if (!ete.G(this.P0)) {
            if (!this.P0.f() || TextUtils.isEmpty(this.P0.b.x0)) {
                fr6 u = a06.u();
                tr6 tr6 = this.T0;
                if (tr6 == null) {
                    u.getClass();
                    z = false;
                } else {
                    e13 e13 = u.f.get(u.h.l(tr6, (Object) null));
                    try {
                        z = e13.n0(e13);
                    } finally {
                        e13.S(e13);
                    }
                }
                if (z && !this.P0.n.c()) {
                    s(g10.c);
                    if (this.K0.n().c.g.getBoolean("app.media.save.to.gallery", false)) {
                        sz szVar = new sz(this, 0, oq6);
                        pv0 pv0 = new pv0(23);
                        mbe q = this.K0.q();
                        q.getClass();
                        tic.a(szVar, ((nbe) q).a(), (j6) null, pv0, (qmc) null);
                    }
                }
            }
        }
    }

    public final void onAttachedToWindow() {
        AttachPhotoView.super.onAttachedToWindow();
        uy uyVar = this.N0;
        if (uyVar != null) {
            uyVar.i();
        }
    }

    public final void onDetachedFromWindow() {
        AttachPhotoView.super.onDetachedFromWindow();
        uy uyVar = this.N0;
        if (uyVar != null) {
            tic.b(uyVar.t);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [one.me.sdk.zoom.ZoomableDraweeView, ru.ok.messages.media.attaches.AttachPhotoView, android.widget.ImageView, android.view.View] */
    public final void onDraw(Canvas canvas) {
        byc byc;
        getDrawable().setBounds(0, 0, getWidth(), getHeight());
        super.onDraw(canvas);
        if (!this.P0.n.c()) {
            this.N0.b(canvas, getDrawable().getBounds(), this.U0);
        }
        if (this.U0 && (byc = this.W0) != null) {
            byc.draw(canvas);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [on4, ru.ok.messages.media.attaches.AttachPhotoView, android.view.View] */
    public final void onMeasure(int i, int i2) {
        o10 o10;
        boolean J = ete.J(this.P0);
        if (!this.Q0 || (!this.P0.f() && !J)) {
            AttachPhotoView.super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size <= 0 || size2 <= 0 || (o10 = this.P0) == null) {
            AttachPhotoView.super.onMeasure(i, i2);
            return;
        }
        a10 a10 = J ? o10.j.d.b : o10.b;
        int[] s = at7.s(size, size2, a10.c, a10.o);
        setMeasuredDimension(s[0], s[1]);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ru.ok.messages.media.attaches.AttachPhotoView, android.view.View] */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        AttachPhotoView.super.onSizeChanged(i, i2, i3, i4);
        byc byc = this.W0;
        if (byc != null) {
            byc.setBounds(0, 0, i, i2);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        GestureDetector gestureDetector = this.L0;
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
        }
        if (!this.P0.n.c()) {
            return true;
        }
        if (this.P0.f() && this.P0.b.X) {
            return true;
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [one.me.sdk.zoom.ZoomableDraweeView, on4, ru.ok.messages.media.attaches.AttachPhotoView, android.view.View] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void r(defpackage.o10 r8, defpackage.xm8 r9) {
        /*
            r7 = this;
            o10 r0 = r7.P0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001b
            java.lang.String r3 = r8.q
            java.lang.String r0 = r0.q
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x001b
            o10 r0 = r7.P0
            g10 r0 = r0.n
            g10 r3 = r8.n
            if (r0 == r3) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = r2
            goto L_0x001c
        L_0x001b:
            r0 = r1
        L_0x001c:
            o10 r3 = r7.P0
            boolean r3 = ete.T(r3, r9)
            boolean r4 = ete.T(r8, r9)
            if (r3 == r4) goto L_0x002a
            r3 = r1
            goto L_0x002b
        L_0x002a:
            r3 = r2
        L_0x002b:
            o10 r4 = r7.P0
            if (r4 == 0) goto L_0x0051
            g10 r5 = r8.n
            g10 r4 = r4.n
            if (r4 == r5) goto L_0x0051
            boolean r4 = r5.c()
            if (r4 == 0) goto L_0x0051
            o10 r4 = r7.P0
            boolean r4 = r4.f()
            if (r4 == 0) goto L_0x0051
            o10 r4 = r7.P0
            a10 r4 = r4.b
            java.lang.String r4 = r4.x0
            boolean r4 = r1g.p(r4)
            if (r4 != 0) goto L_0x0051
            r4 = r1
            goto L_0x0052
        L_0x0051:
            r4 = r2
        L_0x0052:
            if (r0 != 0) goto L_0x005b
            if (r4 != 0) goto L_0x005b
            if (r3 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r0 = r2
            goto L_0x005c
        L_0x005b:
            r0 = r1
        L_0x005c:
            r7.O0 = r9
            r7.P0 = r8
            uy r4 = r7.N0
            r5 = 0
            r4.u = r5
            ru.ok.messages.video.widgets.LiveVideoPlaceHolderView r4 = r4.s
            if (r4 != 0) goto L_0x006a
            goto L_0x006d
        L_0x006a:
            r4.setCorners(r5)
        L_0x006d:
            uy r4 = r7.N0
            i22 r5 = r7.V0
            r4.f(r8, r9, r5)
            uy r4 = r7.N0
            ln4 r5 = r7.getHierarchy()
            y66 r5 = (y66) r5
            jlc r6 = jlc.j
            r4.a(r5, r6)
            if (r0 == 0) goto L_0x0111
            o10 r0 = r7.P0
            boolean r9 = ete.T(r0, r9)
            r7.U0 = r9
            uy r9 = r7.N0
            gn4 r0 = r7.getController()
            boolean r4 = r7.U0
            ywa r9 = r9.c(r0, r2, r2, r4)
            boolean r0 = r7.U0
            if (r0 == 0) goto L_0x00b7
            byc r0 = new byc
            android.content.Context r4 = r7.getContext()
            r5 = 48
            int r5 = defpackage.dh4.b(r5)
            r0.<init>(r4, r5)
            r7.W0 = r0
            int r4 = r7.getMeasuredWidth()
            int r5 = r7.getMeasuredHeight()
            r0.setBounds(r2, r2, r4, r5)
        L_0x00b7:
            android.content.Context r0 = r7.getContext()
            boolean r2 = r7.S0
            boolean r4 = r7.R0
            r1 = r1 ^ r4
            z3d.d(r0, r8, r9, r2, r1)
            boolean r0 = r7.R0
            if (r0 == 0) goto L_0x00fb
            o10 r0 = r7.P0
            boolean r0 = r0.f()
            if (r0 == 0) goto L_0x00fb
            o10 r0 = r7.P0
            a10 r0 = r0.b
            java.lang.String r0 = r0.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00fb
            o10 r0 = r7.P0
            a10 r0 = r0.b
            java.lang.String r0 = r0.a
            fj0 r1 = defpackage.fj0.b
            ej0 r2 = defpackage.ej0.b
            java.lang.String r0 = vx3.t(r0, r1, r2)
            java.lang.String r0 = at7.y(r0)
            android.net.Uri r0 = defpackage.mg5.r(r0)
            ur6 r0 = ur6.d(r0)
            tr6 r0 = r0.a()
            r9.f = r0
        L_0x00fb:
            java.lang.Object r0 = r9.e
            tr6 r0 = (tr6) r0
            r7.T0 = r0
            xwa r9 = r9.a()
            r7.setController(r9)
            if (r3 == 0) goto L_0x0111
            boolean r9 = r7.U0
            if (r9 != 0) goto L_0x0111
            r7.b(r8)
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.AttachPhotoView.r(o10, xm8):void");
    }

    public final void s(g10 g10) {
        xm8 u = this.K0.l().u(this.O0.a, this.P0.q, g10);
        this.O0 = u;
        uz uzVar = this.M0;
        int i = 0;
        if (uzVar != null) {
            FrgAttachPhoto frgAttachPhoto = (FrgAttachPhoto) uzVar;
            if (frgAttachPhoto.s1() != null) {
                ((ActAttachesView) frgAttachPhoto.s1()).m0(u);
            }
            frgAttachPhoto.G1 = u;
            int i2 = 0;
            while (true) {
                if (i2 >= frgAttachPhoto.G1.a.D0.v()) {
                    break;
                } else if (frgAttachPhoto.G1.a.D0.u(i2).q.equals(frgAttachPhoto.H1.q)) {
                    frgAttachPhoto.H1 = frgAttachPhoto.G1.a.D0.u(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        while (true) {
            if (i >= this.O0.a.D0.v()) {
                i = -1;
                break;
            } else if (this.O0.a.D0.u(i).q.equals(this.P0.q)) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            r(this.O0.a.D0.u(i), this.O0);
        }
    }

    public void setListener(uz uzVar) {
        this.M0 = uzVar;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [ru.ok.messages.media.attaches.AttachPhotoView, android.view.View] */
    public void setWrapContentMeasure(boolean z) {
        o10 o10;
        this.Q0 = z;
        boolean J = ete.J(this.P0);
        if (getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0 || (o10 = this.P0) == null || (!o10.f() && !J)) {
            requestLayout();
            return;
        }
        a10 a10 = J ? this.P0.j.d.b : this.P0.b;
        int[] s = at7.s(getMeasuredWidth(), getMeasuredHeight(), a10.c, a10.o);
        int i = s[0] / 2;
        int i2 = s[1] / 2;
        layout((getMeasuredWidth() / 2) - i, (getMeasuredHeight() / 2) - i2, (getMeasuredWidth() / 2) + i, (getMeasuredHeight() / 2) + i2);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ru.ok.messages.media.attaches.AttachPhotoView, android.view.View] */
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable instanceof u10) {
            return true;
        }
        return AttachPhotoView.super.verifyDrawable(drawable);
    }
}
