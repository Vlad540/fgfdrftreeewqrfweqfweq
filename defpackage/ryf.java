package defpackage;

import com.my.tracker.obfuscated.t;

/* renamed from: ryf  reason: default package */
public final /* synthetic */ class ryf implements Runnable {
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ t a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String o;

    public /* synthetic */ ryf(t tVar, String str, String str2, String str3, String str4, String str5, long j) {
        this.a = tVar;
        this.b = str;
        this.c = str2;
        this.o = str3;
        this.X = str4;
        this.Y = str5;
        this.Z = j;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.o, this.X, this.Y, this.Z);
    }
}
