package defpackage;

import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: sh  reason: default package */
public final class sh extends lz4 {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sh(aec aec, int i) {
        super(aec);
        this.o = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v73, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v86, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v114, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v180 */
    /* JADX WARNING: type inference failed for: r2v181 */
    /* JADX WARNING: type inference failed for: r2v182 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A(yz5 r23, java.lang.Object r24) {
        /*
            r22 = this;
            r0 = r23
            r2 = 0
            r3 = 12
            r4 = 13
            r5 = 11
            r6 = 10
            r7 = 9
            r8 = 8
            r9 = 7
            r10 = 6
            r11 = 5
            r12 = 4
            r13 = 3
            r14 = 2
            r15 = 1
            r1 = r22
            int r1 = r1.o
            switch(r1) {
                case 0: goto L_0x0742;
                case 1: goto L_0x06fe;
                case 2: goto L_0x06de;
                case 3: goto L_0x06ba;
                case 4: goto L_0x06b6;
                case 5: goto L_0x069b;
                case 6: goto L_0x063f;
                case 7: goto L_0x0630;
                case 8: goto L_0x0621;
                case 9: goto L_0x05ae;
                case 10: goto L_0x059f;
                case 11: goto L_0x053c;
                case 12: goto L_0x04c8;
                case 13: goto L_0x04b9;
                case 14: goto L_0x047a;
                case 15: goto L_0x041f;
                case 16: goto L_0x0400;
                case 17: goto L_0x03d7;
                case 18: goto L_0x037e;
                case 19: goto L_0x02cc;
                case 20: goto L_0x02b7;
                case 21: goto L_0x02a3;
                case 22: goto L_0x024d;
                case 23: goto L_0x01f9;
                case 24: goto L_0x0149;
                case 25: goto L_0x012d;
                case 26: goto L_0x00ab;
                case 27: goto L_0x0063;
                case 28: goto L_0x0038;
                default: goto L_0x001d;
            }
        L_0x001d:
            r1 = r24
            ntf r1 = (ntf) r1
            java.lang.String r2 = r1.a
            if (r2 != 0) goto L_0x0029
            r0.W(r15)
            goto L_0x002c
        L_0x0029:
            r0.f(r15, r2)
        L_0x002c:
            java.lang.String r1 = r1.b
            if (r1 != 0) goto L_0x0034
            r0.W(r14)
            goto L_0x0037
        L_0x0034:
            r0.f(r14, r1)
        L_0x0037:
            return
        L_0x0038:
            r1 = r24
            ahf r1 = (defpackage.ahf) r1
            long r2 = r1.a
            r0.j(r15, r2)
            long r2 = r1.b
            r0.j(r14, r2)
            long r2 = r1.c
            r0.j(r13, r2)
            java.lang.String r2 = r1.d
            if (r2 != 0) goto L_0x0053
            r0.W(r12)
            goto L_0x0056
        L_0x0053:
            r0.f(r12, r2)
        L_0x0056:
            boolean r2 = r1.e
            long r2 = (long) r2
            r0.j(r11, r2)
            boolean r1 = r1.f
            long r1 = (long) r1
            r0.j(r10, r1)
            return
        L_0x0063:
            r1 = r24
            c3f r1 = (defpackage.c3f) r1
            boolean r2 = r1.b
            long r2 = (long) r2
            r0.j(r15, r2)
            java.lang.String r2 = r1.c
            if (r2 != 0) goto L_0x0075
            r0.W(r14)
            goto L_0x0078
        L_0x0075:
            r0.f(r14, r2)
        L_0x0078:
            java.lang.String r2 = r1.d
            if (r2 != 0) goto L_0x0080
            r0.W(r13)
            goto L_0x0083
        L_0x0080:
            r0.f(r13, r2)
        L_0x0083:
            b3f r1 = r1.a
            java.lang.String r2 = r1.a
            if (r2 != 0) goto L_0x008d
            r0.W(r12)
            goto L_0x0090
        L_0x008d:
            r0.f(r12, r2)
        L_0x0090:
            qjb r2 = r1.b
            int r2 = r2.b
            long r2 = (long) r2
            r0.j(r11, r2)
            float r2 = r1.c
            double r2 = (double) r2
            r0.h(r10, r2)
            float r2 = r1.d
            double r2 = (double) r2
            r0.h(r9, r2)
            boolean r1 = r1.e
            long r1 = (long) r1
            r0.j(r8, r1)
            return
        L_0x00ab:
            r1 = r24
            gwe r1 = (defpackage.gwe) r1
            java.lang.String r2 = r1.b
            if (r2 != 0) goto L_0x00b7
            r0.W(r15)
            goto L_0x00ba
        L_0x00b7:
            r0.f(r15, r2)
        L_0x00ba:
            java.lang.String r2 = r1.c
            if (r2 != 0) goto L_0x00c2
            r0.W(r14)
            goto L_0x00c5
        L_0x00c2:
            r0.f(r14, r2)
        L_0x00c5:
            java.lang.String r2 = r1.d
            if (r2 != 0) goto L_0x00cd
            r0.W(r13)
            goto L_0x00d0
        L_0x00cd:
            r0.f(r13, r2)
        L_0x00d0:
            java.lang.String r2 = r1.e
            if (r2 != 0) goto L_0x00d8
            r0.W(r12)
            goto L_0x00db
        L_0x00d8:
            r0.f(r12, r2)
        L_0x00db:
            float r2 = r1.f
            double r12 = (double) r2
            r0.h(r11, r12)
            long r11 = r1.g
            r0.j(r10, r11)
            rxe r2 = r1.h
            int r2 = r2.a
            long r10 = (long) r2
            r0.j(r9, r10)
            long r9 = r1.j
            r0.j(r8, r9)
            tu1 r2 = r1.a
            java.lang.Object r8 = r2.c
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L_0x00ff
            r0.W(r7)
            goto L_0x0102
        L_0x00ff:
            r0.f(r7, r8)
        L_0x0102:
            long r7 = r2.b
            r0.j(r6, r7)
            int r2 = r2.a
            int r2 = hr1.t(r2)
            long r6 = (long) r2
            r0.j(r5, r6)
            pxe r1 = r1.i
            if (r1 == 0) goto L_0x0126
            java.lang.String r2 = r1.a
            if (r2 != 0) goto L_0x011d
            r0.W(r3)
            goto L_0x0120
        L_0x011d:
            r0.f(r3, r2)
        L_0x0120:
            long r1 = r1.b
            r0.j(r4, r1)
            goto L_0x012c
        L_0x0126:
            r0.W(r3)
            r0.W(r4)
        L_0x012c:
            return
        L_0x012d:
            r1 = r24
            i8e r1 = (i8e) r1
            java.lang.String r2 = r1.a
            if (r2 != 0) goto L_0x0139
            r0.W(r15)
            goto L_0x013c
        L_0x0139:
            r0.f(r15, r2)
        L_0x013c:
            int r2 = r1.b
            long r2 = (long) r2
            r0.j(r14, r2)
            int r1 = r1.c
            long r1 = (long) r1
            r0.j(r13, r1)
            return
        L_0x0149:
            r1 = r24
            ftd r1 = (defpackage.ftd) r1
            long r3 = r1.a
            r0.j(r15, r3)
            long r3 = r1.b
            r0.j(r14, r3)
            int r3 = r1.c
            long r3 = (long) r3
            r0.j(r13, r3)
            int r3 = r1.d
            long r3 = (long) r3
            r0.j(r12, r3)
            java.lang.String r3 = r1.e
            if (r3 != 0) goto L_0x016b
            r0.W(r11)
            goto L_0x016e
        L_0x016b:
            r0.f(r11, r3)
        L_0x016e:
            long r3 = r1.f
            r0.j(r10, r3)
            java.lang.String r3 = r1.g
            if (r3 != 0) goto L_0x017b
            r0.W(r9)
            goto L_0x017e
        L_0x017b:
            r0.f(r9, r3)
        L_0x017e:
            java.lang.String r3 = r1.h
            if (r3 != 0) goto L_0x0186
            r0.W(r8)
            goto L_0x0189
        L_0x0186:
            r0.f(r8, r3)
        L_0x0189:
            java.lang.String r3 = r1.i
            if (r3 != 0) goto L_0x0191
            r0.W(r7)
            goto L_0x0194
        L_0x0191:
            r0.f(r7, r3)
        L_0x0194:
            r19 = 0
            r20 = 0
            java.util.List r3 = r1.j
            java.lang.String r17 = ","
            r18 = 0
            r21 = 62
            r16 = r3
            java.lang.String r3 = o23.c0(r16, r17, r18, r19, r20, r21)
            r0.f(r6, r3)
            int r3 = r1.k
            if (r3 == r15) goto L_0x01bc
            if (r3 == r14) goto L_0x01ba
            if (r3 == r13) goto L_0x01b7
            if (r3 != r12) goto L_0x01b6
            r2 = 40
            goto L_0x01bd
        L_0x01b6:
            throw r2
        L_0x01b7:
            r2 = 20
            goto L_0x01bd
        L_0x01ba:
            r2 = r6
            goto L_0x01bd
        L_0x01bc:
            r2 = 0
        L_0x01bd:
            long r2 = (long) r2
            r0.j(r5, r2)
            long r2 = r1.l
            r4 = 12
            r0.j(r4, r2)
            java.lang.String r2 = r1.m
            if (r2 != 0) goto L_0x01d2
            r3 = 13
            r0.W(r3)
            goto L_0x01d7
        L_0x01d2:
            r3 = 13
            r0.f(r3, r2)
        L_0x01d7:
            boolean r2 = r1.n
            long r2 = (long) r2
            r4 = 14
            r0.j(r4, r2)
            int r2 = r1.o
            int r2 = defpackage.c3d.b(r2)
            r3 = 15
            long r4 = (long) r2
            r0.j(r3, r4)
            r2 = 16
            java.lang.String r1 = r1.p
            if (r1 != 0) goto L_0x01f5
            r0.W(r2)
            goto L_0x01f8
        L_0x01f5:
            r0.f(r2, r1)
        L_0x01f8:
            return
        L_0x01f9:
            r1 = r24
            cud r1 = (defpackage.cud) r1
            long r2 = r1.a
            r0.j(r15, r2)
            java.lang.String r2 = r1.b
            if (r2 != 0) goto L_0x020a
            r0.W(r14)
            goto L_0x020d
        L_0x020a:
            r0.f(r14, r2)
        L_0x020d:
            java.lang.String r2 = r1.c
            if (r2 != 0) goto L_0x0215
            r0.W(r13)
            goto L_0x0218
        L_0x0215:
            r0.f(r13, r2)
        L_0x0218:
            long r2 = r1.d
            r0.j(r12, r2)
            long r2 = r1.e
            r0.j(r11, r2)
            long r2 = r1.f
            r0.j(r10, r2)
            java.lang.String r2 = r1.g
            if (r2 != 0) goto L_0x022f
            r0.W(r9)
            goto L_0x0232
        L_0x022f:
            r0.f(r9, r2)
        L_0x0232:
            java.util.List r2 = r1.h
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>((java.util.Collection<?>) r2)
            java.lang.String r2 = r3.toString()
            if (r2 != 0) goto L_0x0243
            r0.W(r8)
            goto L_0x0246
        L_0x0243:
            r0.f(r8, r2)
        L_0x0246:
            boolean r1 = r1.i
            long r1 = (long) r1
            r0.j(r7, r1)
            return
        L_0x024d:
            r1 = r24
            rqd r1 = (defpackage.rqd) r1
            long r2 = r1.a
            r0.j(r15, r2)
            int r2 = r1.b
            int r2 = defpackage.wn6.d(r2)
            long r2 = (long) r2
            r0.j(r14, r2)
            ru.ok.tamtam.nano.Protos$LogEvent r2 = new ru.ok.tamtam.nano.Protos$LogEvent
            r2.<init>()
            ln7 r3 = r1.c
            long r4 = r3.a
            r2.time = r4
            java.lang.String r4 = r3.c
            r2.type = r4
            java.lang.String r4 = r3.d
            r2.event = r4
            java.util.Map r4 = r3.e
            if (r4 == 0) goto L_0x028d
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0286 }
            r5.<init>()     // Catch:{ IOException -> 0x0286 }
            jjd.O(r4, r5)     // Catch:{ IOException -> 0x0286 }
            byte[] r4 = r5.toByteArray()     // Catch:{ IOException -> 0x0286 }
            r2.params = r4
            goto L_0x028d
        L_0x0286:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L_0x028d:
            long r4 = r3.b
            r2.userId = r4
            long r3 = r3.f
            r2.sessionId = r3
            byte[] r2 = gr8.toByteArray(r2)
            r0.k(r13, r2)
            boolean r1 = r1.d
            long r1 = (long) r1
            r0.j(r12, r1)
            return
        L_0x02a3:
            r1 = r24
            vwc r1 = (defpackage.vwc) r1
            long r2 = r1.a
            r0.j(r15, r2)
            int r1 = r1.b
            int r1 = hr1.t(r1)
            long r1 = (long) r1
            r0.j(r14, r1)
            return
        L_0x02b7:
            r1 = r24
            z22 r1 = (defpackage.z22) r1
            long r2 = r1.a
            r0.j(r15, r2)
            java.lang.String r1 = r1.b
            if (r1 != 0) goto L_0x02c8
            r0.W(r14)
            goto L_0x02cb
        L_0x02c8:
            r0.f(r14, r1)
        L_0x02cb:
            return
        L_0x02cc:
            r1 = r24
            hdc r1 = (defpackage.hdc) r1
            java.lang.String r3 = r1.a
            if (r3 != 0) goto L_0x02d8
            r0.W(r15)
            goto L_0x02db
        L_0x02d8:
            r0.f(r15, r3)
        L_0x02db:
            java.lang.String r3 = r1.b
            if (r3 != 0) goto L_0x02e3
            r0.W(r14)
            goto L_0x02e6
        L_0x02e3:
            r0.f(r14, r3)
        L_0x02e6:
            java.lang.String r3 = r1.c
            if (r3 != 0) goto L_0x02ee
            r0.W(r13)
            goto L_0x02f1
        L_0x02ee:
            r0.f(r13, r3)
        L_0x02f1:
            int r3 = r1.d
            long r3 = (long) r3
            r0.j(r12, r3)
            java.util.Set r3 = r1.e
            java.lang.String r3 = kjd.s(r3)
            r0.f(r11, r3)
            boolean r3 = r1.f
            long r3 = (long) r3
            r0.j(r10, r3)
            boolean r3 = r1.g
            long r3 = (long) r3
            r0.j(r9, r3)
            java.util.List r3 = r1.h
            if (r3 == 0) goto L_0x0315
            byte[] r3 = defpackage.gp8.b(r3)
            goto L_0x0316
        L_0x0315:
            r3 = r2
        L_0x0316:
            if (r3 != 0) goto L_0x031c
            r0.W(r8)
            goto L_0x031f
        L_0x031c:
            r0.k(r8, r3)
        L_0x031f:
            java.lang.Long r3 = r1.i
            if (r3 != 0) goto L_0x0327
            r0.W(r7)
            goto L_0x032e
        L_0x0327:
            long r3 = r3.longValue()
            r0.j(r7, r3)
        L_0x032e:
            java.util.Map r3 = r1.j
            if (r3 == 0) goto L_0x033b
            gt5 r3 = z3d.o(r3)
            byte[] r3 = gr8.toByteArray(r3)
            goto L_0x033c
        L_0x033b:
            r3 = r2
        L_0x033c:
            if (r3 != 0) goto L_0x0342
            r0.W(r6)
            goto L_0x0345
        L_0x0342:
            r0.k(r6, r3)
        L_0x0345:
            java.util.List r3 = r1.k
            if (r3 == 0) goto L_0x0352
            gt5 r3 = z3d.q(r3)
            byte[] r3 = gr8.toByteArray(r3)
            goto L_0x0353
        L_0x0352:
            r3 = r2
        L_0x0353:
            if (r3 != 0) goto L_0x0359
            r0.W(r5)
            goto L_0x035c
        L_0x0359:
            r0.k(r5, r3)
        L_0x035c:
            java.util.Set r3 = r1.l
            if (r3 == 0) goto L_0x0368
            gt5 r2 = z3d.p(r3)
            byte[] r2 = gr8.toByteArray(r2)
        L_0x0368:
            if (r2 != 0) goto L_0x0370
            r3 = 12
            r0.W(r3)
            goto L_0x0375
        L_0x0370:
            r3 = 12
            r0.k(r3, r2)
        L_0x0375:
            boolean r1 = r1.m
            long r1 = (long) r1
            r3 = 13
            r0.j(r3, r1)
            return
        L_0x037e:
            r1 = r24
            c2c r1 = (defpackage.c2c) r1
            long r2 = r1.a
            r0.j(r15, r2)
            r2c r2 = r1.b
            int r2 = r2.a
            long r2 = (long) r2
            r0.j(r14, r2)
            long r2 = r1.c
            r0.j(r13, r2)
            long r2 = r1.d
            r0.j(r12, r2)
            le4 r2 = r1.e
            if (r2 == 0) goto L_0x03a3
            long r2 = r2.a
            r0.j(r11, r2)
            goto L_0x03a6
        L_0x03a3:
            r0.W(r11)
        L_0x03a6:
            wu4 r2 = r1.f
            if (r2 == 0) goto L_0x03b6
            java.lang.String r2 = r2.a
            if (r2 != 0) goto L_0x03b2
            r0.W(r10)
            goto L_0x03b9
        L_0x03b2:
            r0.f(r10, r2)
            goto L_0x03b9
        L_0x03b6:
            r0.W(r10)
        L_0x03b9:
            xw2 r1 = r1.g
            if (r1 == 0) goto L_0x03d0
            java.lang.Object r2 = r1.c
            byte[] r2 = (byte[]) r2
            if (r2 != 0) goto L_0x03c7
            r0.W(r9)
            goto L_0x03ca
        L_0x03c7:
            r0.k(r9, r2)
        L_0x03ca:
            long r1 = r1.b
            r0.j(r8, r1)
            goto L_0x03d6
        L_0x03d0:
            r0.W(r9)
            r0.W(r8)
        L_0x03d6:
            return
        L_0x03d7:
            r1 = r24
            wzb r1 = (defpackage.wzb) r1
            java.lang.String r2 = r1.a
            if (r2 != 0) goto L_0x03e3
            r0.W(r15)
            goto L_0x03e6
        L_0x03e3:
            r0.f(r15, r2)
        L_0x03e6:
            long r2 = r1.b
            r0.j(r14, r2)
            org.json.JSONArray r2 = new org.json.JSONArray
            java.util.List r1 = r1.c
            r2.<init>((java.util.Collection<?>) r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L_0x03fc
            r0.W(r13)
            goto L_0x03ff
        L_0x03fc:
            r0.f(r13, r1)
        L_0x03ff:
            return
        L_0x0400:
            r1 = r24
            a2b r1 = (a2b) r1
            java.lang.String r2 = r1.a
            if (r2 != 0) goto L_0x040c
            r0.W(r15)
            goto L_0x040f
        L_0x040c:
            r0.f(r15, r2)
        L_0x040f:
            java.lang.Long r1 = r1.b
            if (r1 != 0) goto L_0x0417
            r0.W(r14)
            goto L_0x041e
        L_0x0417:
            long r1 = r1.longValue()
            r0.j(r14, r1)
        L_0x041e:
            return
        L_0x041f:
            r1 = r24
            joa r1 = (defpackage.joa) r1
            long r2 = r1.a
            r0.j(r15, r2)
            long r2 = r1.b
            r0.j(r14, r2)
            int r2 = r1.c
            long r2 = (long) r2
            r0.j(r13, r2)
            java.lang.String r2 = r1.d
            if (r2 != 0) goto L_0x043b
            r0.W(r12)
            goto L_0x043e
        L_0x043b:
            r0.f(r12, r2)
        L_0x043e:
            long r2 = r1.e
            r0.j(r11, r2)
            java.lang.String r2 = r1.f
            if (r2 != 0) goto L_0x044b
            r0.W(r10)
            goto L_0x044e
        L_0x044b:
            r0.f(r10, r2)
        L_0x044e:
            java.lang.String r2 = r1.g
            if (r2 != 0) goto L_0x0456
            r0.W(r9)
            goto L_0x0459
        L_0x0456:
            r0.f(r9, r2)
        L_0x0459:
            java.lang.String r2 = r1.h
            if (r2 != 0) goto L_0x0461
            r0.W(r8)
            goto L_0x0464
        L_0x0461:
            r0.f(r8, r2)
        L_0x0464:
            java.lang.String r2 = r1.i
            if (r2 != 0) goto L_0x046c
            r0.W(r7)
            goto L_0x046f
        L_0x046c:
            r0.f(r7, r2)
        L_0x046f:
            int r1 = r1.j
            int r1 = hr1.t(r1)
            long r1 = (long) r1
            r0.j(r6, r1)
            return
        L_0x047a:
            r1 = r24
            rr9 r1 = (defpackage.rr9) r1
            long r3 = r1.a
            r0.j(r15, r3)
            long r3 = r1.b
            r0.j(r14, r3)
            long r3 = r1.c
            r0.j(r13, r3)
            java.lang.Boolean r3 = r1.d
            if (r3 != 0) goto L_0x0493
            r3 = r2
            goto L_0x049b
        L_0x0493:
            boolean r3 = r3.booleanValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L_0x049b:
            if (r3 != 0) goto L_0x04a1
            r0.W(r12)
            goto L_0x04a9
        L_0x04a1:
            int r3 = r3.intValue()
            long r3 = (long) r3
            r0.j(r12, r3)
        L_0x04a9:
            ep4 r1 = r1.e
            if (r1 == 0) goto L_0x04af
            java.lang.String r2 = r1.a
        L_0x04af:
            if (r2 != 0) goto L_0x04b5
            r0.W(r11)
            goto L_0x04b8
        L_0x04b5:
            r0.f(r11, r2)
        L_0x04b8:
            return
        L_0x04b9:
            r1 = r24
            jp9 r1 = (defpackage.jp9) r1
            long r2 = r1.a
            r0.j(r15, r2)
            long r1 = r1.b
            r0.j(r14, r1)
            return
        L_0x04c8:
            r1 = r24
            cb5 r1 = (defpackage.cb5) r1
            long r3 = r1.a
            r0.j(r15, r3)
            long r3 = r1.b
            r0.j(r14, r3)
            gb5 r3 = r1.c
            if (r3 == 0) goto L_0x04dc
            java.lang.String r2 = r3.a
        L_0x04dc:
            if (r2 != 0) goto L_0x04e2
            r0.W(r13)
            goto L_0x04e5
        L_0x04e2:
            r0.f(r13, r2)
        L_0x04e5:
            java.lang.String r2 = r1.d
            if (r2 != 0) goto L_0x04ed
            r0.W(r12)
            goto L_0x04f0
        L_0x04ed:
            r0.f(r12, r2)
        L_0x04f0:
            java.lang.String r2 = r1.e
            if (r2 != 0) goto L_0x04f8
            r0.W(r11)
            goto L_0x04fb
        L_0x04f8:
            r0.f(r11, r2)
        L_0x04fb:
            long r2 = r1.f
            r0.j(r10, r2)
            long r2 = r1.g
            r0.j(r9, r2)
            java.lang.String r2 = r1.h
            if (r2 != 0) goto L_0x050d
            r0.W(r8)
            goto L_0x0510
        L_0x050d:
            r0.f(r8, r2)
        L_0x0510:
            long r2 = r1.i
            r0.j(r7, r2)
            java.lang.String r2 = r1.j
            if (r2 != 0) goto L_0x051d
            r0.W(r6)
            goto L_0x0520
        L_0x051d:
            r0.f(r6, r2)
        L_0x0520:
            java.lang.String r2 = r1.k
            if (r2 != 0) goto L_0x0528
            r0.W(r5)
            goto L_0x052b
        L_0x0528:
            r0.f(r5, r2)
        L_0x052b:
            boolean r2 = r1.l
            long r2 = (long) r2
            r4 = 12
            r0.j(r4, r2)
            boolean r1 = r1.m
            long r1 = (long) r1
            r3 = 13
            r0.j(r3, r1)
            return
        L_0x053c:
            r1 = r24
            at8 r1 = (defpackage.at8) r1
            java.lang.String r2 = r1.b
            if (r2 != 0) goto L_0x0548
            r0.W(r15)
            goto L_0x054b
        L_0x0548:
            r0.f(r15, r2)
        L_0x054b:
            long r2 = r1.c
            r0.j(r14, r2)
            int r2 = r1.d
            int r2 = hr1.t(r2)
            long r2 = (long) r2
            r0.j(r13, r2)
            ir1 r2 = r1.a
            long r3 = r2.a
            r0.j(r12, r3)
            long r3 = r2.b
            r0.j(r11, r3)
            java.lang.Object r2 = r2.c
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto L_0x0570
            r0.W(r10)
            goto L_0x0573
        L_0x0570:
            r0.f(r10, r2)
        L_0x0573:
            l10 r1 = r1.e
            if (r1 == 0) goto L_0x0592
            qjb r2 = r1.a
            int r2 = r2.b
            long r2 = (long) r2
            r0.j(r9, r2)
            float r2 = r1.b
            double r2 = (double) r2
            r0.h(r8, r2)
            float r2 = r1.c
            double r2 = (double) r2
            r0.h(r7, r2)
            boolean r1 = r1.d
            long r1 = (long) r1
            r0.j(r6, r1)
            goto L_0x059e
        L_0x0592:
            r0.W(r9)
            r0.W(r8)
            r0.W(r7)
            r0.W(r6)
        L_0x059e:
            return
        L_0x059f:
            r1 = r24
            fb5 r1 = (defpackage.fb5) r1
            long r2 = r1.a
            r0.j(r15, r2)
            long r1 = r1.b
            r0.j(r14, r1)
            return
        L_0x05ae:
            r1 = r24
            oa5 r1 = (defpackage.oa5) r1
            long r2 = r1.a
            r0.j(r15, r2)
            long r2 = r1.b
            r0.j(r14, r2)
            long r2 = r1.c
            r0.j(r13, r2)
            int r2 = r1.d
            if (r2 == 0) goto L_0x05ca
            int r2 = hr1.t(r2)
            goto L_0x05cb
        L_0x05ca:
            r2 = 0
        L_0x05cb:
            long r2 = (long) r2
            r0.j(r12, r2)
            java.lang.Long r2 = r1.e
            if (r2 != 0) goto L_0x05d7
            r0.W(r11)
            goto L_0x05de
        L_0x05d7:
            long r2 = r2.longValue()
            r0.j(r11, r2)
        L_0x05de:
            long r2 = r1.f
            r0.j(r10, r2)
            java.lang.Long r2 = r1.g
            if (r2 != 0) goto L_0x05eb
            r0.W(r9)
            goto L_0x05f2
        L_0x05eb:
            long r2 = r2.longValue()
            r0.j(r9, r2)
        L_0x05f2:
            java.lang.String r2 = r1.h
            if (r2 != 0) goto L_0x05fa
            r0.W(r8)
            goto L_0x05fd
        L_0x05fa:
            r0.f(r8, r2)
        L_0x05fd:
            long r2 = r1.i
            r0.j(r7, r2)
            long r2 = r1.j
            r0.j(r6, r2)
            java.lang.String r2 = r1.k
            if (r2 != 0) goto L_0x060f
            r0.W(r5)
            goto L_0x0612
        L_0x060f:
            r0.f(r5, r2)
        L_0x0612:
            long r2 = r1.l
            r4 = 12
            r0.j(r4, r2)
            long r1 = r1.m
            r3 = 13
            r0.j(r3, r1)
            return
        L_0x0621:
            r1 = r24
            t85 r1 = (defpackage.t85) r1
            long r2 = r1.a
            r0.j(r15, r2)
            long r1 = r1.b
            r0.j(r14, r1)
            return
        L_0x0630:
            r1 = r24
            m95 r1 = (defpackage.m95) r1
            long r2 = r1.a
            r0.j(r15, r2)
            long r1 = r1.b
            r0.j(r14, r1)
            return
        L_0x063f:
            r1 = r24
            hm4 r1 = (defpackage.hm4) r1
            java.lang.String r2 = r1.b
            if (r2 != 0) goto L_0x064b
            r0.W(r15)
            goto L_0x064e
        L_0x064b:
            r0.f(r15, r2)
        L_0x064e:
            long r2 = r1.c
            r0.j(r14, r2)
            int r2 = r1.d
            int r2 = hr1.t(r2)
            long r2 = (long) r2
            r0.j(r13, r2)
            zl4 r2 = r1.a
            long r3 = r2.a
            r0.j(r12, r3)
            java.lang.String r2 = r2.b
            if (r2 != 0) goto L_0x066c
            r0.W(r11)
            goto L_0x066f
        L_0x066c:
            r0.f(r11, r2)
        L_0x066f:
            l10 r1 = r1.e
            if (r1 == 0) goto L_0x068e
            qjb r2 = r1.a
            int r2 = r2.b
            long r2 = (long) r2
            r0.j(r10, r2)
            float r2 = r1.b
            double r2 = (double) r2
            r0.h(r9, r2)
            float r2 = r1.c
            double r2 = (double) r2
            r0.h(r8, r2)
            boolean r1 = r1.d
            long r1 = (long) r1
            r0.j(r7, r1)
            goto L_0x069a
        L_0x068e:
            r0.W(r10)
            r0.W(r9)
            r0.W(r8)
            r0.W(r7)
        L_0x069a:
            return
        L_0x069b:
            r1 = r24
            ne4 r1 = (ne4) r1
            java.lang.String r2 = r1.a
            if (r2 != 0) goto L_0x06a7
            r0.W(r15)
            goto L_0x06aa
        L_0x06a7:
            r0.f(r15, r2)
        L_0x06aa:
            java.lang.String r1 = r1.b
            if (r1 != 0) goto L_0x06b2
            r0.W(r14)
            goto L_0x06b5
        L_0x06b2:
            r0.f(r14, r1)
        L_0x06b5:
            return
        L_0x06b6:
            hr1.r(r24)
            throw r2
        L_0x06ba:
            r1 = r24
            ij3 r1 = (defpackage.ij3) r1
            long r2 = r1.a
            r0.j(r15, r2)
            long r2 = r1.b
            r0.j(r14, r2)
            int r2 = r1.c
            long r2 = (long) r2
            r0.j(r13, r2)
            int r2 = r1.d
            long r2 = (long) r2
            r0.j(r12, r2)
            ni3 r1 = r1.e
            byte[] r1 = r1.d()
            r0.k(r11, r1)
            return
        L_0x06de:
            r1 = r24
            pa1 r1 = (defpackage.pa1) r1
            java.lang.String r2 = r1.a
            if (r2 != 0) goto L_0x06ea
            r0.W(r15)
            goto L_0x06ed
        L_0x06ea:
            r0.f(r15, r2)
        L_0x06ed:
            java.lang.String r2 = r1.b
            if (r2 != 0) goto L_0x06f5
            r0.W(r14)
            goto L_0x06f8
        L_0x06f5:
            r0.f(r14, r2)
        L_0x06f8:
            long r1 = r1.c
            r0.j(r13, r1)
            return
        L_0x06fe:
            r1 = r24
            nj r1 = (defpackage.nj) r1
            long r2 = r1.a
            r0.j(r15, r2)
            java.lang.String r2 = r1.b
            if (r2 != 0) goto L_0x070f
            r0.W(r14)
            goto L_0x0712
        L_0x070f:
            r0.f(r14, r2)
        L_0x0712:
            java.lang.String r2 = r1.c
            if (r2 != 0) goto L_0x071a
            r0.W(r13)
            goto L_0x071d
        L_0x071a:
            r0.f(r13, r2)
        L_0x071d:
            java.lang.String r2 = r1.d
            if (r2 != 0) goto L_0x0725
            r0.W(r12)
            goto L_0x0728
        L_0x0725:
            r0.f(r12, r2)
        L_0x0728:
            long r2 = r1.e
            r0.j(r11, r2)
            org.json.JSONArray r2 = new org.json.JSONArray
            java.util.List r1 = r1.f
            r2.<init>((java.util.Collection<?>) r1)
            java.lang.String r1 = r2.toString()
            if (r1 != 0) goto L_0x073e
            r0.W(r10)
            goto L_0x0741
        L_0x073e:
            r0.f(r10, r1)
        L_0x0741:
            return
        L_0x0742:
            r1 = r24
            ii r1 = (defpackage.ii) r1
            long r2 = r1.a
            r0.j(r15, r2)
            long r2 = r1.b
            r0.j(r14, r2)
            java.lang.String r2 = r1.c
            if (r2 != 0) goto L_0x0758
            r0.W(r13)
            goto L_0x075b
        L_0x0758:
            r0.f(r13, r2)
        L_0x075b:
            java.lang.String r2 = r1.d
            if (r2 != 0) goto L_0x0763
            r0.W(r12)
            goto L_0x0766
        L_0x0763:
            r0.f(r12, r2)
        L_0x0766:
            java.lang.String r2 = r1.e
            if (r2 != 0) goto L_0x076e
            r0.W(r11)
            goto L_0x0771
        L_0x076e:
            r0.f(r11, r2)
        L_0x0771:
            java.lang.Long r2 = r1.f
            if (r2 != 0) goto L_0x0779
            r0.W(r10)
            goto L_0x0780
        L_0x0779:
            long r2 = r2.longValue()
            r0.j(r10, r2)
        L_0x0780:
            java.lang.String r1 = r1.g
            if (r1 != 0) goto L_0x0788
            r0.W(r9)
            goto L_0x078b
        L_0x0788:
            r0.f(r9, r1)
        L_0x078b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sh.A(yz5, java.lang.Object):void");
    }

    public final String g() {
        switch (this.o) {
            case 0:
                return "INSERT OR REPLACE INTO `animoji` (`id`,`update_time`,`emoji`,`lottie_url`,`lottie_play_url`,`set_id`,`icon_url`) VALUES (?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `animoji_set` (`id`,`name`,`icon_url`,`icon_lottie_url`,`update_time`,`animoji_ids`) VALUES (?,?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `call_links` (`conversation_id`,`join_link`,`started_at`) VALUES (?,?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `contacts` (`id`,`server_id`,`presence`,`presence_type`,`data`) VALUES (nullif(?, 0),?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `default_emoji` (`emoji`,`default_value`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `draft_uploads` (`path`,`last_modified`,`upload_type`,`chat_id`,`attach_id`,`video_quality`,`video_start_trim_position`,`video_end_trim_position`,`mute`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `favorite_sticker_sets` (`id`,`index`) VALUES (?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `favorite_stickers` (`id`,`index`) VALUES (?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `fcm_notifications_analytics` (`push_id`,`chat_id`,`msg_id`,`analytics_status`,`suid`,`content_length`,`sent_time`,`event_key`,`fcm_sent_time`,`received_time`,`push_type`,`time`,`created_time`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 10:
                return "INSERT OR REPLACE INTO `fcm_notifications_history` (`chat_id`,`last_notify_msg_id`) VALUES (?,?)";
            case 11:
                return "INSERT OR REPLACE INTO `message_uploads` (`path`,`last_modified`,`upload_type`,`message_id`,`chat_id`,`attach_id`,`video_quality`,`video_start_trim_position`,`video_end_trim_position`,`mute`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case Protos.Attaches.Attach.PRESENT:
                return "INSERT OR REPLACE INTO `fcm_notifications` (`chat_id`,`message_id`,`type`,`chat_title`,`sender_user_name`,`sender_user_id`,`time`,`text`,`push_id`,`event_key`,`large_image_url`,`fire_m`,`has_any_error`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 13:
                return "INSERT OR REPLACE INTO `notifications_read_marks` (`chat_id`,`mark`) VALUES (?,?)";
            case Protos.Attaches.Attach.LOCATION:
                return "INSERT OR IGNORE INTO `notifications_tracker_messages` (`chat_id`,`message_id`,`time`,`fcm`,`drop_reason`) VALUES (?,?,?,?,?)";
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return "INSERT OR ABORT INTO `phones` (`id`,`phonebook_id`,`contact_id`,`phone`,`server_phone`,`email`,`first_name`,`last_name`,`avatar_path`,`type`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case LangUtils.HASH_SEED:
                return "INSERT OR REPLACE INTO `reactions_section` (`id`,`update_time`,`reactions`) VALUES (?,?,?)";
            case 18:
                return "INSERT OR REPLACE INTO `recent` (`id`,`recent_type`,`recent_time`,`server_id`,`sticker_id`,`emoji`,`gif`,`gif_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            case 19:
                return "INSERT OR REPLACE INTO `chat_folder` (`id`,`title`,`emoji`,`order`,`filters`,`isHiddenForAllFolder`,`hideIfEmpty`,`elements`,`creatorId`,`filterSubjects`,`widgets`,`options`,`isRemoved`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return "INSERT OR REPLACE INTO `folder_and_chats` (`chatId`,`folderId`) VALUES (?,?)";
            case 21:
                return "INSERT OR REPLACE INTO `selected_mentions` (`id`,`selectedMentionType`) VALUES (?,?)";
            case 22:
                return "INSERT OR ABORT INTO `events` (`id`,`status`,`entry`,`isCritical`) VALUES (nullif(?, 0),?,?,?)";
            case 23:
                return "INSERT OR REPLACE INTO `sticker_sets` (`id`,`name`,`icon_url`,`author_id`,`created_time`,`updated_time`,`link`,`stickers`,`draft`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 24:
                return "INSERT OR REPLACE INTO `stickers` (`id`,`sticker_id`,`width`,`height`,`url`,`update_time`,`mp4_url`,`first_url`,`preview_url`,`tags`,`sticker_type`,`set_id`,`lottie_url`,`audio`,`author_type`,`video_url`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 25:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 26:
                return "INSERT OR REPLACE INTO `uploads` (`attach_local_id`,`prepared_path`,`file_name`,`upload_url`,`upload_progress`,`total_bytes`,`upload_status`,`created_time`,`path`,`last_modified`,`upload_type`,`photo_token`,`attach_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 27:
                return "INSERT OR REPLACE INTO `video_conversions` (`finished`,`prepared_path`,`result_path`,`source_uri`,`quality`,`start_trim_position`,`end_trim_position`,`mute`) VALUES (?,?,?,?,?,?,?,?)";
            case 28:
                return "INSERT OR REPLACE INTO `webapp_biometry` (`id`,`user_id`,`bot_id`,`token`,`access_requested`,`access_granted`) VALUES (nullif(?, 0),?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }
    }
}
