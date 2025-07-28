package defpackage;

import android.content.Context;
import android.text.SpannableString;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: q2b  reason: default package */
public final class q2b implements e3d {
    public static final /* synthetic */ k77[] A0;
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final tt0 a;
    public final t97 b;
    public final t97 c;
    public final t97 o;
    public final ContextScope w0;
    public final hcd x0 = icd.b(0, 0, 0, 7);
    public final e3 y0 = hwf.t();
    public final AtomicBoolean z0 = new AtomicBoolean(false);

    static {
        k77 hc9 = new hc9(q2b.class, "presencesJob", "getPresencesJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        A0 = new k77[]{hc9};
    }

    public q2b(t97 t97, t97 t972, t97 t973, tt0 tt0, t97 t974, t97 t975, pae pae, r7e r7e) {
        this.a = tt0;
        this.b = t97;
        this.c = t972;
        this.o = t973;
        this.X = r7e;
        this.Y = t974;
        this.Z = t975;
        this.w0 = n1g.a(((n3a) pae).a());
    }

    public final CharSequence a(long j, boolean z, l2b l2b) {
        t97 t97 = this.c;
        if (!z) {
            return ((w6a) t97.getValue()).a.getString(whc.m);
        }
        if (d().e(j)) {
            int i = avb.tt_contact_status_online;
            Context context = ((w6a) t97.getValue()).a;
            String string = context.getString(i);
            SpannableString spannableString = new SpannableString(string);
            spannableString.setSpan(new whe(km4.y0.n(context).g(), new qq9(10)), 0, string.length(), 33);
            return spannableString;
        }
        if (l2b == null) {
            l2b = d().b(j);
        }
        w6a w6a = (w6a) t97.getValue();
        i03 i03 = w6a.c;
        sz0 v = xs7.v(((long) l2b.b) * 1000, i03.m());
        Locale u = i03.u();
        String[] strArr = dhe.b;
        int i2 = v.b;
        int t = hr1.t(i2);
        Context context2 = w6a.a;
        long j2 = v.c;
        switch (t) {
            case 0:
                return context2.getString(avb.tt_dates_right_now);
            case 1:
                return context2.getString(avb.tt_dates_minutes_last_seen, new Object[]{Integer.valueOf((int) j2)});
            case 2:
                return context2.getString(avb.tt_dates_hours_last_seen, new Object[]{Integer.valueOf((int) j2)});
            case 3:
                return j2 == 0 ? context2.getString(avb.tt_dates_yesterday_at_last_seen_no_time) : String.format(context2.getString(avb.tt_dates_yesterday_at), new Object[]{xs7.p(context2, j2, u)});
            case 4:
                return context2.getString(avb.tt_dates_days_last_seen, new Object[]{Integer.valueOf((int) j2)});
            case 5:
                return context2.getString(avb.tt_dates_weeks_last_seen, new Object[]{Integer.valueOf((int) j2)});
            case 6:
                return context2.getString(avb.tt_dates_months_last_seen, new Object[]{Integer.valueOf((int) j2)});
            case 7:
            case 8:
                return context2.getString(avb.tt_dates_full_last_seen_u, new Object[]{xs7.x(u, j2, hr1.c(i2, 8))});
            case 9:
                return context2.getString(avb.presence_unknown_date);
            default:
                return "";
        }
    }

    public final CharSequence b(tf3 tf3) {
        return a(tf3.n(), tf3.c(), (l2b) null);
    }

    public final void c(int i) {
        AtomicBoolean atomicBoolean = this.z0;
        if (i != 1) {
            atomicBoolean.set(true);
        } else if (atomicBoolean.get()) {
            g();
            atomicBoolean.set(false);
        }
    }

    public final o2b d() {
        return (o2b) this.b.getValue();
    }

    public final f03 e() {
        return (f03) this.o.getValue();
    }

    public final g37 f() {
        return (g37) this.y0.T0(this, A0[0]);
    }

    public final void g() {
        udd.q("PresenceController", "moveOnlineToLastSeen");
        kgd kgd = new kgd(0);
        int m = (int) (((lqc) e()).m() / 1000);
        Iterator it = d().d().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            long longValue = ((Number) entry.getKey()).longValue();
            if (((l2b) entry.getValue()).a != 0) {
                kgd.put(Long.valueOf(longValue), new l2b(0, m));
            }
        }
        h(0, kgd);
    }

    public final void h(long j, Map map) {
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, "PresenceController", wn6.h(map.size(), "onContactPresence, presence.count() = "), (Throwable) null);
        }
        if (!map.isEmpty()) {
            k(map);
            if (j > 0) {
                lqc lqc = (lqc) e();
                if (j > lqc.e("user.presenceLastSync", 0)) {
                    lqc.k("user.presenceLastSync", Long.valueOf(j));
                }
            }
        }
    }

    public final void i(HashMap hashMap, long j) {
        if (!hashMap.containsKey(Long.valueOf(((lqc) e()).s()))) {
            hashMap.put(Long.valueOf(((lqc) e()).s()), l2b.d);
        }
        h(j, hashMap);
    }

    public final void j(sm9 sm9) {
        int i;
        g37 f;
        g37 f2;
        ConcurrentHashMap concurrentHashMap = d().o;
        if (concurrentHashMap.isEmpty()) {
            i = 0;
        } else {
            i = 0;
            for (Map.Entry value : concurrentHashMap.entrySet()) {
                if (((mc9) value.getValue()).getValue() != null) {
                    i++;
                }
            }
        }
        long j = i < 500 ? 0 : i < 1000 ? MultiFileUploader.UPLOAD_NEXT_INTERVAL : 10000;
        if (j > 0 && (f() == null || ((f2 = f()) != null && !f2.isActive()))) {
            this.y0.o1(this, A0[0], xs7.E(this.w0, (hu3) null, ru3.b, new p2b(this, j, (Continuation) null), 1));
        }
        if (f() == null || (f = f()) == null || !f.isActive()) {
            List<sm9> singletonList = Collections.singletonList(sm9);
            if (!singletonList.isEmpty()) {
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    fn6.d(tn7.X, "PresenceController", "onNotifPresence: " + singletonList + ".size", (Throwable) null);
                }
                kgd kgd = new kgd(singletonList.size());
                long j2 = 0;
                for (sm9 sm92 : singletonList) {
                    kgd.put(Long.valueOf(sm92.c), fu7.l(sm92.o));
                    long j3 = sm92.X;
                    if (j3 > j2) {
                        j2 = j3;
                    }
                }
                lqc lqc = (lqc) e();
                if (j2 > lqc.e("user.presenceLastSync", 0)) {
                    lqc.k("user.presenceLastSync", Long.valueOf(j2));
                }
                k(kgd);
                return;
            }
            return;
        }
        udd.q("PresenceController", "onNotifPresence: post to subject");
        this.x0.g(sm9);
    }

    public final void k(Map map) {
        if (!this.z0.get()) {
            Map kgd = new kgd(map.size());
            for (Map.Entry entry : map.entrySet()) {
                kgd.put(Long.valueOf(((Number) entry.getKey()).longValue()), new l2b(0, ((l2b) entry.getValue()).b));
            }
            map = kgd;
        }
        o2b d = d();
        d.getClass();
        zb9 zb9 = new zb9(map.size());
        for (Map.Entry entry2 : map.entrySet()) {
            long longValue = ((Number) entry2.getKey()).longValue();
            zb9.a(longValue);
            d.f(longValue, (l2b) entry2.getValue());
        }
        ((Executor) d.c.getValue()).execute(new hg9(d, 14, zb9));
        this.a.c(new lp3((Collection) map.keySet()));
    }
}
