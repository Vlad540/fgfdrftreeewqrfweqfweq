package defpackage;

/* renamed from: qf7  reason: default package */
public final /* synthetic */ class qf7 implements u26 {
    public final /* synthetic */ rf7 a;

    public qf7(rf7 rf7) {
        this.a = rf7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qf7) || !(obj instanceof u26)) {
            return false;
        }
        return hhd.f(getFunctionDelegate(), ((u26) obj).getFunctionDelegate());
    }

    public final n26 getFunctionDelegate() {
        return new w26(2, 0, rf7.class, this.a, "onMessageElementClick", "onMessageElementClick(Landroid/view/View;Lru/ok/tamtam/models/MessageElementData;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
