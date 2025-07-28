package defpackage;

import java.util.concurrent.Callable;

/* renamed from: wdc  reason: default package */
public final /* synthetic */ class wdc implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s16 b;

    public /* synthetic */ wdc(int i, s16 s16) {
        this.a = i;
        this.b = s16;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                return this.b.invoke();
            default:
                return this.b.invoke();
        }
    }
}
