package ru.ok.messages.stickers.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import java.io.File;
import java.util.Collections;
import java.util.Locale;
import java.util.WeakHashMap;
import ru.ok.tamtam.stickers.lottie.KeyboardLottieAnimationView;

public class StickerView extends FrameLayout implements bm6, ee9, q77, xhe {
    public static final /* synthetic */ int B0 = 0;
    public final vp6 A0;
    public final cm6 a = ((cm6) vl.b().getAccessor().c(cm6.class));
    public final dm6 b = ((dm6) vl.b().getAccessor().c(dm6.class));
    public final int c;
    public final SimpleDraweeView o;
    public boolean w0;
    public boolean x0;
    public uud y0;
    public int z0;

    /* JADX WARNING: type inference failed for: r1v8, types: [ru.ok.tamtam.stickers.lottie.KeyboardLottieAnimationView, android.view.View, one.me.rlottie.RLottieImageView] */
    public StickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        vl.b().h();
        xh0 xh0 = (xh0) vl.b().getAccessor().c(xh0.class);
        this.w0 = true;
        this.x0 = false;
        this.A0 = new vp6(29, this);
        Collections.newSetFromMap(new WeakHashMap());
        setClipToPadding(false);
        dh4.b(128);
        this.c = dh4.b(144);
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.o = simpleDraweeView;
        removeCallbacks(this.A0);
        if (simpleDraweeView.getHierarchy().e.a(1) == null) {
            vp6 vp6 = new vp6(29, (StickerView) this.A0.b);
            this.A0 = vp6;
            postDelayed(vp6, 100);
        }
        addView(simpleDraweeView, new FrameLayout.LayoutParams(-1, -1));
        ? keyboardLottieAnimationView = new KeyboardLottieAnimationView(getContext(), (AttributeSet) null);
        addView(keyboardLottieAnimationView, new FrameLayout.LayoutParams(-1, -1));
        keyboardLottieAnimationView.setAutoRepeat(true);
        keyboardLottieAnimationView.setOnFirstFrameListener(new sic(16, this));
        keyboardLottieAnimationView.setFailureListener(new xsd(26));
        keyboardLottieAnimationView.setVisibility(8);
        dh4.b(8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dh4.b(28), dh4.b(28));
        layoutParams.setMarginEnd(dh4.b(2));
        layoutParams.bottomMargin = dh4.b(2);
        layoutParams.gravity = 8388693;
        setOnClickListener(new c14((View.OnClickListener) new wfc(6, this), 0));
        simpleDraweeView.setOnClickListener(new c14((View.OnClickListener) new wfc(6, this), 0));
        c();
    }

    private File getStickerFile() {
        throw null;
    }

    public final boolean B0(int i, KeyEvent keyEvent) {
        return false;
    }

    public final void T() {
    }

    public final void X() {
        udd.n("ru.ok.messages.stickers.widgets.StickerView", "onVideoEnd");
        if (this.x0 && !this.w0) {
            throw null;
        }
    }

    public final void Y(Throwable th) {
        udd.n("ru.ok.messages.stickers.widgets.StickerView", "videoPlayerError");
        this.o.setClickable(true);
    }

    public final void a() {
        f();
    }

    public final void b() {
    }

    public final void c() {
        Context context = getContext();
        r7e r7e = wce.a0;
        fja.E(context);
    }

    public final void d() {
    }

    public final void e(File file) {
        super.clearAnimation();
        post(new uud(this, 2));
        vl.b().p().getClass();
        if (!((hb2) ((nqc) oae.b()).getAccessor().c(hb2.class)).e(true)) {
            vl.b().r();
            throw null;
        }
    }

    public final void f() {
        int i = this.z0 + 1;
        this.z0 = i;
        if (i > 6) {
            post(new uud(this, 0));
            return;
        }
        uud uud = new uud(this, 1);
        this.y0 = uud;
        postDelayed(uud, (long) (((i * i) * 1000) / 2));
    }

    public String getDownloadContext() {
        Locale locale = Locale.ENGLISH;
        throw null;
    }

    public int getMaxHeight() {
        return this.c;
    }

    public osd getSticker() {
        return null;
    }

    public final void j() {
        f();
    }

    public final void k(float f, long j) {
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.A0);
        SimpleDraweeView simpleDraweeView = this.o;
        simpleDraweeView.setClickable(true);
        this.a.c(this);
        this.b.c(this);
        this.w0 = true;
        this.x0 = false;
        this.z0 = 0;
        uud uud = this.y0;
        if (uud != null) {
            removeCallbacks(uud);
        }
        simpleDraweeView.setVisibility(0);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setClickable(boolean z) {
        super.setClickable(z);
        this.o.setClickable(z);
    }

    public void setListener(vud vud) {
    }

    public void setLottieLayer(dr7 dr7) {
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        super.setOnLongClickListener(onLongClickListener);
        this.o.setOnLongClickListener(onLongClickListener);
    }

    public void setStickerMediaPlayerController(q98 q98) {
    }

    public void setUseMaxHeight(boolean z) {
    }
}
