package defpackage;

import android.view.View;
import one.me.profile.ProfileScreen;

/* renamed from: peb  reason: default package */
public final /* synthetic */ class peb implements View.OnLongClickListener {
    public final /* synthetic */ seb a;
    public final /* synthetic */ ncb b;
    public final /* synthetic */ int c;

    public /* synthetic */ peb(seb seb, ncb ncb, int i) {
        this.a = seb;
        this.b = ncb;
        this.c = i;
    }

    public final boolean onLongClick(View view) {
        long j = ((fcb) this.b).a.a;
        fgb q0 = ((ProfileScreen) this.a.X).q0();
        cfb z = q0.T0.z(this.c, j);
        if (z == null) {
            return true;
        }
        taf.o(q0.E0, z);
        return true;
    }
}
