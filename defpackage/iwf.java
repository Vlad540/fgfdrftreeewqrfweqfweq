package defpackage;

import com.my.tracker.obfuscated.a;

/* renamed from: iwf  reason: default package */
public final /* synthetic */ class iwf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ iwf(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    public final void run() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.b();
                return;
            case 1:
                aVar.c();
                return;
            default:
                aVar.d();
                return;
        }
    }
}
