package defpackage;

import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.net.Uri;
import android.os.Looper;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import org.apache.http.util.LangUtils;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandException;

/* renamed from: y76  reason: default package */
public final class y76 implements nbc, i83, lja, m06, h67, a38, ghc, vcd {
    public static final /* synthetic */ y76 X = new y76(4);
    public static final y76 Y = new y76(5);
    public static final y76 b = new y76(1);
    public static final y76 c = new y76(2);
    public static final y76 o = new y76(3);
    public final /* synthetic */ int a;

    public /* synthetic */ y76(int i) {
        this.a = i;
    }

    public static khc i(JSONObject jSONObject) {
        String string = jSONObject.getString("response");
        string.getClass();
        Integer num = null;
        if (string.equals("report-perf-stat")) {
            if (jSONObject.has("estimatedPerformanceIndex")) {
                num = Integer.valueOf(jSONObject.getInt("estimatedPerformanceIndex"));
            }
            return new eac(num);
        } else if (!string.equals("update-display-layout")) {
            return null;
        } else {
            if (!jSONObject.has("errorCodeByParticipantId")) {
                return new ive(Collections.emptyMap());
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("errorCodeByParticipantId");
            HashMap hashMap = new HashMap();
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(x87.w0(next), jSONObject2.getInt(next) == -1 ? hve.b : hve.a);
            }
            return new ive(hashMap);
        }
    }

