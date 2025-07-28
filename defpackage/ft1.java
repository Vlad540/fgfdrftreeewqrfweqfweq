package defpackage;

/* renamed from: ft1  reason: default package */
public interface ft1 extends q0c {
    public static final z80 g = new z80(sye.class, (Object) null, "camerax.core.camera.useCaseConfigFactory");
    public static final z80 h = new z80(Integer.class, (Object) null, "camerax.core.camera.useCaseCombinationRequiredRule");
    public static final z80 i = new z80(o2d.class, (Object) null, "camerax.core.camera.SessionProcessor");
    public static final z80 j;
    public static final z80 k;

    static {
        Class<Boolean> cls = Boolean.class;
        j = new z80(cls, (Object) null, "camerax.core.camera.isPostviewSupported");
        k = new z80(cls, (Object) null, "camerax.core.camera.isCaptureProcessProgressSupported");
    }

    void v() {
        hr1.r(d(i, (Object) null));
    }
}
