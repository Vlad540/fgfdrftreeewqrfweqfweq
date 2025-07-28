package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;
import kotlin.coroutines.Continuation;
import one.me.sdk.richvector.EnhancedVectorDrawable;
import one.me.sdk.richvector.VectorPath;

/* renamed from: ac2  reason: default package */
public final class ac2 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ ImageView Y;
    public /* synthetic */ pda Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac2(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ImageView imageView = (ImageView) obj;
        pda pda = (pda) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.X) {
            case 0:
                ac2 ac2 = new ac2(3, continuation, 0);
                ac2.Y = imageView;
                ac2.Z = pda;
                jue jue = jue.a;
                ac2.o(jue);
                return jue;
            case 1:
                ac2 ac22 = new ac2(3, continuation, 1);
                ac22.Y = imageView;
                ac22.Z = pda;
                jue jue2 = jue.a;
                ac22.o(jue2);
                return jue2;
            case 2:
                ac2 ac23 = new ac2(3, continuation, 2);
                ac23.Y = imageView;
                ac23.Z = pda;
                jue jue3 = jue.a;
                ac23.o(jue3);
                return jue3;
            case 3:
                ac2 ac24 = new ac2(3, continuation, 3);
                ac24.Y = imageView;
                ac24.Z = pda;
                jue jue4 = jue.a;
                ac24.o(jue4);
                return jue4;
            case 4:
                ac2 ac25 = new ac2(3, continuation, 4);
                ac25.Y = imageView;
                ac25.Z = pda;
                jue jue5 = jue.a;
                ac25.o(jue5);
                return jue5;
            case 5:
                ac2 ac26 = new ac2(3, continuation, 5);
                ac26.Y = imageView;
                ac26.Z = pda;
                jue jue6 = jue.a;
                ac26.o(jue6);
                return jue6;
            case 6:
                ac2 ac27 = new ac2(3, continuation, 6);
                ac27.Y = imageView;
                ac27.Z = pda;
                jue jue7 = jue.a;
                ac27.o(jue7);
                return jue7;
            case 7:
                ac2 ac28 = new ac2(3, continuation, 7);
                ac28.Y = imageView;
                ac28.Z = pda;
                jue jue8 = jue.a;
                ac28.o(jue8);
                return jue8;
            case 8:
                ac2 ac29 = new ac2(3, continuation, 8);
                ac29.Y = imageView;
                ac29.Z = pda;
                jue jue9 = jue.a;
                ac29.o(jue9);
                return jue9;
            case 9:
                ac2 ac210 = new ac2(3, continuation, 9);
                ac210.Y = imageView;
                ac210.Z = pda;
                jue jue10 = jue.a;
                ac210.o(jue10);
                return jue10;
            default:
                ac2 ac211 = new ac2(3, continuation, 10);
                ac211.Y = imageView;
                ac211.Z = pda;
                jue jue11 = jue.a;
                ac211.o(jue11);
                return jue11;
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                wx3.H(obj);
                this.Y.setImageTintList(ColorStateList.valueOf(this.Z.getIcon().i));
                return jue.a;
            case 1:
                wx3.H(obj);
                this.Y.setImageTintList(ColorStateList.valueOf(this.Z.a().d().c.c));
                return jue.a;
            case 2:
                wx3.H(obj);
                ImageView imageView = this.Y;
                this.Z.getIcon();
                imageView.setImageTintList(ColorStateList.valueOf(-1));
                return jue.a;
            case 3:
                wx3.H(obj);
                ImageView imageView2 = this.Y;
                this.Z.getIcon();
                imageView2.setImageTintList(ColorStateList.valueOf(-1));
                return jue.a;
            case 4:
                wx3.H(obj);
                ImageView imageView3 = this.Y;
                pda pda = this.Z;
                Drawable drawable = imageView3.getDrawable();
                EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
                if (enhancedVectorDrawable != null) {
                    r0e h = pda.h();
                    VectorPath findPath = enhancedVectorDrawable.findPath("stroke");
                    if (findPath != null) {
                        findPath.setStrokeColor(h.j);
                        enhancedVectorDrawable.invalidatePath();
                    }
                }
                return jue.a;
            case 5:
                wx3.H(obj);
                ImageView imageView4 = this.Y;
                pda pda2 = this.Z;
                Drawable background = imageView4.getBackground();
                GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
                if (gradientDrawable != null) {
                    gradientDrawable.setColor(pda2.b().i);
                }
                Drawable drawable2 = imageView4.getDrawable();
                pda2.getIcon();
                js.D(drawable2, -16745729);
                return jue.a;
            case 6:
                wx3.H(obj);
                ImageView imageView5 = this.Y;
                pda pda3 = this.Z;
                Drawable drawable3 = imageView5.getDrawable();
                pda3.getIcon();
                js.D(drawable3, -16745729);
                return jue.a;
            case 7:
                wx3.H(obj);
                ImageView imageView6 = this.Y;
                pda pda4 = this.Z;
                Drawable drawable4 = imageView6.getDrawable();
                pda4.getIcon();
                js.D(drawable4, -16745729);
                return jue.a;
            case 8:
                wx3.H(obj);
                js.D(this.Y.getDrawable(), this.Z.e().a);
                return jue.a;
            case 9:
                wx3.H(obj);
                ImageView imageView7 = this.Y;
                pda pda5 = this.Z;
                int i = pda5.c().a.c;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(pda5.b().a.g);
                imageView7.setBackground(new RippleDrawable(ColorStateList.valueOf(i), shapeDrawable, (Drawable) null));
                imageView7.setImageTintList(ColorStateList.valueOf(-1));
                return jue.a;
            default:
                wx3.H(obj);
                ImageView imageView8 = this.Y;
                pda pda6 = this.Z;
                imageView8.setImageTintList(ColorStateList.valueOf(pda6.getIcon().h));
                Drawable background2 = imageView8.getBackground();
                if (background2 != null) {
                    background2.setTint(pda6.b().a.g);
                }
                return jue.a;
        }
    }
}
