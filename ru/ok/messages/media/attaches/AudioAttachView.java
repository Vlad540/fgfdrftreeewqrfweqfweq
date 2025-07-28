package ru.ok.messages.media.attaches;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import ru.ok.messages.views.widgets.audiowave.AudioWaveView;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0004:\u0002\u0012\u0016J\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/ok/messages/media/attaches/AudioAttachView;", "Landroid/widget/RelativeLayout;", "Lr60;", "Lxhe;", "", "", "Landroid/view/View;", "getClickableChildren", "()Ljava/util/List;", "La20;", "listener", "Ljue;", "setListener", "(La20;)V", "", "currentPosition", "setCurrentPosition", "(J)V", "Le20;", "isActionModeDelegate", "setDelegate", "(Le20;)V", "Ld20;", "audioTranscriptionStateChangeListener", "setAudioTranscriptionStateChangeListener", "(Ld20;)V", "Lh30;", "y0", "Lt97;", "getAudioController", "()Lh30;", "audioController", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class AudioAttachView extends RelativeLayout implements r60, xhe {
    public static final /* synthetic */ int A0 = 0;
    public final AppCompatImageView a;
    public final AudioWaveView b;
    public final AppCompatTextView c;
    public final e50 o;
    public final AppCompatTextView w0;
    public Long x0;
    public final r7e y0;
    public final HashMap z0;

    /* JADX WARNING: type inference failed for: r7v7, types: [e50, android.view.View] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AudioAttachView(android.content.Context r18, android.util.AttributeSet r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = 0
            r0.<init>(r1, r2, r3)
            boolean r4 = r17.isInEditMode()
            if (r4 == 0) goto L_0x0013
            db4 r4 = defpackage.db4.e0
            goto L_0x001d
        L_0x0013:
            android.content.Context r4 = r17.getContext()
            r7e r5 = defpackage.wce.a0
            wce r4 = fja.E(r4)
        L_0x001d:
            dr0 r4 = r4.g
            m r4 = new m
            r5 = 11
            r4.<init>(r5)
            r7e r5 = new r7e
            r5.<init>(r4)
            r0.y0 = r5
            r4 = 32
            float r4 = (float) r4
            android.content.res.Resources r5 = defpackage.dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r4 = r4 * r5
            int r4 = a24.X(r4)
            androidx.appcompat.widget.AppCompatImageView r5 = new androidx.appcompat.widget.AppCompatImageView
            r6 = 0
            r5.<init>(r1, r6)
            int r7 = defpackage.zhc.U
            r5.setImageResource(r7)
            int r7 = defpackage.yqb.view_audio_attach__btn_play
            r5.setId(r7)
            android.widget.ImageView$ScaleType r7 = android.widget.ImageView.ScaleType.CENTER
            r5.setScaleType(r7)
            r0.a = r5
            android.widget.RelativeLayout$LayoutParams r7 = new android.widget.RelativeLayout$LayoutParams
            r7.<init>(r4, r4)
            r4 = 20
            r7.addRule(r4)
            r4 = 10
            r7.addRule(r4)
            r0.addView(r5, r7)
            b20 r7 = new b20
            r7.<init>(r3)
            a24.a0(r5, r7)
            ru.ok.messages.views.widgets.audiowave.AudioWaveView r7 = new ru.ok.messages.views.widgets.audiowave.AudioWaveView
            r8 = 6
            r7.<init>(r1, r6, r8)
            int r8 = defpackage.yqb.view_audio_attach__wave
            r7.setId(r8)
            r7.setListener(r0)
            b20 r8 = new b20
            r8.<init>(r3)
            a24.a0(r7, r8)
            c20 r8 = new c20
            r8.<init>(r3)
            r7.setOnLongClickListener(r8)
            r0.b = r7
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams
            r9 = 16
            float r9 = (float) r9
            android.content.res.Resources r10 = defpackage.dh4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r9 = r9 * r10
            int r9 = a24.X(r9)
            r10 = -1
            r8.<init>(r10, r9)
            r8.addRule(r4)
            int r4 = r5.getId()
            r5 = 17
            r8.addRule(r5, r4)
            r4 = 21
            r8.addRule(r4, r10)
            r4 = 8
            float r9 = (float) r4
            android.content.res.Resources r10 = defpackage.dh4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r10 = r10 * r9
            int r10 = a24.X(r10)
            r8.setMarginStart(r10)
            r0.addView(r7, r8)
            androidx.appcompat.widget.AppCompatTextView r7 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r8 = r17.getContext()
            r7.<init>(r8, r6)
            nge r8 = defpackage.nte.a
            nge r8 = defpackage.jp2.d
            r8.b(r7, defpackage.yq4.b)
            int r8 = defpackage.yqb.view_audio_attach__duration
            r7.setId(r8)
            r0.c = r7
            android.widget.RelativeLayout$LayoutParams r8 = new android.widget.RelativeLayout$LayoutParams
            r10 = -2
            r8.<init>(r10, r10)
            android.content.res.Resources r11 = defpackage.dh4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r9
            int r11 = a24.X(r11)
            r8.setMarginStart(r11)
            r11 = 4
            float r11 = (float) r11
            android.content.res.Resources r12 = defpackage.dh4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r11 = r11 * r12
            int r11 = a24.X(r11)
            r8.topMargin = r11
            int r11 = defpackage.yqb.view_audio_attach__btn_play
            r8.addRule(r5, r11)
            int r11 = defpackage.yqb.view_audio_attach__wave
            r12 = 3
            r8.addRule(r12, r11)
            r0.addView(r7, r8)
            e50 r7 = new e50
            r7.<init>(r1, r2, r3)
            int r2 = defpackage.yqb.view_audio_attach__seek
            r7.setId(r2)
            r7.setVisibility(r4)
            r0.o = r7
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r2.<init>(r10, r10)
            int r3 = defpackage.yqb.view_audio_attach__btn_play
            r8 = 2
            r2.addRule(r8, r3)
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            double r13 = (double) r3
            r15 = 4617540697942969549(0x4014cccccccccccd, double:5.2)
            double r13 = r13 * r15
            int r3 = a24.W(r13)
            r2.bottomMargin = r3
            r0.addView(r7, r2)
            androidx.appcompat.widget.AppCompatTextView r2 = new androidx.appcompat.widget.AppCompatTextView
            r2.<init>(r1, r6)
            int r3 = defpackage.yqb.view_audio_attach__transcription_status
            r2.setId(r3)
            r3 = 1094713344(0x41400000, float:12.0)
            r2.setTextSize(r3)
            r2.setVisibility(r4)
            r2.setGravity(r5)
            android.widget.RelativeLayout$LayoutParams r3 = new android.widget.RelativeLayout$LayoutParams
            r4 = 18
            float r4 = (float) r4
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r4 = r4 * r6
            int r4 = a24.X(r4)
            r3.<init>(r10, r4)
            int r4 = defpackage.yqb.view_audio_attach__duration
            r3.addRule(r5, r4)
            int r4 = defpackage.yqb.view_audio_attach__wave
            r3.addRule(r12, r4)
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            float r9 = r9 * r4
            int r4 = a24.X(r9)
            r3.setMarginStart(r4)
            r2.setLayoutParams(r3)
            int r3 = defpackage.cic.P
            java.lang.String r1 = r1.getString(r3)
            r2.setText(r1)
            r1 = 1
            r2.setSingleLine(r1)
            r2.setMaxLines(r1)
            android.text.TextUtils$TruncateAt r1 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsize(r1)
            r0.w0 = r2
            r0.addView(r2)
            r17.c()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.z0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.AudioAttachView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private final h30 getAudioController() {
        return (h30) this.y0.getValue();
    }

    public final void a(float f) {
        this.o.setLayoutPosition(this.b.getX() + f);
    }

    public final void b() {
        f();
        this.x0 = Long.valueOf(SystemClock.elapsedRealtime());
    }

    public final void c() {
        Object obj;
        wce wce;
        if (isInEditMode()) {
            obj = db4.e0;
        } else {
            Context context = getContext();
            r7e r7e = wce.a0;
            obj = fja.E(context);
        }
        if (isInEditMode()) {
            wce = db4.e0;
        } else {
            Context context2 = getContext();
            r7e r7e2 = wce.a0;
            wce = fja.E(context2);
        }
        dr0 dr0 = wce.g;
        int i = dr0.c.c;
        AppCompatImageView appCompatImageView = this.a;
        appCompatImageView.setColorFilter(i);
        xq0 xq0 = dr0.a;
        GradientDrawable H = swb.H(Integer.valueOf(xq0.e), (Integer) null, (Integer) null);
        obj.getClass();
        appCompatImageView.setBackground(swb.Q(H, swb.H(Integer.valueOf(n1g.c0(xq0.e, 0.8f)), (Integer) null, (Integer) null), (GradientDrawable) null));
        AppCompatTextView appCompatTextView = this.c;
        gr0 gr0 = dr0.b;
        appCompatTextView.setTextColor(gr0.c);
        this.w0.setTextColor(gr0.c);
    }

    public final void d(float f) {
        if (getAudioController().c.p(0)) {
            this.o.setCurrentAudioPosition(0);
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [e50, android.view.View, java.lang.Object] */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0029 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x001b  */
    public final void e(float r5) {
        /*
            r4 = this;
            r5 = 0
            r4.setClipChildren(r5)
            r4.setClipToPadding(r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.view.ViewParent r1 = r4.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            r3 = 0
            if (r2 == 0) goto L_0x0018
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L_0x0019
        L_0x0018:
            r1 = r3
        L_0x0019:
            if (r1 == 0) goto L_0x0029
            r0.add(r1)
            android.view.ViewParent r1 = r1.getParent()
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L_0x0018
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            goto L_0x0019
        L_0x0029:
            java.util.Iterator r0 = r0.iterator()
        L_0x002d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0058
            java.lang.Object r1 = r0.next()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            boolean r2 = r1.getClipToPadding()
            boolean r3 = r1.getClipChildren()
            if (r3 == 0) goto L_0x0045
            r2 = r2 | 2
        L_0x0045:
            r1.setClipChildren(r5)
            r1.setClipToPadding(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.HashMap r3 = r4.z0
            r3.put(r1, r2)
            boolean r1 = r1 instanceof androidx.recyclerview.widget.RecyclerView
            if (r1 == 0) goto L_0x002d
        L_0x0058:
            e50 r4 = r4.o
            r0 = 0
            r4.setCurrentAudioPosition(r0)
            tg r0 = defpackage.bm3.j(r4)
            boolean r0 = r0.h()
            r1 = 1
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x006f
            r4.setVisibility(r5)
            goto L_0x00b6
        L_0x006f:
            boolean r5 = r4.D0
            if (r5 == 0) goto L_0x007e
            android.animation.Animator r5 = r4.C0
            if (r5 == 0) goto L_0x007e
            boolean r5 = r5.isRunning()
            if (r5 != r1) goto L_0x007e
            goto L_0x00b6
        L_0x007e:
            r4.D0 = r1
            android.animation.Animator r5 = r4.C0
            if (r5 == 0) goto L_0x0087
            vx3.f(r5)
        L_0x0087:
            r5 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            android.animation.ObjectAnimator r5 = r4.j(r5, r0)
            tg r0 = defpackage.bm3.j(r4)
            lg r0 = r0.a
            long r0 = r0.i()
            r5.setDuration(r0)
            tg r0 = defpackage.bm3.j(r4)
            lg r0 = r0.a
            android.view.animation.Interpolator r0 = r0.d()
            r5.setInterpolator(r0)
            mf r0 = new mf
            r1 = 1
            r0.<init>(r1, r4)
            r5.addListener(r0)
            r4.C0 = r5
            r5.start()
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.attaches.AudioAttachView.e(float):void");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [e50, android.view.View] */
    public final void f() {
        Animator animator;
        c6 c6Var = new c6(11, this);
        ? r4 = this.o;
        if (r4.getVisibility() != 8) {
            if (!bm3.j(r4).h()) {
                r4.setVisibility(8);
                c6Var.invoke();
            } else if (!r4.E0 || (animator = r4.C0) == null || !animator.isRunning()) {
                r4.E0 = true;
                Animator animator2 = r4.C0;
                if (animator2 != null) {
                    vx3.f(animator2);
                }
                ObjectAnimator j = r4.j(1.0f, 0.0f);
                j.setDuration(bm3.j(r4).a.i());
                j.setInterpolator(bm3.j(r4).a.n());
                j.addListener(new d50(r4, c6Var, c6Var, 0));
                r4.C0 = j;
                j.start();
            }
        }
    }

    public List<View> getClickableChildren() {
        return myc.U(myc.L(pfa.o(this), new o8(13)));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public final void onDetachedFromWindow() {
        f();
        super.onDetachedFromWindow();
    }

    public final void setAudioTranscriptionStateChangeListener(d20 d20) {
    }

    public void setCurrentPosition(long j) {
        if (!this.b.G0) {
            Long l = this.x0;
            if (l == null || SystemClock.elapsedRealtime() - l.longValue() >= 34) {
                this.x0 = null;
                getAudioController().c.p(0);
                this.o.setCurrentAudioPosition(j);
            }
        }
    }

    public final void setDelegate(e20 e20) {
    }

    public final void setListener(a20 a20) {
    }
}
