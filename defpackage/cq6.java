package defpackage;

/* renamed from: cq6  reason: default package */
public final class cq6 implements pye, br6, z17 {
    public static final z80 A0 = new z80(Boolean.class, (Object) null, "camerax.core.useCase.isPostviewEnabled");
    public static final z80 X;
    public static final z80 Y;
    public static final z80 Z = new z80(or6.class, (Object) null, "camerax.core.imageCapture.imageReaderProxyProvider");
    public static final z80 b;
    public static final z80 c;
    public static final z80 o = new z80(nw1.class, (Object) null, "camerax.core.imageCapture.captureBundle");
    public static final z80 w0 = new z80(Boolean.TYPE, (Object) null, "camerax.core.imageCapture.useSoftwareJpegEncoder");
    public static final z80 x0;
    public static final z80 y0;
    public static final z80 z0 = new z80(aq6.class, (Object) null, "camerax.core.imageCapture.screenFlash");
    public final hga a;

    static {
        Class cls = Integer.TYPE;
        b = new z80(cls, (Object) null, "camerax.core.imageCapture.captureMode");
        c = new z80(cls, (Object) null, "camerax.core.imageCapture.flashMode");
        Class<Integer> cls2 = Integer.class;
        X = new z80(cls2, (Object) null, "camerax.core.imageCapture.bufferFormat");
        Y = new z80(cls2, (Object) null, "camerax.core.imageCapture.outputFormat");
        x0 = new z80(cls, (Object) null, "camerax.core.imageCapture.flashType");
        y0 = new z80(cls, (Object) null, "camerax.core.imageCapture.jpegCompressionQuality");
    }

    public cq6(hga hga) {
        this.a = hga;
    }

    public final ia3 getConfig() {
        return this.a;
    }

    public final int getInputFormat() {
        return ((Integer) h(qq6.z)).intValue();
    }
}
