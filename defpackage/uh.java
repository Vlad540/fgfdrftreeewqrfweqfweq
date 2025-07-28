package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: uh  reason: default package */
public final class uh implements Callable {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ uh(Object obj, int i, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARNING: type inference failed for: r11v2, types: [cud, java.lang.Object] */
    private final Object a() {
        Cursor o = ((mud) this.c).a.o((pec) this.b, (CancellationSignal) null);
        try {
            int o2 = gp0.o(o, ApiProtocol.KEY_ID);
            int o3 = gp0.o(o, "name");
            int o4 = gp0.o(o, "icon_url");
            int o5 = gp0.o(o, "author_id");
            int o6 = gp0.o(o, "created_time");
            int o7 = gp0.o(o, "updated_time");
            int o8 = gp0.o(o, "link");
            int o9 = gp0.o(o, "stickers");
            int o10 = gp0.o(o, "draft");
            ArrayList arrayList = new ArrayList(o.getCount());
            while (o.moveToNext()) {
                ? obj = new Object();
                obj.a = o.getLong(o2);
                if (o.isNull(o3)) {
                    obj.b = null;
                } else {
                    obj.b = o.getString(o3);
                }
                if (o.isNull(o4)) {
                    obj.c = null;
                } else {
                    obj.c = o.getString(o4);
                }
                obj.d = o.getLong(o5);
                obj.e = o.getLong(o6);
                obj.f = o.getLong(o7);
                if (o.isNull(o8)) {
                    obj.g = null;
                } else {
                    obj.g = o.getString(o8);
                }
                obj.h = js.G(o.isNull(o9) ? null : o.getString(o9));
                obj.i = o.getInt(o10) != 0;
                arrayList.add(obj);
            }
            o.close();
            return arrayList;
        } catch (Throwable th) {
            o.close();
            throw th;
        }
    }

    private final Object b() {
        yxe yxe = (yxe) this.c;
        tdc tdc = yxe.e;
        aec aec = yxe.a;
        yz5 f = tdc.f();
        String str = (String) this.b;
        if (str == null) {
            f.W(1);
        } else {
            f.f(1, str);
        }
        try {
            aec.c();
            f.n();
            aec.r();
            aec.l();
            tdc.u(f);
            return null;
        } catch (Throwable th) {
            tdc.u(f);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r9v2, types: [pa1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r12v34, types: [rr9] */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* JADX WARNING: type inference failed for: r11v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r44 = this;
            r0 = r44
            java.lang.String r1 = "event_key"
            java.lang.String r2 = "push_id"
            java.lang.String r3 = "message_id"
            java.lang.String r4 = "update_time"
            java.lang.String r5 = "time"
            java.lang.String r6 = "id"
            java.lang.String r8 = "chat_id"
            jue r9 = jue.a
            r10 = 1
            r11 = 0
            java.lang.Object r12 = r0.c
            int r13 = r0.a
            switch(r13) {
                case 0: goto L_0x0750;
                case 1: goto L_0x0734;
                case 2: goto L_0x069c;
                case 3: goto L_0x0668;
                case 4: goto L_0x0605;
                case 5: goto L_0x05e8;
                case 6: goto L_0x05ad;
                case 7: goto L_0x0572;
                case 8: goto L_0x0556;
                case 9: goto L_0x0439;
                case 10: goto L_0x041d;
                case 11: goto L_0x03d5;
                case 12: goto L_0x03b8;
                case 13: goto L_0x0392;
                case 14: goto L_0x028a;
                case 15: goto L_0x026e;
                case 16: goto L_0x0227;
                case 17: goto L_0x018d;
                case 18: goto L_0x0171;
                case 19: goto L_0x011b;
                case 20: goto L_0x00ff;
                case 21: goto L_0x00de;
                case 22: goto L_0x00c2;
                case 23: goto L_0x0079;
                case 24: goto L_0x005d;
                case 25: goto L_0x0058;
                case 26: goto L_0x003c;
                case 27: goto L_0x0037;
                default: goto L_0x001b;
            }
        L_0x001b:
            e3f r12 = (defpackage.e3f) r12
            aec r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0032 }
            c3f r0 = (defpackage.c3f) r0     // Catch:{ all -> 0x0032 }
            r2.C(r0)     // Catch:{ all -> 0x0032 }
            r1.r()     // Catch:{ all -> 0x0032 }
            r1.l()
            return r11
        L_0x0032:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x0037:
            java.lang.Object r0 = r44.b()
            return r0
        L_0x003c:
            yxe r12 = (defpackage.yxe) r12
            aec r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x0053 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0053 }
            gwe r0 = (defpackage.gwe) r0     // Catch:{ all -> 0x0053 }
            r2.C(r0)     // Catch:{ all -> 0x0053 }
            r1.r()     // Catch:{ all -> 0x0053 }
            r1.l()
            return r11
        L_0x0053:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x0058:
            java.lang.Object r0 = r44.a()
            return r0
        L_0x005d:
            mud r12 = (defpackage.mud) r12
            aec r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x0074 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0074 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0074 }
            r2.B(r0)     // Catch:{ all -> 0x0074 }
            r1.r()     // Catch:{ all -> 0x0074 }
            r1.l()
            return r11
        L_0x0074:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x0079:
            wwc r12 = (defpackage.wwc) r12
            java.lang.Object r1 = r12.b
            aec r1 = (aec) r1
            java.lang.Object r0 = r0.b
            pec r0 = (pec) r0
            android.database.Cursor r1 = r1.o(r0, r11)
            int r0 = defpackage.gp0.o(r1, r6)     // Catch:{ all -> 0x00b8 }
            java.lang.String r2 = "selectedMentionType"
            int r2 = defpackage.gp0.o(r1, r2)     // Catch:{ all -> 0x00b8 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x00b8 }
            int r4 = r1.getCount()     // Catch:{ all -> 0x00b8 }
            r3.<init>(r4)     // Catch:{ all -> 0x00b8 }
        L_0x009a:
            boolean r4 = r1.moveToNext()     // Catch:{ all -> 0x00b8 }
            if (r4 == 0) goto L_0x00ba
            long r4 = r1.getLong(r0)     // Catch:{ all -> 0x00b8 }
            int r6 = r1.getInt(r2)     // Catch:{ all -> 0x00b8 }
            if (r6 != 0) goto L_0x00ac
        L_0x00aa:
            r6 = r10
            goto L_0x00af
        L_0x00ac:
            if (r6 != r10) goto L_0x00aa
            r6 = 2
        L_0x00af:
            vwc r7 = new vwc     // Catch:{ all -> 0x00b8 }
            r7.<init>(r4, r6)     // Catch:{ all -> 0x00b8 }
            r3.add(r7)     // Catch:{ all -> 0x00b8 }
            goto L_0x009a
        L_0x00b8:
            r0 = move-exception
            goto L_0x00be
        L_0x00ba:
            r1.close()
            return r3
        L_0x00be:
            r1.close()
            throw r0
        L_0x00c2:
            udc r12 = (defpackage.udc) r12
            aec r1 = r12.a
            r1.c()
            sh r2 = r12.c     // Catch:{ all -> 0x00d9 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x00d9 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x00d9 }
            r2.B(r0)     // Catch:{ all -> 0x00d9 }
            r1.r()     // Catch:{ all -> 0x00d9 }
            r1.l()
            return r9
        L_0x00d9:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x00de:
            udc r12 = (defpackage.udc) r12
            aec r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x00fa }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x00fa }
            hdc r0 = (defpackage.hdc) r0     // Catch:{ all -> 0x00fa }
            long r2 = r2.D(r0)     // Catch:{ all -> 0x00fa }
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00fa }
            r1.r()     // Catch:{ all -> 0x00fa }
            r1.l()
            return r0
        L_0x00fa:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x00ff:
            b2c r12 = (defpackage.b2c) r12
            aec r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x0116 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0116 }
            c2c r0 = (defpackage.c2c) r0     // Catch:{ all -> 0x0116 }
            r2.C(r0)     // Catch:{ all -> 0x0116 }
            r1.r()     // Catch:{ all -> 0x0116 }
            r1.l()
            return r11
        L_0x0116:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x011b:
            xzb r12 = (defpackage.xzb) r12
            aec r1 = r12.a
            java.lang.Object r0 = r0.b
            r2 = r0
            pec r2 = (pec) r2
            android.database.Cursor r1 = r1.o(r2, r11)
            int r0 = defpackage.gp0.o(r1, r6)     // Catch:{ all -> 0x0161 }
            int r3 = defpackage.gp0.o(r1, r4)     // Catch:{ all -> 0x0161 }
            java.lang.String r4 = "reactions"
            int r4 = defpackage.gp0.o(r1, r4)     // Catch:{ all -> 0x0161 }
            boolean r5 = r1.moveToFirst()     // Catch:{ all -> 0x0161 }
            if (r5 == 0) goto L_0x0163
            boolean r5 = r1.isNull(r0)     // Catch:{ all -> 0x0161 }
            if (r5 == 0) goto L_0x0144
            r0 = r11
            goto L_0x0148
        L_0x0144:
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0161 }
        L_0x0148:
            long r5 = r1.getLong(r3)     // Catch:{ all -> 0x0161 }
            boolean r3 = r1.isNull(r4)     // Catch:{ all -> 0x0161 }
            if (r3 == 0) goto L_0x0153
            goto L_0x0157
        L_0x0153:
            java.lang.String r11 = r1.getString(r4)     // Catch:{ all -> 0x0161 }
        L_0x0157:
            java.util.ArrayList r3 = js.G(r11)     // Catch:{ all -> 0x0161 }
            wzb r11 = new wzb     // Catch:{ all -> 0x0161 }
            r11.<init>(r5, r0, r3)     // Catch:{ all -> 0x0161 }
            goto L_0x0163
        L_0x0161:
            r0 = move-exception
            goto L_0x016a
        L_0x0163:
            r1.close()
            r2.m()
            return r11
        L_0x016a:
            r1.close()
            r2.m()
            throw r0
        L_0x0171:
            xzb r12 = (defpackage.xzb) r12
            aec r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x0188 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0188 }
            wzb r0 = (defpackage.wzb) r0     // Catch:{ all -> 0x0188 }
            r2.C(r0)     // Catch:{ all -> 0x0188 }
            r1.r()     // Catch:{ all -> 0x0188 }
            r1.l()
            return r9
        L_0x0188:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x018d:
            ur9 r12 = (defpackage.ur9) r12
            aec r1 = r12.a
            java.lang.Object r0 = r0.b
            r2 = r0
            pec r2 = (pec) r2
            android.database.Cursor r1 = r1.o(r2, r11)
            int r0 = defpackage.gp0.o(r1, r8)     // Catch:{ all -> 0x0217 }
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x0217 }
            int r4 = defpackage.gp0.o(r1, r5)     // Catch:{ all -> 0x0217 }
            java.lang.String r5 = "fcm"
            int r5 = defpackage.gp0.o(r1, r5)     // Catch:{ all -> 0x0217 }
            java.lang.String r6 = "drop_reason"
            int r6 = defpackage.gp0.o(r1, r6)     // Catch:{ all -> 0x0217 }
            boolean r8 = r1.moveToFirst()     // Catch:{ all -> 0x0217 }
            if (r8 == 0) goto L_0x0219
            long r13 = r1.getLong(r0)     // Catch:{ all -> 0x0217 }
            long r15 = r1.getLong(r3)     // Catch:{ all -> 0x0217 }
            long r17 = r1.getLong(r4)     // Catch:{ all -> 0x0217 }
            boolean r0 = r1.isNull(r5)     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x01cc
            r0 = r11
            goto L_0x01d4
        L_0x01cc:
            int r0 = r1.getInt(r5)     // Catch:{ all -> 0x0217 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0217 }
        L_0x01d4:
            if (r0 != 0) goto L_0x01d9
            r19 = r11
            goto L_0x01e8
        L_0x01d9:
            int r0 = r0.intValue()     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x01e1
            r0 = r10
            goto L_0x01e2
        L_0x01e1:
            r0 = 0
        L_0x01e2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0217 }
            r19 = r0
        L_0x01e8:
            boolean r0 = r1.isNull(r6)     // Catch:{ all -> 0x0217 }
            if (r0 == 0) goto L_0x01f0
            r0 = r11
            goto L_0x01f4
        L_0x01f0:
            java.lang.String r0 = r1.getString(r6)     // Catch:{ all -> 0x0217 }
        L_0x01f4:
            ep4[] r3 = defpackage.ep4.b     // Catch:{ all -> 0x0217 }
            if (r0 != 0) goto L_0x01fb
        L_0x01f8:
            r20 = r11
            goto L_0x0210
        L_0x01fb:
            ep4[] r3 = defpackage.ep4.b     // Catch:{ all -> 0x0217 }
            int r4 = r3.length     // Catch:{ all -> 0x0217 }
            r7 = 0
        L_0x01ff:
            if (r7 >= r4) goto L_0x01f8
            r5 = r3[r7]     // Catch:{ all -> 0x0217 }
            java.lang.String r6 = r5.a     // Catch:{ all -> 0x0217 }
            boolean r6 = p0e.M(r6, r0, r10)     // Catch:{ all -> 0x0217 }
            if (r6 == 0) goto L_0x020e
            r20 = r5
            goto L_0x0210
        L_0x020e:
            int r7 = r7 + r10
            goto L_0x01ff
        L_0x0210:
            rr9 r11 = new rr9     // Catch:{ all -> 0x0217 }
            r12 = r11
            r12.<init>(r13, r15, r17, r19, r20)     // Catch:{ all -> 0x0217 }
            goto L_0x0219
        L_0x0217:
            r0 = move-exception
            goto L_0x0220
        L_0x0219:
            r1.close()
            r2.m()
            return r11
        L_0x0220:
            r1.close()
            r2.m()
            throw r0
        L_0x0227:
            dq9 r12 = (defpackage.dq9) r12
            aec r1 = r12.a
            java.lang.Object r0 = r0.b
            r2 = r0
            pec r2 = (pec) r2
            android.database.Cursor r1 = r1.o(r2, r11)
            int r0 = defpackage.gp0.o(r1, r8)     // Catch:{ all -> 0x025e }
            java.lang.String r3 = "mark"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x025e }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x025e }
            int r5 = r1.getCount()     // Catch:{ all -> 0x025e }
            r4.<init>(r5)     // Catch:{ all -> 0x025e }
        L_0x0247:
            boolean r5 = r1.moveToNext()     // Catch:{ all -> 0x025e }
            if (r5 == 0) goto L_0x0260
            long r5 = r1.getLong(r0)     // Catch:{ all -> 0x025e }
            long r7 = r1.getLong(r3)     // Catch:{ all -> 0x025e }
            jp9 r9 = new jp9     // Catch:{ all -> 0x025e }
            r9.<init>(r5, r7)     // Catch:{ all -> 0x025e }
            r4.add(r9)     // Catch:{ all -> 0x025e }
            goto L_0x0247
        L_0x025e:
            r0 = move-exception
            goto L_0x0267
        L_0x0260:
            r1.close()
            r2.m()
            return r4
        L_0x0267:
            r1.close()
            r2.m()
            throw r0
        L_0x026e:
            xp9 r12 = (defpackage.xp9) r12
            aec r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x0285 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0285 }
            cb5 r0 = (defpackage.cb5) r0     // Catch:{ all -> 0x0285 }
            r2.C(r0)     // Catch:{ all -> 0x0285 }
            r1.r()     // Catch:{ all -> 0x0285 }
            r1.l()
            return r9
        L_0x0285:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x028a:
            xp9 r12 = (defpackage.xp9) r12
            aec r4 = r12.a
            java.lang.Object r0 = r0.b
            r6 = r0
            pec r6 = (pec) r6
            android.database.Cursor r4 = r4.o(r6, r11)
            int r0 = defpackage.gp0.o(r4, r8)     // Catch:{ all -> 0x0388 }
            int r3 = defpackage.gp0.o(r4, r3)     // Catch:{ all -> 0x0388 }
            java.lang.String r8 = "type"
            int r8 = defpackage.gp0.o(r4, r8)     // Catch:{ all -> 0x0388 }
            java.lang.String r9 = "chat_title"
            int r9 = defpackage.gp0.o(r4, r9)     // Catch:{ all -> 0x0388 }
            java.lang.String r12 = "sender_user_name"
            int r12 = defpackage.gp0.o(r4, r12)     // Catch:{ all -> 0x0388 }
            java.lang.String r13 = "sender_user_id"
            int r13 = defpackage.gp0.o(r4, r13)     // Catch:{ all -> 0x0388 }
            int r5 = defpackage.gp0.o(r4, r5)     // Catch:{ all -> 0x0388 }
            java.lang.String r14 = "text"
            int r14 = defpackage.gp0.o(r4, r14)     // Catch:{ all -> 0x0388 }
            int r2 = defpackage.gp0.o(r4, r2)     // Catch:{ all -> 0x0388 }
            int r1 = defpackage.gp0.o(r4, r1)     // Catch:{ all -> 0x0388 }
            java.lang.String r15 = "large_image_url"
            int r15 = defpackage.gp0.o(r4, r15)     // Catch:{ all -> 0x0388 }
            java.lang.String r7 = "fire_m"
            int r7 = defpackage.gp0.o(r4, r7)     // Catch:{ all -> 0x0388 }
            java.lang.String r11 = "has_any_error"
            int r11 = defpackage.gp0.o(r4, r11)     // Catch:{ all -> 0x0388 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0388 }
            r44 = r6
            int r6 = r4.getCount()     // Catch:{ all -> 0x037f }
            r10.<init>(r6)     // Catch:{ all -> 0x037f }
        L_0x02e6:
            boolean r6 = r4.moveToNext()     // Catch:{ all -> 0x037f }
            if (r6 == 0) goto L_0x0381
            long r20 = r4.getLong(r0)     // Catch:{ all -> 0x037f }
            long r22 = r4.getLong(r3)     // Catch:{ all -> 0x037f }
            boolean r6 = r4.isNull(r8)     // Catch:{ all -> 0x037f }
            if (r6 == 0) goto L_0x02fc
            r6 = 0
            goto L_0x0300
        L_0x02fc:
            java.lang.String r6 = r4.getString(r8)     // Catch:{ all -> 0x037f }
        L_0x0300:
            gb5[] r19 = defpackage.gb5.b     // Catch:{ all -> 0x037f }
            gb5 r24 = udd.x(r6)     // Catch:{ all -> 0x037f }
            boolean r6 = r4.isNull(r9)     // Catch:{ all -> 0x037f }
            if (r6 == 0) goto L_0x030f
            r25 = 0
            goto L_0x0315
        L_0x030f:
            java.lang.String r6 = r4.getString(r9)     // Catch:{ all -> 0x037f }
            r25 = r6
        L_0x0315:
            boolean r6 = r4.isNull(r12)     // Catch:{ all -> 0x037f }
            if (r6 == 0) goto L_0x031e
            r26 = 0
            goto L_0x0324
        L_0x031e:
            java.lang.String r6 = r4.getString(r12)     // Catch:{ all -> 0x037f }
            r26 = r6
        L_0x0324:
            long r27 = r4.getLong(r13)     // Catch:{ all -> 0x037f }
            long r29 = r4.getLong(r5)     // Catch:{ all -> 0x037f }
            boolean r6 = r4.isNull(r14)     // Catch:{ all -> 0x037f }
            if (r6 == 0) goto L_0x0335
            r31 = 0
            goto L_0x033b
        L_0x0335:
            java.lang.String r6 = r4.getString(r14)     // Catch:{ all -> 0x037f }
            r31 = r6
        L_0x033b:
            long r32 = r4.getLong(r2)     // Catch:{ all -> 0x037f }
            boolean r6 = r4.isNull(r1)     // Catch:{ all -> 0x037f }
            if (r6 == 0) goto L_0x0348
            r34 = 0
            goto L_0x034e
        L_0x0348:
            java.lang.String r6 = r4.getString(r1)     // Catch:{ all -> 0x037f }
            r34 = r6
        L_0x034e:
            boolean r6 = r4.isNull(r15)     // Catch:{ all -> 0x037f }
            if (r6 == 0) goto L_0x0357
            r35 = 0
            goto L_0x035d
        L_0x0357:
            java.lang.String r6 = r4.getString(r15)     // Catch:{ all -> 0x037f }
            r35 = r6
        L_0x035d:
            int r6 = r4.getInt(r7)     // Catch:{ all -> 0x037f }
            if (r6 == 0) goto L_0x0366
            r36 = 1
            goto L_0x0368
        L_0x0366:
            r36 = 0
        L_0x0368:
            int r6 = r4.getInt(r11)     // Catch:{ all -> 0x037f }
            if (r6 == 0) goto L_0x0371
            r37 = 1
            goto L_0x0373
        L_0x0371:
            r37 = 0
        L_0x0373:
            cb5 r6 = new cb5     // Catch:{ all -> 0x037f }
            r19 = r6
            r19.<init>(r20, r22, r24, r25, r26, r27, r29, r31, r32, r34, r35, r36, r37)     // Catch:{ all -> 0x037f }
            r10.add(r6)     // Catch:{ all -> 0x037f }
            goto L_0x02e6
        L_0x037f:
            r0 = move-exception
            goto L_0x038b
        L_0x0381:
            r4.close()
            r44.m()
            return r10
        L_0x0388:
            r0 = move-exception
            r44 = r6
        L_0x038b:
            r4.close()
            r44.m()
            throw r0
        L_0x0392:
            ww r12 = (ww) r12
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.X
            r1 = 1
            r0.set(r1)
            r0 = 10
            android.os.Process.setThreadPriority(r0)     // Catch:{ all -> 0x03aa }
            r12.a()     // Catch:{ all -> 0x03aa }
            android.os.Binder.flushPendingCommands()     // Catch:{ all -> 0x03aa }
            r1 = 0
            r12.b(r1)
            return r1
        L_0x03aa:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r1 = r12.o     // Catch:{ all -> 0x03b2 }
            r2 = 1
            r1.set(r2)     // Catch:{ all -> 0x03b2 }
            throw r0     // Catch:{ all -> 0x03b2 }
        L_0x03b2:
            r0 = move-exception
            r1 = 0
            r12.b(r1)
            throw r0
        L_0x03b8:
            et8 r12 = (defpackage.et8) r12
            aec r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x03d0 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x03d0 }
            at8 r0 = (defpackage.at8) r0     // Catch:{ all -> 0x03d0 }
            r2.C(r0)     // Catch:{ all -> 0x03d0 }
            r1.r()     // Catch:{ all -> 0x03d0 }
            r1.l()
            r1 = 0
            return r1
        L_0x03d0:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x03d5:
            eb5 r12 = (defpackage.eb5) r12
            aec r1 = r12.a
            java.lang.Object r0 = r0.b
            r2 = r0
            pec r2 = (pec) r2
            r3 = 0
            android.database.Cursor r1 = r1.o(r2, r3)
            int r0 = defpackage.gp0.o(r1, r8)     // Catch:{ all -> 0x040d }
            java.lang.String r3 = "last_notify_msg_id"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x040d }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x040d }
            int r5 = r1.getCount()     // Catch:{ all -> 0x040d }
            r4.<init>(r5)     // Catch:{ all -> 0x040d }
        L_0x03f6:
            boolean r5 = r1.moveToNext()     // Catch:{ all -> 0x040d }
            if (r5 == 0) goto L_0x040f
            long r5 = r1.getLong(r0)     // Catch:{ all -> 0x040d }
            long r7 = r1.getLong(r3)     // Catch:{ all -> 0x040d }
            fb5 r9 = new fb5     // Catch:{ all -> 0x040d }
            r9.<init>(r5, r7)     // Catch:{ all -> 0x040d }
            r4.add(r9)     // Catch:{ all -> 0x040d }
            goto L_0x03f6
        L_0x040d:
            r0 = move-exception
            goto L_0x0416
        L_0x040f:
            r1.close()
            r2.m()
            return r4
        L_0x0416:
            r1.close()
            r2.m()
            throw r0
        L_0x041d:
            eb5 r12 = (defpackage.eb5) r12
            aec r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x0434 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0434 }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0434 }
            r2.B(r0)     // Catch:{ all -> 0x0434 }
            r1.r()     // Catch:{ all -> 0x0434 }
            r1.l()
            return r9
        L_0x0434:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x0439:
            na5 r12 = (defpackage.na5) r12
            aec r3 = r12.a
            java.lang.Object r0 = r0.b
            r4 = r0
            pec r4 = (pec) r4
            r6 = 0
            android.database.Cursor r3 = r3.o(r4, r6)
            int r0 = defpackage.gp0.o(r3, r2)     // Catch:{ all -> 0x054c }
            int r2 = defpackage.gp0.o(r3, r8)     // Catch:{ all -> 0x054c }
            java.lang.String r6 = "msg_id"
            int r6 = defpackage.gp0.o(r3, r6)     // Catch:{ all -> 0x054c }
            java.lang.String r7 = "analytics_status"
            int r7 = defpackage.gp0.o(r3, r7)     // Catch:{ all -> 0x054c }
            java.lang.String r8 = "suid"
            int r8 = defpackage.gp0.o(r3, r8)     // Catch:{ all -> 0x054c }
            java.lang.String r9 = "content_length"
            int r9 = defpackage.gp0.o(r3, r9)     // Catch:{ all -> 0x054c }
            java.lang.String r10 = "sent_time"
            int r10 = defpackage.gp0.o(r3, r10)     // Catch:{ all -> 0x054c }
            int r1 = defpackage.gp0.o(r3, r1)     // Catch:{ all -> 0x054c }
            java.lang.String r11 = "fcm_sent_time"
            int r11 = defpackage.gp0.o(r3, r11)     // Catch:{ all -> 0x054c }
            java.lang.String r12 = "received_time"
            int r12 = defpackage.gp0.o(r3, r12)     // Catch:{ all -> 0x054c }
            java.lang.String r13 = "push_type"
            int r13 = defpackage.gp0.o(r3, r13)     // Catch:{ all -> 0x054c }
            int r5 = defpackage.gp0.o(r3, r5)     // Catch:{ all -> 0x054c }
            java.lang.String r14 = "created_time"
            int r14 = defpackage.gp0.o(r3, r14)     // Catch:{ all -> 0x054c }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x054c }
            r44 = r4
            int r4 = r3.getCount()     // Catch:{ all -> 0x0543 }
            r15.<init>(r4)     // Catch:{ all -> 0x0543 }
        L_0x0498:
            boolean r4 = r3.moveToNext()     // Catch:{ all -> 0x0543 }
            if (r4 == 0) goto L_0x0545
            long r20 = r3.getLong(r0)     // Catch:{ all -> 0x0543 }
            long r22 = r3.getLong(r2)     // Catch:{ all -> 0x0543 }
            long r24 = r3.getLong(r6)     // Catch:{ all -> 0x0543 }
            int r4 = r3.getInt(r7)     // Catch:{ all -> 0x0543 }
            r19 = 3
            r41 = r0
            int[] r0 = hr1.w(r19)     // Catch:{ all -> 0x0543 }
            r42 = r2
            int r2 = r0.length     // Catch:{ all -> 0x0543 }
            r43 = r6
            r6 = 0
        L_0x04bc:
            if (r6 >= r2) goto L_0x04d0
            r19 = r0[r6]     // Catch:{ all -> 0x0543 }
            r26 = r0
            int r0 = hr1.t(r19)     // Catch:{ all -> 0x0543 }
            if (r0 != r4) goto L_0x04c9
            goto L_0x04d2
        L_0x04c9:
            r18 = 1
            int r6 = r6 + 1
            r0 = r26
            goto L_0x04bc
        L_0x04d0:
            r19 = 0
        L_0x04d2:
            if (r19 != 0) goto L_0x04d7
            r26 = 1
            goto L_0x04d9
        L_0x04d7:
            r26 = r19
        L_0x04d9:
            boolean r0 = r3.isNull(r8)     // Catch:{ all -> 0x0543 }
            if (r0 == 0) goto L_0x04e2
            r27 = 0
            goto L_0x04ec
        L_0x04e2:
            long r27 = r3.getLong(r8)     // Catch:{ all -> 0x0543 }
            java.lang.Long r0 = java.lang.Long.valueOf(r27)     // Catch:{ all -> 0x0543 }
            r27 = r0
        L_0x04ec:
            long r28 = r3.getLong(r9)     // Catch:{ all -> 0x0543 }
            boolean r0 = r3.isNull(r10)     // Catch:{ all -> 0x0543 }
            if (r0 == 0) goto L_0x04f9
            r30 = 0
            goto L_0x0503
        L_0x04f9:
            long r30 = r3.getLong(r10)     // Catch:{ all -> 0x0543 }
            java.lang.Long r0 = java.lang.Long.valueOf(r30)     // Catch:{ all -> 0x0543 }
            r30 = r0
        L_0x0503:
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x0543 }
            if (r0 == 0) goto L_0x050c
            r31 = 0
            goto L_0x0512
        L_0x050c:
            java.lang.String r0 = r3.getString(r1)     // Catch:{ all -> 0x0543 }
            r31 = r0
        L_0x0512:
            long r32 = r3.getLong(r11)     // Catch:{ all -> 0x0543 }
            long r34 = r3.getLong(r12)     // Catch:{ all -> 0x0543 }
            boolean r0 = r3.isNull(r13)     // Catch:{ all -> 0x0543 }
            if (r0 == 0) goto L_0x0523
            r36 = 0
            goto L_0x0529
        L_0x0523:
            java.lang.String r0 = r3.getString(r13)     // Catch:{ all -> 0x0543 }
            r36 = r0
        L_0x0529:
            long r37 = r3.getLong(r5)     // Catch:{ all -> 0x0543 }
            long r39 = r3.getLong(r14)     // Catch:{ all -> 0x0543 }
            oa5 r0 = new oa5     // Catch:{ all -> 0x0543 }
            r19 = r0
            r19.<init>(r20, r22, r24, r26, r27, r28, r30, r31, r32, r34, r36, r37, r39)     // Catch:{ all -> 0x0543 }
            r15.add(r0)     // Catch:{ all -> 0x0543 }
            r0 = r41
            r2 = r42
            r6 = r43
            goto L_0x0498
        L_0x0543:
            r0 = move-exception
            goto L_0x054f
        L_0x0545:
            r3.close()
            r44.m()
            return r15
        L_0x054c:
            r0 = move-exception
            r44 = r4
        L_0x054f:
            r3.close()
            r44.m()
            throw r0
        L_0x0556:
            na5 r12 = (defpackage.na5) r12
            aec r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x056d }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x056d }
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x056d }
            r2.B(r0)     // Catch:{ all -> 0x056d }
            r1.r()     // Catch:{ all -> 0x056d }
            r1.l()
            return r9
        L_0x056d:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x0572:
            ha5 r12 = (defpackage.ha5) r12
            aec r1 = r12.a
            java.lang.Object r0 = r0.b
            pec r0 = (pec) r0
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x05a3 }
            int r2 = r1.getCount()     // Catch:{ all -> 0x05a3 }
            r0.<init>(r2)     // Catch:{ all -> 0x05a3 }
        L_0x0588:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x05a3 }
            if (r2 == 0) goto L_0x05a5
            r2 = 0
            boolean r3 = r1.isNull(r2)     // Catch:{ all -> 0x05a3 }
            if (r3 == 0) goto L_0x0597
            r2 = 0
            goto L_0x059f
        L_0x0597:
            long r3 = r1.getLong(r2)     // Catch:{ all -> 0x05a3 }
            java.lang.Long r2 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x05a3 }
        L_0x059f:
            r0.add(r2)     // Catch:{ all -> 0x05a3 }
            goto L_0x0588
        L_0x05a3:
            r0 = move-exception
            goto L_0x05a9
        L_0x05a5:
            r1.close()
            return r0
        L_0x05a9:
            r1.close()
            throw r0
        L_0x05ad:
            y95 r12 = (defpackage.y95) r12
            aec r1 = r12.a
            java.lang.Object r0 = r0.b
            pec r0 = (pec) r0
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x05de }
            int r2 = r1.getCount()     // Catch:{ all -> 0x05de }
            r0.<init>(r2)     // Catch:{ all -> 0x05de }
        L_0x05c3:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x05de }
            if (r2 == 0) goto L_0x05e0
            r2 = 0
            boolean r3 = r1.isNull(r2)     // Catch:{ all -> 0x05de }
            if (r3 == 0) goto L_0x05d2
            r3 = 0
            goto L_0x05da
        L_0x05d2:
            long r3 = r1.getLong(r2)     // Catch:{ all -> 0x05de }
            java.lang.Long r3 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x05de }
        L_0x05da:
            r0.add(r3)     // Catch:{ all -> 0x05de }
            goto L_0x05c3
        L_0x05de:
            r0 = move-exception
            goto L_0x05e4
        L_0x05e0:
            r1.close()
            return r0
        L_0x05e4:
            r1.close()
            throw r0
        L_0x05e8:
            nm4 r12 = (defpackage.nm4) r12
            aec r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x0600 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0600 }
            hm4 r0 = (defpackage.hm4) r0     // Catch:{ all -> 0x0600 }
            r2.C(r0)     // Catch:{ all -> 0x0600 }
            r1.r()     // Catch:{ all -> 0x0600 }
            r1.l()
            r1 = 0
            return r1
        L_0x0600:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x0605:
            kb1 r12 = (defpackage.kb1) r12
            aec r1 = r12.a
            java.lang.Object r0 = r0.b
            pec r0 = (pec) r0
            r2 = 0
            android.database.Cursor r1 = r1.o(r0, r2)
            java.lang.String r0 = "conversation_id"
            int r0 = defpackage.gp0.o(r1, r0)     // Catch:{ all -> 0x065e }
            java.lang.String r2 = "join_link"
            int r2 = defpackage.gp0.o(r1, r2)     // Catch:{ all -> 0x065e }
            java.lang.String r3 = "started_at"
            int r3 = defpackage.gp0.o(r1, r3)     // Catch:{ all -> 0x065e }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x065e }
            int r5 = r1.getCount()     // Catch:{ all -> 0x065e }
            r4.<init>(r5)     // Catch:{ all -> 0x065e }
        L_0x062d:
            boolean r5 = r1.moveToNext()     // Catch:{ all -> 0x065e }
            if (r5 == 0) goto L_0x0660
            boolean r5 = r1.isNull(r0)     // Catch:{ all -> 0x065e }
            if (r5 == 0) goto L_0x063b
            r5 = 0
            goto L_0x063f
        L_0x063b:
            java.lang.String r5 = r1.getString(r0)     // Catch:{ all -> 0x065e }
        L_0x063f:
            boolean r6 = r1.isNull(r2)     // Catch:{ all -> 0x065e }
            if (r6 == 0) goto L_0x0647
            r6 = 0
            goto L_0x064b
        L_0x0647:
            java.lang.String r6 = r1.getString(r2)     // Catch:{ all -> 0x065e }
        L_0x064b:
            long r7 = r1.getLong(r3)     // Catch:{ all -> 0x065e }
            pa1 r9 = new pa1     // Catch:{ all -> 0x065e }
            r9.<init>()     // Catch:{ all -> 0x065e }
            r9.a = r5     // Catch:{ all -> 0x065e }
            r9.b = r6     // Catch:{ all -> 0x065e }
            r9.c = r7     // Catch:{ all -> 0x065e }
            r4.add(r9)     // Catch:{ all -> 0x065e }
            goto L_0x062d
        L_0x065e:
            r0 = move-exception
            goto L_0x0664
        L_0x0660:
            r1.close()
            return r4
        L_0x0664:
            r1.close()
            throw r0
        L_0x0668:
            kb1 r12 = (defpackage.kb1) r12
            th r1 = r12.b
            aec r2 = r12.a
            yz5 r3 = r1.f()
            java.lang.Object r0 = r0.b
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x067d
            r4 = 1
            r3.W(r4)
            goto L_0x0681
        L_0x067d:
            r4 = 1
            r3.f(r4, r0)
        L_0x0681:
            r2.c()     // Catch:{ all -> 0x0697 }
            r3.n()     // Catch:{ all -> 0x0692 }
            r2.r()     // Catch:{ all -> 0x0692 }
            r2.l()     // Catch:{ all -> 0x0697 }
            r1.u(r3)
            r1 = 0
            return r1
        L_0x0692:
            r0 = move-exception
            r2.l()     // Catch:{ all -> 0x0697 }
            throw r0     // Catch:{ all -> 0x0697 }
        L_0x0697:
            r0 = move-exception
            r1.u(r3)
            throw r0
        L_0x069c:
            oj r12 = (defpackage.oj) r12
            aec r1 = r12.a
            java.lang.Object r0 = r0.b
            r2 = r0
            pec r2 = (pec) r2
            r3 = 0
            android.database.Cursor r1 = r1.o(r2, r3)
            int r0 = defpackage.gp0.o(r1, r6)     // Catch:{ all -> 0x0724 }
            java.lang.String r5 = "name"
            int r5 = defpackage.gp0.o(r1, r5)     // Catch:{ all -> 0x0724 }
            java.lang.String r6 = "icon_url"
            int r6 = defpackage.gp0.o(r1, r6)     // Catch:{ all -> 0x0724 }
            java.lang.String r7 = "icon_lottie_url"
            int r7 = defpackage.gp0.o(r1, r7)     // Catch:{ all -> 0x0724 }
            int r4 = defpackage.gp0.o(r1, r4)     // Catch:{ all -> 0x0724 }
            java.lang.String r8 = "animoji_ids"
            int r8 = defpackage.gp0.o(r1, r8)     // Catch:{ all -> 0x0724 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x0724 }
            int r10 = r1.getCount()     // Catch:{ all -> 0x0724 }
            r9.<init>(r10)     // Catch:{ all -> 0x0724 }
        L_0x06d3:
            boolean r10 = r1.moveToNext()     // Catch:{ all -> 0x0724 }
            if (r10 == 0) goto L_0x0726
            long r12 = r1.getLong(r0)     // Catch:{ all -> 0x0724 }
            boolean r10 = r1.isNull(r5)     // Catch:{ all -> 0x0724 }
            if (r10 == 0) goto L_0x06e5
            r14 = r3
            goto L_0x06ea
        L_0x06e5:
            java.lang.String r10 = r1.getString(r5)     // Catch:{ all -> 0x0724 }
            r14 = r10
        L_0x06ea:
            boolean r10 = r1.isNull(r6)     // Catch:{ all -> 0x0724 }
            if (r10 == 0) goto L_0x06f2
            r15 = r3
            goto L_0x06f7
        L_0x06f2:
            java.lang.String r10 = r1.getString(r6)     // Catch:{ all -> 0x0724 }
            r15 = r10
        L_0x06f7:
            boolean r10 = r1.isNull(r7)     // Catch:{ all -> 0x0724 }
            if (r10 == 0) goto L_0x0700
            r16 = r3
            goto L_0x0706
        L_0x0700:
            java.lang.String r10 = r1.getString(r7)     // Catch:{ all -> 0x0724 }
            r16 = r10
        L_0x0706:
            long r17 = r1.getLong(r4)     // Catch:{ all -> 0x0724 }
            boolean r10 = r1.isNull(r8)     // Catch:{ all -> 0x0724 }
            if (r10 == 0) goto L_0x0712
            r10 = r3
            goto L_0x0716
        L_0x0712:
            java.lang.String r10 = r1.getString(r8)     // Catch:{ all -> 0x0724 }
        L_0x0716:
            java.util.ArrayList r19 = js.G(r10)     // Catch:{ all -> 0x0724 }
            nj r10 = new nj     // Catch:{ all -> 0x0724 }
            r11 = r10
            r11.<init>(r12, r14, r15, r16, r17, r19)     // Catch:{ all -> 0x0724 }
            r9.add(r10)     // Catch:{ all -> 0x0724 }
            goto L_0x06d3
        L_0x0724:
            r0 = move-exception
            goto L_0x072d
        L_0x0726:
            r1.close()
            r2.m()
            return r9
        L_0x072d:
            r1.close()
            r2.m()
            throw r0
        L_0x0734:
            oj r12 = (defpackage.oj) r12
            aec r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x074b }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x074b }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x074b }
            r2.B(r0)     // Catch:{ all -> 0x074b }
            r1.r()     // Catch:{ all -> 0x074b }
            r1.l()
            return r9
        L_0x074b:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x0750:
            wh r12 = (defpackage.wh) r12
            aec r1 = r12.a
            r1.c()
            sh r2 = r12.b     // Catch:{ all -> 0x0767 }
            java.lang.Object r0 = r0.b     // Catch:{ all -> 0x0767 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0767 }
            r2.B(r0)     // Catch:{ all -> 0x0767 }
            r1.r()     // Catch:{ all -> 0x0767 }
            r1.l()
            return r9
        L_0x0767:
            r0 = move-exception
            r1.l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uh.call():java.lang.Object");
    }

    public void finalize() {
        switch (this.a) {
            case 4:
                ((pec) this.b).m();
                return;
            case 6:
                ((pec) this.b).m();
                return;
            case 7:
                ((pec) this.b).m();
                return;
            case 23:
                ((pec) this.b).m();
                return;
            case 25:
                ((pec) this.b).m();
                return;
            default:
                super.finalize();
                return;
        }
    }

    public uh(ww wwVar) {
        this.a = 13;
        this.c = wwVar;
    }
}
