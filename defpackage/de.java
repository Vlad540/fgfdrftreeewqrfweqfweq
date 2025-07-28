package defpackage;

/* renamed from: de  reason: default package */
public abstract class de {
    public static final qmc a;

    static {
        try {
            qmc qmc = (qmc) new be(0).call();
            if (qmc != null) {
                a = qmc;
                return;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw i15.f(th);
        }
    }

    public static qmc a() {
        qmc qmc = a;
        if (qmc != null) {
            return qmc;
        }
        throw new NullPointerException("scheduler == null");
    }
}
