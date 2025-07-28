package defpackage;

import android.content.Context;
import java.util.Arrays;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ak3  reason: default package */
public final class ak3 {
    public final t97 a;

    public ak3(t97 t97) {
        this.a = t97;
    }

    public final void a(Context context) {
        String str = oyb.g;
        vqc vqc = (xzc) this.a.getValue();
        String string = vqc.g.getString("invite-long", (String) null);
        if (string == null) {
            string = String.format(context.getString(whc.C), Arrays.copyOf(new Object[]{vqc.q(PmsKey.invite-link, "https://max.ru")}, 1));
        }
        oyb.R(context, string);
    }
}
