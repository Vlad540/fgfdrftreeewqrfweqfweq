package defpackage;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* renamed from: j22  reason: default package */
public final class j22 implements Serializable {
    public final int A0;
    public final long B0;
    public final int C0;
    public final String D0;
    public final List E0;
    public final int F0;
    public final nj2 G0;
    public final String H0;
    public final x3a I0;
    public final int J0;
    public final zc6 K0;
    public final ym8 L0;
    public final boolean M0;
    public final boolean N0;
    public final boolean O0;
    public final long P0;
    public final Map Q0;
    public final y2f R0;
    public final lp0 S0;
    public final long T0;
    public final Map U0;
    public final long V0;
    public final boolean W0;
    public final long X;
    public final long X0;
    public final String Y;
    public final String Y0;
    public final String Z;
    public final long Z0;
    public final long a;
    public final long a1;
    public final String b;
    public final int b1;
    public final long c;
    public final int c1;
    public final Map o;
    public final String w0;
    public final ym8 x0;
    public final long y0;
    public final long z0;

    public j22(h22 h22) {
        this.a = h22.a;
        this.b1 = h22.N;
        this.b = h22.b;
        this.c = h22.c;
        this.o = h22.d;
        this.X = h22.e;
        this.Y = h22.f;
        this.Z = h22.g;
        this.w0 = h22.h;
        this.x0 = h22.i;
        this.y0 = h22.j;
        this.z0 = h22.k;
        this.A0 = h22.l;
        this.B0 = h22.m;
        this.C0 = h22.r;
        this.D0 = h22.s;
        this.E0 = h22.t;
        this.F0 = h22.u;
        this.G0 = h22.v;
        this.c1 = h22.O;
        this.H0 = h22.n;
        this.I0 = h22.o;
        this.J0 = h22.p;
        this.K0 = h22.q;
        this.L0 = h22.w;
        this.M0 = h22.x;
        this.N0 = h22.y;
        this.O0 = h22.z;
        this.P0 = h22.A;
        this.Q0 = h22.B;
        this.R0 = h22.C;
        this.S0 = new lp0(h22.D, h22.E);
        this.T0 = h22.F;
        this.U0 = h22.G;
        this.V0 = h22.H;
        this.W0 = h22.I;
        this.X0 = h22.J;
        this.Y0 = h22.K;
        this.Z0 = h22.L;
        this.a1 = h22.M;
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [h22, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.j22 a(defpackage.ws8 r28) {
        /*
            r1 = r28
            r2 = 26
            r3 = 16
            r7 = 8
            r10 = 0
            r11 = 1
            h22 r12 = new h22
            r12.<init>()
            int r13 = r28.x0()
            r14 = r10
        L_0x0014:
            if (r14 >= r13) goto L_0x096c
            java.lang.String r0 = r28.z0()
            r0.getClass()
            r15 = 0
            java.lang.String r4 = "ServerPayload/PayloadCatching"
            java.lang.String r5 = "payloadCatching catch error"
            r8 = 0
            int r16 = r0.hashCode()
            switch(r16) {
                case -2053454177: goto L_0x0244;
                case -1979713632: goto L_0x0238;
                case -1978702690: goto L_0x022c;
                case -1867885268: goto L_0x0220;
                case -1762954607: goto L_0x0214;
                case -1724546052: goto L_0x0208;
                case -1546399601: goto L_0x01fc;
                case -1502776474: goto L_0x01f0;
                case -1455877999: goto L_0x01e3;
                case -1423461020: goto L_0x01d5;
                case -1422235900: goto L_0x01c7;
                case -1401749737: goto L_0x01b9;
                case -1249474914: goto L_0x01ab;
                case -1148295641: goto L_0x019d;
                case -1113254034: goto L_0x018f;
                case -1057446789: goto L_0x0181;
                case -951297470: goto L_0x0174;
                case -892481550: goto L_0x0166;
                case -816024198: goto L_0x0158;
                case -805278779: goto L_0x014a;
                case -775459091: goto L_0x013c;
                case -615513399: goto L_0x012e;
                case -483209263: goto L_0x0120;
                case -354744795: goto L_0x0112;
                case -26075201: goto L_0x0104;
                case -15797038: goto L_0x00f6;
                case 3355: goto L_0x00e9;
                case 98494: goto L_0x00db;
                case 3321850: goto L_0x00cd;
                case 3575610: goto L_0x00bf;
                case 106164915: goto L_0x00b1;
                case 110371416: goto L_0x00a3;
                case 278143171: goto L_0x0096;
                case 572260623: goto L_0x0089;
                case 696411462: goto L_0x007c;
                case 794652428: goto L_0x006f;
                case 979634893: goto L_0x0062;
                case 1028554472: goto L_0x0055;
                case 1075866255: goto L_0x0048;
                case 1707006687: goto L_0x003b;
                case 1867394383: goto L_0x002e;
                default: goto L_0x002b;
            }
        L_0x002b:
            r0 = -1
            goto L_0x024f
        L_0x002e:
            java.lang.String r6 = "participantsCount"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0037
            goto L_0x002b
        L_0x0037:
            r0 = 40
            goto L_0x024f
        L_0x003b:
            java.lang.String r6 = "lastReaction"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0044
            goto L_0x002b
        L_0x0044:
            r0 = 39
            goto L_0x024f
        L_0x0048:
            java.lang.String r6 = "prevMessageId"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0051
            goto L_0x002b
        L_0x0051:
            r0 = 38
            goto L_0x024f
        L_0x0055:
            java.lang.String r6 = "created"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x005e
            goto L_0x002b
        L_0x005e:
            r0 = 37
            goto L_0x024f
        L_0x0062:
            java.lang.String r6 = "markedAsUnread"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x006b
            goto L_0x002b
        L_0x006b:
            r0 = 36
            goto L_0x024f
        L_0x006f:
            java.lang.String r6 = "newMessages"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0078
            goto L_0x002b
        L_0x0078:
            r0 = 35
            goto L_0x024f
        L_0x007c:
            java.lang.String r6 = "hasBots"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0085
            goto L_0x002b
        L_0x0085:
            r0 = 34
            goto L_0x024f
        L_0x0089:
            java.lang.String r6 = "pinnedMessage"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0092
            goto L_0x002b
        L_0x0092:
            r0 = 33
            goto L_0x024f
        L_0x0096:
            java.lang.String r6 = "blockedParticipantsCount"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x009f
            goto L_0x002b
        L_0x009f:
            r0 = 32
            goto L_0x024f
        L_0x00a3:
            java.lang.String r6 = "title"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x00ad
            goto L_0x002b
        L_0x00ad:
            r0 = 31
            goto L_0x024f
        L_0x00b1:
            java.lang.String r6 = "owner"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x00bb
            goto L_0x002b
        L_0x00bb:
            r0 = 30
            goto L_0x024f
        L_0x00bf:
            java.lang.String r6 = "type"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x00c9
            goto L_0x002b
        L_0x00c9:
            r0 = 29
            goto L_0x024f
        L_0x00cd:
            java.lang.String r6 = "link"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x00d7
            goto L_0x002b
        L_0x00d7:
            r0 = 28
            goto L_0x024f
        L_0x00db:
            java.lang.String r6 = "cid"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x00e5
            goto L_0x002b
        L_0x00e5:
            r0 = 27
            goto L_0x024f
        L_0x00e9:
            java.lang.String r6 = "id"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x00f3
            goto L_0x002b
        L_0x00f3:
            r0 = r2
            goto L_0x024f
        L_0x00f6:
            java.lang.String r6 = "liveLocationMessageIds"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0100
            goto L_0x002b
        L_0x0100:
            r0 = 25
            goto L_0x024f
        L_0x0104:
            java.lang.String r6 = "lastFireDelayedErrorTime"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x010e
            goto L_0x002b
        L_0x010e:
            r0 = 24
            goto L_0x024f
        L_0x0112:
            java.lang.String r6 = "baseIconUrl"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x011c
            goto L_0x002b
        L_0x011c:
            r0 = 23
            goto L_0x024f
        L_0x0120:
            java.lang.String r6 = "isSuspended"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x012a
            goto L_0x002b
        L_0x012a:
            r0 = 22
            goto L_0x024f
        L_0x012e:
            java.lang.String r6 = "modified"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0138
            goto L_0x002b
        L_0x0138:
            r0 = 21
            goto L_0x024f
        L_0x013c:
            java.lang.String r6 = "hidePinnedMessage"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0146
            goto L_0x002b
        L_0x0146:
            r0 = 20
            goto L_0x024f
        L_0x014a:
            java.lang.String r6 = "groupChatInfo"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0154
            goto L_0x002b
        L_0x0154:
            r0 = 19
            goto L_0x024f
        L_0x0158:
            java.lang.String r6 = "lastReactedMessageId"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0162
            goto L_0x002b
        L_0x0162:
            r0 = 18
            goto L_0x024f
        L_0x0166:
            java.lang.String r6 = "status"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0170
            goto L_0x002b
        L_0x0170:
            r0 = 17
            goto L_0x024f
        L_0x0174:
            java.lang.String r6 = "lastDelayedUpdateTime"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x017e
            goto L_0x002b
        L_0x017e:
            r0 = r3
            goto L_0x024f
        L_0x0181:
            java.lang.String r6 = "unreadReply"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x018b
            goto L_0x002b
        L_0x018b:
            r0 = 15
            goto L_0x024f
        L_0x018f:
            java.lang.String r6 = "lastMentionMessageId"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0199
            goto L_0x002b
        L_0x0199:
            r0 = 14
            goto L_0x024f
        L_0x019d:
            java.lang.String r6 = "restrictions"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x01a7
            goto L_0x002b
        L_0x01a7:
            r0 = 13
            goto L_0x024f
        L_0x01ab:
            java.lang.String r6 = "options"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x01b5
            goto L_0x002b
        L_0x01b5:
            r0 = 12
            goto L_0x024f
        L_0x01b9:
            java.lang.String r6 = "joinTime"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x01c3
            goto L_0x002b
        L_0x01c3:
            r0 = 11
            goto L_0x024f
        L_0x01c7:
            java.lang.String r6 = "admins"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x01d1
            goto L_0x002b
        L_0x01d1:
            r0 = 10
            goto L_0x024f
        L_0x01d5:
            java.lang.String r6 = "access"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x01df
            goto L_0x002b
        L_0x01df:
            r0 = 9
            goto L_0x024f
        L_0x01e3:
            java.lang.String r6 = "lastMessage"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x01ed
            goto L_0x002b
        L_0x01ed:
            r0 = r7
            goto L_0x024f
        L_0x01f0:
            java.lang.String r6 = "unreadPin"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x01fa
            goto L_0x002b
        L_0x01fa:
            r0 = 7
            goto L_0x024f
        L_0x01fc:
            java.lang.String r6 = "adminParticipants"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0206
            goto L_0x002b
        L_0x0206:
            r0 = 6
            goto L_0x024f
        L_0x0208:
            java.lang.String r6 = "description"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0212
            goto L_0x002b
        L_0x0212:
            r0 = 5
            goto L_0x024f
        L_0x0214:
            java.lang.String r6 = "lastEventTime"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x021e
            goto L_0x002b
        L_0x021e:
            r0 = 4
            goto L_0x024f
        L_0x0220:
            java.lang.String r6 = "subject"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x022a
            goto L_0x002b
        L_0x022a:
            r0 = 3
            goto L_0x024f
        L_0x022c:
            java.lang.String r6 = "videoConversation"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0236
            goto L_0x002b
        L_0x0236:
            r0 = 2
            goto L_0x024f
        L_0x0238:
            java.lang.String r6 = "participants"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x0242
            goto L_0x002b
        L_0x0242:
            r0 = r11
            goto L_0x024f
        L_0x0244:
            java.lang.String r6 = "baseRawIconUrl"
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x024e
            goto L_0x002b
        L_0x024e:
            r0 = r10
        L_0x024f:
            switch(r0) {
                case 0: goto L_0x0961;
                case 1: goto L_0x0930;
                case 2: goto L_0x0929;
                case 3: goto L_0x080c;
                case 4: goto L_0x0804;
                case 5: goto L_0x07fc;
                case 6: goto L_0x07c7;
                case 7: goto L_0x07bf;
                case 8: goto L_0x07b7;
                case 9: goto L_0x0797;
                case 10: goto L_0x078f;
                case 11: goto L_0x0787;
                case 12: goto L_0x03ab;
                case 13: goto L_0x03a3;
                case 14: goto L_0x039b;
                case 15: goto L_0x0393;
                case 16: goto L_0x038b;
                case 17: goto L_0x0383;
                case 18: goto L_0x037b;
                case 19: goto L_0x0373;
                case 20: goto L_0x036b;
                case 21: goto L_0x0363;
                case 22: goto L_0x035b;
                case 23: goto L_0x0353;
                case 24: goto L_0x034b;
                case 25: goto L_0x0319;
                case 26: goto L_0x0311;
                case 27: goto L_0x0309;
                case 28: goto L_0x0301;
                case 29: goto L_0x02af;
                case 30: goto L_0x02a7;
                case 31: goto L_0x029f;
                case 32: goto L_0x0297;
                case 33: goto L_0x028f;
                case 34: goto L_0x0287;
                case 35: goto L_0x027f;
                case 36: goto L_0x0277;
                case 37: goto L_0x026f;
                case 38: goto L_0x0267;
                case 39: goto L_0x025f;
                case 40: goto L_0x0257;
                default: goto L_0x0252;
            }
        L_0x0252:
            r28.z()
            goto L_0x0967
        L_0x0257:
            int r0 = jjd.I(r28)
            r12.r = r0
            goto L_0x0967
        L_0x025f:
            java.lang.String r0 = jjd.M(r28)
            r12.K = r0
            goto L_0x0967
        L_0x0267:
            long r4 = jjd.J(r1, r8)
            r12.m = r4
            goto L_0x0967
        L_0x026f:
            long r4 = r28.w0()
            r12.e = r4
            goto L_0x0967
        L_0x0277:
            boolean r0 = jjd.E(r28)
            r12.I = r0
            goto L_0x0967
        L_0x027f:
            int r0 = r28.v0()
            r12.l = r0
            goto L_0x0967
        L_0x0287:
            boolean r0 = jjd.E(r28)
            r12.D = r0
            goto L_0x0967
        L_0x028f:
            ym8 r0 = hhd.H(r28)
            r12.w = r0
            goto L_0x0967
        L_0x0297:
            int r0 = jjd.I(r28)
            r12.u = r0
            goto L_0x0967
        L_0x029f:
            java.lang.String r0 = jjd.M(r28)
            r12.f = r0
            goto L_0x0967
        L_0x02a7:
            long r4 = r28.w0()
            r12.c = r4
            goto L_0x0967
        L_0x02af:
            java.lang.String r0 = r28.z0()
            boolean r4 = r1g.p(r0)
            if (r4 == 0) goto L_0x02bb
        L_0x02b9:
            r0 = r11
            goto L_0x02fd
        L_0x02bb:
            r0.getClass()
            int r4 = r0.hashCode()
            switch(r4) {
                case 2067288: goto L_0x02e8;
                case 1456933091: goto L_0x02dd;
                case 1796630840: goto L_0x02d2;
                case 2016211272: goto L_0x02c7;
                default: goto L_0x02c5;
            }
        L_0x02c5:
            r0 = -1
            goto L_0x02f2
        L_0x02c7:
            java.lang.String r4 = "DIALOG"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x02d0
            goto L_0x02c5
        L_0x02d0:
            r0 = 3
            goto L_0x02f2
        L_0x02d2:
            java.lang.String r4 = "GROUP_CHAT"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x02db
            goto L_0x02c5
        L_0x02db:
            r0 = 2
            goto L_0x02f2
        L_0x02dd:
            java.lang.String r4 = "CHANNEL"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x02e6
            goto L_0x02c5
        L_0x02e6:
            r0 = r11
            goto L_0x02f2
        L_0x02e8:
            java.lang.String r4 = "CHAT"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x02f1
            goto L_0x02c5
        L_0x02f1:
            r0 = r10
        L_0x02f2:
            switch(r0) {
                case 0: goto L_0x02fc;
                case 1: goto L_0x02fa;
                case 2: goto L_0x02f8;
                case 3: goto L_0x02f6;
                default: goto L_0x02f5;
            }
        L_0x02f5:
            goto L_0x02b9
        L_0x02f6:
            r0 = 2
            goto L_0x02fd
        L_0x02f8:
            r0 = 5
            goto L_0x02fd
        L_0x02fa:
            r0 = 4
            goto L_0x02fd
        L_0x02fc:
            r0 = 3
        L_0x02fd:
            r12.N = r0
            goto L_0x0967
        L_0x0301:
            java.lang.String r0 = r28.z0()
            r12.n = r0
            goto L_0x0967
        L_0x0309:
            long r4 = r28.w0()
            r12.j = r4
            goto L_0x0967
        L_0x0311:
            long r4 = r28.w0()
            r12.a = r4
            goto L_0x0967
        L_0x0319:
            sp8 r0 = r28.n()
            int r0 = r0.a()
            if (r0 != r7) goto L_0x0344
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            int r0 = r28.x0()
            r4 = r10
        L_0x032d:
            if (r4 >= r0) goto L_0x0347
            long r5 = jjd.J(r1, r8)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            long r17 = jjd.J(r1, r8)
            java.lang.Long r6 = java.lang.Long.valueOf(r17)
            r15.put(r5, r6)
            int r4 = r4 + r11
            goto L_0x032d
        L_0x0344:
            r28.z()
        L_0x0347:
            r12.G = r15
            goto L_0x0967
        L_0x034b:
            long r4 = jjd.J(r1, r8)
            r12.M = r4
            goto L_0x0967
        L_0x0353:
            java.lang.String r0 = jjd.M(r28)
            r12.g = r0
            goto L_0x0967
        L_0x035b:
            boolean r0 = jjd.E(r28)
            r12.E = r0
            goto L_0x0967
        L_0x0363:
            long r4 = jjd.J(r1, r8)
            r12.F = r4
            goto L_0x0967
        L_0x036b:
            boolean r0 = jjd.E(r28)
            r12.x = r0
            goto L_0x0967
        L_0x0373:
            zc6 r0 = defpackage.zc6.a(r28)
            r12.q = r0
            goto L_0x0967
        L_0x037b:
            long r4 = jjd.J(r1, r8)
            r12.J = r4
            goto L_0x0967
        L_0x0383:
            java.lang.String r0 = r28.z0()
            r12.b = r0
            goto L_0x0967
        L_0x038b:
            long r4 = jjd.J(r1, r8)
            r12.L = r4
            goto L_0x0967
        L_0x0393:
            boolean r0 = jjd.E(r28)
            r12.y = r0
            goto L_0x0967
        L_0x039b:
            long r4 = jjd.J(r1, r8)
            r12.H = r4
            goto L_0x0967
        L_0x03a3:
            int r0 = jjd.I(r28)
            r12.p = r0
            goto L_0x0967
        L_0x03ab:
            int r0 = jjd.K(r28)     // Catch:{ all -> 0x03b1 }
            r6 = r0
            goto L_0x03e1
        L_0x03b1:
            r0 = move-exception
            r6 = r0
            udd.S(r4, r5, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x03bc:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x03cf
            java.lang.Object r8 = r0.next()
            ny9 r8 = (ny9) r8
            r8.getClass()
            ny9.a(r6)
            goto L_0x03bc
        L_0x03cf:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x03e0
            if (r0 == r11) goto L_0x03df
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03df:
            throw r6
        L_0x03e0:
            r6 = r10
        L_0x03e1:
            r8 = r10
            r18 = r8
            r19 = r18
            r20 = r19
            r21 = r20
            r22 = r21
            r23 = r22
            r24 = r23
            r25 = r24
            r26 = r25
            r27 = r26
        L_0x03f6:
            if (r8 >= r6) goto L_0x077c
            java.lang.String r0 = jjd.M(r28)     // Catch:{ all -> 0x03fd }
            goto L_0x0430
        L_0x03fd:
            r0 = move-exception
            r9 = r0
            udd.S(r4, r5, r9)     // Catch:{ all -> 0x041b }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a     // Catch:{ all -> 0x041b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x041b }
        L_0x0408:
            boolean r17 = r0.hasNext()     // Catch:{ all -> 0x041b }
            if (r17 == 0) goto L_0x041e
            java.lang.Object r17 = r0.next()     // Catch:{ all -> 0x041b }
            ny9 r17 = (ny9) r17     // Catch:{ all -> 0x041b }
            r17.getClass()     // Catch:{ all -> 0x041b }
            ny9.a(r9)     // Catch:{ all -> 0x041b }
            goto L_0x0408
        L_0x041b:
            r0 = move-exception
            goto L_0x074f
        L_0x041e:
            int r0 = defpackage.m4b.a     // Catch:{ all -> 0x041b }
            int r0 = hr1.t(r0)     // Catch:{ all -> 0x041b }
            if (r0 == 0) goto L_0x042f
            if (r0 == r11) goto L_0x042e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x041b }
            r0.<init>()     // Catch:{ all -> 0x041b }
            throw r0     // Catch:{ all -> 0x041b }
        L_0x042e:
            throw r9     // Catch:{ all -> 0x041b }
        L_0x042f:
            r0 = r15
        L_0x0430:
            if (r0 == 0) goto L_0x074c
            int r9 = r0.hashCode()     // Catch:{ all -> 0x046b }
            switch(r9) {
                case -1588574526: goto L_0x06aa;
                case -1351652841: goto L_0x0666;
                case -985184211: goto L_0x0621;
                case -314593712: goto L_0x05dc;
                case 2524: goto L_0x0597;
                case 17337067: goto L_0x0552;
                case 247284269: goto L_0x050d;
                case 513557962: goto L_0x04c8;
                case 687393168: goto L_0x0483;
                case 861231443: goto L_0x043b;
                default: goto L_0x0439;
            }     // Catch:{ all -> 0x046b }
        L_0x0439:
            goto L_0x06b2
        L_0x043b:
            java.lang.String r9 = "ONLY_OWNER_CAN_CHANGE_ICON_TITLE"
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x046b }
            if (r0 != 0) goto L_0x0445
            goto L_0x06b2
        L_0x0445:
            boolean r0 = jjd.E(r28)     // Catch:{ all -> 0x044d }
            r19 = r0
            goto L_0x074c
        L_0x044d:
            r0 = move-exception
            r9 = r0
            udd.S(r4, r5, r9)     // Catch:{ all -> 0x046b }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a     // Catch:{ all -> 0x046b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046b }
        L_0x0458:
            boolean r17 = r0.hasNext()     // Catch:{ all -> 0x046b }
            if (r17 == 0) goto L_0x046e
            java.lang.Object r17 = r0.next()     // Catch:{ all -> 0x046b }
            ny9 r17 = (ny9) r17     // Catch:{ all -> 0x046b }
            r17.getClass()     // Catch:{ all -> 0x046b }
            ny9.a(r9)     // Catch:{ all -> 0x046b }
            goto L_0x0458
        L_0x046b:
            r0 = move-exception
            goto L_0x071f
        L_0x046e:
            int r0 = defpackage.m4b.a     // Catch:{ all -> 0x046b }
            int r0 = hr1.t(r0)     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x047f
            if (r0 == r11) goto L_0x047e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046b }
            r0.<init>()     // Catch:{ all -> 0x046b }
            throw r0     // Catch:{ all -> 0x046b }
        L_0x047e:
            throw r9     // Catch:{ all -> 0x046b }
        L_0x047f:
            r19 = r10
            goto L_0x074c
        L_0x0483:
            java.lang.String r9 = "ONLY_ADMIN_CAN_CALL"
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x046b }
            if (r0 != 0) goto L_0x048d
            goto L_0x06b2
        L_0x048d:
            boolean r0 = jjd.E(r28)     // Catch:{ all -> 0x0495 }
            r24 = r0
            goto L_0x074c
        L_0x0495:
            r0 = move-exception
            r9 = r0
            udd.S(r4, r5, r9)     // Catch:{ all -> 0x046b }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a     // Catch:{ all -> 0x046b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046b }
        L_0x04a0:
            boolean r17 = r0.hasNext()     // Catch:{ all -> 0x046b }
            if (r17 == 0) goto L_0x04b3
            java.lang.Object r17 = r0.next()     // Catch:{ all -> 0x046b }
            ny9 r17 = (ny9) r17     // Catch:{ all -> 0x046b }
            r17.getClass()     // Catch:{ all -> 0x046b }
            ny9.a(r9)     // Catch:{ all -> 0x046b }
            goto L_0x04a0
        L_0x04b3:
            int r0 = defpackage.m4b.a     // Catch:{ all -> 0x046b }
            int r0 = hr1.t(r0)     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x04c4
            if (r0 == r11) goto L_0x04c3
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046b }
            r0.<init>()     // Catch:{ all -> 0x046b }
            throw r0     // Catch:{ all -> 0x046b }
        L_0x04c3:
            throw r9     // Catch:{ all -> 0x046b }
        L_0x04c4:
            r24 = r10
            goto L_0x074c
        L_0x04c8:
            java.lang.String r9 = "ONLY_ADMIN_CAN_ADD_MEMBER"
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x046b }
            if (r0 != 0) goto L_0x04d2
            goto L_0x06b2
        L_0x04d2:
            boolean r0 = jjd.E(r28)     // Catch:{ all -> 0x04da }
            r21 = r0
            goto L_0x074c
        L_0x04da:
            r0 = move-exception
            r9 = r0
            udd.S(r4, r5, r9)     // Catch:{ all -> 0x046b }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a     // Catch:{ all -> 0x046b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046b }
        L_0x04e5:
            boolean r17 = r0.hasNext()     // Catch:{ all -> 0x046b }
            if (r17 == 0) goto L_0x04f8
            java.lang.Object r17 = r0.next()     // Catch:{ all -> 0x046b }
            ny9 r17 = (ny9) r17     // Catch:{ all -> 0x046b }
            r17.getClass()     // Catch:{ all -> 0x046b }
            ny9.a(r9)     // Catch:{ all -> 0x046b }
            goto L_0x04e5
        L_0x04f8:
            int r0 = defpackage.m4b.a     // Catch:{ all -> 0x046b }
            int r0 = hr1.t(r0)     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x0509
            if (r0 == r11) goto L_0x0508
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046b }
            r0.<init>()     // Catch:{ all -> 0x046b }
            throw r0     // Catch:{ all -> 0x046b }
        L_0x0508:
            throw r9     // Catch:{ all -> 0x046b }
        L_0x0509:
            r21 = r10
            goto L_0x074c
        L_0x050d:
            java.lang.String r9 = "SIGN_ADMIN"
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x046b }
            if (r0 != 0) goto L_0x0517
            goto L_0x06b2
        L_0x0517:
            boolean r0 = jjd.E(r28)     // Catch:{ all -> 0x051f }
            r18 = r0
            goto L_0x074c
        L_0x051f:
            r0 = move-exception
            r9 = r0
            udd.S(r4, r5, r9)     // Catch:{ all -> 0x046b }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a     // Catch:{ all -> 0x046b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046b }
        L_0x052a:
            boolean r17 = r0.hasNext()     // Catch:{ all -> 0x046b }
            if (r17 == 0) goto L_0x053d
            java.lang.Object r17 = r0.next()     // Catch:{ all -> 0x046b }
            ny9 r17 = (ny9) r17     // Catch:{ all -> 0x046b }
            r17.getClass()     // Catch:{ all -> 0x046b }
            ny9.a(r9)     // Catch:{ all -> 0x046b }
            goto L_0x052a
        L_0x053d:
            int r0 = defpackage.m4b.a     // Catch:{ all -> 0x046b }
            int r0 = hr1.t(r0)     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x054e
            if (r0 == r11) goto L_0x054d
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046b }
            r0.<init>()     // Catch:{ all -> 0x046b }
            throw r0     // Catch:{ all -> 0x046b }
        L_0x054d:
            throw r9     // Catch:{ all -> 0x046b }
        L_0x054e:
            r18 = r10
            goto L_0x074c
        L_0x0552:
            java.lang.String r9 = "OFFICIAL"
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x046b }
            if (r0 != 0) goto L_0x055c
            goto L_0x06b2
        L_0x055c:
            boolean r0 = jjd.E(r28)     // Catch:{ all -> 0x0564 }
            r20 = r0
            goto L_0x074c
        L_0x0564:
            r0 = move-exception
            r9 = r0
            udd.S(r4, r5, r9)     // Catch:{ all -> 0x046b }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a     // Catch:{ all -> 0x046b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046b }
        L_0x056f:
            boolean r17 = r0.hasNext()     // Catch:{ all -> 0x046b }
            if (r17 == 0) goto L_0x0582
            java.lang.Object r17 = r0.next()     // Catch:{ all -> 0x046b }
            ny9 r17 = (ny9) r17     // Catch:{ all -> 0x046b }
            r17.getClass()     // Catch:{ all -> 0x046b }
            ny9.a(r9)     // Catch:{ all -> 0x046b }
            goto L_0x056f
        L_0x0582:
            int r0 = defpackage.m4b.a     // Catch:{ all -> 0x046b }
            int r0 = hr1.t(r0)     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x0593
            if (r0 == r11) goto L_0x0592
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046b }
            r0.<init>()     // Catch:{ all -> 0x046b }
            throw r0     // Catch:{ all -> 0x046b }
        L_0x0592:
            throw r9     // Catch:{ all -> 0x046b }
        L_0x0593:
            r20 = r10
            goto L_0x074c
        L_0x0597:
            java.lang.String r9 = "OK"
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x046b }
            if (r0 != 0) goto L_0x05a1
            goto L_0x06b2
        L_0x05a1:
            boolean r0 = jjd.E(r28)     // Catch:{ all -> 0x05a9 }
            r23 = r0
            goto L_0x074c
        L_0x05a9:
            r0 = move-exception
            r9 = r0
            udd.S(r4, r5, r9)     // Catch:{ all -> 0x046b }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a     // Catch:{ all -> 0x046b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046b }
        L_0x05b4:
            boolean r17 = r0.hasNext()     // Catch:{ all -> 0x046b }
            if (r17 == 0) goto L_0x05c7
            java.lang.Object r17 = r0.next()     // Catch:{ all -> 0x046b }
            ny9 r17 = (ny9) r17     // Catch:{ all -> 0x046b }
            r17.getClass()     // Catch:{ all -> 0x046b }
            ny9.a(r9)     // Catch:{ all -> 0x046b }
            goto L_0x05b4
        L_0x05c7:
            int r0 = defpackage.m4b.a     // Catch:{ all -> 0x046b }
            int r0 = hr1.t(r0)     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x05d8
            if (r0 == r11) goto L_0x05d7
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046b }
            r0.<init>()     // Catch:{ all -> 0x046b }
            throw r0     // Catch:{ all -> 0x046b }
        L_0x05d7:
            throw r9     // Catch:{ all -> 0x046b }
        L_0x05d8:
            r23 = r10
            goto L_0x074c
        L_0x05dc:
            java.lang.String r9 = "ALL_CAN_PIN_MESSAGE"
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x046b }
            if (r0 != 0) goto L_0x05e6
            goto L_0x06b2
        L_0x05e6:
            boolean r0 = jjd.E(r28)     // Catch:{ all -> 0x05ee }
            r22 = r0
            goto L_0x074c
        L_0x05ee:
            r0 = move-exception
            r9 = r0
            udd.S(r4, r5, r9)     // Catch:{ all -> 0x046b }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a     // Catch:{ all -> 0x046b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046b }
        L_0x05f9:
            boolean r17 = r0.hasNext()     // Catch:{ all -> 0x046b }
            if (r17 == 0) goto L_0x060c
            java.lang.Object r17 = r0.next()     // Catch:{ all -> 0x046b }
            ny9 r17 = (ny9) r17     // Catch:{ all -> 0x046b }
            r17.getClass()     // Catch:{ all -> 0x046b }
            ny9.a(r9)     // Catch:{ all -> 0x046b }
            goto L_0x05f9
        L_0x060c:
            int r0 = defpackage.m4b.a     // Catch:{ all -> 0x046b }
            int r0 = hr1.t(r0)     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x061d
            if (r0 == r11) goto L_0x061c
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046b }
            r0.<init>()     // Catch:{ all -> 0x046b }
            throw r0     // Catch:{ all -> 0x046b }
        L_0x061c:
            throw r9     // Catch:{ all -> 0x046b }
        L_0x061d:
            r22 = r10
            goto L_0x074c
        L_0x0621:
            java.lang.String r9 = "SENT_BY_PHONE"
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x046b }
            if (r0 != 0) goto L_0x062b
            goto L_0x06b2
        L_0x062b:
            boolean r0 = jjd.E(r28)     // Catch:{ all -> 0x0633 }
            r25 = r0
            goto L_0x074c
        L_0x0633:
            r0 = move-exception
            r9 = r0
            udd.S(r4, r5, r9)     // Catch:{ all -> 0x046b }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a     // Catch:{ all -> 0x046b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046b }
        L_0x063e:
            boolean r17 = r0.hasNext()     // Catch:{ all -> 0x046b }
            if (r17 == 0) goto L_0x0651
            java.lang.Object r17 = r0.next()     // Catch:{ all -> 0x046b }
            ny9 r17 = (ny9) r17     // Catch:{ all -> 0x046b }
            r17.getClass()     // Catch:{ all -> 0x046b }
            ny9.a(r9)     // Catch:{ all -> 0x046b }
            goto L_0x063e
        L_0x0651:
            int r0 = defpackage.m4b.a     // Catch:{ all -> 0x046b }
            int r0 = hr1.t(r0)     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x0662
            if (r0 == r11) goto L_0x0661
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046b }
            r0.<init>()     // Catch:{ all -> 0x046b }
            throw r0     // Catch:{ all -> 0x046b }
        L_0x0661:
            throw r9     // Catch:{ all -> 0x046b }
        L_0x0662:
            r25 = r10
            goto L_0x074c
        L_0x0666:
            java.lang.String r9 = "MEMBERS_CAN_SEE_PRIVATE_LINK"
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x046b }
            if (r0 != 0) goto L_0x066f
            goto L_0x06b2
        L_0x066f:
            boolean r0 = jjd.E(r28)     // Catch:{ all -> 0x0677 }
            r27 = r0
            goto L_0x074c
        L_0x0677:
            r0 = move-exception
            r9 = r0
            udd.S(r4, r5, r9)     // Catch:{ all -> 0x046b }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a     // Catch:{ all -> 0x046b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046b }
        L_0x0682:
            boolean r17 = r0.hasNext()     // Catch:{ all -> 0x046b }
            if (r17 == 0) goto L_0x0695
            java.lang.Object r17 = r0.next()     // Catch:{ all -> 0x046b }
            ny9 r17 = (ny9) r17     // Catch:{ all -> 0x046b }
            r17.getClass()     // Catch:{ all -> 0x046b }
            ny9.a(r9)     // Catch:{ all -> 0x046b }
            goto L_0x0682
        L_0x0695:
            int r0 = defpackage.m4b.a     // Catch:{ all -> 0x046b }
            int r0 = hr1.t(r0)     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x06a6
            if (r0 == r11) goto L_0x06a5
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046b }
            r0.<init>()     // Catch:{ all -> 0x046b }
            throw r0     // Catch:{ all -> 0x046b }
        L_0x06a5:
            throw r9     // Catch:{ all -> 0x046b }
        L_0x06a6:
            r27 = r10
            goto L_0x074c
        L_0x06aa:
            java.lang.String r9 = "SERVICE_CHAT"
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x046b }
            if (r0 != 0) goto L_0x06e6
        L_0x06b2:
            r28.z()     // Catch:{ all -> 0x06b7 }
            goto L_0x074c
        L_0x06b7:
            r0 = move-exception
            r9 = r0
            udd.S(r4, r5, r9)     // Catch:{ all -> 0x046b }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a     // Catch:{ all -> 0x046b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046b }
        L_0x06c2:
            boolean r17 = r0.hasNext()     // Catch:{ all -> 0x046b }
            if (r17 == 0) goto L_0x06d5
            java.lang.Object r17 = r0.next()     // Catch:{ all -> 0x046b }
            ny9 r17 = (ny9) r17     // Catch:{ all -> 0x046b }
            r17.getClass()     // Catch:{ all -> 0x046b }
            ny9.a(r9)     // Catch:{ all -> 0x046b }
            goto L_0x06c2
        L_0x06d5:
            int r0 = defpackage.m4b.a     // Catch:{ all -> 0x046b }
            int r0 = hr1.t(r0)     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x074c
            if (r0 == r11) goto L_0x06e5
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046b }
            r0.<init>()     // Catch:{ all -> 0x046b }
            throw r0     // Catch:{ all -> 0x046b }
        L_0x06e5:
            throw r9     // Catch:{ all -> 0x046b }
        L_0x06e6:
            boolean r0 = jjd.E(r28)     // Catch:{ all -> 0x06ed }
            r26 = r0
            goto L_0x074c
        L_0x06ed:
            r0 = move-exception
            r9 = r0
            udd.S(r4, r5, r9)     // Catch:{ all -> 0x046b }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a     // Catch:{ all -> 0x046b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x046b }
        L_0x06f8:
            boolean r17 = r0.hasNext()     // Catch:{ all -> 0x046b }
            if (r17 == 0) goto L_0x070b
            java.lang.Object r17 = r0.next()     // Catch:{ all -> 0x046b }
            ny9 r17 = (ny9) r17     // Catch:{ all -> 0x046b }
            r17.getClass()     // Catch:{ all -> 0x046b }
            ny9.a(r9)     // Catch:{ all -> 0x046b }
            goto L_0x06f8
        L_0x070b:
            int r0 = defpackage.m4b.a     // Catch:{ all -> 0x046b }
            int r0 = hr1.t(r0)     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x071c
            if (r0 == r11) goto L_0x071b
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x046b }
            r0.<init>()     // Catch:{ all -> 0x046b }
            throw r0     // Catch:{ all -> 0x046b }
        L_0x071b:
            throw r9     // Catch:{ all -> 0x046b }
        L_0x071c:
            r26 = r10
            goto L_0x074c
        L_0x071f:
            udd.S(r4, r5, r0)     // Catch:{ all -> 0x041b }
            java.util.concurrent.CopyOnWriteArraySet r9 = defpackage.uzc.a     // Catch:{ all -> 0x041b }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x041b }
        L_0x0728:
            boolean r17 = r9.hasNext()     // Catch:{ all -> 0x041b }
            if (r17 == 0) goto L_0x073b
            java.lang.Object r17 = r9.next()     // Catch:{ all -> 0x041b }
            ny9 r17 = (ny9) r17     // Catch:{ all -> 0x041b }
            r17.getClass()     // Catch:{ all -> 0x041b }
            ny9.a(r0)     // Catch:{ all -> 0x041b }
            goto L_0x0728
        L_0x073b:
            int r9 = defpackage.m4b.a     // Catch:{ all -> 0x041b }
            int r9 = hr1.t(r9)     // Catch:{ all -> 0x041b }
            if (r9 == 0) goto L_0x074c
            if (r9 == r11) goto L_0x074b
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x041b }
            r0.<init>()     // Catch:{ all -> 0x041b }
            throw r0     // Catch:{ all -> 0x041b }
        L_0x074b:
            throw r0     // Catch:{ all -> 0x041b }
        L_0x074c:
            int r8 = r8 + r11
            goto L_0x03f6
        L_0x074f:
            udd.S(r4, r5, r0)
            java.util.concurrent.CopyOnWriteArraySet r4 = defpackage.uzc.a
            java.util.Iterator r4 = r4.iterator()
        L_0x0758:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x076b
            java.lang.Object r5 = r4.next()
            ny9 r5 = (ny9) r5
            r5.getClass()
            ny9.a(r0)
            goto L_0x0758
        L_0x076b:
            int r4 = defpackage.m4b.a
            int r4 = hr1.t(r4)
            if (r4 == 0) goto L_0x077c
            if (r4 == r11) goto L_0x077b
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x077b:
            throw r0
        L_0x077c:
            nj2 r0 = new nj2
            r17 = r0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r12.v = r0
            goto L_0x0967
        L_0x0787:
            long r4 = jjd.J(r1, r8)
            r12.A = r4
            goto L_0x0967
        L_0x078f:
            zy r0 = defpackage.zy.d(r28)
            r12.t = r0
            goto L_0x0967
        L_0x0797:
            java.lang.String r0 = r28.z0()
            r0.getClass()
            java.lang.String r4 = "PUBLIC"
            boolean r4 = r0.equals(r4)
            if (r4 != 0) goto L_0x07b2
            java.lang.String r4 = "PRIVATE"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x07b0
            r0 = r11
            goto L_0x07b3
        L_0x07b0:
            r0 = 3
            goto L_0x07b3
        L_0x07b2:
            r0 = 2
        L_0x07b3:
            r12.O = r0
            goto L_0x0967
        L_0x07b7:
            ym8 r0 = hhd.H(r28)
            r12.i = r0
            goto L_0x0967
        L_0x07bf:
            boolean r0 = jjd.E(r28)
            r12.z = r0
            goto L_0x0967
        L_0x07c7:
            ak0 r0 = new ak0
            r0.<init>(r3)
            sp8 r4 = r28.n()
            int r4 = r4.a()
            if (r4 != r7) goto L_0x07f5
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            int r4 = r28.x0()
            r5 = r10
        L_0x07e0:
            if (r5 >= r4) goto L_0x07f8
            long r17 = jjd.J(r1, r8)
            java.lang.Long r6 = java.lang.Long.valueOf(r17)
            java.lang.Object r3 = r0.f(r1)
            r15.put(r6, r3)
            int r5 = r5 + r11
            r3 = 16
            goto L_0x07e0
        L_0x07f5:
            r28.z()
        L_0x07f8:
            r12.B = r15
            goto L_0x0967
        L_0x07fc:
            java.lang.String r0 = jjd.M(r28)
            r12.s = r0
            goto L_0x0967
        L_0x0804:
            long r3 = r28.w0()
            r12.k = r3
            goto L_0x0967
        L_0x080c:
            int r0 = jjd.K(r28)     // Catch:{ all -> 0x0812 }
            r3 = r0
            goto L_0x0842
        L_0x0812:
            r0 = move-exception
            r3 = r0
            udd.S(r4, r5, r3)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x081d:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0830
            java.lang.Object r6 = r0.next()
            ny9 r6 = (ny9) r6
            r6.getClass()
            ny9.a(r3)
            goto L_0x081d
        L_0x0830:
            int r0 = defpackage.m4b.a
            int r0 = hr1.t(r0)
            if (r0 == 0) goto L_0x0841
            if (r0 == r11) goto L_0x0840
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0840:
            throw r3
        L_0x0841:
            r3 = r10
        L_0x0842:
            r6 = r10
            r8 = r15
        L_0x0844:
            if (r6 >= r3) goto L_0x091f
            java.lang.String r0 = jjd.M(r28)     // Catch:{ all -> 0x084b }
            goto L_0x087e
        L_0x084b:
            r0 = move-exception
            r9 = r0
            udd.S(r4, r5, r9)     // Catch:{ all -> 0x0869 }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a     // Catch:{ all -> 0x0869 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0869 }
        L_0x0856:
            boolean r18 = r0.hasNext()     // Catch:{ all -> 0x0869 }
            if (r18 == 0) goto L_0x086c
            java.lang.Object r18 = r0.next()     // Catch:{ all -> 0x0869 }
            ny9 r18 = (ny9) r18     // Catch:{ all -> 0x0869 }
            r18.getClass()     // Catch:{ all -> 0x0869 }
            ny9.a(r9)     // Catch:{ all -> 0x0869 }
            goto L_0x0856
        L_0x0869:
            r0 = move-exception
            goto L_0x08f2
        L_0x086c:
            int r0 = defpackage.m4b.a     // Catch:{ all -> 0x0869 }
            int r0 = hr1.t(r0)     // Catch:{ all -> 0x0869 }
            if (r0 == 0) goto L_0x087d
            if (r0 == r11) goto L_0x087c
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0869 }
            r0.<init>()     // Catch:{ all -> 0x0869 }
            throw r0     // Catch:{ all -> 0x0869 }
        L_0x087c:
            throw r9     // Catch:{ all -> 0x0869 }
        L_0x087d:
            r0 = r15
        L_0x087e:
            if (r0 == 0) goto L_0x08ef
            java.lang.String r9 = "organizationIds"
            boolean r0 = r0.equals(r9)     // Catch:{ all -> 0x088d }
            if (r0 == 0) goto L_0x088f
            long[] r8 = defpackage.uzc.b(r28)     // Catch:{ all -> 0x088d }
            goto L_0x08ef
        L_0x088d:
            r0 = move-exception
            goto L_0x08c2
        L_0x088f:
            r28.z()     // Catch:{ all -> 0x0893 }
            goto L_0x08ef
        L_0x0893:
            r0 = move-exception
            r9 = r0
            udd.S(r4, r5, r9)     // Catch:{ all -> 0x088d }
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.uzc.a     // Catch:{ all -> 0x088d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x088d }
        L_0x089e:
            boolean r18 = r0.hasNext()     // Catch:{ all -> 0x088d }
            if (r18 == 0) goto L_0x08b1
            java.lang.Object r18 = r0.next()     // Catch:{ all -> 0x088d }
            ny9 r18 = (ny9) r18     // Catch:{ all -> 0x088d }
            r18.getClass()     // Catch:{ all -> 0x088d }
            ny9.a(r9)     // Catch:{ all -> 0x088d }
            goto L_0x089e
        L_0x08b1:
            int r0 = defpackage.m4b.a     // Catch:{ all -> 0x088d }
            int r0 = hr1.t(r0)     // Catch:{ all -> 0x088d }
            if (r0 == 0) goto L_0x08ef
            if (r0 == r11) goto L_0x08c1
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x088d }
            r0.<init>()     // Catch:{ all -> 0x088d }
            throw r0     // Catch:{ all -> 0x088d }
        L_0x08c1:
            throw r9     // Catch:{ all -> 0x088d }
        L_0x08c2:
            udd.S(r4, r5, r0)     // Catch:{ all -> 0x0869 }
            java.util.concurrent.CopyOnWriteArraySet r9 = defpackage.uzc.a     // Catch:{ all -> 0x0869 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0869 }
        L_0x08cb:
            boolean r18 = r9.hasNext()     // Catch:{ all -> 0x0869 }
            if (r18 == 0) goto L_0x08de
            java.lang.Object r18 = r9.next()     // Catch:{ all -> 0x0869 }
            ny9 r18 = (ny9) r18     // Catch:{ all -> 0x0869 }
            r18.getClass()     // Catch:{ all -> 0x0869 }
            ny9.a(r0)     // Catch:{ all -> 0x0869 }
            goto L_0x08cb
        L_0x08de:
            int r9 = defpackage.m4b.a     // Catch:{ all -> 0x0869 }
            int r9 = hr1.t(r9)     // Catch:{ all -> 0x0869 }
            if (r9 == 0) goto L_0x08ef
            if (r9 == r11) goto L_0x08ee
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException     // Catch:{ all -> 0x0869 }
            r0.<init>()     // Catch:{ all -> 0x0869 }
            throw r0     // Catch:{ all -> 0x0869 }
        L_0x08ee:
            throw r0     // Catch:{ all -> 0x0869 }
        L_0x08ef:
            int r6 = r6 + r11
            goto L_0x0844
        L_0x08f2:
            udd.S(r4, r5, r0)
            java.util.concurrent.CopyOnWriteArraySet r3 = defpackage.uzc.a
            java.util.Iterator r3 = r3.iterator()
        L_0x08fb:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x090e
            java.lang.Object r4 = r3.next()
            ny9 r4 = (ny9) r4
            r4.getClass()
            ny9.a(r0)
            goto L_0x08fb
        L_0x090e:
            int r3 = defpackage.m4b.a
            int r3 = hr1.t(r3)
            if (r3 == 0) goto L_0x091f
            if (r3 == r11) goto L_0x091e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x091e:
            throw r0
        L_0x091f:
            if (r8 == 0) goto L_0x0926
            x3a r15 = new x3a
            r15.<init>(r2, r8)
        L_0x0926:
            r12.o = r15
            goto L_0x0967
        L_0x0929:
            y2f r0 = defpackage.y2f.a(r28)
            r12.C = r0
            goto L_0x0967
        L_0x0930:
            sp8 r0 = r28.n()
            int r0 = r0.a()
            if (r0 != r7) goto L_0x095b
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            int r0 = r28.x0()
            r3 = r10
        L_0x0944:
            if (r3 >= r0) goto L_0x095e
            long r4 = jjd.J(r1, r8)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            long r5 = jjd.J(r1, r8)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r15.put(r4, r5)
            int r3 = r3 + r11
            goto L_0x0944
        L_0x095b:
            r28.z()
        L_0x095e:
            r12.d = r15
            goto L_0x0967
        L_0x0961:
            java.lang.String r0 = jjd.M(r28)
            r12.h = r0
        L_0x0967:
            int r14 = r14 + r11
            r3 = 16
            goto L_0x0014
        L_0x096c:
            j22 r0 = new j22
            r0.<init>(r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j22.a(ws8):j22");
    }

    public final String toString() {
        int R = ete.R(this.o);
        int p = ete.p(this.E0);
        StringBuilder sb = new StringBuilder("{id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(th2.p(this.b1));
        sb.append(", status='");
        sb.append(this.b);
        sb.append("', owner=");
        sb.append(this.c);
        sb.append(", participants=");
        sb.append(R);
        sb.append(", created=");
        sb.append(this.X);
        sb.append(", lastMessage=");
        sb.append(this.x0);
        sb.append(", cid=");
        sb.append(this.y0);
        sb.append(", lastEventTime=");
        sb.append(this.z0);
        sb.append(", newMessages=");
        sb.append(this.A0);
        sb.append(", participantsCount=");
        th2.l(sb, this.C0, ", admins=", p, ", chatOptions=");
        sb.append(this.G0);
        sb.append(", botsInfo=");
        sb.append(this.S0);
        sb.append(", getLastMentionMessageId=");
        sb.append(this.V0);
        sb.append(", lastReactedMessageId=");
        sb.append(this.X0);
        sb.append(", lastReaction=");
        sb.append(this.Y0);
        sb.append(", markedAsUnread=");
        sb.append(this.W0);
        sb.append(", lastFireDelayedErrorTime=");
        sb.append(this.a1);
        sb.append(", lastDelayedUpdateTime=");
        return wn6.k(sb, this.Z0, "}");
    }
}
