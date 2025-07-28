package defpackage;

import java.util.Iterator;
import java.util.List;
import one.me.messages.list.loader.MessageModel;

/* renamed from: yw8  reason: default package */
public interface yw8 {
    List b();

    MessageModel e(long j) {
        Object obj;
        Iterator it = b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((MessageModel) obj).a == j) {
                break;
            }
        }
        return (MessageModel) obj;
    }

    int f(long j) {
        List b = b();
        int size = b.size();
        int i = 0;
        p23.E(b.size(), 0, size);
        int i2 = size - 1;
        while (i <= i2) {
            int i3 = (i + i2) >>> 1;
            int intValue = Integer.valueOf(hhd.p(((MessageModel) b.get(i3)).c, j)).intValue();
            if (intValue < 0) {
                i = i3 + 1;
            } else if (intValue <= 0) {
                return i3;
            } else {
                i2 = i3 - 1;
            }
        }
        return -(i + 1);
    }
}
