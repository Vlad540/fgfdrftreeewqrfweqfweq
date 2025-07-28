package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import org.webrtc.RtpParameters;
import org.webrtc.RtpSender;

/* renamed from: b79  reason: default package */
public final class b79 {
    public final xwb a;

    public /* synthetic */ b79(xwb xwb) {
        this.a = xwb;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0039 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.e79 a(org.json.JSONObject r16, defpackage.w2d r17) {
        /*
            r0 = r16
            java.lang.String r1 = "movieId"
            long r1 = r0.getLong(r1)
            java.lang.String r3 = "initiatorId"
            java.lang.String r3 = r0.getString(r3)
            ge1 r3 = defpackage.ge1.a(r3)
            java.lang.String r4 = "title"
            java.lang.String r8 = r0.getString(r4)
            java.lang.String r4 = "source"
            java.lang.String r4 = r0.getString(r4)
            java.lang.String r5 = "MOVIE"
            boolean r5 = r4.equals(r5)
            r6 = 0
            if (r5 == 0) goto L_0x002b
            c79 r4 = defpackage.c79.a
        L_0x0029:
            r9 = r4
            goto L_0x0037
        L_0x002b:
            java.lang.String r5 = "STREAM"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0036
            c79 r4 = defpackage.c79.b
            goto L_0x0029
        L_0x0036:
            r9 = r6
        L_0x0037:
            if (r9 != 0) goto L_0x003a
            return r6
        L_0x003a:
            java.lang.String r4 = "externalMovieId"
            java.lang.String r7 = r0.getString(r4)
            java.lang.String r4 = "duration"
            long r4 = r0.optLong(r4)
            r10 = 0
            int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r6 > 0) goto L_0x0050
            u69 r4 = defpackage.u69.h
            r10 = r4
            goto L_0x0058
        L_0x0050:
            v69 r6 = new v69
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS
            r6.<init>(r4, r10)
            r10 = r6
        L_0x0058:
            e79 r4 = new e79
            t69 r12 = new t69
            w69 r6 = new w69
            r6.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "thumbnails"
            org.json.JSONArray r0 = r0.optJSONArray(r2)
            if (r0 == 0) goto L_0x009a
            int r2 = r0.length()
            r5 = 0
        L_0x0073:
            if (r5 >= r2) goto L_0x009a
            org.json.JSONObject r11 = r0.getJSONObject(r5)
            i79 r13 = new i79
            java.lang.String r14 = "url"
            java.lang.String r14 = r11.optString(r14)
            java.lang.String r15 = "width"
            int r15 = r11.optInt(r15)
            r16 = r0
            java.lang.String r0 = "height"
            int r0 = r11.optInt(r0)
            r13.<init>(r14, r15, r0)
            r1.add(r13)
            int r5 = r5 + 1
            r0 = r16
            goto L_0x0073
        L_0x009a:
            j79 r11 = new j79
            r11.<init>(r1)
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = r17
            r4.<init>(r3, r0, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b79.a(org.json.JSONObject, w2d):e79");
    }

    public static h79 b(JSONObject jSONObject) {
        long j = jSONObject.getLong("movieId");
        ge1 a2 = ge1.a(jSONObject.getString("initiatorId"));
        String string = jSONObject.getString("source");
        Integer num = null;
        c79 c79 = string.equals("MOVIE") ? c79.a : string.equals("STREAM") ? c79.b : null;
        if (c79 == null) {
            return null;
        }
        if (jSONObject.has("roomId")) {
            num = Integer.valueOf(jSONObject.optInt("roomId"));
        }
        return new h79(a2, num != null ? new v2d(num.intValue()) : u2d.a, new w69(j), c79);
    }

    public void c(RtpSender rtpSender, String str) {
        zla.A().b();
        this.a.log("RtpSenderHelper", "set audio bitrate range to 6000-48000, priority=1.0");
        d(rtpSender, str, 6000, 48000, Double.valueOf(1.0d), true);
    }

    public void d(RtpSender rtpSender, String str, int i, int i2, Double d, boolean z) {
        try {
            e(rtpSender, str, i, i2, d, z);
        } catch (Throwable th) {
            this.a.reportException("RtpSenderHelper", "Failed to set bitrate of ".concat(str), th);
        }
    }

    public void e(RtpSender rtpSender, String str, int i, int i2, Double d, boolean z) {
        RtpSender rtpSender2 = rtpSender;
        String str2 = str;
        int i3 = i;
        int i4 = i2;
        Double d2 = d;
        boolean z2 = z;
        xwb xwb = this.a;
        if (rtpSender2 == null) {
            xwb.log("RtpSenderHelper", str2.concat(": no sender"));
            return;
        }
        RtpParameters parameters = rtpSender.getParameters();
        if (parameters.encodings.isEmpty()) {
            xwb.log("RtpSenderHelper", str2.concat(": RtpParameters are not ready yet"));
            return;
        }
        boolean z3 = false;
        for (RtpParameters.Encoding next : parameters.encodings) {
            Integer num = next.maxBitrateBps;
            if (num == null || num.intValue() != i4) {
                next.maxBitrateBps = Integer.valueOf(i2);
                z3 = true;
            }
            Integer num2 = next.minBitrateBps;
            if (num2 == null || num2.intValue() != i3) {
                next.minBitrateBps = Integer.valueOf(i);
                z3 = true;
            }
            if (!(d2 == null || next.bitratePriority == d.doubleValue())) {
                next.bitratePriority = d.doubleValue();
                z3 = true;
            }
            if (next.adaptiveAudioPacketTime != z2) {
                next.adaptiveAudioPacketTime = z2;
                z3 = true;
            }
        }
        if (!z3) {
            xwb.log("RtpSenderHelper", str2 + " encodings update not needed. bitrate=[" + i3 + "-" + i4 + "](bps),priority=" + d2 + ",adaptiveAudioPTime=" + z2);
        } else if (rtpSender2.setParameters(parameters)) {
            xwb.log("RtpSenderHelper", str2 + " encodings update done. bitrate=[" + i3 + "-" + i4 + "](bps),priority=" + d2 + ",adaptiveAudioPTime=" + z2);
        } else {
            xwb.log("RtpSenderHelper", str2 + " encodings update failed. bitrate=[" + i3 + "-" + i4 + "](bps),priority=" + d2 + ",adaptiveAudioPTime=" + z2);
        }
    }

    public void f(RtpSender rtpSender, String str, boolean z, Integer num, Integer num2, Integer num3, RtpParameters.DegradationPreference degradationPreference) {
        if (rtpSender != null) {
            RtpParameters parameters = rtpSender.getParameters();
            boolean isEmpty = parameters.encodings.isEmpty();
            xwb xwb = this.a;
            if (isEmpty) {
                xwb.log("RtpSenderHelper", str.concat(": RtpParameters are not ready yet"));
                return;
            }
            for (RtpParameters.Encoding next : parameters.encodings) {
                if (!hhd.f(next.maxBitrateBps, num)) {
                    next.maxBitrateBps = num;
                    z = true;
                }
                if (!hhd.f(next.numTemporalLayers, num2)) {
                    next.numTemporalLayers = num2;
                    z = true;
                }
                if (!hhd.f(next.maxFramerate, num3)) {
                    next.maxFramerate = num3;
                    z = true;
                }
            }
            if (parameters.degradationPreference != degradationPreference) {
                parameters.degradationPreference = degradationPreference;
                z = true;
            }
            if (!z) {
                xwb.log("RtpSenderHelper", "No " + str + " change detected. Ignore update");
            } else if (!rtpSender.setParameters(parameters)) {
                xwb.log("RtpSenderHelper", "Failed to set sender parameters for " + str + ": maxBitrate=" + num + ", numTemporalLayers=" + num2 + ", maxFramerate=" + num3 + ", degradationPreference=" + degradationPreference);
            } else {
                xwb.log("RtpSenderHelper", "Sender parameters for " + str + ": maxBitrate=" + num + ", numTemporalLayers=" + num2 + ", maxFramerate=" + num3 + ", degradationPreference=" + degradationPreference);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        r4 = (org.webrtc.RtpParameters.Encoding) o23.X((r4 = r4.encodings));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int g(org.webrtc.RtpSender r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            goto L_0x0023
        L_0x0004:
            org.webrtc.RtpParameters r4 = r4.getParameters()     // Catch:{ all -> 0x0019 }
            if (r4 == 0) goto L_0x001b
            java.util.List<org.webrtc.RtpParameters$Encoding> r4 = r4.encodings     // Catch:{ all -> 0x0019 }
            if (r4 == 0) goto L_0x001b
            java.lang.Object r4 = o23.X(r4)     // Catch:{ all -> 0x0019 }
            org.webrtc.RtpParameters$Encoding r4 = (org.webrtc.RtpParameters.Encoding) r4     // Catch:{ all -> 0x0019 }
            if (r4 == 0) goto L_0x001b
            java.lang.Integer r4 = r4.maxBitrateBps     // Catch:{ all -> 0x0019 }
            goto L_0x001c
        L_0x0019:
            r4 = move-exception
            goto L_0x0024
        L_0x001b:
            r4 = 0
        L_0x001c:
            if (r4 != 0) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            int r0 = r4.intValue()     // Catch:{ all -> 0x0019 }
        L_0x0023:
            return r0
        L_0x0024:
            java.lang.String r1 = "RtpSenderHelper"
            java.lang.String r2 = "Unable to get sender max bitrate"
            xwb r3 = r3.a
            r3.reportException(r1, r2, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b79.g(org.webrtc.RtpSender):int");
    }

    public List h(JSONObject jSONObject, w2d w2d) {
        e79 e79;
        t69 t69;
        xwb xwb = this.a;
        hw4 hw4 = hw4.a;
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("movieShareInfos");
            if (optJSONArray == null) {
                return hw4;
            }
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                e79 = a(optJSONArray.getJSONObject(i), w2d);
                if (!(e79 == null || (t69 = e79.c) == null)) {
                    arrayList.add(t69);
                }
            }
            return arrayList;
        } catch (Throwable th) {
            xwb.logException("VideoStreamsParser", "Can't parse movies", th);
            return hw4;
        }
    }
}
