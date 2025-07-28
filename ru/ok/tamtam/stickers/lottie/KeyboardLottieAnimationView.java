package ru.ok.tamtam.stickers.lottie;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.facebook.drawee.view.SimpleDraweeView;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieImageView;
import ru.ok.messages.stickers.widgets.StickerView;

@Deprecated
public class KeyboardLottieAnimationView extends RLottieImageView implements RLottieDrawable.OnNextFrameRenderedListener, RLottieDrawable.DrawableLoadListener {
    public boolean B0;
    public a87 C0;
    public z77 D0;

    public KeyboardLottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onError(Throwable th) {
        z77 z77 = this.D0;
        if (z77 != null) {
            ((xsd) z77).getClass();
            int i = StickerView.B0;
            udd.s("ru.ok.messages.stickers.widgets.StickerView", "lottie set animation failed: ", th);
        }
    }

    public final void onLoaded(RLottieDrawable rLottieDrawable) {
        udd.p("ru.ok.tamtam.stickers.lottie.KeyboardLottieAnimationView", "onLoaded %s", new Object[]{rLottieDrawable});
    }

    public final void onNextFrameRendered(RLottieDrawable rLottieDrawable, int i) {
        if (this.B0) {
            a87 a87 = this.C0;
            if (a87 != null) {
                int i2 = StickerView.B0;
                StickerView stickerView = (StickerView) ((sic) a87).b;
                stickerView.removeCallbacks(stickerView.A0);
                SimpleDraweeView simpleDraweeView = stickerView.o;
                if (simpleDraweeView.getHierarchy().e.a(1) != null) {
                    simpleDraweeView.getHierarchy().i((Drawable) null, 1);
                }
                simpleDraweeView.setController((gn4) null);
            }
            this.B0 = false;
        }
    }

    public void setFailureListener(z77 z77) {
        this.D0 = z77;
    }

    public void setOnFirstFrameListener(a87 a87) {
        this.C0 = a87;
        this.B0 = true;
    }
}
