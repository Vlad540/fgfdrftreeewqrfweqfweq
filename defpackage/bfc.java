package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: bfc  reason: default package */
public final class bfc implements nee {
    public final bec a;
    public final g15 b;
    public final r7e c = new r7e(new u5b(14, this));

    public bfc(bec bec, g15 g15) {
        this.a = bec;
        this.b = g15;
    }

    /* JADX WARNING: type inference failed for: r10v2 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r11v15 */
    /* JADX WARNING: type inference failed for: r2v93 */
    /* JADX WARNING: type inference failed for: r9v17 */
    /* JADX WARNING: type inference failed for: r12v8 */
    /* JADX WARNING: type inference failed for: r1v106 */
    /* JADX WARNING: type inference failed for: r2v110, types: [u62] */
    /* JADX WARNING: type inference failed for: r2v111, types: [iq2] */
    /* JADX WARNING: type inference failed for: r2v112, types: [p42] */
    /* JADX WARNING: type inference failed for: r2v113, types: [w92] */
    /* JADX WARNING: type inference failed for: r2v114, types: [r42] */
    /* JADX WARNING: type inference failed for: r2v115, types: [j99] */
    /* JADX WARNING: type inference failed for: r6v19, types: [sh2] */
    /* JADX WARNING: type inference failed for: r2v116, types: [xn2] */
    /* JADX WARNING: type inference failed for: r2v117, types: [qj2] */
    /* JADX WARNING: type inference failed for: r2v118, types: [nd5] */
    /* JADX WARNING: type inference failed for: r2v119, types: [m89] */
    /* JADX WARNING: type inference failed for: r6v20, types: [e99] */
    /* JADX WARNING: type inference failed for: r2v120, types: [d5e] */
    /* JADX WARNING: type inference failed for: r2v121, types: [r0d] */
    /* JADX WARNING: type inference failed for: r14v7, types: [f02] */
    /* JADX WARNING: type inference failed for: r2v122, types: [sm7] */
    /* JADX WARNING: type inference failed for: r2v123, types: [ct] */
    /* JADX WARNING: type inference failed for: r2v124, types: [lt] */
    /* JADX WARNING: type inference failed for: r2v125, types: [ot] */
    /* JADX WARNING: type inference failed for: r2v126, types: [c92] */
    /* JADX WARNING: type inference failed for: r8v13, types: [bm4] */
    /* JADX WARNING: type inference failed for: r2v127, types: [xl4] */
    /* JADX WARNING: type inference failed for: r2v128, types: [jve] */
    /* JADX WARNING: type inference failed for: r14v8, types: [wy1] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x04a7, code lost:
        if (r6.equals("CHAT") == false) goto L_0x047e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:?, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:?, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:366:?, code lost:
        return r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:?, code lost:
        return r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:?, code lost:
        return r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:?, code lost:
        return r10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:234:0x03f3=Splitter:B:234:0x03f3, B:287:0x04b6=Splitter:B:287:0x04b6} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.tna d(defpackage.una r23, byte[] r24) {
        /*
            r1 = r24
            r2 = 3
            r3 = 0
            r4 = 2
            r5 = 1
            int r6 = r23.ordinal()     // Catch:{ ProtoException -> 0x0014 }
            r7 = 0
            switch(r6) {
                case 0: goto L_0x0606;
                case 1: goto L_0x0602;
                case 2: goto L_0x05fd;
                case 3: goto L_0x05f8;
                case 4: goto L_0x05f3;
                case 5: goto L_0x05ee;
                case 6: goto L_0x05c9;
                case 7: goto L_0x05a6;
                case 8: goto L_0x05a1;
                case 9: goto L_0x057c;
                case 10: goto L_0x0548;
                case 11: goto L_0x051e;
                case 12: goto L_0x0516;
                case 13: goto L_0x0510;
                case 14: goto L_0x04ef;
                case 15: goto L_0x04ce;
                case 16: goto L_0x0450;
                case 17: goto L_0x042f;
                case 18: goto L_0x03d0;
                case 19: goto L_0x03af;
                case 20: goto L_0x038e;
                case 21: goto L_0x0369;
                case 22: goto L_0x034b;
                case 23: goto L_0x031c;
                case 24: goto L_0x02ee;
                case 25: goto L_0x029f;
                case 26: goto L_0x027b;
                case 27: goto L_0x025a;
                case 28: goto L_0x0254;
                case 29: goto L_0x0209;
                case 30: goto L_0x0203;
                case 31: goto L_0x01e2;
                case 32: goto L_0x01bc;
                case 33: goto L_0x0195;
                case 34: goto L_0x015f;
                case 35: goto L_0x0135;
                case 36: goto L_0x0115;
                case 37: goto L_0x00d8;
                case 38: goto L_0x00b6;
                case 39: goto L_0x00b0;
                case 40: goto L_0x008a;
                case 41: goto L_0x0064;
                case 42: goto L_0x0018;
                default: goto L_0x000e;
            }     // Catch:{ ProtoException -> 0x0014 }
        L_0x000e:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException     // Catch:{ ProtoException -> 0x0014 }
            r1.<init>()     // Catch:{ ProtoException -> 0x0014 }
            throw r1     // Catch:{ ProtoException -> 0x0014 }
        L_0x0014:
            r0 = move-exception
            r1 = r0
            goto L_0x0607
        L_0x0018:
            ru.ok.tamtam.nano.Tasks$ChangeChatPhoto r2 = new ru.ok.tamtam.nano.Tasks$ChangeChatPhoto     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x005c }
            ru.ok.tamtam.nano.Tasks$ChangeChatPhoto r1 = (ru.ok.tamtam.nano.Tasks.ChangeChatPhoto) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x005c }
            ru.ok.tamtam.nano.Tasks$Rect r2 = r1.crop     // Catch:{ ProtoException -> 0x0014 }
            if (r2 == 0) goto L_0x0039
            d10 r3 = new d10     // Catch:{ ProtoException -> 0x0014 }
            float r9 = r2.left     // Catch:{ ProtoException -> 0x0014 }
            float r10 = r2.top     // Catch:{ ProtoException -> 0x0014 }
            float r11 = r2.right     // Catch:{ ProtoException -> 0x0014 }
            float r12 = r2.bottom     // Catch:{ ProtoException -> 0x0014 }
            r13 = 2
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ ProtoException -> 0x0014 }
            r20 = r3
            goto L_0x003b
        L_0x0039:
            r20 = r7
        L_0x003b:
            long r2 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r4 = r1.file     // Catch:{ ProtoException -> 0x0014 }
            int r5 = r4.length()     // Catch:{ ProtoException -> 0x0014 }
            if (r5 != 0) goto L_0x0048
            r17 = r7
            goto L_0x004a
        L_0x0048:
            r17 = r4
        L_0x004a:
            long r4 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r6 = r1.lastModified     // Catch:{ ProtoException -> 0x0014 }
            wy1 r1 = new wy1     // Catch:{ ProtoException -> 0x0014 }
            r14 = r1
            r15 = r2
            r18 = r4
            r21 = r6
            r14.<init>(r15, r17, r18, r20, r21)     // Catch:{ ProtoException -> 0x0014 }
        L_0x0059:
            r7 = r1
            goto L_0x0606
        L_0x005c:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x0064:
            ru.ok.tamtam.nano.Tasks$UpdateFireTimeProtoTask r2 = new ru.ok.tamtam.nano.Tasks$UpdateFireTimeProtoTask     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0082 }
            ru.ok.tamtam.nano.Tasks$UpdateFireTimeProtoTask r1 = (ru.ok.tamtam.nano.Tasks.UpdateFireTimeProtoTask) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0082 }
            jve r12 = new jve     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.messageId     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.fireTime     // Catch:{ ProtoException -> 0x0014 }
            boolean r11 = r1.notifySender     // Catch:{ ProtoException -> 0x0014 }
            r2 = r12
            r2.<init>(r3, r5, r7, r9, r11)     // Catch:{ ProtoException -> 0x0014 }
        L_0x007f:
            r7 = r12
            goto L_0x0606
        L_0x0082:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x008a:
            ru.ok.tamtam.nano.Tasks$MsgCancelReaction r2 = new ru.ok.tamtam.nano.Tasks$MsgCancelReaction     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x00a8 }
            ru.ok.tamtam.nano.Tasks$MsgCancelReaction r1 = (ru.ok.tamtam.nano.Tasks.MsgCancelReaction) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x00a8 }
            g89 r13 = new g89     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.messageId     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            long r11 = r1.messageServerId     // Catch:{ ProtoException -> 0x0014 }
            r2 = r13
            r2.<init>(r3, r5, r7, r9, r11)     // Catch:{ ProtoException -> 0x0014 }
            r7 = r13
            goto L_0x0606
        L_0x00a8:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x00b0:
            z89 r7 = defpackage.y89.a(r24)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x00b6:
            ru.ok.tamtam.nano.Tasks$DraftDiscard r2 = new ru.ok.tamtam.nano.Tasks$DraftDiscard     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x00d0 }
            ru.ok.tamtam.nano.Tasks$DraftDiscard r1 = (ru.ok.tamtam.nano.Tasks.DraftDiscard) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x00d0 }
            xl4 r9 = new xl4     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.serverTime     // Catch:{ ProtoException -> 0x0014 }
            r2 = r9
            r2.<init>(r3, r5, r7)     // Catch:{ ProtoException -> 0x0014 }
        L_0x00cd:
            r7 = r9
            goto L_0x0606
        L_0x00d0:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x00d8:
            ru.ok.tamtam.nano.Tasks$DraftSave r2 = new ru.ok.tamtam.nano.Tasks$DraftSave     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x010d }
            ru.ok.tamtam.nano.Tasks$DraftSave r1 = (ru.ok.tamtam.nano.Tasks.DraftSave) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x010d }
            bm4 r2 = new bm4     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r11 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            byte[] r1 = r1.draft     // Catch:{ ProtoException -> 0x0014 }
            j4a r1 = defpackage.am4.a(r1, r7)     // Catch:{ ProtoException -> 0x0014 }
            if (r1 != 0) goto L_0x0105
            j4a r1 = new j4a     // Catch:{ ProtoException -> 0x0014 }
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 127(0x7f, float:1.78E-43)
            r14 = 0
            r16 = 0
            r17 = 0
            r13 = r1
            r13.<init>((long) r14, (defpackage.h97) r16, (java.lang.Long) r17, (java.lang.Long) r18, (java.lang.Long) r19, (boolean) r20, (int) r21)     // Catch:{ ProtoException -> 0x0014 }
        L_0x0105:
            r13 = r1
            r8 = r2
            r8.<init>(r9, r11, r13)     // Catch:{ ProtoException -> 0x0014 }
        L_0x010a:
            r7 = r2
            goto L_0x0606
        L_0x010d:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x0115:
            ru.ok.tamtam.nano.Tasks$ChatHide r2 = new ru.ok.tamtam.nano.Tasks$ChatHide     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x012d }
            ru.ok.tamtam.nano.Tasks$ChatHide r1 = (ru.ok.tamtam.nano.Tasks.ChatHide) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x012d }
            c92 r9 = new c92     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            r2 = r9
            r2.<init>(r3, r5, r7)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x00cd
        L_0x012d:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x0135:
            ru.ok.tamtam.nano.Tasks$AssetsMove r2 = new ru.ok.tamtam.nano.Tasks$AssetsMove     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0157 }
            ru.ok.tamtam.nano.Tasks$AssetsMove r1 = (ru.ok.tamtam.nano.Tasks.AssetsMove) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0157 }
            ot r11 = new ot     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            int r2 = r1.assetType     // Catch:{ ProtoException -> 0x0014 }
            int r5 = ru.ok.tamtam.nano.b.b(r2)     // Catch:{ ProtoException -> 0x0014 }
            long r6 = r1.id     // Catch:{ ProtoException -> 0x0014 }
            long r8 = r1.prevId     // Catch:{ ProtoException -> 0x0014 }
            int r10 = r1.position     // Catch:{ ProtoException -> 0x0014 }
            r2 = r11
            r2.<init>(r3, r5, r6, r8, r10)     // Catch:{ ProtoException -> 0x0014 }
        L_0x0154:
            r7 = r11
            goto L_0x0606
        L_0x0157:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x015f:
            ru.ok.tamtam.nano.Tasks$AssetsRemove r2 = new ru.ok.tamtam.nano.Tasks$AssetsRemove     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x018d }
            ru.ok.tamtam.nano.Tasks$AssetsRemove r1 = (ru.ok.tamtam.nano.Tasks.AssetsRemove) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x018d }
            long[] r2 = r1.ids     // Catch:{ ProtoException -> 0x0014 }
            if (r2 == 0) goto L_0x0178
            int r4 = r2.length     // Catch:{ ProtoException -> 0x0014 }
            if (r4 != 0) goto L_0x0173
            r4 = r5
            goto L_0x0174
        L_0x0173:
            r4 = r3
        L_0x0174:
            r4 = r4 ^ r5
            if (r4 == 0) goto L_0x0178
            goto L_0x017e
        L_0x0178:
            long[] r2 = new long[r5]     // Catch:{ ProtoException -> 0x0014 }
            long r4 = r1.id     // Catch:{ ProtoException -> 0x0014 }
            r2[r3] = r4     // Catch:{ ProtoException -> 0x0014 }
        L_0x017e:
            rt r7 = new rt     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            int r1 = r1.assetType     // Catch:{ ProtoException -> 0x0014 }
            int r1 = ru.ok.tamtam.nano.b.b(r1)     // Catch:{ ProtoException -> 0x0014 }
            r7.<init>(r1, r3, r2)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x018d:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x0195:
            ru.ok.tamtam.nano.Tasks$AssetsListModify r2 = new ru.ok.tamtam.nano.Tasks$AssetsListModify     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x01b4 }
            ru.ok.tamtam.nano.Tasks$AssetsListModify r1 = (ru.ok.tamtam.nano.Tasks.AssetsListModify) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x01b4 }
            lt r9 = new lt     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            int r2 = r1.assetType     // Catch:{ ProtoException -> 0x0014 }
            int r5 = ru.ok.tamtam.nano.b.b(r2)     // Catch:{ ProtoException -> 0x0014 }
            long[] r6 = r1.ids     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.modifyTime     // Catch:{ ProtoException -> 0x0014 }
            r2 = r9
            r2.<init>(r3, r5, r6, r7)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x00cd
        L_0x01b4:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x01bc:
            ru.ok.tamtam.nano.Tasks$AssetsAdd r2 = new ru.ok.tamtam.nano.Tasks$AssetsAdd     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x01da }
            ru.ok.tamtam.nano.Tasks$AssetsAdd r1 = (ru.ok.tamtam.nano.Tasks.AssetsAdd) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x01da }
            ct r8 = new ct     // Catch:{ ProtoException -> 0x0014 }
            long r4 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            int r2 = r1.assetType     // Catch:{ ProtoException -> 0x0014 }
            int r3 = ru.ok.tamtam.nano.b.b(r2)     // Catch:{ ProtoException -> 0x0014 }
            long r6 = r1.id     // Catch:{ ProtoException -> 0x0014 }
            r2 = r8
            r2.<init>(r3, r4, r6)     // Catch:{ ProtoException -> 0x0014 }
        L_0x01d7:
            r7 = r8
            goto L_0x0606
        L_0x01da:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x01e2:
            ru.ok.tamtam.nano.Tasks$LocationStop r2 = new ru.ok.tamtam.nano.Tasks$LocationStop     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x01fb }
            ru.ok.tamtam.nano.Tasks$LocationStop r1 = (ru.ok.tamtam.nano.Tasks.LocationStop) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x01fb }
            sm7 r9 = new sm7     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.messageId     // Catch:{ ProtoException -> 0x0014 }
            r2 = r9
            r2.<init>(r3, r5, r7)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x00cd
        L_0x01fb:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x0203:
            t65 r7 = defpackage.s65.a(r24)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x0209:
            ru.ok.tamtam.nano.Tasks$ChangeProfileOrChatPhoto r2 = new ru.ok.tamtam.nano.Tasks$ChangeProfileOrChatPhoto     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x024c }
            ru.ok.tamtam.nano.Tasks$ChangeProfileOrChatPhoto r1 = (ru.ok.tamtam.nano.Tasks.ChangeProfileOrChatPhoto) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x024c }
            ru.ok.tamtam.nano.Tasks$Rect r2 = r1.crop     // Catch:{ ProtoException -> 0x0014 }
            if (r2 == 0) goto L_0x022a
            d10 r3 = new d10     // Catch:{ ProtoException -> 0x0014 }
            float r9 = r2.left     // Catch:{ ProtoException -> 0x0014 }
            float r10 = r2.top     // Catch:{ ProtoException -> 0x0014 }
            float r11 = r2.right     // Catch:{ ProtoException -> 0x0014 }
            float r12 = r2.bottom     // Catch:{ ProtoException -> 0x0014 }
            r13 = 2
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13)     // Catch:{ ProtoException -> 0x0014 }
            r20 = r3
            goto L_0x022c
        L_0x022a:
            r20 = r7
        L_0x022c:
            long r2 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r4 = r1.file     // Catch:{ ProtoException -> 0x0014 }
            int r5 = r4.length()     // Catch:{ ProtoException -> 0x0014 }
            if (r5 != 0) goto L_0x0239
            r17 = r7
            goto L_0x023b
        L_0x0239:
            r17 = r4
        L_0x023b:
            long r4 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r6 = r1.lastModified     // Catch:{ ProtoException -> 0x0014 }
            f02 r1 = new f02     // Catch:{ ProtoException -> 0x0014 }
            r14 = r1
            r15 = r2
            r18 = r4
            r21 = r6
            r14.<init>(r15, r17, r18, r20, r21)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0059
        L_0x024c:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x0254:
            l07 r7 = defpackage.k07.a(r24)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x025a:
            ru.ok.tamtam.nano.Tasks$LocationRequest r2 = new ru.ok.tamtam.nano.Tasks$LocationRequest     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0273 }
            ru.ok.tamtam.nano.Tasks$LocationRequest r1 = (ru.ok.tamtam.nano.Tasks.LocationRequest) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0273 }
            r0d r8 = new r0d     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.messageId     // Catch:{ ProtoException -> 0x0014 }
            boolean r7 = r1.liveLocation     // Catch:{ ProtoException -> 0x0014 }
            r2 = r8
            r2.<init>(r3, r5, r7)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x01d7
        L_0x0273:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x027b:
            ru.ok.tamtam.nano.Tasks$SuspendBot r2 = new ru.ok.tamtam.nano.Tasks$SuspendBot     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0297 }
            ru.ok.tamtam.nano.Tasks$SuspendBot r1 = (ru.ok.tamtam.nano.Tasks.SuspendBot) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0297 }
            d5e r10 = new d5e     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r8 = r1.botId     // Catch:{ ProtoException -> 0x0014 }
            boolean r7 = r1.suspend     // Catch:{ ProtoException -> 0x0014 }
            r2 = r10
            r2.<init>(r3, r5, r7, r8)     // Catch:{ ProtoException -> 0x0014 }
        L_0x0294:
            r7 = r10
            goto L_0x0606
        L_0x0297:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x029f:
            ru.ok.tamtam.nano.Tasks$MsgSendCallback r2 = new ru.ok.tamtam.nano.Tasks$MsgSendCallback     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x02e6 }
            ru.ok.tamtam.nano.Tasks$MsgSendCallback r1 = (ru.ok.tamtam.nano.Tasks.MsgSendCallback) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x02e6 }
            e99 r2 = new e99     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r9 = r1.callbackId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r10 = r1.payload     // Catch:{ ProtoException -> 0x0014 }
            long r11 = r1.timestamp     // Catch:{ ProtoException -> 0x0014 }
            long r13 = r1.messageId     // Catch:{ ProtoException -> 0x0014 }
            eu0 r15 = new eu0     // Catch:{ ProtoException -> 0x0014 }
            ru.ok.tamtam.nano.Tasks$MsgSendCallback$ButtonPosition r4 = r1.buttonPosition     // Catch:{ ProtoException -> 0x0014 }
            int r6 = r4.row     // Catch:{ ProtoException -> 0x0014 }
            int r4 = r4.column     // Catch:{ ProtoException -> 0x0014 }
            r15.<init>(r6, r4)     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r1 = r1.buttonType     // Catch:{ ProtoException -> 0x0014 }
            hu0[] r4 = defpackage.hu0.y0     // Catch:{ ProtoException -> 0x0014 }
            int r6 = r4.length     // Catch:{ ProtoException -> 0x0014 }
        L_0x02c6:
            if (r3 >= r6) goto L_0x02dc
            r5 = r4[r3]     // Catch:{ ProtoException -> 0x0014 }
            r23 = r4
            java.lang.String r4 = r5.a     // Catch:{ ProtoException -> 0x0014 }
            boolean r4 = r4.equalsIgnoreCase(r1)     // Catch:{ ProtoException -> 0x0014 }
            if (r4 == 0) goto L_0x02d7
            r16 = r5
            goto L_0x02e0
        L_0x02d7:
            r5 = 1
            int r3 = r3 + r5
            r4 = r23
            goto L_0x02c6
        L_0x02dc:
            hu0 r1 = defpackage.hu0.UNKNOWN     // Catch:{ ProtoException -> 0x0014 }
            r16 = r1
        L_0x02e0:
            r6 = r2
            r6.<init>(r7, r9, r10, r11, r13, r15, r16)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x010a
        L_0x02e6:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x02ee:
            ru.ok.tamtam.nano.Tasks$ChatComplain r2 = new ru.ok.tamtam.nano.Tasks$ChatComplain     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0314 }
            ru.ok.tamtam.nano.Tasks$ChatComplain r1 = (ru.ok.tamtam.nano.Tasks.ChatComplain) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0314 }
            java.lang.String r2 = r1.complaint     // Catch:{ ProtoException -> 0x0014 }
            boolean r2 = r1g.p(r2)     // Catch:{ ProtoException -> 0x0014 }
            if (r2 != 0) goto L_0x0307
            java.lang.String r2 = r1.complaint     // Catch:{ ProtoException -> 0x0014 }
            j63 r7 = defpackage.j63.a(r2)     // Catch:{ ProtoException -> 0x0014 }
        L_0x0307:
            r13 = r7
            s42 r7 = new s42     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r11 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            r8 = r7
            r8.<init>(r9, r11, r13)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x0314:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x031c:
            ru.ok.tamtam.nano.Tasks$MsgDeleteRange r2 = new ru.ok.tamtam.nano.Tasks$MsgDeleteRange     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0343 }
            ru.ok.tamtam.nano.Tasks$MsgDeleteRange r1 = (ru.ok.tamtam.nano.Tasks.MsgDeleteRange) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0343 }
            m89 r12 = new m89     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.startTime     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.endTime     // Catch:{ ProtoException -> 0x0014 }
            xhd r2 = defpackage.md4.o     // Catch:{ ProtoException -> 0x0014 }
            int r1 = r1.itemTypeId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ ProtoException -> 0x0014 }
            md4 r11 = defpackage.xhd.g(r2, r1)     // Catch:{ ProtoException -> 0x0014 }
            r2 = r12
            r2.<init>(r3, r5, r7, r9, r11)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x007f
        L_0x0343:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x034b:
            ru.ok.tamtam.nano.Tasks$RemoveContactPhoto r2 = new ru.ok.tamtam.nano.Tasks$RemoveContactPhoto     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0361 }
            ru.ok.tamtam.nano.Tasks$RemoveContactPhoto r1 = (ru.ok.tamtam.nano.Tasks.RemoveContactPhoto) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0361 }
            a9c r7 = new a9c     // Catch:{ ProtoException -> 0x0014 }
            long r2 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r4 = r1.photoId     // Catch:{ ProtoException -> 0x0014 }
            r7.<init>(r2, r4)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x0361:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x0369:
            ru.ok.tamtam.nano.Tasks$FileDownloadCmd r2 = new ru.ok.tamtam.nano.Tasks$FileDownloadCmd     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0386 }
            ru.ok.tamtam.nano.Tasks$FileDownloadCmd r1 = (ru.ok.tamtam.nano.Tasks.FileDownloadCmd) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0386 }
            nd5 r11 = new nd5     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.fileId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r3 = r1.fileName     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.messageId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r4 = r1.attachLocalId     // Catch:{ ProtoException -> 0x0014 }
            r2 = r11
            r2.<init>(r3, r4, r5, r7, r9)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0154
        L_0x0386:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x038e:
            ru.ok.tamtam.nano.Tasks$ChatPinSetVisibility r2 = new ru.ok.tamtam.nano.Tasks$ChatPinSetVisibility     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x03a7 }
            ru.ok.tamtam.nano.Tasks$ChatPinSetVisibility r1 = (ru.ok.tamtam.nano.Tasks.ChatPinSetVisibility) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x03a7 }
            qj2 r8 = new qj2     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            boolean r7 = r1.show     // Catch:{ ProtoException -> 0x0014 }
            r2 = r8
            r2.<init>(r3, r5, r7)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x01d7
        L_0x03a7:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x03af:
            ru.ok.tamtam.nano.Tasks$ChatSubscribe r2 = new ru.ok.tamtam.nano.Tasks$ChatSubscribe     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x03c8 }
            ru.ok.tamtam.nano.Tasks$ChatSubscribe r1 = (ru.ok.tamtam.nano.Tasks.ChatSubscribe) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x03c8 }
            xn2 r8 = new xn2     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            boolean r7 = r1.subscribe     // Catch:{ ProtoException -> 0x0014 }
            r2 = r8
            r2.<init>(r3, r5, r7)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x01d7
        L_0x03c8:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x03d0:
            ru.ok.tamtam.nano.Tasks$ChatMembersUpdate r2 = new ru.ok.tamtam.nano.Tasks$ChatMembersUpdate     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0427 }
            ru.ok.tamtam.nano.Tasks$ChatMembersUpdate r1 = (ru.ok.tamtam.nano.Tasks.ChatMembersUpdate) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0427 }
            sh2 r2 = new sh2     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r11 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r3 = r1.operation     // Catch:{ ProtoException -> 0x0014 }
            r3.getClass()     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r6 = "remove"
            boolean r3 = r3.equals(r6)
            if (r3 != 0) goto L_0x03f2
            r13 = r5
            goto L_0x03f3
        L_0x03f2:
            r13 = r4
        L_0x03f3:
            long[] r3 = r1.userIds     // Catch:{ ProtoException -> 0x0014 }
            java.util.ArrayList r14 = defpackage.ek8.m(r3)     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r3 = r1.chatMemberType     // Catch:{ ProtoException -> 0x0014 }
            r3.getClass()     // Catch:{ ProtoException -> 0x0014 }
            ch2 r4 = defpackage.ch2.MEMBER     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r5 = "BLOCKED_MEMBER"
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0416
            java.lang.String r5 = "ADMIN"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x0412
            r15 = r4
            goto L_0x0419
        L_0x0412:
            ch2 r3 = defpackage.ch2.ADMIN     // Catch:{ ProtoException -> 0x0014 }
        L_0x0414:
            r15 = r3
            goto L_0x0419
        L_0x0416:
            ch2 r3 = defpackage.ch2.BLOCKED_MEMBER     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0414
        L_0x0419:
            boolean r1 = r1.showHistory     // Catch:{ ProtoException -> 0x0014 }
            r17 = 0
            r18 = 0
            r6 = r2
            r16 = r1
            r6.<init>(r7, r9, r11, r13, r14, r15, r16, r17, r18)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x010a
        L_0x0427:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x042f:
            ru.ok.tamtam.nano.Tasks$MsgSharePreview r2 = new ru.ok.tamtam.nano.Tasks$MsgSharePreview     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0448 }
            ru.ok.tamtam.nano.Tasks$MsgSharePreview r1 = (ru.ok.tamtam.nano.Tasks.MsgSharePreview) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0448 }
            j99 r8 = new j99     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r5 = r1.text     // Catch:{ ProtoException -> 0x0014 }
            long r6 = r1.messageId     // Catch:{ ProtoException -> 0x0014 }
            r2 = r8
            r2.<init>(r3, r5, r6)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x01d7
        L_0x0448:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x0450:
            ru.ok.tamtam.nano.Tasks$ChatCreate r6 = new ru.ok.tamtam.nano.Tasks$ChatCreate     // Catch:{ ProtoException -> 0x0014 }
            r6.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r6, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x04c6 }
            ru.ok.tamtam.nano.Tasks$ChatCreate r1 = (ru.ok.tamtam.nano.Tasks.ChatCreate) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x04c6 }
            u52 r17 = new u52     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r6 = r1.chatType     // Catch:{ ProtoException -> 0x0014 }
            boolean r6 = r1g.p(r6)     // Catch:{ ProtoException -> 0x0014 }
            if (r6 != 0) goto L_0x04b5
            java.lang.String r6 = r1.chatType     // Catch:{ ProtoException -> 0x0014 }
            boolean r11 = r1g.p(r6)     // Catch:{ ProtoException -> 0x0014 }
            if (r11 == 0) goto L_0x0473
        L_0x0471:
            r2 = r5
            goto L_0x04b3
        L_0x0473:
            r6.getClass()     // Catch:{ ProtoException -> 0x0014 }
            r11 = -1
            int r12 = r6.hashCode()
            switch(r12) {
                case 2067288: goto L_0x04a1;
                case 1456933091: goto L_0x0496;
                case 1796630840: goto L_0x048b;
                case 2016211272: goto L_0x0480;
                default: goto L_0x047e;
            }
        L_0x047e:
            r3 = r11
            goto L_0x04aa
        L_0x0480:
            java.lang.String r3 = "DIALOG"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x0489
            goto L_0x047e
        L_0x0489:
            r3 = r2
            goto L_0x04aa
        L_0x048b:
            java.lang.String r3 = "GROUP_CHAT"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x0494
            goto L_0x047e
        L_0x0494:
            r3 = r4
            goto L_0x04aa
        L_0x0496:
            java.lang.String r3 = "CHANNEL"
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L_0x049f
            goto L_0x047e
        L_0x049f:
            r3 = r5
            goto L_0x04aa
        L_0x04a1:
            java.lang.String r12 = "CHAT"
            boolean r6 = r6.equals(r12)
            if (r6 != 0) goto L_0x04aa
            goto L_0x047e
        L_0x04aa:
            switch(r3) {
                case 0: goto L_0x04b3;
                case 1: goto L_0x04b2;
                case 2: goto L_0x04b0;
                case 3: goto L_0x04ae;
                default: goto L_0x04ad;
            }
        L_0x04ad:
            goto L_0x0471
        L_0x04ae:
            r2 = r4
            goto L_0x04b3
        L_0x04b0:
            r2 = 5
            goto L_0x04b3
        L_0x04b2:
            r2 = 4
        L_0x04b3:
            r11 = r2
            goto L_0x04b6
        L_0x04b5:
            r11 = r3
        L_0x04b6:
            long r12 = r1.groupId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r14 = r1.startPayload     // Catch:{ ProtoException -> 0x0014 }
            long r1 = r1.cid     // Catch:{ ProtoException -> 0x0014 }
            r6 = r17
            r15 = r1
            r6.<init>(r7, r9, r11, r12, r14, r15)     // Catch:{ ProtoException -> 0x0014 }
            r7 = r17
            goto L_0x0606
        L_0x04c6:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x04ce:
            ru.ok.tamtam.nano.Tasks$ChatClose r2 = new ru.ok.tamtam.nano.Tasks$ChatClose     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x04e7 }
            ru.ok.tamtam.nano.Tasks$ChatClose r1 = (ru.ok.tamtam.nano.Tasks.ChatClose) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x04e7 }
            r42 r9 = new r42     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            r2 = r9
            r2.<init>(r3, r5, r7)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x00cd
        L_0x04e7:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x04ef:
            ru.ok.tamtam.nano.Tasks$ChannelLeave r2 = new ru.ok.tamtam.nano.Tasks$ChannelLeave     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0508 }
            ru.ok.tamtam.nano.Tasks$ChannelLeave r1 = (ru.ok.tamtam.nano.Tasks.ChannelLeave) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0508 }
            w92 r9 = new w92     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            r2 = r9
            r2.<init>(r3, r5, r7)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x00cd
        L_0x0508:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x0510:
            mp2 r7 = defpackage.lp2.a(r24)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x0516:
            java.lang.ref.WeakReference r2 = defpackage.n1d.Z     // Catch:{ ProtoException -> 0x0014 }
            n1d r7 = defpackage.m1d.a(r24)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x051e:
            ru.ok.tamtam.nano.Tasks$ChatMark r2 = new ru.ok.tamtam.nano.Tasks$ChatMark     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0540 }
            ru.ok.tamtam.nano.Tasks$ChatMark r1 = (ru.ok.tamtam.nano.Tasks.ChatMark) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0540 }
            qa2 r14 = new qa2     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.mark     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.messageId     // Catch:{ ProtoException -> 0x0014 }
            boolean r11 = r1.setAsUnread     // Catch:{ ProtoException -> 0x0014 }
            boolean r12 = r1.awaitChatInCache     // Catch:{ ProtoException -> 0x0014 }
            boolean r13 = r1.isReadReaction     // Catch:{ ProtoException -> 0x0014 }
            r2 = r14
            r2.<init>(r3, r5, r7, r9, r11, r12, r13)     // Catch:{ ProtoException -> 0x0014 }
            r7 = r14
            goto L_0x0606
        L_0x0540:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x0548:
            ru.ok.tamtam.nano.Tasks$VideoPlay r2 = new ru.ok.tamtam.nano.Tasks$VideoPlay     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0574 }
            ru.ok.tamtam.nano.Tasks$VideoPlay r1 = (ru.ok.tamtam.nano.Tasks.VideoPlay) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0574 }
            f7f r18 = new f7f     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.videoId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.messageServerId     // Catch:{ ProtoException -> 0x0014 }
            long r11 = r1.messageId     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r13 = r1.attachLocalId     // Catch:{ ProtoException -> 0x0014 }
            boolean r14 = r1.startDownload     // Catch:{ ProtoException -> 0x0014 }
            boolean r15 = r1.saveToGallery     // Catch:{ ProtoException -> 0x0014 }
            java.lang.String r1 = r1.token     // Catch:{ ProtoException -> 0x0014 }
            r17 = 0
            r2 = r18
            r16 = r1
            r2.<init>(r3, r5, r7, r9, r11, r13, r14, r15, r16, r17)     // Catch:{ ProtoException -> 0x0014 }
            r7 = r18
            goto L_0x0606
        L_0x0574:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x057c:
            ru.ok.tamtam.nano.Tasks$ChatClear r2 = new ru.ok.tamtam.nano.Tasks$ChatClear     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x0599 }
            ru.ok.tamtam.nano.Tasks$ChatClear r1 = (ru.ok.tamtam.nano.Tasks.ChatClear) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x0599 }
            p42 r12 = new p42     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.lastEventTime     // Catch:{ ProtoException -> 0x0014 }
            boolean r11 = r1.forAll     // Catch:{ ProtoException -> 0x0014 }
            r2 = r12
            r2.<init>(r3, r5, r7, r9, r11)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x007f
        L_0x0599:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x05a1:
            p89 r7 = defpackage.o89.a(r24)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x05a6:
            ru.ok.tamtam.nano.Tasks$ChatsList r2 = new ru.ok.tamtam.nano.Tasks$ChatsList     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x05c1 }
            ru.ok.tamtam.nano.Tasks$ChatsList r1 = (ru.ok.tamtam.nano.Tasks.ChatsList) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x05c1 }
            iq2 r10 = new iq2     // Catch:{ ProtoException -> 0x0014 }
            long r4 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r6 = r1.marker     // Catch:{ ProtoException -> 0x0014 }
            int r3 = r1.count     // Catch:{ ProtoException -> 0x0014 }
            long r8 = r1.chatsSync     // Catch:{ ProtoException -> 0x0014 }
            r2 = r10
            r2.<init>(r3, r4, r6, r8)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0294
        L_0x05c1:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x05c9:
            ru.ok.tamtam.nano.Tasks$ChatDelete r2 = new ru.ok.tamtam.nano.Tasks$ChatDelete     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>()     // Catch:{ ProtoException -> 0x0014 }
            gr8 r1 = gr8.mergeFrom(r2, r1)     // Catch:{ InvalidProtocolBufferNanoException -> 0x05e6 }
            ru.ok.tamtam.nano.Tasks$ChatDelete r1 = (ru.ok.tamtam.nano.Tasks.ChatDelete) r1     // Catch:{ InvalidProtocolBufferNanoException -> 0x05e6 }
            u62 r12 = new u62     // Catch:{ ProtoException -> 0x0014 }
            long r3 = r1.requestId     // Catch:{ ProtoException -> 0x0014 }
            long r5 = r1.chatId     // Catch:{ ProtoException -> 0x0014 }
            long r7 = r1.chatServerId     // Catch:{ ProtoException -> 0x0014 }
            long r9 = r1.lastEventTime     // Catch:{ ProtoException -> 0x0014 }
            boolean r11 = r1.forAll     // Catch:{ ProtoException -> 0x0014 }
            r2 = r12
            r2.<init>(r3, r5, r7, r9, r11)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x007f
        L_0x05e6:
            r0 = move-exception
            r1 = r0
            ru.ok.tamtam.nano.ProtoException r2 = new ru.ok.tamtam.nano.ProtoException     // Catch:{ ProtoException -> 0x0014 }
            r2.<init>(r1)     // Catch:{ ProtoException -> 0x0014 }
            throw r2     // Catch:{ ProtoException -> 0x0014 }
        L_0x05ee:
            ja3 r7 = defpackage.ja3.v(r24)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x05f3:
            on3 r7 = defpackage.nn3.a(r24)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x05f8:
            k5b r7 = defpackage.j5b.a(r24)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x05fd:
            d99 r7 = defpackage.d99.x(r24)     // Catch:{ ProtoException -> 0x0014 }
            goto L_0x0606
        L_0x0602:
            j89 r7 = defpackage.i89.a(r24)     // Catch:{ ProtoException -> 0x0014 }
        L_0x0606:
            return r7
        L_0x0607:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfc.d(una, byte[]):tna");
    }

    public final void a(long j) {
        mee b2 = b();
        aec aec = b2.a;
        aec.b();
        tdc tdc = b2.g;
        yz5 f = tdc.f();
        f.j(1, j);
        try {
            aec.c();
            f.n();
            aec.r();
            aec.l();
            tdc.u(f);
        } catch (Throwable th) {
            tdc.u(f);
            throw th;
        }
    }

    public final mee b() {
        return (mee) this.c.getValue();
    }

    public final List c(ArrayList arrayList) {
        return myc.U(myc.M(new vqe(new es(2, arrayList), new h87(1, this, bfc.class, "taskDbFromEntity", "taskDbFromEntity(Lone/me/sdk/tasks/db/TaskEntity;)Lone/me/sdk/tasks/db/TaskDb;", 0, 14)), x51.z0));
    }

    public final zde e(long j) {
        aee aee;
        mee b2 = b();
        m54 m54 = b2.c;
        pec a2 = pec.a(1, "SELECT * FROM tasks WHERE id = ?");
        a2.j(1, j);
        aec aec = b2.a;
        aec.b();
        Cursor o = aec.o(a2, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, ApiProtocol.KEY_ID);
            int o3 = gp0.o(o, "type");
            int o4 = gp0.o(o, "status");
            int o5 = gp0.o(o, "fails_count");
            int o6 = gp0.o(o, "depends_request_id");
            int o7 = gp0.o(o, "dependency_type");
            int o8 = gp0.o(o, "data");
            int o9 = gp0.o(o, "created_time");
            if (o.moveToFirst()) {
                long j2 = o.getLong(o2);
                int i = o.getInt(o3);
                m54.getClass();
                aee = new aee(j2, m54.t(i), m54.s(o.getInt(o4)), o.getInt(o5), o.getLong(o6), o.getInt(o7), o.isNull(o8) ? null : o.getBlob(o8), o.getLong(o9));
            } else {
                aee = null;
            }
            if (aee != null) {
                return f(aee);
            }
            return null;
        } finally {
            o.close();
            a2.m();
        }
    }

    public final zde f(aee aee) {
        tna d = d(aee.b, aee.g);
        if (d == null) {
            this.b.c(new Exception("task parse error! " + aee.b), true);
            a(aee.a);
            return null;
        }
        return new zde(aee.a, aee.c, aee.d, aee.e, aee.f, d);
    }
}
