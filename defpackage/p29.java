package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.util.List;
import java.util.NoSuchElementException;
import ru.ok.tamtam.nano.ProtoException;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: p29  reason: default package */
public final class p29 {
    public final t97 a;

    public p29(t97 t97) {
        this.a = t97;
    }

    public static List a(byte[] bArr) {
        try {
            Protos.MessageElements messageElements = new Protos.MessageElements();
            gr8.mergeFrom(messageElements, bArr);
            return gp8.a(messageElements);
        } catch (InvalidProtocolBufferNanoException e) {
            udd.s("MessagesTypeConverters", "InvalidProtocolBufferNanoException", e);
            return hw4.a;
        }
    }

    public static ls8 b(int i) {
        for (ls8 ls8 : ls8.values()) {
            if (ls8.a == i) {
                return ls8;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public static byte[] d(yr8 yr8) {
        if (yr8 == null) {
            return null;
        }
        byte[] bArr = b.a;
        Protos.MessageReactions messageReactions = new Protos.MessageReactions();
        List list = yr8.a;
        int size = list.size();
        Protos.MessageReactionWithCount[] messageReactionWithCountArr = new Protos.MessageReactionWithCount[size];
        for (int i = 0; i < size; i++) {
            xr8 xr8 = (xr8) list.get(i);
            Protos.MessageReactionWithCount messageReactionWithCount = new Protos.MessageReactionWithCount();
            Protos.ReactionData reactionData = new Protos.ReactionData();
            reactionData.reaction = xr8.a.b.a.toString();
            reactionData.type = xr8.a.a.a;
            messageReactionWithCount.count = xr8.b;
            messageReactionWithCount.reaction = reactionData;
            messageReactionWithCountArr[i] = messageReactionWithCount;
        }
        messageReactions.reactions = messageReactionWithCountArr;
        messageReactions.totalCount = yr8.b;
        yyb yyb = yr8.c;
        if (yyb != null) {
            Protos.ReactionData reactionData2 = new Protos.ReactionData();
            reactionData2.reaction = yyb.b.a.toString();
            reactionData2.type = yyb.a.a;
            messageReactions.yourReaction = reactionData2;
        }
        return gr8.toByteArray(messageReactions);
    }

    public final yr8 c(byte[] bArr) {
        zr8 zr8 = (zr8) this.a.getValue();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            return zr8.a(bArr);
        } catch (ProtoException e) {
            throw new RuntimeException(e);
        }
    }
}
