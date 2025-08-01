package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: c49  reason: default package */
public abstract class c49 {
    public static final ArrayList a = new ArrayList();
    public static final Pattern b = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static String a(String str, String str2) {
        if (str == null || str2 == null) {
            return null;
        }
        String[] e0 = oze.e0(str);
        StringBuilder sb = new StringBuilder();
        for (String str3 : e0) {
            if (str2.equals(c(str3))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str3);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static int b(String str, String str2) {
        ms e;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c = 1;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 4;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 5;
                    break;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c = 6;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 7;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 8;
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c = 9;
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 10;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = 11;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (e = e(str2)) == null) {
                    return 0;
                }
                return e.b();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 30;
            case 7:
                return 6;
            case 8:
                return 9;
            case 9:
                return 20;
            case 10:
                return 8;
            case 11:
                return 14;
            default:
                return 0;
        }
    }

    public static String c(String str) {
        ms e;
        String str2 = null;
        if (str == null) {
            return null;
        }
        String A = fja.A(str.trim());
        if (A.startsWith("avc1") || A.startsWith("avc3")) {
            return "video/avc";
        }
        if (A.startsWith("hev1") || A.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (A.startsWith("dvav") || A.startsWith("dva1") || A.startsWith("dvhe") || A.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (A.startsWith("av01")) {
            return "video/av01";
        }
        if (A.startsWith("vp9") || A.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (A.startsWith("vp8") || A.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (A.startsWith("mp4a")) {
            if (A.startsWith("mp4a.") && (e = e(A)) != null) {
                str2 = d(e.b);
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (A.startsWith("mha1")) {
            return "audio/mha1";
        } else {
            if (A.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (A.startsWith("ac-3") || A.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (A.startsWith("ec-3") || A.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (A.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (A.startsWith("ac-4") || A.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (A.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (A.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (A.startsWith("dtsh") || A.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (A.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (A.startsWith("opus")) {
                return "audio/opus";
            }
            if (A.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (A.startsWith("flac")) {
                return "audio/flac";
            }
            if (A.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (A.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (A.contains("cea708")) {
                return "application/cea-708";
            }
            if (A.contains("eia608") || A.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = a;
            if (arrayList.size() <= 0) {
                return null;
            }
            hr1.r(arrayList.get(0));
            throw null;
        }
    }

    public static String d(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static ms e(String str) {
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new ms(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0, 5);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String f(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (h(str)) {
            return 1;
        }
        if (k(str)) {
            return 2;
        }
        if (j(str)) {
            return 3;
        }
        if (i(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        hr1.r(arrayList.get(0));
        throw null;
    }

    public static boolean h(String str) {
        return "audio".equals(f(str));
    }

    public static boolean i(String str) {
        return "image".equals(f(str)) || "application/x-image-uri".equals(str);
    }

    public static boolean j(String str) {
        return "text".equals(f(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static boolean k(String str) {
        return "video".equals(f(str));
    }

    public static String l(String str) {
        if (str == null) {
            return null;
        }
        String A = fja.A(str);
        A.getClass();
        char c = 65535;
        switch (A.hashCode()) {
            case -1007807498:
                if (A.equals("audio/x-flac")) {
                    c = 0;
                    break;
                }
                break;
            case -979095690:
                if (A.equals("application/x-mpegurl")) {
                    c = 1;
                    break;
                }
                break;
            case -586683234:
                if (A.equals("audio/x-wav")) {
                    c = 2;
                    break;
                }
                break;
            case -432836268:
                if (A.equals("audio/mpeg-l1")) {
                    c = 3;
                    break;
                }
                break;
            case -432836267:
                if (A.equals("audio/mpeg-l2")) {
                    c = 4;
                    break;
                }
                break;
            case 187090231:
                if (A.equals("audio/mp3")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "audio/flac";
            case 1:
                return "application/x-mpegURL";
            case 2:
                return "audio/wav";
            case 3:
                return "audio/mpeg-L1";
            case 4:
                return "audio/mpeg-L2";
            case 5:
                return "audio/mpeg";
            default:
                return A;
        }
    }
}
