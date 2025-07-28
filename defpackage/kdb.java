package defpackage;

import android.app.Activity;
import android.os.Bundle;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: kdb  reason: default package */
public final class kdb extends u2 {
    public static final kdb c = new u2(8);

    public static a34 b2(long j, long j2) {
        return new a34(wn6.k(hr1.k(j, ":profile/edit/admin_permission?chat_id=", "&contact_id="), j2, "&permissions_type=change_admin"));
    }

    public final void Z1(long j) {
        d34 P1 = P1();
        P1.b(":profile/add-members?chat_id=" + j, (Bundle) null);
    }

    public final void a2(long j) {
        P1().b(us8.j(j, ":chats?id=", "&type=local"), (Bundle) null);
    }

    public final void c2(long j) {
        d34 P1 = P1();
        P1.b(":profile/invite?id=" + j, (Bundle) null);
    }

    public final void d2(long j, String str) {
        d34 P1 = P1();
        P1.b(":profile/members?id=" + j + "&type=" + str, (Bundle) null);
    }

    public final void e2(long j) {
        d34 P1 = P1();
        mn mnVar = new mn(12);
        mnVar.b = ":profile";
        mnVar.T(Long.valueOf(j), ApiProtocol.KEY_ID);
        mnVar.T("contact", "type");
        P1.c(mnVar.u(), (Bundle) null);
    }

    public final void f2() {
        Activity d;
        if (!P1().d() && (d = P1().a().f().C().d()) != null) {
            d.finish();
        }
    }
}
