package defpackage;

import android.view.View;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.profile.ProfileScreen;

/* renamed from: neb  reason: default package */
public final /* synthetic */ class neb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ seb b;

    public /* synthetic */ neb(seb seb, int i) {
        this.a = i;
        this.b = seb;
    }

    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                fgb q0 = ((ProfileScreen) this.b.X).q0();
                xs7.E(q0.a, q0.u().a(), (ru3) null, new vfb(q0, (Continuation) null), 2);
                return;
            case 1:
                fgb q02 = ((ProfileScreen) this.b.X).q0();
                Long i = q02.T0.i();
                if (i != null) {
                    taf.o(q02.F0, new tdb(i.longValue()));
                    return;
                }
                return;
            case 2:
                fgb q03 = ((ProfileScreen) this.b.X).q0();
                Long i2 = q03.T0.i();
                if (i2 != null) {
                    taf.o(q03.F0, new pdb(i2.longValue(), ch2.ADMIN));
                    return;
                }
                return;
            case 3:
                fgb q04 = ((ProfileScreen) this.b.X).q0();
                qod E = xs7.E(q04.a, q04.u().b(), (ru3) null, new nfb(q04, (Continuation) null), 2);
                q04.H0.o1(q04, fgb.X0[1], E);
                return;
            case 4:
                fgb q05 = ((ProfileScreen) this.b.X).q0();
                taf.o(q05.E0, new afb((List) ((l6b) q05.K0.getValue()).l.getValue()));
                return;
            default:
                fgb q06 = ((ProfileScreen) this.b.X).q0();
                Long i3 = q06.T0.i();
                if (i3 != null) {
                    taf.o(q06.F0, new pdb(i3.longValue(), ch2.MEMBER));
                    return;
                }
                return;
        }
    }
}
