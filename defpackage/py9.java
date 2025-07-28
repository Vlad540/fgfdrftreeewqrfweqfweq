package defpackage;

/* renamed from: py9  reason: default package */
public final /* synthetic */ class py9 extends jhb {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ py9(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.a = i2;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return ((ry9) this.receiver).a;
            default:
                return Boolean.valueOf(((rzb) this.receiver).c.j() > 8);
        }
    }
}
