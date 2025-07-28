package one.me.sdk.messagewrite.recordcontrols;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.sdk.messagewrite.MessageWriteWidget;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/sdk/messagewrite/recordcontrols/RecordControlsWidget;", "Lone/me/sdk/arch/Widget;", "Llc3;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "Linc;", "scopeId", "Lz2c;", "type", "(Ljava/lang/String;Lz2c;Lx54;)V", "message-write-widget_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class RecordControlsWidget extends Widget implements lc3 {
    public static final /* synthetic */ k77[] m1;
    public static final fz6 n1 = new dz6(0, 135, 1);
    public static final fz6 o1 = new dz6(135, 275, 1);
    public final n0c A0;
    public final n0c B0;
    public final n0c C0;
    public final n0c D0;
    public final n0c E0;
    public final n0c F0;
    public final n0c G0;
    public final n0c H0;
    public final n0c I0;
    public final n0c J0;
    public final n0c K0;
    public final n0c L0;
    public final n0c M0;
    public final n0c N0;
    public final t97 O0;
    public final t97 P0;
    public final t97 Q0;
    public final t97 R0;
    public final t97 S0;
    public final t97 T0;
    public final t97 U0;
    public final t97 V0;
    public final t97 W0;
    public final t97 X;
    public final t97 X0;
    public final n0c Y;
    public final t97 Y0;
    public final n0c Z;
    public wia Z0;
    public final jr a;
    public wia a1;
    public final t97 b;
    public float b1;
    public final t97 c;
    public float c1;
    public fnd d1;
    public qod e1;
    public final e3 f1;
    public AnimatorSet g1;
    public AnimatorSet h1;
    public AnimatorSet i1;
    public AnimatorSet j1;
    public AnimatorSet k1;
    public AnimatorSet l1;
    public final t97 o;
    public final n0c w0;
    public final n0c x0;
    public final n0c y0;
    public final n0c z0;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: k77[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r1 = 0
            hc9 r2 = new hc9
            java.lang.Class<one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget> r3 = one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.class
            java.lang.String r4 = "parentScopeId"
            java.lang.String r5 = "getParentScopeId-IluPPks()Ljava/lang/String;"
            r2.<init>(r3, r4, r5)
            n7c r4 = m7c.a
            java.lang.String r5 = "type"
            java.lang.String r6 = "getType()Lone/me/sdk/messagewrite/recordcontrols/RecordControlType;"
            khb r4 = defpackage.m4b.g(r4, r3, r5, r6, r1)
            khb r5 = new khb
            java.lang.String r6 = "rootView"
            java.lang.String r7 = "getRootView()Landroid/view/View;"
            r5.<init>(r3, r6, r7, r1)
            khb r6 = new khb
            java.lang.String r7 = "recordingPanel"
            java.lang.String r8 = "getRecordingPanel()Landroid/view/View;"
            r6.<init>(r3, r7, r8, r1)
            khb r7 = new khb
            java.lang.String r8 = "dotView"
            java.lang.String r9 = "getDotView()Landroid/view/View;"
            r7.<init>(r3, r8, r9, r1)
            khb r8 = new khb
            java.lang.String r9 = "durationView"
            java.lang.String r10 = "getDurationView()Landroid/widget/TextView;"
            r8.<init>(r3, r9, r10, r1)
            khb r9 = new khb
            java.lang.String r10 = "trashView"
            java.lang.String r11 = "getTrashView()Landroid/widget/ImageView;"
            r9.<init>(r3, r10, r11, r1)
            khb r10 = new khb
            java.lang.String r11 = "cancelView"
            java.lang.String r12 = "getCancelView()Landroid/widget/TextView;"
            r10.<init>(r3, r11, r12, r1)
            khb r11 = new khb
            java.lang.String r12 = "audioHandFreeRecordView"
            java.lang.String r13 = "getAudioHandFreeRecordView()Landroid/view/View;"
            r11.<init>(r3, r12, r13, r1)
            khb r12 = new khb
            java.lang.String r13 = "waveContainer"
            java.lang.String r14 = "getWaveContainer()Landroid/view/View;"
            r12.<init>(r3, r13, r14, r1)
            khb r13 = new khb
            java.lang.String r14 = "handFreeDotView"
            java.lang.String r15 = "getHandFreeDotView()Landroid/view/View;"
            r13.<init>(r3, r14, r15, r1)
            khb r14 = new khb
            java.lang.String r15 = "playPauseListeningButton"
            java.lang.String r0 = "getPlayPauseListeningButton()Landroid/widget/ImageView;"
            r14.<init>(r3, r15, r0, r1)
            khb r0 = new khb
            java.lang.String r15 = "handFreeDurationView"
            r16 = r14
            java.lang.String r14 = "getHandFreeDurationView()Landroid/widget/TextView;"
            r0.<init>(r3, r15, r14, r1)
            khb r14 = new khb
            java.lang.String r15 = "waveView"
            r17 = r0
            java.lang.String r0 = "getWaveView()Lone/me/sdk/uikit/common/audiowave/AudioWaveRecordView;"
            r14.<init>(r3, r15, r0, r1)
            khb r0 = new khb
            java.lang.String r15 = "removeButton"
            r18 = r14
            java.lang.String r14 = "getRemoveButton()Landroid/widget/ImageView;"
            r0.<init>(r3, r15, r14, r1)
            khb r14 = new khb
            java.lang.String r15 = "pauseRecordingButton"
            r19 = r0
            java.lang.String r0 = "getPauseRecordingButton()Landroid/widget/ImageView;"
            r14.<init>(r3, r15, r0, r1)
            khb r0 = new khb
            java.lang.String r15 = "playRecordingButton"
            r20 = r14
            java.lang.String r14 = "getPlayRecordingButton()Landroid/widget/ImageView;"
            r0.<init>(r3, r15, r14, r1)
            khb r14 = new khb
            java.lang.String r15 = "actionViewContainer"
            r21 = r0
            java.lang.String r0 = "getActionViewContainer()Landroid/view/View;"
            r14.<init>(r3, r15, r0, r1)
            khb r0 = new khb
            java.lang.String r15 = "actionViewBgContainer"
            r22 = r14
            java.lang.String r14 = "getActionViewBgContainer()Landroid/view/View;"
            r0.<init>(r3, r15, r14, r1)
            khb r14 = new khb
            java.lang.String r15 = "actionViewBackground"
            r23 = r0
            java.lang.String r0 = "getActionViewBackground()Landroid/view/View;"
            r14.<init>(r3, r15, r0, r1)
            khb r0 = new khb
            java.lang.String r15 = "actionView"
            r24 = r14
            java.lang.String r14 = "getActionView()Landroid/widget/ImageView;"
            r0.<init>(r3, r15, r14, r1)
            khb r14 = new khb
            java.lang.String r15 = "lockView"
            r25 = r0
            java.lang.String r0 = "getLockView()Landroid/view/View;"
            r14.<init>(r3, r15, r0, r1)
            hc9 r0 = new hc9
            java.lang.String r15 = "prepareDataAndOnPauseWaveJob"
            java.lang.String r1 = "getPrepareDataAndOnPauseWaveJob()Lkotlinx/coroutines/Job;"
            r0.<init>(r3, r15, r1)
            r1 = 23
            k77[] r1 = new k77[r1]
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r4
            r2 = 2
            r1[r2] = r5
            r2 = 3
            r1[r2] = r6
            r2 = 4
            r1[r2] = r7
            r2 = 5
            r1[r2] = r8
            r2 = 6
            r1[r2] = r9
            r2 = 7
            r1[r2] = r10
            r2 = 8
            r1[r2] = r11
            r2 = 9
            r1[r2] = r12
            r2 = 10
            r1[r2] = r13
            r2 = 11
            r1[r2] = r16
            r2 = 12
            r1[r2] = r17
            r2 = 13
            r1[r2] = r18
            r2 = 14
            r1[r2] = r19
            r2 = 15
            r1[r2] = r20
            r2 = 16
            r1[r2] = r21
            r2 = 17
            r1[r2] = r22
            r2 = 18
            r1[r2] = r23
            r2 = 19
            r1[r2] = r24
            r2 = 20
            r1[r2] = r25
            r2 = 21
            r1[r2] = r14
            r2 = 22
            r1[r2] = r0
            m1 = r1
            fz6 r0 = new fz6
            r1 = 135(0x87, float:1.89E-43)
            r2 = 0
            r3 = 1
            r0.<init>(r2, r1, r3)
            n1 = r0
            fz6 r0 = new fz6
            r2 = 275(0x113, float:3.85E-43)
            r0.<init>(r1, r2, r3)
            o1 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.<clinit>():void");
    }

    public RecordControlsWidget(String str, z2c z2c, x54 x54) {
        this(jjd.j(new wia[]{new wia(Widget.ARG_SCOPE_ID, new inc(str)), new wia("arg_key_type", z2c)}));
    }

    public static final j03 l0(RecordControlsWidget recordControlsWidget) {
        j03 parentController = recordControlsWidget.getParentController();
        if (parentController instanceof j03) {
            return parentController;
        }
        return null;
    }

    public static final View m0(RecordControlsWidget recordControlsWidget) {
        recordControlsWidget.getClass();
        return (View) recordControlsWidget.Z.T0(recordControlsWidget, m1[3]);
    }

    public static final void n0(RecordControlsWidget recordControlsWidget) {
        wia wia = recordControlsWidget.a1;
        if (wia != null) {
            recordControlsWidget.B0().setTranslationX(((Number) wia.a).floatValue());
            recordControlsWidget.B0().setTranslationY(((Number) wia.b).floatValue());
        }
        wia wia2 = recordControlsWidget.Z0;
        if (wia2 != null) {
            recordControlsWidget.t0().setX(((Number) wia2.a).floatValue());
            recordControlsWidget.t0().setY(((Number) wia2.b).floatValue());
        }
        recordControlsWidget.Z0 = null;
        recordControlsWidget.a1 = null;
    }

    public static final void o0(RecordControlsWidget recordControlsWidget) {
        recordControlsWidget.getClass();
        AnimatorSet animatorSet = new AnimatorSet();
        recordControlsWidget.l1 = animatorSet;
        animatorSet.playTogether(new Animator[]{z3d.e(recordControlsWidget.z0(), View.ALPHA, 1.0f, 0.0f, 1000, 1000, 2, -1)});
        AnimatorSet animatorSet2 = recordControlsWidget.l1;
        if (animatorSet2 != null) {
            animatorSet2.addListener(new f4c(recordControlsWidget, 13));
        }
        AnimatorSet animatorSet3 = recordControlsWidget.l1;
        if (animatorSet3 != null) {
            animatorSet3.start();
        }
    }

    public final TextView A0() {
        return (TextView) this.E0.T0(this, m1[12]);
    }

    public final View B0() {
        return (View) this.N0.T0(this, m1[21]);
    }

    public final vp8 C0() {
        vp8 parentController = getParentController();
        if (parentController instanceof vp8) {
            return parentController;
        }
        return null;
    }

    public final Drawable D0() {
        return (Drawable) this.Q0.getValue();
    }

    public final ImageView E0() {
        return (ImageView) this.H0.T0(this, m1[15]);
    }

    public final ImageView F0() {
        return (ImageView) this.D0.T0(this, m1[11]);
    }

    public final void G() {
        L0().y();
    }

    public final ImageView G0() {
        return (ImageView) this.I0.T0(this, m1[16]);
    }

    public final ImageView H0() {
        return (ImageView) this.G0.T0(this, m1[14]);
    }

    public final View I0() {
        return (View) this.Y.T0(this, m1[2]);
    }

    public final ImageView J0() {
        return (ImageView) this.y0.T0(this, m1[6]);
    }

    public final z2c K0() {
        k77 k77 = m1[1];
        return (z2c) this.a.a(this);
    }

    public final y3c L0() {
        return (y3c) this.c.getValue();
    }

    public final GradientDrawable M0() {
        return (GradientDrawable) this.V0.getValue();
    }

    public final q60 N0() {
        return (q60) this.F0.T0(this, m1[13]);
    }

    public final void O0() {
        AnimatorSet animatorSet = this.h1;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.h1;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            AnimatorSet animatorSet3 = this.h1;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        AnimatorSet animatorSet4 = this.k1;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
        this.h1 = new AnimatorSet();
        lg7 c2 = hwf.c();
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{a24.X(((float) 48) * dh4.c().getDisplayMetrics().density), a24.X(((float) 96) * dh4.c().getDisplayMetrics().density)}).setDuration(300);
        duration.addUpdateListener(new z3c(this, 7));
        c2.add(duration);
        View u0 = u0();
        Property property = View.ALPHA;
        c2.add(z3d.f(u0, property, 0.0f, 1.0f, 300, 0, 112));
        ImageView H02 = H0();
        Property property2 = View.TRANSLATION_Y;
        c2.add(z3d.f(H02, property2, dh4.c().getDisplayMetrics().density * 48.0f, 0.0f, 300, 0, 112));
        c2.add(z3d.f(H0(), property, 0.0f, 1.0f, 150, 150, 96));
        c2.add(z3d.f(E0(), property2, dh4.c().getDisplayMetrics().density * 48.0f, 0.0f, 300, 0, 112));
        Property property3 = property;
        c2.add(z3d.f(E0(), property3, 0.0f, 1.0f, 150, 150, 96));
        c2.add(z3d.f(w0(), property3, w0().getAlpha(), 0.0f, 150, 0, 112));
        c2.add(z3d.f(w0(), property2, 0.0f, dh4.c().getDisplayMetrics().density * 48.0f, 300, 0, 112));
        c2.add(z3d.f(x0(), property, 1.0f, 0.0f, 150, 0, 112));
        c2.add(z3d.f(x0(), property2, 0.0f, dh4.c().getDisplayMetrics().density * 48.0f, 300, 0, 112));
        c2.add(z3d.f(v0(), property, v0().getAlpha(), 0.0f, 150, 0, 112));
        c2.add(z3d.f(v0(), property2, v0().getTranslationY(), dh4.c().getDisplayMetrics().density * 48.0f, 300, 0, 112));
        wia wia = this.a1;
        c2.add(z3d.f(B0(), property2, B0().getTranslationY(), wia != null ? ((Number) wia.b).floatValue() : 0.0f, 300, 0, 112));
        c2.add(z3d.f(B0(), property, 1.0f, 0.0f, 300, 0, 112));
        c2.add(z3d.f(t0(), property2, t0().getTranslationY(), 0.0f, 150, 0, 112));
        c2.addAll(z3d.M(s0(), 1.0f, ((float) a24.X(((float) 36) * dh4.c().getDisplayMetrics().density)) / (dh4.c().getDisplayMetrics().density * 84.0f), 300, 0));
        lg7 a2 = hwf.a(c2);
        AnimatorSet animatorSet5 = this.h1;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new f4c(this, 6));
        }
        AnimatorSet animatorSet6 = this.h1;
        if (animatorSet6 != null) {
            animatorSet6.addListener(new f4c(this, 5));
        }
        AnimatorSet animatorSet7 = this.h1;
        if (animatorSet7 != null) {
            animatorSet7.setInterpolator(y0());
        }
        AnimatorSet animatorSet8 = this.h1;
        if (animatorSet8 != null) {
            animatorSet8.playTogether(a2);
        }
        AnimatorSet animatorSet9 = this.h1;
        if (animatorSet9 != null) {
            animatorSet9.start();
        }
    }

    public final void P0() {
        AnimatorSet animatorSet = this.h1;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.h1;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            AnimatorSet animatorSet3 = this.h1;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.h1 = new AnimatorSet();
        lg7 c2 = hwf.c();
        c2.addAll(z3d.M(E0(), 1.0f, 0.5f, 150, 0));
        ImageView E02 = E0();
        Property property = View.ALPHA;
        c2.add(z3d.f(E02, property, 1.0f, 0.0f, 150, 0, 112));
        c2.addAll(z3d.M(z0(), 1.0f, 0.5f, 150, 0));
        c2.add(z3d.f(z0(), property, 1.0f, 0.0f, 150, 0, 112));
        c2.addAll(z3d.M(G0(), 0.5f, 1.0f, 150, 50));
        c2.add(z3d.f(G0(), property, 0.0f, 1.0f, 150, 50, 96));
        c2.addAll(z3d.M(F0(), 0.5f, 1.0f, 150, 50));
        c2.add(z3d.f(F0(), property, 0.5f, 1.0f, 150, 50, 96));
        s59 s59 = km4.y0;
        cfe text = s59.r(q0()).getText();
        s59.r(q0());
        ValueAnimator ofArgb = ValueAnimator.ofArgb(new int[]{text.e, -1});
        ofArgb.setDuration(150);
        ofArgb.setStartDelay(50);
        ofArgb.addUpdateListener(new z3c(this, 1));
        c2.add(ofArgb);
        s59.r(x0()).b().a.getClass();
        int G = r1g.G(-16745729, 0.08f);
        s59.r(x0());
        ValueAnimator ofArgb2 = ValueAnimator.ofArgb(new int[]{G, -16745729});
        ofArgb2.setDuration(150);
        ofArgb2.setStartDelay(50);
        ofArgb2.addUpdateListener(new z3c(this, 2));
        c2.add(ofArgb2);
        Object obj = new Object();
        s59.r(x0());
        int G2 = r1g.G(-16745729, 0.5f);
        s59.r(x0());
        ValueAnimator ofArgb3 = ValueAnimator.ofArgb(new int[]{G2, r1g.G(-1, 0.5f)});
        ofArgb3.setDuration(150);
        ofArgb3.setStartDelay(50);
        ofArgb3.addUpdateListener(new yl(obj, 5, this));
        c2.add(ofArgb3);
        lg7 a2 = hwf.a(c2);
        AnimatorSet animatorSet4 = this.h1;
        if (animatorSet4 != null) {
            animatorSet4.addListener(new f4c(this, 8));
        }
        AnimatorSet animatorSet5 = this.h1;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new f4c(this, 7));
        }
        AnimatorSet animatorSet6 = this.h1;
        if (animatorSet6 != null) {
            animatorSet6.setInterpolator(y0());
        }
        AnimatorSet animatorSet7 = this.h1;
        if (animatorSet7 != null) {
            animatorSet7.playTogether(a2);
        }
        AnimatorSet animatorSet8 = this.h1;
        if (animatorSet8 != null) {
            animatorSet8.start();
        }
    }

    public final void Q0(boolean z) {
        AnimatorSet animatorSet = this.h1;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.h1;
            if (animatorSet2 != null) {
                animatorSet2.end();
            }
            AnimatorSet animatorSet3 = this.h1;
            if (animatorSet3 != null) {
                animatorSet3.cancel();
            }
        }
        this.h1 = new AnimatorSet();
        lg7 c2 = hwf.c();
        View w02 = w0();
        Property property = View.ALPHA;
        c2.add(z3d.f(w02, property, 0.0f, 1.0f, 300, 150, 96));
        View w03 = w0();
        Property property2 = View.TRANSLATION_X;
        c2.add(z3d.f(w03, property2, dh4.c().getDisplayMetrics().density * 72.0f, 0.0f, 300, 150, 96));
        c2.add(z3d.f(x0(), property, 0.0f, 1.0f, 300, 150, 96));
        Property property3 = property2;
        c2.add(z3d.f(x0(), property3, dh4.c().getDisplayMetrics().density * 72.0f, 0.0f, 300, 150, 96));
        c2.add(z3d.f(v0(), property, 0.0f, 1.0f, 250, 250, 96));
        c2.add(z3d.f(v0(), property3, dh4.c().getDisplayMetrics().density * 70.0f, 0.0f, 300, 200, 96));
        c2.add(z3d.f(B0(), property, 0.0f, 1.0f, 150, 250, 96));
        wia wia = this.a1;
        c2.add(z3d.f(B0(), View.TRANSLATION_Y, ((float) -48) - (dh4.c().getDisplayMetrics().density * 2.0f), wia != null ? ((Number) wia.b).floatValue() : 0.0f, 200, 200, 96));
        s59 s59 = km4.y0;
        int i = s59.r(q0()).a().o().e.g;
        s59.r(q0()).a().o().e.getClass();
        ValueAnimator ofArgb = ValueAnimator.ofArgb(new int[]{i, -1});
        ofArgb.setStartDelay(150);
        ofArgb.setDuration(300);
        ofArgb.addUpdateListener(new z3c(this, 8));
        c2.add(ofArgb);
        c2.addAll(z3d.M(s0(), 0.0f, 1.0f, 300, 100));
        c2.add(z3d.f(s0(), property, 0.0f, 1.0f, 300, 100, 96));
        lg7 a2 = hwf.a(c2);
        AnimatorSet animatorSet4 = this.h1;
        if (animatorSet4 != null) {
            animatorSet4.setInterpolator(y0());
        }
        AnimatorSet animatorSet5 = this.h1;
        if (animatorSet5 != null) {
            animatorSet5.playTogether(a2);
        }
        AnimatorSet animatorSet6 = this.h1;
        if (animatorSet6 != null) {
            animatorSet6.addListener(new f4c(this, 11));
        }
        AnimatorSet animatorSet7 = this.h1;
        if (animatorSet7 != null) {
            animatorSet7.addListener(new ag(this, z));
        }
        vp8 C02 = C0();
        AnimatorSet animatorSet8 = null;
        if (C02 != null) {
            MessageWriteWidget messageWriteWidget = (MessageWriteWidget) C02;
            if (messageWriteWidget.getView() != null) {
                jq8 p0 = messageWriteWidget.p0();
                p0.getClass();
                AnimatorSet animatorSet9 = new AnimatorSet();
                lg7 c3 = hwf.c();
                c3.add(z3d.f(p0.c, property2, 0.0f, dh4.c().getDisplayMetrics().density * -74.0f, 300, 0, 112));
                lg7 lg7 = c3;
                lg7.add(z3d.f(p0.c, property, 1.0f, 0.0f, 300, 0, 112));
                ImageView imageView = p0.b;
                lg7.add(z3d.f(imageView, property2, 0.0f, dh4.c().getDisplayMetrics().density * -74.0f, 300, 0, 112));
                AnimatorSet animatorSet10 = animatorSet9;
                lg7.add(z3d.f(imageView, property, 1.0f, 0.0f, 300, 0, 112));
                t97 t97 = p0.w0;
                if (t97.a()) {
                    lg7.add(z3d.f((View) t97.getValue(), property, 1.0f, 0.0f, 200, 0, 112));
                    lg7.addAll(z3d.M((View) t97.getValue(), 1.0f, 0.0f, 300, 0));
                }
                t97 t972 = p0.A0;
                if (t972.a()) {
                    lg7.add(z3d.f((View) t972.getValue(), property, 1.0f, 0.0f, 200, 0, 112));
                    lg7.addAll(z3d.M((View) t972.getValue(), 1.0f, 0.0f, 300, 0));
                }
                lg7 a3 = hwf.a(lg7);
                animatorSet10.addListener(new iq8(p0, 6));
                animatorSet10.playTogether(a3);
                animatorSet8 = animatorSet10;
            }
        }
        AnimatorSet animatorSet11 = this.h1;
        if (animatorSet11 != null) {
            animatorSet11.playTogether(new Animator[]{animatorSet8});
        }
        AnimatorSet animatorSet12 = this.h1;
        if (animatorSet12 != null) {
            animatorSet12.start();
        }
    }

    public final void R0() {
        qod qod = this.e1;
        if (qod != null) {
            qod.cancel((CancellationException) null);
        }
        this.e1 = null;
        AnimatorSet animatorSet = this.g1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        r0().setScaleX(1.0f);
        r0().setScaleY(1.0f);
    }

    public final void S0() {
        t0c t0c = L0().E0;
        this.f1.o1(this, m1[22], xs7.D(getViewLifecycleScope(), ((pae) this.X.getValue()).a(), ru3.b, new p4c((Continuation) null, this, t0c != null ? (byte[]) t0c.a.getValue() : null)));
    }

    public final void i(int i, Bundle bundle) {
        if (i == 1) {
            taf.o(((h3c) this.b.getValue()).b, d3c.a);
        } else if (i == 2) {
            L0().y();
        }
    }

    public final void onActivityPaused(Activity activity) {
        super.onActivityPaused(activity);
        L0().t();
    }

    /* JADX WARNING: type inference failed for: r9v3, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r10, android.view.ViewGroup r11, android.os.Bundle r12) {
        /*
            r9 = this;
            android.widget.FrameLayout r10 = new android.widget.FrameLayout
            android.content.Context r11 = r9.getContext()
            r10.<init>(r11)
            int r11 = defpackage.y9a.f
            r10.setId(r11)
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            r12 = 48
            float r0 = (float) r12
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r1 = r1 * r0
            int r1 = a24.X(r1)
            r2 = -1
            r11.<init>(r2, r1)
            r10.setLayoutParams(r11)
            r11 = 0
            r10.setClipChildren(r11)
            r1 = 4
            r10.setVisibility(r1)
            a4c r3 = new a4c
            r4 = 0
            r3.<init>(r9, r4)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            android.content.Context r5 = r10.getContext()
            r4.<init>(r5)
            int r5 = defpackage.y9a.p
            r4.setId(r5)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r0
            int r6 = a24.X(r6)
            r5.<init>(r2, r6)
            r6 = 80
            r5.gravity = r6
            r4.setLayoutParams(r5)
            r4.setVisibility(r1)
            r5 = 1
            r4.setClickable(r5)
            r4.setFocusable(r5)
            r4.setMinimumHeight(r12)
            r4.setOrientation(r11)
            r4.setBackgroundColor(r11)
            r3.invoke(r4)
            r10.addView(r4)
            a4c r12 = new a4c
            r3 = 1
            r12.<init>(r9, r3)
            android.widget.FrameLayout r3 = new android.widget.FrameLayout
            android.content.Context r4 = r10.getContext()
            r3.<init>(r4)
            int r4 = defpackage.y9a.e
            r3.setId(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r7 = 96
            float r7 = (float) r7
            android.content.res.Resources r8 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r7 = r7 * r8
            int r7 = a24.X(r7)
            r4.<init>(r2, r7)
            r4.gravity = r6
            r3.setLayoutParams(r4)
            r3.setVisibility(r1)
            r3.setClickable(r5)
            r3.setFocusable(r5)
            d78 r2 = new d78
            r4 = 3
            r5 = 0
            r6 = 2
            r2.<init>(r4, r5, r6)
            urd.B(r2, r3)
            r12.invoke(r3)
            r10.addView(r3)
            a4c r12 = new a4c
            r2 = 2
            r12.<init>(r9, r2)
            android.widget.FrameLayout r9 = new android.widget.FrameLayout
            android.content.Context r2 = r10.getContext()
            r9.<init>(r2)
            int r2 = defpackage.y9a.d
            r9.setId(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 84
            float r3 = (float) r3
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r3
            int r6 = a24.X(r6)
            float r6 = (float) r6
            r7 = 1069128090(0x3fb9999a, float:1.45)
            float r6 = r6 * r7
            int r6 = (int) r6
            android.content.res.Resources r8 = defpackage.dh4.c()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            float r3 = r3 * r8
            int r3 = a24.X(r3)
            float r3 = (float) r3
            float r3 = r3 * r7
            int r3 = (int) r3
            r2.<init>(r6, r3)
            r3 = 85
            r2.gravity = r3
            r3 = -37
            float r3 = (float) r3
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r3
            int r6 = a24.X(r6)
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r3 = r3 * r7
            int r3 = a24.X(r3)
            r2.setMargins(r11, r11, r6, r3)
            r9.setLayoutParams(r2)
            r9.setVisibility(r1)
            r12.invoke(r9)
            r10.addView(r9)
            android.widget.ImageView r9 = new android.widget.ImageView
            android.content.Context r12 = r10.getContext()
            r9.<init>(r12)
            int r12 = defpackage.y9a.l
            r9.setId(r12)
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r1 = 40
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r1 = r1 * r2
            int r1 = a24.X(r1)
            r2 = 52
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = a24.X(r2)
            r12.<init>(r1, r2)
            r1 = 8388693(0x800055, float:1.1755063E-38)
            r12.gravity = r1
            r9.setLayoutParams(r12)
            android.content.res.Resources r12 = defpackage.dh4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            r1 = -1065353216(0xffffffffc0800000, float:-4.0)
            float r12 = r12 * r1
            r9.setTranslationX(r12)
            android.content.res.Resources r12 = defpackage.dh4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r0 = r0 * r12
            int r12 = a24.X(r0)
            int r12 = -r12
            float r12 = (float) r12
            android.content.res.Resources r0 = defpackage.dh4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1112014848(0x42480000, float:50.0)
            float r0 = r0 * r1
            float r12 = r12 - r0
            r9.setTranslationY(r12)
            r12 = 6
            float r12 = (float) r12
            android.content.res.Resources r0 = defpackage.dh4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r0 = r0 * r12
            int r0 = a24.X(r0)
            r1 = 12
            float r1 = (float) r1
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r2 = r2 * r1
            int r2 = a24.X(r2)
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r12 = r12 * r3
            int r12 = a24.X(r12)
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r1 = r1 * r3
            int r1 = a24.X(r1)
            r9.setPadding(r0, r2, r12, r1)
            int r12 = defpackage.phc.P0
            r9.setImageResource(r12)
            android.graphics.drawable.GradientDrawable r12 = new android.graphics.drawable.GradientDrawable
            r12.<init>()
            android.content.res.Resources r0 = defpackage.dh4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r1
            r12.setCornerRadius(r0)
            r9.setBackground(r12)
            r12 = 8
            r9.setVisibility(r12)
            ac2 r12 = new ac2
            r0 = 5
            r12.<init>(r4, r5, r0)
            urd.B(r12, r9)
            r10.addView(r9)
            android.view.ViewParent r9 = r10.getParent()
            boolean r12 = r9 instanceof android.view.ViewGroup
            if (r12 == 0) goto L_0x0228
            r5 = r9
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
        L_0x0228:
            if (r5 == 0) goto L_0x022d
            r5.setClipChildren(r11)
        L_0x022d:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView(View view) {
        this.d1 = null;
    }

    public final void onDetach(View view) {
        RecordControlsWidget.super.onDetach(view);
        AnimatorSet animatorSet = this.h1;
        if (animatorSet != null) {
            animatorSet.end();
        }
        p0();
        L0().t();
    }

    public final void onViewCreated(View view) {
        ik5 ik5 = new ik5(L0().B0, 2);
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(ik5, getViewLifecycleOwner().R(), ob7), new g4c((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(new ik5(L0().D0, 2), getViewLifecycleOwner().R(), ob7), new h4c((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(L0().F0, getViewLifecycleOwner().R(), ob7), new i4c((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(L0().G0, getViewLifecycleOwner().R(), ob7), new j4c((Continuation) null, this), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(L0().H0, getViewLifecycleOwner().R(), ob7), new k4c((Continuation) null, this), 5), getViewLifecycleScope());
        t0c t0c = L0().E0;
        if (t0c != null) {
            ez3.N(new ck5(wx3.e(t0c, getViewLifecycleOwner().R(), ob7), new l4c((Continuation) null, this), 5), getViewLifecycleScope());
        }
        ez3.N(new ck5(wx3.e(((h3c) this.b.getValue()).c, getViewLifecycleOwner().R(), ob7), new m4c((Continuation) null, this), 5), getViewLifecycleScope());
        fnd fnd = new fnd(B0(), fnd.p);
        gnd gnd = new gnd();
        fnd.m = gnd;
        gnd.b(200.0f);
        fnd.m.a(0.75f);
        this.d1 = fnd;
    }

    public final void p0() {
        AnimatorSet animatorSet = this.i1;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.j1;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        AnimatorSet animatorSet3 = this.k1;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        AnimatorSet animatorSet4 = this.l1;
        if (animatorSet4 != null) {
            animatorSet4.cancel();
        }
        AnimatorSet animatorSet5 = this.g1;
        if (animatorSet5 != null) {
            animatorSet5.cancel();
        }
        AnimatorSet animatorSet6 = this.h1;
        if (animatorSet6 != null) {
            animatorSet6.cancel();
        }
        R0();
    }

    public final ImageView q0() {
        return (ImageView) this.M0.T0(this, m1[20]);
    }

    public final View r0() {
        return (View) this.L0.T0(this, m1[19]);
    }

    public final View s0() {
        return (View) this.K0.T0(this, m1[18]);
    }

    public final View t0() {
        return (View) this.J0.T0(this, m1[17]);
    }

    public final View u0() {
        return (View) this.A0.T0(this, m1[8]);
    }

    public final TextView v0() {
        return (TextView) this.z0.T0(this, m1[7]);
    }

    public final View w0() {
        return (View) this.w0.T0(this, m1[4]);
    }

    public final TextView x0() {
        return (TextView) this.x0.T0(this, m1[5]);
    }

    public final PathInterpolator y0() {
        return (PathInterpolator) this.Y0.getValue();
    }

    public final View z0() {
        return (View) this.C0.T0(this, m1[10]);
    }

    public RecordControlsWidget(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        jr jrVar = new jr(inc.class, Widget.ARG_SCOPE_ID);
        this.a = new jr(z2c.class, "arg_key_type");
        k77 k77 = m1[0];
        this.b = m25getSharedViewModelcp94BC8(((inc) jrVar.a(this)).a, h3c.class, (s16) null);
        this.c = createViewModelLazy(y3c.class, new wq9(20, new b4c(this, 2)));
        this.o = rna.a.b();
        this.X = xuf.a.getAccessor().d(pae.class);
        this.Y = viewBinding(y9a.f);
        this.Z = viewBinding(y9a.p);
        this.w0 = viewBinding(y9a.h);
        this.x0 = viewBinding(y9a.i);
        this.y0 = viewBinding(y9a.r);
        this.z0 = viewBinding(y9a.g);
        this.A0 = viewBinding(y9a.e);
        this.B0 = viewBinding(y9a.s);
        this.C0 = viewBinding(y9a.j);
        this.D0 = viewBinding(y9a.n);
        this.E0 = viewBinding(y9a.k);
        this.F0 = viewBinding(y9a.t);
        this.G0 = viewBinding(y9a.q);
        this.H0 = viewBinding(y9a.m);
        this.I0 = viewBinding(y9a.o);
        this.J0 = viewBinding(y9a.d);
        this.K0 = viewBinding(y9a.c);
        this.L0 = viewBinding(y9a.b);
        this.M0 = viewBinding(y9a.a);
        this.N0 = viewBinding(y9a.l);
        this.O0 = ez3.O(3, new b4c(this, 3));
        this.P0 = ez3.O(3, new b4c(this, 4));
        this.Q0 = ez3.O(3, new b4c(this, 5));
        this.R0 = ez3.O(3, new b4c(this, 6));
        this.S0 = ez3.O(3, new b4c(this, 7));
        this.T0 = ez3.O(3, new k6b(19));
        this.U0 = ez3.O(3, new k6b(20));
        this.V0 = ez3.O(3, new k6b(21));
        this.W0 = ez3.O(3, new k6b(22));
        this.X0 = ez3.O(3, new k6b(23));
        this.Y0 = ez3.O(3, new k6b(24));
        this.c1 = 1.0f;
        this.f1 = hwf.t();
    }
}
