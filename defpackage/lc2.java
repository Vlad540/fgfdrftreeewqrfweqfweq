package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: lc2  reason: default package */
public final /* synthetic */ class lc2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ImageView b;
    public final /* synthetic */ mc2 c;

    public /* synthetic */ lc2(mc2 mc2, ImageView imageView, int i) {
        this.a = i;
        this.c = mc2;
        this.b = imageView;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                mc2 mc2 = this.c;
                mc2.K0 = true;
                int i = l9a.d;
                s59 s59 = km4.y0;
                ImageView imageView = this.b;
                yn6 icon = s59.r(imageView).getIcon();
                Drawable b2 = gq3.b(imageView.getContext(), i);
                js.D(b2, icon.f);
                imageView.setImageDrawable(b2);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setVisibility(0);
                mc2.w();
                return;
            case 1:
                ImageView imageView2 = this.b;
                imageView2.animate().alpha(0.0f).setDuration(500).withEndAction(new lc2(this.c, imageView2, 2));
                return;
            default:
                mc2 mc22 = this.c;
                mc22.K0 = false;
                ImageView imageView3 = this.b;
                imageView3.setImageDrawable((Drawable) null);
                imageView3.setVisibility(4);
                mc22.w();
                return;
        }
    }

    public /* synthetic */ lc2(ImageView imageView, mc2 mc2) {
        this.a = 1;
        this.b = imageView;
        this.c = mc2;
    }
}
