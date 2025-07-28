package defpackage;

/* renamed from: nw0  reason: default package */
public final /* synthetic */ class nw0 implements lfd {
    public final /* synthetic */ int a;
    public final /* synthetic */ gx0 b;

    public /* synthetic */ nw0(gx0 gx0, int i) {
        this.a = i;
        this.b = gx0;
    }

    /* JADX WARNING: type inference failed for: r5v45, types: [v2d] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x031f, code lost:
        r32 = r13;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(org.json.JSONObject r40) {
        /*
            r39 = this;
            r7 = r40
            r0 = 13
            r2 = r39
            gx0 r11 = r2.b
            r11.getClass()
            c r2 = new c
            r2.<init>(r11, r0, r7)
            java.util.concurrent.ExecutorService r3 = defpackage.gx0.t2
            r3.execute(r2)
            xw2 r2 = r11.S1
            r2.getClass()
            long r3 = java.lang.System.nanoTime()
            r2.b = r3
            java.lang.String r2 = "notification"
            java.lang.String r12 = r7.getString(r2)
            r12.getClass()
            tqd r13 = defpackage.tqd.callAcceptedOutgoing
            wia r2 = defpackage.ke1.r
            g41 r3 = defpackage.g41.A0
            u2d r4 = defpackage.u2d.a
            g41 r5 = defpackage.g41.M0
            g41 r14 = defpackage.g41.y0
            java.lang.String r6 = "denoiseAnn"
            java.lang.String r15 = "denoise"
            r17 = 2
            java.lang.String r0 = "reason"
            java.lang.String r10 = "participantId"
            java.lang.String r21 = "audio"
            java.lang.String r22 = "video"
            java.lang.String r1 = "participant"
            java.lang.String r9 = "VideoStreamsParser"
            java.lang.String r8 = "isConcurrent"
            r25 = r0
            java.lang.String r0 = "mediaModifiers"
            r26 = r5
            java.lang.String r5 = "conversation.ended"
            r27 = r10
            java.lang.String r10 = "ENDED"
            r28 = r14
            java.lang.String r14 = "conversation"
            r29 = r13
            java.lang.String r13 = "roomId"
            r30 = r2
            java.lang.String r2 = "state"
            r31 = r1
            java.lang.String r1 = "OKRTCCall"
            r32 = -1
            int r33 = r12.hashCode()
            switch(r33) {
                case -1970255734: goto L_0x0330;
                case -1946759356: goto L_0x0322;
                case -1837281659: goto L_0x0313;
                case -1824193402: goto L_0x0306;
                case -1326342510: goto L_0x02f9;
                case -1206103903: goto L_0x02ec;
                case -1183787100: goto L_0x02df;
                case -1136546043: goto L_0x02d1;
                case -1123680175: goto L_0x02c2;
                case -1009634793: goto L_0x02b2;
                case -952973404: goto L_0x02a2;
                case -891376444: goto L_0x0292;
                case -855742144: goto L_0x0282;
                case -776083981: goto L_0x0272;
                case -775651618: goto L_0x0262;
                case -615745013: goto L_0x0252;
                case -555091700: goto L_0x0242;
                case -318071351: goto L_0x0232;
                case -299374874: goto L_0x0222;
                case -191501435: goto L_0x0212;
                case -130352389: goto L_0x0202;
                case -109284890: goto L_0x01f2;
                case -53726114: goto L_0x01e2;
                case -6349260: goto L_0x01d2;
                case 6516608: goto L_0x01c2;
                case 45361494: goto L_0x01b2;
                case 65959073: goto L_0x01a2;
                case 148230891: goto L_0x0192;
                case 335380875: goto L_0x0182;
                case 378271103: goto L_0x0172;
                case 540816845: goto L_0x0162;
                case 614369236: goto L_0x0152;
                case 778113871: goto L_0x0142;
                case 1037842889: goto L_0x0132;
                case 1094077426: goto L_0x0122;
                case 1128844070: goto L_0x0112;
                case 1145321190: goto L_0x0102;
                case 1175114531: goto L_0x00f2;
                case 1323654813: goto L_0x00e2;
                case 1467147485: goto L_0x00d2;
                case 1685715486: goto L_0x00c2;
                case 1736968659: goto L_0x00b2;
                case 1885175990: goto L_0x00a2;
                case 1898041858: goto L_0x0092;
                case 2022715558: goto L_0x0082;
                case 2138278323: goto L_0x0072;
                default: goto L_0x006e;
            }
        L_0x006e:
            r33 = r13
            goto L_0x033d
        L_0x0072:
            r33 = r13
            java.lang.String r13 = "settings-update"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x007e
            goto L_0x033d
        L_0x007e:
            r13 = 45
            goto L_0x031f
        L_0x0082:
            r33 = r13
            java.lang.String r13 = "promote-participant"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x008e
            goto L_0x033d
        L_0x008e:
            r13 = 44
            goto L_0x031f
        L_0x0092:
            r33 = r13
            java.lang.String r13 = "movie-share-stopped"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x009e
            goto L_0x033d
        L_0x009e:
            r13 = 43
            goto L_0x031f
        L_0x00a2:
            r33 = r13
            java.lang.String r13 = "movie-share-started"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x00ae
            goto L_0x033d
        L_0x00ae:
            r13 = 42
            goto L_0x031f
        L_0x00b2:
            r33 = r13
            java.lang.String r13 = "media-settings-changed"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x00be
            goto L_0x033d
        L_0x00be:
            r13 = 41
            goto L_0x031f
        L_0x00c2:
            r33 = r13
            java.lang.String r13 = "chat-room-updated"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x00ce
            goto L_0x033d
        L_0x00ce:
            r13 = 40
            goto L_0x031f
        L_0x00d2:
            r33 = r13
            java.lang.String r13 = "stalled-activity"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x00de
            goto L_0x033d
        L_0x00de:
            r13 = 39
            goto L_0x031f
        L_0x00e2:
            r33 = r13
            java.lang.String r13 = "features-per-role-changed"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x00ee
            goto L_0x033d
        L_0x00ee:
            r13 = 38
            goto L_0x031f
        L_0x00f2:
            r33 = r13
            java.lang.String r13 = "participant-joined"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x00fe
            goto L_0x033d
        L_0x00fe:
            r13 = 37
            goto L_0x031f
        L_0x0102:
            r33 = r13
            java.lang.String r13 = "speaker-changed"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x010e
            goto L_0x033d
        L_0x010e:
            r13 = 36
            goto L_0x031f
        L_0x0112:
            r33 = r13
            java.lang.String r13 = "audio-activity"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x011e
            goto L_0x033d
        L_0x011e:
            r13 = 35
            goto L_0x031f
        L_0x0122:
            r33 = r13
            java.lang.String r13 = "feature-set-changed"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x012e
            goto L_0x033d
        L_0x012e:
            r13 = 34
            goto L_0x031f
        L_0x0132:
            r33 = r13
            java.lang.String r13 = "room-updated"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x013e
            goto L_0x033d
        L_0x013e:
            r13 = 33
            goto L_0x031f
        L_0x0142:
            r33 = r13
            java.lang.String r13 = "force-media-settings-change"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x014e
            goto L_0x033d
        L_0x014e:
            r13 = 32
            goto L_0x031f
        L_0x0152:
            r33 = r13
            java.lang.String r13 = "transmitted-data"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x015e
            goto L_0x033d
        L_0x015e:
            r13 = 31
            goto L_0x031f
        L_0x0162:
            r33 = r13
            java.lang.String r13 = "registered-peer"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x016e
            goto L_0x033d
        L_0x016e:
            r13 = 30
            goto L_0x031f
        L_0x0172:
            r33 = r13
            java.lang.String r13 = "mute-participant"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x017e
            goto L_0x033d
        L_0x017e:
            r13 = 29
            goto L_0x031f
        L_0x0182:
            r33 = r13
            java.lang.String r13 = "url-sharing-info-updated"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x018e
            goto L_0x033d
        L_0x018e:
            r13 = 28
            goto L_0x031f
        L_0x0192:
            r33 = r13
            java.lang.String r13 = "switch-micro"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x019e
            goto L_0x033d
        L_0x019e:
            r13 = 27
            goto L_0x031f
        L_0x01a2:
            r33 = r13
            java.lang.String r13 = "promotion-approved"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x01ae
            goto L_0x033d
        L_0x01ae:
            r13 = 26
            goto L_0x031f
        L_0x01b2:
            r33 = r13
            java.lang.String r13 = "topology-changed"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x01be
            goto L_0x033d
        L_0x01be:
            r13 = 25
            goto L_0x031f
        L_0x01c2:
            r33 = r13
            java.lang.String r13 = "asr-stopped"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x01ce
            goto L_0x033d
        L_0x01ce:
            r13 = 24
            goto L_0x031f
        L_0x01d2:
            r33 = r13
            java.lang.String r13 = "asr-started"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x01de
            goto L_0x033d
        L_0x01de:
            r13 = 23
            goto L_0x031f
        L_0x01e2:
            r33 = r13
            java.lang.String r13 = "participant-state-changed"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x01ee
            goto L_0x033d
        L_0x01ee:
            r32 = 22
            goto L_0x033d
        L_0x01f2:
            r33 = r13
            java.lang.String r13 = "participant-added"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x01fe
            goto L_0x033d
        L_0x01fe:
            r13 = 21
            goto L_0x031f
        L_0x0202:
            r33 = r13
            java.lang.String r13 = "pin-participant"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x020e
            goto L_0x033d
        L_0x020e:
            r13 = 20
            goto L_0x031f
        L_0x0212:
            r33 = r13
            java.lang.String r13 = "feedback"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x021e
            goto L_0x033d
        L_0x021e:
            r13 = 19
            goto L_0x031f
        L_0x0222:
            r33 = r13
            java.lang.String r13 = "rooms-updated"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x022e
            goto L_0x033d
        L_0x022e:
            r13 = 18
            goto L_0x031f
        L_0x0232:
            r33 = r13
            java.lang.String r13 = "decorative-participant-id-changed"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x023e
            goto L_0x033d
        L_0x023e:
            r13 = 17
            goto L_0x031f
        L_0x0242:
            r33 = r13
            java.lang.String r13 = "rate-call-data"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x024e
            goto L_0x033d
        L_0x024e:
            r13 = 16
            goto L_0x031f
        L_0x0252:
            r33 = r13
            java.lang.String r13 = "participants-state-changed"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x025e
            goto L_0x033d
        L_0x025e:
            r13 = 15
            goto L_0x031f
        L_0x0262:
            r33 = r13
            java.lang.String r13 = "connection"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x026e
            goto L_0x033d
        L_0x026e:
            r32 = 14
            goto L_0x033d
        L_0x0272:
            r33 = r13
            java.lang.String r13 = "multiparty-chat-created"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x027e
            goto L_0x033d
        L_0x027e:
            r32 = 13
            goto L_0x033d
        L_0x0282:
            r33 = r13
            java.lang.String r13 = "room-participants-updated"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x028e
            goto L_0x033d
        L_0x028e:
            r13 = 12
            goto L_0x031f
        L_0x0292:
            r33 = r13
            java.lang.String r13 = "accepted-call"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x029e
            goto L_0x033d
        L_0x029e:
            r13 = 11
            goto L_0x031f
        L_0x02a2:
            r33 = r13
            java.lang.String r13 = "roles-changed"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x02ae
            goto L_0x033d
        L_0x02ae:
            r13 = 10
            goto L_0x031f
        L_0x02b2:
            r33 = r13
            java.lang.String r13 = "realloc-con"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x02be
            goto L_0x033d
        L_0x02be:
            r13 = 9
            goto L_0x031f
        L_0x02c2:
            r33 = r13
            java.lang.String r13 = "record-stopped"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x02ce
            goto L_0x033d
        L_0x02ce:
            r13 = 8
            goto L_0x031f
        L_0x02d1:
            r33 = r13
            java.lang.String r13 = "record-started"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x02dd
            goto L_0x033d
        L_0x02dd:
            r13 = 7
            goto L_0x031f
        L_0x02df:
            r33 = r13
            java.lang.String r13 = "join-link-changed"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x02ea
            goto L_0x033d
        L_0x02ea:
            r13 = 6
            goto L_0x031f
        L_0x02ec:
            r33 = r13
            java.lang.String r13 = "hungup"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x02f7
            goto L_0x033d
        L_0x02f7:
            r13 = 5
            goto L_0x031f
        L_0x02f9:
            r33 = r13
            java.lang.String r13 = "chat-message"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x0304
            goto L_0x033d
        L_0x0304:
            r13 = 4
            goto L_0x031f
        L_0x0306:
            r33 = r13
            java.lang.String r13 = "custom-data"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x0311
            goto L_0x033d
        L_0x0311:
            r13 = 3
            goto L_0x031f
        L_0x0313:
            r33 = r13
            java.lang.String r13 = "options-changed"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x031e
            goto L_0x033d
        L_0x031e:
            r13 = 2
        L_0x031f:
            r32 = r13
            goto L_0x033d
        L_0x0322:
            r33 = r13
            java.lang.String r13 = "closed-conversation"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x032d
            goto L_0x033d
        L_0x032d:
            r32 = 1
            goto L_0x033d
        L_0x0330:
            r33 = r13
            java.lang.String r13 = "participant-animoji-changed"
            boolean r13 = r12.equals(r13)
            if (r13 != 0) goto L_0x033b
            goto L_0x033d
        L_0x033b:
            r32 = 0
        L_0x033d:
            switch(r32) {
                case 0: goto L_0x0f09;
                case 1: goto L_0x0ebb;
                case 2: goto L_0x0eb1;
                case 3: goto L_0x0ead;
                case 4: goto L_0x0ea3;
                case 5: goto L_0x0e07;
                case 6: goto L_0x0df8;
                case 7: goto L_0x0df1;
                case 8: goto L_0x0dea;
                case 9: goto L_0x0db7;
                case 10: goto L_0x0d2c;
                case 11: goto L_0x0c16;
                case 12: goto L_0x0c0b;
                case 13: goto L_0x0bf8;
                case 14: goto L_0x0b50;
                case 15: goto L_0x0b2e;
                case 16: goto L_0x0b23;
                case 17: goto L_0x0b18;
                case 18: goto L_0x0b0d;
                case 19: goto L_0x0b02;
                case 20: goto L_0x0aaa;
                case 21: goto L_0x0a88;
                case 22: goto L_0x0a73;
                case 23: goto L_0x0a6c;
                case 24: goto L_0x0a65;
                case 25: goto L_0x0a41;
                case 26: goto L_0x0a36;
                case 27: goto L_0x0a13;
                case 28: goto L_0x0a08;
                case 29: goto L_0x09f1;
                case 30: goto L_0x09d0;
                case 31: goto L_0x08c8;
                case 32: goto L_0x088e;
                case 33: goto L_0x0883;
                case 34: goto L_0x082e;
                case 35: goto L_0x081f;
                case 36: goto L_0x080a;
                case 37: goto L_0x06bc;
                case 38: goto L_0x06b1;
                case 39: goto L_0x06a5;
                case 40: goto L_0x069a;
                case 41: goto L_0x05d4;
                case 42: goto L_0x052c;
                case 43: goto L_0x0489;
                case 44: goto L_0x03d3;
                case 45: goto L_0x0342;
                default: goto L_0x0340;
            }
        L_0x0340:
            goto L_0x0f0e
        L_0x0342:
            java.lang.String r0 = "screenSharing"
            ema r0 = defpackage.x87.L(r7, r0)
            r11.p2 = r0
            java.lang.String r0 = "camera"
            ema r0 = defpackage.x87.L(r7, r0)
            r11.q2 = r0
            sl1 r1 = r11.x1
            if (r1 != 0) goto L_0x0357
            goto L_0x0387
        L_0x0357:
            cc9 r2 = r11.C1
            boolean r2 = r2.b
            if (r2 == 0) goto L_0x0363
            boolean r2 = r11.h2
            if (r2 != 0) goto L_0x0363
            ema r0 = r11.p2
        L_0x0363:
            if (r0 != 0) goto L_0x0366
            goto L_0x0387
        L_0x0366:
            boolean r1 = r1.I()
            if (r1 == 0) goto L_0x0378
            sl1 r1 = r11.x1
            r1.F0 = r0
            py7 r1 = r1.B0
            if (r1 == 0) goto L_0x0387
            r1.e(r0)
            goto L_0x0387
        L_0x0378:
            sl1 r1 = r11.x1
            r1.F0 = r0
            py7 r2 = r1.B0
            if (r2 == 0) goto L_0x0384
            r2.e(r0)
            goto L_0x0387
        L_0x0384:
            r1.U(r0)
        L_0x0387:
            boolean r0 = r11.b1
            if (r0 == 0) goto L_0x0f0e
            me0 r0 = r11.a1
            r0.getClass()
            java.lang.String r1 = "settings"
            org.json.JSONObject r1 = r7.optJSONObject(r1)
            if (r1 == 0) goto L_0x0f0e
            java.lang.String r2 = "badNet"
            org.json.JSONObject r2 = r1.optJSONObject(r2)
            exf r3 = r0.j
            r3.getClass()
            java.lang.String r4 = "loss"
            java.lang.String r5 = "rtt"
            if (r2 != 0) goto L_0x03aa
            goto L_0x03b6
        L_0x03aa:
            int r6 = r2.optInt(r5)
            r3.a = r6
            double r6 = r2.optDouble(r4)
            r3.b = r6
        L_0x03b6:
            java.lang.String r2 = "goodNet"
            org.json.JSONObject r1 = r1.optJSONObject(r2)
            exf r0 = r0.i
            r0.getClass()
            if (r1 != 0) goto L_0x03c5
            goto L_0x0f0e
        L_0x03c5:
            int r2 = r1.optInt(r5)
            r0.a = r2
            double r1 = r1.optDouble(r4)
            r0.b = r1
            goto L_0x0f0e
        L_0x03d3:
            java.lang.String r9 = "demote"
            boolean r9 = r7.getBoolean(r9)     // Catch:{ JSONException -> 0x03fe }
            r13 = 1
            r16 = r9 ^ 1
            r11.O1 = r9     // Catch:{ JSONException -> 0x03fe }
            if (r16 == 0) goto L_0x043e
            org.json.JSONObject r13 = r7.getJSONObject(r14)     // Catch:{ JSONException -> 0x03fe }
            java.lang.String r2 = r13.getString(r2)     // Catch:{ JSONException -> 0x03fe }
            boolean r2 = r10.equals(r2)     // Catch:{ JSONException -> 0x03fe }
            if (r2 == 0) goto L_0x0400
            qe4 r0 = r11.o2     // Catch:{ JSONException -> 0x03fe }
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$ConversationAlreadyEnded r2 = ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.ConversationAlreadyEnded.INSTANCE     // Catch:{ JSONException -> 0x03fe }
            r0.J(r2)     // Catch:{ JSONException -> 0x03fe }
            r2 = 0
            r11.k(r3, r2)     // Catch:{ JSONException -> 0x03fe }
            r11.p(r2, r5)     // Catch:{ JSONException -> 0x03fe }
            goto L_0x0f0e
        L_0x03fe:
            r0 = move-exception
            goto L_0x0470
        L_0x0400:
            org.json.JSONObject r0 = r7.optJSONObject(r0)     // Catch:{ JSONException -> 0x03fe }
            kp0 r2 = r11.D1     // Catch:{ JSONException -> 0x03fe }
            r2.getClass()     // Catch:{ JSONException -> 0x03fe }
            if (r0 != 0) goto L_0x040c
            goto L_0x0418
        L_0x040c:
            boolean r3 = r0.optBoolean(r15)     // Catch:{ JSONException -> 0x03fe }
            r2.a = r3     // Catch:{ JSONException -> 0x03fe }
            boolean r0 = r0.optBoolean(r6)     // Catch:{ JSONException -> 0x03fe }
            r2.b = r0     // Catch:{ JSONException -> 0x03fe }
        L_0x0418:
            r11.g(r13)     // Catch:{ JSONException -> 0x03fe }
            qb1 r14 = r11.P1     // Catch:{ JSONException -> 0x03fe }
            java.lang.String r16 = "handlePromoteParticipant"
            r19 = 1
            r15 = r13
            r18 = r4
            r14.m(r15, r16, r17, r18, r19)     // Catch:{ JSONException -> 0x03fe }
            r2 = 0
            boolean r0 = r7.optBoolean(r8, r2)     // Catch:{ JSONException -> 0x03fe }
            r2 = 1
            r11.h(r13, r0, r2)     // Catch:{ JSONException -> 0x03fe }
            r11.l(r7)     // Catch:{ JSONException -> 0x03fe }
            cc9 r0 = r11.C1     // Catch:{ JSONException -> 0x03fe }
            boolean r0 = r0.f     // Catch:{ JSONException -> 0x03fe }
            r11.B(r0)     // Catch:{ JSONException -> 0x03fe }
            r11.w()     // Catch:{ JSONException -> 0x03fe }
            goto L_0x045f
        L_0x043e:
            nu7 r0 = r11.k2     // Catch:{ JSONException -> 0x03fe }
            fx0 r2 = defpackage.fx0.X     // Catch:{ JSONException -> 0x03fe }
            java.lang.Object r0 = r0.a     // Catch:{ JSONException -> 0x03fe }
            gx0 r0 = (defpackage.gx0) r0     // Catch:{ JSONException -> 0x03fe }
            java.util.EnumSet r0 = r0.D0     // Catch:{ JSONException -> 0x03fe }
            boolean r0 = r0.contains(r2)     // Catch:{ JSONException -> 0x03fe }
            if (r0 != 0) goto L_0x0453
            pe1 r0 = r11.t1     // Catch:{ JSONException -> 0x03fe }
            r0.h()     // Catch:{ JSONException -> 0x03fe }
        L_0x0453:
            qb1 r0 = r11.P1     // Catch:{ JSONException -> 0x03fe }
            r0.getClass()     // Catch:{ JSONException -> 0x03fe }
            ac9 r2 = new ac9     // Catch:{ JSONException -> 0x03fe }
            r2.<init>()     // Catch:{ JSONException -> 0x03fe }
            r0.i = r2     // Catch:{ JSONException -> 0x03fe }
        L_0x045f:
            qb1 r0 = r11.P1     // Catch:{ JSONException -> 0x03fe }
            r0.k()     // Catch:{ JSONException -> 0x03fe }
            ob1 r0 = r11.a2     // Catch:{ JSONException -> 0x03fe }
            hef r0 = r0.d     // Catch:{ JSONException -> 0x03fe }
            r0.onMeInWaitingRoomChanged(r9)     // Catch:{ JSONException -> 0x03fe }
            r11.x()     // Catch:{ JSONException -> 0x03fe }
            goto L_0x0f0e
        L_0x0470:
            xwb r2 = r11.Z0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "handlePromoteParticipant "
            r3.<init>(r4)
            java.lang.String r4 = r0.getMessage()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.logException(r1, r3, r0)
            goto L_0x0f0e
        L_0x0489:
            km4 r0 = r11.Y1
            java.lang.Object r0 = r0.b
            r1 = r0
            jj7 r1 = (jj7) r1
            java.lang.Object r0 = r1.b
            r2 = r0
            b79 r2 = (defpackage.b79) r2
            r2.getClass()
            h79 r0 = defpackage.b79.b(r40)     // Catch:{ all -> 0x049d }
            goto L_0x04a7
        L_0x049d:
            r0 = move-exception
            r3 = r0
            java.lang.String r0 = "Can't parse stop movie notification"
            xwb r2 = r2.a
            r2.logException(r9, r0, r3)
            r0 = 0
        L_0x04a7:
            if (r0 != 0) goto L_0x04ab
            goto L_0x0f0e
        L_0x04ab:
            java.lang.Object r2 = r1.a
            pe1 r2 = (defpackage.pe1) r2
            ge1 r3 = r0.a
            ke1 r3 = r2.j(r3)
            if (r3 == 0) goto L_0x0521
            java.util.List r3 = r3.q
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L_0x04c2:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x04e4
            java.lang.Object r5 = r3.next()
            r6 = r5
            t69 r6 = (defpackage.t69) r6
            w69 r7 = r6.a
            w69 r8 = r0.c
            boolean r7 = hhd.f(r7, r8)
            if (r7 == 0) goto L_0x04e0
            c79 r6 = r6.d
            c79 r7 = r0.d
            if (r6 != r7) goto L_0x04e0
            goto L_0x04c2
        L_0x04e0:
            r4.add(r5)
            goto L_0x04c2
        L_0x04e4:
            dr9 r3 = new dr9
            r5 = 14
            r3.<init>(r5)
            dr9 r6 = new dr9
            r6.<init>(r5)
            dr9 r7 = new dr9
            r7.<init>(r5)
            dr9 r8 = new dr9
            r8.<init>(r5)
            dr9 r9 = new dr9
            r9.<init>(r5)
            nfc r5 = new nfc
            r10 = 22
            r5.<init>(r10, r4)
            pja r4 = new pja
            ge1 r10 = r0.a
            r24 = r4
            r25 = r10
            r26 = r3
            r27 = r6
            r28 = r7
            r29 = r8
            r30 = r9
            r31 = r5
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r3 = 0
            r2.f(r4, r3)
        L_0x0521:
            g41 r2 = defpackage.g41.Z0
            java.lang.Object r1 = r1.c
            i26 r1 = (i26) r1
            r1.invoke(r2, r0)
            goto L_0x0f0e
        L_0x052c:
            km4 r0 = r11.Y1
            java.lang.Object r0 = r0.b
            r1 = r0
            jj7 r1 = (jj7) r1
            java.lang.String r2 = "Can't parse movie"
            java.lang.Object r0 = r1.b
            b79 r0 = (defpackage.b79) r0
            xwb r3 = r0.a
            java.lang.String r0 = "movieShareInfo"
            org.json.JSONObject r0 = r7.getJSONObject(r0)     // Catch:{ all -> 0x0560 }
            r5 = r33
            boolean r6 = r7.has(r5)     // Catch:{ all -> 0x0560 }
            if (r6 == 0) goto L_0x0552
            int r5 = r7.optInt(r5)     // Catch:{ all -> 0x0560 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0560 }
            goto L_0x0553
        L_0x0552:
            r5 = 0
        L_0x0553:
            if (r5 == 0) goto L_0x0562
            int r4 = r5.intValue()     // Catch:{ all -> 0x0560 }
            v2d r5 = new v2d     // Catch:{ all -> 0x0560 }
            r5.<init>(r4)     // Catch:{ all -> 0x0560 }
            r4 = r5
            goto L_0x0562
        L_0x0560:
            r0 = move-exception
            goto L_0x056e
        L_0x0562:
            e79 r0 = defpackage.b79.a(r0, r4)     // Catch:{ all -> 0x0567 }
            goto L_0x0572
        L_0x0567:
            r0 = move-exception
            r4 = r0
            r3.logException(r9, r2, r4)     // Catch:{ all -> 0x0560 }
        L_0x056c:
            r0 = 0
            goto L_0x0572
        L_0x056e:
            r3.logException(r9, r2, r0)
            goto L_0x056c
        L_0x0572:
            if (r0 != 0) goto L_0x0576
            goto L_0x0f0e
        L_0x0576:
            java.lang.Object r2 = r1.a
            pe1 r2 = (defpackage.pe1) r2
            ge1 r3 = r0.a
            ke1 r3 = r2.j(r3)
            if (r3 != 0) goto L_0x0584
            goto L_0x0f0e
        L_0x0584:
            java.util.List r3 = r3.q
            t69 r4 = r0.c
            java.util.ArrayList r3 = o23.j0(r3, r4)
            dr9 r4 = new dr9
            r5 = 14
            r4.<init>(r5)
            dr9 r6 = new dr9
            r6.<init>(r5)
            dr9 r7 = new dr9
            r7.<init>(r5)
            dr9 r8 = new dr9
            r8.<init>(r5)
            dr9 r9 = new dr9
            r9.<init>(r5)
            nfc r5 = new nfc
            r10 = 22
            r5.<init>(r10, r3)
            pja r3 = new pja
            ge1 r10 = r0.a
            r24 = r3
            r25 = r10
            r26 = r4
            r27 = r6
            r28 = r7
            r29 = r8
            r30 = r9
            r31 = r5
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r4 = 0
            r2.f(r3, r4)
            g41 r2 = defpackage.g41.X0
            java.lang.Object r1 = r1.c
            i26 r1 = (i26) r1
            r1.invoke(r2, r0)
            goto L_0x0f0e
        L_0x05d4:
            java.lang.String r0 = "handleMediaSettingsChanged"
            xwb r2 = r11.Z0
            r2.log(r1, r0)
            ge1 r4 = defpackage.x87.J(r40)
            pe1 r0 = r11.t1
            ke1 r0 = r0.a
            ge1 r0 = r0.a
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x05ed
            goto L_0x0f0e
        L_0x05ed:
            pe1 r0 = r11.t1
            ke1 r0 = r0.j(r4)
            if (r0 != 0) goto L_0x0605
            xwb r0 = r11.Z0
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "participant.is.null"
            r2.<init>(r3)
            java.lang.String r3 = "ms.changed.npe"
            r0.reportException(r1, r3, r2)
            goto L_0x0f0e
        L_0x0605:
            cc9 r2 = defpackage.x87.r(r40)
            if (r2 != 0) goto L_0x061b
            xwb r0 = r11.Z0
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "no.mediasettings.in.notification"
            r2.<init>(r3)
            java.lang.String r3 = "ms.changed.absent"
            r0.reportException(r1, r3, r2)
            goto L_0x0f0e
        L_0x061b:
            ac9 r1 = new ac9
            ac9 r3 = r0.b
            k88 r5 = r3.a
            k88 r6 = r3.b
            k88 r7 = r3.c
            k88 r3 = r3.d
            r1.<init>(r5, r6, r7, r3)
            k88 r3 = defpackage.k88.o
            k88 r8 = defpackage.k88.c
            if (r5 != r3) goto L_0x063c
            cc9 r5 = r0.c
            boolean r5 = r5.e
            if (r5 == 0) goto L_0x063c
            boolean r5 = r2.e
            if (r5 != 0) goto L_0x063c
            r1.a = r8
        L_0x063c:
            if (r6 != r3) goto L_0x064a
            cc9 r5 = r0.c
            boolean r5 = r5.f
            if (r5 == 0) goto L_0x064a
            boolean r5 = r2.f
            if (r5 != 0) goto L_0x064a
            r1.b = r8
        L_0x064a:
            if (r7 != r3) goto L_0x0658
            cc9 r3 = r0.c
            boolean r3 = r3.b
            if (r3 == 0) goto L_0x0658
            boolean r3 = r2.b
            if (r3 != 0) goto L_0x0658
            r1.c = r8
        L_0x0658:
            cc9 r0 = r0.c
            boolean r0 = r0.g
            boolean r3 = r2.g
            if (r0 == r3) goto L_0x0665
            bd4 r0 = r11.I1
            r0.getClass()
        L_0x0665:
            pe1 r0 = r11.t1
            dr9 r5 = new dr9
            r3 = 14
            r5.<init>(r3)
            dr9 r8 = new dr9
            r8.<init>(r3)
            dr9 r9 = new dr9
            r9.<init>(r3)
            dr9 r10 = new dr9
            r10.<init>(r3)
            nfc r6 = new nfc
            r3 = 22
            r6.<init>(r3, r1)
            nfc r7 = new nfc
            r7.<init>(r3, r2)
            pja r1 = new pja
            r3 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r2 = 0
            r0.f(r1, r2)
            g41 r0 = defpackage.g41.Y
            r11.k(r0, r2)
            goto L_0x0f0e
        L_0x069a:
            km4 r0 = r11.Y1
            java.lang.Object r0 = r0.X
            v2b r0 = (defpackage.v2b) r0
            r0.m(r7)
            goto L_0x0f0e
        L_0x06a5:
            java.lang.String r0 = "stalledParticipants"
            java.util.ArrayList r0 = defpackage.x87.P(r7, r0)
            if (r0 == 0) goto L_0x0f0e
            r11.N1 = r0
            goto L_0x0f0e
        L_0x06b1:
            km4 r0 = r11.Y1
            java.lang.Object r0 = r0.c
            b0d r0 = (b0d) r0
            r0.y(r7)
            goto L_0x0f0e
        L_0x06bc:
            java.lang.String r0 = "handleParticipantJoined"
            xwb r3 = r11.Z0
            r3.log(r1, r0)
            r0 = r31
            org.json.JSONObject r0 = r7.getJSONObject(r0)
            ge1 r3 = defpackage.x87.K(r0)
            pe1 r5 = r11.t1
            ke1 r5 = r5.a
            ge1 r5 = r5.a
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0f0e
            qb1 r5 = r11.P1
            ac9 r6 = r5.h(r4)
            java.util.EnumMap r9 = r6.a()
            java.lang.String r8 = "handleParticipantJoined"
            r10 = 1
            r6 = r0
            r7 = r3
            ac9 r5 = r5.f(r6, r7, r8, r9, r10)
            cc9 r6 = defpackage.x87.r(r0)
            java.lang.String r7 = "joined.notify"
            if (r6 != 0) goto L_0x0700
            xwb r8 = r11.Z0
            java.lang.Exception r9 = new java.lang.Exception
            java.lang.String r10 = "joined.notify.mediaSettings.is.null"
            r9.<init>(r10)
            r8.logException(r1, r7, r9)
        L_0x0700:
            wia r8 = defpackage.x87.t(r0)
            pe1 r9 = r11.t1
            ke1 r9 = r9.j(r3)
            if (r8 == 0) goto L_0x0734
            if (r9 == 0) goto L_0x0734
            boolean r10 = r9.b()
            if (r10 == 0) goto L_0x0734
            wia r10 = r9.j
            boolean r10 = r8.equals(r10)
            if (r10 != 0) goto L_0x0734
            wia r9 = r9.j
            r10 = r30
            boolean r9 = r10.equals(r9)
            if (r9 != 0) goto L_0x0736
            xwb r0 = r11.Z0
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "joined.notify.participant.aready.exist"
            r2.<init>(r3)
            r0.logException(r1, r7, r2)
            goto L_0x0f0e
        L_0x0734:
            r10 = r30
        L_0x0736:
            pe1 r7 = r11.t1
            dr9 r9 = new dr9
            r13 = 14
            r9.<init>(r13)
            dr9 r14 = new dr9
            r14.<init>(r13)
            nfc r13 = new nfc
            r15 = 22
            r13.<init>(r15, r8)
            nfc r8 = new nfc
            r8.<init>(r15, r5)
            if (r6 == 0) goto L_0x075a
            nfc r5 = new nfc
            r5.<init>(r15, r6)
            r35 = r5
            goto L_0x075c
        L_0x075a:
            r35 = r9
        L_0x075c:
            java.util.ArrayList r5 = defpackage.x87.B(r0)
            nfc r6 = new nfc
            r6.<init>(r15, r5)
            y41 r5 = defpackage.x87.m(r0)
            if (r5 == 0) goto L_0x0773
            nfc r9 = new nfc
            r9.<init>(r15, r5)
            r37 = r9
            goto L_0x0775
        L_0x0773:
            r37 = r14
        L_0x0775:
            zfd r5 = r11.X1
            b79 r5 = r5.a
            java.util.List r5 = r5.h(r0, r4)
            nfc r9 = new nfc
            r9.<init>(r15, r5)
            pja r5 = new pja
            r31 = r5
            r32 = r3
            r33 = r13
            r34 = r8
            r36 = r6
            r38 = r9
            r31.<init>(r32, r33, r34, r35, r36, r37, r38)
            ke1 r3 = r7.f(r5, r4)
            java.lang.String r0 = r0.optString(r2)
            boolean r2 = r3.b()
            if (r2 != 0) goto L_0x07ac
            java.lang.String r2 = "ACCEPTED"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x07ac
            r3.e(r10)
        L_0x07ac:
            sl1 r0 = r11.x1
            r2 = 1
            r0.u(r3, r2)
            boolean r0 = r11.F0
            if (r0 == 0) goto L_0x0f0e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Opponent accepted (joined) call: "
            r0.<init>(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            xwb r2 = r11.Z0
            r2.log(r1, r0)
            cc9 r0 = r3.c
            boolean r0 = r0.f
            if (r0 == 0) goto L_0x07d4
            r0 = r22
        L_0x07d1:
            r8 = r29
            goto L_0x07d7
        L_0x07d4:
            r0 = r21
            goto L_0x07d1
        L_0x07d7:
            r11.u(r8, r0)
            boolean r0 = r11.O0
            if (r0 != 0) goto L_0x07f6
            android.os.Handler r0 = r11.w0
            lde r1 = r11.N0
            r0.removeCallbacks(r1)
            android.os.Handler r0 = r11.w0
            lde r1 = r11.N0
            fe1 r2 = r11.y0
            ee1 r2 = r2.b
            r2.getClass()
            r2 = 30000(0x7530, float:4.2039E-41)
            long r2 = (long) r2
            r0.postDelayed(r1, r2)
        L_0x07f6:
            r1 = 1
            r11.w1 = r1
            wjf r0 = r11.X0
            boolean r1 = r0.b
            if (r1 != 0) goto L_0x0802
            r0.c()
        L_0x0802:
            r9 = r28
            r1 = 0
            r11.k(r9, r1)
            goto L_0x0f0e
        L_0x080a:
            java.lang.String r0 = "speaker"
            java.lang.String r0 = r7.getString(r0)     // Catch:{ JSONException -> 0x0815 }
            ge1 r9 = defpackage.ge1.b(r0)     // Catch:{ JSONException -> 0x0815 }
            goto L_0x0816
        L_0x0815:
            r9 = 0
        L_0x0816:
            if (r9 == 0) goto L_0x0f0e
            pe1 r0 = r11.t1
            r0.o(r9)
            goto L_0x0f0e
        L_0x081f:
            java.lang.String r0 = "activeParticipants"
            java.util.ArrayList r0 = defpackage.x87.P(r7, r0)
            if (r0 == 0) goto L_0x0f0e
            pe1 r1 = r11.t1
            r1.q(r0)
            goto L_0x0f0e
        L_0x082e:
            km4 r0 = r11.Y1
            java.lang.Object r0 = r0.c
            b0d r0 = (b0d) r0
            r0.x(r7)
            java.lang.String r0 = "handleFeatureSetChanged"
            xwb r2 = r11.Z0
            r2.log(r1, r0)
            java.lang.String r0 = "features"
            org.json.JSONArray r0 = r7.optJSONArray(r0)
            if (r0 == 0) goto L_0x085e
            r2 = 0
        L_0x0847:
            int r3 = r0.length()
            if (r2 >= r3) goto L_0x085e
            java.lang.String r3 = r0.optString(r2)
            java.lang.String r4 = "ADD_PARTICIPANT"
            boolean r3 = r4.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x085b
            r0 = 1
            goto L_0x085f
        L_0x085b:
            r3 = 1
            int r2 = r2 + r3
            goto L_0x0847
        L_0x085e:
            r0 = 0
        L_0x085f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "setFeatureAddParticipantEnabled, "
            r2.<init>(r3)
            boolean r3 = defpackage.d59.a
            if (r0 == 0) goto L_0x086d
            java.lang.String r3 = "yes"
            goto L_0x086f
        L_0x086d:
            java.lang.String r3 = "no"
        L_0x086f:
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            xwb r3 = r11.Z0
            r3.log(r1, r2)
            boolean r1 = r11.B1
            if (r1 == r0) goto L_0x0f0e
            r11.B1 = r0
            goto L_0x0f0e
        L_0x0883:
            km4 r0 = r11.Y1
            java.lang.Object r0 = r0.a
            wjf r0 = (defpackage.wjf) r0
            r0.g(r7)
            goto L_0x0f0e
        L_0x088e:
            java.lang.String r0 = "handleForceChangeMediaSettings"
            xwb r2 = r11.Z0
            r2.log(r1, r0)
            cc9 r0 = defpackage.x87.r(r40)
            if (r0 != 0) goto L_0x08ab
            xwb r0 = r11.Z0
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "ms.force.change.no.mediasettings"
            r2.<init>(r3)
            java.lang.String r3 = "ms.force.change.npe"
            r0.reportException(r1, r3, r2)
            goto L_0x0f0e
        L_0x08ab:
            boolean r0 = r0.e
            if (r0 != 0) goto L_0x0f0e
            cc9 r0 = r11.C1
            boolean r1 = r0.e
            if (r1 == 0) goto L_0x0f0e
            if (r1 == 0) goto L_0x08bd
            r1 = 0
            r0.e = r1
            r0.a()
        L_0x08bd:
            g41 r0 = defpackage.g41.F0
            r1 = 0
            r11.k(r0, r1)
            r11.x()
            goto L_0x0f0e
        L_0x08c8:
            r10 = r30
            java.lang.String r0 = "handleTransmittedDataNotification"
            xwb r2 = r11.Z0
            r2.log(r1, r0)
            java.lang.String r0 = "data"
            org.json.JSONObject r0 = r7.getJSONObject(r0)
            java.lang.String r2 = "sdp"
            org.json.JSONObject r3 = r0.optJSONObject(r2)
            if (r3 == 0) goto L_0x08f3
            org.webrtc.SessionDescription r9 = new org.webrtc.SessionDescription
            java.lang.String r5 = "type"
            java.lang.String r5 = r3.getString(r5)
            org.webrtc.SessionDescription$Type r5 = org.webrtc.SessionDescription.Type.fromCanonicalForm(r5)
            java.lang.String r2 = r3.getString(r2)
            r9.<init>(r5, r2)
            goto L_0x08f4
        L_0x08f3:
            r9 = 0
        L_0x08f4:
            if (r9 == 0) goto L_0x09b0
            ge1 r0 = defpackage.x87.J(r40)
            wia r2 = defpackage.x87.t(r40)
            org.webrtc.SessionDescription$Type r3 = r9.type
            org.webrtc.SessionDescription$Type r5 = org.webrtc.SessionDescription.Type.OFFER
            if (r3 != r5) goto L_0x0923
            pe1 r2 = r11.t1
            ke1 r2 = r2.j(r0)
            if (r2 != 0) goto L_0x091c
            xwb r0 = r11.Z0
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "td.sdp.unknown.participant"
            r2.<init>(r3)
            java.lang.String r3 = "td.sdp.npe"
            r0.logException(r1, r3, r2)
            goto L_0x0f0e
        L_0x091c:
            sl1 r1 = r11.x1
            r1.t(r0, r9)
            goto L_0x0f0e
        L_0x0923:
            org.webrtc.SessionDescription$Type r1 = org.webrtc.SessionDescription.Type.ANSWER
            if (r3 != r1) goto L_0x0f0e
            if (r2 == 0) goto L_0x0f0e
            pe1 r1 = r11.t1
            dr9 r3 = new dr9
            r5 = 14
            r3.<init>(r5)
            dr9 r6 = new dr9
            r6.<init>(r5)
            dr9 r7 = new dr9
            r7.<init>(r5)
            dr9 r8 = new dr9
            r8.<init>(r5)
            dr9 r9 = new dr9
            r9.<init>(r5)
            dr9 r13 = new dr9
            r13.<init>(r5)
            pja r5 = new pja
            r20 = r5
            r21 = r0
            r22 = r3
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r9
            r27 = r13
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            ke1 r1 = r1.f(r5, r4)
            boolean r3 = r1.b()
            if (r3 == 0) goto L_0x0f0e
            wia r1 = r1.j
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L_0x0f0e
            pe1 r1 = r11.t1
            dr9 r3 = new dr9
            r5 = 14
            r3.<init>(r5)
            dr9 r6 = new dr9
            r6.<init>(r5)
            dr9 r7 = new dr9
            r7.<init>(r5)
            dr9 r8 = new dr9
            r8.<init>(r5)
            dr9 r9 = new dr9
            r9.<init>(r5)
            nfc r5 = new nfc
            r10 = 22
            r5.<init>(r10, r2)
            pja r2 = new pja
            r20 = r2
            r21 = r0
            r22 = r5
            r23 = r3
            r24 = r6
            r25 = r7
            r26 = r8
            r27 = r9
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r1.f(r2, r4)
            goto L_0x0f0e
        L_0x09b0:
            java.lang.String r2 = "candidate"
            boolean r2 = r0.has(r2)
            if (r2 != 0) goto L_0x0f0e
            java.lang.String r2 = "candidates-removed"
            boolean r0 = r0.has(r2)
            if (r0 != 0) goto L_0x0f0e
            xwb r0 = r11.Z0
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r3 = "transmitted.data.has.unknown.type"
            r2.<init>(r3)
            java.lang.String r3 = "unhandled.transmitted.data"
            r0.logException(r1, r3, r2)
            goto L_0x0f0e
        L_0x09d0:
            g41 r0 = defpackage.g41.z0
            r1 = 0
            r11.k(r0, r1)
            pe1 r0 = r11.t1
            ge1 r1 = defpackage.x87.J(r40)
            wia r2 = defpackage.x87.t(r40)
            java.lang.String r3 = "platform"
            java.lang.String r3 = r7.optString(r3)
            java.lang.String r4 = "clientType"
            java.lang.String r4 = r7.optString(r4)
            r0.l(r1, r2, r3, r4)
            goto L_0x0f0e
        L_0x09f1:
            qb1 r1 = r11.P1
            r1.getClass()
            r1.b(r7)     // Catch:{ JSONException -> 0x09fb }
            goto L_0x0f0e
        L_0x09fb:
            r0 = move-exception
            r2 = r0
            xwb r0 = r1.b
            java.lang.String r1 = "CallMediaOptionsDelegate"
            java.lang.String r3 = "can't handle mute participant"
            r0.logException(r1, r3, r2)
            goto L_0x0f0e
        L_0x0a08:
            km4 r0 = r11.Y1
            java.lang.Object r0 = r0.w0
            s5c r0 = (s5c) r0
            r0.m(r7)
            goto L_0x0f0e
        L_0x0a13:
            java.lang.String r0 = "mute"
            boolean r2 = r7.has(r0)
            if (r2 == 0) goto L_0x0a2d
            boolean r0 = r7.getBoolean(r0)
            if (r0 == 0) goto L_0x0a25
            g41 r0 = defpackage.g41.G0
        L_0x0a23:
            r1 = 0
            goto L_0x0a28
        L_0x0a25:
            g41 r0 = defpackage.g41.H0
            goto L_0x0a23
        L_0x0a28:
            r11.k(r0, r1)
            goto L_0x0f0e
        L_0x0a2d:
            java.lang.String r0 = "switch-micro without 'mute'"
            xwb r2 = r11.Z0
            r2.log(r1, r0)
            goto L_0x0f0e
        L_0x0a36:
            km4 r0 = r11.Y1
            java.lang.Object r0 = r0.X
            v2b r0 = (defpackage.v2b) r0
            r0.n(r7)
            goto L_0x0f0e
        L_0x0a41:
            java.lang.String r0 = "handleNewTopology"
            xwb r2 = r11.Z0
            r2.log(r1, r0)
            java.lang.String r0 = "topology"
            java.lang.String r0 = r7.getString(r0)
            ane r0 = defpackage.ane.a(r0)
            sl1 r1 = r11.x1
            boolean r1 = r1.H(r0)
            if (r1 != 0) goto L_0x0a5e
            r1 = 0
            r11.e(r0, r1)
        L_0x0a5e:
            sl1 r0 = r11.x1
            r11.c(r0)
            goto L_0x0f0e
        L_0x0a65:
            kz0 r0 = r11.e2
            r0.c(r7)
            goto L_0x0f0e
        L_0x0a6c:
            kz0 r0 = r11.e2
            r0.b(r7)
            goto L_0x0f0e
        L_0x0a73:
            zfd r0 = r11.X1
            lv1 r0 = r0.e
            ie1 r0 = r0.D(r7)
            if (r0 == 0) goto L_0x0f0e
            ob1 r1 = r11.a2
            sja r1 = r1.n
            ge1 r2 = r0.b
            r1.onStateChanged(r2, r0)
            goto L_0x0f0e
        L_0x0a88:
            r0 = r31
            java.lang.String r2 = "handleParticipantAdded"
            xwb r3 = r11.Z0
            r3.log(r1, r2)
            ge1 r1 = defpackage.x87.J(r40)
            org.json.JSONObject r0 = r7.optJSONObject(r0)
            pe1 r2 = r11.t1
            ke1 r2 = r2.a
            ge1 r2 = r2.a
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0f0e
            r11.y(r1, r0)
            goto L_0x0f0e
        L_0x0aaa:
            r0 = r27
            r5 = r33
            java.lang.String r0 = r7.optString(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0aba
            goto L_0x0f0e
        L_0x0aba:
            ge1 r0 = defpackage.ge1.a(r0)
            java.lang.String r1 = "unpin"
            r2 = 0
            boolean r1 = r7.optBoolean(r1, r2)
            qb1 r2 = r11.P1
            r2.i(r0, r1)
            boolean r2 = r7.has(r5)
            if (r2 == 0) goto L_0x0ad9
            int r2 = r7.optInt(r5)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0ada
        L_0x0ad9:
            r2 = 0
        L_0x0ada:
            if (r2 == 0) goto L_0x0af1
            int r3 = r2.intValue()
            if (r3 <= 0) goto L_0x0af1
            oj1 r3 = r11.c2
            v2d r4 = new v2d
            int r2 = r2.intValue()
            r4.<init>(r2)
            r3.b(r1, r0, r4)
            goto L_0x0af9
        L_0x0af1:
            if (r1 == 0) goto L_0x0af7
            r1 = 0
            r11.M1 = r1
            goto L_0x0af9
        L_0x0af7:
            r11.M1 = r0
        L_0x0af9:
            ge1 r0 = r11.M1
            r1 = r26
            r11.k(r1, r0)
            goto L_0x0f0e
        L_0x0b02:
            km4 r0 = r11.Y1
            java.lang.Object r0 = r0.o
            b0d r0 = (b0d) r0
            r0.u(r7)
            goto L_0x0f0e
        L_0x0b0d:
            km4 r0 = r11.Y1
            java.lang.Object r0 = r0.a
            wjf r0 = (defpackage.wjf) r0
            r0.h(r7)
            goto L_0x0f0e
        L_0x0b18:
            km4 r0 = r11.Y1
            java.lang.Object r0 = r0.Z
            jg8 r0 = (defpackage.jg8) r0
            r0.z(r7)
            goto L_0x0f0e
        L_0x0b23:
            km4 r0 = r11.Y1
            java.lang.Object r0 = r0.Y
            yxb r0 = (defpackage.yxb) r0
            r0.onRateCall(r7)
            goto L_0x0f0e
        L_0x0b2e:
            zfd r0 = r11.X1
            lv1 r0 = r0.e
            java.util.List r0 = r0.C(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x0b3a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0f0e
            java.lang.Object r1 = r0.next()
            ie1 r1 = (defpackage.ie1) r1
            ob1 r2 = r11.a2
            sja r2 = r2.n
            ge1 r3 = r1.b
            r2.onStateChanged(r3, r1)
            goto L_0x0b3a
        L_0x0b50:
            java.lang.String r9 = "handleConnection"
            xwb r13 = r11.Z0
            r13.log(r1, r9)
            org.json.JSONObject r1 = r7.getJSONObject(r14)
            org.json.JSONObject r0 = r7.optJSONObject(r0)
            kp0 r9 = r11.D1
            r9.getClass()
            if (r0 != 0) goto L_0x0b67
            goto L_0x0b73
        L_0x0b67:
            boolean r13 = r0.optBoolean(r15)
            r9.a = r13
            boolean r0 = r0.optBoolean(r6)
            r9.b = r0
        L_0x0b73:
            r11.g(r1)
            qb1 r14 = r11.P1
            java.lang.String r16 = "handleConnection"
            r19 = 1
            r15 = r1
            r18 = r4
            r14.m(r15, r16, r17, r18, r19)
            boolean r0 = r7.getBoolean(r8)
            r4 = 0
            r11.h(r1, r0, r4)
            r11.l(r7)
            java.lang.String r0 = "stamp"
            r8 = 0
            long r6 = r7.optLong(r0, r8)
            eje r0 = r11.J1
            wx3.E(r0, r6)
            boolean r0 = r11.O1
            if (r0 != 0) goto L_0x0bb8
            java.lang.String r0 = r1.getString(r2)
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0bb8
            qe4 r0 = r11.o2
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$ConversationAlreadyEnded r1 = ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.ConversationAlreadyEnded.INSTANCE
            r0.J(r1)
            r1 = 0
            r11.k(r3, r1)
            r11.p(r1, r5)
            goto L_0x0f0e
        L_0x0bb8:
            ru.ok.android.externcalls.sdk.b r0 = r11.f1
            if (r0 == 0) goto L_0x0bbf
            r0.a(r11)
        L_0x0bbf:
            boolean r0 = r11.O1
            if (r0 == 0) goto L_0x0bcf
            qb1 r0 = r11.P1
            r0.getClass()
            ac9 r1 = new ac9
            r1.<init>()
            r0.i = r1
        L_0x0bcf:
            qb1 r0 = r11.P1
            r0.k()
            g41 r0 = defpackage.g41.J0
            r1 = 0
            r11.k(r0, r1)
            boolean r0 = r11.M0
            if (r0 != 0) goto L_0x0bee
            boolean r0 = r11.F0
            if (r0 == 0) goto L_0x0bee
            fe1 r0 = r11.y0
            de1 r0 = r0.B
            boolean r0 = r0.j
            if (r0 == 0) goto L_0x0bee
            r11.C()
            goto L_0x0bf1
        L_0x0bee:
            r11.x()
        L_0x0bf1:
            sh5 r0 = r11.g2
            r0.d()
            goto L_0x0f0e
        L_0x0bf8:
            java.lang.String r0 = "chatId"
            long r0 = r7.getLong(r0)
            r11.j1 = r0
            g41 r2 = defpackage.g41.D0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11.k(r2, r0)
            goto L_0x0f0e
        L_0x0c0b:
            km4 r0 = r11.Y1
            java.lang.Object r0 = r0.a
            wjf r0 = (defpackage.wjf) r0
            r0.f(r7)
            goto L_0x0f0e
        L_0x0c16:
            r9 = r28
            r8 = r29
            java.lang.String r0 = "handleAcceptCallNotification"
            xwb r2 = r11.Z0
            r2.log(r1, r0)
            ge1 r0 = defpackage.x87.J(r40)
            pe1 r2 = r11.t1
            ke1 r2 = r2.a
            ge1 r2 = r2.a
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0c3e
            g41 r0 = defpackage.g41.o
            r1 = 0
            r11.k(r0, r1)
            java.lang.String r0 = "accepted.on.other.device"
            r11.p(r1, r0)
            goto L_0x0f0e
        L_0x0c3e:
            boolean r2 = r11.O0
            if (r2 != 0) goto L_0x0c5f
            android.os.Handler r2 = r11.w0
            lde r3 = r11.N0
            r2.removeCallbacks(r3)
            android.os.Handler r2 = r11.w0
            lde r3 = r11.N0
            fe1 r4 = r11.y0
            ee1 r4 = r4.b
            r4.getClass()
            r4 = 30000(0x7530, float:4.2039E-41)
            long r4 = (long) r4
            r2.postDelayed(r3, r4)
            sl1 r2 = r11.x1
            r2.J()
        L_0x0c5f:
            wjf r2 = r11.X0
            boolean r3 = r2.b
            if (r3 != 0) goto L_0x0c69
            r2.c()
            goto L_0x0c7c
        L_0x0c69:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "New accept from participantId="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            xwb r3 = r11.Z0
            r3.log(r1, r2)
        L_0x0c7c:
            qb1 r2 = r11.P1
            pe1 r3 = r11.t1
            w2d r3 = r3.k
            ac9 r3 = r2.h(r3)
            java.util.EnumMap r5 = r3.a()
            java.lang.String r4 = "handleAcceptCall"
            r6 = 1
            r10 = r1
            r1 = r2
            r2 = r40
            r3 = r0
            ac9 r1 = r1.f(r2, r3, r4, r5, r6)
            cc9 r2 = defpackage.x87.r(r40)
            if (r2 == 0) goto L_0x0d22
            boolean r3 = r2.f
            if (r3 == 0) goto L_0x0ca3
            r3 = r22
            goto L_0x0ca5
        L_0x0ca3:
            r3 = r21
        L_0x0ca5:
            r11.u(r8, r3)
            pe1 r3 = r11.t1     // Catch:{ IllegalStateException -> 0x0d08 }
            dr9 r4 = new dr9     // Catch:{ IllegalStateException -> 0x0d08 }
            r5 = 14
            r4.<init>(r5)     // Catch:{ IllegalStateException -> 0x0d08 }
            wia r5 = defpackage.x87.t(r40)     // Catch:{ IllegalStateException -> 0x0d08 }
            nfc r6 = new nfc     // Catch:{ IllegalStateException -> 0x0d08 }
            r8 = 22
            r6.<init>(r8, r5)     // Catch:{ IllegalStateException -> 0x0d08 }
            nfc r5 = new nfc     // Catch:{ IllegalStateException -> 0x0d08 }
            r5.<init>(r8, r1)     // Catch:{ IllegalStateException -> 0x0d08 }
            nfc r1 = new nfc     // Catch:{ IllegalStateException -> 0x0d08 }
            r1.<init>(r8, r2)     // Catch:{ IllegalStateException -> 0x0d08 }
            java.util.ArrayList r2 = defpackage.x87.B(r40)     // Catch:{ IllegalStateException -> 0x0d08 }
            nfc r13 = new nfc     // Catch:{ IllegalStateException -> 0x0d08 }
            r13.<init>(r8, r2)     // Catch:{ IllegalStateException -> 0x0d08 }
            y41 r2 = defpackage.x87.m(r40)     // Catch:{ IllegalStateException -> 0x0d08 }
            if (r2 == 0) goto L_0x0cda
            nfc r4 = new nfc     // Catch:{ IllegalStateException -> 0x0d08 }
            r4.<init>(r8, r2)     // Catch:{ IllegalStateException -> 0x0d08 }
        L_0x0cda:
            r31 = r4
            zfd r2 = r11.X1     // Catch:{ IllegalStateException -> 0x0d08 }
            b79 r2 = r2.a     // Catch:{ IllegalStateException -> 0x0d08 }
            pe1 r4 = r11.t1     // Catch:{ IllegalStateException -> 0x0d08 }
            w2d r4 = r4.k     // Catch:{ IllegalStateException -> 0x0d08 }
            java.util.List r2 = r2.h(r7, r4)     // Catch:{ IllegalStateException -> 0x0d08 }
            nfc r4 = new nfc     // Catch:{ IllegalStateException -> 0x0d08 }
            r7 = 22
            r4.<init>(r7, r2)     // Catch:{ IllegalStateException -> 0x0d08 }
            pja r2 = new pja     // Catch:{ IllegalStateException -> 0x0d08 }
            r25 = r2
            r26 = r0
            r27 = r6
            r28 = r5
            r29 = r1
            r30 = r13
            r32 = r4
            r25.<init>(r26, r27, r28, r29, r30, r31, r32)     // Catch:{ IllegalStateException -> 0x0d08 }
            r1 = 0
            r3.f(r2, r1)     // Catch:{ IllegalStateException -> 0x0d08 }
        L_0x0d06:
            r1 = 1
            goto L_0x0d11
        L_0x0d08:
            r0 = move-exception
            xwb r1 = r11.Z0
            java.lang.String r2 = "accept.call.add"
            r1.reportException(r10, r2, r0)
            goto L_0x0d06
        L_0x0d11:
            r11.w1 = r1
            boolean r0 = r11.F0
            if (r0 == 0) goto L_0x0d1b
            r1 = 0
            r11.k(r9, r1)
        L_0x0d1b:
            sh5 r0 = r11.g2
            r0.c()
            goto L_0x0f0e
        L_0x0d22:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = r40.toString()
            r0.<init>(r1)
            throw r0
        L_0x0d2c:
            r10 = r1
            r0 = r27
            java.lang.String r0 = r7.optString(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0d3b
            goto L_0x0f0e
        L_0x0d3b:
            ge1 r1 = defpackage.ge1.a(r0)
            java.lang.String r0 = "roles"
            org.json.JSONArray r2 = r7.optJSONArray(r0)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r2 == 0) goto L_0x0d6e
            r4 = 0
        L_0x0d4d:
            int r0 = r2.length()     // Catch:{ JSONException -> 0x0d60 }
            if (r4 >= r0) goto L_0x0d6e
            java.lang.String r0 = r2.getString(r4)     // Catch:{ JSONException -> 0x0d60 }
            je1 r0 = defpackage.je1.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x0d63 }
            r3.add(r0)     // Catch:{ IllegalArgumentException -> 0x0d63 }
        L_0x0d5e:
            r5 = 1
            goto L_0x0d6c
        L_0x0d60:
            r0 = move-exception
            r5 = 1
            goto L_0x0d70
        L_0x0d63:
            r0 = move-exception
            xwb r5 = r11.Z0     // Catch:{ JSONException -> 0x0d60 }
            java.lang.String r6 = "invalid ROLE in handleRolesChanged"
            r5.logException(r10, r6, r0)     // Catch:{ JSONException -> 0x0d60 }
            goto L_0x0d5e
        L_0x0d6c:
            int r4 = r4 + r5
            goto L_0x0d4d
        L_0x0d6e:
            r5 = 1
            goto L_0x0d77
        L_0x0d70:
            xwb r2 = r11.Z0
            java.lang.String r4 = "handleRolesChanged"
            r2.logException(r10, r4, r0)
        L_0x0d77:
            qb1 r0 = r11.P1
            r0.j(r3, r1)
            pe1 r0 = r11.t1
            ke1 r0 = r0.j(r1)
            if (r0 == 0) goto L_0x0db0
            java.util.ArrayList r1 = r0.d
            r1.clear()
            r1.addAll(r3)
            pe1 r1 = r11.t1
            ke1 r1 = r1.a
            if (r0 != r1) goto L_0x0db0
            oj1 r2 = r11.c2
            java.util.List r1 = r1.e
            java.util.Iterator r1 = r1.iterator()
        L_0x0d9a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0dac
            java.lang.Object r3 = r1.next()
            je1 r3 = (defpackage.je1) r3
            je1 r4 = defpackage.je1.b
            if (r3 != r4) goto L_0x0d9a
            r1 = r5
            goto L_0x0dad
        L_0x0dac:
            r1 = 0
        L_0x0dad:
            r2.c(r1)
        L_0x0db0:
            g41 r1 = defpackage.g41.K0
            r11.k(r1, r0)
            goto L_0x0f0e
        L_0x0db7:
            java.lang.String r0 = "target"
            java.lang.String r1 = "CONSUMER"
            java.lang.String r0 = r7.optString(r0, r1)
            boolean r0 = r1.equals(r0)
            fe1 r1 = r11.y0
            boolean r1 = r1.m
            if (r1 == 0) goto L_0x0dcb
            goto L_0x0f0e
        L_0x0dcb:
            sl1 r1 = r11.x1
            ane r2 = defpackage.ane.c
            boolean r1 = r1.H(r2)
            if (r1 == 0) goto L_0x0f0e
            if (r0 == 0) goto L_0x0ddc
            r1 = 0
            r11.e(r2, r1)
            goto L_0x0de3
        L_0x0ddc:
            sl1 r0 = r11.x1
            izc r0 = (defpackage.izc) r0
            r0.W()
        L_0x0de3:
            sl1 r0 = r11.x1
            r11.c(r0)
            goto L_0x0f0e
        L_0x0dea:
            wf1 r0 = r11.d2
            r0.c(r7)
            goto L_0x0f0e
        L_0x0df1:
            wf1 r0 = r11.d2
            r0.b(r7)
            goto L_0x0f0e
        L_0x0df8:
            java.lang.String r0 = "joinLink"
            java.lang.String r0 = r7.optString(r0)
            r11.J0 = r0
            g41 r1 = defpackage.g41.W0
            r11.k(r1, r0)
            goto L_0x0f0e
        L_0x0e07:
            r10 = r1
            r1 = r26
            java.lang.String r0 = "handleHungup"
            xwb r2 = r11.Z0
            r2.log(r10, r0)
            ge1 r0 = defpackage.x87.J(r40)
            pe1 r2 = r11.t1
            ke1 r2 = r2.a
            ge1 r2 = r2.a
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0e6b
            r2 = r25
            java.lang.String r1 = r7.getString(r2)
            java.lang.String r0 = "explanationHtml"
            java.lang.String r2 = r7.optString(r0)
            java.lang.String r0 = "We were removed from the conversation, reason = "
            java.lang.String r0 = defpackage.rf0.h(r0, r1)
            xwb r3 = r11.Z0
            r3.log(r10, r0)
            fe6 r0 = defpackage.fe6.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0e3d }
            goto L_0x0e43
        L_0x0e3d:
            r0 = move-exception
            r3 = r0
            r3.printStackTrace()
            r0 = 0
        L_0x0e43:
            r11.U0 = r0
            wfd r0 = defpackage.wfd.a(r1)
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason r0 = xy6.q(r0)
            qe4 r1 = r11.o2
            r1.J(r0)
            java.util.HashSet r0 = defpackage.x87.v0(r40)
            g41 r1 = defpackage.g41.c
            de6 r3 = new de6
            r3.<init>(r0, r2)
            r11.k(r1, r3)
            r1 = 0
            r11.O1 = r1
            java.lang.String r0 = "removed"
            r1 = 0
            r11.p(r1, r0)
            goto L_0x0f0e
        L_0x0e6b:
            ox3 r2 = r11.n1
            pe1 r3 = r11.t1
            ke1 r3 = r3.j(r0)
            if (r3 == 0) goto L_0x0e7d
            java.lang.Object r2 = r2.d
            java.util.Hashtable r2 = (java.util.Hashtable) r2
            r2.remove(r3)
            goto L_0x0e80
        L_0x0e7d:
            r2.getClass()
        L_0x0e80:
            pe1 r2 = r11.t1
            r2.getClass()
            java.util.List r3 = java.util.Collections.singletonList(r0)
            r4 = 0
            java.util.ArrayList r2 = r2.m(r4, r3)
            java.lang.Object r2 = o23.X(r2)
            ke1 r2 = (defpackage.ke1) r2
            ge1 r2 = r11.M1
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0f0e
            r11.M1 = r4
            r11.k(r1, r4)
            goto L_0x0f0e
        L_0x0ea3:
            km4 r0 = r11.Y1
            otf r0 = r0.e()
            r0.J(r7)
            goto L_0x0f0e
        L_0x0ead:
            r11.n(r7)
            goto L_0x0f0e
        L_0x0eb1:
            java.lang.String r0 = "options"
            org.json.JSONArray r0 = r7.getJSONArray(r0)
            r11.f(r0)
            goto L_0x0f0e
        L_0x0ebb:
            r10 = r1
            r2 = r25
            java.lang.String r0 = "handleCloseConversation"
            xwb r1 = r11.Z0
            r1.log(r10, r0)
            r1 = 0
            r11.w1 = r1
            java.lang.String r1 = r7.optString(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0ef2
            fe6 r2 = defpackage.fe6.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x0ed7 }
            goto L_0x0edd
        L_0x0ed7:
            r0 = move-exception
            r2 = r0
            r2.printStackTrace()     // Catch:{ IllegalArgumentException -> 0x0ee0 }
            r2 = 0
        L_0x0edd:
            r11.U0 = r2     // Catch:{ IllegalArgumentException -> 0x0ee0 }
            goto L_0x0ef2
        L_0x0ee0:
            xwb r0 = r11.Z0
            java.lang.Exception r2 = new java.lang.Exception
            java.lang.String r4 = "close.conversation.notify.unknown.reason."
            java.lang.String r4 = defpackage.rf0.h(r4, r1)
            r2.<init>(r4)
            java.lang.String r4 = "close.conversation.notify"
            r0.logException(r10, r4, r2)
        L_0x0ef2:
            wfd r0 = defpackage.wfd.a(r1)
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason r0 = xy6.q(r0)
            qe4 r1 = r11.o2
            r1.J(r0)
            r1 = 0
            r11.k(r3, r1)
            java.lang.String r0 = "conversation_closed"
            r11.p(r1, r0)
            goto L_0x0f0e
        L_0x0f09:
            bd4 r0 = r11.I1
            r0.getClass()
        L_0x0f0e:
            xw2 r0 = r11.S1
            java.lang.String r1 = "notification handling of "
            java.lang.String r1 = r1.concat(r12)
            r0.X(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw0.a(org.json.JSONObject):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fb, code lost:
        if (r8.contains(r10) != false) goto L_0x020b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(org.json.JSONObject r13) {
        /*
            r12 = this;
            int r0 = r12.a
            switch(r0) {
                case 0: goto L_0x006d;
                case 1: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            r12.a(r13)
            return
        L_0x0009:
            gx0 r12 = r12.b
            xwb r13 = r12.Z0
            java.lang.String r0 = "OKRTCCall"
            java.lang.String r1 = "onAcceptedCommandSent"
            r13.log(r0, r1)
            wjf r13 = r12.X0
            boolean r0 = r13.b
            if (r0 != 0) goto L_0x001d
            r13.c()
        L_0x001d:
            sl1 r13 = r12.x1
            r12.c(r13)
            boolean r13 = r12.O0
            if (r13 != 0) goto L_0x003c
            android.os.Handler r13 = r12.w0
            fe1 r0 = r12.y0
            ee1 r0 = r0.b
            r0.getClass()
            r0 = 30000(0x7530, float:4.2039E-41)
            long r0 = (long) r0
            lde r2 = r12.N0
            r13.postDelayed(r2, r0)
            sl1 r13 = r12.x1
            r13.J()
        L_0x003c:
            g41 r13 = defpackage.g41.y0
            r0 = 0
            r12.k(r13, r0)
            sh5 r12 = r12.g2
            k40 r13 = r12.d
            r13.e()
            re4 r12 = r12.f
            boolean r13 = r12.b
            if (r13 == 0) goto L_0x0050
            goto L_0x006c
        L_0x0050:
            boolean r13 = r12.a
            if (r13 == 0) goto L_0x0055
            goto L_0x006c
        L_0x0055:
            java.lang.Object r13 = r12.c
            eje r13 = (defpackage.eje) r13
            fje r13 = (defpackage.fje) r13
            r13.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r13 = java.lang.Long.valueOf(r0)
            r12.h = r13
            java.lang.String r13 = "server_incoming"
            r12.g = r13
        L_0x006c:
            return
        L_0x006d:
            gx0 r12 = r12.b
            r12.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "handleSignalingError, "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            xwb r1 = r12.Z0
            java.lang.String r2 = "OKRTCCall"
            r1.log(r2, r0)
            java.lang.String r0 = "type"
            java.lang.String r0 = r13.optString(r0)
            java.lang.String r3 = "error"
            java.lang.String r4 = r13.optString(r3)
            java.lang.String r5 = "reason"
            java.lang.String r5 = r13.optString(r5)
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0232
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "rtc.error."
            r0.<init>(r3)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r12.v(r0)
            java.lang.String r0 = "conversation-ended"
            boolean r0 = r0.equals(r4)
            r3 = 0
            qe4 r6 = r12.o2
            java.lang.String r7 = "signaling.error."
            if (r0 != 0) goto L_0x020b
            java.lang.String r0 = "conversation-not-found"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x020b
            java.lang.String r0 = "illegal-conversation-state"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x020b
            java.lang.String r0 = "no-call"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x020b
            java.lang.String r0 = "call-unfeasible"
            boolean r8 = r0.equals(r4)
            java.lang.String r9 = "status"
            if (r8 == 0) goto L_0x00ff
            d51 r8 = defpackage.d51.c
            d51 r10 = defpackage.d51.a
            d51 r11 = defpackage.d51.b
            d51[] r8 = new defpackage.d51[]{r8, r10, r11}
            java.util.List r8 = java.util.Arrays.asList(r8)
            java.lang.String r10 = r13.optString(r9)
            d51 r10 = defpackage.d51.valueOf(r10)     // Catch:{ Exception -> 0x00f6 }
            goto L_0x00f7
        L_0x00f6:
            r10 = r3
        L_0x00f7:
            boolean r8 = r8.contains(r10)
            if (r8 == 0) goto L_0x00ff
            goto L_0x020b
        L_0x00ff:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0128
            java.lang.String r0 = r13.optString(r9)
            defpackage.d51.valueOf(r0)     // Catch:{ Exception -> 0x010c }
        L_0x010c:
            g41 r0 = defpackage.g41.I0
            ru.ok.android.webrtc.SignalingErrors$CallIsUnfeasibleError r1 = new ru.ok.android.webrtc.SignalingErrors$CallIsUnfeasibleError
            java.lang.String r2 = "message"
            java.lang.String r2 = r13.optString(r2)
            java.lang.String r3 = "stamp"
            r13.getLong(r3)
            java.lang.String r3 = "sequence"
            r13.getLong(r3)
            r1.<init>(r2)
            r12.k(r0, r1)
            goto L_0x0232
        L_0x0128:
            java.lang.String r0 = "invalid-token"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x013c
            mfd r13 = r12.Z
            r13.g()
            g41 r13 = defpackage.g41.x0
            r12.k(r13, r3)
            goto L_0x0232
        L_0x013c:
            java.lang.String r0 = "service-unavailable"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0155
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r7)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            r12.o(r13)
            goto L_0x0232
        L_0x0155:
            java.lang.String r0 = "illegal-participant-state"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0188
            java.lang.String r0 = "state"
            java.lang.String r13 = r13.optString(r0)
            java.lang.String r0 = "ACCEPTED"
            boolean r13 = r0.equals(r13)
            if (r13 == 0) goto L_0x0177
            g41 r13 = defpackage.g41.o
            r12.k(r13, r3)
            java.lang.String r13 = "accepted.on.other.device.error"
            r12.p(r3, r13)
            goto L_0x0232
        L_0x0177:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r7)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            r12.o(r13)
            goto L_0x0232
        L_0x0188:
            java.lang.String r0 = "conversation-recording"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x019f
            pf3 r12 = r12.h1
            if (r12 == 0) goto L_0x0232
            java.lang.String r0 = "description"
            java.lang.String r13 = r13.optString(r0)
            r12.accept(r13)
            goto L_0x0232
        L_0x019f:
            java.lang.String r0 = "invalid-request"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x01ae
            java.lang.String r13 = "invalid.request"
            r12.o(r13)
            goto L_0x0232
        L_0x01ae:
            java.lang.String r0 = "gen.obsoleteClient"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x01fb
            fe6 r0 = defpackage.fe6.Y
            r12.U0 = r0
            java.lang.String r0 = "explanationHtml"
            java.lang.String r13 = r13.optString(r0)
            if (r13 == 0) goto L_0x01c8
            de6 r0 = new de6
            r0.<init>(r3, r13)
            goto L_0x01c9
        L_0x01c8:
            r0 = r3
        L_0x01c9:
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$ObsoleteClient r1 = new ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$ObsoleteClient
            r1.<init>(r13)
            r6.J(r1)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r7)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            g41 r1 = defpackage.g41.c
            r12.k(r1, r0)
            mfd r0 = r12.Z
            if (r0 == 0) goto L_0x01e9
            r0.g()
        L_0x01e9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "conversation_ended."
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.p(r3, r13)
            goto L_0x0232
        L_0x01fb:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r7)
            r12.append(r4)
            java.lang.String r12 = r12.toString()
            r1.log(r2, r12)
            goto L_0x0232
        L_0x020b:
            if (r5 == 0) goto L_0x0223
            fe6 r3 = defpackage.fe6.valueOf(r5)     // Catch:{ IllegalArgumentException -> 0x0212 }
            goto L_0x0216
        L_0x0212:
            r13 = move-exception
            r13.printStackTrace()
        L_0x0216:
            r12.U0 = r3
            wfd r13 = defpackage.wfd.a(r5)
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason r13 = xy6.q(r13)
            r6.J(r13)
        L_0x0223:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r7)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            r12.o(r13)
        L_0x0232:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nw0.k(org.json.JSONObject):void");
    }
}
