package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

/* renamed from: uda  reason: default package */
public final /* synthetic */ class uda implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ nea c;

    public /* synthetic */ uda(Context context, nea nea, int i) {
        this.a = i;
        this.b = context;
        this.c = nea;
    }

    public final Object invoke() {
        ViewGroup.LayoutParams layoutParams;
        switch (this.a) {
            case 0:
                ddd ddd = new ddd(this.b);
                ddd.setId(qhc.L0);
                ddd.setEllipsize(TextUtils.TruncateAt.END);
                s59 s59 = km4.y0;
                ddd.setTextColor(s59.r(ddd).getText().e);
                ddd.setSingleLine();
                c9 c9Var = new c9(21);
                wcd wcd = (wcd) c9Var.b;
                wcd.k = false;
                wcd.d = s59.r(ddd).getText().a;
                c9Var.s(s59.r(ddd).getText().g);
                wcd.i = 0.0f;
                c9Var.u(900);
                c9Var.r();
                c9Var.v(a24.X(((float) 360) * dh4.c().getDisplayMetrics().density));
                wcd.q = new LinearInterpolator();
                wcd i = c9Var.i();
                ddd.b.b(i);
                if (i.j) {
                    ddd.setLayerType(2, ddd.a);
                } else {
                    ddd.setLayerType(0, (Paint) null);
                }
                fja.d(ddd);
                nte.o.b(ddd, yq4.b);
                nea nea = this.c;
                nea.getClass();
                k77 k77 = nea.L0[5];
                ddd.a(((Boolean) nea.x0.b).booleanValue());
                nea.addView(ddd);
                return ddd;
            case 1:
                mz9 mz9 = new mz9(this.b);
                mz9.setId(qhc.N0);
                nea nea2 = this.c;
                if (nea2.getForm() == fea.c) {
                    float f = (float) 40;
                    layoutParams = new ViewGroup.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density));
                } else {
                    float f2 = (float) 24;
                    layoutParams = new ViewGroup.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density));
                }
                mz9.setLayoutParams(layoutParams);
                mz9.setAvatarShape(dz9.a);
                nea2.addView(mz9);
                return mz9;
            case 2:
                ImageView imageView = new ImageView(this.b);
                imageView.setId(qhc.O0);
                float f3 = (float) 16;
                imageView.setLayoutParams(new ViewGroup.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f3 * dh4.c().getDisplayMetrics().density)));
                imageView.setImageDrawable(gq3.b(imageView.getContext(), phc.Y));
                imageView.setImageTintList(ColorStateList.valueOf(km4.y0.r(imageView).getIcon().f));
                this.c.addView(imageView);
                return imageView;
            default:
                pea pea = new pea(this.b);
                pea.setId(qhc.K0);
                pea.setVisibility(8);
                pea.setAlpha(0.0f);
                pea.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                this.c.addView(pea);
                return pea;
        }
    }
}
