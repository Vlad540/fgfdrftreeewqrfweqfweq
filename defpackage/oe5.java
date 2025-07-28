package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;

/* renamed from: oe5  reason: default package */
public final /* synthetic */ class oe5 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ qe5 c;

    public /* synthetic */ oe5(Context context, qe5 qe5, int i) {
        this.a = i;
        this.b = context;
        this.c = qe5;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [android.view.View, java.lang.Object, xp6] */
    public final Object invoke() {
        switch (this.a) {
            case 0:
                ud5 ud5 = new ud5(this.b);
                this.c.addView(ud5);
                return ud5;
            case 1:
                ImageView imageView = new ImageView(this.b);
                float f = (float) 44;
                imageView.setLayoutParams(new ViewGroup.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
                qe5 qe5 = this.c;
                imageView.setBackground(qe5.P0);
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                imageView.setTranslationZ(Float.MAX_VALUE);
                qe5.addView(imageView);
                return imageView;
            case 2:
                ? xp6 = new xp6(this.b);
                this.c.addView(xp6);
                return xp6;
            default:
                c2f c2f = new c2f(this.b);
                c2f.setBackgroundEnabled(true);
                this.c.addView(c2f);
                return c2f;
        }
    }
}
