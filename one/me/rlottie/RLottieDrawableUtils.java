package one.me.rlottie;

import android.graphics.Bitmap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u000b\u001a\u00020\n*\u00020\u00002\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lone/me/rlottie/RLottieDrawable;", "", "networkFetchEnabled", "Ljue;", "restartDownloadFromUrl", "(Lone/me/rlottie/RLottieDrawable;Z)V", "", "getFrameRate", "(Lone/me/rlottie/RLottieDrawable;)I", "frame", "Ltwb;", "getLottieFrameAt", "(Lone/me/rlottie/RLottieDrawable;I)Ltwb;", "width", "height", "(Lone/me/rlottie/RLottieDrawable;III)Ltwb;", "rlottie_release"}, k = 2, mv = {2, 0, 0})
public final class RLottieDrawableUtils {
    public static final int getFrameRate(RLottieDrawable rLottieDrawable) {
        return rLottieDrawable.c[1];
    }

    public static final twb getLottieFrameAt(RLottieDrawable rLottieDrawable, int i) {
        return getLottieFrameAt(rLottieDrawable, i, rLottieDrawable.a, rLottieDrawable.b);
    }

    public static final void restartDownloadFromUrl(RLottieDrawable rLottieDrawable, boolean z) {
        String str = rLottieDrawable.E1;
        if (str != null) {
            kg9.a(str, 1, z).e(rLottieDrawable);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, twb] */
    public static final twb getLottieFrameAt(RLottieDrawable rLottieDrawable, int i, int i2, int i3) {
        Bitmap bitmap;
        ? obj = new Object();
        try {
            bitmap = Bitmap.createBitmap(i2, i3, Bitmap.Config.ARGB_8888);
        } catch (Throwable unused) {
            bitmap = null;
        }
        Bitmap bitmap2 = bitmap;
        if (bitmap2 != null) {
            RLottieDrawable.getFrame(rLottieDrawable.h1, i, bitmap2, i2, i3, bitmap2.getRowBytes(), true);
        }
        return obj;
    }
}
