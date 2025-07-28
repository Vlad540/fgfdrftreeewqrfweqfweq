package defpackage;

/* renamed from: k94  reason: default package */
public final /* synthetic */ class k94 implements p3e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k94(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                try {
                    return (qe8) ((Class) this.b).getConstructor((Class[]) null).newInstance((Object[]) null);
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            case 1:
                return (c94) this.b;
            case 2:
                return (qe8) this.b;
            case 3:
                return (eu7) this.b;
            case 4:
                return (du7) this.b;
            case 5:
                return (hbe) this.b;
            case 6:
                return (k9c) this.b;
            case 7:
                return (pi7) this.b;
            default:
                return Boolean.valueOf(((z45) this.b).P0);
        }
    }
}
