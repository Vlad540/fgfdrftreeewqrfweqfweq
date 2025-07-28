package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: s65  reason: default package */
public abstract class s65 {
    public static t65 a(byte[] bArr) {
        try {
            Tasks.ExternalVideoSend mergeFrom = gr8.mergeFrom(new Tasks.ExternalVideoSend(), bArr);
            return new t65(mergeFrom.requestId, mergeFrom.externalUrl, mergeFrom.attachLocalId, mergeFrom.messageId, mergeFrom.chatId, mergeFrom.stickerId);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
