package defpackage;

/* renamed from: ci0  reason: default package */
public final /* synthetic */ class ci0 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ af9 b;

    public /* synthetic */ ci0(af9 af9, int i) {
        this.a = i;
        this.b = af9;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                af9 af9 = this.b;
                af9.w0.f("LOCATION_MAP_TYPE_NORMAL");
                af9.o(new ai0(10));
                return jue.a;
            case 1:
                af9 af92 = this.b;
                af92.w0.f("LOCATION_MAP_TYPE_SATELLITE");
                af92.o(new ai0(9));
                return jue.a;
            default:
                af9 af93 = this.b;
                af93.w0.f("LOCATION_MAP_TYPE_HYBRID");
                af93.o(new ai0(1));
                return jue.a;
        }
    }
}
