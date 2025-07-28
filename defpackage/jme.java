package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: jme  reason: default package */
public final class jme extends PopupWindow implements mhe {
    public pfe A0;
    public final t97 B0;
    public final int X;
    public final int Y;
    public final ImageView Z;
    public final View a;
    public final s16 b;
    public final s16 c;
    public final s16 o;
    public final TextView w0;
    public final TextView x0;
    public final ImageView y0;
    public final Handler z0;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jme(Context context, View view, s16 s16, s16 s162, int i, int i2, int i3) {
        this(context, view, s16, (i3 & 8) != 0 ? new ce5(1, s16) : s162, (s16) (i3 & 16) != 0 ? new ce5(2, s16) : null, (i3 & 32) != 0 ? 2 : i, (i3 & 64) != 0 ? 2 : i2);
    }

    public static void b(jme jme, View view, boolean z, hme hme, int i) {
        hme hme2 = (i & 4) != 0 ? null : hme;
        jme.getClass();
        int i2 = qhc.P0;
        Object tag = view.getTag(i2);
        if (tag == null) {
            if ((view.getVisibility() == 0) == z) {
                if (hme2 != null) {
                    hme2.invoke();
                    return;
                }
                return;
            }
        }
        boolean f = hhd.f(tag, "fade_in");
        boolean f2 = hhd.f(tag, "fade_out");
        if (f && z) {
            return;
        }
        if (!f2 || z) {
            String str = z ? "fade_in" : "fade_out";
            view.animate().cancel();
            view.clearAnimation();
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.setAnimationListener((Animation.AnimationListener) null);
            }
            float alpha = view.getAlpha();
            float f3 = z ? 1.0f : 0.0f;
            float f4 = z ? dh4.c().getDisplayMetrics().density * 24.0f : dh4.c().getDisplayMetrics().density * 0.0f;
            float f5 = z ? dh4.c().getDisplayMetrics().density * 0.0f : dh4.c().getDisplayMetrics().density * 24.0f;
            if (z) {
                view.setTranslationY(f4);
            }
            view.animate().setDuration(150).alpha(f3).translationY(f5).setInterpolator(z ? new DecelerateInterpolator() : new AccelerateInterpolator()).setListener(new ime(view, i2, str, alpha, f3, z, f5, hme2)).start();
        }
    }

    public final void a() {
        View contentView = getContentView();
        if (contentView != null) {
            b(this, contentView, false, new hme(this, 0), 2);
        }
    }

    public final void c(Integer num) {
        ImageView imageView = this.Z;
        int i = 0;
        imageView.setVisibility(num != null ? 0 : 8);
        s16 s16 = this.o;
        imageView.setImageTintList(s16 != null ? ColorStateList.valueOf(((Number) s16.invoke()).intValue()) : null);
        if (num != null) {
            imageView.setImageResource(num.intValue());
        }
        TextView textView = this.w0;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            if (num != null) {
                i = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
            }
            marginLayoutParams.topMargin = i;
            textView.setLayoutParams(marginLayoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public final void d(mge mge) {
        TextView textView = this.w0;
        textView.setText(mge.a(textView.getContext()));
    }

    public final void dismiss() {
        super.dismiss();
        try {
            pfe pfe = this.A0;
            if (pfe != null) {
                this.z0.removeCallbacks(pfe);
            }
        } catch (Exception e) {
            udd.S(jme.class.getName(), e.getMessage(), e);
        }
        this.A0 = null;
    }

    public final void e(Point point, int i, long j) {
        pfe pfe = this.A0;
        Handler handler = this.z0;
        if (pfe != null) {
            handler.removeCallbacks(pfe);
            this.A0 = null;
        }
        showAtLocation(this.a, i, point.x - (getWidth() / 2), point.y);
        View contentView = getContentView();
        if (contentView != null) {
            b(this, contentView, true, (hme) null, 6);
        }
        pfe pfe2 = new pfe(1, this);
        handler.postDelayed(pfe2, j);
        this.A0 = pfe2;
    }

    public final void onThemeChanged(pda pda) {
        s16 s16 = this.b;
        pda pda2 = (pda) s16.invoke();
        ImageView imageView = this.Z;
        s16 s162 = this.o;
        imageView.setImageTintList(s162 != null ? ColorStateList.valueOf(((Number) s162.invoke()).intValue()) : null);
        this.w0.setTextColor(ColorStateList.valueOf(pda2.getText().e));
        ((eme) this.B0.getValue()).onThemeChanged(pda);
        ImageView imageView2 = this.y0;
        ((pda) s16.invoke()).getIcon();
        imageView2.setImageTintList(ColorStateList.valueOf(-1));
    }

    public jme(Context context, View view, s16 s16, s16 s162, s16 s163, int i, int i2) {
        Context context2 = context;
        int i3 = i;
        this.a = view;
        this.b = s16;
        this.c = s162;
        this.o = s163;
        this.X = i3;
        this.Y = i2;
        this.z0 = new Handler(Looper.getMainLooper());
        t97 O = ez3.O(3, new hme(this, 1));
        this.B0 = O;
        pda pda = (pda) s16.invoke();
        setHeight(-2);
        setWidth(-2);
        setOutsideTouchable(false);
        ImageView imageView = new ImageView(context2);
        imageView.setId(qhc.R0);
        imageView.setLayoutParams(new re3(-2, -2));
        imageView.setVisibility(8);
        this.Z = imageView;
        TextView textView = new TextView(context2);
        textView.setId(qhc.T0);
        textView.setLayoutParams(new re3(-1, -2));
        textView.setGravity(17);
        textView.setMaxLines(3);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView.setTextColor(ColorStateList.valueOf(pda.getText().e));
        nte.o.b(textView, yq4.b);
        this.w0 = textView;
        ImageView imageView2 = new ImageView(context2);
        imageView2.setId(qhc.Q0);
        float f = (float) 20;
        imageView2.setLayoutParams(new re3(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(f * dh4.c().getDisplayMetrics().density)));
        imageView2.setImageResource(phc.i0);
        ((pda) s16.invoke()).getClass();
        imageView2.setImageTintList(ColorStateList.valueOf(-1));
        a24.a0(imageView2, new wfc(11, this));
        imageView2.setVisibility(8);
        this.y0 = imageView2;
        TextView textView2 = new TextView(context2);
        textView2.setId(qhc.S0);
        textView2.setLayoutParams(new re3(-1, -2));
        textView2.setGravity(17);
        textView2.setMaxLines(3);
        textView2.setEllipsize(truncateAt);
        textView2.setTextColor(ColorStateList.valueOf(pda.getText().f));
        nte.r.b(textView2, yq4.b);
        textView2.setVisibility(8);
        this.x0 = textView2;
        ConstraintLayout constraintLayout = new ConstraintLayout(context2);
        float f2 = (float) 10;
        int X2 = a24.X(dh4.c().getDisplayMetrics().density * f2) + (i3 == 1 ? a24.X(((float) 8) * dh4.c().getDisplayMetrics().density) : 0);
        int X3 = a24.X(f2 * dh4.c().getDisplayMetrics().density) + (i3 == 2 ? a24.X(((float) 8) * dh4.c().getDisplayMetrics().density) : 0);
        float f3 = (float) 12;
        constraintLayout.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f3), X2, a24.X(f3 * dh4.c().getDisplayMetrics().density), X3);
        constraintLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        constraintLayout.setBackground((eme) O.getValue());
        constraintLayout.addView(imageView2);
        constraintLayout.addView(imageView);
        constraintLayout.addView(textView);
        constraintLayout.addView(textView2);
        constraintLayout.setVisibility(8);
        bf3 p = a06.p(constraintLayout);
        int id = imageView2.getId();
        p.d(id, 3, 0, 3);
        p.d(id, 7, 0, 7);
        int id2 = imageView.getId();
        p.d(id2, 6, 0, 6);
        p.d(id2, 7, 0, 7);
        p.d(id2, 3, 0, 3);
        p.d(id2, 4, textView.getId(), 3);
        p.g(id2).d.W = 2;
        int id3 = textView.getId();
        p.d(id3, 3, imageView.getId(), 4);
        p.d(id3, 6, 0, 6);
        p.d(id3, 7, imageView2.getId(), 6);
        p.d(id3, 4, textView2.getId(), 3);
        int id4 = textView2.getId();
        p.d(id4, 3, textView.getId(), 4);
        new hw9(p, 3, id4, 4).e(a24.X(((float) 4) * dh4.c().getDisplayMetrics().density));
        p.d(id4, 7, textView.getId(), 7);
        p.d(id4, 6, textView.getId(), 6);
        p.d(id4, 4, 0, 4);
        p.a(constraintLayout);
        setContentView(constraintLayout);
    }
}
