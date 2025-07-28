package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: ut5  reason: default package */
public final class ut5 implements Callable {
    public final /* synthetic */ int X;
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ bd4 o;

    public /* synthetic */ ut5(String str, Context context, bd4 bd4, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = context;
        this.o = bd4;
        this.X = i;
    }

    public final Object call() {
        switch (this.a) {
            case 0:
                return wt5.a(this.b, this.c, this.o, this.X);
            default:
                try {
                    return wt5.a(this.b, this.c, this.o, this.X);
                } catch (Throwable unused) {
                    return new vt5(-3);
                }
        }
    }
}
