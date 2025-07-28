package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: zwf  reason: default package */
public final /* synthetic */ class zwf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jj7 b;
    public final /* synthetic */ ahc c;

    public /* synthetic */ zwf(jj7 jj7, ahc ahc, int i) {
        this.a = i;
        this.b = jj7;
        this.c = ahc;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ahc ahc = this.c;
                jj7 jj7 = this.b;
                Iterator it = ((CopyOnWriteArrayList) jj7.b).iterator();
                while (it.hasNext()) {
                    ehc ehc = (ehc) it.next();
                    try {
                        ehc.d.put(ahc, Long.valueOf(ehc.c.getAndIncrement()));
                    } catch (Throwable th) {
                        ((xwb) jj7.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandsubmit", th);
                    }
                }
                return;
            case 1:
                ahc ahc2 = this.c;
                jj7 jj72 = this.b;
                Iterator it2 = ((CopyOnWriteArrayList) jj72.b).iterator();
                while (it2.hasNext()) {
                    try {
                        ((ehc) it2.next()).d.remove(ahc2);
                    } catch (Throwable th2) {
                        ((xwb) jj72.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandremove", th2);
                    }
                }
                return;
            default:
                ahc ahc3 = this.c;
                jj7 jj73 = this.b;
                Iterator it3 = ((CopyOnWriteArrayList) jj73.b).iterator();
                while (it3.hasNext()) {
                    ehc ehc2 = (ehc) it3.next();
                    try {
                        Long l = (Long) ehc2.d.get(ahc3);
                        if (l != null) {
                            ehc2.b.log(ehc2.a, "-> [" + l + "]: " + ahc3);
                        }
                    } catch (Throwable th3) {
                        ((xwb) jj73.a).reportException("CallsListeners", "rtc.command.handle.listeners.oncommandsent", th3);
                    }
                }
                return;
        }
    }
}
