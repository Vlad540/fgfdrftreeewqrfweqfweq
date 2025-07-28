package defpackage;

import java.util.function.Consumer;

/* renamed from: nl2  reason: default package */
public final /* synthetic */ class nl2 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ u16 b;

    public /* synthetic */ nl2(z8 z8Var, int i) {
        this.a = i;
        this.b = (u16) z8Var;
    }

    public final /* synthetic */ void accept(Object obj) {
        switch (this.a) {
            case 0:
                this.b.invoke(obj);
                return;
            default:
                this.b.invoke(obj);
                return;
        }
    }
}
