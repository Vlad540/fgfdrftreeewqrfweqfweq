package defpackage;

import com.my.tracker.obfuscated.t;
import java.util.Map;

/* renamed from: pyf  reason: default package */
public final /* synthetic */ class pyf implements Runnable {
    public final /* synthetic */ String X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ String o;

    public /* synthetic */ pyf(t tVar, String str, String str2, long j, Runnable runnable) {
        this.a = 2;
        this.b = tVar;
        this.o = str;
        this.X = str2;
        this.Y = j;
        this.c = runnable;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.b((Map) this.c, this.o, this.X, this.Y);
                return;
            case 1:
                this.b.a((Map) this.c, this.o, this.X, this.Y);
                return;
            default:
                this.b.a(this.o, this.X, this.Y, (Runnable) this.c);
                return;
        }
    }

    public /* synthetic */ pyf(t tVar, Map map, String str, String str2, long j, int i) {
        this.a = i;
        this.b = tVar;
        this.c = map;
        this.o = str;
        this.X = str2;
        this.Y = j;
    }
}
