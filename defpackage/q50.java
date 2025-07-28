package defpackage;

import com.my.tracker.obfuscated.t;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;
import ru.ok.android.externcalls.sdk.AudioSampleEnergyCalculator;
import ru.ok.android.externcalls.sdk.feedback.internal.listeners.FeedbackListenerManagerImpl;

/* renamed from: q50  reason: default package */
public final /* synthetic */ class q50 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q50(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public final void run() {
        List list = null;
        long j = this.b;
        Object obj = this.c;
        switch (this.a) {
            case 0:
                qe4 qe4 = (qe4) obj;
                qe4.getClass();
                int i = oze.a;
                g44 g44 = ((h45) qe4.c).a.H0;
                gd I = g44.I();
                g44.J(I, 1010, new no3(I, j));
                return;
            case 1:
                otf otf = (otf) obj;
                otf.getClass();
                int i2 = mze.a;
                f44 f44 = ((g45) otf.b).a.G0;
                fd P = f44.P();
                f44.Q(P, 1010, new t34(P, j));
                return;
            case 2:
                AudioSampleEnergyCalculator.a((AudioSampleEnergyCalculator) obj, j);
                return;
            case 3:
                t52 t52 = (t52) obj;
                p62 p62 = (p62) t52.d.remove(Long.valueOf(j));
                if (p62 != null) {
                    ConcurrentHashMap concurrentHashMap = t52.c;
                    o62 o62 = p62.c;
                    concurrentHashMap.remove(Long.valueOf(o62.l));
                    t52.b.remove(Long.valueOf(o62.l));
                    t52.e.remove(Long.valueOf(o62.a));
                }
                i22 i22 = (i22) t52.f.remove(Long.valueOf(j));
                if (i22 != null) {
                    ConcurrentHashMap concurrentHashMap2 = t52.g;
                    o62 o622 = i22.b;
                    concurrentHashMap2.remove(Long.valueOf(o622.a));
                    t97 t97 = t52.C;
                    if (t97.getValue() != null) {
                        b92 b92 = (v72) t97.getValue();
                        b92.getClass();
                        xs7.E(b92.Z, (hu3) null, (ru3) null, new o82(b92, o622.a, (Continuation) null), 3);
                    }
                }
                t52.h.remove(Long.valueOf(j));
                return;
            case 4:
                FeedbackListenerManagerImpl.c((FeedbackListenerManagerImpl) obj, j);
                return;
            case 5:
                ((tg5) obj).k.F(j);
                return;
            case 6:
                ig6 ig6 = ((MessagesListWidget) obj).B0;
                fg6 fg6 = ig6.d;
                if (fg6 != null && fg6.a == j) {
                    list = fg6.b;
                }
                ig6.a(new fg6(j, list));
                return;
            case 7:
                ((vhd) ((xw2) obj).c).o.F(j);
                return;
            default:
                ((t) obj).a(j);
                return;
        }
    }
}
