package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.ImageCapturePixelHDRPlusQuirk;

/* renamed from: dq6  reason: default package */
public final class dq6 extends rr1 {
    public static final dq6 c = new dq6(new Object());
    public final j06 b;

    public dq6(j06 j06) {
        this.b = j06;
    }

    public final void a(pye pye, w30 w30) {
        super.a(pye, w30);
        if (pye instanceof cq6) {
            cq6 cq6 = (cq6) pye;
            fc9 c2 = fc9.c();
            z80 z80 = cq6.b;
            if (cq6.l(z80)) {
                j06 j06 = this.b;
                int intValue = ((Integer) cq6.h(z80)).intValue();
                j06.getClass();
                if (((ImageCapturePixelHDRPlusQuirk) zf4.a.j(ImageCapturePixelHDRPlusQuirk.class)) != null) {
                    if (intValue == 0) {
                        CaptureRequest.Key key = CaptureRequest.CONTROL_ENABLE_ZSL;
                        c2.j(js1.Q(key), Boolean.TRUE);
                    } else if (intValue == 1) {
                        CaptureRequest.Key key2 = CaptureRequest.CONTROL_ENABLE_ZSL;
                        c2.j(js1.Q(key2), Boolean.FALSE);
                    }
                }
            }
            w30.c(new mv4(7, hga.a(c2)));
            return;
        }
        throw new IllegalArgumentException("config is not ImageCaptureConfig");
    }
}
