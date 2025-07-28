package defpackage;

import android.util.Range;

/* renamed from: pye  reason: default package */
public interface pye extends gde, qq6 {
    public static final z80 k0 = new z80(c2d.class, (Object) null, "camerax.core.useCase.defaultSessionConfig");
    public static final z80 l0 = new z80(pw1.class, (Object) null, "camerax.core.useCase.defaultCaptureConfig");
    public static final z80 m0 = new z80(ks1.class, (Object) null, "camerax.core.useCase.sessionConfigUnpacker");
    public static final z80 n0 = new z80(rr1.class, (Object) null, "camerax.core.useCase.captureConfigUnpacker");
    public static final z80 o0;
    public static final z80 p0 = new z80(Range.class, (Object) null, "camerax.core.useCase.targetFrameRate");
    public static final z80 q0;
    public static final z80 r0;
    public static final z80 s0 = new z80(rye.class, (Object) null, "camerax.core.useCase.captureType");
    public static final z80 t0;
    public static final z80 u0;

    static {
        Class cls = Integer.TYPE;
        o0 = new z80(cls, (Object) null, "camerax.core.useCase.surfaceOccupancyPriority");
        Class cls2 = Boolean.TYPE;
        q0 = new z80(cls2, (Object) null, "camerax.core.useCase.zslDisabled");
        r0 = new z80(cls2, (Object) null, "camerax.core.useCase.highResolutionDisabled");
        t0 = new z80(cls, (Object) null, "camerax.core.useCase.previewStabilizationMode");
        u0 = new z80(cls, (Object) null, "camerax.core.useCase.videoStabilizationMode");
    }

    rye t() {
        return (rye) h(s0);
    }

    int u() {
        return ((Integer) d(u0, 0)).intValue();
    }

    int y() {
        return ((Integer) d(t0, 0)).intValue();
    }
}
