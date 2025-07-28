package defpackage;

/* renamed from: np6  reason: default package */
public final class np6 implements pye, br6, yhe {
    public static final z80 X = new z80(jp6.class, (Object) null, "camerax.core.imageAnalysis.outputImageFormat");
    public static final z80 Y;
    public static final z80 Z;
    public static final z80 b = new z80(gp6.class, (Object) null, "camerax.core.imageAnalysis.backpressureStrategy");
    public static final z80 c = new z80(Integer.TYPE, (Object) null, "camerax.core.imageAnalysis.imageQueueDepth");
    public static final z80 o = new z80(or6.class, (Object) null, "camerax.core.imageAnalysis.imageReaderProxyProvider");
    public final hga a;

    static {
        Class<Boolean> cls = Boolean.class;
        Y = new z80(cls, (Object) null, "camerax.core.imageAnalysis.onePixelShiftEnabled");
        Z = new z80(cls, (Object) null, "camerax.core.imageAnalysis.outputImageRotationEnabled");
    }

    public np6(hga hga) {
        this.a = hga;
    }

    public final ia3 getConfig() {
        return this.a;
    }

    public final int getInputFormat() {
        return 35;
    }
}
