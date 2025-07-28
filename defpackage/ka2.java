package defpackage;

import android.graphics.drawable.Drawable;
import kotlin.coroutines.Continuation;

/* renamed from: ka2  reason: default package */
public final class ka2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ma2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ka2(ma2 ma2, Continuation continuation) {
        super(2, continuation);
        this.Y = ma2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((ka2) n((pda) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ka2 ka2 = new ka2(this.Y, continuation);
        ka2.X = obj;
        return ka2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        pda pda = (pda) this.X;
        ma2 ma2 = this.Y;
        if (ma2.i.a()) {
            r7e r7e = ma2.i;
            js.D((Drawable) r7e.getValue(), pda.getIcon().i);
            ((Drawable) r7e.getValue()).invalidateSelf();
        }
        r7e r7e2 = ma2.j;
        if (r7e2.a()) {
            js.D((Drawable) r7e2.getValue(), pda.getIcon().i);
            ((Drawable) r7e2.getValue()).invalidateSelf();
        }
        r7e r7e3 = ma2.k;
        if (r7e3.a()) {
            js.D((Drawable) r7e3.getValue(), pda.getIcon().i);
            ((Drawable) r7e3.getValue()).invalidateSelf();
        }
        r7e r7e4 = ma2.l;
        if (r7e4.a()) {
            js.D((Drawable) r7e4.getValue(), pda.getIcon().i);
            ((Drawable) r7e4.getValue()).invalidateSelf();
        }
        r7e r7e5 = ma2.m;
        if (r7e5.a()) {
            js.D((Drawable) r7e5.getValue(), pda.getIcon().i);
            ((Drawable) r7e5.getValue()).invalidateSelf();
        }
        r7e r7e6 = ma2.n;
        if (r7e6.a()) {
            js.D((Drawable) r7e6.getValue(), pda.getIcon().i);
            ((Drawable) r7e6.getValue()).invalidateSelf();
        }
        r7e r7e7 = ma2.o;
        if (r7e7.a()) {
            js.D((Drawable) r7e7.getValue(), pda.getIcon().i);
            ((Drawable) r7e7.getValue()).invalidateSelf();
        }
        r7e r7e8 = ma2.p;
        if (r7e8.a()) {
            js.D((Drawable) r7e8.getValue(), pda.getIcon().c);
            ((Drawable) r7e8.getValue()).invalidateSelf();
        }
        r7e r7e9 = ma2.q;
        if (r7e9.a()) {
            js.D((Drawable) r7e9.getValue(), pda.getIcon().c);
            ((Drawable) r7e9.getValue()).invalidateSelf();
        }
        r7e r7e10 = ma2.r;
        if (r7e10.a()) {
            js.D((Drawable) r7e10.getValue(), pda.getIcon().b);
            ((Drawable) r7e10.getValue()).invalidateSelf();
        }
        r7e r7e11 = ma2.s;
        if (r7e11.a()) {
            ((bi5) r7e11.getValue()).onThemeChanged(pda);
        }
        return jue.a;
    }
}
