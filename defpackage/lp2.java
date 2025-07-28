package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.HashMap;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: lp2  reason: default package */
public abstract class lp2 {
    public static mp2 a(byte[] bArr) {
        try {
            Tasks.ChatUpdate mergeFrom = gr8.mergeFrom(new Tasks.ChatUpdate(), bArr);
            Tasks.Rect rect = mergeFrom.crop;
            Long l = null;
            d10 d10 = rect != null ? new d10(rect.left, rect.top, rect.right, rect.bottom, 2) : null;
            long j = mergeFrom.requestId;
            long j2 = mergeFrom.chatId;
            long j3 = mergeFrom.chatServerId;
            String str = mergeFrom.descriptionIsNull ? null : mergeFrom.description;
            String str2 = mergeFrom.themeIsNull ? null : mergeFrom.theme;
            String str3 = mergeFrom.photoTokenIsNull ? null : mergeFrom.photoToken;
            if (!mergeFrom.pinMessageIdIsNull) {
                l = Long.valueOf(mergeFrom.pinMessageId);
            }
            return new mp2(j, j2, j3, 0, (String) null, false, str, (HashMap) null, str2, str3, d10, l, mergeFrom.notifyPin, 0);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
