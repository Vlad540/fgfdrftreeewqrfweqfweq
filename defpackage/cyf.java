package defpackage;

import com.my.tracker.obfuscated.b1;
import com.my.tracker.obfuscated.n;
import com.my.tracker.obfuscated.t;

/* renamed from: cyf  reason: default package */
public final /* synthetic */ class cyf implements n {
    public final /* synthetic */ int a;
    public final /* synthetic */ t b;

    public /* synthetic */ cyf(t tVar, int i) {
        this.a = i;
        this.b = tVar;
    }

    public final void a(Object obj) {
        int i = this.a;
        t tVar = this.b;
        switch (i) {
            case 0:
                tVar.b((Boolean) obj);
                return;
            case 1:
                tVar.c((Boolean) obj);
                return;
            case 2:
                tVar.a((b1) obj);
                return;
            default:
                tVar.c((b1) obj);
                return;
        }
    }
}
