package defpackage;

/* renamed from: xre  reason: default package */
public final class xre extends zre {
    public boolean b;
    public final /* synthetic */ lf5 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xre(lf5 lf5, Object obj) {
        super(obj);
        this.c = lf5;
        dyc dyc = lf5.X;
    }

    public final Object a() {
        boolean z = this.b;
        lf5 lf5 = this.c;
        Object obj = this.a;
        if (z) {
            u16 u16 = lf5.X.e;
            if (u16 == null) {
                return null;
            }
            u16.invoke(obj);
            return null;
        }
        this.b = true;
        u16 u162 = lf5.X.d;
        if (u162 != null) {
            Boolean bool = (Boolean) u162.invoke(obj);
        }
        return obj;
    }
}
