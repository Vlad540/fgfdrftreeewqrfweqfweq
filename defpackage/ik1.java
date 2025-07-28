package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import java.util.List;

/* renamed from: ik1  reason: default package */
public final class ik1 extends ConstraintLayout implements ms3, bi1, zh1, bwa {
    public final gm1 K0;
    public final t97 L0 = bh1.a.c();
    public final t97 M0 = ez3.O(3, new dk1(this, 4));
    public b N0;
    public final t97 O0;
    public final t97 P0;
    public final t97 Q0;
    public final t97 R0;
    public PointF S0;
    public final ViewStub T0;
    public final ViewStub U0;
    public f5f V0;
    public ns3 W0;
    public final t97 X0;
    public bk1 Y0;
    public ws7 Z0;
    public bga a1;
    public boolean b1;
    public gk1 c1;
    public ewa d1;

    public ik1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.O0 = ez3.O(3, new fk1(context, this, 0));
        this.P0 = ez3.O(3, new fk1(context, this, 1));
        this.Q0 = ez3.O(3, new b5(context, 11));
        this.R0 = ez3.O(3, new b5(context, 12));
        this.X0 = ez3.O(3, new di1(8));
        setLayoutParams(new re3(-1, -1));
        gm1 gm1 = new gm1(context, (AttributeSet) null);
        gm1.setId(uob.call_user_full_avatar);
        gm1.setVideoLayoutUpdatesControllerProvider(new dk1(this, 5));
        this.K0 = gm1;
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(uob.call_speaker_opponents_view);
        this.T0 = viewStub;
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(o1a.C1);
        this.U0 = viewStub2;
        addView(gm1, -1, -1);
        addView(viewStub2);
        addView(viewStub);
        addView(getBottomSpaceView());
        addView(getTopSpaceView());
        bf3 p = a06.p(this);
        int id = getTopSpaceView().getId();
        p.d(id, 3, 0, 3);
        p.d(id, 6, 0, 6);
        p.d(id, 7, 0, 7);
        int id2 = viewStub2.getId();
        p.d(id2, 7, 0, 7);
        hr1.q((float) 16, dh4.c().getDisplayMetrics().density, new hw9(p, 7, id2, 4));
        p.d(id2, 4, 0, 4);
        int id3 = gm1.getId();
        p.d(id3, 3, 0, 3);
        p.d(id3, 4, 0, 4);
        p.d(id3, 6, 0, 6);
        p.d(id3, 7, 0, 7);
        int id4 = viewStub.getId();
        p.d(id4, 4, getBottomSpaceView().getId(), 3);
        hr1.q((float) 4, dh4.c().getDisplayMetrics().density, new hw9(p, 4, id4, 4));
        p.d(id4, 6, 0, 6);
        p.d(id4, 7, 0, 7);
        int id5 = getBottomSpaceView().getId();
        p.d(id5, 4, 0, 4);
        p.d(id5, 6, 0, 6);
        p.d(id5, 7, 0, 7);
        p.a(this);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ed1, ig7] */
    public static void A(ik1 ik1, List list) {
        ik1.getOpponentsAdapter().E(list);
    }

    public static void B(ik1 ik1) {
        ik1.D(ik1.getMarginTop());
        ik1.u(ik1.getMarginBottom());
    }

    private final Space getBottomSpaceView() {
        return (Space) this.R0.getValue();
    }

    private final cf1 getFakePipView() {
        return (cf1) this.P0.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = ((defpackage.rs3) r1).k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.ls3 getMarginBottom() {
        /*
            r1 = this;
            ls3 r0 = defpackage.ls3.d
            ns3 r1 = r1.W0
            if (r1 == 0) goto L_0x000e
            rs3 r1 = (defpackage.rs3) r1
            ls3 r1 = r1.k
            if (r1 != 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik1.getMarginBottom():ls3");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = ((defpackage.rs3) r1).j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.ls3 getMarginTop() {
        /*
            r1 = this;
            ls3 r0 = defpackage.ls3.d
            ns3 r1 = r1.W0
            if (r1 == 0) goto L_0x000e
            rs3 r1 = (defpackage.rs3) r1
            ls3 r1 = r1.j
            if (r1 != 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik1.getMarginTop():ls3");
    }

    private final ed1 getOpponentsAdapter() {
        return (ed1) this.M0.getValue();
    }

    private final RecyclerView getOpponentsView() {
        return (RecyclerView) this.O0.getValue();
    }

    private final hwa getPipAnimation() {
        return (hwa) this.X0.getValue();
    }

    private final l81 getPipPositionMediator() {
        return (l81) this.L0.getValue();
    }

    private final Space getTopSpaceView() {
        return (Space) this.Q0.getValue();
    }

    private final void setMainSpeaker(ws7 ws7) {
        dm1 dm1;
        le1 le1;
        bk1 bk1;
        ws7 ws72 = this.Z0;
        boolean z = !hhd.f(ws72 != null ? ws72.h : null, ws7 != null ? ws7.h : null);
        this.Z0 = ws7;
        if (ws7 == null) {
            dm1 = dm1.o;
        } else {
            boolean z2 = ws7.e;
            dm1 = !z2 ? dm1.b : (!ws7.f || !z2 || !ws7.g) ? dm1.a : dm1.c;
        }
        gm1 gm1 = this.K0;
        gm1.setBackgroundState(dm1);
        boolean z3 = false;
        boolean z4 = ws7 != null && ws7.g && ws7.e && !ws7.f;
        mz9 mz9 = gm1.K0;
        if (mt0.s(mz9)) {
            gm1.S(z4 ? 128 : 255, false);
        }
        gm1.setRaiseHand(ws7 != null ? ws7.j : false);
        mc0 mc0 = ws7 != null ? ws7.a : null;
        mz9.setAvatarUrl(mc0 != null ? mc0.b : null);
        mz9.setCustomOverlay((oc0) null);
        mz9.g(mc0 != null ? mc0.a : null, true);
        if (ws7 != null) {
            z3 = ws7.d;
        }
        gm1.O(z3);
        gm1.T(ws7 != null ? ws7.h : null);
        gm1.P(ws7 != null ? ws7.m : null, ws7 != null ? ws7.l : null);
        if (ws7 == null || (le1 = ws7.c) == null) {
            le1 = le1.c;
        }
        gm1.setParticipantId(le1);
        if (z && (bk1 = this.Y0) != null) {
            hze hze = ws7 != null ? ws7.h : null;
            ck1 ck1 = (ck1) bk1;
            if (!hhd.f(ck1.b, hze)) {
                ck1.b = hze;
                for (ak1 p : ck1.a) {
                    p.p();
                }
            }
        }
        J(this.b1, (u16) null);
    }

    public static void w(ik1 ik1, ws7 ws7) {
        ik1.setMainSpeaker(ws7);
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [f6c, ed1] */
    public static RecyclerView x(Context context, ik1 ik1) {
        RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
        recyclerView.setId(uob.call_speaker_opponents_view);
        recyclerView.setAdapter(ik1.getOpponentsAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.j(new n51(a24.X(((float) 4) * dh4.c().getDisplayMetrics().density), 1));
        recyclerView.setLayoutParams(new re3(-1, -2));
        b bVar = ik1.N0;
        if (bVar != null) {
            recyclerView.setRecycledViewPool(bVar);
        }
        return recyclerView;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [ed1, ig7] */
    public static void y(boolean z, ik1 ik1, List list) {
        if (z) {
            ik1.getOpponentsAdapter().E(list);
        } else {
            ik1.getOpponentsView().post(new c(ik1, 17, list));
        }
    }

    public final void C(cf1 cf1, PointF pointF) {
        PointF y = kjd.y(cf1.getContext());
        if (getMarginBottom().b() == 0) {
            if (pointF == null) {
                pointF = y;
            }
            this.S0 = pointF;
            return;
        }
        this.S0 = null;
        PointF pointF2 = new PointF(y.x, y.y - ((float) getMarginBottom().a));
        if (pointF != null) {
            if (!(pointF.x == 0.0f || pointF.y == 0.0f)) {
                if (pointF.y > pointF2.y) {
                    pointF = new PointF(pointF.x, pointF2.y);
                }
                cf1.setStartPosition(pointF);
            }
        }
        pointF = pointF2;
        cf1.setStartPosition(pointF);
    }

    public final void D(ls3 ls3) {
        kjd.T(getTopSpaceView(), ls3.b());
        this.K0.D(ls3);
    }

    public final void F(ewa ewa) {
        this.d1 = ewa;
        if (ek8.K(this.U0)) {
            getFakePipView().setBoundariesOffset(ewa);
        }
    }

    public final void G(ws7 ws7, bga bga) {
        boolean z;
        bga bga2 = bga;
        bga bga3 = this.a1;
        if (!(bga3 == null || bga2 == null)) {
            if (!hhd.f(bga3.c, bga2.c)) {
                z = true;
                if (ek8.K(this.U0) || !z) {
                    ws7 ws72 = ws7;
                    setMainSpeaker(ws7);
                    I(bga2);
                }
                I(bga2);
                hwa pipAnimation = getPipAnimation();
                cf1 fakePipView = getFakePipView();
                x2 x2Var = new x2((Object) this, 14, (Object) ws7);
                pipAnimation.getClass();
                gm1 gm1 = this.K0;
                k61 k61 = new k61(x2Var, pipAnimation, gm1, 6);
                RectF rectF = new RectF(gm1.getX(), gm1.getY(), gm1.getX() + ((float) gm1.getMeasuredWidth()), gm1.getY() + ((float) gm1.getMeasuredHeight()));
                RectF rectF2 = new RectF(fakePipView.getX(), fakePipView.getY(), fakePipView.getX() + ((float) fakePipView.getMeasuredWidth()), fakePipView.getY() + ((float) fakePipView.getMeasuredHeight()));
                float width = rectF2.width() / rectF.width();
                float height = rectF2.height() / rectF.height();
                gm1.setPivotX(rectF.top);
                gm1.setPivotY(rectF.left);
                if (hwa.b()) {
                    gm1.setLayerType(2, (Paint) null);
                    fakePipView.setLayerType(2, (Paint) null);
                }
                AnimatorSet animatorSet = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(gm1, View.X, new float[]{rectF.left, rectF2.left});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(gm1, View.Y, new float[]{rectF.top, rectF2.top});
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(gm1, View.SCALE_X, new float[]{1.0f, width});
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(gm1, View.SCALE_Y, new float[]{1.0f, height});
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{0.0f, dh4.c().getDisplayMetrics().density * 16.0f});
                ofFloat5.addUpdateListener(new zf(gm1, 3));
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(fakePipView, View.ALPHA, new float[]{1.0f, 0.0f})});
                animatorSet.setDuration(200);
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.addListener(new gwa(pipAnimation, gm1, fakePipView, rectF, k61));
                animatorSet.start();
                return;
            }
        }
        z = false;
        if (ek8.K(this.U0)) {
        }
        ws7 ws722 = ws7;
        setMainSpeaker(ws7);
        I(bga2);
    }

    public final List H(ks3 ks3, ks3 ks32) {
        lg7 c = hwf.c();
        c.add(ct0.q(getTopSpaceView(), ks3, (ks3) null, 2));
        c.add(ct0.q(getBottomSpaceView(), (ks3) null, ks32, 1));
        if (ek8.K(this.T0)) {
            c.add(ct0.n(getOpponentsView(), ks32.a));
        }
        c.addAll(this.K0.H(ks3, ks32));
        return hwf.a(c);
    }

    public final void I(bga bga) {
        boolean z;
        ViewStub viewStub = this.U0;
        if ((bga != null || ek8.K(viewStub)) && !hhd.f(this.a1, bga)) {
            this.a1 = bga;
            cf1 fakePipView = getFakePipView();
            if (!ek8.K(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int indexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = fakePipView.getLayoutParams().height;
                layoutParams.width = fakePipView.getLayoutParams().width;
                fakePipView.setId(viewStub.getId());
                viewGroup.addView(fakePipView, indexOfChild, layoutParams);
                cf1 fakePipView2 = getFakePipView();
                m81 m81 = (m81) getPipPositionMediator();
                m81.getClass();
                PointF pointF = m81.b;
                C(fakePipView2, new PointF(pointF.x, pointF.y));
                ewa ewa = this.d1;
                if (ewa != null) {
                    getFakePipView().setBoundariesOffset(ewa);
                }
                z = true;
            } else {
                z = false;
            }
            if (bga != null) {
                getFakePipView().d(bga);
            }
            mt0.k(getFakePipView(), bga != null, z ? 0 : 150, (u16) null, 4);
        }
    }

    public final void J(boolean z, u16 u16) {
        ls3 ls3;
        if (ek8.K(this.T0)) {
            ns3 ns3 = this.W0;
            if (!(ns3 == null || (ls3 = ((rs3) ns3).k) == null || ls3.c)) {
                z = false;
            }
            mt0.k(getOpponentsView(), z, 0, u16, 2);
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.K0.a(z);
        }
    }

    public final void d(RectF rectF, boolean z) {
        if (mt0.w(this, z)) {
            float f = rectF.left;
            gm1 gm1 = this.K0;
            gm1.setX(f);
            gm1.setY(rectF.top);
            gm1.setPivotX(0.0f);
            gm1.setPivotY(0.0f);
            gm1.setScaleX(rectF.width() / ((float) gm1.getWidth()));
            gm1.setScaleY(rectF.height() / ((float) gm1.getHeight()));
        }
    }

    public final void e(boolean z) {
        if (ek8.K(this.U0)) {
            cf1 fakePipView = getFakePipView();
            if (mt0.w(fakePipView, z) && getShouldScaleMainOpponent()) {
                fakePipView.setAlpha(0.0f);
            }
        }
    }

    public final void f(lg7 lg7, boolean z, long j) {
        this.K0.f(lg7, z, j);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r3 = r0.h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean getShouldScaleMainOpponent() {
        /*
            r6 = this;
            ws7 r0 = r6.Z0
            bga r6 = r6.a1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0012
            hze r3 = r0.h
            if (r3 == 0) goto L_0x0012
            boolean r3 = r3.c
            if (r3 != r2) goto L_0x0012
            r3 = r2
            goto L_0x0013
        L_0x0012:
            r3 = r1
        L_0x0013:
            if (r6 == 0) goto L_0x001f
            hze r4 = r6.g
            if (r4 == 0) goto L_0x001f
            boolean r4 = r4.c
            if (r4 != r2) goto L_0x001f
            r4 = r2
            goto L_0x0020
        L_0x001f:
            r4 = r1
        L_0x0020:
            if (r0 == 0) goto L_0x002a
            boolean r5 = r0.i
            if (r5 != 0) goto L_0x002a
            if (r3 == 0) goto L_0x002a
        L_0x0028:
            r1 = r2
            goto L_0x0040
        L_0x002a:
            if (r6 == 0) goto L_0x0033
            boolean r5 = r6.i
            if (r5 != 0) goto L_0x0033
            if (r4 == 0) goto L_0x0033
            goto L_0x0040
        L_0x0033:
            if (r0 == 0) goto L_0x003c
            boolean r0 = r0.i
            if (r0 != r2) goto L_0x003c
            if (r3 == 0) goto L_0x003c
            goto L_0x0028
        L_0x003c:
            if (r6 == 0) goto L_0x0040
            boolean r6 = r6.i
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik1.getShouldScaleMainOpponent():boolean");
    }

    public final void h(lg7 lg7, boolean z, long j) {
        this.K0.h(lg7, z, j);
    }

    public final void o(boolean z) {
        if (z) {
            gm1 gm1 = this.K0;
            gm1.o(z);
            gm1.setX(0.0f);
            gm1.setY(0.0f);
            gm1.setPivotX(0.0f);
            gm1.setPivotY(0.0f);
            gm1.setScaleX(1.0f);
            gm1.setScaleY(1.0f);
            if (ek8.K(this.U0)) {
                getFakePipView().setAlpha(1.0f);
            }
        }
    }

    public final void setCallSpeakerMediator(bk1 bk1) {
        this.Y0 = bk1;
    }

    public final void setControlsMediator(ns3 ns3) {
        this.W0 = ns3;
        this.K0.setControlsMediator(ns3);
    }

    public final void setListener(gk1 gk1) {
        this.c1 = gk1;
        this.K0.setListener(gk1);
    }

    public final void setOpponents(List<dga> list) {
        dga dga = (dga) o23.X(list);
        List list2 = dga != null ? dga.c : null;
        if (list2 == null) {
            list2 = hw4.a;
        }
        boolean isEmpty = list2.isEmpty();
        ViewStub viewStub = this.T0;
        if (!isEmpty || ek8.K(viewStub)) {
            ek8.I(viewStub, getOpponentsView(), new dk1(this, 0));
            boolean z = true;
            boolean z2 = !list2.isEmpty();
            if (getOpponentsView().getVisibility() != 0) {
                z = false;
            }
            this.b1 = z2;
            J(z2, new ek1(z, this, list2));
        }
    }

    public final void setOpponentsViewPool(b bVar) {
        if (ek8.K(this.T0)) {
            getOpponentsView().setRecycledViewPool(bVar);
        }
        this.N0 = bVar;
    }

    public final void setStatus(CharSequence charSequence) {
        this.K0.setStatus(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.K0.setName(charSequence);
    }

    public final void setVideoLayoutUpdatesController(f5f f5f) {
        this.V0 = f5f;
    }

    public final void u(ls3 ls3) {
        kjd.S(getBottomSpaceView(), ls3.b());
        if (ek8.K(this.U0) && this.S0 != null) {
            C(getFakePipView(), this.S0);
        }
        this.K0.getClass();
    }
}
