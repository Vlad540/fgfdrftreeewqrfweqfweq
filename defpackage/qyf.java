package defpackage;

import com.my.tracker.obfuscated.o0;
import com.my.tracker.obfuscated.t;

/* renamed from: qyf  reason: default package */
public final /* synthetic */ class qyf implements Runnable {
    public final /* synthetic */ long X;
    public final /* synthetic */ t a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ o0.a o;

    public /* synthetic */ qyf(t tVar, long j, String str, o0.a aVar, long j2) {
        this.a = tVar;
        this.b = j;
        this.c = str;
        this.o = aVar;
        this.X = j2;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.o, this.X);
    }
}
