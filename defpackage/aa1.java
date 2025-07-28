package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: aa1  reason: default package */
public final class aa1 extends l5e implements i26 {
    public /* synthetic */ Object X;

    public final Object invoke(Object obj, Object obj2) {
        return ((aa1) n((tf3[]) obj, (Continuation) obj2)).o(jue.a);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [aa1, kotlin.coroutines.Continuation, l5e] */
    public final Continuation n(Object obj, Continuation continuation) {
        ? l5e = new l5e(2, continuation);
        l5e.X = obj;
        return l5e;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        tf3[] tf3Arr = (tf3[]) this.X;
        int length = tf3Arr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                tf3 tf3 = tf3Arr[i];
                if (tf3 == null || tf3.w()) {
                    break;
                }
                i++;
            } else {
                z = true;
                break;
            }
        }
        return Boolean.valueOf(z);
    }
}
