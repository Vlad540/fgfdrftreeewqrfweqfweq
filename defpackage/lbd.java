package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lbd  reason: default package */
public final class lbd extends l5e implements i26 {
    public final Object invoke(Object obj, Object obj2) {
        return ((lbd) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new l5e(2, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        hba hba = (hba) ff4.a.getAccessor().c(hba.class);
        hba.i("Скачивание логов началось");
        hba.b("Для успешного скачивания логов не покидайте экран");
        return hba.j();
    }
}
