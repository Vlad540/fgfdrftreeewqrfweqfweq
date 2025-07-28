package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.widget.ImageView;
import kotlin.coroutines.Continuation;

/* renamed from: ey6  reason: default package */
public final class ey6 extends l5e implements k26 {
    public final /* synthetic */ int X;
    public /* synthetic */ int Y;
    public /* synthetic */ Object Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ey6(int i, Continuation continuation, int i2) {
        super(i, continuation);
        this.X = i2;
        switch (i2) {
            case 1:
                this.Y = i;
                super(3, continuation);
                return;
            default:
                return;
        }
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                int intValue = ((Number) obj2).intValue();
                ey6 ey6 = new ey6(3, (Continuation) obj3, 0);
                ey6.Z = (String) obj;
                ey6.Y = intValue;
                return ey6.o(jue.a);
            default:
                pda pda = (pda) obj2;
                ey6 ey62 = new ey6(this.Y, (Continuation) obj3, 1);
                ey62.Z = (ImageView) obj;
                jue jue = jue.a;
                ey62.o(jue);
                return jue;
        }
    }

    public final Object o(Object obj) {
        boolean z = true;
        switch (this.X) {
            case 0:
                wx3.H(obj);
                int i = this.Y;
                if (!(((String) this.Z).length() == i || i == -1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                wx3.H(obj);
                ImageView imageView = (ImageView) this.Z;
                int i2 = phc.F;
                s59 s59 = km4.y0;
                yn6 icon = s59.r(imageView).getIcon();
                Drawable b = gq3.b(imageView.getContext(), i2);
                js.D(b, icon.i);
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                int i3 = this.Y;
                shapeDrawable.setIntrinsicWidth(i3);
                shapeDrawable.setIntrinsicHeight(i3);
                shapeDrawable.setTint(s59.r(imageView).b().a.g);
                int X2 = (i3 - a24.X(((float) 16) * dh4.c().getDisplayMetrics().density)) / 2;
                int X3 = (i3 - a24.X(((float) 12) * dh4.c().getDisplayMetrics().density)) / 2;
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, b});
                layerDrawable.setLayerInset(1, X2, X3, X2, X3);
                imageView.setImageDrawable(layerDrawable);
                return jue.a;
        }
    }
}
