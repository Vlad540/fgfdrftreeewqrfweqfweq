package defpackage;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: axf  reason: default package */
public final /* synthetic */ class axf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jj7 b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int o;

    public /* synthetic */ axf(jj7 jj7, byte[] bArr, int i, int i2) {
        this.a = i2;
        this.b = jj7;
        this.c = bArr;
        this.o = i;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                int i = this.o;
                jj7 jj7 = this.b;
                Iterator it = ((CopyOnWriteArrayList) jj7.b).iterator();
                while (it.hasNext()) {
                    ehc ehc = (ehc) it.next();
                    try {
                        ehc.getClass();
                        int i2 = pwf.a[hr1.t(i)];
                        byte[] bArr = this.c;
                        ehc.b.log(ehc.a, "<- ".concat(i2 != 1 ? i2 != 2 ? "<unknown>" : tf6.a(bArr) : new String(bArr)));
                    } catch (Throwable th) {
                        ((xwb) jj7.a).reportException("CallsListeners", "rtc.command.handle.listeners.ondatareceive", th);
                    }
                }
                return;
            default:
                int i3 = this.o;
                jj7 jj72 = this.b;
                Iterator it2 = ((CopyOnWriteArrayList) jj72.b).iterator();
                while (it2.hasNext()) {
                    ehc ehc2 = (ehc) it2.next();
                    try {
                        ehc2.getClass();
                        int i4 = pwf.a[hr1.t(i3)];
                        byte[] bArr2 = this.c;
                        ehc2.b.log(ehc2.a, "-> ".concat(i4 != 1 ? i4 != 2 ? "<unknown>" : tf6.a(bArr2) : new String(bArr2)));
                    } catch (Throwable th2) {
                        ((xwb) jj72.a).reportException("CallsListeners", "rtc.command.handle.listeners.ondatasend", th2);
                    }
                }
                return;
        }
    }
}
