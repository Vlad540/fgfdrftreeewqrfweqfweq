package ru.ok.android.externcalls.sdk.util;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"", "T", "Lkotlin/Function0;", "Lpf3;", "onSuccess", "Ljava/lang/Runnable;", "onError", "Lxi4;", "executeOnIoThread", "(Ls16;Lpf3;Ljava/lang/Runnable;)Lxi4;", "calls-sdk_release"}, k = 2, mv = {1, 9, 0})
public final class CallsThreadUtilsKt {
    public static final <T> xi4 executeOnIoThread(s16 s16, pf3 pf3, Runnable runnable) {
        yhd i = new mv9(1, new bm1(2, s16)).m(cnc.b()).i(de.a());
        pn1 pn1 = new pn1(new CallsThreadUtilsKt$executeOnIoThread$2(pf3), 2, new CallsThreadUtilsKt$executeOnIoThread$3(runnable));
        i.k(pn1);
        return pn1;
    }

    /* access modifiers changed from: private */
    public static final void executeOnIoThread$lambda$0(s16 s16, nhd nhd) {
        try {
            ((ihd) nhd).a(s16.invoke());
        } catch (Throwable th) {
            ((ihd) nhd).onError(th);
        }
    }
}
