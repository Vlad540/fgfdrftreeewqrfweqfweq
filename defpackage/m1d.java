package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: m1d  reason: default package */
public abstract class m1d {
    public static n1d a(byte[] bArr) {
        try {
            Tasks.SyncChatHistory mergeFrom = gr8.mergeFrom(new Tasks.SyncChatHistory(), bArr);
            n1d n1d = new n1d(mergeFrom.taskId, mergeFrom.chatId, mergeFrom.count, xhd.g(md4.o, Integer.valueOf(mergeFrom.itemTypeId)));
            udd.q(n1d.Y, "parseFrom");
            return n1d;
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
