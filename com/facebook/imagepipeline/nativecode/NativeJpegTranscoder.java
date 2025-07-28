package com.facebook.imagepipeline.nativecode;

import android.graphics.ColorSpace;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@lj4
public class NativeJpegTranscoder implements vr6 {
    public boolean a;
    public int b;
    public boolean c;

    public static void e(InputStream inputStream, kl8 kl8, int i, int i2, int i3) {
        jjd.l();
        boolean z = false;
        if (i2 >= 1) {
            if (i2 <= 16) {
                if (i3 >= 0) {
                    if (i3 <= 100) {
                        zy zyVar = z47.a;
                        if (i >= 0 && i <= 270 && i % 90 == 0) {
                            if (!(i2 == 8 && i == 0)) {
                                z = true;
                            }
                            ez3.k("no transformation requested", z);
                            nativeTranscodeJpeg(inputStream, kl8, i, i2, i3);
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static void f(InputStream inputStream, kl8 kl8, int i, int i2, int i3) {
        boolean z;
        jjd.l();
        boolean z2 = false;
        if (i2 >= 1) {
            if (i2 <= 16) {
                if (i3 >= 0) {
                    if (i3 <= 100) {
                        zy zyVar = z47.a;
                        switch (i) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z = true;
                                break;
                            default:
                                z = false;
                                break;
                        }
                        if (z) {
                            if (!(i2 == 8 && i == 1)) {
                                z2 = true;
                            }
                            ez3.k("no transformation requested", z2);
                            nativeTranscodeJpegWithExifOrientation(inputStream, kl8, i, i2, i3);
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @lj4
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @lj4
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    public final String a() {
        return "NativeJpegTranscoder";
    }

    /* JADX INFO: finally extract failed */
    public final ii5 b(ax4 ax4, kl8 kl8, rfc rfc, hbc hbc, ColorSpace colorSpace) {
        Integer num = 85;
        if (rfc == null) {
            rfc = rfc.b;
        }
        int i = n1g.i(rfc, hbc, ax4, this.b);
        InputStream inputStream = null;
        try {
            int c2 = z47.c(rfc, hbc, ax4, this.a);
            int i2 = 1;
            int max = Math.max(1, 8 / i);
            if (this.c) {
                c2 = max;
            }
            inputStream = ax4.n();
            zy zyVar = z47.a;
            ax4.n0();
            if (zyVar.contains(Integer.valueOf(ax4.X))) {
                int a2 = z47.a(rfc, ax4);
                ez3.n(inputStream, "Cannot transcode from null input stream!");
                f(inputStream, kl8, a2, c2, num.intValue());
            } else {
                int b2 = z47.b(rfc, ax4);
                ez3.n(inputStream, "Cannot transcode from null input stream!");
                e(inputStream, kl8, b2, c2, num.intValue());
            }
            g13.b(inputStream);
            if (i != 1) {
                i2 = 0;
            }
            return new ii5(i2, 7);
        } catch (Throwable th) {
            g13.b(inputStream);
            throw th;
        }
    }

    public final boolean c(lq6 lq6) {
        return lq6 == o84.a;
    }

    public final boolean d(ax4 ax4, rfc rfc, hbc hbc) {
        if (rfc == null) {
            rfc = rfc.b;
        }
        return z47.c(rfc, hbc, ax4, this.a) < 8;
    }
}
