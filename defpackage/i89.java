package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: i89  reason: default package */
public abstract class i89 {
    public static j89 a(byte[] bArr) {
        try {
            Tasks.MsgDelete mergeFrom = gr8.mergeFrom(new Tasks.MsgDelete(), bArr);
            return new j89(mergeFrom.requestId, mergeFrom.chatId, mergeFrom.chatServerId, cs.f0(mergeFrom.messagesId), cs.f0(mergeFrom.messagesServerId), !r1g.p(mergeFrom.complaint) ? j63.a(mergeFrom.complaint) : null, mergeFrom.forMe, xhd.g(md4.o, Integer.valueOf(mergeFrom.itemTypeId)), mergeFrom.notDeleteMessageFromDb);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
