package defpackage;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: qb1  reason: default package */
public final class qb1 {
    public final pe1 a;
    public final xwb b;
    public final i26 c;
    public final jk9 d;
    public final s16 e;
    public final zk7 f;
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashMap h = new LinkedHashMap();
    public ac9 i = new ac9();

    public qb1(pe1 pe1, xwb xwb, bk bkVar, jk9 jk9, bx0 bx0, zk7 zk7) {
        this.a = pe1;
        this.b = xwb;
        this.c = bkVar;
        this.d = jk9;
        this.e = bx0;
        this.f = zk7;
    }

    public static k88 a(j88 j88, k88 k88, List list, ArrayList arrayList, boolean z) {
        k88 k882 = k88.a;
        if (k88 == null) {
            return k882;
        }
        int i2 = pb1.$EnumSwitchMapping$0[k88.ordinal()];
        return i2 != 1 ? (i2 == 2 && z) ? k882 : k88 : (list.contains(je1.a) || list.contains(je1.b)) ? k88.b : arrayList.contains(j88) ? k88.o : k88;
    }

    public static boolean d(gc9 gc9) {
        Object obj = gc9.get();
        k88 k88 = k88.c;
        if (obj == k88) {
            return false;
        }
        if (gc9.get() == k88.b) {
            gc9.set(k88.a);
        }
        if (gc9.get() != k88.o) {
            return true;
        }
        gc9.set(k88);
        return true;
    }

    public static void e(gc9 gc9) {
        k88 k88 = (k88) gc9.get();
        if (k88 == k88.c) {
            gc9.set(k88.b);
        } else if (k88 == k88.o) {
            gc9.set(k88.a);
        }
    }

