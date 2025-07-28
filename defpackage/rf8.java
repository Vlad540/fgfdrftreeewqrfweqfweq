package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: rf8  reason: default package */
public final /* synthetic */ class rf8 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ sf8 b;

    public /* synthetic */ rf8(sf8 sf8, int i) {
        this.a = i;
        this.b = sf8;
    }

    public final Object invoke() {
        sf8 sf8 = this.b;
        switch (this.a) {
            case 0:
                return js.q(phc.N1, -1, ((ViewGroup) sf8.b).getContext());
            case 1:
                return js.q(phc.L0, -1, ((ViewGroup) sf8.b).getContext());
            case 2:
                return js.q(phc.H0, -1, ((ViewGroup) sf8.b).getContext());
            default:
                ImageView imageView = new ImageView(((ViewGroup) sf8.b).getContext());
                float f = (float) 52;
                imageView.setLayoutParams(new FrameLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density), 17));
                int i = qda.f.a.f;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                js.D(shapeDrawable, -1728053248);
                imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i), shapeDrawable, (Drawable) null));
                me4.o((float) 14, dh4.c().getDisplayMetrics().density, imageView);
                imageView.setImageDrawable((Drawable) ((t97) sf8.g).getValue());
                a24.Z(imageView, 300, new eu5(13, sf8));
                return imageView;
        }
    }
}
