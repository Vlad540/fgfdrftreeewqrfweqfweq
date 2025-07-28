package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.Iterator;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: y89  reason: default package */
public abstract class y89 {
    public static z89 a(byte[] bArr) {
        Object obj;
        try {
            Tasks.MsgReact mergeFrom = gr8.mergeFrom(new Tasks.MsgReact(), bArr);
            long j = mergeFrom.requestId;
            long j2 = mergeFrom.chatId;
            long j3 = mergeFrom.messageId;
            long j4 = mergeFrom.chatServerId;
            long j5 = mergeFrom.messageServerId;
            hk9 hk9 = wr8.b;
            int i = mergeFrom.reactionType;
            hk9.getClass();
            u1 it = wr8.X.iterator();
            while (true) {
                u1 u1Var = it;
                if (!u1Var.hasNext()) {
                    obj = null;
                    break;
                }
                obj = u1Var.next();
                Iterator it2 = it;
                if (((wr8) obj).a == i) {
                    break;
                }
                it = it2;
            }
            wr8 wr8 = (wr8) obj;
            if (wr8 != null) {
                return new z89(j, j2, j3, j4, j5, new rr8(wr8, mergeFrom.reaction));
            }
            throw new IllegalArgumentException(wn6.h(i, "Unknown reactionType = "));
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