    public final void b(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        this.d.getClass();
        w2d q = jk9.q(jSONObject);
        pe1 pe1 = this.a;
        ge1 ge1 = pe1.a.a;
        String x = r1g.x(jSONObject2, "adminId");
        ge1 b2 = x != null ? ge1.b(x) : null;
        String x2 = r1g.x(jSONObject2, "participantId");
        ge1 b3 = x2 != null ? ge1.b(x2) : null;
        boolean optBoolean = jSONObject2.optBoolean("muteAll", false);
        iw4 iw4 = iw4.a;
        if (b3 != null && !b3.equals(ge1)) {
            pe1.f(new pja(b3, new dr9(14), new nfc(22, f(jSONObject, b3, "handleMuteParticipant", jSONObject2.has("muteStates") ? x87.q(jSONObject) : iw4, false)), new dr9(14), new dr9(14), new dr9(14), new dr9(14)), (w2d) null);
        } else if (b2 != null && b2.equals(ge1)) {
            m(jSONObject, "handleMuteParticipant", 3, q, false);
            ArrayList arrayList = new ArrayList(pe1.r());
            for (ge1 ge12 : pe1.d(q).keySet()) {
                arrayList.add(new pja(ge12, new dr9(14), new nfc(22, f(jSONObject, ge12, "handleMuteParticipant", iw4, false)), new dr9(14), new dr9(14), new dr9(14), new dr9(14)));
            }
            pe1.g(q, arrayList);
        } else if (optBoolean) {
            c(jSONObject2, q, true);
            m(jSONObject, "handleMuteParticipant", 3, q, false);
            ArrayList arrayList2 = new ArrayList(pe1.r());
            for (ge1 ge13 : pe1.d(q).keySet()) {
                arrayList2.add(new pja(ge13, new dr9(14), new nfc(22, f(jSONObject, ge13, "handleMuteParticipant", iw4, false)), new dr9(14), new dr9(14), new dr9(14), new dr9(14)));
            }
            pe1.g(q, arrayList2);
        } else {
            c(jSONObject2, q, false);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0223 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0224  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0137 A[Catch:{ JSONException -> 0x0183 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x019b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(org.json.JSONObject r24, defpackage.w2d r25, boolean r26) {
        /*
            r23 = this;
            r8 = r23
            r9 = r24
            java.lang.String r10 = "SCREEN_SHARING"
            java.lang.String r11 = "VIDEO"
            java.lang.String r12 = "AUDIO"
            java.lang.String r13 = "MOVIE_SHARING"
            r16 = 0
            r6 = 1
            j88 r5 = defpackage.j88.o
            j88 r4 = defpackage.j88.a
            j88 r3 = defpackage.j88.b
            j88 r2 = defpackage.j88.c
            s16 r0 = r8.e
            java.lang.Object r0 = r0.invoke()
            r1 = r25
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0026
            return
        L_0x0026:
            r17 = 0
            java.lang.String r0 = "mediaOptions"
            boolean r18 = r9.has(r0)     // Catch:{ JSONException -> 0x0091 }
            if (r18 != 0) goto L_0x0036
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ JSONException -> 0x0091 }
            goto L_0x009d
        L_0x0036:
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0091 }
            r7.<init>()     // Catch:{ JSONException -> 0x0091 }
            org.json.JSONArray r0 = r9.getJSONArray(r0)     // Catch:{ JSONException -> 0x0091 }
            r14 = r16
        L_0x0041:
            int r15 = r0.length()     // Catch:{ JSONException -> 0x0091 }
            if (r14 >= r15) goto L_0x008f
            java.lang.String r15 = r0.getString(r14)     // Catch:{ JSONException -> 0x0091 }
            if (r15 != 0) goto L_0x0050
        L_0x004d:
            r15 = r17
            goto L_0x0088
        L_0x0050:
            int r19 = r15.hashCode()
            switch(r19) {
                case -214017395: goto L_0x0074;
                case 62628790: goto L_0x006b;
                case 81665115: goto L_0x0062;
                case 1982835689: goto L_0x0059;
                default: goto L_0x0057;
            }
        L_0x0057:
            r15 = -1
            goto L_0x007d
        L_0x0059:
            boolean r15 = r15.equals(r10)
            if (r15 != 0) goto L_0x0060
            goto L_0x0057
        L_0x0060:
            r15 = 3
            goto L_0x007d
        L_0x0062:
            boolean r15 = r15.equals(r11)
            if (r15 != 0) goto L_0x0069
            goto L_0x0057
        L_0x0069:
            r15 = 2
            goto L_0x007d
        L_0x006b:
            boolean r15 = r15.equals(r12)
            if (r15 != 0) goto L_0x0072
            goto L_0x0057
        L_0x0072:
            r15 = r6
            goto L_0x007d
        L_0x0074:
            boolean r15 = r15.equals(r13)
            if (r15 != 0) goto L_0x007b
            goto L_0x0057
        L_0x007b:
            r15 = r16
        L_0x007d:
            switch(r15) {
                case 0: goto L_0x0087;
                case 1: goto L_0x0085;
                case 2: goto L_0x0083;
                case 3: goto L_0x0081;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x004d
        L_0x0081:
            r15 = r2
            goto L_0x0088
        L_0x0083:
            r15 = r3
            goto L_0x0088
        L_0x0085:
            r15 = r4
            goto L_0x0088
        L_0x0087:
            r15 = r5
        L_0x0088:
            if (r15 == 0) goto L_0x008d
            r7.add(r15)     // Catch:{ JSONException -> 0x0091 }
        L_0x008d:
            int r14 = r14 + r6
            goto L_0x0041
        L_0x008f:
            r0 = r7
            goto L_0x009d
        L_0x0091:
            r0 = move-exception
            java.lang.String r7 = "media options parsing error"
            xwb r14 = r8.b
            java.lang.String r15 = "CallMediaOptionsDelegate"
            r14.logException(r15, r7, r0)
            hw4 r0 = hw4.a
        L_0x009d:
            boolean r7 = r0.isEmpty()
            r7 = r7 ^ r6
            if (r7 == 0) goto L_0x00f3
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L_0x00ae
            iw4 r7 = iw4.a
            r14 = r7
            goto L_0x00da
        L_0x00ae:
            java.util.HashMap r7 = defpackage.x87.q(r24)
            java.util.HashMap r14 = new java.util.HashMap
            r14.<init>()
            java.util.Iterator r15 = r0.iterator()
        L_0x00bb:
            boolean r19 = r15.hasNext()
            if (r19 == 0) goto L_0x00da
            java.lang.Object r19 = r15.next()
            r6 = r19
            j88 r6 = (defpackage.j88) r6
            java.lang.Object r19 = r7.get(r6)
            r1 = r19
            k88 r1 = (defpackage.k88) r1
            if (r1 == 0) goto L_0x00d6
            r14.put(r6, r1)
        L_0x00d6:
            r1 = r25
            r6 = 1
            goto L_0x00bb
        L_0x00da:
            boolean r1 = r0.isEmpty()
            r6 = 1
            r1 = r1 ^ r6
            if (r1 != 0) goto L_0x00fd
            java.lang.String r1 = "unmuteOptions"
            boolean r1 = r9.has(r1)
            if (r1 != 0) goto L_0x00fd
            java.lang.String r1 = "unmute"
            boolean r1 = r9.has(r1)
            if (r1 == 0) goto L_0x00f3
            goto L_0x00fd
        L_0x00f3:
            r20 = r2
            r21 = r3
            r22 = r4
            r19 = r5
            r14 = r6
            goto L_0x011a
        L_0x00fd:
            r7 = 0
            r15 = 0
            java.lang.String r19 = "handleMuteParticipant"
            r1 = r23
            r20 = r2
            r2 = r24
            r21 = r3
            r3 = r19
            r22 = r4
            r4 = r14
            r14 = r5
            r5 = r7
            r7 = r6
            r6 = r25
            r19 = r14
            r14 = r7
            r7 = r15
            r1.n(r2, r3, r4, r5, r6, r7)
        L_0x011a:
            ac9 r1 = r8.i
            k88 r2 = r1.a
            k88 r3 = r1.b
            k88 r4 = r1.c
            k88 r1 = r1.d
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ JSONException -> 0x0183 }
            r5.<init>()     // Catch:{ JSONException -> 0x0183 }
            java.lang.String r6 = "requestedMedia"
            org.json.JSONArray r6 = r9.getJSONArray(r6)     // Catch:{ JSONException -> 0x0183 }
            r7 = r16
        L_0x0131:
            int r9 = r6.length()     // Catch:{ JSONException -> 0x0183 }
            if (r7 >= r9) goto L_0x0187
            java.lang.String r9 = r6.getString(r7)     // Catch:{ JSONException -> 0x0183 }
            if (r9 != 0) goto L_0x0140
        L_0x013d:
            r9 = r17
            goto L_0x017c
        L_0x0140:
            int r15 = r9.hashCode()
            switch(r15) {
                case -214017395: goto L_0x0164;
                case 62628790: goto L_0x015b;
                case 81665115: goto L_0x0152;
                case 1982835689: goto L_0x0149;
                default: goto L_0x0147;
            }
        L_0x0147:
            r9 = -1
            goto L_0x016d
        L_0x0149:
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0150
            goto L_0x0147
        L_0x0150:
            r9 = 3
            goto L_0x016d
        L_0x0152:
            boolean r9 = r9.equals(r11)
            if (r9 != 0) goto L_0x0159
            goto L_0x0147
        L_0x0159:
            r9 = 2
            goto L_0x016d
        L_0x015b:
            boolean r9 = r9.equals(r12)
            if (r9 != 0) goto L_0x0162
            goto L_0x0147
        L_0x0162:
            r9 = r14
            goto L_0x016d
        L_0x0164:
            boolean r9 = r9.equals(r13)
            if (r9 != 0) goto L_0x016b
            goto L_0x0147
        L_0x016b:
            r9 = r16
        L_0x016d:
            switch(r9) {
                case 0: goto L_0x017a;
                case 1: goto L_0x0177;
                case 2: goto L_0x0174;
                case 3: goto L_0x0171;
                default: goto L_0x0170;
            }
        L_0x0170:
            goto L_0x013d
        L_0x0171:
            r9 = r20
            goto L_0x017c
        L_0x0174:
            r9 = r21
            goto L_0x017c
        L_0x0177:
            r9 = r22
            goto L_0x017c
        L_0x017a:
            r9 = r19
        L_0x017c:
            if (r9 == 0) goto L_0x0181
            r5.add(r9)     // Catch:{ JSONException -> 0x0183 }
        L_0x0181:
            int r7 = r7 + r14
            goto L_0x0131
        L_0x0183:
            java.util.Set r5 = java.util.Collections.emptySet()
        L_0x0187:
            boolean r6 = r5.isEmpty()
            r6 = r6 ^ r14
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x0195:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x01d9
            java.lang.Object r9 = r0.next()
            j88 r9 = (defpackage.j88) r9
            int r9 = r9.ordinal()
            if (r9 == 0) goto L_0x01cb
            if (r9 == r14) goto L_0x01bf
            r10 = 2
            if (r9 == r10) goto L_0x01b6
            r11 = 3
            if (r9 == r11) goto L_0x01b0
            goto L_0x0195
        L_0x01b0:
            r9 = r19
            r7.put(r9, r1)
            goto L_0x0195
        L_0x01b6:
            r9 = r19
            r12 = r20
            r11 = 3
            r7.put(r12, r4)
            goto L_0x0195
        L_0x01bf:
            r9 = r19
            r12 = r20
            r13 = r21
            r10 = 2
            r11 = 3
            r7.put(r13, r3)
            goto L_0x0195
        L_0x01cb:
            r9 = r19
            r12 = r20
            r13 = r21
            r15 = r22
            r10 = 2
            r11 = 3
            r7.put(r15, r2)
            goto L_0x0195
        L_0x01d9:
            r9 = r19
            r12 = r20
            r13 = r21
            r15 = r22
            k88 r0 = defpackage.k88.c
            if (r2 != r0) goto L_0x01f1
            boolean r2 = r5.contains(r15)
            if (r2 == 0) goto L_0x01f1
            r5.remove(r15)
            r7.remove(r15)
        L_0x01f1:
            if (r3 != r0) goto L_0x01ff
            boolean r2 = r5.contains(r13)
            if (r2 == 0) goto L_0x01ff
            r5.remove(r13)
            r7.remove(r13)
        L_0x01ff:
            if (r4 != r0) goto L_0x020d
            boolean r2 = r5.contains(r12)
            if (r2 == 0) goto L_0x020d
            r5.remove(r12)
            r7.remove(r12)
        L_0x020d:
            if (r1 != r0) goto L_0x021b
            boolean r0 = r5.contains(r9)
            if (r0 == 0) goto L_0x021b
            r5.remove(r9)
            r7.remove(r9)
        L_0x021b:
            if (r6 == 0) goto L_0x0224
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0224
            return
        L_0x0224:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0230
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0243
        L_0x0230:
            pc9 r0 = new pc9
            oc9 r1 = new oc9
            r1.<init>(r7)
            r2 = r26
            r0.<init>(r1, r2)
            g41 r1 = defpackage.g41.O0
            i26 r2 = r8.c
            r2.invoke(r1, r0)
        L_0x0243:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb1.c(org.json.JSONObject, w2d, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x016a, code lost:
        if (r6 == null) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x016d, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0175, code lost:
        if (r6 == null) goto L_0x0177;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ac9 f(org.json.JSONObject r17, defpackage.ge1 r18, java.lang.String r19, java.util.Map r20, boolean r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            pe1 r5 = r0.a
            if (r2 == 0) goto L_0x0013
            ke1 r7 = r5.j(r2)
            goto L_0x0014
        L_0x0013:
            r7 = 0
        L_0x0014:
            boolean r8 = r20.isEmpty()
            r8 = r8 ^ 1
            j88 r9 = defpackage.j88.o
            j88 r10 = defpackage.j88.c
            j88 r11 = defpackage.j88.b
            j88 r12 = defpackage.j88.a
            java.lang.String r13 = "CallMediaOptionsDelegate"
            xwb r14 = r0.b
            if (r8 == 0) goto L_0x0077
            java.util.HashMap r2 = new java.util.HashMap
            j88[] r5 = defpackage.j88.values()
            int r5 = r5.length
            r2.<init>(r5)
            ac9 r5 = r0.i
            k88 r5 = r5.a
            java.lang.Object r8 = r4.get(r12)
            k88 r8 = (defpackage.k88) r8
            if (r8 != 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r5 = r8
        L_0x0040:
            r2.put(r12, r5)
            ac9 r5 = r0.i
            k88 r5 = r5.b
            java.lang.Object r8 = r4.get(r11)
            k88 r8 = (defpackage.k88) r8
            if (r8 != 0) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r5 = r8
        L_0x0051:
            r2.put(r11, r5)
            ac9 r5 = r0.i
            k88 r5 = r5.c
            java.lang.Object r8 = r4.get(r10)
            k88 r8 = (defpackage.k88) r8
            if (r8 != 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r5 = r8
        L_0x0062:
            r2.put(r10, r5)
            ac9 r0 = r0.i
            k88 r0 = r0.d
            java.lang.Object r4 = r4.get(r9)
            k88 r4 = (defpackage.k88) r4
            if (r4 != 0) goto L_0x0072
            goto L_0x0073
        L_0x0072:
            r0 = r4
        L_0x0073:
            r2.put(r9, r0)
            goto L_0x00dd
        L_0x0077:
            ke1 r4 = r5.a
            ge1 r4 = r4.a
            boolean r2 = hhd.f(r2, r4)
            if (r2 == 0) goto L_0x00a8
            java.util.HashMap r2 = new java.util.HashMap
            j88[] r4 = defpackage.j88.values()
            int r4 = r4.length
            r2.<init>(r4)
            ac9 r4 = r0.i
            k88 r4 = r4.a
            r2.put(r12, r4)
            ac9 r4 = r0.i
            k88 r4 = r4.b
            r2.put(r11, r4)
            ac9 r4 = r0.i
            k88 r4 = r4.c
            r2.put(r10, r4)
            ac9 r0 = r0.i
            k88 r0 = r0.d
            r2.put(r9, r0)
            goto L_0x00dd
        L_0x00a8:
            if (r7 == 0) goto L_0x00ad
            ac9 r0 = r7.b
            goto L_0x00ae
        L_0x00ad:
            r0 = 0
        L_0x00ae:
            if (r0 == 0) goto L_0x00d3
            java.util.HashMap r2 = new java.util.HashMap
            j88[] r0 = defpackage.j88.values()
            int r0 = r0.length
            r2.<init>(r0)
            ac9 r0 = r7.b
            k88 r0 = r0.a
            r2.put(r12, r0)
            ac9 r0 = r7.b
            k88 r4 = r0.b
            r2.put(r11, r4)
            k88 r4 = r0.c
            r2.put(r10, r4)
            k88 r0 = r0.d
            r2.put(r9, r0)
            goto L_0x00dd
        L_0x00d3:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r0 = "createParticipantMediaOptions null participant or null media options"
            r14.log(r13, r0)
        L_0x00dd:
            if (r21 == 0) goto L_0x0109
            java.util.HashMap r0 = defpackage.x87.q(r17)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x00eb:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0109
            java.lang.Object r4 = r0.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            j88 r5 = (defpackage.j88) r5
            java.lang.Object r4 = r4.getValue()
            k88 r4 = (defpackage.k88) r4
            if (r4 == 0) goto L_0x00eb
            r2.put(r5, r4)
            goto L_0x00eb
        L_0x0109:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r0 = "unmuteOptions"
            org.json.JSONArray r5 = r1.optJSONArray(r0)
            if (r5 == 0) goto L_0x014e
            int r15 = r5.length()     // Catch:{ JSONException -> 0x012d }
            r6 = 0
        L_0x011b:
            if (r6 >= r15) goto L_0x014e
            java.lang.Object r0 = r5.get(r6)     // Catch:{ JSONException -> 0x012d }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ JSONException -> 0x012d }
            j88 r0 = defpackage.j88.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x012f }
            r4.add(r0)     // Catch:{ IllegalArgumentException -> 0x012f }
            r18 = r5
            goto L_0x0146
        L_0x012d:
            r0 = move-exception
            goto L_0x014b
        L_0x012f:
            r0 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x012d }
            r8.<init>()     // Catch:{ JSONException -> 0x012d }
            r18 = r5
            java.lang.String r5 = "invalid MediaOption in "
            r8.append(r5)     // Catch:{ JSONException -> 0x012d }
            r8.append(r3)     // Catch:{ JSONException -> 0x012d }
            java.lang.String r5 = r8.toString()     // Catch:{ JSONException -> 0x012d }
            r14.logException(r13, r5, r0)     // Catch:{ JSONException -> 0x012d }
        L_0x0146:
            int r6 = r6 + 1
            r5 = r18
            goto L_0x011b
        L_0x014b:
            r14.logException(r13, r3, r0)
        L_0x014e:
            java.lang.String r0 = "unmute"
            r3 = 0
            boolean r0 = r1.optBoolean(r0, r3)
            java.lang.String r3 = "roles"
            boolean r3 = r1.has(r3)
            hw4 r5 = hw4.a
            if (r3 == 0) goto L_0x016f
            java.util.ArrayList r5 = defpackage.x87.B(r17)     // Catch:{ Exception -> 0x0164 }
            goto L_0x0177
        L_0x0164:
            if (r7 == 0) goto L_0x0169
            java.util.List r6 = r7.e
            goto L_0x016a
        L_0x0169:
            r6 = 0
        L_0x016a:
            if (r6 != 0) goto L_0x016d
            goto L_0x0177
        L_0x016d:
            r5 = r6
            goto L_0x0177
        L_0x016f:
            if (r7 == 0) goto L_0x0174
            java.util.List r6 = r7.e
            goto L_0x0175
        L_0x0174:
            r6 = 0
        L_0x0175:
            if (r6 != 0) goto L_0x016d
        L_0x0177:
            ac9 r1 = new ac9
            r1.<init>()
            java.lang.Object r3 = r2.get(r12)
            k88 r3 = (defpackage.k88) r3
            k88 r3 = a(r12, r3, r5, r4, r0)
            r1.a = r3
            java.lang.Object r3 = r2.get(r11)
            k88 r3 = (defpackage.k88) r3
            k88 r3 = a(r11, r3, r5, r4, r0)
            r1.b = r3
            java.lang.Object r3 = r2.get(r10)
            k88 r3 = (defpackage.k88) r3
            k88 r3 = a(r10, r3, r5, r4, r0)
            r1.c = r3
            java.lang.Object r2 = r2.get(r9)
            k88 r2 = (defpackage.k88) r2
            k88 r0 = a(r9, r2, r5, r4, r0)
            r1.d = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb1.f(org.json.JSONObject, ge1, java.lang.String, java.util.Map, boolean):ac9");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r2 = (java.util.Map) r2.g.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map g(defpackage.w2d r3, int r4) {
        /*
            r2 = this;
            int[] r0 = defpackage.pb1.$EnumSwitchMapping$1
            int r4 = hr1.t(r4)
            r4 = r0[r4]
            r0 = 1
            if (r4 == r0) goto L_0x001e
            iw4 r0 = iw4.a
            r1 = 2
            if (r4 == r1) goto L_0x0011
            goto L_0x0026
        L_0x0011:
            java.util.LinkedHashMap r2 = r2.g
            java.lang.Object r2 = r2.get(r3)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto L_0x001c
            goto L_0x0026
        L_0x001c:
            r0 = r2
            goto L_0x0026
        L_0x001e:
            ac9 r2 = r2.h(r3)
            java.util.EnumMap r0 = r2.a()
        L_0x0026:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qb1.g(w2d, int):java.util.Map");
    }

    public final ac9 h(w2d w2d) {
        LinkedHashMap linkedHashMap = this.h;
        Object obj = linkedHashMap.get(w2d);
        if (obj == null) {
            obj = new ac9();
            linkedHashMap.put(w2d, obj);
        }
        return (ac9) obj;
    }

    public final void i(ge1 ge1, boolean z) {
        if (!z && hhd.f(this.a.a.a, ge1)) {
            zn1 zn1 = new zn1(0, 4, ac9.class, this.i, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;");
            Object obj = zn1.get();
            k88 k88 = k88.c;
            k88 k882 = k88.o;
            if (obj == k88) {
                zn1.set(k882);
            }
            zn1 zn12 = new zn1(0, 5, ac9.class, this.i, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;");
            if (zn12.get() == k88) {
                zn12.set(k882);
            }
            zn1 zn13 = new zn1(0, 6, ac9.class, this.i, "screenshareState", "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;");
            if (zn13.get() == k88) {
                zn13.set(k882);
            }
            zn1 zn14 = new zn1(0, 7, ac9.class, this.i, "movieSharingState", "getMovieSharingState()Lru/ok/android/webrtc/media_options/MediaOptionState;");
            if (zn14.get() == k88) {
                zn14.set(k882);
            }
        }
    }

    public final void j(ArrayList arrayList, ge1 ge1) {
        ArrayList arrayList2 = arrayList;
        ke1 ke1 = this.a.a;
        if (ge1.equals(ke1.a)) {
            ArrayList arrayList3 = ke1.d;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            if (arrayList2.contains(je1.b)) {
                e(new zn1(0, 8, ac9.class, this.i, "audioState", "getAudioState()Lru/ok/android/webrtc/media_options/MediaOptionState;"));
                e(new zn1(0, 9, ac9.class, this.i, "videoState", "getVideoState()Lru/ok/android/webrtc/media_options/MediaOptionState;"));
                e(new zn1(0, 10, ac9.class, this.i, "screenshareState", "getScreenshareState()Lru/ok/android/webrtc/media_options/MediaOptionState;"));
                e(new zn1(0, 11, ac9.class, this.i, "movieSharingState", "getMovieSharingState()Lru/ok/android/webrtc/media_options/MediaOptionState;"));
            }
        }
    }

    public final void k() {
        EnumMap a2 = this.i.a();
        this.c.invoke(g41.U0, new oc9(a2));
    }

    public final void l(Map map, JSONObject jSONObject, String str, int i2, w2d w2d, boolean z) {
        ac9 ac9 = new ac9();
        j88 j88 = j88.a;
        k88 k88 = (k88) map.get(j88);
        if (k88 != null) {
            ac9.a = k88;
        }
        j88 j882 = j88.b;
        k88 k882 = (k88) map.get(j882);
        if (k882 != null) {
            ac9.b = k882;
        }
        j88 j883 = j88.c;
        k88 k883 = (k88) map.get(j883);
        if (k883 != null) {
            ac9.c = k883;
        }
        j88 j884 = j88.o;
        k88 k884 = (k88) map.get(j884);
        if (k884 != null) {
            ac9.d = k884;
        }
        ac9 h2 = h(w2d);
        EnumMap enumMap = new EnumMap(j88.class);
        k88 k885 = ac9.a;
        if (k885 != h2.a) {
            enumMap.put(j88, k885);
        }
        k88 k886 = ac9.b;
        if (k886 != h2.b) {
            enumMap.put(j882, k886);
        }
        k88 k887 = ac9.c;
        if (k887 != h2.c) {
            enumMap.put(j883, k887);
        }
        k88 k888 = ac9.d;
        if (k888 != h2.d) {
            enumMap.put(j884, k888);
        }
        if (!enumMap.isEmpty()) {
            this.g.put(w2d, enumMap);
            this.h.put(w2d, ac9);
            if (z) {
                n(jSONObject, str, g(w2d, i2), false, w2d, (w2d) null);
            }
        }
    }

    public final void m(JSONObject jSONObject, String str, int i2, w2d w2d, boolean z) {
        iw4 iw4;
        if (jSONObject.has("muteStates")) {
            iw4 = x87.q(jSONObject);
        } else if (!jSONObject.has("requestedMedia")) {
            iw4 = iw4.a;
        } else {
            return;
        }
        l(iw4, jSONObject, str, i2, w2d, z);
    }

    public final void n(JSONObject jSONObject, String str, Map map, boolean z, w2d w2d, w2d w2d2) {
        if (w2d2 == null) {
            w2d2 = (w2d) this.e.invoke();
        }
        if (w2d.equals(w2d2)) {
            ac9 f2 = f(jSONObject, this.a.a.a, str, map, z);
            if (!f2.equals(this.i)) {
                this.i = f2;
                k();
            }
            this.g.put(w2d, iw4.a);
        }
    }
}
