package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.nano.b;

/* renamed from: o89  reason: default package */
public abstract class o89 {
    public static p89 a(byte[] bArr) {
        try {
            Tasks.MsgEdit mergeFrom = gr8.mergeFrom(new Tasks.MsgEdit(), bArr);
            Protos.Attaches attaches = mergeFrom.oldAttaches;
            ArrayList arrayList = null;
            List list = attaches != null ? (List) b.e(attaches).a : null;
            Protos.MessageElements messageElements = mergeFrom.oldElements;
            if (messageElements != null) {
                arrayList = gp8.a(messageElements);
            }
            ArrayList arrayList2 = arrayList;
            long j = mergeFrom.requestId;
            long j2 = mergeFrom.chatId;
            long j3 = mergeFrom.messageId;
            long j4 = mergeFrom.chatServerId;
            long j5 = mergeFrom.messageServerId;
            String str = mergeFrom.text;
            String str2 = mergeFrom.oldText;
            int i = mergeFrom.oldStatus;
            ls8[] values = ls8.values();
            String str3 = str2;
            int length = values.length;
            String str4 = str;
            int i2 = 0;
            while (i2 < length) {
                int i3 = length;
                ls8 ls8 = values[i2];
                ls8[] ls8Arr = values;
                if (ls8.a == i) {
                    return new p89(j, j2, j3, j4, j5, str4, str3, ls8, list, arrayList2, mergeFrom.editAttaches);
                }
                i2++;
                length = i3;
                values = ls8Arr;
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (InvalidProtocolBufferNanoException e) {
            throw new IOException(e);
        }
    }
}
