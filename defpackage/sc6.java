package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: sc6  reason: default package */
public final class sc6 extends l5e implements i26 {
    public /* synthetic */ Object X;

    public final Object invoke(Object obj, Object obj2) {
        return n((tf3[]) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l5e l5e = new l5e(2, continuation);
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
            if (i >= length) {
                z = true;
                break;
            } else if (!(true ^ e07.A(tf3Arr[i]))) {
                break;
            } else {
                i++;
            }
        }
        return Boolean.valueOf(z);
    }
}
