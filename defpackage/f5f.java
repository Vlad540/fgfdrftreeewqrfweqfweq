package defpackage;

import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.coroutines.Continuation;

/* renamed from: f5f  reason: default package */
public final class f5f {
    public final ReentrantLock a = new ReentrantLock();
    public final LinkedHashMap b = new LinkedHashMap();
    public final hcd c;
    public final ck5 d;

    /* JADX WARNING: type inference failed for: r0v5, types: [i26, l5e] */
    public f5f(t97 t97) {
        hcd a2 = icd.a(1, 1, 2);
        this.c = a2;
        this.d = new ck5(new u09(new v11(a2, new e5f(((ep1) ((so1) t97.getValue())).I, 0), new ah1(3, (Continuation) null, 5), 4), 29), new l5e(2, (Continuation) null), 5);
    }

    public final void a(View view, t8f t8f) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.b;
        try {
            ti4 ti4 = null;
            if (view.isAttachedToWindow()) {
                if (t8f != null) {
                    if (t8f.a) {
                        if (view.getMeasuredWidth() != 0) {
                            if (view.getMeasuredHeight() != 0) {
                                ti4 = new ti4(t8f.b, view.getMeasuredWidth(), view.getMeasuredHeight());
                            }
                        }
                    }
                }
            }
            if (ti4 == null) {
                boolean c2 = c(view);
                int hashCode = hashCode();
                int hashCode2 = view.hashCode();
                int size = linkedHashMap.size();
                udd.p("CallVideoDisplayLayoutUpdater", hashCode + " display layout " + hashCode2 + " is empty, skip. old value from cache was removed = " + c2 + ". total = " + size, new Object[0]);
                return;
            }
            boolean f = hhd.f(linkedHashMap.get(view), ti4);
            hcd hcd = this.c;
            if (f) {
                int hashCode3 = hashCode();
                int hashCode4 = view.hashCode();
                int size2 = linkedHashMap.size();
                udd.p("CallVideoDisplayLayoutUpdater", hashCode3 + " display layout " + hashCode4 + ", already added with params = " + ti4 + ", simple update. total = " + size2, new Object[0]);
                hcd.g(linkedHashMap);
                reentrantLock.unlock();
                return;
            }
            ht7 ht7 = new ht7();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (!hhd.f(entry.getKey(), view)) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            ht7.putAll(linkedHashMap2);
            ht7.put(view, ti4);
            ht7 b2 = ht7.b();
            linkedHashMap.clear();
            linkedHashMap.putAll(b2);
            int hashCode5 = hashCode();
            int hashCode6 = view.hashCode();
            int size3 = linkedHashMap.size();
            udd.p("CallVideoDisplayLayoutUpdater", hashCode5 + " add display layout " + hashCode6 + ", params = " + ti4 + ", total = " + size3, new Object[0]);
            hcd.g(b2);
            reentrantLock.unlock();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b() {
        int hashCode = hashCode();
        udd.p("CallVideoDisplayLayoutUpdater", hashCode + " clear cached states", new Object[0]);
        this.b.clear();
        this.c.g(iw4.a);
    }

    public final boolean c(View view) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        LinkedHashMap linkedHashMap = this.b;
        try {
            if (!linkedHashMap.containsKey(view)) {
                reentrantLock.unlock();
                return false;
            }
            ht7 ht7 = new ht7();
            ht7.clear();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Object obj = null;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (hhd.f(entry.getKey(), view)) {
                    obj = entry.getValue();
                }
                if (true ^ hhd.f(entry.getKey(), view)) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            ht7.putAll(linkedHashMap2);
            ht7 b2 = ht7.b();
            linkedHashMap.clear();
            linkedHashMap.putAll(b2);
            this.c.g(b2);
            int hashCode = hashCode();
            int hashCode2 = view.hashCode();
            int size = linkedHashMap.size();
            udd.p("CallVideoDisplayLayoutUpdater", hashCode + " remove display layout participantId=" + obj + " for " + hashCode2 + ", total = " + size, new Object[0]);
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
