package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: vt  reason: default package */
public final class vt extends lbe {
    public Map X;
    public Map Y;
    public List Z;
    public long c;
    public List o;
    public Map w0;
    public Map x0;

    public vt(ws8 ws8) {
        super(ws8);
        if (this.o == null) {
            this.o = Collections.emptyList();
        }
        if (this.X == null) {
            this.X = Collections.emptyMap();
        }
        if (this.Y == null) {
            this.Y = Collections.emptyMap();
        }
        if (this.Z == null) {
            this.Z = Collections.emptyList();
        }
        if (this.w0 == null) {
            this.w0 = Collections.emptyMap();
        }
        if (this.x0 == null) {
            this.x0 = Collections.emptyMap();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v74, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r15v0, types: [usc, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(defpackage.ws8 r18, java.lang.String r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = 7
            r9 = 1
            r19.getClass()
            r10 = -1
            int r11 = r19.hashCode()
            switch(r11) {
                case -547617843: goto L_0x0055;
                case -482852420: goto L_0x004a;
                case 3545755: goto L_0x003f;
                case 636558612: goto L_0x0034;
                case 947936814: goto L_0x0029;
                case 1236976677: goto L_0x001e;
                case 2001882648: goto L_0x0013;
                default: goto L_0x0011;
            }
        L_0x0011:
            r1 = r10
            goto L_0x005f
        L_0x0013:
            java.lang.String r11 = "stickersOrder"
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x001c
            goto L_0x0011
        L_0x001c:
            r1 = 6
            goto L_0x005f
        L_0x001e:
            java.lang.String r11 = "animojiSetUpdates"
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x0027
            goto L_0x0011
        L_0x0027:
            r1 = 5
            goto L_0x005f
        L_0x0029:
            java.lang.String r11 = "sections"
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x0032
            goto L_0x0011
        L_0x0032:
            r1 = 4
            goto L_0x005f
        L_0x0034:
            java.lang.String r11 = "stickersUpdates"
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x003d
            goto L_0x0011
        L_0x003d:
            r1 = 3
            goto L_0x005f
        L_0x003f:
            java.lang.String r11 = "sync"
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x0048
            goto L_0x0011
        L_0x0048:
            r1 = 2
            goto L_0x005f
        L_0x004a:
            java.lang.String r11 = "stickerSetsUpdates"
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x0053
            goto L_0x0011
        L_0x0053:
            r1 = r9
            goto L_0x005f
        L_0x0055:
            java.lang.String r11 = "animojiUpdates"
            boolean r1 = r1.equals(r11)
            if (r1 != 0) goto L_0x005e
            goto L_0x0011
        L_0x005e:
            r1 = 0
        L_0x005f:
            switch(r1) {
                case 0: goto L_0x02d1;
                case 1: goto L_0x02c8;
                case 2: goto L_0x02bf;
                case 3: goto L_0x02b6;
                case 4: goto L_0x0077;
                case 5: goto L_0x006f;
                case 6: goto L_0x0067;
                default: goto L_0x0062;
            }
        L_0x0062:
            r18.z()
            goto L_0x02d9
        L_0x0067:
            zy r1 = defpackage.zy.g(r18)
            r0.Z = r1
            goto L_0x02d9
        L_0x006f:
            rp4 r1 = rp4.a(r18)
            r0.x0 = r1
            goto L_0x02d9
        L_0x0077:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.o = r1
            int r1 = jjd.D(r18)
            r11 = 0
        L_0x0083:
            if (r11 >= r1) goto L_0x02d9
            java.util.List r12 = r0.o
            int r13 = jjd.K(r18)
            r14 = 0
            if (r13 != 0) goto L_0x0092
            r6 = r18
            goto L_0x02b0
        L_0x0092:
            usc r15 = new usc
            r15.<init>()
            r3 = 0
        L_0x0098:
            if (r3 >= r13) goto L_0x026d
            java.lang.String r4 = r18.z0()
            r4.getClass()
            int r16 = r4.hashCode()
            switch(r16) {
                case -2005455306: goto L_0x0149;
                case -1122997398: goto L_0x013d;
                case -1081306054: goto L_0x0131;
                case -731385813: goto L_0x0125;
                case -310976023: goto L_0x011a;
                case -295931082: goto L_0x010f;
                case 3355: goto L_0x0104;
                case 3357091: goto L_0x00f9;
                case 3575610: goto L_0x00ec;
                case 110371416: goto L_0x00df;
                case 1439391635: goto L_0x00d2;
                case 1531715286: goto L_0x00c5;
                case 1596679982: goto L_0x00b8;
                case 1880183383: goto L_0x00ab;
                default: goto L_0x00a8;
            }
        L_0x00a8:
            r4 = r10
            goto L_0x0154
        L_0x00ab:
            java.lang.String r5 = "collapsed"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00b4
            goto L_0x00a8
        L_0x00b4:
            r4 = 13
            goto L_0x0154
        L_0x00b8:
            java.lang.String r5 = "stickerSets"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00c1
            goto L_0x00a8
        L_0x00c1:
            r4 = 12
            goto L_0x0154
        L_0x00c5:
            java.lang.String r5 = "stickers"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00ce
            goto L_0x00a8
        L_0x00ce:
            r4 = 11
            goto L_0x0154
        L_0x00d2:
            java.lang.String r5 = "animojiSetIds"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00db
            goto L_0x00a8
        L_0x00db:
            r4 = 10
            goto L_0x0154
        L_0x00df:
            java.lang.String r5 = "title"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00e8
            goto L_0x00a8
        L_0x00e8:
            r4 = 9
            goto L_0x0154
        L_0x00ec:
            java.lang.String r5 = "type"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x00f5
            goto L_0x00a8
        L_0x00f5:
            r4 = 8
            goto L_0x0154
        L_0x00f9:
            java.lang.String r5 = "mode"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0102
            goto L_0x00a8
        L_0x0102:
            r4 = r2
            goto L_0x0154
        L_0x0104:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x010d
            goto L_0x00a8
        L_0x010d:
            r4 = 6
            goto L_0x0154
        L_0x010f:
            java.lang.String r5 = "updateTime"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0118
            goto L_0x00a8
        L_0x0118:
            r4 = 5
            goto L_0x0154
        L_0x011a:
            java.lang.String r5 = "recentEmojiList"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0123
            goto L_0x00a8
        L_0x0123:
            r4 = 4
            goto L_0x0154
        L_0x0125:
            java.lang.String r5 = "totalCount"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x012f
            goto L_0x00a8
        L_0x012f:
            r4 = 3
            goto L_0x0154
        L_0x0131:
            java.lang.String r5 = "marker"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x013b
            goto L_0x00a8
        L_0x013b:
            r4 = 2
            goto L_0x0154
        L_0x013d:
            java.lang.String r5 = "reactions"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0147
            goto L_0x00a8
        L_0x0147:
            r4 = r9
            goto L_0x0154
        L_0x0149:
            java.lang.String r5 = "recentsList"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x0153
            goto L_0x00a8
        L_0x0153:
            r4 = 0
        L_0x0154:
            switch(r4) {
                case 0: goto L_0x0243;
                case 1: goto L_0x023a;
                case 2: goto L_0x0231;
                case 3: goto L_0x0228;
                case 4: goto L_0x01fb;
                case 5: goto L_0x01ef;
                case 6: goto L_0x01e7;
                case 7: goto L_0x01df;
                case 8: goto L_0x0181;
                case 9: goto L_0x017a;
                case 10: goto L_0x0173;
                case 11: goto L_0x016c;
                case 12: goto L_0x0165;
                case 13: goto L_0x015e;
                default: goto L_0x0157;
            }
        L_0x0157:
            r18.z()
        L_0x015a:
            r6 = r18
            goto L_0x026a
        L_0x015e:
            boolean r4 = jjd.E(r18)
            r15.i = r4
            goto L_0x015a
        L_0x0165:
            zy r4 = defpackage.zy.d(r18)
            r15.e = r4
            goto L_0x015a
        L_0x016c:
            zy r4 = defpackage.zy.d(r18)
            r15.d = r4
            goto L_0x015a
        L_0x0173:
            zy r4 = defpackage.zy.d(r18)
            r15.n = r4
            goto L_0x015a
        L_0x017a:
            java.lang.String r4 = jjd.M(r18)
            r15.c = r4
            goto L_0x015a
        L_0x0181:
            java.lang.String r4 = jjd.M(r18)
            r4.getClass()
            int r5 = r4.hashCode()
            switch(r5) {
                case -1980625194: goto L_0x01bd;
                case -84882903: goto L_0x01b2;
                case 315790899: goto L_0x01a7;
                case 1800278360: goto L_0x019c;
                case 1850562867: goto L_0x0191;
                default: goto L_0x018f;
            }
        L_0x018f:
            r4 = r10
            goto L_0x01c7
        L_0x0191:
            java.lang.String r5 = "ANIMOJI_SETS"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x019a
            goto L_0x018f
        L_0x019a:
            r4 = 4
            goto L_0x01c7
        L_0x019c:
            java.lang.String r5 = "RECENTS"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x01a5
            goto L_0x018f
        L_0x01a5:
            r4 = 3
            goto L_0x01c7
        L_0x01a7:
            java.lang.String r5 = "STICKER_SETS"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x01b0
            goto L_0x018f
        L_0x01b0:
            r4 = 2
            goto L_0x01c7
        L_0x01b2:
            java.lang.String r5 = "REACTION"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x01bb
            goto L_0x018f
        L_0x01bb:
            r4 = r9
            goto L_0x01c7
        L_0x01bd:
            java.lang.String r5 = "STICKERS"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x01c6
            goto L_0x018f
        L_0x01c6:
            r4 = 0
        L_0x01c7:
            switch(r4) {
                case 0: goto L_0x01d9;
                case 1: goto L_0x01d6;
                case 2: goto L_0x01d3;
                case 3: goto L_0x01d0;
                case 4: goto L_0x01cd;
                default: goto L_0x01ca;
            }
        L_0x01ca:
            bqc r4 = defpackage.bqc.Y
            goto L_0x01db
        L_0x01cd:
            bqc r4 = defpackage.bqc.z0
            goto L_0x01db
        L_0x01d0:
            bqc r4 = defpackage.bqc.x0
            goto L_0x01db
        L_0x01d3:
            bqc r4 = defpackage.bqc.w0
            goto L_0x01db
        L_0x01d6:
            bqc r4 = defpackage.bqc.y0
            goto L_0x01db
        L_0x01d9:
            bqc r4 = defpackage.bqc.Z
        L_0x01db:
            r15.a = r4
            goto L_0x015a
        L_0x01df:
            java.lang.String r4 = jjd.M(r18)
            r15.m = r4
            goto L_0x015a
        L_0x01e7:
            java.lang.String r4 = jjd.M(r18)
            r15.b = r4
            goto L_0x015a
        L_0x01ef:
            r4 = 0
            r6 = r18
            long r4 = jjd.J(r6, r4)
            r15.j = r4
            goto L_0x026a
        L_0x01fb:
            r6 = r18
            sp8 r4 = r18.n()
            int r4 = r4.a()
            if (r4 != r2) goto L_0x021e
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r18.s0()
            r7 = 0
        L_0x0211:
            if (r7 >= r5) goto L_0x0225
            e2c r8 = defpackage.e2c.a(r18)
            if (r8 == 0) goto L_0x021c
            r4.add(r8)
        L_0x021c:
            int r7 = r7 + r9
            goto L_0x0211
        L_0x021e:
            r18.z()
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x0225:
            r15.k = r4
            goto L_0x026a
        L_0x0228:
            r6 = r18
            int r4 = jjd.I(r18)
            r15.h = r4
            goto L_0x026a
        L_0x0231:
            r6 = r18
            long r4 = r18.w0()
            r15.g = r4
            goto L_0x026a
        L_0x023a:
            r6 = r18
            zy r4 = defpackage.zy.d(r18)
            r15.f = r4
            goto L_0x026a
        L_0x0243:
            r6 = r18
            sp8 r4 = r18.n()
            int r4 = r4.a()
            if (r4 != r2) goto L_0x0264
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r18.s0()
            r7 = 0
        L_0x0259:
            if (r7 >= r5) goto L_0x0268
            g2c r8 = defpackage.g2c.a(r18)
            r4.add(r8)
            int r7 = r7 + r9
            goto L_0x0259
        L_0x0264:
            r18.z()
            r4 = r14
        L_0x0268:
            r15.l = r4
        L_0x026a:
            int r3 = r3 + r9
            goto L_0x0098
        L_0x026d:
            r6 = r18
            java.util.List r3 = r15.d
            if (r3 != 0) goto L_0x0279
            java.util.List r3 = java.util.Collections.emptyList()
            r15.d = r3
        L_0x0279:
            java.util.List r3 = r15.e
            if (r3 != 0) goto L_0x0283
            java.util.List r3 = java.util.Collections.emptyList()
            r15.e = r3
        L_0x0283:
            java.util.List r3 = r15.k
            if (r3 != 0) goto L_0x028d
            java.util.List r3 = java.util.Collections.emptyList()
            r15.k = r3
        L_0x028d:
            java.util.List r3 = r15.l
            if (r3 != 0) goto L_0x0297
            java.util.List r3 = java.util.Collections.emptyList()
            r15.l = r3
        L_0x0297:
            java.util.List r3 = r15.f
            if (r3 != 0) goto L_0x02a1
            java.util.List r3 = java.util.Collections.emptyList()
            r15.f = r3
        L_0x02a1:
            java.util.List r3 = r15.n
            if (r3 != 0) goto L_0x02ab
            java.util.List r3 = java.util.Collections.emptyList()
            r15.n = r3
        L_0x02ab:
            vsc r14 = new vsc
            r14.<init>(r15)
        L_0x02b0:
            r12.add(r14)
            int r11 = r11 + r9
            goto L_0x0083
        L_0x02b6:
            r6 = r18
            rp4 r1 = rp4.a(r18)
            r0.X = r1
            goto L_0x02d9
        L_0x02bf:
            r6 = r18
            long r1 = r18.w0()
            r0.c = r1
            goto L_0x02d9
        L_0x02c8:
            r6 = r18
            rp4 r1 = rp4.a(r18)
            r0.Y = r1
            goto L_0x02d9
        L_0x02d1:
            r6 = r18
            rp4 r1 = rp4.a(r18)
            r0.w0 = r1
        L_0x02d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt.b(ws8, java.lang.String):void");
    }

    public final String toString() {
        long j = this.c;
        int p = ete.p(this.o);
        int R = ete.R(this.X);
        int R2 = ete.R(this.Y);
        int p2 = ete.p(this.Z);
        int R3 = ete.R(this.w0);
        int R4 = ete.R(this.x0);
        return "{sync=" + j + ", sections=" + p + ", stickersUpdates=" + R + ", stickersSetsUpdates=" + R2 + ", stickersOrder=" + p2 + ", animojiUpdates=" + R3 + ", animojiSetsUpdates=" + R4 + "}";
    }
}
