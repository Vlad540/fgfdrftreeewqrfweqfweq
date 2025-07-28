package defpackage;

import java.util.ArrayList;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* renamed from: tw8  reason: default package */
public final class tw8 implements yw8 {
    public static final tw8 o = new tw8(hw4.a, true, true);
    public final List a;
    public final boolean b;
    public final boolean c;

    public tw8(List list, boolean z, boolean z2) {
        this.a = list;
        this.b = z;
        this.c = z2;
    }

    public static String a(MessageModel messageModel) {
        if (messageModel == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("MessageModel(messageId=");
        sb.append(messageModel.a);
        sb.append(", serverId=");
        sb.append(messageModel.b);
        sb.append(", sortTime=");
        return wn6.k(sb, messageModel.c, ")");
    }

    public final List b() {
        return this.a;
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        for (Object next : this.a) {
            if (((MessageModel) next).Z == dcf.Error) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tw8)) {
            return false;
        }
        tw8 tw8 = (tw8) obj;
        return hhd.f(this.a, tw8.a) && this.b == tw8.b && this.c == tw8.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + th2.f(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        List list = this.a;
        int size = list.size();
        String a2 = a((MessageModel) o23.X(list));
        String a3 = a((MessageModel) o23.f0(list));
        return i0e.D("\n        MessagesList(\n            hasNext=" + this.b + ",\n            hasPrev=" + this.c + ",\n            messages=Messages(size=" + size + ", first=" + a2 + ", last=" + a3 + ")\n        ) \n        ");
    }
}
