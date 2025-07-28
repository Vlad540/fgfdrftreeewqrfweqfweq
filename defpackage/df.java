package defpackage;

import com.facebook.animated.gif.GifImage;

/* renamed from: df  reason: default package */
public final class df {
    public static final GifImage a;
    public static final GifImage b;

    static {
        GifImage gifImage;
        GifImage gifImage2 = null;
        try {
            gifImage = GifImage.class.newInstance();
        } catch (Throwable unused) {
            gifImage = null;
        }
        a = gifImage;
        try {
            gifImage2 = (GifImage) Class.forName("com.facebook.animated.webp.WebPImage").newInstance();
        } catch (Throwable unused2) {
        }
        b = gifImage2;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [zg0, z03] */
    public static z03 a(String str, gq6 gq6, GifImage gifImage) {
        gq6.getClass();
        nxc nxc = new nxc(gifImage);
        nxc.c = null;
        nxc.o = null;
        nxc.a = str;
        stf o = nxc.o();
        ? zg0 = new zg0();
        zg0.o = o;
        zg0.X = true;
        return zg0;
    }
}
