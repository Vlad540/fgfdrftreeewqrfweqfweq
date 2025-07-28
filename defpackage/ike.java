package defpackage;

/* renamed from: ike  reason: default package */
public final /* synthetic */ class ike implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cle b;

    public /* synthetic */ ike(cle cle, int i) {
        this.a = i;
        this.b = cle;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                Runnable delegatedTask = this.b.a.getDelegatedTask();
                if (delegatedTask == null) {
                    return null;
                }
                delegatedTask.run();
                return jue.a;
            case 1:
                this.b.a.beginHandshake();
                return jue.a;
            default:
                Runnable delegatedTask2 = this.b.a.getDelegatedTask();
                if (delegatedTask2 == null) {
                    return null;
                }
                delegatedTask2.run();
                return jue.a;
        }
    }
}
