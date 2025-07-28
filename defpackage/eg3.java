package defpackage;

import java.util.List;
import one.me.profile.screens.avatars.ContactAvatarWidget;

/* renamed from: eg3  reason: default package */
public final class eg3 extends lx3 {
    public List A0;

    public final void E(sgc sgc, int i) {
        sgc.R(new vgc(new ContactAvatarWidget((bg3) this.A0.get(i)), (String) null, (wr3) null, (wr3) null, false, -1));
    }

    public final int j() {
        return this.A0.size();
    }

    public final long k(int i) {
        return ((bg3) this.A0.get(i)).a;
    }
}
