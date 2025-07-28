package defpackage;

import com.my.tracker.obfuscated.a0;

/* renamed from: kwf  reason: default package */
public final /* synthetic */ class kwf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a0 b;

    public /* synthetic */ kwf(a0 a0Var, int i) {
        this.a = i;
        this.b = a0Var;
    }

    public final void run() {
        int i = this.a;
        a0 a0Var = this.b;
        switch (i) {
            case 0:
                a0Var.c();
                return;
            default:
                a0.a(a0Var);
                return;
        }
    }
}
