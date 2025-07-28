package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ej4  reason: default package */
public final class ej4 extends t37 {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ ej4(int i, Object obj) {
        this.b = i;
        this.c = obj;
    }

    public final boolean c() {
        switch (this.b) {
            case 0:
                return false;
            case 1:
                return false;
            default:
                return false;
        }
    }

    public final void d(Throwable th) {
        switch (this.b) {
            case 0:
                ((aj4) this.c).dispose();
                return;
            case 1:
                ((u16) this.c).invoke(th);
                return;
            default:
                ((Continuation) this.c).resumeWith(jue.a);
                return;
        }
    }
}
