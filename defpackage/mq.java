package defpackage;

/* renamed from: mq  reason: default package */
public final /* synthetic */ class mq implements u26 {
    public final /* synthetic */ dr a;

    public mq(dr drVar) {
        this.a = drVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mq) || !(obj instanceof u26)) {
            return false;
        }
        return hhd.f(getFunctionDelegate(), ((u26) obj).getFunctionDelegate());
    }

    public final n26 getFunctionDelegate() {
        return new w26(1, 0, dr.class, this.a, "modeSelected", "modeSelected(Lone/me/appearancesettings/model/AppearanceMode;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
