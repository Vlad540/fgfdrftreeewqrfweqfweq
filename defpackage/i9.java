package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.members.list.MembersListWidget;
import one.me.profile.screens.addadmins.fromcontacts.AdminsFromContactsScreen;

/* renamed from: i9  reason: default package */
public final class i9 extends lx3 {
    public final long A0;
    public final String B0;
    public final List C0;

    public i9(long j, String str, List list, rr3 rr3) {
        super(rr3, 1);
        this.A0 = j;
        this.B0 = str;
        this.C0 = list;
    }

    public final void E(sgc sgc, int i) {
        rr3 membersListWidget;
        if (!sgc.n()) {
            int t = hr1.t(((k9) this.C0.get(i)).c);
            String str = this.B0;
            if (t == 0) {
                membersListWidget = new MembersListWidget(str, new aj8(this.A0, ch2.MEMBER, (Integer) null, 12), (x54) null);
            } else if (t == 1) {
                membersListWidget = new AdminsFromContactsScreen(str, this.A0, (x54) null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            rr3 rr3 = membersListWidget;
            rr3.setRetainViewMode(qr3.b);
            sgc.R(new vgc(rr3, (String) null, (wr3) null, (wr3) null, false, -1));
        }
    }

    public final int j() {
        return this.C0.size();
    }
}
