package defpackage;

import android.content.Context;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.ArrayList;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* renamed from: zr8  reason: default package */
public final class zr8 {
    public final int a;
    public final t97 b;
    public final t97 c;
    public final Context d;
    public final boolean e;

    public zr8(Context context, t97 t97, t97 t972, rf4 rf4, int i) {
        this.a = i;
        this.b = t97;
        this.c = t972;
        this.d = context.getApplicationContext();
        this.e = rf4.b().compareTo(vf4.o) >= 0;
    }

    public final yr8 a(byte[] bArr) {
        yyb yyb;
        byte[] bArr2 = b.a;
        try {
            Protos.MessageReactions parseFrom = Protos.MessageReactions.parseFrom(bArr);
            ArrayList arrayList = new ArrayList();
            int length = parseFrom.reactions.length;
            for (int i = 0; i < length; i++) {
                Protos.ReactionData reactionData = parseFrom.reactions[i].reaction;
                int i2 = reactionData.type;
                zyb.b.getClass();
                arrayList.add(new xr8(new yyb(j06.d(i2), b(reactionData.reaction)), parseFrom.reactions[i].count));
            }
            int i3 = parseFrom.totalCount;
            Protos.ReactionData reactionData2 = parseFrom.yourReaction;
            if (reactionData2 == null) {
                yyb = null;
            } else {
                int i4 = reactionData2.type;
                zyb.b.getClass();
                yyb = new yyb(j06.d(i4), b(parseFrom.yourReaction.reaction));
            }
            return new yr8(arrayList, i3, yyb);
        } catch (InvalidProtocolBufferNanoException e2) {
            throw new IOException(e2);
        }
    }

    public final ryb b(String str) {
        return new ryb(((nu4) this.b.getValue()).b(this.d.getResources().getDimensionPixelSize(this.a), str));
    }

    /* JADX WARNING: type inference failed for: r5v3, types: [yr8] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedHashMap c(java.util.Map r10) {
        /*
            r9 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r10.size()
            int r1 = ju7.S(r1)
            r0.<init>(r1)
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0015:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L_0x0070
            java.lang.Object r1 = r10.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            vr8 r1 = (defpackage.vr8) r1
            r3 = 0
            if (r1 == 0) goto L_0x006c
            java.util.ArrayList r4 = new java.util.ArrayList
            java.util.List r5 = r1.a
            r6 = 10
            int r6 = q23.H(r5, r6)
            r4.<init>(r6)
            java.util.Iterator r5 = r5.iterator()
        L_0x003f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x005c
            java.lang.Object r6 = r5.next()
            sr8 r6 = (defpackage.sr8) r6
            xr8 r7 = new xr8
            rr8 r8 = r6.a
            yyb r8 = r9.d(r8)
            int r6 = r6.b
            r7.<init>(r8, r6)
            r4.add(r7)
            goto L_0x003f
        L_0x005c:
            rr8 r5 = r1.c
            if (r5 == 0) goto L_0x0064
            yyb r3 = r9.d(r5)
        L_0x0064:
            yr8 r5 = new yr8
            int r1 = r1.b
            r5.<init>(r4, r1, r3)
            r3 = r5
        L_0x006c:
            r0.put(r2, r3)
            goto L_0x0015
        L_0x0070:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr8.c(java.util.Map):java.util.LinkedHashMap");
    }

    public final yyb d(rr8 rr8) {
        j06 j06 = zyb.b;
        int i = rr8.a.a;
        j06.getClass();
        return new yyb(j06.d(i), b(rr8.b));
    }
}
