package defpackage;

import android.graphics.Bitmap;

/* renamed from: gq6  reason: default package */
public final class gq6 {
    public static final gq6 c;
    public final Bitmap.Config a;
    public final Bitmap.Config b;

    /* JADX WARNING: type inference failed for: r0v0, types: [nu7, java.lang.Object] */
    static {
        ? obj = new Object();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        obj.a = config;
        obj.b = config;
        c = new gq6(obj);
    }

    public gq6(nu7 nu7) {
        this.a = (Bitmap.Config) nu7.a;
        this.b = (Bitmap.Config) nu7.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gq6.class != obj.getClass()) {
            return false;
        }
        gq6 gq6 = (gq6) obj;
        return this.a == gq6.a && this.b == gq6.b;
    }

    public final int hashCode() {
        int ordinal = (this.a.ordinal() - 552645669) * 31;
        Bitmap.Config config = this.b;
        return (ordinal + (config != null ? config.ordinal() : 0)) * 29791;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageDecodeOptions{");
        jg8 X = at7.X(this);
        X.f(100, "minDecodeIntervalMs");
        X.f(Integer.MAX_VALUE, "maxDimensionPx");
        X.g("decodePreviewFrame", false);
        X.g("useLastFrameForPreview", false);
        X.g("useEncodedImageForPreview", false);
        X.g("decodeAllFrames", false);
        X.g("forceStaticImage", false);
        X.h(this.a.name(), "bitmapConfigName");
        X.h(this.b.name(), "animatedBitmapConfigName");
        X.h((Object) null, "customImageDecoder");
        X.h((Object) null, "bitmapTransformation");
        X.h((Object) null, "colorSpace");
        return wn6.l(sb, X.toString(), "}");
    }
}
