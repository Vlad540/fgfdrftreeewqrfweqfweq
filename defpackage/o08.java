package defpackage;

import android.animation.ValueAnimator;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* renamed from: o08  reason: default package */
public final class o08 extends l5e implements i26 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ MediaBarWidget Y;
    public final /* synthetic */ z0b Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o08(MediaBarWidget mediaBarWidget, z0b z0b, Continuation continuation) {
        super(2, continuation);
        this.Y = mediaBarWidget;
        this.Z = z0b;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((o08) n(bool, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        o08 o08 = new o08(this.Y, this.Z, continuation);
        o08.X = ((Boolean) obj).booleanValue();
        return o08;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        boolean z = this.X;
        k77[] k77Arr = MediaBarWidget.h1;
        MediaBarWidget mediaBarWidget = this.Y;
        Object value = mediaBarWidget.A0().E0.a.getValue();
        p3b p3b = p3b.b;
        jue jue = jue.a;
        if (value == p3b) {
            return jue;
        }
        if (this.Z.getScrollState() == x0b.b && mediaBarWidget.w0().w0 == null) {
            mediaBarWidget.w0().k();
        }
        ValueAnimator valueAnimator = mediaBarWidget.R0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        int alpha = mediaBarWidget.Q0.getAlpha();
        int i = z ? (km4.y0.r(mediaBarWidget.s0()).b().d >> 24) & 255 : 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new k08(mediaBarWidget, alpha, i));
        ofFloat.setDuration(100);
        ofFloat.start();
        mediaBarWidget.R0 = ofFloat;
        return jue;
    }
}
