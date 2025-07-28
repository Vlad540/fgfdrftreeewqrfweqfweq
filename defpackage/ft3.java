package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;
import ru.ok.android.externcalls.sdk.Conversation;

/* renamed from: ft3  reason: default package */
public final /* synthetic */ class ft3 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;

    public /* synthetic */ ft3(AtomicReference atomicReference, int i) {
        this.a = i;
        this.b = atomicReference;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (Conversation.State) this.b.get();
            case 1:
                AtomicReference atomicReference = this.b;
                int i = OneMeApplication.w0;
                long nanoTime = System.nanoTime();
                s5a s5a = (s5a) nqc.a.getAccessor().c(s5a.class);
                s5a.getClass();
                udd.q("OneMeInitialDataStorage", "load");
                List list = (List) xs7.M(bw4.a, new r5a(s5a, (Continuation) null));
                boolean z = false;
                boolean booleanValue = ((Boolean) list.get(0)).booleanValue();
                boolean booleanValue2 = ((Boolean) list.get(1)).booleanValue();
                if (booleanValue && booleanValue2) {
                    z = true;
                }
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    fn6.d(tn7.X, "OneMeInitialDataStorage", us8.k("load finished ", z), (Throwable) null);
                }
                fn6 fn62 = udd.e;
                if (fn62 != null && fn62.c()) {
                    tn7 tn7 = tn7.X;
                    int i2 = zp4.o;
                    fn62.d(tn7, "InitialDataTask", "initialDataStorage().load() by ".concat(zp4.j(mt0.Q(System.nanoTime() - nanoTime, eq4.b))), (Throwable) null);
                }
                atomicReference.set(Boolean.valueOf(z));
                return jue.a;
            case 2:
                int i3 = OneMeApplication.w0;
                Boolean bool = (Boolean) this.b.get();
                bool.booleanValue();
                return bool;
            default:
                xi4 xi4 = (xi4) this.b.getAndSet(cw4.a);
                if (xi4 != null) {
                    xi4.f();
                }
                return jue.a;
        }
    }
}
