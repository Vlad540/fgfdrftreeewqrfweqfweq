package defpackage;

import com.my.tracker.obfuscated.t;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.tamtam.android.services.NotificationTamService;

/* renamed from: v82  reason: default package */
public final /* synthetic */ class v82 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ v82(Object obj, long j, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
        this.o = obj2;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((b92) this.c).k(this.b, (i22) this.o);
                return;
            case 1:
                ((l92) this.c).b.c(this.b, (Collection) this.o);
                return;
            case 2:
                qm6 qm6 = (qm6) this.c;
                if (!qm6.w0.get()) {
                    long j = this.b;
                    Long valueOf = Long.valueOf(j);
                    String str = (String) this.o;
                    udd.p("rm6", "onFileUploadCompleted: completed upload. response =%s, totalBytes=%d", new Object[]{str, valueOf});
                    pm6 pm6 = new pm6(true, str, 100.0f, j);
                    bw9 bw9 = qm6.Z;
                    bw9.c(pm6);
                    bw9.b();
                    qm6.a(false);
                    return;
                }
                return;
            case 3:
                NotificationTamService notificationTamService = (NotificationTamService) this.c;
                yp2 c2 = ((xdc) notificationTamService.Y.getValue()).c();
                long j2 = this.b;
                NotificationTamService.a(j2, (CharSequence) this.o, notificationTamService, c2.e(j2));
                return;
            case 4:
                stf stf = (stf) this.c;
                List<f31> list = (List) this.o;
                long j3 = this.b;
                synchronized (stf) {
                    for (f31 f31 : list) {
                        xm1 xm1 = f31.a;
                        boolean z = xm1.a == w8f.b;
                        LinkedHashMap linkedHashMap = (LinkedHashMap) stf.c;
                        ge1 ge1 = xm1.b;
                        boolean containsKey = true ^ linkedHashMap.containsKey(ge1);
                        if (z && containsKey) {
                            linkedHashMap.put(ge1, Long.valueOf(j3));
                        }
                    }
                    stf.a(list);
                }
                return;
            case 5:
                ((x41) ((w41) ((stf) this.c).a)).c("screen_share_first_frame", EventItemValueKt.toEventItemValue(this.b), new EventItemsMap((Map) this.o));
                return;
            case 6:
                e3 e3Var = ((ocd) this.c).f;
                if (e3Var != null) {
                    ((CopyOnWriteArraySet) e3Var.a).add(new mwf(this.b, (u39) this.o));
                    return;
                }
                return;
            case 7:
                d4b d4b = (d4b) this.c;
                d4b.getClass();
                int i = mze.a;
                m45 m45 = ((g45) d4b.c).a;
                f44 f44 = m45.G0;
                fd P = f44.P();
                Object obj = this.o;
                f44.Q(P, 26, new sq1(P, obj, this.b));
                if (m45.b1 == obj) {
                    m45.B0.m(26, new i74(20));
                    return;
                }
                return;
            case 8:
                v4b v4b = (v4b) this.c;
                v4b.getClass();
                int i2 = oze.a;
                n45 n45 = ((h45) v4b.c).a;
                g44 g44 = n45.H0;
                gd I = g44.I();
                Object obj2 = this.o;
                g44.J(I, 26, new b52((Object) I, obj2, this.b, 4));
                if (n45.f1 == obj2) {
                    n45.B0.f(26, new i74(21));
                    return;
                }
                return;
            default:
                t.p((t) this.c, (String) this.o, this.b);
                return;
        }
    }

    public /* synthetic */ v82(Object obj, Object obj2, long j, int i) {
        this.a = i;
        this.c = obj;
        this.o = obj2;
        this.b = j;
    }
}
