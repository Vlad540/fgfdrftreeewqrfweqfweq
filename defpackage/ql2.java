package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.FrameLayout;
import kotlin.coroutines.Continuation;

/* renamed from: ql2  reason: default package */
public final class ql2 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ FrameLayout Y;
    public /* synthetic */ pda Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ql2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FrameLayout frameLayout = (FrameLayout) obj;
        pda pda = (pda) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                ql2 ql2 = new ql2(3, continuation, 0);
                ql2.Y = frameLayout;
                ql2.Z = pda;
                jue jue = jue.a;
                ql2.o(jue);
                return jue;
            case 1:
                ql2 ql22 = new ql2(3, continuation, 1);
                ql22.Y = frameLayout;
                ql22.Z = pda;
                jue jue2 = jue.a;
                ql22.o(jue2);
                return jue2;
            case 2:
                ql2 ql23 = new ql2(3, continuation, 2);
                ql23.Y = frameLayout;
                ql23.Z = pda;
                jue jue3 = jue.a;
                ql23.o(jue3);
                return jue3;
            case 3:
                ql2 ql24 = new ql2(3, continuation, 3);
                ql24.Y = frameLayout;
                ql24.Z = pda;
                jue jue4 = jue.a;
                ql24.o(jue4);
                return jue4;
            case 4:
                ql2 ql25 = new ql2(3, continuation, 4);
                ql25.Y = frameLayout;
                ql25.Z = pda;
                jue jue5 = jue.a;
                ql25.o(jue5);
                return jue5;
            case 5:
                ql2 ql26 = new ql2(3, continuation, 5);
                ql26.Y = frameLayout;
                ql26.Z = pda;
                jue jue6 = jue.a;
                ql26.o(jue6);
                return jue6;
            default:
                ql2 ql27 = new ql2(3, continuation, 6);
                ql27.Y = frameLayout;
                ql27.Z = pda;
                jue jue7 = jue.a;
                ql27.o(jue7);
                return jue7;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                this.Y.setBackgroundColor(this.Z.a().k().a.a);
                return jue.a;
            case 1:
                wx3.H(obj);
                this.Y.setBackgroundColor(this.Z.a().d().a.a);
                return jue.a;
            case 2:
                wx3.H(obj);
                FrameLayout frameLayout = this.Y;
                pda pda = this.Z;
                km4.y0.n(frameLayout.getContext()).getClass();
                km4.c(frameLayout, pda);
                return jue.a;
            case 3:
                wx3.H(obj);
                FrameLayout frameLayout2 = this.Y;
                pda pda2 = this.Z;
                Drawable background = frameLayout2.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColors(pda2.d().d.a);
                }
                return jue.a;
            case 4:
                wx3.H(obj);
                this.Y.setBackgroundColor(this.Z.b().i);
                return jue.a;
            case 5:
                wx3.H(obj);
                this.Y.setBackgroundColor(this.Z.b().h);
                return jue.a;
            default:
                wx3.H(obj);
                FrameLayout frameLayout3 = this.Y;
                pda pda3 = this.Z;
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(dh4.c().getDisplayMetrics().density * 16.0f);
                gradientDrawable2.setTint(pda3.b().f);
                frameLayout3.setBackground(gradientDrawable2);
                frameLayout3.setForeground(new RippleDrawable(ColorStateList.valueOf(pda3.c().a.f), (Drawable) null, dud.O0));
                return jue.a;
        }
    }
}
