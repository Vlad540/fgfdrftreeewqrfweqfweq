package defpackage;

import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: aha  reason: default package */
public final /* synthetic */ class aha implements j26, of3, bid {
    public final /* synthetic */ eha a;
    public final /* synthetic */ long b;

    public /* synthetic */ aha(eha eha, long j) {
        this.a = eha;
        this.b = j;
    }

    public void accept(Object obj) {
        eha eha = this.a;
        eha.getClass();
        udd.s("eha", "handleMediaTypingError", (Throwable) obj);
        long j = this.b;
        LinkedBlockingDeque linkedBlockingDeque = eha.c(j).a;
        if (!linkedBlockingDeque.isEmpty()) {
            try {
                linkedBlockingDeque.pop();
            } catch (NoSuchElementException unused) {
            }
        }
        if (!linkedBlockingDeque.isEmpty()) {
            eha.e(j);
        }
    }

    public Object apply(Object obj) {
        dhd dhd;
        Long l = (Long) obj;
        eha eha = this.a;
        eha.getClass();
        long j = this.b;
        if (j == 0) {
            dhd = dhd.g(0L);
        } else {
            udd.p("eha", "sendMediaTyping %d", new Object[]{Long.valueOf(j)});
            dhd = new mv9(1, new aha(eha, j));
        }
        return dhd.n();
    }

    public void j(ihd ihd) {
        bha bha;
        eha eha = this.a;
        eha.getClass();
        ConcurrentHashMap concurrentHashMap = eha.b;
        long j = this.b;
        cha cha = (cha) concurrentHashMap.get(Long.valueOf(j));
        if (cha == null || (bha = (bha) cha.a.peek()) == null) {
            ihd.onError(new Throwable("No media typing to send"));
            return;
        }
        eha.d(j, bha.a);
        ihd.a(Long.valueOf(bha.b));
    }
}
