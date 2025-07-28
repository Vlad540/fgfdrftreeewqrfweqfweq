package defpackage;

/* renamed from: ozc  reason: default package */
public final /* synthetic */ class ozc implements u26 {
    public final /* synthetic */ kk6 a;

    public ozc(kk6 kk6) {
        this.a = kk6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ozc) || !(obj instanceof u26)) {
            return false;
        }
        return hhd.f(getFunctionDelegate(), ((u26) obj).getFunctionDelegate());
    }

    public final n26 getFunctionDelegate() {
        return new z8(1, 8, kk6.class, this.a, "onNewHost", "onNewHost(Ljava/lang/String;)Lkotlinx/coroutines/Job;");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
