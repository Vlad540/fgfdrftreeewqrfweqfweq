package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.ImageView;

/* renamed from: aw6  reason: default package */
public final /* synthetic */ class aw6 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ cw6 c;

    public /* synthetic */ aw6(Context context, cw6 cw6, int i) {
        this.a = i;
        this.b = context;
        this.c = cw6;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                mya mya = new mya(this.b);
                mya.setListener(this.c);
                return mya;
            default:
                ImageView imageView = new ImageView(this.b);
                Drawable b2 = gq3.b(imageView.getContext(), phc.b2);
                js.D(b2, -855638017);
                imageView.setImageDrawable(b2);
                imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(qda.f.a.f), (Drawable) null, (Drawable) null));
                int X = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
                imageView.setPadding(X, X, X, X);
                a24.Z(imageView, 300, new bw6(this.c, 1));
                return imageView;
        }
    }
}
