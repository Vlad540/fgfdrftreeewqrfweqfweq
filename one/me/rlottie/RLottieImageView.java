package one.me.rlottie;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.HashMap;
import java.util.Map;

public class RLottieImageView extends AppCompatImageView {
    public boolean A0;
    public boolean cached;
    public HashMap o;
    public RLottieDrawable w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    public RLottieImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void a() {
        playAnimation();
    }

    public void clearAnimationDrawable() {
        RLottieDrawable rLottieDrawable = this.w0;
        if (rLottieDrawable != null) {
            rLottieDrawable.stop();
        }
        this.w0 = null;
        setImageDrawable((Drawable) null);
    }

    public void clearLayerColors() {
        this.o.clear();
    }

    public void d() {
        stopAnimation();
    }

    public RLottieDrawable getAnimatedDrawable() {
        return this.w0;
    }

    public ImageReceiver getImageReceiver() {
        return null;
    }

    public boolean isPlaying() {
        RLottieDrawable rLottieDrawable = this.w0;
        return rLottieDrawable != null && rLottieDrawable.isRunning();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.graphics.drawable.Drawable$Callback, android.view.View, one.me.rlottie.RLottieImageView] */
    public final void onAttachedToWindow() {
        RLottieImageView.super.onAttachedToWindow();
        this.y0 = true;
        RLottieDrawable rLottieDrawable = this.w0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(this);
            if (this.z0) {
                this.w0.start();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, one.me.rlottie.RLottieImageView] */
    public final void onDetachedFromWindow() {
        RLottieImageView.super.onDetachedFromWindow();
        this.y0 = false;
        RLottieDrawable rLottieDrawable = this.w0;
        if (rLottieDrawable != null) {
            rLottieDrawable.stop();
        }
    }

    public void playAnimation() {
        RLottieDrawable rLottieDrawable = this.w0;
        if (rLottieDrawable != null) {
            this.z0 = true;
            if (this.y0 && rLottieDrawable != null) {
                rLottieDrawable.start();
            }
        }
    }

    public void replaceColors(int[] iArr) {
        RLottieDrawable rLottieDrawable = this.w0;
        if (rLottieDrawable != null) {
            rLottieDrawable.replaceColors(iArr);
        }
    }

    public void setAnimation(int i, int i2, int i3) {
        setAnimation(i, i2, i3, (int[]) null);
    }

    public void setAutoRepeat(boolean z) {
        this.x0 = z;
        this.A0 = true;
        RLottieDrawable rLottieDrawable = this.w0;
        if (rLottieDrawable != null && z) {
            rLottieDrawable.setAutoRepeat(1);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [androidx.appcompat.widget.AppCompatImageView, android.view.View, one.me.rlottie.RLottieImageView] */
    public void setImageDrawable(Drawable drawable) {
        if (drawable instanceof RLottieDrawable) {
            RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
            this.w0 = rLottieDrawable;
            if (this.A0) {
                if (this.x0) {
                    rLottieDrawable.setAutoRepeat(1);
                } else {
                    rLottieDrawable.setAutoRepeat(0);
                }
            }
            this.w0.setMasterParent(this);
            if (this.x0) {
                this.w0.setAutoRepeat(1);
            }
            if (this.o != null) {
                this.w0.beginApplyLayerColors();
                for (Map.Entry entry : this.o.entrySet()) {
                    this.w0.setLayerColor((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
                this.w0.commitApplyLayerColors();
            }
            this.w0.setAllowDecodeSingleFrame(true);
            this.z0 = this.w0.f1;
        } else {
            this.z0 = false;
        }
        RLottieImageView.super.setImageDrawable(this.w0);
    }

    public void setImageResource(int i) {
        RLottieImageView.super.setImageResource(i);
        this.w0 = null;
    }

    public void setLayerColor(String str, int i) {
        if (this.o == null) {
            this.o = new HashMap();
        }
        this.o.put(str, Integer.valueOf(i));
        RLottieDrawable rLottieDrawable = this.w0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setLayerColor(str, i);
        }
    }

    public void setOnAnimationEndListener(Runnable runnable) {
        RLottieDrawable rLottieDrawable = this.w0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setOnAnimationEndListener(runnable);
        }
    }

    public void setOnlyLastFrame(boolean z) {
    }

    public void setProgress(float f) {
        RLottieDrawable rLottieDrawable = this.w0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setProgress(f);
        }
    }

    public void setReverse() {
        RLottieDrawable rLottieDrawable = this.w0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
            RLottieDrawable rLottieDrawable2 = this.w0;
            rLottieDrawable2.setCurrentFrame(rLottieDrawable2.getFramesCount());
            this.w0.setCustomEndFrame(0);
        }
    }

    public void stopAnimation() {
        RLottieDrawable rLottieDrawable = this.w0;
        if (rLottieDrawable != null) {
            this.z0 = false;
            if (this.y0 && rLottieDrawable != null) {
                rLottieDrawable.stop();
            }
        }
    }

    public RLottieImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0 = false;
    }

    public void setAnimation(int i, int i2, int i3, int[] iArr) {
        setAnimation(new RLottieDrawable(i, wn6.h(i, ""), je.a((float) i2), je.a((float) i3), false, iArr));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [android.view.View, one.me.rlottie.RLottieImageView] */
    public void setAnimation(RLottieDrawable rLottieDrawable) {
        if (this.w0 != rLottieDrawable) {
            this.w0 = rLottieDrawable;
            rLottieDrawable.setMasterParent(this);
            if (this.x0) {
                this.w0.setAutoRepeat(1);
            }
            if (this.o != null) {
                this.w0.beginApplyLayerColors();
                for (Map.Entry entry : this.o.entrySet()) {
                    this.w0.setLayerColor((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
                this.w0.commitApplyLayerColors();
            }
            this.w0.setAllowDecodeSingleFrame(true);
            setImageDrawable(this.w0);
        }
    }
}