    public static JSONObject l(long j, ahc ahc) {
        String str;
        if (ahc instanceof dac) {
            dac dac = (dac) ahc;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("framesReceived", dac.a);
            jSONObject.put("framesDecoded", dac.b);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("sequence", j);
            jSONObject2.put("command", (Object) "report-perf-stat");
            jSONObject2.put("report", (Object) jSONObject);
            return jSONObject2;
        } else if (ahc instanceof gve) {
            gve gve = (gve) ahc;
            JSONObject jSONObject3 = new JSONObject();
            for (mzc mzc : gve.a) {
                lzc lzc = mzc.b;
                if (lzc.a) {
                    str = "ss";
                } else {
                    str = "sz=" + lzc.b + "x" + lzc.c + ":fit=" + m4b.a(lzc.d);
                }
                jSONObject3.put(x87.S(mzc), (Object) str);
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("sequence", j);
            jSONObject4.put("command", (Object) "update-display-layout");
            jSONObject4.put("layouts", (Object) jSONObject3);
            if (gve.b) {
                jSONObject4.put("snapshot", true);
            }
            return jSONObject4;
        } else if (ahc instanceof mac) {
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("sequence", j);
            jSONObject5.put("command", (Object) "request-asr");
            jSONObject5.put("start", ((mac) ahc).a);
            return jSONObject5;
        } else if (!(ahc instanceof bac)) {
            return null;
        } else {
            bac bac = (bac) ahc;
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("sequence", j);
            jSONObject6.put("command", (Object) "report-network-stat");
            jSONObject6.put("timestamp", bac.a);
            jSONObject6.put("bitrate", bac.b);
            return jSONObject6;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0049, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0079, code lost:
        if (r11 != false) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0086, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L_0x0089;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean n(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            r0 = 0
            if (r8 == 0) goto L_0x00f3
            if (r7 != 0) goto L_0x0007
            goto L_0x00f3
        L_0x0007:
            if (r9 < 0) goto L_0x00f3
            if (r10 >= 0) goto L_0x000d
            goto L_0x00f3
        L_0x000d:
            int r1 = android.text.Selection.getSelectionStart(r8)
            int r2 = android.text.Selection.getSelectionEnd(r8)
            r3 = -1
            if (r1 == r3) goto L_0x00f3
            if (r2 == r3) goto L_0x00f3
            if (r1 == r2) goto L_0x001e
            goto L_0x00f3
        L_0x001e:
            r4 = 1
            if (r11 == 0) goto L_0x00a9
            int r9 = java.lang.Math.max(r9, r0)
            int r11 = r8.length()
            if (r1 < 0) goto L_0x0030
            if (r11 >= r1) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            if (r9 >= 0) goto L_0x0032
        L_0x0030:
            r1 = r3
            goto L_0x0061
        L_0x0032:
            r11 = r0
        L_0x0033:
            if (r9 != 0) goto L_0x0036
            goto L_0x0061
        L_0x0036:
            int r1 = r1 + -1
            if (r1 >= 0) goto L_0x003f
            if (r11 == 0) goto L_0x003d
            goto L_0x0030
        L_0x003d:
            r1 = r0
            goto L_0x0061
        L_0x003f:
            char r5 = r8.charAt(r1)
            if (r11 == 0) goto L_0x004f
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 != 0) goto L_0x004c
            goto L_0x0030
        L_0x004c:
            int r9 = r9 + -1
            goto L_0x0032
        L_0x004f:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x0058
            int r9 = r9 + -1
            goto L_0x0033
        L_0x0058:
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 == 0) goto L_0x005f
            goto L_0x0030
        L_0x005f:
            r11 = r4
            goto L_0x0033
        L_0x0061:
            int r9 = java.lang.Math.max(r10, r0)
            int r10 = r8.length()
            if (r2 < 0) goto L_0x0070
            if (r10 >= r2) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            if (r9 >= 0) goto L_0x0072
        L_0x0070:
            r10 = r3
            goto L_0x00a4
        L_0x0072:
            r11 = r0
        L_0x0073:
            if (r9 != 0) goto L_0x0077
            r10 = r2
            goto L_0x00a4
        L_0x0077:
            if (r2 < r10) goto L_0x007c
            if (r11 == 0) goto L_0x00a4
            goto L_0x0070
        L_0x007c:
            char r5 = r8.charAt(r2)
            if (r11 == 0) goto L_0x008e
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 != 0) goto L_0x0089
            goto L_0x0070
        L_0x0089:
            int r9 = r9 + -1
            int r2 = r2 + 1
            goto L_0x0072
        L_0x008e:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L_0x0099
            int r9 = r9 + -1
            int r2 = r2 + 1
            goto L_0x0073
        L_0x0099:
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 == 0) goto L_0x00a0
            goto L_0x0070
        L_0x00a0:
            int r2 = r2 + 1
            r11 = r4
            goto L_0x0073
        L_0x00a4:
            if (r1 == r3) goto L_0x00f3
            if (r10 != r3) goto L_0x00b7
            goto L_0x00f3
        L_0x00a9:
            int r1 = r1 - r9
            int r1 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r10
            int r9 = r8.length()
            int r10 = java.lang.Math.min(r2, r9)
        L_0x00b7:
            java.lang.Class<ite> r9 = ite.class
            java.lang.Object[] r9 = r8.getSpans(r1, r10, r9)
            ite[] r9 = (ite[]) r9
            if (r9 == 0) goto L_0x00f3
            int r11 = r9.length
            if (r11 <= 0) goto L_0x00f3
            int r11 = r9.length
            r2 = r0
        L_0x00c6:
            if (r2 >= r11) goto L_0x00dd
            r3 = r9[r2]
            int r5 = r8.getSpanStart(r3)
            int r3 = r8.getSpanEnd(r3)
            int r1 = java.lang.Math.min(r5, r1)
            int r10 = java.lang.Math.max(r3, r10)
            int r2 = r2 + 1
            goto L_0x00c6
        L_0x00dd:
            int r9 = java.lang.Math.max(r1, r0)
            int r11 = r8.length()
            int r10 = java.lang.Math.min(r10, r11)
            r7.beginBatchEdit()
            r8.delete(r9, r10)
            r7.endBatchEdit()
            r0 = r4
        L_0x00f3:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y76.n(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public static String o(bk9 bk9) {
        if (bk9 instanceof wj9) {
            return "auto," + ((wj9) bk9).b;
        } else if (bk9.equals(xj9.b)) {
            return "disabled";
        } else {
            if (bk9 instanceof zj9) {
                zj9 zj9 = (zj9) bk9;
                eq4 eq4 = eq4.X;
                return me4.g("schedule,", (int) gwf.k(zp4.i(zj9.b, eq4), -2147483648L, 2147483647L), (int) gwf.k(zp4.i(zj9.c, eq4), -2147483648L, 2147483647L), ",");
            } else if (bk9.equals(ak9.b)) {
                return "system";
            } else {
                if (bk9.equals(yj9.b)) {
                    return "enabled";
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public static r6b p(String str) {
        pz4 pz4 = r6b.Z;
        pz4.getClass();
        u1 u1Var = new u1(0, pz4);
        while (u1Var.hasNext()) {
            r6b r6b = (r6b) u1Var.next();
            if (hhd.f(r6b.a, str)) {
                return r6b;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    public MediaCodecInfo a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    public boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    public int d() {
        return MediaCodecList.getCodecCount();
    }

    public boolean e() {
        return false;
    }

    public xw2 f(int i, byte[] bArr) {
        if (i == 0) {
            throw new RtcCommandException((Long) null, false, new IllegalArgumentException("Illegal 'format' value: null"));
        } else if (i == 1) {
            try {
                String str = new String(bArr);
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    try {
                        Long valueOf = jSONObject.has("sequence") ? Long.valueOf(jSONObject.getLong("sequence")) : null;
                        String string = jSONObject.has("type") ? jSONObject.getString("type") : null;
                        if ("response".equals(string)) {
                            if (valueOf != null) {
                                try {
                                    khc i2 = i(jSONObject);
                                    if (i2 == null) {
                                        return null;
                                    }
                                    return new xw2(valueOf.longValue(), i2, 8);
                                } catch (Throwable th) {
                                    throw new RtcCommandException(valueOf, false, new IllegalArgumentException("Unable to decode response body: ".concat(str), th));
                                }
                            } else {
                                throw new RtcCommandException(valueOf, false, new IllegalArgumentException("Unable to decode response id: ".concat(str)));
                            }
                        } else if (!"error".equals(string)) {
                            return null;
                        } else {
                            jSONObject.optString("error", "");
                            boolean optBoolean = jSONObject.optBoolean("recoverable", false);
                            HashMap hashMap = new HashMap();
                            Iterator<String> keys = jSONObject.keys();
                            while (keys.hasNext()) {
                                String next = keys.next();
                                String optString = jSONObject.optString(next);
                                if (optString != null) {
                                    hashMap.put(next, optString);
                                }
                            }
                            throw new RtcCommandException(valueOf, optBoolean, (Throwable) null);
                        }
                    } catch (Throwable th2) {
                        throw new RtcCommandException((Long) null, false, new IllegalArgumentException("Unable to decode response id/type: ".concat(str), th2));
                    }
                } catch (Throwable th3) {
                    throw new RtcCommandException((Long) null, false, new IllegalArgumentException("Unable to decode response as json: ".concat(str), th3));
                }
            } catch (Throwable th4) {
                throw new RtcCommandException((Long) null, false, new IllegalArgumentException("Unable to decode response as string", th4));
            }
        } else {
            throw new RtcCommandException((Long) null, false, new UnsupportedOperationException("Only text format is supported"));
        }
    }

    public /* bridge */ /* synthetic */ void g(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
    }

    public Object h(uwb uwb) {
        return kjd.r((Executor) uwb.f(new pjb(tc7.class, Executor.class)));
    }

    public pj5 j(zqd zqd) {
        return new djc(new pqd(zqd, (Continuation) null));
    }

    public Object k(Uri uri, tz3 tz3) {
        return Long.valueOf(oze.V(new BufferedReader(new InputStreamReader(tz3)).readLine()));
    }

    public void m(zs7 zs7) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Event bus " + zs7 + " accessed from non-main thread " + Looper.myLooper());
        }
    }

    public Object parse(m67 m67) {
        m67.z();
        return null;
    }

    public og0 t(long j, ahc ahc) {
        if (ahc != null) {
            try {
                JSONObject l = l(j, ahc);
                if (l != null) {
                    return new og0(1, l.toString().getBytes());
                }
                Long valueOf = Long.valueOf(j);
                throw new RtcCommandException(valueOf, false, new IllegalStateException("No serializer for command: " + ahc.getClass()));
            } catch (JSONException e) {
                Long valueOf2 = Long.valueOf(j);
                throw new RtcCommandException(valueOf2, false, new IllegalArgumentException("Unable to serialize command: " + ahc.getClass(), e));
            }
        } else {
            throw new RtcCommandException(Long.valueOf(j), false, new IllegalArgumentException("Illegal 'command' value: null"));
        }
    }

    public String toString() {
        switch (this.a) {
            case LangUtils.HASH_SEED:
                return "SharingStarted.Lazily";
            default:
                return super.toString();
        }
    }
}
