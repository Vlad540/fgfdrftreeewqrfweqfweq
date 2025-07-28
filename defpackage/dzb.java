package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.Iterator;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;
import one.me.rlottie.RLottieImageViewUtils;

/* renamed from: dzb  reason: default package */
public final class dzb extends FrameLayout {
    public final String a = dzb.class.getName();
    public int b = 3;

    public dzb(Context context) {
        super(context, (AttributeSet) null, 0);
        setBackgroundColor(0);
        setClipChildren(false);
    }

    public static float c(int i, Rect rect) {
        return ((float) ((a24.X(((float) 20) * dh4.c().getDisplayMetrics().density) / 2) + me4.c((float) 10, dh4.c().getDisplayMetrics().density, rect.left))) - (((float) i) / 2.0f);
    }

    private final dyc getLotties() {
        return myc.L(new es(8, this), x51.Z);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [android.view.View, one.me.rlottie.RLottieImageView] */
    /* JADX WARNING: type inference failed for: r0v6, types: [android.view.View, one.me.rlottie.RLottieImageView] */
    public final void a(long j, RLottieDrawable rLottieDrawable, Rect rect) {
        rg5 rg5 = new rg5(myc.L(getLotties(), new je2(j, 5)));
        while (rg5.hasNext()) {
            ? r0 = (RLottieImageView) rg5.next();
            r0.stopAnimation();
            removeView(r0);
        }
        int childCount = getChildCount();
        int i = this.b;
        String str = this.a;
        if (childCount >= i) {
            udd.U(str, "Reaction effect. Reached max count of lotties effects");
            return;
        }
        int intrinsicWidth = rLottieDrawable.getIntrinsicWidth();
        int intrinsicHeight = rLottieDrawable.getIntrinsicHeight();
        ? rLottieImageView = new RLottieImageView(getContext());
        RLottieImageViewUtils.setLottieDrawable(rLottieImageView, rLottieDrawable);
        rLottieImageView.playAnimation();
        hhd.P(xqb.tag_reaction_effects_view, rLottieImageView, Long.valueOf(j));
        setLayoutDirection(0);
        rLottieImageView.setLayoutParams(new FrameLayout.LayoutParams(intrinsicWidth, intrinsicHeight));
        rLottieImageView.setX(c(intrinsicWidth, rect));
        rLottieImageView.setY(((float) rect.centerY()) - (((float) intrinsicHeight) / 2.0f));
        addView(rLottieImageView);
        bzb bzb = new bzb(this, rLottieImageView);
        rLottieDrawable.addDrawableLoadListener(bzb);
        czb czb = new czb(this, rLottieImageView);
        rLottieDrawable.addOnAllFramesRenderedListener(czb);
        if (!rLottieImageView.isAttachedToWindow()) {
            udd.q(str, "onDetach");
            rLottieDrawable.removeDrawableLoadListener(bzb);
            rLottieDrawable.removeOnAllFramesRenderedListener(czb);
            return;
        }
        rLottieImageView.addOnAttachStateChangeListener(new azb(rLottieImageView, this, rLottieDrawable, bzb, czb));
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.view.View, one.me.rlottie.RLottieImageView] */
    public final void b() {
        for (? r1 : getLotties()) {
            r1.stopAnimation();
            removeView(r1);
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [android.widget.ImageView, android.view.View, one.me.rlottie.RLottieImageView] */
    /* JADX WARNING: type inference failed for: r2v1, types: [android.view.View, one.me.rlottie.RLottieImageView] */
    public final void d(long j, Rect rect) {
        Object obj;
        Iterator it = getLotties().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (hhd.f(hhd.E((RLottieImageView) obj, xqb.tag_reaction_effects_view), Long.valueOf(j))) {
                break;
            }
        }
        ? r1 = (RLottieImageView) obj;
        if (r1 != 0) {
            if (!r1.isPlaying()) {
                udd.q(this.a, "Reaction effect. Skip move");
                return;
            }
            Drawable drawable = r1.getDrawable();
            r1.setX(c(drawable.getIntrinsicWidth(), rect));
            r1.setY(((float) rect.centerY()) - (((float) drawable.getIntrinsicHeight()) / 2.0f));
        }
    }

    public final int getLottieMaxCount() {
        return this.b;
    }

    public final void setLottieMaxCount(int i) {
        this.b = i;
    }

    public final void setScrollOffset(int i) {
        float f = (float) i;
        u1 u1Var = new u1(4, this);
        while (u1Var.hasNext()) {
            View view = (View) u1Var.next();
            view.setTranslationY(view.getTranslationY() + f);
        }
    }
}
