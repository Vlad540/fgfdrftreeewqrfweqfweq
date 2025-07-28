package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.coroutines.Continuation;
import one.me.android.MainActivity;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: pr7  reason: default package */
public final class pr7 extends l5e implements i26 {
    public final /* synthetic */ MainActivity X;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public pr7(MainActivity mainActivity, Continuation continuation) {
        super(2, continuation);
        this.X = mainActivity;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((pr7) n((to7) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new pr7(this.X, continuation);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [one.me.android.MainActivity, e83] */
    public final Object o(Object obj) {
        tt6 i;
        wx3.H(obj);
        yt6 yt6 = (yt6) o2a.a.getAccessor().c(yt6.class);
        yt6.getClass();
        pt6 pt6 = pt6.a;
        Class<zy9> cls = zy9.class;
        boolean d = ((zy9) pt6.getAccessor().c(cls)).d();
        Class<xt6> cls2 = xt6.class;
        String str = yt6.b;
        if (!d) {
            udd.p(str, "InAppReviewManagersInitializer init() InAppReviewComponent.authStorage.isAuthorized:" + ((zy9) pt6.getAccessor().c(cls)).d(), new Object[0]);
        } else {
            fb6 fb6 = (ezd) pt6.getAccessor().c(ezd.class);
            vqc vqc = (xzc) pt6.getAccessor().c(xzc.class);
            vqc.getClass();
            boolean m = vqc.m(PmsKey.fake-in-app-review, false);
            boolean z = ((f03) pt6.getAccessor().c(f03.class)).g.getBoolean("app.enable_in_app_review_not_from_market_build", false);
            ((q0a) pt6.getAccessor().c(q0a.class)).getClass();
            if (!m) {
                fb6 fb62 = fb6;
                if (!fb62.a()) {
                    udd.p(str, "InAppReviewManagersInitializer init() builds.isMarketBuild:true, isInAppReviewEnabledNotFromMarketBuild:" + z + ", isFakeInAppReviewEnabled:" + m + ", storeServicesInfo.areServicesAvailable:" + fb62.a(), new Object[0]);
                }
            }
            long o = vqc.o(PmsKey.in-app-review-triggers, 0);
            tt6 tt6 = new tt6(m, yt6.a.getSharedPreferences("app_crash_prefs", 0).getLong("pref_last_crash_time", 0));
            lg7 c = hwf.c();
            Iterator it = qt6.z0.iterator();
            int i2 = 0;
            while (true) {
                u1 u1Var = (u1) it;
                if (u1Var.hasNext()) {
                    Object next = u1Var.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        qt6 qt6 = (qt6) next;
                        if (((o & 1) << i2) != 0) {
                            c.add(qt6);
                        }
                        i2 = i3;
                    } else {
                        p23.G();
                        throw null;
                    }
                } else {
                    lg7 a = hwf.a(c);
                    if (a.isEmpty()) {
                        udd.p(str, "InAppReviewManagersInitializer init() conditions.isEmpty", new Object[0]);
                    } else {
                        ListIterator listIterator = a.listIterator(0);
                        while (true) {
                            jg7 jg7 = (jg7) listIterator;
                            if (!jg7.hasNext()) {
                                break;
                            }
                            tt6.h.put((qt6) jg7.next(), new Object());
                        }
                        if (!fb6.a()) {
                            udd.p(str, "InAppReviewManagersInitializer init() storeServicesInfo.areServicesAvailable:" + ((zy9) pt6.a.getAccessor().c(cls)).d(), new Object[0]);
                        } else {
                            pt6 pt62 = pt6.a;
                            ((xt6) pt62.getAccessor().c(cls2)).getClass();
                            xt6.b = (wt6) pt62.getAccessor().c(wt6.class);
                        }
                    }
                    yt6.c = tt6;
                }
            }
        }
        ? r0 = this.X;
        int ordinal = r0.a.d.ordinal();
        if (ordinal == 3) {
            int i4 = MainActivity.e1;
            r0.i0();
        } else if (ordinal == 4) {
            int i5 = MainActivity.e1;
            r0.i0();
            o2a o2a = o2a.a;
            ((xt6) o2a.getAccessor().c(cls2)).getClass();
            wt6 wt6 = xt6.b;
            if (!(wt6 == null || (i = o2a.i()) == null)) {
                i.k = wt6.e;
            }
        }
        tt6 i6 = o2a.a.i();
        if (i6 != null) {
            List list = tt6.p;
            i6.e((Integer) null);
        }
        return jue.a;
    }
}
