package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: j5b  reason: default package */
public abstract class j5b {
    public static k5b a(byte[] bArr) {
        try {
            Tasks.Profile mergeFrom = gr8.mergeFrom(new Tasks.Profile(), bArr);
            Tasks.Rect rect = mergeFrom.crop;
            return new k5b(mergeFrom.requestId, mergeFrom.firstName, mergeFrom.lastName, mergeFrom.photoToken, mergeFrom.photoId, rect != null ? new d10(rect.left, rect.top, rect.right, rect.bottom, 2) : null, mergeFrom.description, mergeFrom.link, mergeFrom.avatarType.equals("PRESET_AVATAR") ? 1 : 2);
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
