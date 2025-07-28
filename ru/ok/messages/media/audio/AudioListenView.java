package ru.ok.messages.media.audio;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000bJ\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0017\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001b\u0010\u001c\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\u000f8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001b\u0010$\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ok/messages/media/audio/AudioListenView;", "Landroid/widget/LinearLayout;", "Lmhe;", "Lr60;", "", "isScheduledSend", "Ljue;", "setScheduledSend", "(Z)V", "playing", "setPlayButtonState", "Lg40;", "listener", "setListener", "(Lg40;)V", "Landroid/graphics/drawable/Drawable;", "y0", "Lt97;", "getPlayDrawable", "()Landroid/graphics/drawable/Drawable;", "playDrawable", "z0", "getPauseDrawable", "pauseDrawable", "Landroid/graphics/drawable/GradientDrawable;", "B0", "getInputBackgroundDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "inputBackgroundDrawable", "D0", "getArrowDrawable", "arrowDrawable", "Landroid/graphics/drawable/LayerDrawable;", "E0", "getSendIcon", "()Landroid/graphics/drawable/LayerDrawable;", "sendIcon", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
public final class AudioListenView extends LinearLayout implements mhe, r60 {
    public static final /* synthetic */ int F0 = 0;
    public final LayerDrawable A0;
    public final t97 B0;
    public final GradientDrawable C0;
    public final t97 D0;
    public final t97 E0;
    public final TextView a;
    public final ImageView b;
    public final ImageView c;
    public final ImageView o;
    public final ProgressBar w0;
    public final GradientDrawable x0;
    public final t97 y0 = ez3.O(3, new f40(this, 0));
    public final t97 z0 = ez3.O(3, new f40(this, 1));

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AudioListenView(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            r16 = this;
            r8 = r16
            r0 = r17
            r1 = 2
            r2 = 3
            r3 = 0
            r9 = 1
            r4 = r18
            r8.<init>(r0, r4, r3)
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            r4.<init>()
            r5 = 1120403456(0x42c80000, float:100.0)
            r4.setCornerRadius(r5)
            r8.x0 = r4
            f40 r6 = new f40
            r6.<init>(r8, r3)
            t97 r6 = ez3.O(r2, r6)
            r8.y0 = r6
            f40 r6 = new f40
            r6.<init>(r8, r9)
            t97 r6 = ez3.O(r2, r6)
            r8.z0 = r6
            android.graphics.drawable.LayerDrawable r6 = new android.graphics.drawable.LayerDrawable
            android.graphics.drawable.Drawable r7 = r16.getPlayDrawable()
            android.graphics.drawable.Drawable[] r10 = new android.graphics.drawable.Drawable[r1]
            r10[r3] = r4
            r10[r9] = r7
            r6.<init>(r10)
            r7 = 4
            float r7 = (float) r7
            android.content.res.Resources r10 = defpackage.dh4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r10 = r10 * r7
            int r12 = a24.X(r10)
            android.content.res.Resources r10 = defpackage.dh4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r10 = r10 * r7
            int r13 = a24.X(r10)
            android.content.res.Resources r10 = defpackage.dh4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r10 = r10 * r7
            int r14 = a24.X(r10)
            android.content.res.Resources r10 = defpackage.dh4.c()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            float r7 = r7 * r10
            int r15 = a24.X(r7)
            r11 = 1
            r10 = r6
            r10.setLayerInset(r11, r12, r13, r14, r15)
            r8.A0 = r6
            m r7 = new m
            r10 = 12
            r7.<init>(r10)
            t97 r7 = ez3.O(r2, r7)
            r8.B0 = r7
            android.graphics.drawable.GradientDrawable r7 = new android.graphics.drawable.GradientDrawable
            r7.<init>()
            r7.setCornerRadius(r5)
            r8.C0 = r7
            f40 r5 = new f40
            r5.<init>(r8, r1)
            t97 r1 = ez3.O(r2, r5)
            r8.D0 = r1
            f40 r1 = new f40
            r1.<init>(r8, r2)
            t97 r1 = ez3.O(r2, r1)
            r8.E0 = r1
            int r1 = defpackage.zrb.view_audio_listen
            android.view.View.inflate(r0, r1, r8)
            r0 = 6
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = a24.X(r0)
            r8.setPadding(r0, r0, r0, r0)
            r8.setOrientation(r3)
            r0 = 36
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r0 = r0 * r1
            int r0 = a24.X(r0)
            r8.setMinimumHeight(r0)
            int r0 = defpackage.yqb.view_audio_listen__container
            android.view.View r0 = r8.findViewById(r0)
            int r1 = defpackage.yqb.view_audio_listen__wave
            android.view.View r1 = r8.findViewById(r1)
            r10 = r1
            ru.ok.messages.views.widgets.audiowave.AudioWaveView r10 = (ru.ok.messages.views.widgets.audiowave.AudioWaveView) r10
            int r1 = defpackage.yqb.view_audio_listen__tv_duration
            android.view.View r1 = r8.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r8.a = r1
            int r1 = defpackage.yqb.view_audio_listen__btn_play
            android.view.View r1 = r8.findViewById(r1)
            r11 = r1
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            r8.b = r11
            int r1 = defpackage.yqb.view_audio_listen__btn_close
            android.view.View r1 = r8.findViewById(r1)
            r12 = r1
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r8.c = r12
            int r1 = defpackage.yqb.view_audio_listen__btn_send
            android.view.View r1 = r8.findViewById(r1)
            r13 = r1
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r8.o = r13
            int r1 = defpackage.yqb.view_audio_listen__progress
            android.view.View r1 = r8.findViewById(r1)
            android.widget.ProgressBar r1 = (android.widget.ProgressBar) r1
            r8.w0 = r1
            r1.setBackground(r4)
            android.graphics.drawable.GradientDrawable r1 = r16.getInputBackgroundDrawable()
            r0.setBackground(r1)
            r11.setImageDrawable(r6)
            android.content.Context r0 = r16.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r1 = 10
            float r1 = (float) r1
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            int r5 = a24.X(r1)
            a93 r14 = new a93
            r7 = 1
            r0 = r14
            r1 = r11
            r2 = r5
            r3 = r5
            r4 = r5
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.post(r14)
            r10.setListener(r8)
            b20 r0 = new b20
            r0.<init>(r9)
            a24.a0(r12, r0)
            b20 r0 = new b20
            r0.<init>(r9)
            a24.a0(r11, r0)
            b20 r0 = new b20
            r0.<init>(r9)
            a24.a0(r13, r0)
            c20 r0 = new c20
            r0.<init>(r9)
            r13.setOnLongClickListener(r0)
            s59 r0 = km4.y0
            pda r0 = r0.r(r8)
            r8.onThemeChanged(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.media.audio.AudioListenView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static LayerDrawable c(AudioListenView audioListenView) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{audioListenView.C0, audioListenView.getArrowDrawable()});
        float f = (float) 4;
        layerDrawable.setLayerInset(1, a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
        return layerDrawable;
    }

    private final Drawable getArrowDrawable() {
        return (Drawable) this.D0.getValue();
    }

    private final GradientDrawable getInputBackgroundDrawable() {
        return (GradientDrawable) this.B0.getValue();
    }

    private final Drawable getPauseDrawable() {
        return (Drawable) this.z0.getValue();
    }

    private final Drawable getPlayDrawable() {
        return (Drawable) this.y0.getValue();
    }

    private final LayerDrawable getSendIcon() {
        return (LayerDrawable) this.E0.getValue();
    }

    public final void b() {
    }

    public final void d(float f) {
    }

    public final void onThemeChanged(pda pda) {
        s59 s59 = km4.y0;
        avf d = s59.r(this).a().d();
        setBackgroundColor(d.a.a);
        this.c.setColorFilter(pda.getIcon().c);
        this.x0.setColor(pda.b().a.g);
        getInputBackgroundDrawable().setColor(pda.b().i);
        getInputBackgroundDrawable().setStroke(4, n1g.c0(d.d.b, 0.06f));
        nge nge = nte.o;
        TextView textView = this.a;
        nge.b(textView, yq4.b);
        textView.setTextColor(s59.r(this).getText().f);
        js.D(getArrowDrawable(), -1);
        pda.b().a.getClass();
        this.C0.setColor(-16745729);
        js.E(this.w0, pda.getIcon().f);
        js.D(getPlayDrawable(), pda.getIcon().f);
        js.D(getPauseDrawable(), pda.getIcon().f);
        this.b.invalidate();
    }

    public final void setListener(g40 g40) {
    }

    public final void setPlayButtonState(boolean z) {
        int i;
        this.A0.setDrawable(1, z ? getPauseDrawable() : getPlayDrawable());
        this.b.invalidate();
        s59 s59 = km4.y0;
        if (z) {
            s59.r(this);
            i = -16745729;
        } else {
            i = s59.r(this).getText().f;
        }
        this.a.setTextColor(i);
    }

    public final void setScheduledSend(boolean z) {
        wce wce;
        ImageView imageView = this.o;
        if (z) {
            imageView.setImageResource(zhc.V);
            if (isInEditMode()) {
                wce = db4.e0;
            } else {
                Context context = getContext();
                r7e r7e = wce.a0;
                wce = fja.E(context);
            }
            imageView.setColorFilter(wce.k);
            me4.o((float) 4, dh4.c().getDisplayMetrics().density, imageView);
            return;
        }
        imageView.setImageDrawable(getSendIcon());
        imageView.setPadding(0, 0, 0, 0);
    }
}
