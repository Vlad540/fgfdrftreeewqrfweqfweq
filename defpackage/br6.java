package defpackage;

import android.util.Size;
import java.util.List;

/* renamed from: br6  reason: default package */
public interface br6 extends q0c {
    public static final z80 B = new z80(js.class, (Object) null, "camerax.core.imageOutput.targetAspectRatio");
    public static final z80 C;
    public static final z80 D;
    public static final z80 E;
    public static final z80 F;
    public static final z80 G;
    public static final z80 H;
    public static final z80 I;
    public static final z80 J = new z80(ibc.class, (Object) null, "camerax.core.imageOutput.resolutionSelector");
    public static final z80 K;

    static {
        Class cls = Integer.TYPE;
        C = new z80(cls, (Object) null, "camerax.core.imageOutput.targetRotation");
        D = new z80(cls, (Object) null, "camerax.core.imageOutput.appTargetRotation");
        E = new z80(cls, (Object) null, "camerax.core.imageOutput.mirrorMode");
        Class<Size> cls2 = Size.class;
        F = new z80(cls2, (Object) null, "camerax.core.imageOutput.targetResolution");
        G = new z80(cls2, (Object) null, "camerax.core.imageOutput.defaultResolution");
        H = new z80(cls2, (Object) null, "camerax.core.imageOutput.maxResolution");
        Class<List> cls3 = List.class;
        I = new z80(cls3, (Object) null, "camerax.core.imageOutput.supportedResolutions");
        K = new z80(cls3, (Object) null, "camerax.core.imageOutput.customOrderedResolutions");
    }

    static void A(br6 br6) {
        boolean l = br6.l(B);
        boolean z = ((Size) br6.d(F, (Object) null)) != null;
        if (l && z) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (((ibc) br6.d(J, (Object) null)) == null) {
        } else {
            if (l || z) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    int B(int i) {
        return ((Integer) d(C, Integer.valueOf(i))).intValue();
    }
}
