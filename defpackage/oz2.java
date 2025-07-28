package defpackage;

import android.os.Looper;
import android.os.Message;
import com.facebook.fresco.middleware.HasExtraData;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: oz2  reason: default package */
public final class oz2 {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;

    public oz2(Looper looper, y7e y7e, mh7 mh7) {
        this(new CopyOnWriteArraySet(), looper, y7e, mh7);
    }

    public static a3d b(String str) {
        int hashCode = str.hashCode();
        if (hashCode != -1881281404) {
            if (hashCode != -1785516855) {
                if (hashCode != -873347853) {
                    if (hashCode == -595928767 && str.equals("TIMEOUT")) {
                        return a3d.o;
                    }
                } else if (str.equals("ACTIVATE")) {
                    return a3d.c;
                }
            } else if (str.equals("UPDATE")) {
                return a3d.a;
            }
        } else if (str.equals("REMOVE")) {
            return a3d.b;
        }
        return null;
    }

    public static re8 g(u2 u2Var, ws6 ws6, re8 re8, pje pje) {
        uje O1 = u2Var.O1();
        int B = u2Var.B();
        Object m = O1.q() ? null : O1.m(B);
        int b2 = (u2Var.n() || O1.q()) ? -1 : O1.f(B, pje).b(mze.D(u2Var.k()) - pje.f());
        for (int i = 0; i < ws6.size(); i++) {
            re8 re82 = (re8) ws6.get(i);
            if (j(re82, m, u2Var.n(), u2Var.o0(), u2Var.O(), b2)) {
                return re82;
            }
        }
        if (ws6.isEmpty() && re8 != null) {
            if (j(re8, m, u2Var.n(), u2Var.o0(), u2Var.O(), b2)) {
                return re8;
            }
        }
        return null;
    }

    public static boolean j(re8 re8, Object obj, boolean z, int i, int i2, int i3) {
        if (!re8.a.equals(obj)) {
            return false;
        }
        int i4 = re8.b;
        return (z && i4 == i && re8.c == i2) || (!z && i4 == -1 && re8.e == i3);
    }

