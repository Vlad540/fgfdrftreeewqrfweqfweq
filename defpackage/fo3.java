package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: fo3  reason: default package */
public final /* synthetic */ class fo3 implements e8 {
    public final /* synthetic */ ho3 a;

    public /* synthetic */ fo3(ho3 ho3) {
        this.a = ho3;
    }

    public final void a(sgc sgc) {
        ho3 ho3 = this.a;
        try {
            Activity C = jjd.C(sgc);
            stf stf = new stf((Context) C);
            String string = ((xzc) ho3.b.getValue()).g.getString("invite-header", (String) null);
            if (string == null) {
                string = C.getString(whc.v);
            }
            stf.c = string;
            ((Intent) stf.b).setType("text/plain");
            vqc vqc = (xzc) ho3.b.getValue();
            String string2 = vqc.g.getString("invite-long", (String) null);
            if (string2 == null) {
                string2 = String.format(C.getString(whc.C), Arrays.copyOf(new Object[]{vqc.q(PmsKey.invite-link, "https://max.ru")}, 1));
            }
            stf.L(string2);
            stf.M();
        } catch (ActivityNotFoundException unused) {
            udd.s("ContactsDeepLinkFactory", "shareInvite: failed, no activity found", (Throwable) null);
        }
    }
}
