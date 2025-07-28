package defpackage;

import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* renamed from: z2a  reason: default package */
public final /* synthetic */ class z2a implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ d3a b;
    public final /* synthetic */ xt7 c;

    public /* synthetic */ z2a(d3a d3a, wt7 wt7, int i) {
        this.a = i;
        this.b = d3a;
        this.c = wt7;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                wt7 wt7 = (wt7) this.c;
                List c2 = wt7.c();
                int i = wt7.c;
                return Boolean.valueOf(this.b.c(wt7, (MessageModel) c2.get(i), (MessageModel) wt7.c().get(i - 1)));
            default:
                wt7 wt72 = (wt7) this.c;
                List c3 = wt72.c();
                int i2 = wt72.c;
                return Boolean.valueOf(this.b.c(wt72, (MessageModel) c3.get(i2), (MessageModel) wt72.c().get(i2 + 1)));
        }
    }
}
