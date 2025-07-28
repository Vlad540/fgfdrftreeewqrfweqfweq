package defpackage;

import java.util.Collections;
import java.util.concurrent.Callable;

/* renamed from: be  reason: default package */
public final /* synthetic */ class be implements Callable {
    public final /* synthetic */ int a;

    public /* synthetic */ be(int i) {
        this.a = i;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                return ce.a;
            case 1:
                return Collections.emptyList();
            default:
                return Thread.currentThread();
        }
    }
}
