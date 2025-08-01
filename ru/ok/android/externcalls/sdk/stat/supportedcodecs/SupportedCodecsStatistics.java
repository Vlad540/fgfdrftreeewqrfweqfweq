package ru.ok.android.externcalls.sdk.stat.supportedcodecs;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.retry.RetryKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ok/android/externcalls/sdk/stat/supportedcodecs/SupportedCodecsStatistics;", "", "<init>", "()V", "Lmw9;", "okApi", "Lc2b;", "preferencesHelper", "Lxwb;", "rtcLog", "Lfe1;", "callParams", "Ljue;", "tryToReport", "(Lmw9;Lc2b;Lxwb;Lfe1;)V", "Lorg/json/JSONObject;", "buildCodecLists", "()Lorg/json/JSONObject;", "", "LOG_TAG", "Ljava/lang/String;", "", "ONE_MONTH_IN_MS", "J", "", "CODEC_ALIASES", "Ljava/util/Map;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class SupportedCodecsStatistics {
    private static final Map<String, String> CODEC_ALIASES = ju7.T(new wia[]{new wia("video/av1", "AV1"), new wia("video/av01", "AV1"), new wia("video/x-vnd.on2.vp8", "VP8"), new wia("video/x-vnd.on2.vp9", "VP9"), new wia("video/avc", "H264"), new wia("video/hevc", "H265"), new wia("audio/opus", "OPUS")});
    public static final SupportedCodecsStatistics INSTANCE = new SupportedCodecsStatistics();
    private static final String LOG_TAG = "SupportedCodecsStatistics";
    private static final long ONE_MONTH_IN_MS = TimeUnit.DAYS.toMillis(30);

    private SupportedCodecsStatistics() {
    }

    private final JSONObject buildCodecLists() {
        int i = 0;
        MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        int length = codecInfos.length;
        int i2 = 0;
        while (i2 < length) {
            MediaCodecInfo mediaCodecInfo = codecInfos[i2];
            JSONObject jSONObject2 = new JSONObject();
            String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
            if (!(supportedTypes == null || supportedTypes.length == 0)) {
                int length2 = supportedTypes.length;
                int i3 = i;
                while (i3 < length2) {
                    String str = supportedTypes[i3];
                    String str2 = CODEC_ALIASES.get(str);
                    if (str2 != null) {
                        jSONObject2.put("codec_name", (Object) str2);
                        jSONObject2.put("codec_implementation", (Object) mediaCodecInfo.getName());
                        jSONObject2.put("mime_type", (Object) str);
                        jSONObject2.put("is_encoder", mediaCodecInfo.isEncoder());
                        MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr = capabilitiesForType.profileLevels;
                        int length3 = codecProfileLevelArr.length;
                        int i4 = i;
                        int i5 = i4;
                        while (i4 < length3) {
                            i5 += codecProfileLevelArr[i4].profile;
                            i4++;
                        }
                        jSONObject2.put("profiles", i5);
                        jSONObject2.put("instance_count", capabilitiesForType.getMaxSupportedInstances());
                        jSONObject2.put("is_hardware", mediaCodecInfo.isHardwareAccelerated());
                        jSONArray.put((Object) jSONObject2);
                    }
                    i3++;
                    i = 0;
                }
            }
            i2++;
            i = 0;
        }
        jSONObject.put("codecs", (Object) jSONArray);
        return jSONObject;
    }

    @SuppressLint({"CheckResult"})
    public static final void tryToReport(mw9 mw9, c2b c2b, xwb xwb, fe1 fe1) {
        long time = new Date().getTime();
        if (time - c2b.a.getLong("supportedCodecsLastUpdate", 0) >= ONE_MONTH_IN_MS) {
            JSONObject buildCodecLists = INSTANCE.buildCodecLists();
            xwb.log(LOG_TAG, "Sending supported codecs " + buildCodecLists);
            RetryKt.retryApiCallForBackgroundWork(mw9.c().a(new SupportedCodecsApiRequest(buildCodecLists)), fe1.B.h, xwb).i(de.a()).k(new pn1(new SupportedCodecsStatistics$tryToReport$1(xwb, c2b, time), 2, new SupportedCodecsStatistics$tryToReport$2(xwb)));
        }
    }
}
