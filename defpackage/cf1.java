package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.WindowManager;
import android.widget.FrameLayout;

/* renamed from: cf1  reason: default package */
public final class cf1 extends FrameLayout {
    public static final /* synthetic */ k77[] B0;
    public final bf1 A0;
    public final t97 a = ez3.O(3, new a01(22));
    public final r7e b;
    public final t97 c;
    public rwa o;
    public final PointF w0;
    public final bf1 x0;
    public final bf1 y0;
    public af1 z0;

    static {
        Class<cf1> cls = cf1.class;
        B0 = new k77[]{new hc9(cls, "boundariesOffset", "getBoundariesOffset()Lone/me/calls/ui/ui/pip/fake/boundaries/PipBoundariesOffset;"), c3d.g(m7c.a, cls, "pipTheme", "getPipTheme()Lone/me/sdk/design/OneMeTheme;"), new hc9(cls, "pipMode", "getPipMode()Lone/me/calls/ui/view/pip/CallPipView$Companion$PipMode;")};
    }

    public cf1(Context context) {
        super(context, (AttributeSet) null);
        this.b = new r7e(new b5(context, this));
        this.c = bh1.a.c();
        this.o = pwa.a;
        this.w0 = new PointF();
        this.x0 = new bf1(new ewa(0, 0), this);
        this.y0 = new bf1(this, 0);
        this.A0 = new bf1(this, 1);
        setLayoutParams(new FrameLayout.LayoutParams(a24.X(((float) 118) * dh4.c().getDisplayMetrics().density), a24.X(((float) 174) * dh4.c().getDisplayMetrics().density)));
        addView(getFakePipView());
    }

    /* access modifiers changed from: private */
    public final sm1 getFakePipView() {
        return (sm1) this.b.getValue();
    }

    private final int getFlag() {
        return ((Number) this.a.getValue()).intValue();
    }

    /* access modifiers changed from: private */
    public final l81 getPipPositionMediator() {
        return (l81) this.c.getValue();
    }

    public final void c(int i, int i2, int i3, int i4) {
        float f = (float) i;
        float f2 = (float) i2;
        this.o.q(f, f2, i3 - i, i4 - i2, getBoundariesOffset());
        PointF pointF = this.w0;
        if (!(!(pointF.x == 0.0f || pointF.y == 0.0f))) {
            pointF = null;
        }
        if (pointF != null) {
            this.o.j(pointF.x - f, pointF.y - f2);
        }
    }

    public final void d(bga bga) {
        sm1 fakePipView = getFakePipView();
        CharSequence charSequence = bga.j;
        k77[] k77Arr = sm1.p1;
        fakePipView.K((String) null, charSequence);
        fakePipView.setAvatar(bga.a);
        fakePipView.setButtonAction(bga.h);
        fakePipView.I(bga.d);
        fakePipView.G(bga.f);
        fakePipView.setOpponentVideo(bga.g);
    }

    public final af1 getApplicationPipDepended() {
        return this.z0;
    }

    public final ewa getBoundariesOffset() {
        k77 k77 = B0[0];
        return (ewa) this.x0.b;
    }

    public final ze1 getPipMode() {
        k77 k77 = B0[2];
        return (ze1) this.A0.b;
    }

    public final pda getPipTheme() {
        k77 k77 = B0[1];
        return (pda) this.y0.b;
    }

    public final WindowManager.LayoutParams getWindowsViewLayoutParams() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(a24.X(((float) 118) * dh4.c().getDisplayMetrics().density), a24.X(((float) 174) * dh4.c().getDisplayMetrics().density), 1000, getFlag(), -3);
        layoutParams.x = 0;
        layoutParams.y = 0;
        layoutParams.gravity = 51;
        return layoutParams;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.o.b(motionEvent);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        c(i, i2, i3, i4);
    }

    public final void setApplicationPipDepended(af1 af1) {
        this.z0 = af1;
    }

    public final void setBackgroundCorners(float f) {
        getFakePipView().setBackgroundCorners(f);
    }

    public final void setBoundariesOffset(ewa ewa) {
        this.x0.o1(this, B0[0], ewa);
    }

    public final void setListener(pm1 pm1) {
        sm1 fakePipView = getFakePipView();
        fakePipView.l1 = le1.c;
        fakePipView.f1 = pm1;
    }

    public final void setPipMode(ze1 ze1) {
        this.A0.o1(this, B0[2], ze1);
    }

    public final void setPipTheme(pda pda) {
        this.y0.o1(this, B0[1], pda);
    }

    public final void setStartPosition(PointF pointF) {
        if (pointF != null) {
            float f = pointF.x;
            float f2 = pointF.y;
            PointF pointF2 = this.w0;
            pointF2.x = f;
            pointF2.y = f2;
        }
        c(getLeft(), getTop(), getRight(), getBottom());
    }

    public final void setVideoLayoutUpdatesControllerProvider(s16 s16) {
        getFakePipView().setVideoLayoutUpdatesControllerProvider(s16);
    }
}
