package defpackage;

import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* renamed from: wt7  reason: default package */
public final class wt7 implements xt7, yt7 {
    public static final /* synthetic */ k77[] h;
    public final i22 a;
    public final o1b b;
    public final int c;
    public final lv1 d = new lv1(24, false);
    public final lv1 e = new lv1(24, false);
    public final lv1 f = new lv1(24, false);
    public final lv1 g = new lv1(24, false);

    static {
        Class<wt7> cls = wt7.class;
        h = new k77[]{new hc9(cls, "messageDb", "getMessageDb()Lru/ok/tamtam/messages/MessageDb;"), c3d.g(m7c.a, cls, "messageModel", "getMessageModel()Lone/me/messages/list/loader/MessageModel;"), new hc9(cls, "senderContact", "getSenderContact()Lru/ok/tamtam/contacts/Contact;"), new hc9(cls, "messageModels", "getMessageModels()Ljava/util/List;")};
    }

    public wt7(i22 i22, o1b o1b, int i) {
        this.a = i22;
        this.b = o1b;
        this.c = i;
    }

    public final vo8 a() {
        return (vo8) this.d.T0(this, h[0]);
    }

    public final MessageModel b() {
        return (MessageModel) this.e.T0(this, h[1]);
    }

    public final List c() {
        return (List) this.g.T0(this, h[3]);
    }

    public final tf3 d() {
        return (tf3) this.f.T0(this, h[2]);
    }
}
