package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.camera.core.impl.CameraValidator$CameraIdListIncorrectException;
import java.util.LinkedHashSet;

/* renamed from: fv1  reason: default package */
public abstract class fv1 {
    public static final wu1 a;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new db7(2));
        a = new wu1(linkedHashSet);
    }

    public static void a(Context context, otf otf, wu1 wu1) {
        Integer num;
        int i = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT < 34 || km0.b(context) == 0) {
            if (wu1 != null) {
                try {
                    num = wu1.b();
                    if (num == null) {
                        return;
                    }
                } catch (IllegalStateException unused) {
                    return;
                }
            } else {
                num = null;
            }
            String str = Build.DEVICE;
            PackageManager packageManager = context.getPackageManager();
            try {
                if (packageManager.hasSystemFeature("android.hardware.camera")) {
                    if (wu1 != null) {
                        if (num.intValue() == 1) {
                        }
                    }
                    wu1.c.c(otf.G());
                    i = 1;
                }
            } catch (IllegalArgumentException e) {
                illegalArgumentException = e;
            }
            try {
                if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                    if (wu1 != null) {
                        if (num.intValue() == 0) {
                        }
                    }
                    wu1.b.c(otf.G());
                    i++;
                }
            } catch (IllegalArgumentException e2) {
                illegalArgumentException = e2;
            }
            try {
                a.c(otf.G());
                i++;
            } catch (IllegalArgumentException unused2) {
            }
            if (illegalArgumentException != null) {
                otf.G().toString();
                throw new CameraValidator$CameraIdListIncorrectException("Expected camera missing from device.", i, illegalArgumentException);
            }
            return;
        }
        LinkedHashSet G = otf.G();
        if (!G.isEmpty()) {
            km0.b(context);
            G.size();
            return;
        }
        throw new CameraValidator$CameraIdListIncorrectException("No cameras available", 0, (IllegalArgumentException) null);
    }
}
