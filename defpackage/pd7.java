package defpackage;

/* renamed from: pd7  reason: default package */
public final class pd7 extends lbe {
    public ym8 X;
    public String Y;
    public zc6 Z;
    public j22 c;
    public gn3 o;
    public s2f w0;
    public ytd x0;

    public pd7(ws8 ws8) {
        super(ws8);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.ws8 r13, java.lang.String r14) {
        /*
            r12 = this;
            r0 = 6
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            r14.getClass()
            r7 = -1
            int r8 = r14.hashCode()
            switch(r8) {
                case -1195420187: goto L_0x0056;
                case -921148724: goto L_0x004b;
                case 3052376: goto L_0x0040;
                case 3599307: goto L_0x0035;
                case 98629247: goto L_0x002a;
                case 954925063: goto L_0x001f;
                case 1958352887: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            r14 = r7
            goto L_0x0060
        L_0x0014:
            java.lang.String r8 = "videoConference"
            boolean r14 = r14.equals(r8)
            if (r14 != 0) goto L_0x001d
            goto L_0x0012
        L_0x001d:
            r14 = r0
            goto L_0x0060
        L_0x001f:
            java.lang.String r8 = "message"
            boolean r14 = r14.equals(r8)
            if (r14 != 0) goto L_0x0028
            goto L_0x0012
        L_0x0028:
            r14 = r1
            goto L_0x0060
        L_0x002a:
            java.lang.String r8 = "group"
            boolean r14 = r14.equals(r8)
            if (r14 != 0) goto L_0x0033
            goto L_0x0012
        L_0x0033:
            r14 = r2
            goto L_0x0060
        L_0x0035:
            java.lang.String r8 = "user"
            boolean r14 = r14.equals(r8)
            if (r14 != 0) goto L_0x003e
            goto L_0x0012
        L_0x003e:
            r14 = r3
            goto L_0x0060
        L_0x0040:
            java.lang.String r8 = "chat"
            boolean r14 = r14.equals(r8)
            if (r14 != 0) goto L_0x0049
            goto L_0x0012
        L_0x0049:
            r14 = r4
            goto L_0x0060
        L_0x004b:
            java.lang.String r8 = "startPayload"
            boolean r14 = r14.equals(r8)
            if (r14 != 0) goto L_0x0054
            goto L_0x0012
        L_0x0054:
            r14 = r5
            goto L_0x0060
        L_0x0056:
            java.lang.String r8 = "stickerSet"
            boolean r14 = r14.equals(r8)
            if (r14 != 0) goto L_0x005f
            goto L_0x0012
        L_0x005f:
            r14 = r6
        L_0x0060:
            switch(r14) {
                case 0: goto L_0x0148;
                case 1: goto L_0x0141;
                case 2: goto L_0x013a;
                case 3: goto L_0x0133;
                case 4: goto L_0x012c;
                case 5: goto L_0x0125;
                case 6: goto L_0x0068;
                default: goto L_0x0063;
            }
        L_0x0063:
            r13.z()
            goto L_0x014e
        L_0x0068:
            int r14 = jjd.K(r13)
            if (r14 != 0) goto L_0x0071
            r13 = 0
            goto L_0x0122
        L_0x0071:
            pjc r8 = new pjc
            r8.<init>()
            r9 = r6
        L_0x0077:
            if (r9 >= r14) goto L_0x0111
            java.lang.String r10 = r13.z0()
            r10.getClass()
            int r11 = r10.hashCode()
            switch(r11) {
                case -1897186251: goto L_0x00cb;
                case -1401988028: goto L_0x00c0;
                case -794658985: goto L_0x00b5;
                case -172815863: goto L_0x00aa;
                case 106164915: goto L_0x009f;
                case 265384045: goto L_0x0094;
                case 1867394383: goto L_0x0089;
                default: goto L_0x0087;
            }
        L_0x0087:
            r10 = r7
            goto L_0x00d5
        L_0x0089:
            java.lang.String r11 = "participantsCount"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x0092
            goto L_0x0087
        L_0x0092:
            r10 = r0
            goto L_0x00d5
        L_0x0094:
            java.lang.String r11 = "previewParticipantIds"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x009d
            goto L_0x0087
        L_0x009d:
            r10 = r1
            goto L_0x00d5
        L_0x009f:
            java.lang.String r11 = "owner"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x00a8
            goto L_0x0087
        L_0x00a8:
            r10 = r2
            goto L_0x00d5
        L_0x00aa:
            java.lang.String r11 = "callName"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x00b3
            goto L_0x0087
        L_0x00b3:
            r10 = r3
            goto L_0x00d5
        L_0x00b5:
            java.lang.String r11 = "conferenceId"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x00be
            goto L_0x0087
        L_0x00be:
            r10 = r4
            goto L_0x00d5
        L_0x00c0:
            java.lang.String r11 = "joinLink"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x00c9
            goto L_0x0087
        L_0x00c9:
            r10 = r5
            goto L_0x00d5
        L_0x00cb:
            java.lang.String r11 = "startAt"
            boolean r10 = r10.equals(r11)
            if (r10 != 0) goto L_0x00d4
            goto L_0x0087
        L_0x00d4:
            r10 = r6
        L_0x00d5:
            switch(r10) {
                case 0: goto L_0x0106;
                case 1: goto L_0x00ff;
                case 2: goto L_0x00f8;
                case 3: goto L_0x00f1;
                case 4: goto L_0x00ea;
                case 5: goto L_0x00e3;
                case 6: goto L_0x00dc;
                default: goto L_0x00d8;
            }
        L_0x00d8:
            r13.z()
            goto L_0x010e
        L_0x00dc:
            int r10 = jjd.I(r13)
            r8.b = r10
            goto L_0x010e
        L_0x00e3:
            zy r10 = defpackage.zy.d(r13)
            r8.h = r10
            goto L_0x010e
        L_0x00ea:
            uj3 r10 = defpackage.uj3.e(r13)
            r8.d = r10
            goto L_0x010e
        L_0x00f1:
            java.lang.String r10 = jjd.M(r13)
            r8.f = r10
            goto L_0x010e
        L_0x00f8:
            java.lang.String r10 = jjd.M(r13)
            r8.g = r10
            goto L_0x010e
        L_0x00ff:
            java.lang.String r10 = jjd.M(r13)
            r8.e = r10
            goto L_0x010e
        L_0x0106:
            r10 = 0
            long r10 = jjd.J(r13, r10)
            r8.c = r10
        L_0x010e:
            int r9 = r9 + r5
            goto L_0x0077
        L_0x0111:
            java.lang.Object r13 = r8.h
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L_0x011d
            java.util.List r13 = java.util.Collections.emptyList()
            r8.h = r13
        L_0x011d:
            s2f r13 = new s2f
            r13.<init>(r8)
        L_0x0122:
            r12.w0 = r13
            goto L_0x014e
        L_0x0125:
            ym8 r13 = hhd.H(r13)
            r12.X = r13
            goto L_0x014e
        L_0x012c:
            zc6 r13 = defpackage.zc6.a(r13)
            r12.Z = r13
            goto L_0x014e
        L_0x0133:
            gn3 r13 = defpackage.gn3.a(r13)
            r12.o = r13
            goto L_0x014e
        L_0x013a:
            j22 r13 = defpackage.j22.a(r13)
            r12.c = r13
            goto L_0x014e
        L_0x0141:
            java.lang.String r13 = jjd.M(r13)
            r12.Y = r13
            goto L_0x014e
        L_0x0148:
            ytd r13 = defpackage.ytd.a(r13)
            r12.x0 = r13
        L_0x014e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd7.b(ws8, java.lang.String):void");
    }

    public final String toString() {
        j22 j22 = this.c;
        gn3 gn3 = this.o;
        ym8 ym8 = this.X;
        String str = this.Y;
        zc6 zc6 = this.Z;
        s2f s2f = this.w0;
        ytd ytd = this.x0;
        return "Response{chat=" + j22 + ", contactSearchResult=" + gn3 + ", message=" + ym8 + ", startPayload='" + str + "', groupChatInfo=" + zc6 + ", videoConference=" + s2f + ", stickerSet=" + ytd + "}";
    }
}