    public z2d a(JSONObject jSONObject) {
        JSONArray jSONArray = jSONObject.getJSONArray("events");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            a3d b2 = b(jSONArray.getString(i));
            if (b2 != null) {
                linkedHashSet.add(b2);
            }
        }
        int i2 = jSONObject.getInt("roomId");
        boolean optBoolean = jSONObject.optBoolean("deactivate");
        JSONObject optJSONObject = jSONObject.optJSONObject("room");
        return new z2d(linkedHashSet, i2, optJSONObject != null ? k(optJSONObject) : null, optBoolean);
    }

    public void c(jn jnVar, re8 re8, uje uje) {
        if (re8 != null) {
            if (uje.b(re8.a) != -1) {
                jnVar.I(re8, uje);
                return;
            }
            uje uje2 = (uje) ((zs6) this.c).get(re8);
            if (uje2 != null) {
                jnVar.I(re8, uje2);
            }
        }
    }

    public za6 d(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("updates");
        ArrayList arrayList = new ArrayList();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            a3d b2 = b(next);
            if (b2 != null) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject(next);
                if (jSONObject3.has("rooms")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("rooms");
                    ArrayList arrayList2 = new ArrayList();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        arrayList2.add(k(jSONArray.getJSONObject(i)));
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        cgd cgd = (cgd) it.next();
                        arrayList.add(new z2d(Collections.singleton(b2), cgd.a, cgd, false));
                    }
                } else {
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("roomIds");
                    ArrayList arrayList3 = new ArrayList();
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        arrayList3.add(Integer.valueOf(jSONArray2.getInt(i2)));
                    }
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new z2d(Collections.singleton(b2), ((Number) it2.next()).intValue(), (cgd) null, false));
                    }
                }
            }
        }
        return new za6((Object) arrayList);
    }

    public l80 e() {
        String str = ((String) this.a) == null ? " mimeType" : BuildConfig.FLAVOR;
        if (((Integer) this.b) == null) {
            str = str.concat(" profile");
        }
        if (((kje) this.c) == null) {
            str = hr1.g(str, " inputTimebase");
        }
        if (((Integer) this.d) == null) {
            str = hr1.g(str, " bitrate");
        }
        if (((Integer) this.e) == null) {
            str = hr1.g(str, " sampleRate");
        }
        if (((Integer) this.f) == null) {
            str = hr1.g(str, " channelCount");
        }
        if (str.isEmpty()) {
            String str2 = (String) this.a;
            int intValue = ((Integer) this.b).intValue();
            l80 l80 = new l80(str2, intValue, (kje) this.c, ((Integer) this.d).intValue(), ((Integer) this.e).intValue(), ((Integer) this.f).intValue());
            if (!Objects.equals(str2, "audio/mp4a-latm") || intValue != -1) {
                return l80;
            }
            throw new IllegalArgumentException("Encoder mime set to AAC, but no AAC profile was provided.");
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object f(long r11, j4a r13, kotlin.coroutines.Continuation r14) {
        /*
            r10 = this;
            boolean r5 = r14 instanceof defpackage.mz2
            if (r5 == 0) goto L_0x0013
            r5 = r14
            mz2 r5 = (defpackage.mz2) r5
            int r6 = r5.x0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L_0x0013
            int r6 = r6 - r7
            r5.x0 = r6
            goto L_0x0018
        L_0x0013:
            mz2 r5 = new mz2
            r5.<init>(r10, r14)
        L_0x0018:
            java.lang.Object r4 = r5.Z
            pu3 r6 = defpackage.pu3.a
            int r7 = r5.x0
            jue r8 = defpackage.jue.a
            r9 = 1
            if (r7 == 0) goto L_0x0039
            if (r7 != r9) goto L_0x0031
            long r0 = r5.Y
            java.lang.Long r2 = r5.X
            oz2 r3 = r5.o
            defpackage.wx3.H(r4)
            r4 = r0
            r0 = r3
            goto L_0x0092
        L_0x0031:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0039:
            defpackage.wx3.H(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r7 = "dropServerDraft "
            r4.<init>(r7)
            r4.append(r11)
            java.lang.String r4 = r4.toString()
            java.lang.Object r7 = r10.a
            java.lang.String r7 = (java.lang.String) r7
            defpackage.udd.p(r7, r4, new java.lang.Object[0])
            java.lang.Object r4 = r10.f
            t97 r4 = (defpackage.t97) r4
            java.lang.Object r4 = r4.getValue()
            xzc r4 = (xzc) r4
            vqc r4 = (vqc) r4
            boolean r4 = r4.s()
            if (r4 != 0) goto L_0x0069
            java.lang.String r0 = "Drafts sync NOT enabled. Not discard to server"
            defpackage.udd.p(r7, r0, new java.lang.Object[0])
            return r8
        L_0x0069:
            if (r13 == 0) goto L_0x006e
            java.lang.Long r3 = r13.e
            goto L_0x006f
        L_0x006e:
            r3 = 0
        L_0x006f:
            if (r3 != 0) goto L_0x0077
            java.lang.String r0 = "Drafts sync enabled. No old draft. Not discard to server"
            defpackage.udd.p(r7, r0, new java.lang.Object[0])
            return r8
        L_0x0077:
            java.lang.String r4 = "Drafts sync enabled. Discard to server"
            defpackage.udd.p(r7, r4, new java.lang.Object[0])
            r5.o = r10
            r5.X = r3
            r5.Y = r11
            r5.x0 = r9
            java.lang.Object r4 = r10.b
            lz2 r4 = (defpackage.lz2) r4
            java.lang.Object r4 = r4.a(r11, r5)
            if (r4 != r6) goto L_0x008f
            return r6
        L_0x008f:
            r0 = r10
            r4 = r11
            r2 = r3
        L_0x0092:
            java.lang.Object r0 = r0.e
            t97 r0 = (defpackage.t97) r0
            java.lang.Object r0 = r0.getValue()
            pk r0 = (pk) r0
            long r6 = r2.longValue()
            gy9 r0 = (gy9) r0
            boolean r1 = r0.o(r4)
            if (r1 == 0) goto L_0x00c4
            r1 = 0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x00af
            goto L_0x00c4
        L_0x00af:
            xl4 r9 = new xl4
            g2b r1 = r0.z()
            j2b r1 = (j2b) r1
            i03 r1 = r1.a
            long r2 = r1.n()
            r1 = r9
            r1.<init>(r2, r4, r6)
            gy9.w(r0, r9)
        L_0x00c4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oz2.f(long, j4a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public void h() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f;
        if (!arrayDeque.isEmpty()) {
            g8e g8e = (g8e) this.a;
            if (!g8e.a.hasMessages(0)) {
                g8e.getClass();
                e8e b2 = g8e.b();
                b2.a = g8e.a.obtainMessage(0);
                g8e.getClass();
                Message message = b2.a;
                message.getClass();
                g8e.a.sendMessageAtFrontOfQueue(message);
                b2.a();
            }
            ArrayDeque arrayDeque2 = (ArrayDeque) this.e;
            boolean z = !arrayDeque2.isEmpty();
            arrayDeque2.addAll(arrayDeque);
            arrayDeque.clear();
            if (!z) {
                while (!arrayDeque2.isEmpty()) {
                    ((Runnable) arrayDeque2.peekFirst()).run();
                    arrayDeque2.removeFirst();
                }
            }
        }
    }

    public Object i(long j, Continuation continuation) {
        Object U = xs7.U(((pae) ((t97) this.d).getValue()).b(), new nz2(this, j, (Continuation) null), continuation);
        return U == pu3.a ? U : jue.a;
    }

    public cgd k(JSONObject jSONObject) {
        bgd bgd;
        fz0 fz0;
        egd egd;
        egd egd2;
        bgd bgd2;
        JSONObject jSONObject2 = jSONObject;
        int i = jSONObject2.getInt(HasExtraData.KEY_ID);
        String string = jSONObject2.getString("name");
        Boolean valueOf = jSONObject2.has("active") ? Boolean.valueOf(jSONObject2.optBoolean("active")) : null;
        if (jSONObject2.has("countdownSec")) {
            jSONObject2.optInt("countdownSec");
        }
        Long valueOf2 = jSONObject2.has("timeoutMs") ? Long.valueOf(jSONObject2.optLong("timeoutMs")) : null;
        int optInt = jSONObject2.optInt("participantCount");
        JSONArray optJSONArray = jSONObject2.optJSONArray("participantIds");
        zja zja = (zja) this.a;
        ArrayList a2 = optJSONArray != null ? zja.a(optJSONArray) : null;
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("addParticipantIds");
        ArrayList a3 = optJSONArray2 != null ? zja.a(optJSONArray2) : null;
        JSONArray optJSONArray3 = jSONObject2.optJSONArray("removeParticipantIds");
        ArrayList a4 = optJSONArray3 != null ? zja.a(optJSONArray3) : null;
        JSONObject optJSONObject = jSONObject2.optJSONObject("recordInfo");
        if (optJSONObject != null) {
            v4b v4b = (v4b) this.d;
            v4b.getClass();
            try {
                bgd2 = v4b.i(optJSONObject);
            } catch (JSONException e2) {
                ((xwb) v4b.b).logException("RecordInfoParser", "Can't parse record info", e2);
                bgd2 = null;
            }
            bgd = bgd2;
        } else {
            bgd = null;
        }
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("asrInfo");
        if (optJSONObject2 != null) {
            ((otf) this.e).getClass();
            fz0 = otf.M(optJSONObject2);
        } else {
            fz0 = null;
        }
        Map q = jSONObject2.has("muteStates") ? x87.q(jSONObject) : iw4.a;
        JSONObject optJSONObject3 = jSONObject2.optJSONObject("participants");
        agd S = optJSONObject3 != null ? ((mn) this.c).S(optJSONObject3, new v2d(i)) : null;
        boolean isNull = jSONObject2.isNull("pinnedParticipantId");
        String x = r1g.x(jSONObject2, "pinnedParticipantId");
        ge1 a5 = (isNull || x == null) ? null : ge1.a(x);
        JSONObject optJSONObject4 = jSONObject2.optJSONObject("urlSharingInfo");
        if (optJSONObject4 != null) {
            f2b f2b = (f2b) this.f;
            f2b.getClass();
            try {
                egd2 = new egd(ge1.a(optJSONObject4.getString("initiatorId")), optJSONObject4.getString("sharedUrl"));
            } catch (JSONException e3) {
                ((xwb) f2b.b).logException("UrlSharingParser", "Can't parse url sharing", e3);
                egd2 = null;
            }
            egd = egd2;
        } else {
            egd = null;
        }
        return new cgd(i, string, valueOf, a2, a3, a4, valueOf2, Integer.valueOf(optInt), bgd, fz0, q, S, a5, egd);
    }

    public void l(int i, kh7 kh7) {
        ((ArrayDeque) this.f).add(new wg1((Object) new CopyOnWriteArraySet((CopyOnWriteArraySet) this.d), i, (Object) kh7, 11));
    }

    public void m(int i, kh7 kh7) {
        l(i, kh7);
        h();
    }

    public void n(uje uje) {
        jn a2 = zs6.a();
        if (((ws6) this.a).isEmpty()) {
            c(a2, (re8) this.e, uje);
            if (!am7.j((re8) this.f, (re8) this.e)) {
                c(a2, (re8) this.f, uje);
            }
            if (!am7.j((re8) this.d, (re8) this.e) && !am7.j((re8) this.d, (re8) this.f)) {
                c(a2, (re8) this.d, uje);
            }
        } else {
            for (int i = 0; i < ((ws6) this.a).size(); i++) {
                c(a2, (re8) ((ws6) this.a).get(i), uje);
            }
            if (!((ws6) this.a).contains((re8) this.d)) {
                c(a2, (re8) this.d, uje);
            }
        }
        this.c = a2.k();
    }

    public oz2(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, y7e y7e, mh7 mh7) {
        this.b = y7e;
        this.d = copyOnWriteArraySet;
        this.c = mh7;
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        this.a = y7e.a(looper, new fi4(3, this));
    }
}
