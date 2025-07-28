package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import one.me.sdk.media.ffmpeg.AnimatedFileDrawable;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* renamed from: bqf  reason: default package */
public final class bqf extends ImageView implements AnimatedFileDrawable.OnNextFrameRenderedListener, cr7 {
    public String a;
    public boolean b;
    public aqf c;
    public boolean o;
    public AnimatedFileDrawable w0;
    public final gi x0 = new gi(4, this);

    public bqf(Context context) {
        super(context, (AttributeSet) null);
    }

    public final void a() {
        AnimatedFileDrawable animatedFileDrawable;
        this.o = true;
        if (isAttachedToWindow() && (animatedFileDrawable = this.w0) != null) {
            animatedFileDrawable.start();
        }
    }

    public final void c() {
        AnimatedFileDrawable animatedFileDrawable;
        if (this.w0 != null) {
            this.o = false;
            if (isAttachedToWindow() && (animatedFileDrawable = this.w0) != null) {
                animatedFileDrawable.stop();
            }
        }
        AnimatedFileDrawable animatedFileDrawable2 = this.w0;
        if (animatedFileDrawable2 != null) {
            animatedFileDrawable2.recycle();
        }
        AnimatedFileDrawable animatedFileDrawable3 = this.w0;
        if (animatedFileDrawable3 != null) {
            animatedFileDrawable3.stop();
        }
        this.w0 = null;
        setImageDrawable((Drawable) null);
        this.a = null;
    }

    public final void d() {
        AnimatedFileDrawable animatedFileDrawable;
        if (this.w0 != null) {
            this.o = false;
            if (isAttachedToWindow() && (animatedFileDrawable = this.w0) != null) {
                animatedFileDrawable.stop();
            }
        }
    }

    public final void onAttachedToWindow() {
        AnimatedFileDrawable animatedFileDrawable;
        super.onAttachedToWindow();
        AnimatedFileDrawable animatedFileDrawable2 = this.w0;
        if (animatedFileDrawable2 != null) {
            animatedFileDrawable2.setCallback(this);
        }
        AnimatedFileDrawable animatedFileDrawable3 = this.w0;
        if (animatedFileDrawable3 != null) {
            animatedFileDrawable3.addParent(this.x0);
        }
        if (this.o && (animatedFileDrawable = this.w0) != null) {
            animatedFileDrawable.start();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatedFileDrawable animatedFileDrawable = this.w0;
        if (animatedFileDrawable != null) {
            animatedFileDrawable.stop();
        }
        AnimatedFileDrawable animatedFileDrawable2 = this.w0;
        if (animatedFileDrawable2 != null) {
            animatedFileDrawable2.removeParent(this.x0);
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [one.me.sdk.uikit.common.views.OneMeDraweeView, android.view.View] */
    public final void onNextFrameRendered(AnimatedFileDrawable animatedFileDrawable) {
        if (this.b) {
            aqf aqf = this.c;
            if (aqf != null) {
                cqf cqf = (cqf) ((xle) aqf).b;
                ((OneMeDraweeView) cqf.a.b).setVisibility(8);
                if (cqf.c) {
                    cqf.o = true;
                }
            }
            this.b = false;
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (drawable instanceof AnimatedFileDrawable) {
            AnimatedFileDrawable animatedFileDrawable = (AnimatedFileDrawable) drawable;
            this.w0 = animatedFileDrawable;
            AnimatedFileDrawable animatedFileDrawable2 = drawable instanceof AnimatedFileDrawable ? animatedFileDrawable : null;
            gi giVar = this.x0;
            if (animatedFileDrawable2 != null) {
                animatedFileDrawable2.removeParent(giVar);
            }
            animatedFileDrawable.addParent(giVar);
            this.o = true;
        } else {
            this.o = false;
        }
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        super.setImageResource(i);
        this.w0 = null;
    }

    public final void setOnFirstFrameListener(aqf aqf) {
        this.c = aqf;
        this.b = true;
    }
}
