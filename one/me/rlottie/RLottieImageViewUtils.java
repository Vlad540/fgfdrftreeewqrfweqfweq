package one.me.rlottie;

import java.io.File;
import kotlin.Metadata;
import org.apache.http.HttpStatus;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a)\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a3\u0010\u000b\u001a\u00020\u0006*\u00020\u00002\b\b\u0001\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a)\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a)\u0010\u0012\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\b\u001a\u0019\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0019\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0019\u0010\u001c\u001a\u00020\u0018*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\u001a\u001a\u0011\u0010\u001d\u001a\u00020\u0018*\u00020\u0000¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lone/me/rlottie/RLottieImageView;", "", "assetsResName", "", "width", "height", "", "setAssetsRes", "(Lone/me/rlottie/RLottieImageView;Ljava/lang/String;II)Z", "rawResId", "cacheName", "setRawRes", "(Lone/me/rlottie/RLottieImageView;ILjava/lang/String;II)Z", "Ljava/io/File;", "file", "setFile", "(Lone/me/rlottie/RLottieImageView;Ljava/io/File;II)Z", "url", "setUrl", "Lone/me/rlottie/RLottieDrawable;", "lottieDrawable", "setLottieDrawable", "(Lone/me/rlottie/RLottieImageView;Lone/me/rlottie/RLottieDrawable;)Z", "networkFetchEnabled", "Ljue;", "restartDownloadFromUrl", "(Lone/me/rlottie/RLottieImageView;Z)V", "debug", "setDebug", "release", "(Lone/me/rlottie/RLottieImageView;)V", "rlottie_release"}, k = 2, mv = {2, 0, 0})
public final class RLottieImageViewUtils {
    public static final void release(RLottieImageView rLottieImageView) {
        rLottieImageView.stopAnimation();
        RLottieDrawable rLottieDrawable = rLottieImageView.w0;
        if (rLottieDrawable != null) {
            rLottieDrawable.recycle(je.b());
        }
        rLottieImageView.clearAnimationDrawable();
    }

    public static final void restartDownloadFromUrl(RLottieImageView rLottieImageView, boolean z) {
        RLottieDrawable rLottieDrawable = rLottieImageView.w0;
        if (rLottieDrawable != null) {
            RLottieDrawableUtils.restartDownloadFromUrl(rLottieDrawable, z);
        }
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [android.view.View, one.me.rlottie.RLottieImageView] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean setAssetsRes(one.me.rlottie.RLottieImageView r12, java.lang.String r13, int r14, int r15) {
        /*
            android.content.Context r0 = r12.getContext()
            r10 = 964(0x3c4, float:1.351E-42)
            r11 = 0
            r2 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r1 = r13
            r3 = r14
            r4 = r15
            one.me.rlottie.RLottieDrawable r13 = one.me.rlottie.RLottieFactory.createByAsset$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r12 = setLottieDrawable(r12, r13)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.rlottie.RLottieImageViewUtils.setAssetsRes(one.me.rlottie.RLottieImageView, java.lang.String, int, int):boolean");
    }

    public static final void setDebug(RLottieImageView rLottieImageView, boolean z) {
    }

    public static final boolean setFile(RLottieImageView rLottieImageView, File file, int i, int i2) {
        return setLottieDrawable(rLottieImageView, RLottieFactory.createByFile$default(file, false, i, i2, false, false, false, false, 242, (Object) null));
    }

    public static final boolean setLottieDrawable(RLottieImageView rLottieImageView, RLottieDrawable rLottieDrawable) {
        RLottieDrawable rLottieDrawable2 = rLottieImageView.w0;
        if (rLottieDrawable2 != null && rLottieDrawable2 == rLottieDrawable) {
            return false;
        }
        rLottieImageView.setImageDrawable(rLottieDrawable);
        return true;
    }

    public static final boolean setRawRes(RLottieImageView rLottieImageView, int i, String str, int i2, int i3) {
        return setLottieDrawable(rLottieImageView, RLottieFactory.createByRawRes$default(i, str, i2, i3, false, false, false, false, false, 496, (Object) null));
    }

    public static final boolean setUrl(RLottieImageView rLottieImageView, String str, int i, int i2) {
        return setLottieDrawable(rLottieImageView, RLottieFactory.createByUrl$default(str, i, i2, false, false, false, false, false, false, HttpStatus.SC_GATEWAY_TIMEOUT, (Object) null));
    }
}
