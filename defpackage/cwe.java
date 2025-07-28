package defpackage;

import android.view.Surface;
import java.util.Objects;
import java.util.concurrent.Executor;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipants;

/* renamed from: cwe  reason: default package */
public final /* synthetic */ class cwe implements bid, fx4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ cwe(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = obj3;
    }

    public void a(Surface surface) {
        Executor executor;
        vj4 vj4 = (vj4) this.c;
        int t = hr1.t(vj4.b);
        sn1 sn1 = (sn1) this.o;
        if (t != 0) {
            if (t == 1) {
                y4e y4e = (y4e) this.b;
                if (y4e.a()) {
                    Objects.toString(y4e, "EMPTY");
                    sn1.b((Object) null);
                    vj4.e();
                    return;
                }
                vj4.g = surface;
                Objects.toString(surface);
                y4e.b(surface, (Executor) vj4.d, new jv1(10, vj4));
                vj4.b = 4;
                sn1.b((xx4) vj4.f);
                return;
            } else if (t != 2) {
                if (t == 3) {
                    if (!(((fx4) vj4.j) == null || (executor = (Executor) vj4.i) == null)) {
                        executor.execute(new zbe(vj4, 8, surface));
                    }
                    Objects.toString(surface);
                    return;
                } else if (t != 4) {
                    throw new IllegalStateException("State " + sxe.u(vj4.b) + " is not handled");
                }
            }
        }
        sn1.b((Object) null);
    }

    public void j(ihd ihd) {
        Object obj = this.o;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (this.a) {
            case 0:
                ewe ewe = (ewe) obj2;
                ewe.getClass();
                wve wve = (wve) obj;
                udd.p("ewe", "copyFromUri: started for uri=%s", new Object[]{wve.a.a});
                fwe fwe = wve.a;
                eq3 eq3 = (eq3) obj3;
                String a2 = ((xh0) ((u98) ewe.g.g.getValue())).a(fwe.a, eq3.c);
                if (zl3.f(a2)) {
                    udd.p("ewe", "copyFromUri: finished for uri=%s", new Object[]{fwe.a});
                    if (!ihd.h()) {
                        vve b2 = wve.b();
                        b2.b = a2;
                        b2.c = eq3.c;
                        b2.f = eq3.b;
                        ihd.a(new wve(b2));
                        return;
                    }
                    return;
                } else if (!ihd.h()) {
                    ihd.onError(new RuntimeException("failed to copy file"));
                    return;
                } else {
                    return;
                }
            case 1:
                j3f j3f = (j3f) obj2;
                j3f.getClass();
                z2f z2f = (z2f) obj;
                udd.p("j3f", "copyFromUri: started for uri = %s", new Object[]{z2f.a.a});
                a3f a3f = z2f.a;
                String a3 = ((xh0) j3f.a).a(a3f.a, ((eq3) obj3).c);
                if (zl3.f(a3)) {
                    udd.p("j3f", "copyFromUri: finished for uri = %s", new Object[]{a3f.a});
                    if (!ihd.h()) {
                        e06 a4 = z2f.a();
                        a4.c = a3;
                        ihd.a(new z2f(a4));
                        return;
                    }
                    return;
                } else if (!ihd.h()) {
                    ihd.onError(new RuntimeException("failed to copy file"));
                    return;
                } else {
                    return;
                }
            default:
                WaitingRoomParticipants.loadWaitingParticipantIdsPageSingle$lambda$6((gx0) obj2, (dn1) obj, (WaitingRoomParticipants) obj3, ihd);
                return;
        }
    }
}
