package defpackage;

import kotlin.coroutines.Continuation;
import one.me.rlottie.RLottieDrawable;
import one.me.rlottie.RLottieDrawableUtils;

/* renamed from: xj  reason: default package */
public final class xj extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ zj Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xj(zj zjVar, Continuation continuation) {
        super(2, continuation);
        this.Y = zjVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ese) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        xj xjVar = new xj(this.Y, continuation);
        xjVar.X = obj;
        return xjVar;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ese ese = (ese) this.X;
        long longValue = ((Number) ese.a).longValue();
        String str = (String) ese.b;
        String str2 = (String) ese.c;
        zj zjVar = this.Y;
        String str3 = zjVar.w0;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str3, wn6.l(m4b.j("handleAnimoji #", longValue, ", ", str), ", ", str2), (Throwable) null);
        }
        if (str != null && str.length() != 0) {
            String str4 = zjVar.w0;
            fn6 fn62 = udd.e;
            if (fn62 != null && fn62.c()) {
                fn62.d(tn7.X, str4, wn6.l(m4b.j("handleLottie #", longValue, ", ", str), ", ", str2), (Throwable) null);
            }
            fi fiVar = zjVar.o;
            int i = zjVar.a;
            fiVar.getClass();
            RLottieDrawable rLottieDrawable = (RLottieDrawable) fiVar.a.computeIfAbsent(new ei(longValue, i), new di(0, new q8(i, 1, str)));
            rLottieDrawable.scaleByCanvas = true;
            if (rLottieDrawable.isLoadingFailed()) {
                RLottieDrawableUtils.restartDownloadFromUrl(rLottieDrawable, true);
            }
            rLottieDrawable.addDrawableLoadListener(new wj(zjVar, str2));
        } else if (!(str2 == null || str2.length() == 0)) {
            zjVar.c(str2);
        }
        return jue.a;
    }
}
