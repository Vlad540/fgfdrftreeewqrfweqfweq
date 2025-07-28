package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.CountDownLatch;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.upload.workers.UploadFileAttachWorker;

/* renamed from: bae  reason: default package */
public final class bae implements of3, hx9 {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ bae() {
        this.a = 0;
    }

    public void a(EventItemsMap eventItemsMap) {
        int i = cne.$EnumSwitchMapping$0[((ane) ((s16) this.b).invoke()).ordinal()];
        eventItemsMap.set("call_topology", i != 1 ? i != 2 ? "?" : "D" : "S");
    }

    public void accept(Object obj) {
        switch (this.a) {
            case 2:
                ((UploadFileAttachWorker) this.b).g((bt8) obj);
                return;
            default:
                udd.q("mtf", "initialized!");
                int i = 1;
                ((mtf) this.b).h = true;
                ((mtf) this.b).i((ftf) obj);
                ftf h = ((mtf) this.b).h();
                vqc vqc = (vqc) ((mtf) this.b).c;
                vqc.getClass();
                int o = (int) vqc.o(PmsKey.f128wmbacklogworkerbackoffdelaysec, (long) 10);
                if (o >= 1) {
                    i = o;
                }
                gp0.G(h, Integer.valueOf(i), (juf) null);
                return;
        }
    }

    public void l(Task task) {
        ((CountDownLatch) this.b).countDown();
    }

    public /* synthetic */ bae(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
