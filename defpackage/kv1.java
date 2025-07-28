package defpackage;

/* renamed from: kv1  reason: default package */
public final /* synthetic */ class kv1 implements cw9, u26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u16 b;

    public /* synthetic */ kv1(int i, u16 u16) {
        this.a = i;
        this.b = u16;
    }

    public final /* synthetic */ void a(Object obj) {
        switch (this.a) {
            case 0:
                this.b.invoke(obj);
                return;
            default:
                this.b.invoke(obj);
                return;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof cw9) || !(obj instanceof u26)) {
                    return false;
                }
                return hhd.f(getFunctionDelegate(), ((u26) obj).getFunctionDelegate());
            default:
                if (!(obj instanceof cw9) || !(obj instanceof u26)) {
                    return false;
                }
                return hhd.f(getFunctionDelegate(), ((u26) obj).getFunctionDelegate());
        }
    }

    public final n26 getFunctionDelegate() {
        switch (this.a) {
            case 0:
                return this.b;
            default:
                return this.b;
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                return getFunctionDelegate().hashCode();
            default:
                return getFunctionDelegate().hashCode();
        }
    }
}
