package defpackage;

/* renamed from: qq  reason: default package */
public final /* synthetic */ class qq implements b32, u26 {
    public final /* synthetic */ dr a;

    public qq(dr drVar) {
        this.a = drVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b32) || !(obj instanceof u26)) {
            return false;
        }
        return hhd.f(getFunctionDelegate(), ((u26) obj).getFunctionDelegate());
    }

    public final n26 getFunctionDelegate() {
        return new w26(1, 0, dr.class, this.a, "backgroundSelected", "backgroundSelected(Lone/me/appearancesettings/model/ChatBackground;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
