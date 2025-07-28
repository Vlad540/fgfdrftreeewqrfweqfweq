package defpackage;

import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* renamed from: vt7  reason: default package */
public final class vt7 {
    public i22 a;
    public int b;
    public vo8 c;
    public MessageModel d;
    public o1b e;
    public List f = hw4.a;

    public final wt7 a(u16 u16) {
        u16.invoke(this);
        i22 i22 = this.a;
        if (i22 != null) {
            int i = this.b;
            o1b o1b = this.e;
            if (o1b != null) {
                wt7 wt7 = new wt7(i22, o1b, i);
                vo8 vo8 = this.c;
                if (vo8 != null) {
                    k77 k77 = wt7.h[0];
                    wt7.d.b = vo8;
                }
                MessageModel messageModel = this.d;
                if (messageModel != null) {
                    k77 k772 = wt7.h[1];
                    wt7.e.b = messageModel;
                }
                List list = this.f;
                k77 k773 = wt7.h[3];
                wt7.g.b = list;
                return wt7;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
