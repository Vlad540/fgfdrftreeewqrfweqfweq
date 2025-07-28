package defpackage;

/* renamed from: bj9  reason: default package */
public final /* synthetic */ class bj9 implements u26 {
    public final /* synthetic */ rj9 a;

    public bj9(rj9 rj9) {
        this.a = rj9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bj9) || !(obj instanceof u26)) {
            return false;
        }
        return hhd.f(getFunctionDelegate(), ((u26) obj).getFunctionDelegate());
    }

    public final n26 getFunctionDelegate() {
        return new w26(1, 0, rj9.class, this.a, "selectAvatar", "selectAvatar(Lone/me/login/common/avatars/NeuroAvatarModel;)V");
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
