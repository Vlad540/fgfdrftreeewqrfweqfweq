package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.coroutines.Continuation;

/* renamed from: ex1  reason: default package */
public final class ex1 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ AppCompatImageView Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ex1(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) obj;
        pda pda = (pda) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                ex1 ex1 = new ex1(3, continuation, 0);
                ex1.Y = appCompatImageView;
                jue jue = jue.a;
                ex1.o(jue);
                return jue;
            case 1:
                ex1 ex12 = new ex1(3, continuation, 1);
                ex12.Y = appCompatImageView;
                jue jue2 = jue.a;
                ex12.o(jue2);
                return jue2;
            case 2:
                ex1 ex13 = new ex1(3, continuation, 2);
                ex13.Y = appCompatImageView;
                jue jue3 = jue.a;
                ex13.o(jue3);
                return jue3;
            default:
                ex1 ex14 = new ex1(3, continuation, 3);
                ex14.Y = appCompatImageView;
                jue jue4 = jue.a;
                ex14.o(jue4);
                return jue4;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                AppCompatImageView appCompatImageView = this.Y;
                s59 s59 = km4.y0;
                int i = s59.r(appCompatImageView).c().a.f;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-1);
                appCompatImageView.setBackgroundDrawable(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, shapeDrawable));
                appCompatImageView.setImageResource(phc.o0);
                appCompatImageView.setImageTintList(ColorStateList.valueOf(s59.r(appCompatImageView).getIcon().i));
                return jue.a;
            case 1:
                wx3.H(obj);
                AppCompatImageView appCompatImageView2 = this.Y;
                appCompatImageView2.setImageTintList(ColorStateList.valueOf(km4.y0.r(appCompatImageView2).getIcon().h));
                appCompatImageView2.setImageResource(l9a.y);
                return jue.a;
            case 2:
                wx3.H(obj);
                AppCompatImageView appCompatImageView3 = this.Y;
                s59 s592 = km4.y0;
                appCompatImageView3.setImageTintList(ColorStateList.valueOf(s592.r(appCompatImageView3).getIcon().h));
                appCompatImageView3.setImageResource(l9a.a);
                int i2 = s592.r(appCompatImageView3).c().a.f;
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.getPaint().setColor(-1);
                appCompatImageView3.setBackgroundDrawable(new RippleDrawable(ColorStateList.valueOf(i2), (Drawable) null, shapeDrawable2));
                return jue.a;
            default:
                wx3.H(obj);
                AppCompatImageView appCompatImageView4 = this.Y;
                s59 s593 = km4.y0;
                appCompatImageView4.setImageTintList(ColorStateList.valueOf(s593.r(appCompatImageView4).getIcon().h));
                appCompatImageView4.setImageResource(w5a.i);
                int i3 = s593.r(appCompatImageView4).c().a.f;
                ShapeDrawable shapeDrawable3 = new ShapeDrawable(new OvalShape());
                shapeDrawable3.getPaint().setColor(-1);
                appCompatImageView4.setBackgroundDrawable(new RippleDrawable(ColorStateList.valueOf(i3), (Drawable) null, shapeDrawable3));
                return jue.a;
        }
    }
}
