package defpackage;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: qzf  reason: default package */
public final /* synthetic */ class qzf implements Runnable {
    public static final /* synthetic */ qzf b = new qzf(0);
    public final /* synthetic */ int a;

    public /* synthetic */ qzf(int i) {
        this.a = i;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    public final void run() {
        switch (this.a) {
            case 0:
            case 1:
                return;
            case 2:
                ArrayList arrayList = ki4.j;
                if (arrayList == null || arrayList.isEmpty()) {
                    ki4.j = null;
                    return;
                }
                ArrayList arrayList2 = ki4.j;
                ki4.j = null;
                if (ki4.k == null) {
                    ki4.k = new ki4(Math.max(1, ez3.e.d));
                }
                ((ScheduledExecutorService) ((r7e) ez3.e.f.b).getValue()).execute(new ie(arrayList2, 3));
                return;
            case 3:
                try {
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (pt4.p != null) {
                        pt4.a().d();
                    }
                    return;
                } finally {
                    Trace.endSection();
                }
            case 4:
            case 5:
            case 6:
                return;
            default:
                ((xr7) xv8.a.getAccessor().c(xr7.class)).a(Collections.singletonList(new pma(0)));
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return "EmptyRunnable";
            default:
                return super.toString();
        }
    }
}
